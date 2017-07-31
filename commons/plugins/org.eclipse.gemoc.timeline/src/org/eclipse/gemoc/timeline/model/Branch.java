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
 * A branch.
 * 
 * @author <a href="mailto:yvan.lussaud@obeo.fr">Yvan Lussaud</a>
 */
public class Branch implements Comparable<Branch> {

	/**
	 * The containing {@link TimelineWindow}.
	 */
	private final TimelineWindow timelineWindow;

	/**
	 * The branch index.
	 */
	private final int branch;

	/**
	 * Constructor.
	 * 
	 * @param timelineWindow
	 *            the containing {@link TimelineWindow}
	 * @param branch
	 *            the branch index
	 */
	public Branch(TimelineWindow timelineWindow, int branch) {
		this.timelineWindow = timelineWindow;
		this.branch = branch;
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
	 * Gets the {@link List} of {@link Choice}.
	 * 
	 * @return the {@link List} of {@link Choice}
	 */
	public List<Choice> getChoices() {
		final List<Choice> res = new ArrayList<Choice>();

		final ITimelineProvider provider = getTimelineWindow().getProvider();
		final int begin = Math.max(getTimelineWindow().getStart(), provider.getStart(branch));
		final int end = Math.min(getTimelineWindow().getEnd(), provider.getEnd(branch));
		for (int index = begin; index < end; ++index) {
			res.add(new Choice(getTimelineWindow(), branch, index));
		}

		return res;
	}

	/**
	 * Gets the containing {@link TimelineWindow}.
	 * 
	 * @return the containing {@link TimelineWindow}
	 */
	public TimelineWindow getTimelineWindow() {
		return timelineWindow;
	}

	@Override
	public int hashCode() {
		return branch;
	}

	@Override
	public boolean equals(Object obj) {
		return obj instanceof Branch && ((Branch)obj).branch == branch;
	}

	@Override
	public int compareTo(Branch otherBranch) {
		return getTimelineWindow().getProvider().getStart(branch)
				- otherBranch.getTimelineWindow().getProvider().getStart(otherBranch.branch);
	}
}
