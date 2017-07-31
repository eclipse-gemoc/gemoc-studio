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

import org.eclipse.ui.IViewPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;

public class ViewHelper {

	
	/***
	 * Will look after the view.
	 * If not found, will try to show and look for it.
	 * If showing view not possible, return null.
	 * @param viewId
	 * @return The view part if found or null otherwise
	 */
	@SuppressWarnings("unchecked")
	public static <ViewType> ViewType retrieveView(String viewId) 
	{
		IViewPart viewPart = ViewHelper.retrieveViewPart(viewId, false);
		ViewType view = null;
		try {
			view = (ViewType)viewPart;
		} 
		catch(Exception e) {
			
		}
		return view;
	}
	
	/***
	 * Will look after the view.
	 * If not found, will try to show and focus on it.
	 * If showing view not possible, return null.
	 * @param viewId
	 * @return The view part if found or null otherwise
	 */
	public static <ViewType> ViewType showView(String viewId) 
	{
		IViewPart viewPart = ViewHelper.retrieveViewPart(viewId, true);
		ViewType view = null;
		try {
			view = (ViewType)viewPart;
		} 
		catch(Exception e) {
			
		}
		return view;
	}

	
	/***
	 * Will look after the view.
	 * If not found, will try to show and look for it.
	 * If showing view not possible, return null.
	 * @param viewId
	 * @return The view part if found or null otherwise
	 */
	public static IViewPart retrieveViewPart(final String viewId, final boolean forceFocus) 
	{
		RetrieveViewPartRunnable runnable = new RetrieveViewPartRunnable(viewId, forceFocus);
		PlatformUI.getWorkbench()
			.getDisplay()
			.syncExec(runnable);
		return runnable.getViewPart();		
	}
	
	private static class RetrieveViewPartRunnable implements Runnable 
	{

		public RetrieveViewPartRunnable(String viewId, boolean forceFocus)
		{
			_viewId = viewId;
			_forceFocus = forceFocus;
		}
		
		private boolean _forceFocus = false;
		
		private String _viewId;
		private IViewPart _viewPart = null;
		public IViewPart getViewPart()
		{
			return _viewPart;
		}
		
		@Override
		public void run() {
			_viewPart = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().findView(_viewId);
			if (_viewPart == null || _forceFocus) 
			{
				try {
					_viewPart = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().showView(_viewId);
				} catch (PartInitException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
	
	
}
