package com.swift.standards.lab.common.importer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.xmi.XMLResource;

import com.swift.standards.lab.common.util.EMFHelper;
import com.swift.standards.lab.common.util.FileHelper;
import com.swift.standards.lab.common.util.StringHelper;
import com.swift.standards.lab.common.util.UnZipIt;
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

public abstract class ModelLoader {

	protected static Map<Object, Object> SAVE_OPTIONS = new HashMap<Object, Object>();

	static {
		SAVE_OPTIONS.put(Resource.OPTION_SAVE_ONLY_IF_CHANGED,
				Resource.OPTION_SAVE_ONLY_IF_CHANGED_MEMORY_BUFFER);
		SAVE_OPTIONS.put(XMLResource.OPTION_CONFIGURATION_CACHE, Boolean.TRUE);
		SAVE_OPTIONS.put(XMLResource.OPTION_ENCODING, "UTF-8");
		SAVE_OPTIONS.put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);
		SAVE_OPTIONS.put(XMLResource.OPTION_SCHEMA_LOCATION, Boolean.TRUE);
		SAVE_OPTIONS.put(XMLResource.OPTION_USE_ENCODED_ATTRIBUTE_STYLE,
				Boolean.TRUE);
	}

	private TreeMap<String, HashMap<String, EObject>> allContentsByClassByID = new TreeMap<String, HashMap<String, EObject>>();
	private HashMap<String, EObject>allContents = new  HashMap<String, EObject>();

	private HashSet<String> uniqueItemIDs = new HashSet<String>();
	private HashSet<String> uniqueItemNames = new HashSet<String>();
	private Path repositoryPath;
	protected Path outputDirectory = null;
	private String logHeader = null;
	private String logSuffix;
	private String logExtension = "txt";
	protected PrintWriter reportLog;
	private List<String> logs = new ArrayList<String>();
	protected String modelId;
	protected String modelName;
	protected String modelType;
	private Resource repository = null;
	protected String messageSet;
	protected boolean validate = true;
	protected boolean excludeMessageSet = false;


	public ModelLoader(String repositoryPath) {
		this.repositoryPath = Paths.get(repositoryPath);
	}

	public ModelLoader(String repositoryPath, String outputDirectory) {
		this.repositoryPath = Paths.get(repositoryPath);
		if (outputDirectory != null) {
			this.outputDirectory = Paths.get(outputDirectory);
		}
	}
	
	public ModelLoader(String repositoryPath, String outputDirectory, String messageSet) {
		this.repositoryPath = Paths.get(repositoryPath);
		if (outputDirectory != null) {
			this.outputDirectory = Paths.get(outputDirectory);
		}
		this.messageSet = messageSet;
	}

	public ModelLoader(String repositoryPath, String outputDirectory, String messageSet, boolean excludeMessageSet) {
		this.repositoryPath = Paths.get(repositoryPath);
		if (outputDirectory != null) {
			this.outputDirectory = Paths.get(outputDirectory);
		}
		this.messageSet = messageSet;
		this.excludeMessageSet = excludeMessageSet;
	}

	public String getRepositoryFilename() {
		// Repository filename without extension
		String filename = repositoryPath.getFileName().toString();
		if (Files.isDirectory(repositoryPath)) {
			return filename;
		} else {
			return filename.substring(0, filename.lastIndexOf('.'));
		}
	}

	protected void setLogSuffix(String suffix) {
		this.logSuffix = suffix;
	}

	protected String getLogSuffix() {
		return logSuffix;
	}

	protected void setLogExtension(String extension) {
		this.logExtension = extension;
	}

	protected String getLogExtension() {
		return logExtension;
	}

	protected void run() {
		long before = System.currentTimeMillis();
		init();
		System.out.println(String.format("Loading and parsing %s Repository from %s", 
				modelType.toUpperCase(), 
				getModelPath()));
		if (load()) {
			if (validate) {
				validate();
			}
			process(getRepository());
			long after = System.currentTimeMillis();
			System.out.println(String.format("%s Repository %s loaded from %s"
					+ "\r\nReported %d import exceptions to %s"
					+ "\r\n%s"
					+ "\r\nTotal repository load time %d ms.\r\n", 
					modelType.toUpperCase(), 
					modelName,
					getModelPath(),
					logs.size(),
					getLogPath(),
					dumpContents(),
					(after - before)));
		} else {
			System.err.println("Terminating now...");
		}
		writeLogs();
	}

	protected void init() {
		// Default output location is same directory as the repository being loaded
		if (outputDirectory == null) {
			if (Files.isDirectory(repositoryPath)) {
				outputDirectory = repositoryPath;
			} else{
				outputDirectory = Paths.get(repositoryPath.getParent().toString());
			}
		} else {
			// Check that outputDirectory exists and create if necessary
			File outDir = new File(outputDirectory.toString()); 
			if (!outDir.isDirectory()) {
				outDir.mkdir();
			}
		}
		String filename = repositoryPath.getFileName().toString();
		if (filename.contains(".")) {
			setModelType(filename.substring(filename.lastIndexOf('.') + 1));
		}
		setLogHeader("Problem Class\tDescription\tLocation");
		setLogSuffix("ImportReport");
		setLogExtension("txt");
		// Default the model name to the repository filename without extension
		setModelName(getRepositoryFilename());
		_init();
	}
		
	protected void setModelType(String type) {
		this.modelType = type;
	}
	
	public String getModelType() {
		return modelType;
	}

	protected abstract void _init();

	protected abstract void process(Resource repository);

	protected void add(EObject o) {
		String className = getType(o);
		//
		// Add to map containing items of the same class, sorted by ID
		//
		HashMap<String, EObject> m = allContentsByClassByID.get(className);
		if (m == null) {
			m = new HashMap<String, EObject>();
			allContentsByClassByID.put(className, m);
		}
		String uid = getUID(o); 
		m.put(uid, o);
		allContents.put(uid, o);
	}

	public void save() {
		try {
			getRepository().save(SAVE_OPTIONS);
		} catch (IOException e) {
			String errorText = "Can't save updated repository to " + getModelPath() + " See exceptions report for more information :" + getLogPath();
			System.err.println(errorText);
			addLogLine("JENKINS_ERROR\t" + errorText);
			addLogLine("JENKINS_ERROR\t" + e.toString());
		}
	}
	
	protected String getType(EObject o) {
		return EMFHelper.getSimplifiedClassName(o);
	}

	protected boolean check(EObject o) {
		if (o == null) {
			addLogLine("ERROR", "Check Found null concept!");
			return false;
		}
		if (!uniqueItemIDs.add(getUID(o))) {
			addLogLine("ERROR", "Found more than one object with the same UID [" + getName(o) + " : " + getUID(o) + "]");
		}
		if (!uniqueItemNames.add(getType(o) + ":" + getName(o))) {
			addLogLine("ERROR", "Found more than one [" + getType(o) + "] type with the same name [" + getName(o) + " : " + getUID(o) + "]");
		}
		return _check(o);
	}
	
	protected abstract boolean _check(EObject o);

	protected abstract String getName(EObject o);

	protected abstract String getUID(EObject o);
	
	protected abstract String toString(EObject o);
	
	protected boolean load() {
		ResourceSet rs = new ResourceSetImpl();
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put(modelType, new IntrinsicIDCachingXMLResourceFactoryImpl());
		if ("mx".equals(modelType) && !"ResourceContents.mx".equals(repositoryPath.getFileName())) {
			// Unzip first
			String unzipDir = repositoryPath.getParent().toString() + "/tmp";
			UnZipIt.unZipIt(repositoryPath.toString(), unzipDir);
			repositoryPath = Paths.get(unzipDir + "/ResourceContents.mx");
		}
		setRepository(rs.createResource(URI.createFileURI(repositoryPath.toString())));
		try {
			getRepository().load(null);
		} catch (IOException e) {
			System.err.println(String.format("Can't open and load repository from %s. See %s for more information", getModelPath(), getLogPath()));
			addLogLine("ERROR", e.toString());
			repository = null;
			return false;
		}
		return true;
	}
	
	protected void writeLogs() {
		FileHelper.write(getLogPath(), logs, logHeader);
	}
	
	private String dumpContents() {
		if (allContents.isEmpty()) return "";
		
		String returnValue = "Found the following item totals:\r\n";
		
		for (String i : allContentsByClassByID.keySet()) {
			returnValue += i + " : " + allContentsByClassByID.get(i).size() + "\r\n";
		}
		return returnValue;
	}
	
	public String getModelId() {
		return modelId;
	}

	public void setModelId(String modelId) {
		this.modelId = modelId;
	}

	public String getModeFileName() {
		return repositoryPath.getFileName().toString();
	}

	protected void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getModelName() {
		return modelName;
	}

	public String getModelPath() {
		return repositoryPath.toAbsolutePath().normalize().toString();
	}

	protected void setLogHeader(String s) {
		this.logHeader = s;
	}

	public String getOutputDirectory() {
		return outputDirectory.toString();
	}

	public String getLogPath() {		
		return Paths.get(outputDirectory.toString(), getRepositoryFilename() + "." + logSuffix + "." + logExtension).toAbsolutePath().normalize().toString();
	}

	public String getComplianceReportPath() {		
		return Paths.get(outputDirectory.toString(), getRepositoryFilename() + "." + "ComplianceReport" + "." + logExtension).toAbsolutePath().normalize().toString();
	}

	public HashMap<String, EObject> getAllContents() {
		return allContents;
	}

	public HashMap<String, EObject> getAllObjectsOfType(String type) {
		HashMap<String, EObject> returnValue = allContentsByClassByID.get(type);		 
		if (returnValue == null) {
			System.err.println("Didn't find any objects of type " + type + " in repository " + getModelName());
			returnValue = new HashMap<String, EObject>();
		}
		return returnValue;
	}
	
	public Resource getRepository() {
		return repository;
	}

	public boolean loaded() {
		return repository != null;
	}

	protected void addLogLine(String reportLine) {
		logs.add(reportLine);
	}

	protected void addLogLine(String severity, String report) {
		addLogLine(severity + "\t" + StringHelper.cleanWhitespace(report));
	}

	protected void addLogLine(String severity, String report, String details) {
		addLogLine(severity + "\t" + StringHelper.cleanWhitespace(report) + "\t" + StringHelper.cleanWhitespace(details));
	}

	protected void addLogLine(String severity, String report, EObject o) {
		addLogLine(severity + "\t" + StringHelper.cleanWhitespace(report) + "\t" + StringHelper.cleanWhitespace(toString(o)));
	}

	protected void resetLogs() {
		logs.clear();
	}

	public void setRepository(Resource repository) {
		this.repository = repository;
	}

	public boolean validate() {
		boolean result = true;
		File logFile = new File(getComplianceReportPath());
		PrintWriter log = null;
		try {
			log = new PrintWriter(logFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		for (EObject content : repository.getContents()) {
			result = validate(content, log) && result;
		}
		log.close();
		return result;
	}

	public boolean validate(EObject standardsContent, PrintWriter log) {
		BasicDiagnostic diagnostics = new BasicDiagnostic();
		Diagnostician.INSTANCE.validate(standardsContent, diagnostics);
		for (Diagnostic diagnostic : diagnostics.getChildren()) {
			log.println(toString(diagnostic));
			log.flush();
		}
		log.flush();
		boolean result = diagnostics.getChildren().size() < 1;
//		String reportLine = String.format("%s\tValidated %s with result %s", result ? "JENKINS_INFO" : "JENKINS_ERROR", s(standardsContent), result ? "valid :-)" : "invalid :-( see " + getComplianceReportPath());
//		addReportLine(reportLine);
		return result;
	
	}

	public String toString(Diagnostic diagnostic) {
		StringBuilder result = new StringBuilder();
		switch (diagnostic.getSeverity()) {
		case Diagnostic.OK: {
			result.append("JENKINS_OK");
			break;
		}
		case Diagnostic.INFO: {
			result.append("JENKINS_INFO");
			break;
		}
		case Diagnostic.WARNING: {
			result.append("JENKINS_WARNING");
			break;
		}
		case Diagnostic.ERROR: {
			result.append("JENKINS_ERROR");
			break;
		}
		case Diagnostic.CANCEL: {
			result.append("JENKINS_CANCEL");
			break;
		}
		default: {
			result.append(Integer.toHexString(diagnostic.getSeverity()));
			break;
		}
		}
	
		result.append(" code=");
		result.append(diagnostic.getCode());
	
		result.append(' ');
		result.append(diagnostic.getMessage());
	
		if (diagnostic.getData() != null) {
			result.append(" data = ");
			result.append(s(diagnostic.getData().get(0)));
		}
	
		return result.toString();
	}

	public String s(Object object) {
		if (object instanceof EObject) {
			EObject item = (EObject) object;
			StringBuffer result = new StringBuffer();
//			if (item.eClass().getInstanceClass() != null) {
//				result.append(item.eClass().getInstanceClass().getSimpleName());
//			} else {
//				result.append(item.eClass().getName());
//			}
			appendFeature(result, getType(item));
			appendFeature(result, getName(item));
			appendFeature(result, getUID(item));
			if (item.eContainer() != null) {
				result.append(" in ");
//				if (item.eContainer().eClass().getInstanceClass() != null) {
//					result.append(item.eContainer().eClass().getInstanceClass().getSimpleName());
//				} else {
//					result.append(item.eContainer().eClass().getName());
//				}
				appendFeature(result, getType(item.eContainer()));
				appendFeature(result, getName(item.eContainer()));
			}
			return result.toString();
		} else {
			return object.toString();
		}
	}

	private static void appendFeature(StringBuffer result, String feature) {
		if (feature != null && !feature.isEmpty()) {
			result.append(" ");
			result.append("'");
			result.append(feature);
			result.append("'");
		}
	}


}