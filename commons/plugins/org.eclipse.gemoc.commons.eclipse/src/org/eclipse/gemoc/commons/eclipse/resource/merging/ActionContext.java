/*******************************************************************************
 * Copyright (c) 2017 Inria and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Inria - initial API and implementation
 *******************************************************************************/
package org.eclipse.gemoc.commons.eclipse.resource.merging;

import org.eclipse.emf.ecore.resource.Resource;

public class ActionContext {

	private Resource _resource;
	
	public ActionContext(Resource resource) {
		_resource = resource;
	}

	public Resource getResource() 
	{
		return _resource;
	}
	
}
