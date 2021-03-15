/**
 */
package org.tetrabox.minijava.xtext.miniJava;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>New Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.tetrabox.minijava.xtext.miniJava.NewObject#getType <em>Type</em>}</li>
 *   <li>{@link org.tetrabox.minijava.xtext.miniJava.NewObject#getArgs <em>Args</em>}</li>
 * </ul>
 *
 * @see org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage#getNewObject()
 * @model
 * @generated
 */
public interface NewObject extends Expression {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Clazz)
	 * @see org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage#getNewObject_Type()
	 * @model
	 * @generated
	 */
	Clazz getType();

	/**
	 * Sets the value of the '{@link org.tetrabox.minijava.xtext.miniJava.NewObject#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Clazz value);

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
	 * @see org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage#getNewObject_Args()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getArgs();

} // NewObject
