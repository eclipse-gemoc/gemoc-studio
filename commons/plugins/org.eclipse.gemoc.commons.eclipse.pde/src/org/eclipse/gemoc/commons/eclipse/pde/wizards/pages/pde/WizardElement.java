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

import java.util.MissingResourceException;
import java.util.ResourceBundle;

import org.eclipse.core.runtime.*;
import org.eclipse.pde.internal.ui.PDEPlugin;
import org.eclipse.pde.internal.ui.elements.NamedElement;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IPluginContribution;
import org.osgi.framework.Bundle;

import org.eclipse.gemoc.commons.eclipse.pde.wizards.pages.pde.WizardElement;

/**
 * Handle to a configuration element representing a wizard class.
 */
public class WizardElement extends NamedElement implements IPluginContribution {

	
	String id;
	String className;
	
	public static final String ATT_NAME = "name"; //$NON-NLS-1$
	public static final String TAG_DESCRIPTION = "description"; //$NON-NLS-1$
	public static final String ATT_ICON = "icon"; //$NON-NLS-1$
	public static final String ATT_ID = "id"; //$NON-NLS-1$
	public static final String ATT_CLASS = "class"; //$NON-NLS-1$
	public static final String ATT_TEMPLATE = "template"; //$NON-NLS-1$
	public static final String ATT_POINT = "point"; //$NON-NLS-1$
	public static final String ATT_CATEGORY = "category"; //$NON-NLS-1$
	public static final String ATT_TARGETPLUGINID = "targetPluginId"; //$NON-NLS-1$

	private String description;
	protected IConfigurationElement configurationElement;
	private IConfigurationElement template;

	
	public WizardElement(IConfigurationElement config) {
		super(config.getAttribute(ATT_NAME));
		id = config.getAttribute(ATT_ID);
		className = config.getAttribute(ATT_CLASS);
		this.configurationElement = config;
	}

	public Object createExecutableExtension() throws CoreException {
		return configurationElement.createExecutableExtension(ATT_CLASS);
	}

	public IConfigurationElement getConfigurationElement() {
		return configurationElement;
	}

	public String getDescription() {
		if (description == null) {
			IConfigurationElement[] children = configurationElement.getChildren(TAG_DESCRIPTION);
			if (children.length > 0) {
				//description = expandDescription(children[0].getValue());
				description = children[0].getValue();
			}
		}
		return description;
	}

	public WizardElement(String name,  String id,
			String className, String description) {
		super(name);
		this.id = id;
		this.className = className;
		this.description = description;
	}

	

	public String getID() {
		return id;
	}

	public void setImage(Image image) {
		this.image = image;
	}

	public String getTemplateId() {
		return configurationElement.getAttribute(ATT_TEMPLATE);
	}

	public boolean isTemplate() {
		return getTemplateId() != null;
	}

	public IConfigurationElement getTemplateElement() {
		if (template == null)
			template = findTemplateElement();
		return template;
	}

	private IConfigurationElement findTemplateElement() {
		String templateId = getTemplateId();
		if (templateId == null)
			return null;
		IConfigurationElement[] templates = Platform.getExtensionRegistry().getConfigurationElementsFor("fr.inria.diverse.commons.eclipse.pde.templates"); //$NON-NLS-1$
		for (int i = 0; i < templates.length; i++) {
			IConfigurationElement template = templates[i];
			String id = template.getAttribute("id"); //$NON-NLS-1$
			if (id != null && id.equals(templateId))
				return template;
		}
		return null;
	}

	public String getContributingId() {
		IConfigurationElement tel = getTemplateElement();
		return (tel == null) ? null : tel.getAttribute("contributingId"); //$NON-NLS-1$
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IPluginContribution#getLocalId()
	 */
	public String getLocalId() {
		return getID();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IPluginContribution#getPluginId()
	 */
	public String getPluginId() {
		return null;
	}

	public static WizardElement create(IConfigurationElement config) {
		String name = config.getAttribute(ATT_NAME);
		String id = config.getAttribute(ATT_ID);
		String className = config.getAttribute(ATT_CLASS);
		if (name == null || id == null || className == null)
			return null;
		WizardElement element = new WizardElement(config);
		String imageName = config.getAttribute(ATT_ICON);
		if (imageName != null) {
			String pluginID = config.getNamespaceIdentifier();
			Image image = PDEPlugin.getDefault().getLabelProvider().getImageFromPlugin(pluginID, imageName);
			element.setImage(image);
		}
		return element;
	}

}
