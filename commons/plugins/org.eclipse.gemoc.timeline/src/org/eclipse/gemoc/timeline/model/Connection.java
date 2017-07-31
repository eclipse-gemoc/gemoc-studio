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

/**
 * Connect two {@link PossibleStep}.
 * 
 * @author <a href="mailto:yvan.lussaud@obeo.fr">Yvan Lussaud</a>
 */
public final class Connection {

	/**
	 * The source {@link PossibleStep}.
	 */
	private final PossibleStep source;

	/**
	 * The target {@link PossibleStep}.
	 */
	private final PossibleStep target;

	/**
	 * Constructor.
	 * 
	 * @param source
	 *            the source {@link PossibleStep}
	 * @param target
	 *            the target {@link PossibleStep}
	 */
	public Connection(PossibleStep source, PossibleStep target) {
		this.source = source;
		this.target = target;
	}

	/**
	 * Gets the source {@link PossibleStep}.
	 * 
	 * @return the source {@link PossibleStep}
	 */
	public PossibleStep getSource() {
		return source;
	}

	/**
	 * Gets the target {@link PossibleStep}.
	 * 
	 * @return the target {@link PossibleStep}
	 */
	public PossibleStep getTarget() {
		return target;
	}

	@Override
	public int hashCode() {
		return source.hashCode() ^ target.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		return obj instanceof Connection && ((Connection)obj).source.equals(source)
				&& ((Connection)obj).target.equals(target);
	}
}
