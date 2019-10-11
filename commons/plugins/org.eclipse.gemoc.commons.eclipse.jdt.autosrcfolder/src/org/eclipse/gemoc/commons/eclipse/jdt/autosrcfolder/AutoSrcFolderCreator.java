package org.eclipse.gemoc.commons.eclipse.jdt.autosrcfolder;

import org.eclipse.core.internal.resources.ResourceException;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IMarkerDelta;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.ui.preferences.ScopedPreferenceStore;

/**
 * Monitors the workspace to create all missing source folder in JDT projects.
 * 
 * @author Erwan Bousse
 *
 */
public class AutoSrcFolderCreator {

	private static final String JDT_BUILDPATH_MARKER_TYPE = "org.eclipse.jdt.core.buildpath_problem";
	private static final int MISSINGSRC_MARKER_ID = 964;
	private static final String JDT_MARKER_ID_ATTRIBUTE = "id";
	private static final String JDT_MARKER_MESSAGE_ATTRIBUTE = "message";

	private static final String JOBMESSAGE = "Creating missing source folders.";
	private static final String ERRORMESSAGE = "An error occured while trying to create missing source folders (see stack trace in the console).";
	public static final String PLUGINID = "org.eclipse.gemoc.commons.eclipse.jdt.autosrcfolder";

	private IResourceChangeListener listener;
	private IWorkspace workspace;

	public static final IPreferenceStore preferenceStore = new ScopedPreferenceStore(InstanceScope.INSTANCE, PLUGINID);
	public static final String ENABLE_KEY = "org.eclipse.gemoc.commons.eclipse.jdt.autosrcfolder_enable";

	public static boolean isEnabled() {
		return preferenceStore.getBoolean(ENABLE_KEY);
	}

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

	private void realStart() {

		if (listener == null) {

			// Getting workspace
			workspace = ResourcesPlugin.getWorkspace();

			// Try to fix existing problems on startup
			Job j = new Job(JOBMESSAGE) {

				@Override
				protected IStatus run(IProgressMonitor monitor) {

					for (IProject p : workspace.getRoot().getProjects()) {
						try {
							for (IMarker m : p.findMarkers(null, true, 1)) {
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

			// Add listener to fix problems when they pop up
			listener = new IResourceChangeListener() {
				public void resourceChanged(IResourceChangeEvent event) {
					Job j = new Job(JOBMESSAGE) {
						@Override
						protected IStatus run(IProgressMonitor monitor) {
							IMarkerDelta[] markers = event.findMarkerDeltas(null, true);
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
			workspace.addResourceChangeListener(listener);
		}
	}

	public void stop() {
		if (listener != null) {
			workspace.removeResourceChangeListener(listener);
			listener = null;
		}
	}

	private static void handleMarkerDelta(IMarkerDelta marker, IProgressMonitor monitor) throws CoreException {
		if (marker.getKind() != IResourceDelta.REMOVED) {
			if (marker.getType().equals(JDT_BUILDPATH_MARKER_TYPE)) {
				if ((Integer) marker.getAttribute(JDT_MARKER_ID_ATTRIBUTE) == MISSINGSRC_MARKER_ID) {
					String message = (String) marker.getAttribute(JDT_MARKER_MESSAGE_ATTRIBUTE);
					handleMessage((IProject) (marker.getResource()), message, monitor);
				}
			}
		}
	}

	private static void handleMarker(IMarker marker, IProgressMonitor monitor) throws CoreException {
		if (marker.getType().equals(JDT_BUILDPATH_MARKER_TYPE)) {
			if ((Integer) marker.getAttribute(JDT_MARKER_ID_ATTRIBUTE) == MISSINGSRC_MARKER_ID) {
				String message = (String) marker.getAttribute(JDT_MARKER_MESSAGE_ATTRIBUTE);
				handleMessage((IProject) (marker.getResource()), message, monitor);
			}
		}
	}

	private static void handleMessage(IProject project, String message, IProgressMonitor monitor) throws CoreException {
		String srcFolderName = findSrcFolderName(message);
		IFolder srcFolder = project.getFolder(srcFolderName);
		if (!srcFolder.exists()) {
			try {
				project.getFolder(srcFolderName).create(true, true, monitor);
			} catch (ResourceException e) {
				// Already exists, nothing to do
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
