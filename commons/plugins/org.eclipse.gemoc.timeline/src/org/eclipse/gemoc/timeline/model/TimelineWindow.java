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

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * A window over a large timeline.
 * 
 * @author <a href="mailto:yvan.lussaud@obeo.fr">Yvan Lussaud</a>
 */
public class TimelineWindow implements ITimelineListener {

	/**
	 * The {@link ITimelineProvider} used to populate the model.
	 */
	private ITimelineProvider provider;

	/**
	 * The maximum timeline index.
	 */
	private int maxTimelineIndex;

	/**
	 * The {@link List} of {@link ITimelineListener} to notify.
	 */
	private final List<ITimelineWindowListener> listeners = new ArrayList<ITimelineWindowListener>();

	/**
	 * The start index.
	 */
	private int start;

	/**
	 * The length of the window.
	 */
	private int length;

	/**
	 * Constructor.
	 * 
	 * @param provider
	 *            the {@link ITimelineProvider} used to populate the model
	 */
	public TimelineWindow(ITimelineProvider provider) {
		setProvider(provider, 0);
	}

	/**
	 * Gets the {@link ITimelineProvider}.
	 * 
	 * @return the {@link ITimelineProvider}
	 */
	public ITimelineProvider getProvider() {
		return provider;
	}

	/**
	 * Gets the {@link List} of {@link Choice}.
	 * 
	 * @return the {@link List} of {@link Choice}
	 */
	public List<Branch> getBranches() {
		final List<Branch> res = new ArrayList<Branch>();

		if (getProvider() != null) {
			int numberOfBranches = provider.getNumberOfBranches();
			for (int branch = 0; branch < numberOfBranches; ++branch) {
				if (isBranchVisibleInWindow(branch)) {
					res.add(new Branch(this, branch));
				}
			}
		}

		Collections.sort(res);

		return res;
	}

	/**
	 * Tells if the given branch is visible in the window.
	 * 
	 * @param branch
	 *            the branch index
	 * @return <code>true</code> if the given branch is visible in the window, <code>false</code> otherwise
	 */
	private boolean isBranchVisibleInWindow(int branch) {
		return provider.getStart(branch) <= getEnd() && provider.getEnd(branch) > getStart();
	}

	/**
	 * Gets the maximum timeline index.
	 * 
	 * @return the maximum timeline index
	 */
	public int getMaxTimelineIndex() {
		return maxTimelineIndex;
	}

	/**
	 * Gets the maximum selected possible step index for the given branch.
	 * 
	 * @param branch
	 *            the branch
	 * @return the maximum selected possible step index for the given branch
	 */
	public int getMaxSelectedIndex(int branch) {
		int res = 0;

		final int begin = Math.max(getStart(), provider.getStart(branch));
		final int end = Math.min(getEnd(), provider.getEnd(branch));
		for (int choice = begin; choice < end; ++choice) {
			final int selectedPossibleStep = getProvider().getSelectedPossibleStep(branch, choice);
			res = Math.max(res, selectedPossibleStep);
		}

		return res;
	}

	/**
	 * Gets the start index.
	 * 
	 * @return the start index
	 */
	public int getStart() {
		return start;
	}

	/**
	 * Sets the start index.
	 * 
	 * @param start
	 *            the new start index
	 */
	public void setStart(int start) {
		if (this.start != start) {
			this.start = start;
			for (ITimelineWindowListener listener : getListeners()) {
				listener.startChanged(start);
			}
		}
	}

	/**
	 * Gets the length of the window.
	 * 
	 * @return the length of the window
	 */
	public int getLength() {
		return length;
	}

	/**
	 * Gets the end index.
	 * 
	 * @return the end index
	 */
	public int getEnd() {
		return getStart() + getLength();
	}

	/**
	 * Sets the length of the window.
	 * 
	 * @param length
	 *            the length of the window
	 */
	public void setLength(int length) {
		if (this.length != length) {
			this.length = length;
			for (ITimelineWindowListener listener : getListeners()) {
				listener.lengthChanged(length);
			}
		}
	}

	/**
	 * Sets a new {@link ITimelineProvider}.
	 * 
	 * @param newProvider
	 *            the {@link ITimelineProvider}
	 * @param newStart
	 *            the new start
	 */
	public void setProvider(ITimelineProvider newProvider, int newStart) {
		if ((this.provider != null && !this.provider.equals(newProvider))
				|| (newProvider != null && !newProvider.equals(this.provider))) {
			if (this.provider != null) {
				this.provider.removeTimelineListener(this);
			}
			this.provider = newProvider;
			maxTimelineIndex = 0;
			if (this.provider != null) {
				final int numberOfBranches = provider.getNumberOfBranches();
				for (int branch = 0; branch < numberOfBranches; ++branch) {
					maxTimelineIndex = Math.max(maxTimelineIndex, provider.getEnd(branch) - 1);
				}
				this.provider.addTimelineListener(this);
				for (ITimelineWindowListener listener : getListeners()) {
					listener.providerChanged(newProvider);
				}
				if (newStart >= 0 && newStart <= getMaxTimelineIndex()) {
					setStart(newStart);
				}
			}
		}
	}

	/**
	 * Tells if the given index is in the {@link TimelineWindow}.
	 * 
	 * @param index
	 *            the index to check
	 * @return <code>true</code> if the given index is in the {@link TimelineWindow}, <code>false</code>
	 *         otherwise
	 */
	private boolean isInWindow(int index) {
		return getStart() <= index && index < getEnd();
	}

	/**
	 * Adds a {@link ITimelineWindowListener}.
	 * 
	 * @param listener
	 *            the {@link ITimelineWindowListener}
	 */
	public void addTimelineWindowListener(ITimelineWindowListener listener) {
		synchronized(listeners) {
			listeners.add(listener);
		}
	}

	/**
	 * Removes a {@link ITimelineWindowListener}.
	 * 
	 * @param listener
	 *            the {@link ITimelineWindowListener}
	 */
	public void removeTimelineWindowListener(ITimelineWindowListener listener) {
		synchronized(listeners) {
			listeners.remove(listener);
		}
	}

	@Override
	public void startChanged(int branch, int newStart) {
		if (isInWindow(newStart)) {
			for (ITimelineWindowListener listener : getListeners()) {
				listener.startChanged(branch, newStart);
			}
		}
	}

	@Override
	public void endChanged(int branch, int end) {
		maxTimelineIndex = Math.max(maxTimelineIndex, end);
		if (isInWindow(end)) {
			for (ITimelineWindowListener listener : getListeners()) {
				listener.endChanged(branch, end);
			}
		}
	}

	@Override
	public void textAtChanged(int branch, String text) {
		if (isBranchVisibleInWindow(branch)) {
			for (ITimelineWindowListener listener : getListeners()) {
				listener.textAtChanged(branch, text);
			}
		}

	}

	@Override
	public void numberOfPossibleStepsAtChanged(int branch, int index, int numberOfPossibleStep) {
		if (isInWindow(index)) {
			for (ITimelineWindowListener listener : getListeners()) {
				listener.numberOfPossibleStepsAtChanged(branch, index, numberOfPossibleStep);
			}
		}
	}

	@Override
	public void textAtChanged(int branch, int index, String text) {
		if (isInWindow(index)) {
			for (ITimelineWindowListener listener : getListeners()) {
				listener.textAtChanged(branch, index, text);
			}
		}
	}

	@Override
	public void atChanged(int branch, int index, int possibleStep, Object object) {
		if (isInWindow(index)) {
			for (ITimelineWindowListener listener : getListeners()) {
				listener.atChanged(branch, index, possibleStep, object);
			}
		}
	}

	@Override
	public void isSelectedChanged(int branch, int index, int possibleStep, boolean selected) {
		if (isInWindow(index)) {
			for (ITimelineWindowListener listener : getListeners()) {
				listener.isSelectedChanged(branch, index, possibleStep, selected);
			}
		}
	}

	@Override
	public void textAtChanged(int branch, int index, int possibleStep, String text) {
		if (isInWindow(index)) {
			for (ITimelineWindowListener listener : getListeners()) {
				listener.textAtChanged(branch, index, possibleStep, text);
			}
		}
	}

	@Override
	public void followingsChanged(int branch, int index, int possibleStep, int[][] followings) {
		if (isInWindow(index) && isInWindow(index + 1)) {
			for (ITimelineWindowListener listener : getListeners()) {
				listener.followingsChanged(branch, index, possibleStep, followings);
			}
		}
	}

	@Override
	public void precedingsChanged(int branch, int index, int possibleStep, int[][] precedings) {
		if (isInWindow(index - 1) && isInWindow(index)) {
			for (ITimelineWindowListener listener : getListeners()) {
				listener.precedingsChanged(branch, index, possibleStep, precedings);
			}
		}
	}

	/**
	 * Gets the {@link List} of {@link ITimelineWindowListener}.
	 * 
	 * @return the {@link List} of {@link ITimelineWindowListener}
	 */
	private List<ITimelineWindowListener> getListeners() {
		final List<ITimelineWindowListener> l;
		synchronized(listeners) {
			l = new ArrayList<ITimelineWindowListener>(listeners);
		}
		return l;
	}

}
