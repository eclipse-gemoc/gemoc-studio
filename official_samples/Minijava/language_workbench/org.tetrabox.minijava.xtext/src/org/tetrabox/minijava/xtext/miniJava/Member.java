/**
 */
package org.tetrabox.minijava.xtext.miniJava;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Member</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.tetrabox.minijava.xtext.miniJava.Member#getAccess <em>Access</em>}</li>
 * </ul>
 *
 * @see org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage#getMember()
 * @model
 * @generated
 */
public interface Member extends TypedDeclaration {
	/**
	 * Returns the value of the '<em><b>Access</b></em>' attribute.
	 * The literals are from the enumeration {@link org.tetrabox.minijava.xtext.miniJava.AccessLevel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access</em>' attribute.
	 * @see org.tetrabox.minijava.xtext.miniJava.AccessLevel
	 * @see #setAccess(AccessLevel)
	 * @see org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage#getMember_Access()
	 * @model
	 * @generated
	 */
	AccessLevel getAccess();

	/**
	 * Sets the value of the '{@link org.tetrabox.minijava.xtext.miniJava.Member#getAccess <em>Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access</em>' attribute.
	 * @see org.tetrabox.minijava.xtext.miniJava.AccessLevel
	 * @see #getAccess()
	 * @generated
	 */
	void setAccess(AccessLevel value);

} // Member
