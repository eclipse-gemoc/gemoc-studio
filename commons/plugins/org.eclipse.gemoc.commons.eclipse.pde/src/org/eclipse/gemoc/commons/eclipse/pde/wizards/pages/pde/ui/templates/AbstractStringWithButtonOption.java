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
package org.eclipse.gemoc.commons.eclipse.pde.wizards.pages.pde.ui.templates;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

import org.eclipse.gemoc.commons.eclipse.pde.wizards.pages.pde.ui.templates.AbstractStringWithButtonOption;
import org.eclipse.gemoc.commons.eclipse.pde.wizards.pages.pde.ui.templates.BaseOptionTemplateSection;
import org.eclipse.gemoc.commons.eclipse.pde.wizards.pages.pde.ui.templates.StringOption;



public abstract class AbstractStringWithButtonOption extends StringOption {

	

	protected Button btnButton;
	
	public AbstractStringWithButtonOption(BaseOptionTemplateSection section,
			String name, String label) {
		super(section, name, label);
		
	}
	
	public AbstractStringWithButtonOption(BaseOptionTemplateSection section,
			String name, String label, String toolTipText) {
		super(section, name, label, toolTipText);
		
	}
	
	/**
	 * Creates the string option control.
	 * 
	 * @param parent
	 *            parent composite of the string option widget
	 * @param span
	 *            the number of columns that the widget should span
	 */
	public void createControl(Composite parent, int span) {
		labelControl = createLabel(parent, 1);
		labelControl.setEnabled(isEnabled());
		text = new Text(parent, fStyle);
		if (getValue() != null)
			text.setText(getValue().toString());
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.horizontalSpan = span - 2;
		text.setLayoutData(gd);
		text.setEnabled(isEnabled());
		text.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				if (ignoreListener)
					return;
				AbstractStringWithButtonOption.super.setValue(text.getText());
				getSection().validateOptions(AbstractStringWithButtonOption.this);
			}
		});
		text.setToolTipText(this.getToolTipText());
		btnButton = new Button(parent, SWT.NONE);
		btnButton.setText("Browse...");
		btnButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String result = AbstractStringWithButtonOption.this.doSelectButton();
				if (result != null){
					text.setText(result);
					//AbstractStringWithButtonOption.super.setValue(result);
					//getSection().validateOptions(AbstractStringWithButtonOption.this);
				}
			}}
		);
	}
	
	public abstract String doSelectButton();

}
