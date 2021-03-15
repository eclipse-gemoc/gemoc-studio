
package org.eclipse.gemoc.example.k3fsm.mep.server

import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2
import com.google.inject.Injector
import org.eclipse.emf.ecore.EPackage
import org.eclipse.xtext.resource.IResourceServiceProvider
import fr.inria.diverse.logo.xtext.LogoStandaloneSetupGenerated
import fr.inria.diverse.logo.xtext.LogoRuntimeModule
import fr.inria.diverse.logo.xtext.ide.LogoIdeModule
import fr.inria.diverse.logo.LogoPackage

/**
 * Initialization support for running FCL language as Execution server using xtext.
 */
class AleLogoMEPModule extends LogoStandaloneSetupGenerated {

/* 	override createInjector() {
		Guice.createInjector(Modules2.mixin(new FCLRuntimeModule, new FCLIdeModule))
	}*/
	
	override createInjector() {
		Guice.createInjector(
			Modules2.mixin(
				new LogoRuntimeModule, 
				new LogoIdeModule, 
				new CustomServerModule,
				[bind(IResourceServiceProvider.Registry).toProvider(IResourceServiceProvider.Registry.RegistryProvider)]
			)
		)
	}
	
	
	
	override register(Injector injector) {
		super.register(injector)
		if (!EPackage.Registry.INSTANCE.containsKey("http://www.example.org/logo")) {
			EPackage.Registry.INSTANCE.put("http://www.example.org/logo", LogoPackage.eINSTANCE);
		}
	}
	
}
