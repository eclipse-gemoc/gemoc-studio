package org.eclipse.gemoc.example.k3fsm.mep.server.tests.dap.commands;


import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import org.eclipse.gemoc.example.k3fsm.mep.server.K3FSMGemocMEPServerImpl;
import org.eclipse.gemoc.example.k3fsm.mep.server.K3FSMMEPModule;
import org.eclipse.gemoc.example.k3fsm.mep.server.tests.commands.MockTestClient;
import org.eclipse.gemoc.executionframework.mep.launch.GemocMEPServerImpl;
import org.eclipse.gemoc.executionframework.mep.services.IModelExecutionProtocolClient;
import org.eclipse.lsp4j.debug.Capabilities;
import org.eclipse.lsp4j.debug.InitializeRequestArguments;
import org.junit.jupiter.api.Test;

public class InitializeCommandTest {
	@Test
    void checkCapabilitiesTest() throws InterruptedException, ExecutionException {
        
		GemocMEPServerImpl server = new K3FSMMEPModule().createInjectorAndDoEMFRegistration().getInstance(K3FSMGemocMEPServerImpl.class);
		IModelExecutionProtocolClient mockClient = new MockTestClient();
		server.connect(mockClient);

		InitializeRequestArguments initParam = new InitializeRequestArguments();
		CompletableFuture<Capabilities> futureCapabilities = server.initialize(initParam);
		
		// check capabilities
		Capabilities capabilities = futureCapabilities.get();
		assertTrue( capabilities.getSupportsTerminateRequest(), "capabilities.getSupportsTerminateRequest() returned false");
    }
}
