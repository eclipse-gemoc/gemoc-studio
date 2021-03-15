/**
 */
package org.tetrabox.minijava.xtext.miniJava;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.tetrabox.minijava.xtext.miniJava.ClassRef#getReferencedClass <em>Referenced Class</em>}</li>
 * </ul>
 *
 * @see org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage#getClassRef()
 * @model
 * @generated
 */
public interface ClassRef extends SingleTypeRef {
	/**
	 * Returns the value of the '<em><b>Referenced Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Class</em>' reference.
	 * @see #setReferencedClass(TypeDeclaration)
	 * @see org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage#getClassRef_ReferencedClass()
	 * @model
	 * @generated
	 */
	TypeDeclaration getReferencedClass();

	/**
	 * Sets the value of the '{@link org.tetrabox.minijava.xtext.miniJava.ClassRef#getReferencedClass <em>Referenced Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Class</em>' reference.
	 * @see #getReferencedClass()
	 * @generated
	 */
	void setReferencedClass(TypeDeclaration value);

} // ClassRef
