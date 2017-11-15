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

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;

public class ConsoleMessage {

	// some default colors that can be used
	public static final Color INFO = null; // make eclipse use default console text color    
	public static final Color IMPORTANT = new Color(null, 0,0,192);
	public static final Color DEBUG = new Color(null, 0,128,0);
	public static final Color DEBUG_WARNING = new Color(null, 128,128,0);
	public static final Color DEBUG_ERROR = new Color(null, 128,64,0);
	public static final Color ERROR = new Color(null, 192,0,0);
	public static final Color WARNING = new Color(null, 215,150,0);
	
	public static final int INFO_STYLE = SWT.NORMAL; // make eclipse use default console text color    
	public static final int IMPORTANT_STYLE = SWT.BOLD;
	public static final int DEBUG_STYLE = SWT.NORMAL;
	public static final int DEBUG_WARNING_STYLE = SWT.NORMAL;
	public static final int DEBUG_ERROR_STYLE = SWT.NORMAL;
	public static final int ERROR_STYLE = SWT.NORMAL;
	public static final int WARNING_STYLE = SWT.NORMAL;
	
	
	
	/**
	 * The color of the displayed message.
	 * @see org.eclipse.swt.graphics.Color
	 */
	protected Color color;
	/**
	 * The font style of the displayed message.
	 */
	protected int style;
	
	/**
	 * The message to be displayed.
	 */
	protected String message;
	

	public ConsoleMessage( String message, Color color, int style) {
		super();
		this.color = color;
		this.message = message;
		this.style = style;
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
	public int getStyle() {
		return style;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getMessage() {
		return message;
	}

	
}
