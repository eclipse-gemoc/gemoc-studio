/*******************************************************************************
 * Copyright (c) 2013, 2017 Obeo. All Rights Reserved.
 *
 * This software and the attached documentation are the exclusive ownership
 * of its authors and was conceded to the profit of Obeo SARL.
 * This software and the attached documentation are protected under the rights
 * of intellectual ownership, including the section "Titre II  Droits des auteurs (Articles L121-1 L123-12)"
 * By installing this software, you acknowledge being aware of this rights and
 * accept them, and as a consequence you must:
 * - be in possession of a valid license of use conceded by Obeo only.
 * - agree that you have read, understood, and will comply with the license terms and conditions.
 * - agree not to do anything that could conflict with intellectual ownership owned by Obeo or its beneficiaries
 * or the authors of this software
 *
 * Should you not agree with these terms, you must stop to use this software and give it back to its legitimate owner.
 *
 *******************************************************************************/
package org.eclipse.gemoc.timeline.model;

import org.eclipse.gemoc.timeline.view.ITimelineListener;
import org.eclipse.gemoc.timeline.view.ITimelineProvider;

/**
 * Listener for {@link TimelineWindow} changes.
 * 
 * @author <a href="mailto:yvan.lussaud@obeo.fr">Yvan Lussaud</a>
 */
public interface ITimelineWindowListener extends ITimelineListener {

	/**
	 * Stub implementation.
	 * 
	 * @author <a href="mailto:yvan.lussaud@obeo.fr">Yvan Lussaud</a>
	 */
	class Stub extends ITimelineListener.Stub implements ITimelineWindowListener {

		@Override
		public void startChanged(int start) {
			// nothing to do here
		}

		@Override
		public void lengthChanged(int length) {
			// nothing to do here
		}

		@Override
		public void providerChanged(ITimelineProvider provider) {
			// nothing to do here
		}

	}

	/**
	 * Notifies the start has changed.
	 * 
	 * @param start
	 *            the start
	 */
	void startChanged(int start);

	/**
	 * Notifies the length has changed.
	 * 
	 * @param length
	 *            the length
	 */
	void lengthChanged(int length);

	/**
	 * Notifies the {@link ITimelineProvider} has changed.
	 * 
	 * @param provider
	 *            the {@link ITimelineProvider}
	 */
	void providerChanged(ITimelineProvider provider);

}
