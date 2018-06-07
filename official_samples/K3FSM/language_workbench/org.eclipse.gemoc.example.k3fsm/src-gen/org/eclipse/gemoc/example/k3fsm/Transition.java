/**
 */
package org.eclipse.gemoc.example.k3fsm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gemoc.example.k3fsm.Transition#getInput <em>Input</em>}</li>
 *   <li>{@link org.eclipse.gemoc.example.k3fsm.Transition#getTarget <em>Target</em>}</li>
 *   <li>{@link org.eclipse.gemoc.example.k3fsm.Transition#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.gemoc.example.k3fsm.Transition#getOutput <em>Output</em>}</li>
 *   <li>{@link org.eclipse.gemoc.example.k3fsm.Transition#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @see org.eclipse.gemoc.example.k3fsm.K3fsmPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends EObject {
	/**
	 * Returns the value of the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' attribute.
	 * @see #setInput(String)
	 * @see org.eclipse.gemoc.example.k3fsm.K3fsmPackage#getTransition_Input()
	 * @model
	 * @generated
	 */
	String getInput();

	/**
	 * Sets the value of the '{@link org.eclipse.gemoc.example.k3fsm.Transition#getInput <em>Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input</em>' attribute.
	 * @see #getInput()
	 * @generated
	 */
	void setInput(String value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gemoc.example.k3fsm.State#getIncomingTransitions <em>Incoming Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(State)
	 * @see org.eclipse.gemoc.example.k3fsm.K3fsmPackage#getTransition_Target()
	 * @see org.eclipse.gemoc.example.k3fsm.State#getIncomingTransitions
	 * @model opposite="incomingTransitions" required="true"
	 * @generated
	 */
	State getTarget();

	/**
	 * Sets the value of the '{@link org.eclipse.gemoc.example.k3fsm.Transition#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(State value);

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
	 * @see org.eclipse.gemoc.example.k3fsm.K3fsmPackage#getTransition_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.gemoc.example.k3fsm.Transition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' attribute.
	 * @see #setOutput(String)
	 * @see org.eclipse.gemoc.example.k3fsm.K3fsmPackage#getTransition_Output()
	 * @model
	 * @generated
	 */
	String getOutput();

	/**
	 * Sets the value of the '{@link org.eclipse.gemoc.example.k3fsm.Transition#getOutput <em>Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output</em>' attribute.
	 * @see #getOutput()
	 * @generated
	 */
	void setOutput(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gemoc.example.k3fsm.State#getOutgoingTransitions <em>Outgoing Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' container reference.
	 * @see #setSource(State)
	 * @see org.eclipse.gemoc.example.k3fsm.K3fsmPackage#getTransition_Source()
	 * @see org.eclipse.gemoc.example.k3fsm.State#getOutgoingTransitions
	 * @model opposite="outgoingTransitions" required="true" transient="false"
	 * @generated
	 */
	State getSource();

	/**
	 * Sets the value of the '{@link org.eclipse.gemoc.example.k3fsm.Transition#getSource <em>Source</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' container reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(State value);

} // Transition
