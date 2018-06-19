/**
 */
package org.eclipse.gemoc.example.k3fsm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FSM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gemoc.example.k3fsm.FSM#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.gemoc.example.k3fsm.FSM#getOwnedStates <em>Owned States</em>}</li>
 *   <li>{@link org.eclipse.gemoc.example.k3fsm.FSM#getInitialState <em>Initial State</em>}</li>
 *   <li>{@link org.eclipse.gemoc.example.k3fsm.FSM#getFinalState <em>Final State</em>}</li>
 *   <li>{@link org.eclipse.gemoc.example.k3fsm.FSM#getCurrentState <em>Current State</em>}</li>
 *   <li>{@link org.eclipse.gemoc.example.k3fsm.FSM#getUnprocessedString <em>Unprocessed String</em>}</li>
 *   <li>{@link org.eclipse.gemoc.example.k3fsm.FSM#getConsummedString <em>Consummed String</em>}</li>
 *   <li>{@link org.eclipse.gemoc.example.k3fsm.FSM#getProducedString <em>Produced String</em>}</li>
 * </ul>
 *
 * @see org.eclipse.gemoc.example.k3fsm.K3fsmPackage#getFSM()
 * @model
 * @generated
 */
public interface FSM extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.gemoc.example.k3fsm.K3fsmPackage#getFSM_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.gemoc.example.k3fsm.FSM#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Owned States</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gemoc.example.k3fsm.State}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gemoc.example.k3fsm.State#getOwningFSM <em>Owning FSM</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned States</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned States</em>' containment reference list.
	 * @see org.eclipse.gemoc.example.k3fsm.K3fsmPackage#getFSM_OwnedStates()
	 * @see org.eclipse.gemoc.example.k3fsm.State#getOwningFSM
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
	 * @see org.eclipse.gemoc.example.k3fsm.K3fsmPackage#getFSM_InitialState()
	 * @model required="true"
	 * @generated
	 */
	State getInitialState();

	/**
	 * Sets the value of the '{@link org.eclipse.gemoc.example.k3fsm.FSM#getInitialState <em>Initial State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial State</em>' reference.
	 * @see #getInitialState()
	 * @generated
	 */
	void setInitialState(State value);

	/**
	 * Returns the value of the '<em><b>Final State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Final State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final State</em>' reference.
	 * @see #setFinalState(State)
	 * @see org.eclipse.gemoc.example.k3fsm.K3fsmPackage#getFSM_FinalState()
	 * @model
	 * @generated
	 */
	State getFinalState();

	/**
	 * Sets the value of the '{@link org.eclipse.gemoc.example.k3fsm.FSM#getFinalState <em>Final State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Final State</em>' reference.
	 * @see #getFinalState()
	 * @generated
	 */
	void setFinalState(State value);

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
	 * @see org.eclipse.gemoc.example.k3fsm.K3fsmPackage#getFSM_CurrentState()
	 * @model
	 * @generated
	 */
	State getCurrentState();

	/**
	 * Sets the value of the '{@link org.eclipse.gemoc.example.k3fsm.FSM#getCurrentState <em>Current State</em>}' reference.
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
	 * @see org.eclipse.gemoc.example.k3fsm.K3fsmPackage#getFSM_UnprocessedString()
	 * @model
	 * @generated
	 */
	String getUnprocessedString();

	/**
	 * Sets the value of the '{@link org.eclipse.gemoc.example.k3fsm.FSM#getUnprocessedString <em>Unprocessed String</em>}' attribute.
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
	 * @see org.eclipse.gemoc.example.k3fsm.K3fsmPackage#getFSM_ConsummedString()
	 * @model
	 * @generated
	 */
	String getConsummedString();

	/**
	 * Sets the value of the '{@link org.eclipse.gemoc.example.k3fsm.FSM#getConsummedString <em>Consummed String</em>}' attribute.
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
	 * @see org.eclipse.gemoc.example.k3fsm.K3fsmPackage#getFSM_ProducedString()
	 * @model
	 * @generated
	 */
	String getProducedString();

	/**
	 * Sets the value of the '{@link org.eclipse.gemoc.example.k3fsm.FSM#getProducedString <em>Produced String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Produced String</em>' attribute.
	 * @see #getProducedString()
	 * @generated
	 */
	void setProducedString(String value);

} // FSM
