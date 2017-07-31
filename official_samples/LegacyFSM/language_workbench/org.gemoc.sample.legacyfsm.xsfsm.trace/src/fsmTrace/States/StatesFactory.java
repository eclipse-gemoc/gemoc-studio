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
package fsmTrace.States;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fsmTrace.States.StatesPackage
 * @generated
 */
public interface StatesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StatesFactory eINSTANCE = fsmTrace.States.impl.StatesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Specific State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Specific State</em>'.
	 * @generated
	 */
	SpecificState createSpecificState();

	/**
	 * Returns a new object of class '<em>State Machine consummed String Dimension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State Machine consummed String Dimension</em>'.
	 * @generated
	 */
	StateMachine_consummedString_Dimension createStateMachine_consummedString_Dimension();

	/**
	 * Returns a new object of class '<em>State Machine consummed String Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State Machine consummed String Value</em>'.
	 * @generated
	 */
	StateMachine_consummedString_Value createStateMachine_consummedString_Value();

	/**
	 * Returns a new object of class '<em>State Machine current State Dimension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State Machine current State Dimension</em>'.
	 * @generated
	 */
	StateMachine_currentState_Dimension createStateMachine_currentState_Dimension();

	/**
	 * Returns a new object of class '<em>State Machine current State Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State Machine current State Value</em>'.
	 * @generated
	 */
	StateMachine_currentState_Value createStateMachine_currentState_Value();

	/**
	 * Returns a new object of class '<em>State Machine produced String Dimension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State Machine produced String Dimension</em>'.
	 * @generated
	 */
	StateMachine_producedString_Dimension createStateMachine_producedString_Dimension();

	/**
	 * Returns a new object of class '<em>State Machine produced String Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State Machine produced String Value</em>'.
	 * @generated
	 */
	StateMachine_producedString_Value createStateMachine_producedString_Value();

	/**
	 * Returns a new object of class '<em>State Machine unprocessed String Dimension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State Machine unprocessed String Dimension</em>'.
	 * @generated
	 */
	StateMachine_unprocessedString_Dimension createStateMachine_unprocessedString_Dimension();

	/**
	 * Returns a new object of class '<em>State Machine unprocessed String Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State Machine unprocessed String Value</em>'.
	 * @generated
	 */
	StateMachine_unprocessedString_Value createStateMachine_unprocessedString_Value();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	StatesPackage getStatesPackage();

} //StatesFactory
