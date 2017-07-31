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
package org.eclipse.gemoc.timeline.layout;

import java.util.Iterator;

import org.eclipse.draw2d.FlowLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;

/**
 * A line layout. It happens figures without creating new raws.
 * 
 * @author <a href="mailto:yvan.lussaud@obeo.fr">Yvan Lussaud</a>
 */
public class LineLayout extends FlowLayout {

	/**
	 * The margin around children.
	 */
	private int margin;

	/**
	 * Holds the necessary information for layout calculations.
	 */
	protected class WorkingData extends FlowLayout.WorkingData {
	}

	@Override
	protected Dimension calculatePreferredSize(IFigure container, int wHint, int hHint) {
		// The preferred dimension that is to be calculated and returned
		Dimension prefSize = new Dimension();

		Iterator<?> children = container.getChildren().iterator();
		int width = margin * 2;
		int height = margin * 2;
		IFigure child;
		Dimension childSize;

		// Build the sizes for each row, and update prefSize accordingly
		if (children.hasNext()) {
			child = (IFigure)children.next();
			childSize = transposer.t(getChildSize(child, -1, -1));
			width = childSize.width;
			height = childSize.height;
			while (children.hasNext()) {
				child = (IFigure)children.next();
				childSize = transposer.t(getChildSize(child, -1, -1));
				// The current row can fit another child.
				width += childSize.width + getMinorSpacing();
				height = Math.max(height, childSize.height);
			}
		}

		// Flush out the last row's data
		prefSize.height += height;
		prefSize.width = Math.max(prefSize.width, width);

		// Transpose the dimension back, and compensate for the border.
		prefSize = transposer.t(prefSize);
		prefSize.width += container.getInsets().getWidth();
		prefSize.height += container.getInsets().getHeight();
		prefSize.union(getBorderPreferredSize(container));

		return prefSize;
	}

	@Override
	public void layout(IFigure parent) {
		data = new WorkingData();
		Rectangle relativeArea = parent.getClientArea();
		data.area = transposer.t(relativeArea);

		Iterator<?> iterator = parent.getChildren().iterator();
		int dx;

		// Calculate the hints to be passed to children
		int wHint = -1;
		int hHint = -1;
		if (isHorizontal()) {
			wHint = parent.getClientArea().width;
		} else {
			hHint = parent.getClientArea().height;
		}

		initVariables(parent);
		initRow();
		while (iterator.hasNext()) {
			IFigure f = (IFigure)iterator.next();
			Dimension pref = transposer.t(getChildSize(f, wHint, hHint));
			Rectangle r = new Rectangle(0, 0, pref.width, pref.height);

			r.x = data.rowX;
			r.y = data.rowY;
			dx = r.width + getMinorSpacing();
			data.rowX += dx;
			data.rowWidth += dx;
			data.rowHeight = Math.max(data.rowHeight, r.height);
			data.row[data.rowCount] = f;
			data.bounds[data.rowCount] = r;
			data.rowCount++;
		}
		data.rowWidth += margin;
		data.rowHeight += margin;
		if (data.rowCount != 0) {
			layoutRow(parent);
		}
		data = null;
	}

	/**
	 * Gets the margin before the first child.
	 * 
	 * @return the margin before the first child
	 */
	public int getMargin() {
		return margin;
	}

	/**
	 * Sets the margin around the first children.
	 * 
	 * @param newMargin
	 *            the new margin
	 */
	public void setMargin(int newMargin) {
		this.margin = newMargin;
	}

	@Override
	protected void initRow() {
		super.initRow();
		data.rowX = margin;
		data.rowY = margin;
	}

}
