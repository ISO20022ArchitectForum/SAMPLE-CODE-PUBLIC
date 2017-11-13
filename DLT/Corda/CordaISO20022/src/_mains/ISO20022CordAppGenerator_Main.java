package _mains;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import com.swift.standards.lab.common.iso20022.importer.ISO20022SimpleImporter;
import com.swift.standards.lab.generators.ISO20022CordAppGenerator;

/**
 * 
 * Main entry class to the ISO 20022 CordApp Java source code generator. 
 * <p>
 * This sample code is contributed free of charge and liability by SWIFT to demonstrate how to load and process the 
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
public class ISO20022CordAppGenerator_Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		long before = System.currentTimeMillis();
		
		/**
		 * useXMLSchemaNames = false : (Default) 
		 *   Generate code that uses the default human-readable ISO 20022 CamelCase Names 
		 *   for Messages, MessageAttributes, and MessageBuildingBlocks
		 * 
		 * useXMLSchemaNames = true : 
		 * 	 Generate code that uses the same shortnames that are found in the ISO 20022 XMLSchemas
		 *   This may be useful if you are developing or enriching legacy software components that 
		 *   were developed based on the published ISO 20022 XMLSchemas (using JAXB, etc)
		 * 
		 * generateBusinessAssociations = false : (Default) 
		 *   When generating BusinessComponents, do not generate associations to other BusinessComponents
		 *   Generate only the data elements (BusinessAttributes) contained within this BusinessComponent
		 *   Useful if only want a minimal model 
		 * 
		 * generateBusinessAssociations = true : 
		 *   When generating BusinessComponents, generate the full set of associations to other BusinessComponents
		 *   Useful if want a complete model.
		 * 
		 */
		boolean useXMLSchemaNames = false;
		boolean generateBusinessAssociations = false;
		String outputDirectory = "src";
		String iso20022RepositoryFile = "eRepository/20170713_ISO20022_2013_eRepository.iso20022";	

		/**
		 * 	Names of all MessageDefinitions and/or Business/MessageComponents that you want to generate. 
		 * 	Note that all dependent Business/MessageComponents and DataTypes will also be generated.
		 *  
		 *  Examples:
		 *  List<String> toGenerate = Arrays.asList("FIToFICustomerCreditTransferV06", "FIToFICustomerCreditTransferV06");
		 *  List<String> toGenerate = Arrays.asList("DateTimePeriod", "Account");
		 *  
		 *  toGenerate = null : (Default) Generate everything!
		 */
//		List<String> toGenerate = null;
		List<String> toGenerate = Arrays.asList("DateTimePeriod", "Account");
		
		if (args.length > 0) {
			iso20022RepositoryFile = args[0];
		}

		ISO20022SimpleImporter importer = new ISO20022SimpleImporter(iso20022RepositoryFile);
		ISO20022CordAppGenerator gen = new ISO20022CordAppGenerator(importer, useXMLSchemaNames, generateBusinessAssociations, toGenerate, outputDirectory);
		
		long after = System.currentTimeMillis();
		System.out.println(String.format("Generation of CordApp classes from eRepository file %s - exceptions reported to %s\r\n%s\r\nTotal generation time %d ms.", importer.getModelPath(), importer.getLogPath(), gen.getSummary(), (after - before)));
	}

}
