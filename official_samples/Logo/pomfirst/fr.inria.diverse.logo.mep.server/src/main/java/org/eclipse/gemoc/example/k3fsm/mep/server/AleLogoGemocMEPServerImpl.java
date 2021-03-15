package org.eclipse.gemoc.example.k3fsm.mep.server;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.gemoc.ale.interpreted.engine.mep.AleEngineMEP;
import org.eclipse.gemoc.executionframework.mep.engine.ExecutionEngineSingleton;
import org.eclipse.gemoc.executionframework.mep.launch.MEPServerLSP4J;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.inject.Injector;

import fr.inria.diverse.logo.LogoPackage;
import fr.inria.diverse.logo.xtext.LogoStandaloneSetup;

public class AleLogoGemocMEPServerImpl extends MEPServerLSP4J {

	private static final Logger LOGGER = LoggerFactory.getLogger(AleLogoGemocMEPServerImpl.class);
			
	public AleLogoGemocMEPServerImpl() {
		//super(new HeadlessPlainK3ExecutionEngineMEP<K3FSMLanguageDefinitionExtension>(new K3FSMLanguageDefinitionExtension()));
		super();
		AleLogoLanguageDefinitionExtension languageDefinition = new AleLogoLanguageDefinitionExtension();
		AleEngineMEP<AleLogoLanguageDefinitionExtension> engine = new AleEngineMEP<>(languageDefinition);
		ExecutionEngineSingleton.setEngine(engine);
		this.init();
        LOGGER.debug("All endpoints and clients initialized");
	}
	
	/**
	 * use K3FSM xtext resourceSet
	 * TODO see if the Sirius modelLoader allows to generalize/avoid that
	 */
	@Override
	public ResourceSet createResourceSet() {
		
		LogoPackage.eINSTANCE.eClass();
		
		new org.eclipse.emf.mwe.utils.StandaloneSetup().setPlatformUri("../");
		Injector injector = new LogoStandaloneSetup().createInjectorAndDoEMFRegistration();
		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		LOGGER.info("created K3FSM XtextResourceSet");
		return resourceSet;
	}
	
}
