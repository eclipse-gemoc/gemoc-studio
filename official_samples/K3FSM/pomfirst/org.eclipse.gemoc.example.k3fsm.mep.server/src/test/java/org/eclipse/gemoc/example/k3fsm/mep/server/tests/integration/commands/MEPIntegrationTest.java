package org.eclipse.gemoc.example.k3fsm.mep.server.tests.integration.commands;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.IOUtils;
import org.eclipse.emf.common.util.URI;
import org.eclipse.gemoc.example.k3fsm.mep.server.K3FSMGemocMEPServerImpl;
import org.eclipse.gemoc.example.k3fsm.mep.server.K3FSMMEPModule;
import org.eclipse.gemoc.executionframework.mep.launch.GemocMEPServerImpl;
import org.eclipse.gemoc.executionframework.mep.launch.MEPLaunchParameterKey;
import org.eclipse.gemoc.executionframework.mep.launch.MEPLauncher;
import org.eclipse.gemoc.executionframework.mep.services.IModelExecutionProtocolClient;
import org.eclipse.gemoc.executionframework.mep.services.IModelExecutionProtocolServer;
import org.eclipse.lsp4j.debug.Capabilities;
import org.eclipse.lsp4j.debug.InitializeRequestArguments;
import org.eclipse.lsp4j.jsonrpc.Launcher;
import org.junit.jupiter.api.Test;
import org.wildfly.common.Assert;

public class MEPIntegrationTest {
	private static final long TIMEOUT = 200000;
	
	@Test
	public void testInitializeAndLaunch() throws Exception {
		// create client side
		PipedInputStream in = new PipedInputStream();
		PipedOutputStream out = new PipedOutputStream();
		PipedInputStream in2 = new PipedInputStream();
		PipedOutputStream out2 = new PipedOutputStream();
		
		in.connect(out2);
		out.connect(in2);
		
		boolean[] inComputeAsync = new boolean[1];
		boolean[] launchHappened = new boolean[1];
		

		
		IModelExecutionProtocolClient client = new IModelExecutionProtocolClient() {
			
		};
		Launcher<IModelExecutionProtocolServer> clientSideLauncher = MEPLauncher.createLauncher(client, IModelExecutionProtocolServer.class, in, out);

		

		K3FSMGemocMEPServerImpl server = new K3FSMMEPModule().createInjectorAndDoEMFRegistration().getInstance(K3FSMGemocMEPServerImpl.class);
		Launcher<IModelExecutionProtocolClient> serverSideLauncher = MEPLauncher.createLauncher(server, IModelExecutionProtocolClient.class, in2, out2);
		
		
		server.connect(serverSideLauncher.getRemoteProxy());
		
		clientSideLauncher.startListening();
		serverSideLauncher.startListening();
		
		InitializeRequestArguments initializeRequestArguments = new InitializeRequestArguments();
		initializeRequestArguments.setClientName("MEPIntegrationTest.testInitialize()");
		CompletableFuture<Capabilities> initFuture = clientSideLauncher.getRemoteProxy().initialize(initializeRequestArguments);
		
		Capabilities cap = initFuture.get(TIMEOUT, TimeUnit.MILLISECONDS);
		System.out.println(""+cap);
		Assert.assertTrue(cap.getSupportsTerminateRequest());
		
		// TODO find how to assert answer form clientSide
		
		Map<String, Object> launchRequestArguments = new HashMap<String, Object>();
		launchRequestArguments.put(MEPLaunchParameterKey.modelContent.name(), loadModelContent("tests/xtext/models/TwoStatesUpcast.k3fsm"));
		
		
		URI  uri = URI.createFileURI(getFileFromResources("tests/xtext/models/TwoStatesUpcast.k3fsm").getAbsolutePath());
		launchRequestArguments.put(MEPLaunchParameterKey.modelURI.name(), uri.toString());
		launchRequestArguments.put(MEPLaunchParameterKey.language.name(), "org.eclipse.gemoc.example.k3fsm.K3fsm");
		launchRequestArguments.put(MEPLaunchParameterKey.modelEntryPoint.name(), "/");
		launchRequestArguments.put(MEPLaunchParameterKey.initializationMethod.name(), "org.eclipse.gemoc.example.k3fsm.k3dsa.FSMAspect.initializeModel");
		launchRequestArguments.put(MEPLaunchParameterKey.initializationArguments.name(), "abababa");
		launchRequestArguments.put(MEPLaunchParameterKey.methodEntryPoint.name(), "public static void org.eclipse.gemoc.example.k3fsm.k3dsa.FSMAspect.main(org.eclipse.gemoc.example.k3fsm.FSM)");
		
		CompletableFuture<Void> launchFuture = clientSideLauncher.getRemoteProxy().launch(launchRequestArguments);
		launchFuture.get(TIMEOUT, TimeUnit.MILLISECONDS);
		
		for (int i = 0; i < 20; i++) {
			CompletableFuture<Void> doSTepFuture = clientSideLauncher.getRemoteProxy().next(null);
			doSTepFuture.get(TIMEOUT, TimeUnit.MILLISECONDS);
		}
		
		
	}

	
	public File getFileFromResources(String fileName) {
		ClassLoader classLoader = getClass().getClassLoader();

        URL resource = classLoader.getResource(fileName);
        if (resource == null) {
            throw new IllegalArgumentException("file is not found!");
        } else {
            return new File(resource.getFile());
        }
	}
    
    public String loadModelContent(String filePathInResourceFolder) throws IOException {
    	ClassLoader classLoader = getClass().getClassLoader();

        try (InputStream inputStream = classLoader.getResourceAsStream(filePathInResourceFolder)) {

            String result = IOUtils.toString(inputStream, StandardCharsets.UTF_8);
            return result;

        } catch (IOException e) {
            throw e;
        }
    }
}
