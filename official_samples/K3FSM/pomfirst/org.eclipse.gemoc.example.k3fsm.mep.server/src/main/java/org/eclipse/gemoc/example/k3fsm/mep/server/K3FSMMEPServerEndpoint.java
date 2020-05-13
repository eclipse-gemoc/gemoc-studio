package org.eclipse.gemoc.example.k3fsm.mep.server;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import javax.enterprise.context.ApplicationScoped;
import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gemoc.commons.utils.ExtensibleInputStream;
import org.eclipse.gemoc.example.k3fsm.K3FSMStandaloneSetupGenerated;
import org.eclipse.gemoc.executionframework.mep.launch.GemocMEPServerImpl;
import org.eclipse.gemoc.executionframework.mep.launch.MEPLauncher;
import org.eclipse.gemoc.executionframework.mep.services.IModelExecutionProtocolClient;
import org.eclipse.gemoc.executionframework.mep.services.IModelExecutionProtocolServer;
import org.eclipse.lsp4j.jsonrpc.Launcher;
import org.eclipse.lsp4j.launch.LSPLauncher;
import org.eclipse.lsp4j.services.LanguageClient;
import org.eclipse.xtext.ide.server.LanguageServerImpl;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



@ServerEndpoint("/mep/k3fsm")
@ApplicationScoped
public class K3FSMMEPServerEndpoint {
	
	private static final Logger LOGGER = LoggerFactory.getLogger("K3FSMMEPServerEndpoint");

	boolean supportHeader = true;
	
	Map<Session, ExtensibleInputStream> activeSessions = new HashMap<Session, ExtensibleInputStream>();

//	LanguageServerImpl server = new LogoIdeSetup().createInjectorAndDoEMFRegistration().getInstance(LanguageServerImpl.class);
	
	K3FSMGemocMEPServerImpl server;
	
	public K3FSMGemocMEPServerImpl getOrCreateServer() {
		if(server == null) {
			server = new K3FSMMEPModule().createInjectorAndDoEMFRegistration().getInstance(K3FSMGemocMEPServerImpl.class);
		}
		return server;
	}
	
	@OnOpen
	public void onOpen(Session session) {
		
		LOGGER.info("Connection");

		try {
			
			getOrCreateServer();
			

			ExtensibleInputStream in = new ExtensibleInputStream();
			activeSessions.put(session, in);
		
			OutputStream outputstream = new OutputStream() {

				ByteArrayOutputStream internal = new ByteArrayOutputStream();
				
				@Override
				public void write(int b) throws IOException {
					internal.write(b);
				}
				
				@Override
				public void flush() throws IOException {
					String response = new String(internal.toByteArray(), "UTF-8");
					if(!supportHeader) { //LSP specifies that there is a header but messages from Monaco do not have a header
						response = response.substring(response.indexOf("{"));
					}
					session.getBasicRemote().sendText(response);
					internal.reset();
					
					System.out.println("[DEBUG] Sent: " + response);
				}
			};
			
			Launcher<IModelExecutionProtocolClient> serverSideLauncher = MEPLauncher.createLauncher(server, IModelExecutionProtocolClient.class, in, outputstream);
			server.connect(serverSideLauncher.getRemoteProxy());

			LOGGER.info("Start listening");

			serverSideLauncher.startListening();
			
			//Launcher<IModelExecutionProtocolServer> serverSideLauncher = MEPLauncher.createLauncher(server, IModelExecutionProtocolServer.class, in, outputstream);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@OnClose
	public void onClose(Session session) {
		activeSessions.remove(session);
	}

	@OnError
	public void onError(Session session, Throwable throwable) {

	}

	@OnMessage
	public void onMessage(String message, Session session) {
		
		if(!message.startsWith("Content-Length:")) { //LSP specifies that there is a header but messages from Monaco do not have a header
			supportHeader = false;
			message = addHeader(message);
		}
		
		System.out.println("[DEBUG] Message: " + message);

		ExtensibleInputStream inputStream = activeSessions.get(session);
		if(inputStream != null) {
			inputStream.addMessage(message);
		}
	}
	
	public String addHeader(String requestContent) {
		String header = "";
		try {
			int length = requestContent.getBytes("UTF-8").length;
			header = "Content-Length: " + length + "\n\n";
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
				
		return header + requestContent;
	}

}
