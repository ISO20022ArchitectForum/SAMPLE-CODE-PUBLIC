package com.swift.standards.lab.common.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.List;

import org.jboss.forge.roaster.model.source.FieldHolderSource;
import org.jboss.forge.roaster.model.source.JavaClassSource;
import org.jboss.forge.roaster.model.source.JavaEnumSource;

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
public class FileHelper {

	public static void write(String filename, List<String> reports) {
		write(filename, reports, null, null, "UTF-8");
	}

	public static void write(String filename, List<String> reports, String header) {
		write(filename, reports, header, null, "UTF-8");
	}

	public static void write(String filename, List<String> reports, String header, String trailer) {
		write(filename, reports, header, trailer, "UTF-8");
	}

	public static void write(String filename, List<String> reports, String header, String trailer, String encoding) {

		String contents = "";
		
		if (!reports.isEmpty()){
			if (header != null) {
				contents += header + "\r\n";
			}
			for (String r : reports) {
				contents += r + "\r\n";
			}
			if (trailer != null) {
				contents += trailer;
			}
		}
		
		write(filename, contents, encoding);
	}

	public static void write(String filename, String contents) {
		write(filename, contents, "UTF-8");
	}

	public static void write(String filename, String contents, String encoding) {
		OutputStreamWriter report;
		try {
			// Check that outputDirectory exists and create if necessary
			File outDir = new File(filename).getParentFile(); 
			if (!outDir.isDirectory()) {
				outDir.mkdirs();
			}
			FileOutputStream out = new FileOutputStream(filename);
			report = new OutputStreamWriter(out, encoding);
			report.write(contents);
			report.flush();
			report.close();		
		} catch (Exception e) {
			System.err.println(String.format("Can't create and write report to %s", filename));
			System.err.println(String.format("Details: %s", e.toString()));
		}	
	}

	public static void write(String outputDir, FieldHolderSource<?> cl) {
		String qualifiedName;
		if (cl instanceof JavaClassSource) {
			qualifiedName = ((JavaClassSource)cl).getQualifiedName();
		} else {
			qualifiedName = ((JavaEnumSource)cl).getQualifiedName(); 
		}
		write(outputDir + "/" + qualifiedName.replace(".",  "/") + ".java", cl.toString());		
	}

}
