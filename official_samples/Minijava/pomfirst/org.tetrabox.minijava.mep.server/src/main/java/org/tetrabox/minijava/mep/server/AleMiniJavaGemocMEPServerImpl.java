package org.tetrabox.minijava.mep.server;

import java.io.IOException;
import java.net.URI;

import javax.websocket.ContainerProvider;
import javax.websocket.DeploymentException;
import javax.websocket.WebSocketContainer;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.gemoc.ale.interpreted.engine.mep.AleEngineMEP;
import org.eclipse.gemoc.executionframework.mep.engine.ExecutionEngineSingleton;
import org.eclipse.gemoc.executionframework.mep.launch.MEPServerLSP4J;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tetrabox.minijava.xtext.MiniJavaStandaloneSetup;
import org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage;

import com.google.inject.Injector;

public class AleMiniJavaGemocMEPServerImpl extends MEPServerLSP4J {

	private static final Logger LOGGER = LoggerFactory.getLogger(AleMiniJavaGemocMEPServerImpl.class);
			
	public AleMiniJavaGemocMEPServerImpl() {
		//super(new HeadlessPlainK3ExecutionEngineMEP<K3FSMLanguageDefinitionExtension>(new K3FSMLanguageDefinitionExtension()));
		super();
		AleMiniJavaLanguageDefinitionExtension languageDefinition = new AleMiniJavaLanguageDefinitionExtension();
		AleEngineMEP<AleMiniJavaLanguageDefinitionExtension> engine = new AleEngineMEP<>(languageDefinition);
		ExecutionEngineSingleton.setEngine(engine);
		this.init();
		
		WebSocketContainer container = ContainerProvider.getWebSocketContainer();
        String uri = "ws://127.0.0.1:8091/mep/minijava/trace";
        try {
			container.connectToServer(AleMiniJavaTraceManagerAddonClientEndpoint.class, URI.create(uri));
		} catch (DeploymentException | IOException e) {
			LOGGER.info("Trace Addon not available");
		}
        uri = "ws://127.0.0.1:8091/mep/minijava/trace/explorer";
        try {
			container.connectToServer(AleMiniJavaTraceExplorerClientEndpoint.class, URI.create(uri));
		} catch (DeploymentException | IOException e) {
			LOGGER.info("Trace Explorer not available");
		}
        LOGGER.debug("All endpoints and clients initialized");
	}
	
	/**
	 * use K3FSM xtext resourceSet
	 * TODO see if the Sirius modelLoader allows to generalize/avoid that
	 */
	@Override
	public ResourceSet createResourceSet() {
		
		MiniJavaPackage.eINSTANCE.eClass();
		
		new org.eclipse.emf.mwe.utils.StandaloneSetup().setPlatformUri("../");
		Injector injector = new MiniJavaStandaloneSetup().createInjectorAndDoEMFRegistration();
		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		LOGGER.info("created K3FSM XtextResourceSet");
		return resourceSet;
	}
	
}
