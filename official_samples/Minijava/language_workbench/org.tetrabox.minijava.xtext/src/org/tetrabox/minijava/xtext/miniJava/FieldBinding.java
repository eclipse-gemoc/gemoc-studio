/**
 */
package org.tetrabox.minijava.xtext.miniJava;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.tetrabox.minijava.xtext.miniJava.FieldBinding#getField <em>Field</em>}</li>
 *   <li>{@link org.tetrabox.minijava.xtext.miniJava.FieldBinding#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage#getFieldBinding()
 * @model
 * @generated
 */
public interface FieldBinding extends EObject {
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
	 * @see org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage#getFieldBinding_Field()
	 * @model required="true"
	 * @generated
	 */
	Field getField();

	/**
	 * Sets the value of the '{@link org.tetrabox.minijava.xtext.miniJava.FieldBinding#getField <em>Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field</em>' reference.
	 * @see #getField()
	 * @generated
	 */
	void setField(Field value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' reference.
	 * @see #setValue(Value)
	 * @see org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage#getFieldBinding_Value()
	 * @model
	 * @generated
	 */
	Value getValue();

	/**
	 * Sets the value of the '{@link org.tetrabox.minijava.xtext.miniJava.FieldBinding#getValue <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Value value);

} // FieldBinding
