/**
 */
package org.tetrabox.minijava.xtext.miniJava;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>New Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.tetrabox.minijava.xtext.miniJava.NewCall#getNewz <em>Newz</em>}</li>
 * </ul>
 *
 * @see org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage#getNewCall()
 * @model
 * @generated
 */
public interface NewCall extends Call {
	/**
	 * Returns the value of the '<em><b>Newz</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Newz</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Newz</em>' reference.
	 * @see #setNewz(NewObject)
	 * @see org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage#getNewCall_Newz()
	 * @model required="true"
	 * @generated
	 */
	NewObject getNewz();

	/**
	 * Sets the value of the '{@link org.tetrabox.minijava.xtext.miniJava.NewCall#getNewz <em>Newz</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Newz</em>' reference.
	 * @see #getNewz()
	 * @generated
	 */
	void setNewz(NewObject value);

} // NewCall
