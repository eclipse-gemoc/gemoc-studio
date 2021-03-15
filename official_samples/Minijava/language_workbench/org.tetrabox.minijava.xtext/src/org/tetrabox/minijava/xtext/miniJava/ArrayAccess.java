/**
 */
package org.tetrabox.minijava.xtext.miniJava;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Access</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.tetrabox.minijava.xtext.miniJava.ArrayAccess#getObject <em>Object</em>}</li>
 *   <li>{@link org.tetrabox.minijava.xtext.miniJava.ArrayAccess#getIndex <em>Index</em>}</li>
 * </ul>
 *
 * @see org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage#getArrayAccess()
 * @model
 * @generated
 */
public interface ArrayAccess extends Expression {
	/**
	 * Returns the value of the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object</em>' containment reference.
	 * @see #setObject(Expression)
	 * @see org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage#getArrayAccess_Object()
	 * @model containment="true"
	 * @generated
	 */
	Expression getObject();

	/**
	 * Sets the value of the '{@link org.tetrabox.minijava.xtext.miniJava.ArrayAccess#getObject <em>Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object</em>' containment reference.
	 * @see #getObject()
	 * @generated
	 */
	void setObject(Expression value);

	/**
	 * Returns the value of the '<em><b>Index</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index</em>' containment reference.
	 * @see #setIndex(Expression)
	 * @see org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage#getArrayAccess_Index()
	 * @model containment="true"
	 * @generated
	 */
	Expression getIndex();

	/**
	 * Sets the value of the '{@link org.tetrabox.minijava.xtext.miniJava.ArrayAccess#getIndex <em>Index</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index</em>' containment reference.
	 * @see #getIndex()
	 * @generated
	 */
	void setIndex(Expression value);

} // ArrayAccess
