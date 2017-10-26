package com.swift.standards.lab.model.iso20022.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.xmi.XMLResource;

import com.swift.standards.lab.common.util.EMFHelper;
import com.swift.standards.lab.common.util.StringHelper;
import iso20022.Address;
import iso20022.BroadcastList;
import iso20022.BusinessArea;
import iso20022.BusinessComponent;
import iso20022.BusinessElement;
import iso20022.BusinessProcess;
import iso20022.BusinessProcessCatalogue;
import iso20022.BusinessRole;
import iso20022.BusinessTransaction;
import iso20022.Code;
import iso20022.CodeSet;
import iso20022.Constraint;
import iso20022.Conversation;
import iso20022.DataDictionary;
import iso20022.Doclet;
import iso20022.Encoding;
import iso20022.EndPointCategory;
import iso20022.MessageBuildingBlock;
import iso20022.MessageChoreography;
import iso20022.MessageComponentType;
import iso20022.MessageDefinition;
import iso20022.MessageDefinitionIdentifier;
import iso20022.MessageElement;
import iso20022.MessageInstance;
import iso20022.MessageSet;
import iso20022.MessageTransportMode;
import iso20022.MessageTransportSystem;
import iso20022.MessagingEndpoint;
import iso20022.ModelEntity;
import iso20022.Participant;
import iso20022.Receive;
import iso20022.Repository;
import iso20022.RepositoryConcept;
import iso20022.SemanticMarkup;
import iso20022.SemanticMarkupElement;
import iso20022.Send;
import iso20022.Syntax;
import iso20022.SyntaxMessageScheme;
import iso20022.TransportMessage;
import iso20022.Xor;

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
public class ISO20022Helper {

	public static String getName(EObject e) {
		// Names of Message Elements, Business Elements, Constraints, Codes, etc are only guaranteed unique within the context 
		// of their containing Message Component, Business Component, or CodeSet. Here we force uniqueness by 
		// concatenating the container name with the element/code name - separated by "::" 
		// Returns null if EObject doesn't have a name or name and "NOT_SET" if name is not set.
		if (e instanceof MessageElement || e instanceof BusinessElement || e instanceof MessageBuildingBlock || e instanceof Constraint || e instanceof Xor) {
			return getName(e.eContainer()) + "::" + ((RepositoryConcept)e).getName();
		}
		if (e instanceof MessageDefinition) {
			return ((MessageDefinition)e).getName() + " (" + ((MessageDefinition)e).getMessageDefinitionIdentifier() + ")";   
		}
		if (e instanceof Code) {
			return getName(e.eContainer()) + "::" + ((RepositoryConcept)e).getName() + " [" + ((Code)e).getCodeName() + "]";
		}
		if (e instanceof SemanticMarkup || e instanceof SemanticMarkupElement || e instanceof Doclet || e instanceof DataDictionary || e instanceof Repository || e instanceof BusinessProcessCatalogue) {
			// These things don't have names, so we'll use their OID
			return getObjectIdentifier(e);
		}
		if (e instanceof MessageDefinitionIdentifier) {
			return ((MessageDefinitionIdentifier) e).toString();
		}
		if (e instanceof RepositoryConcept) {
			if (((RepositoryConcept) e).getName() == null || ((RepositoryConcept) e).getName().equals("")) {
				return "NOT_SET"; 
			} else {
				return ((RepositoryConcept) e).getName();
			} 
		}
		return null;
	}
	
	public static String getObjectIdentifier(EObject o) {
		if (o instanceof MessageDefinitionIdentifier) {
			return ((MessageDefinitionIdentifier) o).toString();
		}
		if (o instanceof ModelEntity && o != null) {			
			if (((ModelEntity) o).getObjectIdentifier() == null) {
				// If null on first check, will set it automatically
				setObjectIdentifier(o);
			}
			return ((ModelEntity) o).getObjectIdentifier();
		} 
		if (o instanceof XMLResource && o != null) {
			return ((XMLResource)o.eResource()).getID(o);
		}
		return null;
	}

	private static void setObjectIdentifier(EObject o) {
		if (o instanceof ModelEntity && o != null && ((ModelEntity) o).getObjectIdentifier() == null) {
			((ModelEntity)o).setObjectIdentifier(((XMLResource)o.eResource()).getID(o));
		}
	}
	
	public static boolean isExternalCodeSet(CodeSet c) {
		return (c.getName() != null && (c.getCode() == null || c.getCode().isEmpty()) && c.getName().startsWith("External"));
	}

	public static boolean isAlgorithmicCodeSet(CodeSet c) {
		return (c.getCode() == null || c.getCode().isEmpty()) && c.getConstraint() != null && !c.getConstraint().isEmpty();
	}

	public static boolean isSourceCode(Code r) {
		return isSourceCodeSet(r.getOwner());
	}

	public static boolean isSourceCodeSet(CodeSet c) {
		return c.getTrace() == null;
	}

	public static boolean isDerivedCode(Code r) {
		return isDerivedCodeSet(r.getOwner());
	}

	public static boolean isDerivedCodeSet(CodeSet c) {
		return c.getTrace() != null;
	}

	public static boolean isRole(BusinessComponent bc) {
		if (getName(bc).equals("Role")) return true;
		if (bc.getSuperType() != null) return isRole(bc.getSuperType());
		return false;
	}
	
	public static boolean isDTCCSynonym(SemanticMarkup m) {
		// Semantic Markup is not very formal at the current time
		// DTCC synonyms *should* have type = "Synonym" and *should* have context = "DTCC" or something similar
		// This will be made more formal in due course
		if (!m.getType().equals("Synonym")) return false;
		
		for (SemanticMarkupElement i : m.getElements()) {
			if (i.getName().equals("context") && i.getValue().startsWith("DTCC")) return true;
		}
		return false;
	}

	public static boolean isISO15022Synonym(SemanticMarkup m) {
		// Semantic Markup is not very formal at the current time
		// ISO 15022 synonyms *should* have type = "Synonym" and *should* have context = "ISO15022" or something similar
		// This will be made more formal in due course
		if (!m.getType().equals("Synonym")) return false;
		
		for (SemanticMarkupElement i : m.getElements()) {
			if (i.getName().equals("context") && i.getValue().contains("15022")) return true;
		}
		return false;
	}

	public static boolean isFIXSynonym(SemanticMarkup m) {
		// Semantic Markup is not very formal at the current time
		// FIX synonyms *should* have type = "Synonym" and *should* have context = "FIX" or something similar  
		// This will be made more formal in due course
		if (!m.getType().equals("Synonym")) return false;
		
		for (SemanticMarkupElement i : m.getElements()) {
			if (i.getName().equals("context") && (i.getValue().startsWith("FIX") || i.getValue().startsWith("Fix"))) return true;
		}
		return false;
	}

	public static boolean isASN1Synonym(SemanticMarkup m) {
		// Semantic Markup is not very formal at the current time
		// ASN.1 synonyms *should* have type = "Synonym" and *should* have context = "ASN.1" or something similar  
		// This will be made more formal in due course
		if (!m.getType().equals("Synonym")) return false;
		
		for (SemanticMarkupElement i : m.getElements()) {
			if (i.getName().equals("context") && i.getValue().contains("ASN")) return true;
		}
		return false;
	}

	public static boolean isBusinessConcept(RepositoryConcept c) {
		return isScopeLevel(c) || isConceptualLevel_Dynamic(c) || isConceptualLevel_Static(c) || isConceptualLevel_Transport(c);
	}

	public static boolean isMessageConcept(RepositoryConcept c) {
		return isLogicalLevel_MessageComponents(c) || isLogicalLevel_MessageDefinitions(c);
	}

	public static boolean isScopeLevel(RepositoryConcept c) {
		if (c instanceof BusinessRole || c instanceof BusinessProcess) return true;

		// Business Component Roles will soon be migrated to Scope Level. Let's already treat them as if they are
		if (c instanceof BusinessComponent && isRole((BusinessComponent)c));

		return false;
	}

	public static boolean isConceptualLevel_Transport(RepositoryConcept c) {
		if (c instanceof BroadcastList || c instanceof MessageTransportSystem || c instanceof Address || c instanceof MessagingEndpoint || c instanceof TransportMessage || c instanceof Conversation) return true;

		return false;
	}

	public static boolean isConceptualLevel_Static(RepositoryConcept c) {
		if (c instanceof BusinessElement) return true;
		
		// Business Component Roles will soon be migrated to Scope Level. Let's already treat them as if they are
		if (c instanceof BusinessComponent && !isRole((BusinessComponent)c)) return true;

		return false;
	}

	public static boolean isConceptualLevel_Dynamic(RepositoryConcept c) {
		if (c instanceof Participant || c instanceof BusinessTransaction || c instanceof Receive || c instanceof Send || c instanceof MessageTransportMode) return true;

		return false;
	}

	public static boolean isLogicalLevel_MessageDefinitions(RepositoryConcept c) {
		if (c instanceof MessageDefinitionIdentifier || c instanceof MessageChoreography || c instanceof BusinessArea || c instanceof MessageSet 
				|| c instanceof MessageDefinition || c instanceof Encoding || c instanceof MessageBuildingBlock || c instanceof Syntax ) return true;

		return false;
	}

	public static boolean isLogicalLevel_MessageComponents (RepositoryConcept c) {
		if (c instanceof MessageComponentType || c instanceof MessageElement || c instanceof EndPointCategory || c instanceof Xor) return true;
		return false;
	}

	public static boolean isPhysicalLevel(RepositoryConcept c) {
		if (c instanceof MessageInstance || c instanceof SyntaxMessageScheme) return true;
		return false;
	}

	public static String toString(RepositoryConcept o) {
		return "[Type: " + EMFHelper.getSimplifiedClassName(o) + "] [Name: " + getName(o) + "] [UID: " + getObjectIdentifier(o) + "]";
	}


	public static String dump(ModelEntity o) {
		String returnValue = "Item: " + EMFHelper.getQualifiedName(o);
		returnValue += " Type: " + EMFHelper.getSimplifiedClassName(o);
		returnValue += " ID: " + o.getObjectIdentifier();
		return StringHelper.cleanWhitespace(returnValue);
	}

	public static String dump(RepositoryConcept o) {
		String returnValue = "Item: " + EMFHelper.getQualifiedName(o);
		returnValue += " Type: " + EMFHelper.getSimplifiedClassName(o);
		returnValue += " Name: " + o.getName();
		returnValue += " ID: " + o.getObjectIdentifier();
		returnValue += " Defn: " + o.getDefinition();
		return StringHelper.cleanWhitespace(returnValue);
	}

	public static String getCodeValue(Code c) {
		String returnValue = "FIXME_IN_MODEL";
		if (isSourceCode(c) && c.getCodeName() != null) {
			returnValue = c.getCodeName();
		} else {
			CodeSet sourceCodeSet = c.getOwner().getTrace();
			for (Code sourceCode : sourceCodeSet.getCode()) {
				if (sourceCode.getName().equals(c.getName())) {
					if (sourceCode.getCodeName() != null) {
						returnValue = sourceCode.getCodeName(); 
					}
					break;
				}
			}
		}
		return returnValue;
	}

	public static String getDefinition(Code c) {
		String returnValue = "DEFINITION_NOT_SET";
		if (isSourceCode(c) && c.getDefinition() != null && !"".equals(c.getDefinition())) {
			returnValue = c.getDefinition();
		} else {
			CodeSet sourceCodeSet = c.getOwner().getTrace();
			for (Code sourceCode : sourceCodeSet.getCode()) {
				if (sourceCode.getName().equals(c.getName())) {
					if (sourceCode.getDefinition() != null && !"".equals(sourceCode.getDefinition())) {
						returnValue = sourceCode.getDefinition(); 
					}
					break;
				}
			}
		}
		return returnValue;
	}

	public static String getCodeSetType(CodeSet cs) {
		String returnValue = "";
		if (isDerivedCodeSet(cs)) {
			returnValue += "Derived";
		} else {
			returnValue += "Source";
		}
		if (isAlgorithmicCodeSet(cs)) returnValue = "Algorithmic " + returnValue;
		if (isExternalCodeSet(cs)) returnValue = "External " + returnValue;
		return returnValue + " " + EMFHelper.getSimplifiedClassName(cs);
	}
}
