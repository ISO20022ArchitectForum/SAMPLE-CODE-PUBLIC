package com.swift.standards.lab.common.util;

import java.util.LinkedList;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;

/**
 * EMF helper methods.
 */
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
public class EMFHelper {

	/**
	 * Computes a name of this EMF object.
	 * @param obj the object.
	 * @return the name.
	 */
	public static String getName(EObject obj) {
		for(EAttribute att : obj.eClass().getEAllAttributes()) {
			if(att.getName().equals("name") && att.getEType().getName().equals("EString")) {
				return (String) obj.eGet(att);
			}
		}
		for(EAttribute att : obj.eClass().getEAllAttributes()) {
			if(att.getName().equals("tag") && att.getEType().getName().equals("EString")) {
				return (String) obj.eGet(att);
			}
		}
		return "";
	}

	/**
	 * Returns the XMLTag of this EMF object, if found, otherwise returns the name.
	 * @param obj the object.
	 * @return the name.
	 */
	public static String getXMLTag(EObject obj) {
		for(EAttribute att : obj.eClass().getEAllAttributes()) {
			if(att.getName().equals("xmlTag") && att.getEType().getName().equals("EString")) {
				if ("".equals((String) obj.eGet(att))) {
					// XMLTag attribute found but not set so break and return the full non-XMLTag name.
					break;
				} else {
					return (String) obj.eGet(att);
				}
			}
		}
		return getName(obj);
	}

	/**
	 * Computes a name for this object, returning a description of the object in case none is found. 
	 * @param obj the object.
	 * @return the formatted name.
	 */
	public static String getFormattedName(EObject obj) {
		String name = getName(obj);
		if(name == null || name.isEmpty()) {
			return "<unnamed "+EMFHelper.getSimplifiedClassName(obj)+">";
		}
		return name;
	}

	/**
	 * Returns the simplified version of the class name of this object (meaning removing any "MT"/"MX" prefixes  and "Impl" postfixes.
	 * @param obj the object.
	 * @return the simplified class name.
	 */
	public static String getSimplifiedClassName(EObject obj) {
		return getSimplifiedClassName(obj.getClass());
	}

	public static String getSimplifiedClassName(Class<?> cl) {
		String result = cl.getSimpleName();
		if (result.startsWith("MX") || result.startsWith("MT")) {
			result = result.substring(2);
		}
		if (result.endsWith("Impl")) {
			result = result.substring(0, result.length() - 4);
		}
		return result;
	}

	/**
	 * Computes a qualified name of this EMF object, .
	 * @param obj the object.
	 * @return the corresponding qualified name.
	 */
	public static String getQualifiedName(EObject obj) {
		LinkedList<String> names = new LinkedList<String>();
		EObject current = obj;
		while(current != null) {
			String name = getName(current);
			if(name != null && name.length()>0) {
				names.addFirst(name);
			}
			names.addFirst(getSimplifiedClassName(current));
			current = current.eContainer();
		}
		StringBuilder result = new StringBuilder();
		for(String name : names) {
			result.append(name);
			result.append("/");
		}
		if(result.length()>0) {
			result.setLength(result.length()-1);
		}
		return result.toString();
	}

	public static String getType(EObject o) {
		return o.eClass().getName();
	}

}
