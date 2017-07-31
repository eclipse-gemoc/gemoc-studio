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

/**
 * Listener for {@link ITimelineProvider} changes.
 * 
 * @author <a href="mailto:yvan.lussaud@obeo.fr">Yvan Lussaud</a>
 */
public interface ITimelineListener {

	/**
	 * Stub implementation.
	 * 
	 * @author <a href="mailto:yvan.lussaud@obeo.fr">Yvan Lussaud</a>
	 */
	class Stub implements ITimelineListener {

		@Override
		public void startChanged(int branch, int start) {
			// nothing to do here
		}

		@Override
		public void endChanged(int branch, int end) {
			// nothing to do here
		}

		@Override
		public void textAtChanged(int branch, String text) {
			// nothing to do here
		}

		@Override
		public void numberOfPossibleStepsAtChanged(int branch, int index, int numberOfpossibleStep) {
			// nothing to do here
		}

		@Override
		public void textAtChanged(int branch, int index, String text) {
			// nothing to do here
		}

		@Override
		public void atChanged(int branch, int index, int possibleStep, Object object) {
			// nothing to do here
		}

		@Override
		public void isSelectedChanged(int branch, int index, int possibleStep, boolean selected) {
			// nothing to do here
		}

		@Override
		public void textAtChanged(int branch, int index, int possibleStep, String text) {
			// nothing to do here
		}

		@Override
		public void followingsChanged(int branch, int index, int possibleStep, int[][] followings) {
			// nothing to do here
		}

		@Override
		public void precedingsChanged(int branch, int index, int possibleStep, int[][] precedings) {
			// nothing to do here
		}

	}

	/**
	 * Notifies the start of the given branch has changed.
	 * 
	 * @param branch
	 *            the branch
	 * @param start
	 *            the new start
	 */
	void startChanged(int branch, int start);

	/**
	 * Notifies the end of the given branch has changed.
	 * 
	 * @param branch
	 *            the branch
	 * @param end
	 *            the new end
	 */
	void endChanged(int branch, int end);

	/**
	 * Notifies the text of the given branch has changed.
	 * 
	 * @param branch
	 *            the branch
	 * @param text
	 *            the new text
	 */
	void textAtChanged(int branch, String text);

	/**
	 * Notifies the number of possible steps at the given timeline index has changed.
	 * 
	 * @param branch
	 *            the branch
	 * @param index
	 *            the timeline index ([0..{@link ITimelineProvider#getMaxTimelineIndex() nbChoices}[)
	 * @param numberOfpossibleStep
	 *            the number of possible steps at the given timeline index
	 */
	void numberOfPossibleStepsAtChanged(int branch, int index, int numberOfpossibleStep);

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
	void textAtChanged(int branch, int index, String text);

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
	 *            the {@link Object} at the given possible step (timeline index and possible step index)
	 */
	void atChanged(int branch, int index, int possibleStep, Object object);

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
	 *            <code>true</code> if the possible step is now selected, <code>false</code> otherwise
	 */
	void isSelectedChanged(int branch, int index, int possibleStep, boolean selected);

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
	void textAtChanged(int branch, int index, int possibleStep, String text);

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
	void followingsChanged(int branch, int index, int possibleStep, int[][] followings);

	/**
	 * Notifies the preceding possible step index for the given possible step (timeline index and possible
	 * step index) has changed.
	 * 
	 * @param index
	 *            the timeline index ([0..{@link ITimelineProvider#getMaxTimelineIndex() nbChoices}[)
	 * @param possibleStep
	 *            the possible step index ([0..{@link ITimelineProvider#getNumberOfPossibleStepsAt(int)
	 *            nbPossibleSteps}[)
	 * @param branch
	 *            the branch
	 * @param precedings
	 *            the precedings possible step for the given possible step (timeline index and possible step
	 *            index) [branch, possibleStep]
	 */
	void precedingsChanged(int branch, int index, int possibleStep, int[][] precedings);

}
