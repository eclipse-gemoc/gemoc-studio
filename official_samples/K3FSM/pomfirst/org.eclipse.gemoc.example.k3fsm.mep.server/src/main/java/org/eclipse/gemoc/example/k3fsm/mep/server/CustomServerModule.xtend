package org.eclipse.gemoc.example.k3fsm.mep.server

import com.google.inject.AbstractModule
import java.util.concurrent.ExecutorService
import org.eclipse.xtext.ide.ExecutorServiceProvider
import org.eclipse.xtext.ide.server.DefaultProjectDescriptionFactory
import org.eclipse.xtext.ide.server.IProjectDescriptionFactory
import org.eclipse.xtext.ide.server.IWorkspaceConfigFactory
import org.eclipse.xtext.ide.server.ProjectWorkspaceConfigFactory
import org.eclipse.xtext.resource.IContainer
import org.eclipse.xtext.resource.IResourceServiceProvider
import org.eclipse.xtext.resource.ResourceServiceProviderServiceLoader
import org.eclipse.xtext.resource.containers.ProjectDescriptionBasedContainerManager
import org.eclipse.xtext.ide.server.rename.IRenameService
import org.eclipse.xtext.ide.server.rename.RenameService

class CustomServerModule extends AbstractModule {
	
	 override protected configure() {
	 	
	 	binder.bind(ExecutorService).toProvider(ExecutorServiceProvider)
        bind(IResourceServiceProvider.Registry).toProvider(ResourceServiceProviderServiceLoader)
        bind(IWorkspaceConfigFactory).to(ProjectWorkspaceConfigFactory)
        bind(IProjectDescriptionFactory).to(DefaultProjectDescriptionFactory)
        bind(IContainer.Manager).to(ProjectDescriptionBasedContainerManager)
        bind(IRenameService).to(RenameService)
	 }
}
