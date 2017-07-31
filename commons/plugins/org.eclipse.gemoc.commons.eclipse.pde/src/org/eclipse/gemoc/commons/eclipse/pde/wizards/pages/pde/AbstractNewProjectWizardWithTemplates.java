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

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.gemoc.commons.eclipse.pde.wizards.pages.pde.ui.BaseProjectWizardFields;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.pde.internal.ui.PDEPlugin;
import org.eclipse.pde.internal.ui.elements.ElementList;
import org.eclipse.swt.graphics.Image;

public abstract class AbstractNewProjectWizardWithTemplates extends Wizard{

	public static final String PLUGIN_POINT = "projectContent"; //$NON-NLS-1$
	public static final String TAG_WIZARD = "wizard"; //$NON-NLS-1$
	
	public 	TemplateListSelectionPage templateSelectionPage;
	
	
	
	public TemplateListSelectionPage getTemplateListSelectionPage(BaseProjectWizardFields context) {
		if(templateSelectionPage == null){
			templateSelectionPage = new TemplateListSelectionPage(getAvailableCodegenWizards(), context, "&Available Templates:");
		}
		return templateSelectionPage;
	}
	
	protected WizardElement createWizardElement(IConfigurationElement config) {
		String name = config.getAttribute(WizardElement.ATT_NAME);
		String id = config.getAttribute(WizardElement.ATT_ID);
		String className = config.getAttribute(WizardElement.ATT_CLASS);
		if (name == null || id == null || className == null)
			return null;
		WizardElement element = new WizardElement(config);
		element.id = id;
		String imageName = config.getAttribute(WizardElement.ATT_ICON);
		if (imageName != null) {
			String pluginID = config.getNamespaceIdentifier();
			Image image = PDEPlugin.getDefault().getLabelProvider().getImageFromPlugin(pluginID, imageName);
			element.setImage(image);
		}
		return element;
	} 
	public ElementList getAvailableCodegenWizards() {
		ElementList wizards = new ElementList("CodegenWizards"); //$NON-NLS-1$
		IExtensionRegistry registry = Platform.getExtensionRegistry();
		IExtensionPoint point = registry.getExtensionPoint(org.eclipse.gemoc.commons.eclipse.pde.Activator.PLUGIN_ID, PLUGIN_POINT);
		if (point == null)
			return wizards;
		IExtension[] extensions = point.getExtensions();
		for (int i = 0; i < extensions.length; i++) {
			IConfigurationElement[] elements = extensions[i].getConfigurationElements();
			for (int j = 0; j < elements.length; j++) {
				if (elements[j].getName().equals(TAG_WIZARD)) {
					String targetPluginId = elements[j].getAttribute(WizardElement.ATT_TARGETPLUGINID);
					if( targetPluginId == null || targetPluginId.equals(getTargetPluginId())){
						WizardElement element = createWizardElement(elements[j]);
						if (element != null) {
							wizards.add(element);
						}
					}
				}
			}
		}
		return wizards;
	}
	
	/**
	 * @return ID of the plugin that will receive the templates. Usually this is the plugin ID of the main wizard. 
	 */
	public abstract String getTargetPluginId();
}
