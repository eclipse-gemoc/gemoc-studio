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
package org.eclipse.gemoc.timeline.editpart;

import org.eclipse.gemoc.timeline.model.Branch;
import org.eclipse.gemoc.timeline.model.Choice;
import org.eclipse.gemoc.timeline.model.Connection;
import org.eclipse.gemoc.timeline.model.PossibleStep;
import org.eclipse.gemoc.timeline.model.TimelineWindow;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;

/**
 * Sample timeline {@link EditPartFactory}.
 * 
 * @author <a href="mailto:yvan.lussaud@obeo.fr">Yvan Lussaud</a>
 */
public class TimelineEditPartFactory implements EditPartFactory {

	/**
	 * Should we show the label.
	 */
	private final boolean withLabel;

	/**
	 * Constructor.
	 * 
	 * @param withLabel
	 *            should we show the label
	 */
	public TimelineEditPartFactory(boolean withLabel) {
		this.withLabel = withLabel;
	}

	@Override
	public EditPart createEditPart(EditPart context, Object model) {
		final EditPart res;

		if (model instanceof PossibleStep) {
			res = new PossibleStepEditPart(withLabel);
		} else if (model instanceof Connection) {
			res = new ConnectionEditPart();
		} else if (model instanceof Choice) {
			res = new ChoiceEditPart();
		} else if (model instanceof Branch) {
			res = new BranchEditPart();
		} else if (model instanceof TimelineWindow) {
			res = new TimelineWindowEditPart();
		} else {
			throw new IllegalStateException("don't know what to do with " + model.getClass().getName());
		}

		res.setModel(model);

		return res;
	}
}
