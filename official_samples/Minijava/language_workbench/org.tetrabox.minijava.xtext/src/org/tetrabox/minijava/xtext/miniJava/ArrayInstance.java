/**
 */
package org.tetrabox.minijava.xtext.miniJava;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.tetrabox.minijava.xtext.miniJava.ArrayInstance#getValue <em>Value</em>}</li>
 *   <li>{@link org.tetrabox.minijava.xtext.miniJava.ArrayInstance#getSize <em>Size</em>}</li>
 * </ul>
 *
 * @see org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage#getArrayInstance()
 * @model
 * @generated
 */
public interface ArrayInstance extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference list.
	 * The list contents are of type {@link org.tetrabox.minijava.xtext.miniJava.Value}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference list.
	 * @see org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage#getArrayInstance_Value()
	 * @model containment="true"
	 * @generated
	 */
	EList<Value> getValue();

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(int)
	 * @see org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage#getArrayInstance_Size()
	 * @model
	 * @generated
	 */
	int getSize();

	/**
	 * Sets the value of the '{@link org.tetrabox.minijava.xtext.miniJava.ArrayInstance#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(int value);

} // ArrayInstance
