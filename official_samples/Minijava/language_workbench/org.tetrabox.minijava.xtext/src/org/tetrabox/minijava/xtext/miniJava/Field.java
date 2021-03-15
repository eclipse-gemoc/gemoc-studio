/**
 */
package org.tetrabox.minijava.xtext.miniJava;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.tetrabox.minijava.xtext.miniJava.Field#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 *
 * @see org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage#getField()
 * @model
 * @generated
 */
public interface Field extends Member {
	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' containment reference.
	 * @see #setDefaultValue(Expression)
	 * @see org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage#getField_DefaultValue()
	 * @model containment="true"
	 * @generated
	 */
	Expression getDefaultValue();

	/**
	 * Sets the value of the '{@link org.tetrabox.minijava.xtext.miniJava.Field#getDefaultValue <em>Default Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' containment reference.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(Expression value);

} // Field
