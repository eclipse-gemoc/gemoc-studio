/**
 */
package org.tetrabox.minijava.xtext.miniJava;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.tetrabox.minijava.xtext.miniJava.MethodCall#getReceiver <em>Receiver</em>}</li>
 *   <li>{@link org.tetrabox.minijava.xtext.miniJava.MethodCall#getMethod <em>Method</em>}</li>
 *   <li>{@link org.tetrabox.minijava.xtext.miniJava.MethodCall#getArgs <em>Args</em>}</li>
 * </ul>
 *
 * @see org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage#getMethodCall()
 * @model
 * @generated
 */
public interface MethodCall extends Expression {
	/**
	 * Returns the value of the '<em><b>Receiver</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receiver</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receiver</em>' containment reference.
	 * @see #setReceiver(Expression)
	 * @see org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage#getMethodCall_Receiver()
	 * @model containment="true"
	 * @generated
	 */
	Expression getReceiver();

	/**
	 * Sets the value of the '{@link org.tetrabox.minijava.xtext.miniJava.MethodCall#getReceiver <em>Receiver</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receiver</em>' containment reference.
	 * @see #getReceiver()
	 * @generated
	 */
	void setReceiver(Expression value);

	/**
	 * Returns the value of the '<em><b>Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' reference.
	 * @see #setMethod(Method)
	 * @see org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage#getMethodCall_Method()
	 * @model
	 * @generated
	 */
	Method getMethod();

	/**
	 * Sets the value of the '{@link org.tetrabox.minijava.xtext.miniJava.MethodCall#getMethod <em>Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' reference.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(Method value);

	/**
	 * Returns the value of the '<em><b>Args</b></em>' containment reference list.
	 * The list contents are of type {@link org.tetrabox.minijava.xtext.miniJava.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Args</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Args</em>' containment reference list.
	 * @see org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage#getMethodCall_Args()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getArgs();

} // MethodCall
