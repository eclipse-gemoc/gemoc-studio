
package org.eclipse.gemoc.example.k3fsm.mep.trace.server

import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2
import com.google.inject.Injector
import org.eclipse.emf.ecore.EPackage
import org.eclipse.xtext.resource.IResourceServiceProvider
import org.eclipse.gemoc.example.k3fsm.K3FSMStandaloneSetupGenerated
import org.eclipse.gemoc.example.k3fsm.K3FSMRuntimeModule
import org.eclipse.gemoc.example.k3fsm.ide.K3FSMIdeModule
import org.eclipse.gemoc.example.k3fsm.K3fsmPackage

/**
 * Initialization support for running FCL language as Execution server using xtext.
 */
class K3FSMMEPModule extends K3FSMStandaloneSetupGenerated {

/* 	override createInjector() {
		Guice.createInjector(Modules2.mixin(new FCLRuntimeModule, new FCLIdeModule))
	}*/
	
	override createInjector() {
		Guice.createInjector(
			Modules2.mixin(
				new K3FSMRuntimeModule, 
				new K3FSMIdeModule, 
				new CustomServerModule,
				[bind(IResourceServiceProvider.Registry).toProvider(IResourceServiceProvider.Registry.RegistryProvider)]
			)
		)
	}
	
	
	
	override register(Injector injector) {
		super.register(injector)
		if (!EPackage.Registry.INSTANCE.containsKey("http://www.inria.fr/glose/fcl")) {
			EPackage.Registry.INSTANCE.put("http://www.inria.fr/glose/fcl", K3fsmPackage.eINSTANCE);
		}
	}
	
}
