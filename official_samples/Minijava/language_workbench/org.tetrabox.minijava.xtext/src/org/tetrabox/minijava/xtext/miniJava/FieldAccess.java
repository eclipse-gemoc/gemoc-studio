/**
 */
package org.tetrabox.minijava.xtext.miniJava;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field Access</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.tetrabox.minijava.xtext.miniJava.FieldAccess#getReceiver <em>Receiver</em>}</li>
 *   <li>{@link org.tetrabox.minijava.xtext.miniJava.FieldAccess#getField <em>Field</em>}</li>
 * </ul>
 *
 * @see org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage#getFieldAccess()
 * @model
 * @generated
 */
public interface FieldAccess extends Expression {
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
	 * @see org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage#getFieldAccess_Receiver()
	 * @model containment="true"
	 * @generated
	 */
	Expression getReceiver();

	/**
	 * Sets the value of the '{@link org.tetrabox.minijava.xtext.miniJava.FieldAccess#getReceiver <em>Receiver</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receiver</em>' containment reference.
	 * @see #getReceiver()
	 * @generated
	 */
	void setReceiver(Expression value);

	/**
	 * Returns the value of the '<em><b>Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Field</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field</em>' reference.
	 * @see #setField(Field)
	 * @see org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage#getFieldAccess_Field()
	 * @model
	 * @generated
	 */
	Field getField();

	/**
	 * Sets the value of the '{@link org.tetrabox.minijava.xtext.miniJava.FieldAccess#getField <em>Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field</em>' reference.
	 * @see #getField()
	 * @generated
	 */
	void setField(Field value);

} // FieldAccess
