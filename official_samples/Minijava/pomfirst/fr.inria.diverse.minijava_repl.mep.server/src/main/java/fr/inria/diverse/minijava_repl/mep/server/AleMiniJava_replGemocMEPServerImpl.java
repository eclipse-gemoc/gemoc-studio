package fr.inria.diverse.minijava_repl.mep.server;

import java.io.IOException;
import java.net.URI;

import javax.websocket.ContainerProvider;
import javax.websocket.DeploymentException;
import javax.websocket.WebSocketContainer;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.gemoc.ale.interpreted.engine.repl.mep.AleReplEngineMEP;
import org.eclipse.gemoc.executionframework.mep.engine.ExecutionEngineSingleton;
import org.eclipse.gemoc.executionframework.mep.launch.MEPLauncherParameters;
import org.eclipse.gemoc.executionframework.mep.launch.MEPServerLSP4J;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.inject.Injector;

import fr.inria.diverse.minijava_repl.notebook.MiniJava_replKernel;
import fr.inria.diverse.minijava_repl.xtext.MiniJava_replStandaloneSetup;
import fr.inria.diverse.minijava_repl.xtext.minijava_repl.Minijava_replPackage;

public class AleMiniJava_replGemocMEPServerImpl extends MEPServerLSP4J {

	private static final Logger LOGGER = LoggerFactory.getLogger(AleMiniJava_replGemocMEPServerImpl.class);
			
	private AleMiniJava_replLanguageDefinitionExtension languageDefinition;
	
	public AleMiniJava_replGemocMEPServerImpl() {
		//super(new HeadlessPlainK3ExecutionEngineMEP<K3FSMLanguageDefinitionExtension>(new K3FSMLanguageDefinitionExtension()));
		super();
		this.languageDefinition = new AleMiniJava_replLanguageDefinitionExtension();
		AleReplEngineMEP<AleMiniJava_replLanguageDefinitionExtension> engine = new AleReplEngineMEP<>(languageDefinition);
		ExecutionEngineSingleton.setEngine(engine);
		engine.setKernelServer(new MiniJava_replKernel(null));
		this.init();
		
		WebSocketContainer container = ContainerProvider.getWebSocketContainer();
        String uri = "ws://127.0.0.1:8091/mep/minijavarepl/trace";
        try {
			container.connectToServer(AleMiniJava_replTraceManagerAddonClientEndpoint.class, URI.create(uri));
		} catch (DeploymentException | IOException e) {
			LOGGER.info("Trace Addon not available");
		}
        uri = "ws://127.0.0.1:8091/mep/minijavarepl/trace/explorer";
        try {
			container.connectToServer(AleMiniJava_replTraceExplorerClientEndpoint.class, URI.create(uri));
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
		
		Minijava_replPackage.eINSTANCE.eClass();
		
		new org.eclipse.emf.mwe.utils.StandaloneSetup().setPlatformUri("../");
		Injector injector = new MiniJava_replStandaloneSetup().createInjectorAndDoEMFRegistration();
		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		LOGGER.info("created K3FSM XtextResourceSet");
		return resourceSet;
	}

	@Override
	public MEPLauncherParameters getDefaultLauncherParameters() {
		MEPLauncherParameters launcherParameters = super.getDefaultLauncherParameters();
		launcherParameters.languageName = this.languageDefinition.getName();
		launcherParameters.methodEntryPoint = "";
		launcherParameters.initializationMethod = "";
		launcherParameters.modelEntryPoint = "";
		launcherParameters.initializationMethodArgs = "";
		ResourceSet rs = createResourceSet();
		launcherParameters.resourceModel = rs.createResource(org.eclipse.emf.common.util.URI.createURI("file:///home/rhiobet/gemoc-full/gemoc-studio/official_samples/Minijava/language_workbench/fr.inria.diverse.minijava_repl.model/init.minijava_repl"));
		try {
			launcherParameters.resourceModel.load(rs.getLoadOptions());
			launcherParameters.resourceModel.getContents().get(0);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return launcherParameters;
	}
	
}
