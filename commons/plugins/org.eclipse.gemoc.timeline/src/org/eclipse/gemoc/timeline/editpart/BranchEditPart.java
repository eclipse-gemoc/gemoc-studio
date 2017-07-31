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

import org.eclipse.gemoc.timeline.layout.LineLayout;
import org.eclipse.gemoc.timeline.model.Branch;
import org.eclipse.gemoc.timeline.model.Choice;

import java.util.List;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.FlowLayout;
import org.eclipse.draw2d.FreeformLayer;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.gef.editpolicies.XYLayoutEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.jface.resource.JFaceResources;

/**
 * An {@link AbstractGraphicalEditPart} for {@link Branch}.
 * 
 * @author <a href="mailto:yvan.lussaud@obeo.fr">Yvan Lussaud</a>
 */
public class BranchEditPart extends AbstractGraphicalEditPart {

	/**
	 * The spacing between {@link ChoiceEditPart}.
	 */
	public static final int SPACING = 10;

	/**
	 * The margin.
	 */
	public static final int MARGIN = 10;

	@Override
	protected IFigure createFigure() {
		final LineLayout layout = new LineLayout();
		layout.setHorizontal(true);
		layout.setMajorAlignment(FlowLayout.ALIGN_TOPLEFT);
		layout.setMinorAlignment(FlowLayout.ALIGN_BOTTOMRIGHT);
		layout.setMinorSpacing(SPACING);
		layout.setMargin(MARGIN);

		FreeformLayer res = new FreeformLayer();
		final Label toolTip = new Label();
		toolTip.setFont(JFaceResources.getFont(JFaceResources.TEXT_FONT));
		toolTip.setBackgroundColor(ColorConstants.tooltipBackground);
		toolTip.setForegroundColor(ColorConstants.tooltipForeground);
		toolTip.setText(getModel().getTimelineWindow().getProvider().getTextAt(getModel().getBranch()));
		res.setToolTip(toolTip);
		res.setLayoutManager(layout);
		return res;
	}

	@Override
	protected void refreshVisuals() {
		super.refreshVisuals();
		int offset = Math.max(getModel().getTimelineWindow().getProvider().getStart(getModel().getBranch())
				- getModel().getTimelineWindow().getStart(), 0);
		getFigure().setBorder(new MarginBorder(0, offset * (SPACING + PossibleStepEditPart.SIZE), 0, 0));
	}

	@Override
	protected void createEditPolicies() {
		installEditPolicy(EditPolicy.LAYOUT_ROLE, new XYLayoutEditPolicy() {

			@Override
			protected Command getCreateCommand(CreateRequest request) {
				// TODO Auto-generated method stub
				return null;
			}
		});
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.gef.editparts.AbstractEditPart#getModelChildren()
	 */
	@Override
	public List<Choice> getModelChildren() {
		return getModel().getChoices();
	}

	@Override
	public Branch getModel() {
		return (Branch)super.getModel();
	}

}
