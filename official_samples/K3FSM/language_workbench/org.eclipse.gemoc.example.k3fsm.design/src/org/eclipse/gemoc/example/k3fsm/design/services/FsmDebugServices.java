/*******************************************************************************
 * Copyright (c) 2018 Inria.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Inria - initial API and implementation
 *******************************************************************************/
package org.eclipse.gemoc.example.k3fsm.design.services;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gemoc.executionframework.extensions.sirius.services.AbstractGemocDebuggerServices;

public class FsmDebugServices extends AbstractGemocDebuggerServices {

	@Override
	protected List<StringCouple> getRepresentationRefreshList() {
		// Add in res the list of layers that should be activated and refreshed while debugging the model
		//	in case of a single odesign with all layers in a single viewpoint:
        //		- the first String is the id of the Diagram Description
        //		- the second String is the id of the Layer
		//  
		//	in case of a diagram extension:
		//		- the first String is the Representation Name of the Diagram Extension (do not confuse with the Name !!)
		//		- the second String is the id of the Layer
		final List<StringCouple> res = new ArrayList<StringCouple>();
	
		res.add(new StringCouple("FSM", "Debug"));

		return res;
	}
	
	@Override
	public String getModelIdentifier(){
		// Important Note:
		// by default the wizard  generates a ModelIdentifier linked with the sequential engine.
		// ie. return org.eclipse.gemoc.execution.sequential.javaengine.ui.Activator.DEBUG_MODEL_ID;
		// however, if the Debug service is to be used by another engine, you must use the targeted engine's
		// debug model id and update the manifest dependencies accordingly.
		// for example, org.eclipse.gemoc.execution.concurrent.ccsljavaengine.ui.Activator.DEBUG_MODEL_ID for the concurrent engine.
		return org.eclipse.gemoc.execution.sequential.javaengine.ui.Activator.DEBUG_MODEL_ID;
	}	

}
