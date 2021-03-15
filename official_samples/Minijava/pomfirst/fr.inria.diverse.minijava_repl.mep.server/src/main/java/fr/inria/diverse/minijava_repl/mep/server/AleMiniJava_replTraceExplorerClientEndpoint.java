package fr.inria.diverse.minijava_repl.mep.server;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import javax.enterprise.context.ApplicationScoped;
import javax.websocket.ClientEndpoint;
import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;


import org.eclipse.gemoc.commons.utils.ExtensibleInputStream;
import org.eclipse.gemoc.executionframework.mep.launch.MEPLauncher;
import org.eclipse.gemoc.executionframework.mep.trace.ITraceExplorerProtocolServer;
import org.eclipse.gemoc.executionframework.mep.trace.TraceExplorerProtocolClient;
import org.eclipse.lsp4j.jsonrpc.Launcher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



@ClientEndpoint
@ApplicationScoped
public class AleMiniJava_replTraceExplorerClientEndpoint {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(AleMiniJava_replTraceExplorerClientEndpoint.class);

	boolean supportHeader = true;
	
	Map<Session, ExtensibleInputStream> activeSessions = new HashMap<Session, ExtensibleInputStream>();

	
	TraceExplorerProtocolClient client;
	
	AleMiniJava_replTraceManagerAddonClientEndpoint traceAddon;
	
	public AleMiniJava_replTraceExplorerClientEndpoint(AleMiniJava_replTraceManagerAddonClientEndpoint traceAddon) {
		this.traceAddon = traceAddon;
	}
	
	public TraceExplorerProtocolClient getOrCreateClient() {
		if(client == null) {
			client = new TraceExplorerProtocolClient();
			AleMiniJava_replTraceManagerAddonClientEndpoint.instance.getOrCreateClient().setTraceExplorer(client);
		}
		return client;
	}
	
	@OnOpen
	public void onOpen(Session session) {
		
		LOGGER.info("Starting connection...");

		try {
			LOGGER.debug("Creating client...");
			getOrCreateClient();
			LOGGER.debug("Client created");
			
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
					
					LOGGER.debug("Sent: " + response);
				}
			};
			Launcher<ITraceExplorerProtocolServer> clientSideLauncher = MEPLauncher.createLauncher(client, ITraceExplorerProtocolServer.class, in, outputstream);
			client.connect(clientSideLauncher.getRemoteProxy());

			LOGGER.info("Start listening");

			clientSideLauncher.startListening();
			
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
		
		LOGGER.debug("Message: " + message);

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
