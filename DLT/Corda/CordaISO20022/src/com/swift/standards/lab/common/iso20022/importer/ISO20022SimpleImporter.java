package com.swift.standards.lab.common.iso20022.importer;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import com.swift.standards.lab.common.importer.ModelLoader;
import com.swift.standards.lab.common.util.EMFHelper;
import com.swift.standards.lab.common.util.StringHelper;
import com.swift.standards.lab.model.iso20022.util.ISO20022Helper;

import iso20022.Code;
import iso20022.CodeSet;
import iso20022.Iso20022Package;
import iso20022.ModelEntity;
import iso20022.Repository;
import iso20022.RepositoryConcept;
import iso20022.SemanticMarkup;
import iso20022.SemanticMarkupElement;
import iso20022.Xor;
import iso20022.util.Iso20022Switch;
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

public class ISO20022SimpleImporter extends ModelLoader {
	
	static {
		Iso20022Package.eINSTANCE.eContainer();
	}

	private class MySwitch extends Iso20022Switch<Boolean> {

		@Override
		public java.lang.Boolean caseRepository(Repository c) {
			if (c != null) {
				setModelId(c.getObjectIdentifier());
			}

			return super.caseRepository(c);
		}

		@Override
		public java.lang.Boolean defaultCase(EObject o) {
			add(o);

//			addReportLine("INFO", EMFHelper.getQualifiedName(o), o);
			return super.defaultCase(o);
		}

	}

	public ISO20022SimpleImporter(String repositoryPath) {
		super(repositoryPath);
		run();
	}

	public ISO20022SimpleImporter(String repositoryPath, String outputDirectory) {
		super(repositoryPath, outputDirectory);
		run();
	}

	public ISO20022SimpleImporter(String repositoryPath, String outputDirectory, String messageSet) {
		super(repositoryPath, outputDirectory, messageSet);
		run();
	}

	@Override
	protected void _init() {
		//validate = false;
	}

	protected void process(Resource repository) {
		TreeIterator<EObject> iter = repository.getAllContents();
		MySwitch mySwitch = new MySwitch();
		while (iter.hasNext()) {
			EObject o = (EObject) iter.next();
			
			if (check(o)) {
				mySwitch.doSwitch(o);
			}
		}
	}

	@Override
	protected String getUID(EObject o) {
		String returnValue = ISO20022Helper.getObjectIdentifier(o);
		if (returnValue == null) {
			addLogLine("ERROR", "Found strange object without OID", o);
		}
		return returnValue;
	}
	
	@Override
	protected String getName(EObject o) {
		String returnValue = ISO20022Helper.getName(o);
		if (returnValue == null) {
			addLogLine("ERROR", "Found strange object without name", o);
		} else if (returnValue.equals("NOT_SET")) {
			addLogLine("ERROR", "Name not set", o);
		}
		return returnValue;
	}

	@Override
	protected boolean _check(EObject o) {
		// Report anything strange and attempt cleanup, if appropriate.
		// If want to exclude something from the load then return false
		if (o instanceof CodeSet) {
			if (ISO20022Helper.isExternalCodeSet((CodeSet)o) && !getName(o).startsWith("External")) {
				addLogLine("WARNING", "Found CodeSet that has no Trace, Derivation, or Codes but is not named as External - Is this an external CodeList?", o);
			}
			return true;
		}
		if (o instanceof Code && ISO20022Helper.isSourceCode((Code)o)) {
			if (((Code)o).getCodeName() == null) {
				addReportLine("ERROR", "Found Source Code with a null CodeName", (Code)o);
			}
			if (((Code)o).getName() == null) {
				addReportLine("ERROR", "Found Source Code with a null Extended Code Name", (Code)o);
			}
			return true;
		}
		if (o instanceof SemanticMarkup) {
			if (((SemanticMarkup)o).getType() == null) {
				addReportLine("WARNING", "Found strange semantic markup - null type", (SemanticMarkup)o);
			}
			return true;
		}
		if (o instanceof SemanticMarkupElement) {
			if (((SemanticMarkupElement)o).getName() == null) {
				addReportLine("WARNING", "Found strange semantic markup element - null Name", (SemanticMarkupElement)o);
			} else if (((SemanticMarkupElement)o).getValue() == null) {
				addReportLine("WARNING", "Found strange semantic markup element - null Value", (SemanticMarkupElement)o);
			} 
			return true;
		}
		if ((o instanceof RepositoryConcept)) {
			if (((RepositoryConcept)o).getDefinition() == null) {
				if (o instanceof Xor || (o instanceof Code && ISO20022Helper.isDerivedCode((Code)o))) {
					// We can ignore these because:
					// - Xors are strange legacy ISO 20022 V1.0 (2004) artefacts that don't have definitions
					// - Derived Codes inherit their definitions from their source code
				} else {
					addLogLine("WARNING", "Found null definition", o);
				}
			}
			return true;
		}
		return true;
	}

	protected void addReportLine(String severity, String report, RepositoryConcept o) {
		addLogLine(severity + "\t" + StringHelper.cleanWhitespace(report) + "\t" + dump(o));
	}

	protected void addReportLine(String severity, String report, ModelEntity o) {
		addLogLine(severity + "\t" + StringHelper.cleanWhitespace(report) + "\t" + dump(o));
	}

	private String dump(ModelEntity o) {
		String returnValue = "Item: " + EMFHelper.getQualifiedName(o);
		returnValue += " Type: " + EMFHelper.getSimplifiedClassName(o);
		returnValue += " ID: " + o.getObjectIdentifier();
		return StringHelper.cleanWhitespace(returnValue);
	}

	private String dump(RepositoryConcept o) {
		String returnValue = "Item: " + EMFHelper.getQualifiedName(o);
		returnValue += " Type: " + EMFHelper.getSimplifiedClassName(o);
		returnValue += " Name: " + o.getName();
		returnValue += " ID: " + o.getObjectIdentifier();
		returnValue += " Defn: " + o.getDefinition();
		return StringHelper.cleanWhitespace(returnValue);
	}

	@Override
	protected String toString(EObject o) {
		if (o instanceof RepositoryConcept) {
			return ISO20022Helper.toString((RepositoryConcept)o);
		}
		return o.toString();
	}


}
