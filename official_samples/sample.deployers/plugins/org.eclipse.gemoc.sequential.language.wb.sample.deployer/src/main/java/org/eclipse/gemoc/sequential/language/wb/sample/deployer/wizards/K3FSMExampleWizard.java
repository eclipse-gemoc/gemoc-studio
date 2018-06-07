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

import org.eclipse.gemoc.sequential.language.wb.sample.deployer.Activator;
import org.eclipse.ui.plugin.AbstractUIPlugin;

public class K3FSMExampleWizard	extends AbstractExampleWizard {
	
	protected Collection<ProjectDescriptor> getProjectDescriptors() {	
		List<ProjectDescriptor> projects = new ArrayList<ProjectDescriptor>(1);
		// extract project in a compilation friendly way, give the compiler a chance to be more efficient and succeed without a "clean all"
		projects.add(new ProjectDescriptor(Activator.PLUGIN_ID, "zips/org.eclipse.gemoc.example.k3fsm.zip", 			"org.eclipse.gemoc.example.k3fsm"));
		projects.add(new ProjectDescriptor(Activator.PLUGIN_ID, "zips/org.eclipse.gemoc.example.k3fsm.k3dsa.zip", 		"org.eclipse.gemoc.example.k3fsm.k3dsa"));
		projects.add(new ProjectDescriptor(Activator.PLUGIN_ID, "zips/org.eclipse.gemoc.example.k3fsm.design.zip", 		"org.eclipse.gemoc.example.k3fsm.design"));
		projects.add(new ProjectDescriptor(Activator.PLUGIN_ID, "zips/org.eclipse.gemoc.example.k3fsm.edit.zip", 		"org.eclipse.gemoc.example.k3fsm.edit"));
		projects.add(new ProjectDescriptor(Activator.PLUGIN_ID, "zips/org.eclipse.gemoc.example.k3fsm.editor.zip",  	"org.eclipse.gemoc.example.k3fsm.editor"));
		projects.add(new ProjectDescriptor(Activator.PLUGIN_ID, "zips/org.eclipse.gemoc.example.k3fsm.xtext.zip",  		"org.eclipse.gemoc.example.k3fsm.xtext"));
		projects.add(new ProjectDescriptor(Activator.PLUGIN_ID, "zips/org.eclipse.gemoc.example.k3fsm.xtext.ui.zip",  	"org.eclipse.gemoc.example.k3fsm.xtext.ui"));
		projects.add(new ProjectDescriptor(Activator.PLUGIN_ID, "zips/org.eclipse.gemoc.example.k3fsm.xtext.ide.zip",	"org.eclipse.gemoc.example.k3fsm.xtext.ide"));
		projects.add(new ProjectDescriptor(Activator.PLUGIN_ID, "zips/org.eclipse.gemoc.example.k3fsm.xdsml.zip", 		"org.eclipse.gemoc.example.k3fsm.xdsml"));
		return projects;
	}

	@Override
	protected AbstractUIPlugin getContainerPlugin() {
		return Activator.getDefault();
	}
}