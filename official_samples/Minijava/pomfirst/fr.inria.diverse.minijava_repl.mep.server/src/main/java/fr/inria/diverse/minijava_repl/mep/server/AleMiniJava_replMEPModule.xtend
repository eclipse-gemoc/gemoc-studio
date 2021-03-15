
package fr.inria.diverse.minijava_repl.mep.server

import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2
import com.google.inject.Injector
import org.eclipse.emf.ecore.EPackage
import org.eclipse.xtext.resource.IResourceServiceProvider
import fr.inria.diverse.minijava_repl.xtext.ide.MiniJava_replIdeModule
import fr.inria.diverse.minijava_repl.xtext.MiniJava_replStandaloneSetupGenerated
import fr.inria.diverse.minijava_repl.xtext.MiniJava_replRuntimeModule
import fr.inria.diverse.minijava_repl.xtext.minijava_repl.Minijava_replPackage

/**
 * Initialization support for running FCL language as Execution server using xtext.
 */
class AleMiniJava_replMEPModule extends MiniJava_replStandaloneSetupGenerated {

/* 	override createInjector() {
		Guice.createInjector(Modules2.mixin(new FCLRuntimeModule, new FCLIdeModule))
	}*/
	
	override createInjector() {
		Guice.createInjector(
			Modules2.mixin(
				new MiniJava_replRuntimeModule, 
				new MiniJava_replIdeModule, 
				new CustomServerModule,
				[bind(IResourceServiceProvider.Registry).toProvider(IResourceServiceProvider.Registry.RegistryProvider)]
			)
		)
	}
	
	
	
	override register(Injector injector) {
		super.register(injector)
		if (!EPackage.Registry.INSTANCE.containsKey("http://www.example.org/minijava")) {
			EPackage.Registry.INSTANCE.put("http://www.example.org/minijava", Minijava_replPackage.eINSTANCE);
		}
	}
	
}
