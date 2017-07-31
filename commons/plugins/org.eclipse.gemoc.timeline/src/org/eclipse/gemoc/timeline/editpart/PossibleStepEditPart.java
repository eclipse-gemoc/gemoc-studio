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
import org.eclipse.gemoc.timeline.model.Choice;
import org.eclipse.gemoc.timeline.model.Connection;
import org.eclipse.gemoc.timeline.model.PossibleStep;

import java.util.List;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Ellipse;
import org.eclipse.draw2d.FlowLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.Layer;
import org.eclipse.draw2d.MouseEvent;
import org.eclipse.draw2d.MouseListener;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.gef.editpolicies.XYLayoutEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.jface.resource.JFaceResources;

/**
 * An {@link AbstractGraphicalEditPart} for {@link PossibleStep}.
 * 
 * @author <a href="mailto:yvan.lussaud@obeo.fr">Yvan Lussaud</a>
 */
public class PossibleStepEditPart extends AbstractGraphicalEditPart {

	/**
	 * Possible step {@link IFigure}.
	 *
	 * @author <a href="mailto:yvan.lussaud@obeo.fr">Yvan Lussaud</a>
	 */
	private final class PossibleStepFigure extends Layer {

		/**
		 * The {@link Ellipse}.
		 */
		private final Ellipse ellipse;

		/**
		 * The {@link Ellipse} tool tip.
		 */
		private final Label toolTip;

		/**
		 * The {@link Label} for the last possible step.
		 */
		private final Label label;

		/**
		 * Tells if the label is in this figure.
		 */
		private boolean hasLabel;

		/**
		 * Constructor.
		 */
		public PossibleStepFigure() {
			final LineLayout layout = new LineLayout();
			layout.setHorizontal(true);
			layout.setMajorAlignment(FlowLayout.ALIGN_TOPLEFT);
			layout.setMinorAlignment(FlowLayout.ALIGN_CENTER);
			layout.setMinorSpacing(SPACING);

			setLayoutManager(layout);
			toolTip = new Label();
			toolTip.setFont(JFaceResources.getFont(JFaceResources.TEXT_FONT));
			toolTip.setBackgroundColor(ColorConstants.tooltipBackground);
			toolTip.setForegroundColor(ColorConstants.tooltipForeground);
			ellipse = createEllipse();
			add(ellipse);
			label = new Label();
			if (withLabel) {
				add(label);
				hasLabel = true;
			} else {
				ellipse.setToolTip(toolTip);
				hasLabel = false;
			}
			addMouseListener(new MouseListener.Stub() {

				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.draw2d.MouseListener.Stub#mouseReleased(org.eclipse.draw2d.MouseEvent)
				 */
				@Override
				public void mousePressed(MouseEvent me) {
					if (me.button == 1) {
						final EditPartViewer viewer = getViewer();
						viewer.getSelectionManager().deselectAll();
						viewer.getSelectionManager().appendSelection(PossibleStepEditPart.this);
					}
				}

			});

		}

		/**
		 * Creates the {@link Ellipse} of the main {@link IFigure}.
		 * 
		 * @return the {@link Ellipse} of the main {@link IFigure}
		 */
		private Ellipse createEllipse() {
			final Ellipse res = new Ellipse();

			res.setSize(SIZE, SIZE);
			res.setForegroundColor(ColorConstants.listBackground);

			return res;
		}

		/**
		 * Tells if the label is in this figure.
		 * 
		 * @return <code>true</code> if the label is in this figure, <code>false</code> otherwise
		 */
		public boolean hasLabel() {
			return hasLabel;
		}

		/**
		 * Removes the label to this figure.
		 */
		public void removeLabel() {
			ellipse.setToolTip(toolTip);
			remove(label);
			hasLabel = false;
		}

		/**
		 * Adds the label to this figure.
		 */
		public void addLabel() {
			ellipse.setToolTip(null);
			add(label);
			hasLabel = true;
		}

		/**
		 * Gets the {@link Ellipse}.
		 * 
		 * @return the {@link Ellipse}
		 */
		public Ellipse getEllipse() {
			return ellipse;
		}

		/**
		 * Gets the {@link Ellipse} tool tip.
		 * 
		 * @return the {@link Ellipse} tool tip
		 */
		public Label getEllipseToolTip() {
			return toolTip;
		}

		/**
		 * Gets the {@link Label}.
		 * 
		 * @return the {@link Label}
		 */
		public Label getLabel() {
			return label;
		}

	}

	/**
	 * The size of the circle.
	 */
	public static final int SIZE = 20;

	/**
	 * The spacing between the {@link Ellipse} and the {@link Label}.
	 */
	public static final int SPACING = 5;

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
	public PossibleStepEditPart(boolean withLabel) {
		this.withLabel = withLabel;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.gef.editparts.AbstractGraphicalEditPart#createFigure()
	 */
	@Override
	protected IFigure createFigure() {
		return new PossibleStepFigure();
	}

	@Override
	protected void refreshVisuals() {
		super.refreshVisuals();
		final PossibleStepFigure figure = (PossibleStepFigure)getFigure();
		if (!getModel().getChoice().hasSelected()) {
			figure.getLabel().setText(getModel().getName());
			figure.getEllipse().setBackgroundColor(ColorConstants.orange);
			if (withLabel) {
				figure.getEllipseToolTip().setVisible(false);
				if (!figure.hasLabel()) {
					figure.addLabel();
					figure.invalidate();
				}
			} else {
				figure.getEllipseToolTip().setVisible(true);
				figure.getEllipseToolTip().setText(getModel().getName());
			}
		} else {
			figure.getEllipseToolTip().setText(getModel().getName());
			if (getModel().isCurrent()) {
				figure.getEllipse().setBackgroundColor(ColorConstants.blue);
			} else if (getModel().isSelected()) {
				figure.getEllipse().setBackgroundColor(ColorConstants.lightBlue);
			} else {
				figure.getEllipse().setBackgroundColor(ColorConstants.lightGreen);
			}
			if (withLabel && figure.hasLabel()) {
				figure.removeLabel();
				figure.invalidate();
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.gef.editparts.AbstractEditPart#createEditPolicies()
	 */
	@Override
	protected void createEditPolicies() {
		installEditPolicy(EditPolicy.LAYOUT_ROLE, new XYLayoutEditPolicy() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.gef.editpolicies.LayoutEditPolicy#getCreateCommand(org.eclipse.gef.requests.CreateRequest)
			 */
			@Override
			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		});
	}

	@Override
	protected List<Connection> getModelSourceConnections() {
		return getModel().getFollowing();
	}

	@Override
	protected List<Connection> getModelTargetConnections() {
		return getModel().getPreceding();
	}

	@Override
	public PossibleStep getModel() {
		return (PossibleStep)super.getModel();
	}

	/**
	 * Gets the {@link PossibleStepEditPart} on the left.
	 * 
	 * @return the {@link PossibleStepEditPart} on the left if any, <code>null</code> otherwise
	 */
	public PossibleStepEditPart getLeftPossibleStepEditPart() {
		final PossibleStepEditPart res;

		final Choice previousChoice = getModel().getChoice().getPreviousChoice();
		if (previousChoice != null) {
			int previousConnectionIndex = previousChoice.getConnectedIndex();
			if (previousConnectionIndex < 0) {
				previousConnectionIndex = 0;
			}
			int connectionIndex = getModel().getChoice().getConnectedIndex();
			if (connectionIndex < 0) {
				connectionIndex = 0;
			}
			int offset = previousConnectionIndex - connectionIndex;
			if (previousChoice.getPossibleSteps().size() > getModel().getPossibleStepIndex() + offset
					&& getModel().getPossibleStepIndex() + offset > -1) {
				res = (PossibleStepEditPart)getViewer().getEditPartRegistry().get(
						previousChoice.getPossibleSteps().get(getModel().getPossibleStepIndex() + offset));
			} else {
				res = null;
			}
		} else {
			res = null;
		}

		return res;
	}

	/**
	 * Gets the {@link PossibleStepEditPart} on the right.
	 * 
	 * @return the {@link PossibleStepEditPart} on the right if any, <code>null</code> otherwise
	 */
	public PossibleStepEditPart getRightPossibleStepEditPart() {
		final PossibleStepEditPart res;

		final Choice nextChoice = getModel().getChoice().getNextChoice();
		if (nextChoice != null) {
			int nextConnectionIndex = nextChoice.getConnectedIndex();
			if (nextConnectionIndex < 0) {
				nextConnectionIndex = 0;
			}
			int connectionIndex = getModel().getChoice().getConnectedIndex();
			if (connectionIndex < 0) {
				connectionIndex = 0;
			}
			int offset = nextConnectionIndex - connectionIndex;
			if (nextChoice.getPossibleSteps().size() > getModel().getPossibleStepIndex() + offset
					&& getModel().getPossibleStepIndex() + offset > -1) {
				res = (PossibleStepEditPart)getViewer().getEditPartRegistry().get(
						nextChoice.getPossibleSteps().get(getModel().getPossibleStepIndex() + offset));
			} else {
				res = null;
			}
		} else {
			res = null;
		}

		return res;
	}

	/**
	 * Gets the {@link PossibleStepEditPart} above.
	 * 
	 * @return the {@link PossibleStepEditPart} above if any, <code>null</code> otherwise
	 */
	public PossibleStepEditPart getAbovePossibleStepEditPart() {
		return (PossibleStepEditPart)getViewer().getEditPartRegistry().get(getModel().getNextPossibleStep());
	}

	/**
	 * Gets the {@link PossibleStepEditPart} beneath.
	 * 
	 * @return the {@link PossibleStepEditPart} beneath if any, <code>null</code> otherwise
	 */
	public PossibleStepEditPart getBeneathPossibleStepEditPart() {
		return (PossibleStepEditPart)getViewer().getEditPartRegistry().get(
				getModel().getPreviousPossibleStep());
	}

}
