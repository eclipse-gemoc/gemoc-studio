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
package org.eclipse.gemoc.commons.eclipse.messagingsystem.ui.internal.console.message;

import org.eclipse.swt.graphics.Color;

public class ConsoleMessage {

	// some default colors that can be used
	public static final Color INFO = null; // make eclipse use default console text color  
	public static final Color DEBUG = new Color(null, 0,128,0);
	public static final Color DEBUG_WARNING = new Color(null, 128,128,0);
	public static final Color DEBUG_ERROR = new Color(null, 128,64,0);
	public static final Color ERROR = new Color(null, 192,0,0);
	public static final Color WARNING = new Color(null, 215,150,0);
	
	/**
	 * The color of the displayed message.
	 * @see org.eclipse.swt.graphics.Color
	 */
	protected Color color;
	
	/**
	 * The message to be displayed.
	 */
	protected String message;
	

	public ConsoleMessage( String message, Color color) {
		super();
		this.color = color;
		this.message = message;
	}
	
	/**
	 * 
	 * @return
	 */
	public Color getColor() {
		return color;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getMessage() {
		return message;
	}

	
}
