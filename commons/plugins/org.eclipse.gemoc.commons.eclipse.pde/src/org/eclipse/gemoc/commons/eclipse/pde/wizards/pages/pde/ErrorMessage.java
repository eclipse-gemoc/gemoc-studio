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
package org.eclipse.gemoc.commons.eclipse.pde.wizards.pages.pde;

public class ErrorMessage {
	
	private String messageError;
	private boolean bActiv;
	
	public ErrorMessage() {
		this.messageError = null;
		this.bActiv = false;
	}
	
	public ErrorMessage(String messageError, boolean bActiv) {
		this.messageError = messageError;
		this.bActiv = bActiv;
	}
	
	public void setActive (boolean bActiv) {
		this.bActiv = bActiv;
	}
	
	public boolean isActive () {
		if (this.bActiv)
			return true;
		else
			return false;
	}
	
	public String getMessageError () {
		return this.messageError;
	}
	
}
