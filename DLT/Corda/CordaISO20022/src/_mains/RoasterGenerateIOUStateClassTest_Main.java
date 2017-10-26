package _mains;

import java.io.IOException;
import java.util.List;

import org.jboss.forge.roaster.Roaster;
import org.jboss.forge.roaster.model.source.JavaClassSource;
import org.jboss.forge.roaster.model.source.MethodSource;

import com.google.common.collect.ImmutableList;
import com.swift.standards.lab.common.util.FileHelper;

import net.corda.core.contracts.ContractState;
import net.corda.core.identity.AbstractParty;
import net.corda.core.identity.Party;

public class RoasterGenerateIOUStateClassTest_Main {
	
	String outputFilename;

	public RoasterGenerateIOUStateClassTest_Main(String fileName) {
		this.outputFilename = fileName;
		run();
	}
	
	private void run() {
		String contents = generate();
		FileHelper.write(outputFilename, contents);
	}
	
	private String generate() {
		final JavaClassSource javaClass = Roaster.create(JavaClassSource.class);
		javaClass.setPackage("net.corda.docs.java.tutorial.helloworld").setName("IOUState");

		javaClass.addInterface(ContractState.class);

		javaClass.addProperty(int.class, "value").setMutable(false);
		javaClass.addProperty(Party.class, "lender").setMutable(false);
		javaClass.addProperty(Party.class, "borrower").setMutable(false);

		MethodSource<JavaClassSource> constructor = javaClass.addMethod()
		  .setConstructor(true)
		  .setPublic()
		  .setBody("this.value = value; this.lender = lender; this.borrower = borrower;");
		constructor.addParameter(int.class, "value");
		constructor.addParameter(Party.class, "lender");
		constructor.addParameter(Party.class, "borrower");	

		MethodSource<JavaClassSource> method = javaClass.addMethod().setPublic().setName("getParticipants").setReturnType("List<AbstractParty>");
		method.addAnnotation(Override.class);
		method.setBody("return ImmutableList.of(lender, borrower);");

		javaClass.addImport(List.class);
		javaClass.addImport(ImmutableList.class);
		javaClass.addImport(AbstractParty.class);

		method = javaClass.addMethod().setPublic().setName("getContract").setReturnType("IOUContract");
		method.addAnnotation(Override.class);
		method.setBody("return new IOUContract();");

		return javaClass.toString();
	}

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		String generatedJavaClassfile = "generated/IOUState.java";
		long before = System.currentTimeMillis();
		
		RoasterGenerateIOUStateClassTest_Main generator = new RoasterGenerateIOUStateClassTest_Main(generatedJavaClassfile);

		long after = System.currentTimeMillis();
		System.out.println(String.format("Creation of Roaster Java class took %d ms - Output in %s", (after - before), generatedJavaClassfile));
	}

}
