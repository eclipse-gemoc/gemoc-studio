/**
 */
package org.tetrabox.minijava.xtext.miniJava;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clazz</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.tetrabox.minijava.xtext.miniJava.Clazz#isIsabstract <em>Isabstract</em>}</li>
 *   <li>{@link org.tetrabox.minijava.xtext.miniJava.Clazz#getSuperClass <em>Super Class</em>}</li>
 * </ul>
 *
 * @see org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage#getClazz()
 * @model
 * @generated
 */
public interface Clazz extends TypeDeclaration {
	/**
	 * Returns the value of the '<em><b>Isabstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Isabstract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Isabstract</em>' attribute.
	 * @see #setIsabstract(boolean)
	 * @see org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage#getClazz_Isabstract()
	 * @model
	 * @generated
	 */
	boolean isIsabstract();

	/**
	 * Sets the value of the '{@link org.tetrabox.minijava.xtext.miniJava.Clazz#isIsabstract <em>Isabstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Isabstract</em>' attribute.
	 * @see #isIsabstract()
	 * @generated
	 */
	void setIsabstract(boolean value);

	/**
	 * Returns the value of the '<em><b>Super Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Class</em>' reference.
	 * @see #setSuperClass(Clazz)
	 * @see org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage#getClazz_SuperClass()
	 * @model
	 * @generated
	 */
	Clazz getSuperClass();

	/**
	 * Sets the value of the '{@link org.tetrabox.minijava.xtext.miniJava.Clazz#getSuperClass <em>Super Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Class</em>' reference.
	 * @see #getSuperClass()
	 * @generated
	 */
	void setSuperClass(Clazz value);

} // Clazz
