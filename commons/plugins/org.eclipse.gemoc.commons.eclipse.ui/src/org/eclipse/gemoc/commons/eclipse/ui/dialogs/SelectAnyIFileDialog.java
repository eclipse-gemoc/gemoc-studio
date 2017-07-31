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
package org.eclipse.gemoc.commons.eclipse.ui.dialogs;

import java.lang.reflect.Field;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.ResourceListSelectionDialog;
import org.eclipse.gemoc.commons.eclipse.ui.Activator;

/**
 * Dialog that allows to select any IProject
 * Uses a quite ugly workaround to access and set the default pattern filter, but this prevents from duplicating eclipse code.
 * @author dvojtise
 *
 */
public class SelectAnyIFileDialog extends ResourceListSelectionDialog {

	public SelectAnyIFileDialog(){
		this(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell());
	}

	public SelectAnyIFileDialog(Shell parentShell){
		super(parentShell, ResourcesPlugin.getWorkspace().getRoot(), IResource.FILE);
	}
	
	public SelectAnyIFileDialog(Shell parentShell, IContainer container){
		super(parentShell, container, IResource.FILE);
	}
	public SelectAnyIFileDialog(IContainer container){
		this(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), container);
	}
	public SelectAnyIFileDialog(Shell parentShell, String defaultPattern){
		super(parentShell, ResourcesPlugin.getWorkspace().getRoot(), IResource.FILE);
	}
	
	private String _pattern = "*";
	
	@Override
	protected Control createDialogArea(Composite parent) {
		Control result = super.createDialogArea(parent);
		setPattern(_pattern);
		return result;
	}
	
	
	public void setPattern(String newPattern){
		//this.pattern.setText("*");
		// workaround to set the initial value of the pattern to "*"
		try {
			Field patternField = ResourceListSelectionDialog.class.getDeclaredField("pattern");
			patternField.setAccessible(true);
			Text pattern =(Text) patternField.get(this);
			if (pattern != null)
				pattern.setText(newPattern);
			_pattern = newPattern;
		} catch (NoSuchFieldException e) {
			Activator.error(e.getMessage(), e);
		} catch (SecurityException e) {
			Activator.error(e.getMessage(), e);
		} catch (IllegalArgumentException e) {
			Activator.error(e.getMessage(), e);
		} catch (IllegalAccessException e) {
			Activator.error(e.getMessage(), e);
		}
	}
	
}
