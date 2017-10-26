package _mains;

import java.io.IOException;

import com.swift.standards.lab.common.iso20022.importer.ISO20022SimpleImporter;

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
public class ISO20022SimpleImporter_Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		long before = System.currentTimeMillis();
		String iso20022RepositoryFile = "eRepository/20170713_ISO20022_2013_eRepository.iso20022";	
		if (args.length > 0) {
			iso20022RepositoryFile = args[0];
		}

		ISO20022SimpleImporter importer = new ISO20022SimpleImporter(iso20022RepositoryFile);
		long after = System.currentTimeMillis();
		System.out.println(String.format("Import of %s repository named %s from file %s took %d ms - exceptions reported to %s", importer.getModelType(), importer.getModelName(), importer.getModelPath(), (after - before), importer.getLogPath()));
	}

}
