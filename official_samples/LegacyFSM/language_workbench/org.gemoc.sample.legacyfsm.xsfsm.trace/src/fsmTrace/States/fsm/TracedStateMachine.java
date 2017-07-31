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
package fsmTrace.States.fsm;

import fsmTrace.States.SpecificDimension;
import fsmTrace.States.StateMachine_consummedString_Dimension;
import fsmTrace.States.StateMachine_currentState_Dimension;
import fsmTrace.States.StateMachine_producedString_Dimension;
import fsmTrace.States.StateMachine_unprocessedString_Dimension;

import org.eclipse.emf.common.util.EList;

import org.gemoc.sample.legacyfsm.xsfsm.xsfsm.fsm.StateMachine;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced State Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fsmTrace.States.fsm.TracedStateMachine#getOriginalObject <em>Original Object</em>}</li>
 *   <li>{@link fsmTrace.States.fsm.TracedStateMachine#getStateMachine_consummedString_Dimension <em>State Machine consummed String Dimension</em>}</li>
 *   <li>{@link fsmTrace.States.fsm.TracedStateMachine#getStateMachine_currentState_Dimension <em>State Machine current State Dimension</em>}</li>
 *   <li>{@link fsmTrace.States.fsm.TracedStateMachine#getStateMachine_producedString_Dimension <em>State Machine produced String Dimension</em>}</li>
 *   <li>{@link fsmTrace.States.fsm.TracedStateMachine#getStateMachine_unprocessedString_Dimension <em>State Machine unprocessed String Dimension</em>}</li>
 * </ul>
 *
 * @see fsmTrace.States.fsm.FsmPackage#getTracedStateMachine()
 * @model
 * @generated
 */
public interface TracedStateMachine extends TracedNamedElement {
	/**
	 * Returns the value of the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Object</em>' reference.
	 * @see #setOriginalObject(StateMachine)
	 * @see fsmTrace.States.fsm.FsmPackage#getTracedStateMachine_OriginalObject()
	 * @model
	 * @generated
	 */
	StateMachine getOriginalObject();

	/**
	 * Sets the value of the '{@link fsmTrace.States.fsm.TracedStateMachine#getOriginalObject <em>Original Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Object</em>' reference.
	 * @see #getOriginalObject()
	 * @generated
	 */
	void setOriginalObject(StateMachine value);

	/**
	 * Returns the value of the '<em><b>State Machine consummed String Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State Machine consummed String Dimension</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Machine consummed String Dimension</em>' containment reference.
	 * @see #setStateMachine_consummedString_Dimension(StateMachine_consummedString_Dimension)
	 * @see fsmTrace.States.fsm.FsmPackage#getTracedStateMachine_StateMachine_consummedString_Dimension()
	 * @model containment="true"
	 * @generated
	 */
	StateMachine_consummedString_Dimension getStateMachine_consummedString_Dimension();

	/**
	 * Sets the value of the '{@link fsmTrace.States.fsm.TracedStateMachine#getStateMachine_consummedString_Dimension <em>State Machine consummed String Dimension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Machine consummed String Dimension</em>' containment reference.
	 * @see #getStateMachine_consummedString_Dimension()
	 * @generated
	 */
	void setStateMachine_consummedString_Dimension(StateMachine_consummedString_Dimension value);

	/**
	 * Returns the value of the '<em><b>State Machine current State Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State Machine current State Dimension</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Machine current State Dimension</em>' containment reference.
	 * @see #setStateMachine_currentState_Dimension(StateMachine_currentState_Dimension)
	 * @see fsmTrace.States.fsm.FsmPackage#getTracedStateMachine_StateMachine_currentState_Dimension()
	 * @model containment="true"
	 * @generated
	 */
	StateMachine_currentState_Dimension getStateMachine_currentState_Dimension();

	/**
	 * Sets the value of the '{@link fsmTrace.States.fsm.TracedStateMachine#getStateMachine_currentState_Dimension <em>State Machine current State Dimension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Machine current State Dimension</em>' containment reference.
	 * @see #getStateMachine_currentState_Dimension()
	 * @generated
	 */
	void setStateMachine_currentState_Dimension(StateMachine_currentState_Dimension value);

	/**
	 * Returns the value of the '<em><b>State Machine produced String Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State Machine produced String Dimension</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Machine produced String Dimension</em>' containment reference.
	 * @see #setStateMachine_producedString_Dimension(StateMachine_producedString_Dimension)
	 * @see fsmTrace.States.fsm.FsmPackage#getTracedStateMachine_StateMachine_producedString_Dimension()
	 * @model containment="true"
	 * @generated
	 */
	StateMachine_producedString_Dimension getStateMachine_producedString_Dimension();

	/**
	 * Sets the value of the '{@link fsmTrace.States.fsm.TracedStateMachine#getStateMachine_producedString_Dimension <em>State Machine produced String Dimension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Machine produced String Dimension</em>' containment reference.
	 * @see #getStateMachine_producedString_Dimension()
	 * @generated
	 */
	void setStateMachine_producedString_Dimension(StateMachine_producedString_Dimension value);

	/**
	 * Returns the value of the '<em><b>State Machine unprocessed String Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State Machine unprocessed String Dimension</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Machine unprocessed String Dimension</em>' containment reference.
	 * @see #setStateMachine_unprocessedString_Dimension(StateMachine_unprocessedString_Dimension)
	 * @see fsmTrace.States.fsm.FsmPackage#getTracedStateMachine_StateMachine_unprocessedString_Dimension()
	 * @model containment="true"
	 * @generated
	 */
	StateMachine_unprocessedString_Dimension getStateMachine_unprocessedString_Dimension();

	/**
	 * Sets the value of the '{@link fsmTrace.States.fsm.TracedStateMachine#getStateMachine_unprocessedString_Dimension <em>State Machine unprocessed String Dimension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Machine unprocessed String Dimension</em>' containment reference.
	 * @see #getStateMachine_unprocessedString_Dimension()
	 * @generated
	 */
	void setStateMachine_unprocessedString_Dimension(StateMachine_unprocessedString_Dimension value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final EList<SpecificDimension<?>> result = new org.eclipse.emf.ecore.util.BasicInternalEList<SpecificDimension<?>>(Object.class);\nresult.addAll(super.getDimensionsInternal());\nresult.add(getStateMachine_currentState_Dimension());\nresult.add(getStateMachine_unprocessedString_Dimension());\nresult.add(getStateMachine_consummedString_Dimension());\nresult.add(getStateMachine_producedString_Dimension());\nreturn result;\n'"
	 * @generated
	 */
	EList<SpecificDimension<?>> getDimensionsInternal();

} // TracedStateMachine
