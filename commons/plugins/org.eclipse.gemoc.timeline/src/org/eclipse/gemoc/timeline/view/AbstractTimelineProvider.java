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
package org.eclipse.gemoc.timeline.view;

import java.util.ArrayList;
import java.util.List;

/**
 * An abstract implementation of {@link ITimelineProvider} managing notifications to {@link ITimelineListener}
 * .
 * 
 * @author <a href="mailto:yvan.lussaud@obeo.fr">Yvan Lussaud</a>
 */
public abstract class AbstractTimelineProvider implements ITimelineProvider {

	/**
	 * The {@link List} of {@link ITimelineListener} to notify.
	 */
	private List<ITimelineListener> listeners = new ArrayList<ITimelineListener>();

	/**
	 * Notifies the start of the given branch has changed.
	 * 
	 * @param branch
	 *            the branch
	 * @param start
	 *            the new start
	 */
	public void notifyStartChanged(int branch, int start) {
		for (ITimelineListener listener : getListeners()) {
			listener.startChanged(branch, start);
		}
	}

	/**
	 * Notifies the end of the given branch has changed.
	 * 
	 * @param branch
	 *            the branch
	 * @param end
	 *            the new end
	 */
	public void notifyEndChanged(int branch, int end) {
		for (ITimelineListener listener : getListeners()) {
			listener.endChanged(branch, end);
		}
	}

	/**
	 * Notifies the text of the given branch has changed.
	 * 
	 * @param branch
	 *            the branch
	 * @param text
	 *            the new text
	 */
	public void notifyTextAtChanged(int branch, String text) {
		for (ITimelineListener listener : getListeners()) {
			listener.textAtChanged(branch, text);
		}
	}

	/**
	 * Notifies the number of possible steps at the given timeline index has changed.
	 * 
	 * @param branch
	 *            the branch
	 * @param index
	 *            the timeline index ([0..{@link ITimelineProvider#getMaxTimelineIndex() nbChoices}[)
	 * @param numberOfPossibleStep
	 *            the number of possibleSteps at the given timeline index
	 */
	public void notifyNumberOfPossibleStepsAtChanged(int branch, int index, int numberOfPossibleStep) {
		for (ITimelineListener listener : getListeners()) {
			listener.numberOfPossibleStepsAtChanged(branch, index, numberOfPossibleStep);
		}
	}

	/**
	 * Notifies the text for the given index of the timeline has changed.
	 * 
	 * @param branch
	 *            the branch
	 * @param index
	 *            the timeline index ([0..{@link ITimelineProvider#getMaxTimelineIndex() nbChoices}[)
	 * @param text
	 *            the text for the given index of the timeline
	 */
	public void notifyTextAtChanged(int branch, int index, String text) {
		for (ITimelineListener listener : getListeners()) {
			listener.textAtChanged(branch, index, text);
		}
	}

	/**
	 * Notifies the {@link Object} at the given possible step (timeline index and possible step index) has
	 * changed.
	 * 
	 * @param branch
	 *            the branch
	 * @param index
	 *            the timeline index ([0..{@link ITimelineProvider#getMaxTimelineIndex() nbChoices}[)
	 * @param possibleStep
	 *            the possible step index ([0..{@link ITimelineProvider#getNumberOfPossibleStepsAt(int)
	 *            nbPossibleSteps}[)
	 * @param object
	 *            the {@link Object} at the given possible step (timeline index and posible step index)
	 */
	public void notifyAtChanged(int branch, int index, int possibleStep, Object object) {
		for (ITimelineListener listener : getListeners()) {
			listener.atChanged(branch, index, possibleStep, object);
		}
	}

	/**
	 * Notifies the given possible step (timeline index and possible step index) has been selected or
	 * de-selected.
	 * 
	 * @param branch
	 *            the branch
	 * @param index
	 *            the timeline index ([0..{@link ITimelineProvider#getMaxTimelineIndex() nbChoices}[)
	 * @param possibleStep
	 *            the possible step index ([0..{@link ITimelineProvider#getNumberOfPossibleStepsAt(int)
	 *            nbPossibleSteps}[)
	 * @param selected
	 *            <code>true</code> if the possibleStep is now selected, <code>false</code> otherwise
	 */
	public void notifyIsSelectedChanged(int branch, int index, int possibleStep, boolean selected) {
		for (ITimelineListener listener : getListeners()) {
			listener.isSelectedChanged(branch, index, possibleStep, selected);
		}
	}

	/**
	 * Notifies the text for the given possible step (timeline index and possible step index) has changed.
	 * 
	 * @param branch
	 *            the branch
	 * @param index
	 *            the timeline index ([0..{@link ITimelineProvider#getMaxTimelineIndex() nbChoices}[)
	 * @param possibleStep
	 *            the possible step index ([0..{@link ITimelineProvider#getNumberOfPossibleStepsAt(int)
	 *            nbPossibleSteps}[)
	 * @param text
	 *            the text for the given possible step (timeline index and possible step index)
	 */
	public void notifyTextAtChanged(int branch, int index, int possibleStep, String text) {
		for (ITimelineListener listener : getListeners()) {
			listener.textAtChanged(branch, index, possibleStep, text);
		}
	}

	/**
	 * Notifies the following possible step index for the given possible step (timeline index and possible
	 * step index) has changed.
	 * 
	 * @param branch
	 *            the branch
	 * @param index
	 *            the timeline index ([0..{@link ITimelineProvider#getMaxTimelineIndex() nbChoices}[)
	 * @param possibleStep
	 *            the possible step index ([0..{@link ITimelineProvider#getNumberOfPossibleStepsAt(int)
	 *            nbPossibleSteps}[)
	 * @param followings
	 *            the following possible step for the given possible step (timeline index and possible step
	 *            index) [branch, possibleStep]
	 */
	public void notifyFollowingsChanged(int branch, int index, int possibleStep, int[][] followings) {
		for (ITimelineListener listener : getListeners()) {
			listener.followingsChanged(branch, index, possibleStep, followings);
		}
	}

	/**
	 * Notifies the preceding possible step index for the given possible step (timeline index and possible
	 * step index) has changed.
	 * 
	 * @param branch
	 *            the branch
	 * @param index
	 *            the timeline index ([0..{@link ITimelineProvider#getMaxTimelineIndex() nbChoices}[)
	 * @param possibleStep
	 *            the possible step index ([0..{@link ITimelineProvider#getNumberOfPossibleStepsAt(int)
	 *            nbPossibleSteps}[)
	 * @param precedings
	 *            the preceding possible step for the given possible step (timeline index and possible step
	 *            index) [branch, possibleStep]
	 */
	public void notifyPrecedingsChanged(int branch, int index, int possibleStep, int[][] precedings) {
		for (ITimelineListener listener : getListeners()) {
			listener.precedingsChanged(branch, index, possibleStep, precedings);
		}
	}

	/**
	 * Gets the {@link List} of {@link ITimelineListener}.
	 * 
	 * @return the {@link List} of {@link ITimelineListener}
	 */
	private List<ITimelineListener> getListeners() {
		final List<ITimelineListener> l;
		synchronized(listeners) {
			l = new ArrayList<ITimelineListener>(listeners);
		}
		return l;
	}

	@Override
	public void addTimelineListener(ITimelineListener listener) {
		synchronized(listeners) {
			listeners.add(listener);
		}
	}

	@Override
	public void removeTimelineListener(ITimelineListener listener) {
		synchronized(listeners) {
			listeners.remove(listener);
		}
	}

}
