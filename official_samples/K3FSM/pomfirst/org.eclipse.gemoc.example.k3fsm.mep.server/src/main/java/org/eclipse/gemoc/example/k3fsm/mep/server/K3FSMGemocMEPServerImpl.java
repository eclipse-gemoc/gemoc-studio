package org.eclipse.gemoc.example.k3fsm.mep.server;

import java.io.IOException;
import java.net.URI;

import javax.websocket.ContainerProvider;
import javax.websocket.DeploymentException;
import javax.websocket.WebSocketContainer;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.gemoc.example.k3fsm.K3FSMStandaloneSetup;
import org.eclipse.gemoc.example.k3fsm.K3fsmPackage;
import org.eclipse.gemoc.execution.sequential.javaengine.mep.PlainK3ExecutionEngineMEP;
import org.eclipse.gemoc.executionframework.mep.engine.ExecutionEngineSingleton;
import org.eclipse.gemoc.executionframework.mep.launch.MEPLauncherParameters;
import org.eclipse.gemoc.executionframework.mep.launch.MEPServerLSP4J;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.inject.Injector;

public class K3FSMGemocMEPServerImpl extends MEPServerLSP4J {

	private static final Logger LOGGER = LoggerFactory.getLogger(K3FSMGemocMEPServerImpl.class);
		
	private K3FSMLanguageDefinitionExtension languageDefinition;
	
	public K3FSMGemocMEPServerImpl() {
		//super(new HeadlessPlainK3ExecutionEngineMEP<K3FSMLanguageDefinitionExtension>(new K3FSMLanguageDefinitionExtension()));
		super();
		this.languageDefinition = new K3FSMLanguageDefinitionExtension();
		PlainK3ExecutionEngineMEP<K3FSMLanguageDefinitionExtension> engine = new PlainK3ExecutionEngineMEP<>(languageDefinition);
		ExecutionEngineSingleton.setEngine(engine);
		this.init();
		
		WebSocketContainer container = ContainerProvider.getWebSocketContainer();
        String uri = "ws://127.0.0.1:8091/mep/k3fsm/trace";
        try {
			container.connectToServer(K3FSMTraceManagerAddonClientEndpoint.class, URI.create(uri));
		} catch (DeploymentException | IOException e) {
			LOGGER.info("Trace Addon not available");
		}
        uri = "ws://127.0.0.1:8091/mep/k3fsm/trace/explorer";
        try {
			container.connectToServer(K3FSMTraceExplorerClientEndpoint.class, URI.create(uri));
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
		
		K3fsmPackage.eINSTANCE.eClass();
		
		new org.eclipse.emf.mwe.utils.StandaloneSetup().setPlatformUri("../");
		Injector injector = new K3FSMStandaloneSetup().createInjectorAndDoEMFRegistration();
		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		LOGGER.info("created K3FSM XtextResourceSet");
		return resourceSet;
	}
	
	@Override
	public MEPLauncherParameters getDefaultLauncherParameters() {
		MEPLauncherParameters launcherParameters = super.getDefaultLauncherParameters();
		launcherParameters.languageName = this.languageDefinition.getName();
		launcherParameters.methodEntryPoint = "public static void org.eclipse.gemoc.example.k3fsm.k3dsa.FSMAspect.main(org.eclipse.gemoc.example.k3fsm.FSM)";
		launcherParameters.initializationMethod = "org.eclipse.gemoc.example.k3fsm.k3dsa.FSMAspect.initializeModel";
		launcherParameters.modelEntryPoint = "/";
		return launcherParameters;
	}
	
}
