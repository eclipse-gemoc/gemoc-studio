/*******************************************************************************
 * Copyright (c) 2015, 2017  Inria  and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Inria - initial API and implementation
 *******************************************************************************/
/**
 */
package fsmTrace.States.impl;

import org.eclipse.gemoc.trace.commons.model.trace.impl.DimensionImpl;

import fsmTrace.States.SpecificDimension;
import fsmTrace.States.SpecificValue;
import fsmTrace.States.StatesPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specific Dimension</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class SpecificDimensionImpl<ValueSubType extends SpecificValue> extends DimensionImpl<ValueSubType> implements SpecificDimension<ValueSubType> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecificDimensionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatesPackage.Literals.SPECIFIC_DIMENSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific element type known in this context.
	 * @generated
	 */
	@Override
	public EList<ValueSubType> getValues() {
		if (values == null) {
			values = new EObjectContainmentEList<ValueSubType>(SpecificValue.class, this, StatesPackage.SPECIFIC_DIMENSION__VALUES);
		}
		return values;
	}

} //SpecificDimensionImpl
