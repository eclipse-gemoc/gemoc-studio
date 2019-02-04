/**
 */
package org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsmmt.fsm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsmmt.fsm.StateMachine#getOwnedStates <em>Owned States</em>}</li>
 *   <li>{@link org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsmmt.fsm.StateMachine#getInitialState <em>Initial State</em>}</li>
 *   <li>{@link org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsmmt.fsm.StateMachine#getOwnedTransitions <em>Owned Transitions</em>}</li>
 *   <li>{@link org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsmmt.fsm.StateMachine#getCurrentState <em>Current State</em>}</li>
 *   <li>{@link org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsmmt.fsm.StateMachine#getUnprocessedString <em>Unprocessed String</em>}</li>
 *   <li>{@link org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsmmt.fsm.StateMachine#getConsummedString <em>Consummed String</em>}</li>
 *   <li>{@link org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsmmt.fsm.StateMachine#getProducedString <em>Produced String</em>}</li>
 * </ul>
 *
 * @see org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsmmt.fsm.FsmPackage#getStateMachine()
 * @model
 * @generated
 */
public interface StateMachine extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Owned States</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsmmt.fsm.State}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsmmt.fsm.State#getOwningFSM <em>Owning FSM</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned States</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned States</em>' containment reference list.
	 * @see org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsmmt.fsm.FsmPackage#getStateMachine_OwnedStates()
	 * @see org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsmmt.fsm.State#getOwningFSM
	 * @model opposite="owningFSM" containment="true"
	 * @generated
	 */
	EList<State> getOwnedStates();

	/**
	 * Returns the value of the '<em><b>Initial State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial State</em>' reference.
	 * @see #setInitialState(State)
	 * @see org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsmmt.fsm.FsmPackage#getStateMachine_InitialState()
	 * @model required="true"
	 * @generated
	 */
	State getInitialState();

	/**
	 * Sets the value of the '{@link org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsmmt.fsm.StateMachine#getInitialState <em>Initial State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial State</em>' reference.
	 * @see #getInitialState()
	 * @generated
	 */
	void setInitialState(State value);

	/**
	 * Returns the value of the '<em><b>Owned Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsmmt.fsm.Transition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Transitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Transitions</em>' containment reference list.
	 * @see org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsmmt.fsm.FsmPackage#getStateMachine_OwnedTransitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transition> getOwnedTransitions();

	/**
	 * Returns the value of the '<em><b>Current State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current State</em>' reference.
	 * @see #setCurrentState(State)
	 * @see org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsmmt.fsm.FsmPackage#getStateMachine_CurrentState()
	 * @model
	 * @generated
	 */
	State getCurrentState();

	/**
	 * Sets the value of the '{@link org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsmmt.fsm.StateMachine#getCurrentState <em>Current State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current State</em>' reference.
	 * @see #getCurrentState()
	 * @generated
	 */
	void setCurrentState(State value);

	/**
	 * Returns the value of the '<em><b>Unprocessed String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unprocessed String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unprocessed String</em>' attribute.
	 * @see #setUnprocessedString(String)
	 * @see org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsmmt.fsm.FsmPackage#getStateMachine_UnprocessedString()
	 * @model unique="false"
	 * @generated
	 */
	String getUnprocessedString();

	/**
	 * Sets the value of the '{@link org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsmmt.fsm.StateMachine#getUnprocessedString <em>Unprocessed String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unprocessed String</em>' attribute.
	 * @see #getUnprocessedString()
	 * @generated
	 */
	void setUnprocessedString(String value);

	/**
	 * Returns the value of the '<em><b>Consummed String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consummed String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consummed String</em>' attribute.
	 * @see #setConsummedString(String)
	 * @see org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsmmt.fsm.FsmPackage#getStateMachine_ConsummedString()
	 * @model unique="false"
	 * @generated
	 */
	String getConsummedString();

	/**
	 * Sets the value of the '{@link org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsmmt.fsm.StateMachine#getConsummedString <em>Consummed String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consummed String</em>' attribute.
	 * @see #getConsummedString()
	 * @generated
	 */
	void setConsummedString(String value);

	/**
	 * Returns the value of the '<em><b>Produced String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Produced String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Produced String</em>' attribute.
	 * @see #setProducedString(String)
	 * @see org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsmmt.fsm.FsmPackage#getStateMachine_ProducedString()
	 * @model unique="false"
	 * @generated
	 */
	String getProducedString();

	/**
	 * Sets the value of the '{@link org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsmmt.fsm.StateMachine#getProducedString <em>Produced String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Produced String</em>' attribute.
	 * @see #getProducedString()
	 * @generated
	 */
	void setProducedString(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void main();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model argsMany="true"
	 * @generated
	 */
	void initializeModel(EList<String> args);

} // StateMachine
