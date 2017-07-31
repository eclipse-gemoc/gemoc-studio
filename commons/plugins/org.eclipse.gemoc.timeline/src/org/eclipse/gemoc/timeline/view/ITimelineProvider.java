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
 * A timeline provider.
 * 
 * @author <a href="mailto:yvan.lussaud@obeo.fr">Yvan Lussaud</a>
 */
public interface ITimelineProvider {

	/**
	 * Gets the number of branches.
	 * 
	 * @return the number of branches
	 */
	int getNumberOfBranches();

	/**
	 * Gets the start index of the branch.
	 * 
	 * @param branch
	 *            the branch index [0..{@link ITimelineProvider#getNumberOfBranches() nbBranches}[
	 * @return the start index [{@link ITimelineProvider#getStart(int) originalBranchStart}..
	 *         {@link ITimelineProvider#getEnd(int) originalBranchEnd}[
	 */
	int getStart(int branch);

	/**
	 * Gets the end index of the branch.
	 * 
	 * @param branch
	 *            the branch index [0..{@link ITimelineProvider#getNumberOfBranches() nbBranches}[
	 * @return the end index ]{@link ITimelineProvider#getStart(int) branchStart}..{@link Integer#MAX_VALUE
	 *         MaxInteger}]
	 */
	int getEnd(int branch);

	/**
	 * Gets the text for the given branch.
	 * 
	 * @param branch
	 *            the branch index [0..{@link ITimelineProvider#getNumberOfBranches() nbBranches}[
	 * @return the text for the given branch
	 */
	String getTextAt(int branch);

	/**
	 * Gets the number of possible steps at the given timeline index in the given branch.
	 * 
	 * @param branch
	 *            the branch index [0..{@link ITimelineProvider#getNumberOfBranches() nbBranches}[
	 * @param index
	 *            the timeline index [{@link ITimelineProvider#getStart(int) branchStart}..
	 *            {@link ITimelineProvider#getEnd(int) branchEnd}[
	 * @return the number of possible steps at the given timeline index in the given branch
	 */
	int getNumberOfPossibleStepsAt(int branch, int index);

	/**
	 * Gets the text for the given index of the timeline in the given branch.
	 * 
	 * @param branch
	 *            the branch index [0..{@link ITimelineProvider#getNumberOfBranches() nbBranches}[
	 * @param index
	 *            the timeline index [{@link ITimelineProvider#getStart(int) branchStart}..
	 *            {@link ITimelineProvider#getEnd(int) branchEnd}[
	 * @return the text for the given index of the timeline in the given branch
	 */
	String getTextAt(int branch, int index);

	/**
	 * Gets the selected possibleStep at the given timeline index in the given branch.
	 * 
	 * @param branch
	 *            the branch index [0..{@link ITimelineProvider#getNumberOfBranches() nbBranches}[
	 * @param index
	 *            the timeline index [{@link ITimelineProvider#getStart(int) branchStart}..
	 *            {@link ITimelineProvider#getEnd(int) branchEnd}[
	 * @return the selected possible step index ([0..
	 *         {@link ITimelineProvider#getNumberOfPossibleStepsAt(int, int) nbPossibleSteps}[) if any,
	 *         <code>-1</code> otherwise
	 */
	int getSelectedPossibleStep(int branch, int index);

	/**
	 * Gets the {@link Object} at the given possible step (timeline index and possible step index) in the
	 * given branch.
	 * 
	 * @param branch
	 *            the branch index [0..{@link ITimelineProvider#getNumberOfBranches() nbBranches}[
	 * @param index
	 *            the timeline index [{@link ITimelineProvider#getStart(int) branchStart}..
	 *            {@link ITimelineProvider#getEnd(int) branchEnd}[
	 * @param possibleStep
	 *            the possible step index [0..{@link ITimelineProvider#getNumberOfPossibleStepsAt(int, int)
	 *            nbPossibleSteps}[
	 * @return the {@link Object} at the given possible step (timeline index and possible step index) in the
	 *         given branch if any, <code>null</code> otherwise
	 */
	Object getAt(int branch, int index, int possibleStep);

	/**
	 * Gets the {@link Object} at the given possible step (timeline index) in the given branch.
	 * 
	 * @param branch
	 *            the branch index [0..{@link ITimelineProvider#getNumberOfBranches() nbBranches}[
	 * @param index
	 *            the timeline index [{@link ITimelineProvider#getStart(int) branchStart}..
	 *            {@link ITimelineProvider#getEnd(int) branchEnd}[
	 * @return the {@link Object} at the given possible step (timeline index) in the given branch if any,
	 *         <code>null</code> otherwise
	 */
	Object getAt(int branch, int index);

	/**
	 * Gets the text for the given possible step (timeline index and possible step index) in the given branch.
	 * 
	 * @param branch
	 *            the branch index [0..{@link ITimelineProvider#getNumberOfBranches() nbBranches}[
	 * @param index
	 *            the timeline index [{@link ITimelineProvider#getStart(int) branchStart}..
	 *            {@link ITimelineProvider#getEnd(int) branchEnd}[
	 * @param possibleStep
	 *            the possible step index [0..{@link ITimelineProvider#getNumberOfPossibleStepsAt(int, int)
	 *            nbPossibleSteps}[
	 * @return the text for the given possible step (timeline index and possibe step index) in the given
	 *         branch
	 */
	String getTextAt(int branch, int index, int possibleStep);

	/**
	 * Gets the following possible steps index for the given possible step (timeline index and possible step
	 * index).
	 * 
	 * @param branch
	 *            the branch index [0..{@link ITimelineProvider#getNumberOfBranches() nbBranches}[
	 * @param index
	 *            the timeline index [{@link ITimelineProvider#getStart(int) branchStart}..
	 *            {@link ITimelineProvider#getEnd(int) branchEnd}[
	 * @param possibleStep
	 *            the possible step index [0..{@link ITimelineProvider#getNumberOfPossibleStepsAt(int, int)
	 *            nbPossibleSteps}[
	 * @return the following possible steps for the given possible step (timeline index and possible step
	 *         index) [branch, possibleStep]
	 */
	int[][] getFollowings(int branch, int index, int possibleStep);

	/**
	 * Gets the preceding possible steps index for the given possible step (timeline index and possible step
	 * index).
	 * 
	 * @param branch
	 *            the branch index [0..{@link ITimelineProvider#getNumberOfBranches() nbBranches}[
	 * @param index
	 *            the timeline index [{@link ITimelineProvider#getStart(int) branchStart}..
	 *            {@link ITimelineProvider#getEnd(int) branchEnd}[
	 * @param possibleStep
	 *            the possible step index [0..{@link ITimelineProvider#getNumberOfPossibleStepsAt(int, int)
	 *            nbPossibleSteps}[
	 * @return the preceding possible steps for the given possible step (timeline index and possible step
	 *         index) [branch, possibleStep]
	 */
	int[][] getPrecedings(int branch, int index, int possibleStep);

	/**
	 * Gets the current branch index.
	 * 
	 * @return the current branch index
	 */
	int getCurrentBranch();

	/**
	 * Gets the current choice index in the {@link ITimelineProvider#getCurrentBranch() current branch}.
	 * 
	 * @return the current choice index in the {@link ITimelineProvider#getCurrentBranch() current branch}
	 */
	int getCurrentChoice();

	/**
	 * Gets the current possible step for the {@link ITimelineProvider#getCurrentBranch() current branch} and
	 * {@link ITimelineProvider#getCurrentChoice() current choice}.
	 * 
	 * @return the current possible step for the {@link ITimelineProvider#getCurrentBranch() current branch}
	 *         and {@link ITimelineProvider#getCurrentChoice() current choice}
	 */
	int getCurrentPossibleStep();

	/**
	 * Adds a {@link ITimelineListener}.
	 * 
	 * @param listener
	 *            the {@link ITimelineListener}
	 */
	void addTimelineListener(ITimelineListener listener);

	/**
	 * Removes a {@link ITimelineListener}.
	 * 
	 * @param listener
	 *            the {@link ITimelineListener}
	 */
	void removeTimelineListener(ITimelineListener listener);

}
