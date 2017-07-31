package test.utils;

import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.serializer.impl.Serializer;
import org.eclipse.gemoc.gexpressions.GExpression;
import org.eclipse.gemoc.gexpressions.GProgram;
import org.eclipse.gemoc.gexpressions.GexpressionsPackage;
import org.eclipse.gemoc.gexpressions.xtext.GExpressionsStandaloneSetup;

import com.google.inject.Injector;

public class TestXtextSerializer2 {

	public static void main(String[] args) {
		loadGexpressionTestFile();
		// loadGelTestFile();
	}

	public static void loadGexpressionTestFile() {
		// Getting the serializer
		GExpressionsStandaloneSetup setup = new GExpressionsStandaloneSetup();
		Injector injector = setup.createInjectorAndDoEMFRegistration();
		GexpressionsPackage.eINSTANCE.eClass();
		Serializer serializer = injector.getInstance(Serializer.class);

		// Load the model
		URI modelURI = URI
				.createFileURI("/home/flatombe/thesis/gemoc/git/gemoc-dev/org/gemoc/GEL/org.eclipse.gemoc.gel.gexpressions.test/model/test.gexpressions");
		XtextResourceSet resSet = injector.getInstance(XtextResourceSet.class);
		resSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		Resource resource = resSet.getResource(modelURI, true);
		GProgram program = (GProgram) resource.getContents().get(0);

		List<GExpression> exps = program.getExpressions();
		for (GExpression exp : exps) {
			// Serializing
			String s = serializer.serialize(exp);
			System.out.println(s);
		}
	}

	// public static void loadGelTestFile() {
	// GELStandaloneSetup setup = new GELStandaloneSetup();
	// Injector injector = setup.createInjectorAndDoEMFRegistration();
	// GelPackage.eINSTANCE.eClass();
	//
	// Serializer serializer = injector.getInstance(Serializer.class);
	//
	// URI uri = URI
	// .createFileURI("/home/flatombe/thesis/gemoc/git/gemoc-dev/org/gemoc/sample_deployed/TFSM/language_workbench/org.eclipse.gemoc.sample.tfsm.dse/gel/domainSpecificEvents.GEL");
	// XtextResourceSet resSet = injector.getInstance(XtextResourceSet.class);
	// resSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
	// Resource gelResource = resSet.getResource(uri, true);
	// DomainSpecificEventsSpecification gelSpec =
	// (DomainSpecificEventsSpecification) gelResource
	// .getContents().get(0);
	// List<GExpression> gexps = EcoreUtil2.getAllContentsOfType(gelSpec,
	// GExpression.class);
	// for (GExpression exp : gexps) {
	// // Serializing
	// String s = serializer.serialize(exp);
	// System.out.println(s);
	// }
	// }
}
