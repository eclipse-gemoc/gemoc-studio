/**
 */
package org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsm.fsm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsm.fsm.Transition#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsm.fsm.Transition#getTarget <em>Target</em>}</li>
 *   <li>{@link org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsm.fsm.Transition#getInput <em>Input</em>}</li>
 *   <li>{@link org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsm.fsm.Transition#getOutput <em>Output</em>}</li>
 * </ul>
 *
 * @see org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsm.fsm.FsmPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsm.fsm.State#getOutgoingTransitions <em>Outgoing Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(State)
	 * @see org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsm.fsm.FsmPackage#getTransition_Source()
	 * @see org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsm.fsm.State#getOutgoingTransitions
	 * @model opposite="outgoingTransitions" required="true"
	 * @generated
	 */
	State getSource();

	/**
	 * Sets the value of the '{@link org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsm.fsm.Transition#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(State value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsm.fsm.State#getIncomingTransitions <em>Incoming Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(State)
	 * @see org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsm.fsm.FsmPackage#getTransition_Target()
	 * @see org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsm.fsm.State#getIncomingTransitions
	 * @model opposite="incomingTransitions" required="true"
	 * @generated
	 */
	State getTarget();

	/**
	 * Sets the value of the '{@link org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsm.fsm.Transition#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(State value);

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
	 * @see org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsm.fsm.FsmPackage#getTransition_Input()
	 * @model
	 * @generated
	 */
	String getInput();

	/**
	 * Sets the value of the '{@link org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsm.fsm.Transition#getInput <em>Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input</em>' attribute.
	 * @see #getInput()
	 * @generated
	 */
	void setInput(String value);

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
	 * @see org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsm.fsm.FsmPackage#getTransition_Output()
	 * @model
	 * @generated
	 */
	String getOutput();

	/**
	 * Sets the value of the '{@link org.eclipse.gemoc.example.melangek3fsm.xsfsm.xsfsm.fsm.Transition#getOutput <em>Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output</em>' attribute.
	 * @see #getOutput()
	 * @generated
	 */
	void setOutput(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void fire();

} // Transition
