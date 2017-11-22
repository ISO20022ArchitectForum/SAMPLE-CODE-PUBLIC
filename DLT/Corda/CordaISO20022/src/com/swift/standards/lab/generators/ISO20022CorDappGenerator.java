package com.swift.standards.lab.generators;

import java.math.BigDecimal;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.jboss.forge.roaster.Roaster;
import org.jboss.forge.roaster.model.JavaType;
import org.jboss.forge.roaster.model.source.EnumConstantSource;
import org.jboss.forge.roaster.model.source.FieldHolderSource;
import org.jboss.forge.roaster.model.source.JavaClassSource;
import org.jboss.forge.roaster.model.source.JavaEnumSource;
import org.jboss.forge.roaster.model.source.MethodSource;
import org.jboss.forge.roaster.model.source.PropertySource;
import org.jboss.forge.roaster.model.util.Methods;

import com.swift.standards.lab.common.iso20022.importer.ISO20022SimpleImporter;
import com.swift.standards.lab.common.util.EMFHelper;
import com.swift.standards.lab.common.util.FileHelper;
import com.swift.standards.lab.common.util.StringHelper;
import com.swift.standards.lab.model.iso20022.util.ISO20022Helper;

import iso20022.AbstractDateTimeConcept;
import iso20022.Binary;
import iso20022.BusinessAttribute;
import iso20022.BusinessComponent;
import iso20022.BusinessConcept;
import iso20022.Code;
import iso20022.CodeSet;
import iso20022.Constraint;
import iso20022.Construct;
import iso20022.DataType;
import iso20022.Decimal;
import iso20022.Doclet;
import iso20022.Duration;
import iso20022.MessageComponentType;
import iso20022.MessageDefinition;
import iso20022.MessageDefinitionIdentifier;
import iso20022.RegistrationStatus;
import iso20022.RepositoryConcept;
import iso20022.RepositoryType;
import iso20022.SchemaType;
import iso20022.SemanticMarkup;
import iso20022.SemanticMarkupElement;
import iso20022.Xor;
import net.corda.core.contracts.ContractState;

/**
 * 
 * Principal worker class that does the heavy lifting to generate Java CorDapp objects from the ISO 20022 e-Repository. 
 * <p>
 * This sample code is provided free of charge and liability by SWIFT to demonstrate how to load and process the 
 * public ISO 20022 e-Repository, and to generate artefacts such as Java code from it.
 * <p>
 * It is shared without warranty expressed or implied for the purpose of starting a conversation with the Corda 
 * open source community about the best way to deploy ISO 20022’s freely-available, globally-agreed repository of 
 * financial transaction standards to the Corda ecosystem.
 * <p>
 * Neither SWIFT nor the author/s assume any responsibility or liability for any losses that may occur through
 * the mis/use of this code or anything that is derived or generated from it.
 * <p>
 * This code must not be used in production and if shared must retain this disclaimer.
 *
 */

public class ISO20022CorDappGenerator {

	final String URIBASE = "org.iso.tc68.iso20022";
	
	// Complex DataTypes are sometimes currently modelled as BusinessComponents. BusinessComponent 
	// Associations are required by ISO 20022 metamodel to be bi-directionally modeled. Generating 
	// these complex DataTypes fully results in too many unnecessary interconnections between generated 
	// classes. This list allows us to identify these "BusinessComponent DataTypes" and items in this 
	// list will only have their BusinessAttributes generated - BusinessAssociations will not be traversed.
	//
	final List<String> complexDataTypes = Arrays.asList(
			"AmountAndPeriod", "AmountAndPrice", "AmountAndQuantity", "AmountRange", "AmountRangeBoundary", "AmountRatio", 
			"AustralianBSBIdentification", "CashClearingSystemMember", "Country", "DateTimePeriod", "GenericIdentification", 
			"InformationQualifier", "PercentageAndPeriod", "PrePaymentSpeed", "ProductQuantity", "QuantityRatio", "RateAndAmount",
			"RoundingParameters", "Scheme", "SystemAvailability", "SystemClosureInformation", "SystemEventInformation", 
			"TimeFrame", "TimePeriod", "Tolerance", "UTCOffset"
			);
	boolean mandatoryAttributesOnly = true;
	
	final ISO20022SimpleImporter model;
	final List<String> toGenerate;
	final String outputDirectory;
	
	final boolean useXMLSchemaNames;
	
	/**
	 * Because ISO 20022 Components and DataTypes are re-used, we use this HashMap to keep track of our classes as we create 
	 * them. Avoids overhead of creating duplicates and allows them to be easily found on demand by fully qualified class name.
	 */
	HashMap<String, FieldHolderSource<?>>allClassesByQualifiedName = new HashMap<String, FieldHolderSource<?>>();
	String packageRoot;
	String summary;
	int countMessages, countBusinessComponents, countMessageComponents, countDataTypes, countCodeSets, countCodes;

	public ISO20022CorDappGenerator(ISO20022SimpleImporter importer) {
		this(importer, false, null, importer.getOutputDirectory() + "/src/");
	}
	
	public ISO20022CorDappGenerator(ISO20022SimpleImporter importer, String outputDirectory) {
		this(importer, false, null, outputDirectory);
	}
	
	public ISO20022CorDappGenerator(ISO20022SimpleImporter importer, List<String> toGenerate, String outputDirectory) {
		this(importer, false, toGenerate, outputDirectory);
	}
	
	public ISO20022CorDappGenerator(ISO20022SimpleImporter importer, boolean useXMLSchemaNames) {
		this(importer, useXMLSchemaNames, null, importer.getOutputDirectory() + "/src/");
	}
	
	/**
	 * 
	 * @param importer A ModelLoader that contains an EMF Model loaded from the ISO 20022 e-Repository
	 * @param useXMLSchemaNames Generate code with ISO 20022 XML Schema-compliant Shortnames (based off the xmlTag attribute) 
	 * 							or using the full ISO 20022 CamelCaseNames
	 * 		useXMLSchemaNames = false : (Default) 
	 *   		Generate code that uses the default human-readable ISO 20022 CamelCase Names 
	 *   		for Messages, MessageAttributes, and MessageBuildingBlocks
	 * 
	 * 		useXMLSchemaNames = true : 
	 * 	 		Generate code that uses the same shortnames that are found in the ISO 20022 XMLSchemas
	 *   		This may be useful if you are developing or enriching legacy software components that 
	 *   		were developed based on the published ISO 20022 XMLSchemas (using JAXB, etc)
	 *   
	 * @param toGenerate Names of all MessageDefinitions and/or Business/MessageComponents that you want to generate. 
	 *  
	 *  Examples:
	 *  List<String> toGenerate = Arrays.asList("FIToFICustomerCreditTransferV06", "FIToFICustomerCreditTransferV06");
	 *  List<String> toGenerate = Arrays.asList("DateTimePeriod", "Account");
	 *  
	 *  Notes:
	 * 		All dependent Business/MessageComponents and DataTypes will also be generated.
	 *  	toGenerate = null : (Default) Generate everything!
	 *  
	 * @param outputDirectory Where to write the generated classes (Default: an src subdirectory under the e-Repository path) 
	 * 
	 */
	public ISO20022CorDappGenerator(ISO20022SimpleImporter importer, boolean useXMLSchemaNames, List<String> toGenerate, String outputDirectory) {
		this.model = importer;
		this.useXMLSchemaNames = useXMLSchemaNames;
		this.toGenerate = toGenerate;
		if (!outputDirectory.endsWith("/")) outputDirectory += "/";
		this.outputDirectory = outputDirectory;
		run();
	}
	
	private void run() {
		init();
		long before = System.currentTimeMillis();
		generateBusinessComponents(model.getAllObjectsOfType("BusinessComponent"));
		long after = System.currentTimeMillis();
		int countBCDataTypes = countDataTypes;
		int countBCCodeSets = countCodeSets;
		System.out.println(String.format("Generated %d BusinessComponents, %d DataTypes, and %d CodeSets in %d ms", countBusinessComponents, countBCDataTypes, countBCCodeSets, (after - before)));
		before = System.currentTimeMillis();
		generateMessages(model.getAllObjectsOfType("MessageDefinition"));
		after = System.currentTimeMillis();
		int countMCDataTypes = (countDataTypes - countBCDataTypes);
		System.out.println(String.format("Generated %d MessageDefinitions with associated %d MessageComponents, %d DataTypes, and %d CodeSets in %d ms", countMessages, countMessageComponents, countMCDataTypes, (countCodeSets - countBCCodeSets), (after - before)));
		before = System.currentTimeMillis();
		generateCodeSets(model.getAllObjectsOfType("CodeSet"));
		after = System.currentTimeMillis();
		System.out.println(String.format("Generated total of %d CodeSets with associated %d Codes in %d ms", countCodeSets, countCodes, (after - before)));
		before = System.currentTimeMillis();
		write();
		after = System.currentTimeMillis();
		System.out.println(String.format("Wrote %d files in %d ms", countBusinessComponents + countMessageComponents + countMessages + countDataTypes, (after - before)));
	}
	
	private void init() {
		packageRoot = URIBASE + "._" + model.getModelName().toLowerCase();
		countMessages = 0;
		countBusinessComponents = 0;
		countMessageComponents = 0;
		countDataTypes = 0;
		countCodeSets = 0;
		countCodes = 0;
	}

	private void generateBusinessComponents(HashMap<String, EObject> businessComponents) {
		for (EObject bc : businessComponents.values()) {
			if (shouldGenerate(bc)) {
				createConceptualStaticLevelClass((RepositoryConcept)bc);
			}
		}
	}

	private void generateMessages(HashMap<String, EObject> messageDefinitions) {
		for (EObject md : messageDefinitions.values()) {
			if (shouldGenerate(md)) {
				createLogicalLevelClass((RepositoryConcept)md);
			}
		}
	}

	private void generateCodeSets(HashMap<String, EObject> codeSets) {
		for (EObject cs : codeSets.values()) {
			if (shouldGenerate(cs)) {
				createEnumerationClass((CodeSet)cs);
			}
		}
	}

	private boolean shouldGenerate(EObject c) {
		// If Generate All, then generate all Registered concepts, 
		if (toGenerate == null) return ((RepositoryConcept)c).getRegistrationStatus() == RegistrationStatus.REGISTERED;

		// Otherwise generate anything that is explicitly requested, regardless of registration status
		return toGenerate.contains(((RepositoryConcept)c).getName());
	}

	private String getQualifiedName(RepositoryConcept rc) {
		return getPackage(rc) + "." + rc.getName();
	}

	private String getPackage(RepositoryConcept rc) {
		if (rc instanceof MessageComponentType) return packageRoot + ".messagecomponents";
		if (rc instanceof BusinessConcept) return packageRoot + ".businesscomponents";
		if (rc instanceof DataType) return packageRoot + ".datatypes" + "." + getDataTypeClassification((DataType)rc);
		if (rc instanceof MessageDefinition) return packageRoot + ".messagedefinitions";
		System.err.println("I wasn't expecting to be asked to getPackage() for a " + rc + " RepositoryType! The generator currently only supports MessageDefinitions, BusinessComponents, MessageComponents, and DataTypes.");
		return packageRoot + ".FIXME";
	}

	private JavaClassSource createClass(RepositoryConcept rc) {
		final JavaClassSource javaClass = Roaster.create(JavaClassSource.class);
		String className = rc.getName();
		if ("Contract".equals(className)) {
			// TODO: This is a hack for the special case of "Contract" which is needed to avoid clash between
			// net.corda.core.contracts.Contract and org.iso.tc68.iso20022._20170713_iso20022_2013_erepository.businesscomponents.Contract 
			// There is probably a more elegant way to explicitly reference one of these classes instead of importing both, but haven't yet found it in Roaster
			className += "_";
		}
		javaClass.setName(className).setPackage(getPackage(rc));
	
		javaClass.getJavaDoc().setFullText(StringHelper.getClassJavadoc(rc, "State", model.getModeFileName()));
	
		if (rc instanceof MessageComponentType) countMessageComponents++;
		else if (rc instanceof BusinessComponent) countBusinessComponents++;
		else if (rc instanceof MessageDefinition) countMessages++;
		else if (rc instanceof DataType) countDataTypes++;
		
		// Add each newly created class to this HashMap so we can find it quickly by qualified name later
		// Mainly to avoid the overhead of creating duplicates.
		allClassesByQualifiedName.put(getQualifiedName(rc), javaClass);
	
		return javaClass;
	}

	private JavaClassSource createLogicalLevelClass(RepositoryConcept rc) {
		if (allClassesByQualifiedName.get(getQualifiedName(rc)) != null) return (JavaClassSource)allClassesByQualifiedName.get(getQualifiedName(rc));
		
		JavaClassSource cl = createClass(rc);	
		MethodSource<JavaClassSource>  constructor = cl.addMethod().setPublic().setConstructor(true);
		
		cl.addInterface(ContractState.class);
		for (MethodSource<?> m : Methods.implementAbstractMethods(ContractState.class, cl)) {
			m.getJavaDoc().setFullText("TODO: Don't forget to implement this abstract method from ContractState");
		}
		String constructorParams = "";
		String constructorBody = "";
		boolean first = true;
		for (EObject c : rc.eContents()) {
			String propertyType = "FIXME";
			if (c instanceof Construct) {
				RepositoryType t = ((Construct) c).getMemberType();
				propertyType = t.getName();
				if (t instanceof DataType) {
					cl.addImport((JavaType<?>)createDataTypeClass((DataType)t));
//					if (t instanceof CodeSet) {
//						cl.addImport((JavaEnumSource)createDataTypeClass((DataType)t));
//					} else {
//						cl.addImport((JavaClassSource)createDataTypeClass((DataType)t));
//					}
				} else {
					cl.addImport(createLogicalLevelClass(t));
				}
			} else if (c instanceof SemanticMarkup || c instanceof Constraint || c instanceof MessageDefinitionIdentifier || c instanceof Doclet || c instanceof Xor || c instanceof SemanticMarkupElement) {
				// Nothing to do here for the moment - maybe we can be more clever and enrich some of these later
				continue;
			} else {
				System.err.println("I shouldn't be here with this kind of contents, should I? " + c);
				continue;
			}
			String propertyName = StringHelper.getJavaIdentifierName(c, useXMLSchemaNames);
			PropertySource<JavaClassSource> p = cl.addProperty(propertyType, propertyName);
			p.getAccessor().getJavaDoc().setFullText(StringHelper.getFieldJavadoc((RepositoryConcept)c));
			if (!first) {
				constructorParams += ", ";
				constructorBody += "\r\n";
			}
			
			constructorParams += propertyType + " " + propertyName;
			constructorBody += "this." + propertyName + " = " + propertyName + ";";
			first = false;
			// TODO - investigate whether we can add more richness here (e.g. Javadoc etc)
		}
		constructor.setParameters(constructorParams);
		constructor.setBody(constructorBody);
		return cl;
	}

	private JavaClassSource createConceptualStaticLevelClass(RepositoryConcept rc) {
		if (allClassesByQualifiedName.get(getQualifiedName(rc)) != null) return (JavaClassSource)allClassesByQualifiedName.get(getQualifiedName(rc));
		
		BusinessComponent bc = (BusinessComponent)rc;
		JavaClassSource cl = createClass(bc);	
		if (bc.getSuperType() != null) {
			cl.setSuperType(createConceptualStaticLevelClass(bc.getSuperType()));
		}
		MethodSource<JavaClassSource>  constructor = cl.addMethod().setPublic().setConstructor(true);
		
		cl.addInterface(ContractState.class);
		for (MethodSource<?> m : Methods.implementAbstractMethods(ContractState.class, cl)) {
			m.getJavaDoc().setFullText("TODO: Don't forget to implement this abstract method from ContractState");
		}
		String constructorParams = "";
		String superParams = "";
		String constructorBody = "";
		boolean firstParam = true;
		boolean firstSuperParam = true;
		boolean firstBody = true;
		TreeMap<String, Construct> allProperties = getAllProperties(bc);
		TreeMap<String, Construct> myProperties = getProperties(bc);
		for (Construct c : allProperties.values()) {
			String propertyType = "FIXME";
			RepositoryType t = c.getMemberType();
			propertyType = t.getName();
//			if ("DateTimePeriod".equals(t.getName())) {
//				System.err.println(t.getName() + "::" +  t.getName());
//			}
			if (t instanceof DataType) {
				cl.addImport((JavaType<?>)createDataTypeClass((DataType)t));
//				if (t instanceof CodeSet) {
//					cl.addImport((JavaEnumSource)createDataTypeClass((DataType)t));
//				} else {
//					cl.addImport((JavaClassSource)createDataTypeClass((DataType)t));
//				}
			} else {
				cl.addImport(createConceptualStaticLevelClass(t));
			}
			
			String propertyName = StringHelper.getJavaIdentifierName(c, false);

			if (!firstParam) {
				constructorParams += ", ";
			}			
			constructorParams += propertyType + " " + propertyName;
			
			if (myProperties.containsKey(c.getName())) {
				if (!firstBody) {
					constructorBody += "\r\n";
				}
				constructorBody += "this." + propertyName + " = " + propertyName + ";";
				firstBody = false;
				PropertySource<JavaClassSource> p = cl.addProperty(propertyType, propertyName);
				p.getAccessor().getJavaDoc().setFullText(StringHelper.getFieldJavadoc((RepositoryConcept)c));
			} else {
				if (!firstSuperParam) {
					superParams += ", ";
				}
				superParams += propertyName;
				firstSuperParam = false;
			}
			firstParam = false;
			// TODO - investigate whether we can add more richness here (e.g. Javadoc etc)
		}

		if (!"".equals(superParams)) {
			constructorBody = "super( " + superParams + " );\r\n" + constructorBody;
		}
		constructor.setParameters(constructorParams);
		constructor.setBody(constructorBody);
		return cl;
	}

	private FieldHolderSource<?> createDataTypeClass(DataType dt) {
		// TODO Finish thinking about what we're doing with DataTypes - Especially CodeSet Enumerations...
		if (allClassesByQualifiedName.get(getQualifiedName(dt)) != null) return allClassesByQualifiedName.get(getQualifiedName(dt));
		// ExternalCodeSets and Algorithmic CodeSets don't contain Codes, so they are modelled as restricted strings, not enumerations.
		if ((dt instanceof CodeSet) && !(ISO20022Helper.isExternalCodeSet((CodeSet)dt) || ISO20022Helper.isAlgorithmicCodeSet((CodeSet)dt))) {
			return createEnumerationClass((CodeSet)dt);
		}
		JavaClassSource cl = createClass(dt);	
		MethodSource<JavaClassSource>  constructor = cl.addMethod().setPublic().setConstructor(true);

		cl.setSuperType(dt.getClass());
		String constructorParams = "";
		String constructorBody = "";
		boolean first = true;
		for (EAttribute c : dt.eClass().getEAllAttributes()) {
			if ("objectIdentifier".equals(c.getName()) || "name".equals(c.getName()) || "definition".equals(c.getName()) || "example".equals(c.getName()) || "registrationStatus".equals(c.getName()) || "removalDate".equals(c.getName())) continue;
			Object value = dt.eGet(c);
			
			// Only create fields for the datatype properties that are populated.
			if (value == null) continue;
			EDataType t = c.getEAttributeType();
			Class<?> paramType = t.getInstanceClass(); 			
			String paramName = StringHelper.firstLower(c.getName());
			if (!first) {
				constructorParams += ", ";
				constructorBody += "\r\n";
			}
			constructorParams += paramType.getSimpleName() + " " + paramName;
			if ("minInclusive".equals(c.getName()) || "maxInclusive".equals(c.getName())) {
				// min/maxInclusive take a String (to allow for "*", I think), even though they are usually a number...
				constructorBody += "set" + StringHelper.firstUpper(c.getName()) + "( \"" + value.toString() + "\" );";
			} else if ("baseValue".equals(c.getName())) {
				// baseValue on Rates is another strange one that takes a Double...
				Double v = Double.parseDouble(value.toString());
				constructorBody += "set" + StringHelper.firstUpper(c.getName()) + "( " + v + " );";
			} else if ("kind".equals(c.getName())) {
				// schemaTypeKinds are also weird...
				constructorBody += "set" + StringHelper.firstUpper(c.getName()) + "( " + paramName + " );";
			}
			else try {
				int v = Integer.parseInt(value.toString());
				constructorBody += "set" + StringHelper.firstUpper(c.getName()) + "( " + v + " );";
			} catch (NumberFormatException e) {
				// TODO - Test this rigorously - I think we might need to be a bit more clever here to preserve some of the more complex patterns...
				constructorBody += "set" + StringHelper.firstUpper(c.getName()) + "( \"" + value.toString().replace("\\", "\\\\").replace("\"", "\\\"").replace("'", "\\'") + "\" );";
			}
			cl.addImport(paramType);
			first = false;
			// TODO - investigate whether we can add more richness here (e.g. Javadoc etc)
		}
		PropertySource<JavaClassSource> p = cl.addProperty(getEncapsulatedData(dt), "value");
		// TODO - investigate whether we can add more richness here (e.g. Javadoc etc)			
		constructor.setParameters(constructorParams);				
		constructor.setBody(constructorBody);
		return cl;
	}

	private JavaEnumSource createEnumerationClass(CodeSet cs) {
		final JavaEnumSource javaEnum = Roaster.create(JavaEnumSource.class);
		javaEnum.setName(cs.getName()).setPackage(getPackage(cs));
		javaEnum.getJavaDoc().setFullText(StringHelper.getClassJavadoc(cs, "Enumeration", model.getModeFileName()));
		for (Code c : cs.getCode()) {
			String code = ISO20022Helper.getCodeValue(c);
			if (!Character.isLetter(code.charAt(0))) {
				// TODO - Think about what to do about a couple of weird exceptions
				// like UN/ECE Recommendation 20 UnitOfMeasureCode "1A" and non-compliant codes like "401K"
				code = "_" + code;
 			}
			EnumConstantSource enumConst = javaEnum.addEnumConstant().setName(code);
			enumConst.getJavaDoc().setFullText("Enumeration representing ISO 20022 Code named \"" + c.getName() + "\" - defined as \"" + ISO20022Helper.getDefinition(c) + "\"");
			countCodes++;
		}
		countCodeSets++;
		allClassesByQualifiedName.put(getQualifiedName(cs), javaEnum);
		return javaEnum;
	}
	
	/**
	 * 
	 * @param rc An ISO 20022 Repository Concept (e.g. BusinessComponent, MessageDefinition, or MessageComponent) 
	 * that contains properties (e.g. BusinessElements or MessageElements
	 *  
	 * @return an ordered map of these elements that will become class parameters
	 * 
	 */
	private TreeMap<String, Construct> getProperties(RepositoryConcept rc) {
		TreeMap<String, Construct> returnValue = new TreeMap<String, Construct>();
		boolean businessAttributesOnly = rc instanceof BusinessComponent && complexDataTypes.contains(rc.getName());
		for (EObject c : rc.eContents()) {
			if (c instanceof Construct) {
				if (mandatoryAttributesOnly && isOptional((Construct)c)) continue;
				if (businessAttributesOnly) {
					if (c instanceof BusinessAttribute) {
						returnValue.put(((Construct) c).getName(), (Construct) c);
					}
				} else {
					returnValue.put(((Construct) c).getName(), (Construct) c);
				}
			}
		}
		return returnValue;
	}
	
	private boolean isOptional(Construct c) { 
		return c.getMinOccurs() == 0;
	}

	/**
	 * 
	 * @param bc An ISO 20022 BusinessComponent
	 * 
	 * @return an ordered map of all BusinessElements for this BusinessComponent and all its supertypes
	 * Note that order is important to ensure that parameters are consistent in the call to super()
	 * 
	 */
	private TreeMap<String, Construct> getAllProperties(BusinessComponent bc) {
		TreeMap<String, Construct> returnValue = getProperties(bc);
		
		while (bc.getSuperType() != null) {
			bc = bc.getSuperType();
			returnValue.putAll(getProperties(bc));
		}
		return returnValue;
	}
	
	/**
	 * 
	 * Becuase ISO 20022 DataTypes are defined logically, independently of any particular implementation technology
	 * we must explicitly tell the generator what Java type is actually represented by each ISO 20022 type.
	 * 
	 * @param dt The ISO 20022 DataType that we're generating
	 * @return an ordered list of names and classes that tell us what Java type/s this DataType encapsulates
	 */
	private Class<?> getEncapsulatedData(DataType dt) {
		if (dt instanceof Duration) {
			return java.lang.String.class;
		}
		if (dt instanceof AbstractDateTimeConcept) {
			return XMLGregorianCalendar.class;
		} 
		if (dt instanceof iso20022.Boolean) {
			return java.lang.Boolean.class;
		} 
		if (dt instanceof iso20022.String) {
			return java.lang.String.class;
		} 
		if (dt instanceof Decimal) {
			return BigDecimal.class;
		} 
		if (dt instanceof Binary) {
			return java.lang.String.class;
		} 
		if (dt instanceof SchemaType) {
			return ((SchemaType)dt).getKind().getClass();
		} 
		System.err.println("Wasn't expecting to be asked to getEncapsulatedDataType() for this DataType: " + dt);
		return java.lang.Object.class;
	}

	private String getDataTypeClassification(DataType rc) {
		String classification = EMFHelper.getSimplifiedClassName(rc);
		if (classification.contains("Time") || classification.contains("Date") || classification.contains("Year") || classification.contains("Day")) return "DateTime";
		return classification;
	}

	private void write() {
		System.out.println("Writing class files.");
		for (FieldHolderSource<?> cl : allClassesByQualifiedName.values()) {
			FileHelper.write(outputDirectory, cl);
		}
		summary = "Generated the following CorDapp state objects:";
		summary += "\r\n" + countBusinessComponents + " BusinessComponent State Objects.";
		summary += "\r\n" + countMessages + " MessageDefinition State Objects.";
		summary += "\r\n" + countMessageComponents + " MessageComponentType State Objects.";
		summary += "\r\n" + countDataTypes + " DataTypes.";
		summary += "\r\n" + countCodeSets + " CodeSets.";
		summary += "\r\n" + countCodes + " Codes.";
		summary += "\r\nGenerated code can be found in " + Paths.get(outputDirectory).toAbsolutePath();
	}

	public String getSummary() {
		return summary;
	}

}
