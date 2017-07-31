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
package fsmTrace.Steps;

import org.eclipse.gemoc.trace.commons.model.trace.SequentialStep;

import fsmTrace.States.SpecificState;

import fsmTrace.States.fsm.TracedState;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fsm State Step</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see fsmTrace.Steps.StepsPackage#getFsm_State_Step()
 * @model
 * @generated
 */
public interface Fsm_State_Step extends SpecificStep, SequentialStep<Fsm_State_Step_AbstractSubStep, SpecificState> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (fsmTrace.States.fsm.TracedState) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	TracedState getCaller();

} // Fsm_State_Step
