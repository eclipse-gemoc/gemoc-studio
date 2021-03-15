package fr.inria.diverse.minijava_repl.xtext.server;

import org.eclipse.xtext.ide.server.DefaultProjectDescriptionFactory;
import org.eclipse.xtext.ide.server.IProjectDescriptionFactory;
import org.eclipse.xtext.ide.server.IMultiRootWorkspaceConfigFactory;
import org.eclipse.xtext.ide.server.MultiRootWorkspaceConfigFactory;
import org.eclipse.xtext.util.Modules2;

import com.google.inject.Binder;
import com.google.inject.Guice;
import com.google.inject.Injector;

import fr.inria.diverse.minijava_repl.xtext.MiniJava_replRuntimeModule;
import fr.inria.diverse.minijava_repl.xtext.ide.MiniJava_replIdeModule;
import fr.inria.diverse.minijava_repl.xtext.ide.MiniJava_replIdeSetup;

public class MiniJava_replLspServerSetup extends MiniJava_replIdeSetup {
	
	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new MiniJava_replRuntimeModule(),
			new MiniJava_replIdeModule(),
  	    	(Binder b) -> {
  	    		b.bind(IMultiRootWorkspaceConfigFactory.class).to(MultiRootWorkspaceConfigFactory.class);
				b.bind(IProjectDescriptionFactory.class).to(DefaultProjectDescriptionFactory.class);
  	    	}));
	}

}
