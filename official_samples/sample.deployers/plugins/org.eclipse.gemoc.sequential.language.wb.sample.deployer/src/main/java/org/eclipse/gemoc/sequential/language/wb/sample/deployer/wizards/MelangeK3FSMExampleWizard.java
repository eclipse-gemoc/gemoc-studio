/*******************************************************************************
 * Copyright (c) 2015, 2017  Inria  and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Inria - initial API and implementation
 *******************************************************************************/
package org.eclipse.gemoc.sequential.language.wb.sample.deployer.wizards;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.gemoc.sequential.language.wb.sample.deployer.Activator;

public class MelangeK3FSMExampleWizard
	extends AbstractExampleWizard {
	
	protected Collection<ProjectDescriptor> getProjectDescriptors() {		
		// We need the statements example to be unzipped along with the
		// EMF library example model, edit and editor examples
		List<ProjectDescriptor> projects = new ArrayList<ProjectDescriptor>(1);
		// extract project in a compilation friendly way, give the compiler a chance to be more efficient and succeed without a "clean all"
		projects.add(new ProjectDescriptor(Activator.PLUGIN_ID, "zips/org.eclipse.gemoc.example.melangek3fsm.fsm.model.zip", 	"org.eclipse.gemoc.example.melangek3fsm.fsm.model"));
		projects.add(new ProjectDescriptor(Activator.PLUGIN_ID, "zips/org.eclipse.gemoc.example.melangek3fsm.fsm.k3dsa.zip", 	"org.eclipse.gemoc.example.melangek3fsm.fsm.k3dsa"));
		projects.add(new ProjectDescriptor(Activator.PLUGIN_ID, "zips/org.eclipse.gemoc.example.melangek3fsm.fsm.zip", 			"org.eclipse.gemoc.example.melangek3fsm.fsm"));
		projects.add(new ProjectDescriptor(Activator.PLUGIN_ID, "zips/org.eclipse.gemoc.example.melangek3fsm.fsm.design.zip", 	"org.eclipse.gemoc.example.melangek3fsm.fsm.design"));
		projects.add(new ProjectDescriptor(Activator.PLUGIN_ID, "zips/org.eclipse.gemoc.example.melangek3fsm.fsm.model.edit.zip", 	"org.eclipse.gemoc.example.melangek3fsm.fsm.model.edit"));
		projects.add(new ProjectDescriptor(Activator.PLUGIN_ID, "zips/org.eclipse.gemoc.example.melangek3fsm.fsm.model.editor.zip", "org.eclipse.gemoc.example.melangek3fsm.fsm.model.editor"));
		projects.add(new ProjectDescriptor(Activator.PLUGIN_ID, "zips/org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsm.zip", 	"org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsm"));
		projects.add(new ProjectDescriptor(Activator.PLUGIN_ID, "zips/org.eclipse.gemoc.example.melangek3fsm.xsfsm.zip", 		"org.eclipse.gemoc.example.melangek3fsm.xsfsm"));
		projects.add(new ProjectDescriptor(Activator.PLUGIN_ID, "zips/org.eclipse.gemoc.example.melangek3fsm.xsfsm.design.zip", "org.eclipse.gemoc.example.melangek3fsm.xsfsm.design"));
		projects.add(new ProjectDescriptor(Activator.PLUGIN_ID, "zips/org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsm.trace.zip", "org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsm.trace"));
		return projects;
	}

	@Override
	protected AbstractUIPlugin getContainerPlugin() {
		
		return Activator.getDefault();
	}
}