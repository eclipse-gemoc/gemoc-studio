/*******************************************************************************
 * Copyright (c)  2009 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.gemoc.gemoc_studio.branding.discovery.wizards;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.amalgam.discovery.InstallableComponent;
import org.eclipse.amalgam.discovery.ui.common.internal.DiscoveryUiUtil;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.gemoc.gemoc_studio.branding.Activator;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableContext;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.widgets.Shell;

public class Installer {
    public static boolean install(Collection<InstallableComponent> descriptors, IRunnableContext context) {
    	final PrepareInstallProfileJob job = new PrepareInstallProfileJob(descriptors);
        try {
            context.run(true, true, job);
        } catch (InvocationTargetException e) {
            IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, NLS.bind(Messages.ConnectorDiscoveryWizard_installProblems, new Object[] { e.getCause().getMessage() }), e.getCause());
            Activator.getDefault().getLog().log(status);
            
            displayStatus(DiscoveryUiUtil.getShell(), Messages.ConnectorDiscoveryWizard_cannotInstall, status, true);
            return false;
        } catch (InterruptedException e) {
            // canceled
            return false;
        }
        return true;
    }
    
    
    public static void displayStatus(Shell shell, final String title, final IStatus status, boolean showLinkToErrorLog) {


        String message = getFullMessage(status);
        
        if (showLinkToErrorLog) {
            message += "  \n see error log";
        }
        switch (status.getSeverity()) {
        case IStatus.CANCEL:
        case IStatus.INFO:
        	DiscoveryUiUtil.createDialog(shell, title, message, MessageDialog.INFORMATION).open();
            break;
        case IStatus.WARNING:
        	DiscoveryUiUtil.createDialog(shell, title, message, MessageDialog.WARNING).open();
            break;
        case IStatus.ERROR:
        default:
        	DiscoveryUiUtil.createDialog(shell, title, message, MessageDialog.ERROR).open();
            break;
        }

    }
    
	public static String getFullMessage(IStatus status) {
		if(status.isMultiStatus()) {
			StringBuilder sb = new StringBuilder();
			sb.append(status.getMessage());
			for ( IStatus subStatus : status.getChildren()) {
				sb.append("\n");
				sb.append(getFullMessage(subStatus));
			}
			return sb.toString();
		} else {
			return status.getMessage();
		}
	}
    
}
