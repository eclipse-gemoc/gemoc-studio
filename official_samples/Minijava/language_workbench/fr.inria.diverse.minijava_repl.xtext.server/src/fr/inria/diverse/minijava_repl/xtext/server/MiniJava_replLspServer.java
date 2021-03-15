package fr.inria.diverse.minijava_repl.xtext.server;

import com.google.inject.Injector;
import fr.inria.diverse.ale.repl.server.ReplLspServer;
import java.net.ServerSocket;
import java.net.Socket;
import org.eclipse.lsp4j.InitializedParams;
import org.eclipse.lsp4j.InitializeParams;
import org.eclipse.lsp4j.jsonrpc.Launcher;
import org.eclipse.lsp4j.launch.LSPLauncher;
import org.eclipse.lsp4j.services.LanguageClient;
import org.eclipse.xtext.ide.server.LanguageServerImpl;
import org.eclipse.xtext.resource.IResourceServiceProvider;

import fr.inria.diverse.minijava_repl.xtext.minijava_repl.Minijava_replPackage;

public class MiniJava_replLspServer implements ReplLspServer {
	private static Injector injector = null;
	private static Minijava_replPackage pkg = null;
	
	private LanguageServerImpl server;
	private Socket clientSocket;
	private ServerSocket serverSocket;
	
	public void runServer(int port) {
		if (pkg == null) {
			pkg = Minijava_replPackage.eINSTANCE;
		}
		if (injector == null) {
			injector = new MiniJava_replLspServerSetup().createInjectorAndDoEMFRegistration();
			// Keeping `ecl` leads to a NullPointerException when getting
			//   the resourceServiceProvider for each language
			injector.getInstance(IResourceServiceProvider.Registry.class)
					.getExtensionToFactoryMap().remove("ecl");
		}
		this.server = injector.getInstance(LanguageServerImpl.class);
		
		try {
			this.serverSocket = new ServerSocket(port);
			this.clientSocket = this.serverSocket.accept();
			Launcher<LanguageClient> launcher = LSPLauncher.createServerLauncher(
					server, this.clientSocket.getInputStream(), this.clientSocket.getOutputStream());
			this.server.connect(launcher.getRemoteProxy());
			launcher.startListening();
		
			this.server.initialize(new InitializeParams());
			this.server.initialized(new InitializedParams());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void stopServer() {
		this.server.shutdown();
		this.server = null;
		try {
			this.serverSocket.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
