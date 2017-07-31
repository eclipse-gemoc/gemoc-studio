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
package fsmTrace.Steps.impl;

import org.eclipse.gemoc.trace.commons.model.trace.impl.SequentialStepImpl;

import fsmTrace.States.SpecificState;

import fsmTrace.Steps.SpecificRootStep;
import fsmTrace.Steps.SpecificStep;
import fsmTrace.Steps.StepsPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specific Root Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class SpecificRootStepImpl extends SequentialStepImpl<SpecificStep, SpecificState> implements SpecificRootStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecificRootStepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StepsPackage.Literals.SPECIFIC_ROOT_STEP;
	}

} //SpecificRootStepImpl
