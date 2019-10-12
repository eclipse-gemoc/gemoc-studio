package org.eclipse.gemoc.commons.eclipse.jdt.autosrcfolder;

import java.text.MessageFormat;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IMarkerDelta;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.jdt.core.IJavaModelMarker;
import org.eclipse.jdt.core.IJavaModelStatusConstants;
import org.eclipse.jdt.internal.core.util.Messages;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.ui.preferences.ScopedPreferenceStore;

/**
 * Monitors the workspace to always create all missing source folders in JDT
 * projects.
 * 
 * @author Erwan Bousse
 *
 */
@SuppressWarnings("restriction")
public class AutoSrcFolderCreator {

	public static final String PLUGINID = "org.eclipse.gemoc.commons.eclipse.jdt.autosrcfolder";
	public static final String ENABLE_KEY = "org.eclipse.gemoc.commons.eclipse.jdt.autosrcfolder_enable";
	public static final IPreferenceStore preferenceStore = new ScopedPreferenceStore(InstanceScope.INSTANCE, PLUGINID);

	private static final String JOBMESSAGE = "Creating missing source folders.";
	private static final String ERRORMESSAGE = "An error occured while trying to create missing source folders (see stack trace in the console).";

	private IResourceChangeListener listener;

	/**
	 * If the checkbox in the preferences is ticked, enables the automatic missing
	 * source folder creation. Registers a listener to react when the checkbox in
	 * the Eclipse preferences is ticked.
	 */
	public void start() {
		preferenceStore.setDefault(ENABLE_KEY, true);
		preferenceStore.addPropertyChangeListener(new IPropertyChangeListener() {
			@Override
			public void propertyChange(PropertyChangeEvent event) {
				if (event.getProperty().equals(ENABLE_KEY)) {
					if ((Boolean) event.getNewValue()) {
						realStart();
					} else {
						stop();
					}
				}
			}
		});

		if (isEnabled()) {
			realStart();
		}
	}

	private static boolean isEnabled() {
		return preferenceStore.getBoolean(ENABLE_KEY);
	}

	private void realStart() {

		if (listener == null) {
			// Try to fix existing missing source folder problems when the plugin is started
			Job j = new Job(JOBMESSAGE) {

				@Override
				protected IStatus run(IProgressMonitor monitor) {
					for (IProject p : ResourcesPlugin.getWorkspace().getRoot().getProjects()) {
						try {
							for (IMarker m : p.findMarkers(IJavaModelMarker.BUILDPATH_PROBLEM_MARKER, false, 0)) {
								AutoSrcFolderCreator.handleMarker(m, monitor);
							}
						} catch (CoreException e) {
							e.printStackTrace();
							return new Status(Status.ERROR, PLUGINID, ERRORMESSAGE);
						}
					}
					return Status.OK_STATUS;
				}

			};
			j.schedule();

			// Add a workspace listener to fix missing source folder problems
			// when they appear
			listener = new IResourceChangeListener() {
				public void resourceChanged(IResourceChangeEvent event) {
					Job j = new Job(JOBMESSAGE) {
						@Override
						protected IStatus run(IProgressMonitor monitor) {
							IMarkerDelta[] markers = event.findMarkerDeltas(IJavaModelMarker.BUILDPATH_PROBLEM_MARKER,
									false);
							for (IMarkerDelta m : markers) {
								try {
									AutoSrcFolderCreator.handleMarkerDelta(m, monitor);
								} catch (CoreException e) {
									e.printStackTrace();
									return new Status(Status.ERROR, PLUGINID, ERRORMESSAGE);
								}
							}
							return Status.OK_STATUS;
						}
					};
					j.schedule();

				}
			};
			ResourcesPlugin.getWorkspace().addResourceChangeListener(listener);
		}
	}

	private void stop() {
		if (listener != null) {
			ResourcesPlugin.getWorkspace().removeResourceChangeListener(listener);
			listener = null;
		}
	}

	private static void handleMarkerDelta(IMarkerDelta marker, IProgressMonitor monitor) throws CoreException {
		if (marker.getKind() != IResourceDelta.REMOVED) {
			if ((Integer) marker.getAttribute(IJavaModelMarker.ID) == IJavaModelStatusConstants.INVALID_CLASSPATH) {
				String message = (String) marker.getAttribute(IMarker.MESSAGE);
				handleMessage((IProject) (marker.getResource()), message, monitor);
			}
		}
	}

	private static void handleMarker(IMarker marker, IProgressMonitor monitor) throws CoreException {
		if ((Integer) marker.getAttribute(IJavaModelMarker.ID) == IJavaModelStatusConstants.INVALID_CLASSPATH) {
			String message = (String) marker.getAttribute(IMarker.MESSAGE);
			handleMessage((IProject) (marker.getResource()), message, monitor);
		}
	}

	private static void handleMessage(IProject project, String message, IProgressMonitor monitor) throws CoreException {

		// Reconstruct the missing source folder error message using JDT constants,
		// replacing the yet unknown source folder path by "UNKNOWN"
		String expectedErrorMessage = MessageFormat.format(Messages.classpath_unboundSourceFolder, "UNKNOWN",
				project.getName());

		// Remove the second part of the expected error message related to the
		// path of the missing source folder (currently "UNKNOWN")
		String expectedErrorMessageFirstPart = expectedErrorMessage.split(":")[0];

		// Check that the processed error is indeed a missing source folder error
		if (message.startsWith(expectedErrorMessageFirstPart)) {
			String srcFolderName = findSrcFolderName(message);
			IFolder srcFolder = project.getFolder(srcFolderName);
			if (!srcFolder.exists()) {
				try {
					project.getFolder(srcFolderName).create(true, true, monitor);
				} catch (CoreException e) {
					// If we don't successfully create the folder (most likely because it is already
					// present despite the check), we silently fail.
				}
			}
		}
	}

	private static String findSrcFolderName(String message) {
		boolean found = false;
		int index = message.length() - 1;
		while (!found) {
			index--;
			if (message.charAt(index) == '\'') {
				found = true;
			}
		}
		String srcFolderName = message.substring(index + 1, message.length() - 1);
		return srcFolderName;
	}

}
