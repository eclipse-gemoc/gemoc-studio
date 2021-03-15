package fr.inria.diverse.minijava_repl.notebook;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

import org.eclipse.gemoc.ale.interpreted.engine.Helper;
import org.eclipse.gemoc.executionframework.engine.commons.DslHelper;

import fr.inria.diverse.ale.repl.REPLInterpreter;
import fr.inria.diverse.ale.repl.notebook.KernelServer;
import fr.inria.diverse.minijava_repl.xtext.server.MiniJava_replLspServer;

public class MiniJava_replKernel extends KernelServer {
	public MiniJava_replKernel() {
		super(Helper.gemocDslToAleDsl(DslHelper.load("MiniJava_repl")),
				"minijava_repl", 25185, 23708);
	}
	
	public MiniJava_replKernel(Object delayInit) {
		super();
	}
	
	private MiniJava_replLspServer lspServer;
	
	@Override
	public void setInterpreter(REPLInterpreter interpreter) {
		super.setInterpreter(interpreter, 25185, 23708);
	}
	
	public void start() {
		lspServer = new MiniJava_replLspServer();
		new Thread(() -> lspServer.runServer(23708)).start();
		super.start();
	}
	
	public void stop() {
		lspServer.stopServer();
		super.stop();
	}
	
	public void install(String kernelsLocation) {
		File kernelDir = new File(kernelsLocation + File.separator + "minijava_repl25185");
		kernelDir.mkdir();
		try {
			File kernelFile = new File("/home/rhiobet/studios/last/runtime-EclipseXtext/fr.inria.diverse.minijava_repl.notebook/kernels/minijava_repl/kernel.json");
			Files.copy(kernelFile.toPath(), kernelDir.toPath().resolve("kernel.json"), StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void uninstall(String kernelsLocation) {
		File kernelDir = new File(kernelsLocation + File.separator + "minijava_repl25185");
		File kernelFile = new File(kernelsLocation + File.separator + "minijava_repl25185"
				+ File.separator + "kernel.json");
		kernelFile.delete();
		kernelDir.delete();
	}
}
