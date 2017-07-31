/*******************************************************************************
 * Copyright (c)  2009, 2017 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.gemoc.gemoc_studio.branding.handlers;

import org.eclipse.jface.action.Action;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

/**
 * 
 * @author Cedric Brun <cedric.brun@obeo.fr>
 * 
 */
public class GemocDiscoveryAction extends Action {
	
	/**
	 * The constructor.
	 */
	public GemocDiscoveryAction() {
	}

	@Override
	public void run() {

		final IWorkbenchWindow window = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow();
		GemocPackageDiscovery.openModelingDiscoveryWizard(window);

	}
}
