package com.swift.standards.lab.generators;

import java.math.BigDecimal;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.jboss.forge.roaster.Roaster;
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
 * This sample code is provided free of charge and liability by SWIFT to demonstrate how to load and process the 
 * public ISO 20022 e-Repository, and to generate artefacts such as Java code from it.
 * 
 * It is shared without warranty expressed or implied for the purpose of starting a conversation with the Corda 
 * open source community about the best way to deploy ISO 20022’s freely-available, globally-agreed repository of 
 * financial transaction standards to the Corda ecosystem.
 * 
 * Neither SWIFT nor the author/s assume any responsibility or liability for any losses that may occur through
 * the mis/use of this code or anything that is derived or generated from it.
 * 
 * This code must not be used in production and if shared must retain this disclaimer.
 *
 */

public class ISO20022CordAppGenerator {

	final String disclaimer = "\r\nThis sample code is provided free of charge and liability by SWIFT to demonstrate how to load and process the "
			+ "\r\npublic ISO 20022 e-Repository, and to generate artefacts such as Java code from it."
			+ "\r\n\r\nIt is shared without warranty expressed or implied for the purpose of starting a conversation with the Corda "
			+ "\r\nopen source community about the best way to deploy ISO 20022’s freely-available, globally-agreed repository of "
			+ "\r\nfinancial transaction standards to the Corda ecosystem."
			+ "\r\n\r\nNeither SWIFT nor the author/s assume any responsibility or liability for any losses that may occur through"
			+ "\r\nthe mis/use of this code or anything that is derived or generated from it."
			+ "\r\n\r\nThis code is a proof of concept and must not be used in production. "
			+ "\r\n\r\nThis code may be shared freely but must retain this disclaimer.";

	final String URIBASE = "org.iso.tc68.iso20022";
	
	final ISO20022SimpleImporter model;
	final List<String> toGenerate;
	final String outputDirectory;
	
	final boolean useXMLSchemaNames;
	
	HashMap<String, FieldHolderSource<?>>allClassesByQualifiedName = new HashMap<String, FieldHolderSource<?>>();
	String packageRoot;
	String summary;
	int countMessages, countBusinessComponents, countMessageComponents, countDataTypes, countCodeSets, countCodes;

	public ISO20022CordAppGenerator(ISO20022SimpleImporter importer) {
		this(importer, false, null, importer.getOutputDirectory() + "/src/");
	}
	
	public ISO20022CordAppGenerator(ISO20022SimpleImporter importer, String outputDirectory) {
		this(importer, false, null, outputDirectory);
	}
	
	public ISO20022CordAppGenerator(ISO20022SimpleImporter importer, List<String> toGenerate, String outputDirectory) {
		this(importer, false, toGenerate, outputDirectory);
	}
	
	public ISO20022CordAppGenerator(ISO20022SimpleImporter importer, boolean useXMLSchemaNames) {
		this(importer, useXMLSchemaNames, null, importer.getOutputDirectory() + "/src/");
	}
	
	public ISO20022CordAppGenerator(ISO20022SimpleImporter importer, boolean useXMLSchemaNames, List<String> toGenerate, String outputDirectory) {
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
		System.out.println(String.format("Generated %d MessageDefinitions with associated %d MessageComponents, %d DataTypes, and %d Codes in %d ms", countMessages, countMessageComponents, (countDataTypes - countBCDataTypes), (countCodeSets - countBCCodeSets), (after - before)));
//		before = System.currentTimeMillis();
//		generateCodeSets(model.getAllObjectsOfType("CodeSet"));
//		after = System.currentTimeMillis();
//		System.out.println(String.format("Generated %d CodeSets with associated %d Codes in %d ms", countCodeSets, countCodes, (after - before)));
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
			if (toGenerate == null || toGenerate.contains(((RepositoryConcept)bc).getName())) {
				if (((RepositoryConcept)bc).getRegistrationStatus() != RegistrationStatus.REGISTERED) continue;
				createConceptualStaticLevelClass((RepositoryConcept)bc);
			} 
		}
	}

	private void generateMessages(HashMap<String, EObject> messageDefinitions) {
		for (EObject md : messageDefinitions.values()) {
			if (toGenerate == null || toGenerate.contains(((RepositoryConcept)md).getName())) {
				if (((RepositoryConcept)md).getRegistrationStatus() != RegistrationStatus.REGISTERED) continue;
				createLogicalLevelClass((RepositoryConcept)md);
			}
		}
	}

	private void generateCodeSets(HashMap<String, EObject> codeSets) {
		for (EObject cs : codeSets.values()) {
			if (toGenerate == null || toGenerate.contains(((RepositoryConcept)cs).getName())) {
				if (((RepositoryConcept)cs).getRegistrationStatus() != RegistrationStatus.REGISTERED) continue;
				createEnumerationClass((CodeSet)cs);
			} 
		}
	}

	private String getQualifiedName(RepositoryConcept rc) {
		return getPackage(rc) + "." + rc.getName();
	}

	private String getPackage(RepositoryConcept rc) {
		if (rc instanceof MessageComponentType) return packageRoot + ".messagecomponents";
		if (rc instanceof BusinessConcept) return packageRoot + ".businesscomponents";
		if (rc instanceof DataType) return packageRoot + ".datatypes" + "." + getDataTypeClassification((DataType)rc);
		if (rc instanceof MessageDefinition) return packageRoot + ".messagedefinitions";
		System.err.println("Wasn't expecting to be asked to getPackage() for this RepositoryType: " + rc);
		return packageRoot + ".FIXME";
	}

	private TreeMap<String, Class<?>> getEncapsulatedData(DataType dt) {
		TreeMap<String, Class<?>> data = new TreeMap<String, Class<?>>();
		if (dt instanceof Duration) {
			data.put("startValue", XMLGregorianCalendar.class);
			data.put("endValue", XMLGregorianCalendar.class);
		} else if (dt instanceof AbstractDateTimeConcept) {
			data.put("value", XMLGregorianCalendar.class);
		} 
		if (dt instanceof iso20022.Boolean) {
			data.put("value", java.lang.Boolean.class);
		} 
		if (dt instanceof iso20022.String) {
			data.put("value", java.lang.String.class);
		} 
		if (dt instanceof Decimal) {
			data.put("value", BigDecimal.class);
		} 
		if (dt instanceof Binary) {
			data.put("value", String.class);
		} 
		if (dt instanceof SchemaType) {
			data.put("value", ((SchemaType)dt).getKind().getClass());
		} 
		if (data.isEmpty()) {
			System.err.println("Wasn't expecting to be asked to getEncapsulatedDataType() for this DataType: " + dt);
		}
		
		return data;
	}
	
	private String getDataTypeClassification(DataType rc) {
		String classification = EMFHelper.getSimplifiedClassName(rc);
		if (classification.contains("Time") || classification.contains("Date") || classification.contains("Year") || classification.contains("Day")) return "DateTime";
		return classification;
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
			String def = "";
			String name = "";
			if (c instanceof Construct) {
				RepositoryType t = ((Construct) c).getMemberType();
				def = ((Construct) c).getDefinition();
				name = ((Construct) c).getName();
				propertyType = t.getName();
				if (t instanceof DataType) {
					if (t instanceof CodeSet) {
						cl.addImport((JavaEnumSource)createDataTypeClass((DataType)t));
					} else {
						cl.addImport((JavaClassSource)createDataTypeClass((DataType)t));
					}
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
			p.getAccessor().getJavaDoc().setFullText("Prototype CordApp State Field representing the ISO 20022 " 
					+ EMFHelper.getSimplifiedClassName(c) + " named \"" + name + "\"."
					+ "\r\n\r\n\tISO 20022 defines this concept as:\r\n\t\"" + def + "\"");
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
			String def = "";
			String name = "";
			RepositoryType t = c.getMemberType();
			def = c.getDefinition();
			name = c.getName();
			propertyType = t.getName();
			if (t instanceof DataType) {
				if (t instanceof CodeSet) {
					cl.addImport((JavaEnumSource)createDataTypeClass((DataType)t));
				} else {
					cl.addImport((JavaClassSource)createDataTypeClass((DataType)t));
				}
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
				p.getAccessor().getJavaDoc().setFullText("Prototype CordApp State Field representing the ISO 20022 " 
						+ EMFHelper.getSimplifiedClassName(c) + " named \"" + name + "\"."
						+ "\r\n\r\n\tISO 20022 defines this concept as:\r\n\t\"" + def + "\"");
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
		if (dt instanceof CodeSet) return createEnumerationClass((CodeSet)dt);
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
				// min/maxInclusive are strange exceptions that take a String, even though they are usually a number...
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
		TreeMap<String, Class<?>> instanceData = getEncapsulatedData(dt);
		for (String name : instanceData.keySet()) {
			Class<?> propertyType = instanceData.get(name);
			PropertySource<JavaClassSource> p = cl.addProperty(propertyType, name);
			// TODO - investigate whether we can add more richness here (e.g. Javadoc etc)			
		}
		constructor.setParameters(constructorParams);				
		constructor.setBody(constructorBody);
		return cl;
	}

	private JavaEnumSource createEnumerationClass(CodeSet cs) {
		final JavaEnumSource javaEnum = Roaster.create(JavaEnumSource.class);
		javaEnum.setName(cs.getName()).setPackage(getPackage(cs));
		javaEnum.getJavaDoc().setFullText("CordApp Enumeration Object representing the ISO 20022 " 
				+ ISO20022Helper.getCodeSetType(cs) + " named \"" + cs.getName() 
				+ "\"\r\n\r\n\tISO 20022 defines this CodeSet as:\r\n\t\"" + cs.getDefinition() + "\""
				+ "\r\n\r\n\tThis code was generated on " + StringHelper.now() + " from the ISO 20022 e-Repository named " + model.getModeFileName() + " available from https://www.iso20022.org/e_dictionary.page"
				+ "\r\n\r\n" + disclaimer + "\r\n\r\n");
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

		javaClass.getJavaDoc().setFullText("CordApp State Object representing the ISO 20022 " 
				+ EMFHelper.getSimplifiedClassName(rc) + " named \"" + rc.getName() 
				+ "\"\r\n\r\n\tISO 20022 defines this concept as:\r\n\t\"" + rc.getDefinition() + "\""
				+ "\r\n\r\n\tThis code was generated on " + StringHelper.now() + " from the ISO 20022 e-Repository named " + model.getModeFileName() + " available from https://www.iso20022.org/e_dictionary.page"
				+ "\r\n\r\n" + disclaimer + "\r\n\r\n");

		if (rc instanceof MessageComponentType) countMessageComponents++;
		else if (rc instanceof BusinessComponent) countBusinessComponents++;
		else if (rc instanceof MessageDefinition) countMessages++;
		else if (rc instanceof DataType) countDataTypes++;
		
		allClassesByQualifiedName.put(getQualifiedName(rc), javaClass);

		return javaClass;
	}

	private TreeMap<String, Construct> getProperties(RepositoryConcept rc) {
		TreeMap<String, Construct> returnValue = new TreeMap<String, Construct>();
		
		for (EObject c : rc.eContents()) {
			if (c instanceof Construct) {
				returnValue.put(((Construct) c).getName(), (Construct) c);
			}
		}
		return returnValue;
	}
	
	private TreeMap<String, Construct> getAllProperties(BusinessComponent bc) {
		TreeMap<String, Construct> returnValue = getProperties(bc);
		
		while (bc.getSuperType() != null) {
			bc = bc.getSuperType();
			returnValue.putAll(getProperties(bc));
		}
		return returnValue;
	}
	
	private void write() {
		System.out.println("Writing class files.");
		for (FieldHolderSource<?> cl : allClassesByQualifiedName.values()) {
			FileHelper.write(outputDirectory, cl);
		}
		summary = "Generated the following CordApp state objects:";
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
