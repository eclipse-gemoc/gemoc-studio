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

import org.eclipse.gemoc.timeline.view.ITimelineProvider;

import java.util.ArrayList;
import java.util.List;

/**
 * A choice in time.
 * 
 * @author <a href="mailto:yvan.lussaud@obeo.fr">Yvan Lussaud</a>
 */
public final class Choice {

	/**
	 * Shift for the {@link PossibleStep#hashCode() hash code}.
	 */
	private static final int SHIFT = 8;

	/**
	 * The containing {@link TimelineWindow}.
	 */
	private final TimelineWindow timelineWindow;

	/**
	 * The branch index.
	 */
	private final int branch;

	/**
	 * The index in the owning {@link TimelineWindow}.
	 */
	private final int index;

	/**
	 * Constructor.
	 * 
	 * @param timelineWindow
	 *            the containing {@link TimelineWindow}
	 * @param branch
	 *            the branch index
	 * @param index
	 *            the index in the owning {@link TimelineWindow}
	 */
	public Choice(TimelineWindow timelineWindow, int branch, int index) {
		this.timelineWindow = timelineWindow;
		this.branch = branch;
		this.index = index;
	}

	/**
	 * Gets the containing {@link TimelineWindow}.
	 * 
	 * @return the containing {@link TimelineWindow}
	 */
	public TimelineWindow getTimelineWindow() {
		return timelineWindow;
	}

	/**
	 * Gets the {@link List} of {@link PossibleStep}.
	 * 
	 * @return the {@link List} of {@link PossibleStep}
	 */
	public List<PossibleStep> getPossibleSteps() {
		List<PossibleStep> res = new ArrayList<PossibleStep>();

		final ITimelineProvider provider = getTimelineWindow().getProvider();
		final int numberOfPossibleStepsAt = provider.getNumberOfPossibleStepsAt(branch, index);
		for (int i = 0; i < numberOfPossibleStepsAt; ++i) {
			res.add(new PossibleStep(getTimelineWindow(), branch, index, i));
		}

		return res;
	}

	/**
	 * Gets the index in the owning {@link Branch}.
	 * 
	 * @return the index in the owning {@link Branch}
	 */
	public int getIndex() {
		return index;
	}

	/**
	 * Gets the branch index.
	 * 
	 * @return the branch index
	 */
	public int getBranch() {
		return branch;
	}

	/**
	 * Gets the previous {@link Choice} in the {@link TimelineWindow}.
	 * 
	 * @return the previous {@link Choice} in the {@link TimelineWindow} if any, <code>null</code> otherwise
	 */
	public Choice getPreviousChoice() {
		final Choice res;
		if (index > getTimelineWindow().getProvider().getStart(branch)) {
			res = new Choice(getTimelineWindow(), branch, index - 1);
		} else {
			res = null;
		}
		return res;
	}

	/**
	 * Gets the next {@link Choice} in the {@link TimelineWindow}.
	 * 
	 * @return the next {@link Choice} in the {@link TimelineWindow} if any, <code>null</code> otherwise
	 */
	public Choice getNextChoice() {
		final Choice res;
		final int numberOfChoices = getTimelineWindow().getProvider().getEnd(branch);
		if (index < numberOfChoices - 1) {
			res = new Choice(getTimelineWindow(), branch, index + 1);
		} else {
			res = null;
		}
		return res;
	}

	@Override
	public int hashCode() {
		return (branch << SHIFT) + index;
	}

	@Override
	public boolean equals(Object obj) {
		return obj instanceof Choice && ((Choice)obj).branch == branch && ((Choice)obj).index == index;
	}

	/**
	 * Gets the index of the connected possible step.
	 * 
	 * @return the index of the connected possible step if any, <code>-1</code> otherwise
	 */
	public int getConnectedIndex() {
		return getTimelineWindow().getProvider().getSelectedPossibleStep(branch, index);
	}

	/**
	 * Tells if the {@link Choice} has a {@link PossibleStep#isSelected() selectect} {@link PossibleStep}.
	 * 
	 * @return <code>true</code> if the {@link Choice} has a {@link PossibleStep#isSelected() selectect}
	 *         {@link PossibleStep} , <code>false</code> otherwise
	 */
	public boolean hasSelected() {
		return getTimelineWindow().getProvider().getSelectedPossibleStep(branch, index) >= 0;
	}
}
