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


import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IExecutableExtension;
import org.eclipse.jface.viewers.*;
import org.eclipse.jface.wizard.IWizard;
import org.eclipse.jface.wizard.IWizardContainer;
import org.eclipse.jface.wizard.IWizardNode;
import org.eclipse.pde.internal.ui.IHelpContextIds;
import org.eclipse.pde.internal.ui.PDEUIMessages;
import org.eclipse.pde.internal.ui.elements.ElementList;
import org.eclipse.pde.internal.ui.wizards.*;
import org.eclipse.pde.ui.IBasePluginWizard;
import org.eclipse.pde.ui.IPluginContentWizard;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.PlatformUI;
import org.eclipse.gemoc.commons.eclipse.pde.wizards.pages.pde.ui.BaseProjectWizardFields;
import org.eclipse.gemoc.commons.eclipse.pde.wizards.pages.pde.ui.IBaseProjectWizard;
import org.eclipse.gemoc.commons.eclipse.pde.wizards.pages.pde.ui.IProjectContentWizard;

import org.eclipse.gemoc.commons.eclipse.pde.wizards.pages.pde.WizardElement;
import org.eclipse.gemoc.commons.eclipse.pde.wizards.pages.pde.WizardListSelectionPage;
import org.eclipse.gemoc.commons.eclipse.pde.wizards.pages.pde.WizardNode;

public class TemplateListSelectionPage extends WizardListSelectionPage implements ISelectionChangedListener, IExecutableExtension {
	private BaseProjectWizardFields fContext;
	private Button fUseTemplate;
	private String fInitialTemplateId;

	
	/**
	 * Filter used to remove templates according to user data in the main Wizard
	 *
	 */
	class WizardFilter extends ViewerFilter {
		public boolean select(Viewer viewer, Object parentElement, Object element) {
		/*	PluginFieldData data = (PluginFieldData) fContentPage.getData();
			boolean simple = data.isSimple();
			boolean generate = data.doGenerateClass();
			boolean ui = data.isUIPlugin();
			boolean rcp = data.isRCPApplicationPlugin();
			boolean osgi = data.getOSGiFramework() != null;
			WizardElement welement = (WizardElement) element;
			boolean active = TemplateWizardHelper.isActive(welement);
			boolean uiFlag = TemplateWizardHelper.getFlag(welement, TemplateWizardHelper.FLAG_UI, true);
			boolean javaFlag = TemplateWizardHelper.getFlag(welement, TemplateWizardHelper.FLAG_JAVA, true);
			boolean rcpFlag = TemplateWizardHelper.getFlag(welement, TemplateWizardHelper.FLAG_RCP, false);
			boolean osgiFlag = TemplateWizardHelper.getFlag(welement, TemplateWizardHelper.FLAG_OSGI, false);
			boolean activatorFlag = TemplateWizardHelper.getFlag(welement, TemplateWizardHelper.FLAG_ACTIVATOR, false);

			//filter out wizards from disabled activities
			if (!active)
				return false;
			//osgi projects need java
			if (osgi && simple)
				return false;
			//filter out java wizards for simple projects
			if (simple)
				return !javaFlag;
			//filter out ui wizards for non-ui plug-ins
			if (uiFlag && !ui)
				return false;
			//filter out wizards that require an activator when the user specifies not to generate a class
			if (activatorFlag && !generate)
				return false;
			//filter out non-RCP wizard if RCP option is selected
			if (!osgi && (rcp != rcpFlag))
				return false;
			//filter out non-UI wizards if UI option is selected for rcp and osgi projects
			return (osgi == osgiFlag && ((!osgiFlag && !rcpFlag) || ui == uiFlag));
			*/
			return true;
		}

	}

	/**
	 * Constructor
	 * @param wizardElements a list of TemplateElementWizard objects
	 * @param page content wizard page
	 * @param message message to provide to the user
	 */
	public TemplateListSelectionPage(ElementList wizardElements, BaseProjectWizardFields context, String message) {
		super(wizardElements, message);
		fContext = context;
		setTitle(PDEUIMessages.WizardListSelectionPage_title);
		setDescription(PDEUIMessages.WizardListSelectionPage_desc);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.pde.internal.ui.wizards.WizardListSelectionPage#createControl(org.eclipse.swt.widgets.Composite)
	 */
	public void createControl(Composite parent) {
		super.createControl(parent);
		PlatformUI.getWorkbench().getHelpSystem().setHelp(getControl(), IHelpContextIds.NEW_PROJECT_CODE_GEN_PAGE);
	}

	public void createAbove(Composite container, int span) {
		fUseTemplate = new Button(container, SWT.CHECK);
		fUseTemplate.setText(PDEUIMessages.WizardListSelectionPage_label);
		GridData gd = new GridData();
		gd.horizontalSpan = span;
		fUseTemplate.setLayoutData(gd);
		
		fUseTemplate.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				wizardSelectionViewer.getControl().setEnabled(fUseTemplate.getSelection());
				if (!fUseTemplate.getSelection())
					setDescription(""); //$NON-NLS-1$
				setDescriptionEnabled(fUseTemplate.getSelection());
				getContainer().updateButtons();
			}
		});
	}

	protected void initializeViewer() {
		wizardSelectionViewer.addFilter(new WizardFilter());
		if (getInitialTemplateId() != null)
			selectInitialTemplate();
		
		// no template by default
		fUseTemplate.setSelection(false);
		
		wizardSelectionViewer.getControl().setEnabled(fUseTemplate.getSelection());
		setDescriptionEnabled(fUseTemplate.getSelection());
	}

	private void selectInitialTemplate() {
		selectTemplate(getInitialTemplateId());
	}
	public void selectTemplate(String templateID) {
		Object[] children = wizardElements.getChildren();
		for (int i = 0; i < children.length; i++) {
			WizardElement welement = (WizardElement) children[i];
			if (welement.getID().equals(templateID)) {
				wizardSelectionViewer.setSelection(new StructuredSelection(welement), true);
				setSelectedNode(createWizardNode(welement));
				setDescriptionText(welement.getDescription());
				break;
			}
		}
	}

	protected IWizardNode createWizardNode(WizardElement element) {
		return new WizardNode(this, element) {
			public IBaseProjectWizard createWizard() throws CoreException {
				IProjectContentWizard wizard = (IProjectContentWizard) wizardElement.createExecutableExtension();
				wizard.init(fContext);
				return wizard;
			}
		};
	//	return null;
	}

	public IProjectContentWizard getSelectedWizard() {
		if (fUseTemplate.getSelection())
			return super.getSelectedWizard();
		return null;
	}

	public boolean isPageComplete() {

		return  (!fUseTemplate.getSelection())||(fUseTemplate.getSelection()  && getSelectedNode() != null);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.wizard.WizardSelectionPage#canFlipToNextPage()
	 */
	public boolean canFlipToNextPage() {
		IStructuredSelection ssel = (IStructuredSelection) wizardSelectionViewer.getSelection();
		return fUseTemplate.getSelection() && ssel != null && !ssel.isEmpty();
	}

	/**
	 * @return Returns the fInitialTemplateId.
	 */
	public String getInitialTemplateId() {
		return fInitialTemplateId;
	}

	/**
	 * @param initialTemplateId The fInitialTemplateId to set.
	 */
	public void setInitialTemplateId(String initialTemplateId) {
		fInitialTemplateId = initialTemplateId;
	}

	public void setVisible(boolean visible) {
		if (visible) {
			//fContentPage.updateData();
			//fUseTemplate.setSelection(true);
			fUseTemplate.setEnabled(true);
			//wizardSelectionViewer.getControl().setEnabled(false);
			
			
			wizardSelectionViewer.refresh();
		}
		super.setVisible(visible);
	}

	/**
	 * @return Returns <code>false</code> if the user requires a template and no Template is available,
	 * and <code>true</code> otherwise.
	 */
	public boolean setPageComplete() {
		if(! fUseTemplate.getSelection()) return true;
		else if (wizardSelectionViewer != null) {
			wizardSelectionViewer.refresh();
			Object firstElement = wizardSelectionViewer.getElementAt(0);
			if (firstElement != null) {
				return true;
			}
		}
		return false;
	}
	
	public void setUseTemplate(boolean useTemplate){
		fUseTemplate.setSelection(useTemplate);
		wizardSelectionViewer.getControl().setEnabled(useTemplate);
		if (!useTemplate)
			setDescription(""); //$NON-NLS-1$
		setDescriptionEnabled(useTemplate);
		
		IWizardContainer container = getContainer();
		if(container.getCurrentPage() != null){
			container.updateButtons();
		}
	}
}

