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
import org.eclipse.gemoc.timeline.model.ITimelineWindowListener;
import org.eclipse.gemoc.timeline.model.PossibleStep;
import org.eclipse.gemoc.timeline.model.TimelineWindow;
import org.eclipse.gemoc.timeline.view.ITimelineProvider;

import java.util.List;

import org.eclipse.draw2d.FlowLayout;
import org.eclipse.draw2d.FreeformLayer;
import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.gef.editpolicies.XYLayoutEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.swt.widgets.Display;

/**
 * An {@link AbstractGraphicalEditPart} for {@link TimelineWindow}.
 * 
 * @author <a href="mailto:yvan.lussaud@obeo.fr">Yvan Lussaud</a>
 */
public class TimelineWindowEditPart extends AbstractGraphicalEditPart implements ITimelineWindowListener {

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
		layout.setHorizontal(false);
		layout.setMajorAlignment(FlowLayout.ALIGN_TOPLEFT);
		layout.setMinorAlignment(FlowLayout.ALIGN_TOPLEFT);
		layout.setMinorSpacing(SPACING);
		layout.setMargin(MARGIN);

		FreeformLayer res = new FreeformLayer();
		res.setLayoutManager(layout);
		return res;
	}

	@Override
	public void setModel(Object model) {
		super.setModel(model);
		getModel().addTimelineWindowListener(this);
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
	public List<Branch> getModelChildren() {
		return getModel().getBranches();
	}

	@Override
	public TimelineWindow getModel() {
		return (TimelineWindow)super.getModel();
	}

	@Override
	public void startChanged(int branch, int start) {
		Display.getDefault().syncExec(new Runnable() {

			@Override
			public void run() {
				deepRefresh();
			}
		});
	}

	@Override
	public void endChanged(final int branch, final int numberOfChoices) {
		Display.getDefault().syncExec(new Runnable() {

			@Override
			public void run() {
				deepRefresh();
			}
		});
	}

	@Override
	public void textAtChanged(final int branch, final String text) {
		Display.getDefault().syncExec(new Runnable() {

			@Override
			public void run() {
				final EditPart editPart = (EditPart)getViewer().getEditPartRegistry().get(
						new Branch(getModel(), branch));
				editPart.refresh();
			}
		});
	}

	@Override
	public void numberOfPossibleStepsAtChanged(final int branch, final int index,
			final int numberOfPossibleStep) {
		Display.getDefault().syncExec(new Runnable() {

			@Override
			public void run() {
				deepRefresh();
			}
		});
	}

	@Override
	public void textAtChanged(final int branch, final int index, final String text) {
		Display.getDefault().syncExec(new Runnable() {

			@Override
			public void run() {
				final EditPart editPart = (EditPart)getViewer().getEditPartRegistry().get(
						new Choice(getModel(), branch, index));
				editPart.refresh();
			}
		});
	}

	@Override
	public void atChanged(final int branch, final int index, final int possibleStep, final Object object) {
		Display.getDefault().syncExec(new Runnable() {

			@Override
			public void run() {
				final EditPart editPart = (EditPart)getViewer().getEditPartRegistry().get(
						new PossibleStep(getModel(), branch, index, possibleStep));
				if (editPart.equals(getViewer().getSelectedEditParts())) {
					getViewer().getSelectionManager().deselect(editPart);
					getViewer().getSelectionManager().appendSelection(editPart);
				}
			}
		});
	}

	@Override
	public void isSelectedChanged(final int branch, final int index, final int possibleStep,
			final boolean selected) {
		Display.getDefault().syncExec(new Runnable() {

			@Override
			public void run() {
				deepRefresh();
			}
		});
	}

	@Override
	public void textAtChanged(final int branch, final int index, final int possibleStep, final String text) {
		Display.getDefault().syncExec(new Runnable() {

			@Override
			public void run() {
				final EditPart editPart = (EditPart)getViewer().getEditPartRegistry().get(
						new PossibleStep(getModel(), branch, index, possibleStep));
				editPart.refresh();
			}
		});
	}

	@Override
	public void followingsChanged(final int branch, final int index, final int possibleStep,
			final int[][] followings) {
		// nothing to do here
	}

	@Override
	public void precedingsChanged(final int branch, final int index, final int possibleStep,
			final int[][] precedings) {
		// nothing to do here
	}

	@Override
	public synchronized void startChanged(int start) {
		Display.getDefault().syncExec(new Runnable() {

			@Override
			public void run() {
				deepRefresh();
			}
		});
	}

	@Override
	public synchronized void lengthChanged(final int length) {
		Display.getDefault().syncExec(new Runnable() {

			@Override
			public void run() {
				deepRefresh();
			}
		});
	}

	@Override
	public void providerChanged(final ITimelineProvider provider) {
		Display.getDefault().syncExec(new Runnable() {

			@Override
			public void run() {
				deepRefresh();
			}
		});
	}

	/**
	 * Refresh {@link EditPart} in depth.
	 */
	private void deepRefresh() {
		refresh();
		for (Branch branch : getModelChildren()) {
			final EditPart branchEditPart = (EditPart)getViewer().getEditPartRegistry().get(branch);
			branchEditPart.refresh();
			for (Choice choice : branch.getChoices()) {
				final EditPart choiceEditPart = (EditPart)getViewer().getEditPartRegistry().get(choice);
				choiceEditPart.refresh();
				for (PossibleStep possibleStep : choice.getPossibleSteps()) {
					final EditPart possibleStepEditPart = (EditPart)getViewer().getEditPartRegistry().get(
							possibleStep);
					possibleStepEditPart.refresh();
				}
			}
		}
	}

}
