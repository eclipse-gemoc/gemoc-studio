/*******************************************************************************
 * Copyright (c) 2011, 2017 Inria and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Inria - initial API and implementation
 *******************************************************************************/
package org.eclipse.gemoc.commons.eclipse.messagingsystem.ui.helper;

import org.eclipse.core.resources.IResource;



@SuppressWarnings("serial")
public class PropertyNotFoundException extends Exception {

	private String qualifiedNameProperty = "";
	private IResource resource;
	
	public PropertyNotFoundException(IResource resource, String qualifiedNameProperty) {
		this.resource = resource;
		this.qualifiedNameProperty = qualifiedNameProperty;
	}
	
	@Override
	public String getMessage() {
		return "The property " + qualifiedNameProperty + " does not exist for the resource " + resource;
	}
	
}
