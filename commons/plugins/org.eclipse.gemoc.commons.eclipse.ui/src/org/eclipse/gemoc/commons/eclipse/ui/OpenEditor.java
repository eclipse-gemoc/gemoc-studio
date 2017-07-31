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
package org.eclipse.gemoc.commons.eclipse.ui;

import java.io.File;
import java.util.List;

import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;
import org.eclipse.gemoc.commons.eclipse.core.resources.FileFinderVisitor;
import org.eclipse.gemoc.commons.eclipse.ui.dialogs.SelectAnyIFileDialog;

public class OpenEditor {

	public static void openManifestForProject(IProject project) {
		File fileToOpen = new File(project.getFile("META-INF/MANIFEST.MF")
				.getLocation().toOSString());
		if (fileToOpen.exists() && fileToOpen.isFile()) {
			IFileStore fileStore = EFS.getLocalFileSystem().getStore(
					fileToOpen.toURI());
			IWorkbenchPage page = PlatformUI.getWorkbench()
					.getActiveWorkbenchWindow().getActivePage();

			try {
				IDE.openEditorOnFileStore(page, fileStore);
			} catch (PartInitException e) {
				// Put your exception handler here if you wish to
			}
		} else {
			// Do something if the file does not exist
		}
	}
	public static void openIFile(IFile iFile) {
		File fileToOpen = new File(iFile.getLocation().toOSString());
		openFile(fileToOpen);
	}
	public static void openFile(File file) {
		if (file.exists() && file.isFile()) {
			IFileStore fileStore = EFS.getLocalFileSystem().getStore(
					file.toURI());
			IWorkbenchPage page = PlatformUI.getWorkbench()
					.getActiveWorkbenchWindow().getActivePage();

			try {
				IDE.openEditorOnFileStore(page, fileStore);
			} catch (PartInitException e) {
				// Put your exception handler here if you wish to
			}
		} else {
			// Do something if the file does not exist
		}
	}
	
	
	
	/**
	 * Open the only solution if only one file has the correct extension
	 * Otherwise invite to select the file to open
	 * @param project
	 * @param fileExtension
	 */
	public static void openPossibleFileWithExtensionInProject(IProject project, String fileExtension) {
		FileFinderVisitor finder = new FileFinderVisitor(fileExtension);
		try {
			project.accept(finder);
			List<IFile> list =finder.getFiles();
			if(list.size() == 1) {
				openIFile(list.get(0));
			}
			else{
				openPossibleFileInProject(project,"*."+fileExtension);
			}
		} catch (CoreException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	public static void openPossibleFileInProject(IProject project, String searchedFilePattern) {			
		
		// search file to open in project
		SelectAnyIFileDialog fileFinderDialog = new SelectAnyIFileDialog(project);
		
		fileFinderDialog.setPattern(searchedFilePattern);
		if (fileFinderDialog.open() == Dialog.OK) {
			openIFile((IFile) fileFinderDialog.getResult()[0]);
		}
		
		
		
	}
}
