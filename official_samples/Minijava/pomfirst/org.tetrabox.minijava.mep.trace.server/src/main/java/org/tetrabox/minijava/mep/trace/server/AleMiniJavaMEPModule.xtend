
package org.tetrabox.minijava.mep.trace.server

import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2
import com.google.inject.Injector
import org.eclipse.emf.ecore.EPackage
import org.eclipse.xtext.resource.IResourceServiceProvider
import org.tetrabox.minijava.xtext.MiniJavaStandaloneSetupGenerated
import org.tetrabox.minijava.xtext.MiniJavaRuntimeModule
import org.tetrabox.minijava.xtext.ide.MiniJavaIdeModule
import org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage

/**
 * Initialization support for running FCL language as Execution server using xtext.
 */
class AleMiniJavaMEPModule extends MiniJavaStandaloneSetupGenerated {

/* 	override createInjector() {
		Guice.createInjector(Modules2.mixin(new FCLRuntimeModule, new FCLIdeModule))
	}*/
	
	override createInjector() {
		Guice.createInjector(
			Modules2.mixin(
				new MiniJavaRuntimeModule, 
				new MiniJavaIdeModule, 
				new CustomServerModule,
				[bind(IResourceServiceProvider.Registry).toProvider(IResourceServiceProvider.Registry.RegistryProvider)]
			)
		)
	}
	
	
	
	override register(Injector injector) {
		super.register(injector)
		if (!EPackage.Registry.INSTANCE.containsKey("http://www.example.org/minijava")) {
			EPackage.Registry.INSTANCE.put("http://www.example.org/minijava", MiniJavaPackage.eINSTANCE);
		}
	}
	
}
