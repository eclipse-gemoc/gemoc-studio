package org.eclipse.gemoc.example.k3fsm.mep.trace.server;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;
import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;


import org.eclipse.gemoc.commons.utils.ExtensibleInputStream;
import org.eclipse.gemoc.execution.sequential.javaengine.mep.RemoteTraceManagerAddon;
import org.eclipse.gemoc.executionframework.engine.headless.FakeOSGI;
import org.eclipse.gemoc.executionframework.mep.launch.MEPLauncher;
import org.eclipse.gemoc.executionframework.mep.trace.IRemoteTraceAddon;
import org.eclipse.gemoc.executionframework.mep.trace.ITraceManagerAddonProtocolClient;
import org.eclipse.gemoc.executionframework.mep.trace.TraceAddonSingleton;
import org.eclipse.gemoc.executionframework.mep.trace.TraceManagerAddonProtocolServer;
import org.eclipse.lsp4j.jsonrpc.Launcher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.quarkus.runtime.StartupEvent;



@ServerEndpoint("/mep/k3fsm/trace")
@ApplicationScoped
public class K3FSMTraceManagerAddonServerEndpoint {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(K3FSMTraceManagerAddonServerEndpoint.class);

	boolean supportHeader = true;
	
	Map<Session, ExtensibleInputStream> activeSessions = new HashMap<Session, ExtensibleInputStream>();

	
	TraceManagerAddonProtocolServer server;
	
	public TraceManagerAddonProtocolServer getOrCreateServer() {
		if(server == null) {
			FakeOSGI.start();
			IRemoteTraceAddon traceAddon = new K3FSMMEPModule().createInjectorAndDoEMFRegistration().getInstance(RemoteTraceManagerAddon.class);
			TraceAddonSingleton.setTraceAddon(traceAddon);
			server = new TraceManagerAddonProtocolServer();
		}
		return server;
	}
	
    void onStart(@Observes StartupEvent ev) {               
        LOGGER.info("The K3FSMTraceManagerAddonServerEndpoint is starting...");
        LOGGER.debug("Creating server...");
		ServerEndpoint[] sepAnnot = this.getClass().getAnnotationsByType(ServerEndpoint.class);
		if(sepAnnot.length > 0) {
			LOGGER.debug("ServerEndpoint created "+sepAnnot[0].value());
		} else {

			LOGGER.debug("ServerEndpoint created");
		}
    }
	
	@OnOpen
	public void onOpen(Session session) {
		
		LOGGER.info("Starting connection...");

		try {
			LOGGER.debug("Creating server...");
			getOrCreateServer();
			LOGGER.debug("Server created");
			
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
			Launcher<ITraceManagerAddonProtocolClient> serverSideLauncher = MEPLauncher.createLauncher(server, ITraceManagerAddonProtocolClient.class, in, outputstream);
			server.connect(serverSideLauncher.getRemoteProxy());

			LOGGER.info("Start listening");

			serverSideLauncher.startListening();
			
			//Launcher<IModelExecutionProtocolServer> serverSideLauncher = MEPLauncher.createLauncher(server, IModelExecutionProtocolServer.class, in, outputstream);
			LOGGER.info("Connection success");
			LOGGER.debug("Session "+session.getId()+" "+session.getRequestURI()+" opened");
		} catch (Exception e) {
			e.printStackTrace();
			LOGGER.error("Connection failed", e);
		} catch (Throwable e) {
			if(e instanceof NoSuchFieldError)
			LOGGER.error("NoSuchFieldError detected during MEPLauncher.createLauncher");
			LOGGER.error("Please check jar versions consistency, most probably org.eclipse.lsp4j ");
			throw e;
		}

	}

	@OnClose
	public void onClose(Session session) {
		activeSessions.remove(session);
		LOGGER.debug("Closing session "+session.getId()+" "+session.getRequestURI());
	}

	@OnError
	public void onError(Session session, Throwable throwable) {
		LOGGER.error("Error "+throwable.getMessage()+" on session "+session.getId()+" "+session.getRequestURI(), throwable);
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
