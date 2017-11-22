package com.swift.standards.lab.common.util;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.lang.model.SourceVersion;

import org.eclipse.emf.ecore.EObject;

import iso20022.RepositoryConcept;

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
public class StringHelper {

	public static String cleanDefinition(String definition) {
		if (definition == null) return "***NULL DEFINITION***";
		return cleanWhitespace(definition);
	}

	public static String rdfCleanDefinition(String definition) {
		if (definition == null) return "***NULL DEFINITION***";
		return rdfCleanWhitespace(definition);
	}

	/** Helper method to make definition strings more Tab-delimited/Excel friendly **/
	public static String cleanWhitespace(String definition) {
		if (definition == null) {
			return "NULL";
		}
//		return definition.replace("\r", "[CR]").replace("\n", "[LF]").replace("\t", "[TAB]").replace(" ", "[SP]").trim();
		return definition.replace("\r", "[CR]").replace("\n", "[LF]").replace("\t", "[TAB]").trim();
	}

	/** Helper method to make definition strings more RDF friendly **/
	public static String rdfCleanWhitespace(String definition) {
		if (definition == null) {
			return "NULL";
		}
		return definition.replaceAll("\r", "[CR]").replaceAll("\n", "[LF]").replaceAll("\t", "[TAB]").replace("\"", "\\\"").trim();
	}
	
	public static String decamel(String name) {
		// De-CamelCase the ISO 20022 Name
		// Hat tip to polygenelubricants @ http://stackoverflow.com/a/2560017
		if (name == null) return null;
		return name.replaceAll(String.format("%s|%s|%s",
				"(?<=[A-Z])(?=[A-Z][a-z])", "(?<=[^A-Z])(?=[A-Z])",
				"(?<=[A-Za-z])(?=[^A-Za-z])"), " ");
	}

	public static String clean(String s) {
		String returnValue = s;
		if (s == null) {
			returnValue = "NOT SET";
		} else {
			returnValue = s.trim();
		}
		return returnValue;
	}

	public static String getPrefLabel(String name) {
		// Returns a trimmed, decamelcased string with any underscores stripped and the first character of the first word uppercased also
		if (name == null) return null;
		// De-CamelCase the ISO 20022 Name
		name = decamel(name);
		// Clean any leading/trailing space
		name = name.trim();
		// Deal with names that don't have first letter uppercase
		name = firstUpper(name);
		// Deal with names that contain underscores (drop them)
		name = name.replace(" _ ", " ");
		// And just in case there are any double-spaces left...
		name = name.replace("  ", " ");

		return name;
	}

	public static String getJavaIdentifierName(EObject rc) {
		
		return getJavaIdentifierName(rc, false);
	}
	
	public static String getJavaIdentifierName(EObject rc, boolean useXMLSchemaNames) {
		
		String identifierName;
		if (useXMLSchemaNames) {
			identifierName = firstLower(EMFHelper.getXMLTag(rc));
		} else {
			identifierName = firstLower(EMFHelper.getName(rc));
		}
		
		return getJavaIdentifierName(identifierName);
	}
	
	public static String getJavaIdentifierName(String name) {		
		if (name == null) return "FIXME_IN_MODEL";
		// Special case because Contract is an important Corda class that will cause a clash 
		if ("contract".equals(name)) return (name + "_");
		if (SourceVersion.isName(name)) return name;
		
		// This should not be necessary, but occasionally, a non-compliant character makes it into the e-Repository
		// We can enrich this method as requried to ensure that every ISO 20022 name is also a valid Java identifier name.
//		System.err.println("Found non-compliant ISO 20022 name : " + EMFHelper.getQualifiedName(rc));
		name = name.replace(".", "");
		if (SourceVersion.isName(name)) return name;
//		System.err.println("If this throws an exception, you may need to enrich StringHelper.getJavaIdentifierName() to better cleanup \"" + EMFHelper.getName(rc) + "\"\r\nP.S. Feel free to send a message to iso20022ra@swift.com explaining that this name causes problems for technical users of the standard also...");
		return name + "_";
	}

	public static String firstUpper(String name) {
		char upperFirst = Character.toUpperCase(name.charAt(0));
		if (name.length() > 1) {
			return upperFirst + name.substring(1);
		} else {
			return Character.toString(upperFirst);
		}
	}

	public static String firstLower(String name) {
		char lowerFirst = Character.toLowerCase(name.charAt(0));
		if (name.length() > 1) {
			return lowerFirst + name.substring(1);
		} else {
			return Character.toString(lowerFirst);
		}
	}

	public static String now() {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date now = new Date();
		return format.format(now);
	}
	
	public static final String disclaimer = "<p><p>This sample code is provided free of charge and liability by SWIFT to demonstrate how to load and process the "
					+ "public ISO 20022 e-Repository, and to generate artefacts such as Java code from it."
					+ "<p>It is shared without warranty expressed or implied for the purpose of starting a conversation with the Corda "
					+ "open source community about the best way to deploy ISO 20022’s freely-available, globally-agreed repository of "
					+ "financial transaction standards to the Corda ecosystem."
					+ "<p>Neither SWIFT nor the author/s assume any responsibility or liability for any losses that may occur through"
					+ "the mis/use of this code or anything that is derived or generated from it."
					+ "<p>This code is a proof of concept and must not be used in production. "
					+ "<p>This code may be shared freely but must retain this disclaimer.<p>";

	
	public static String getClassJavadoc(RepositoryConcept rc, String type, String modelName) {
		return "Prototype CordApp " + type + " Object representing the ISO 20022 " 
				+ EMFHelper.getSimplifiedClassName(rc) + " named \"" + rc.getName() + "\""
				+ "<p>ISO 20022 defines this concept as:\r\n\t\"" + rc.getDefinition() + "\""
				+ "<p><p>This code was generated on " + StringHelper.now() + " from the ISO 20022 e-Repository named " + modelName + " available from https://www.iso20022.org/e_dictionary.page"
				+ disclaimer;
	}

	public static String getFieldJavadoc(RepositoryConcept rc) {
		return "Prototype CordApp State Field representing the ISO 20022 " 
					+ EMFHelper.getSimplifiedClassName(rc) + " named \"" + rc.getName() + "\"."
					+ "<p>ISO 20022 defines this element as:\r\n\t\"" + rc.getDefinition() + "\"";
	}

}
