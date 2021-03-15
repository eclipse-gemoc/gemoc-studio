/**
 */
package org.tetrabox.minijava.xtext.miniJava;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.tetrabox.minijava.xtext.miniJava.Block#getStatements <em>Statements</em>}</li>
 * </ul>
 *
 * @see org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage#getBlock()
 * @model
 * @generated
 */
public interface Block extends Statement {
	/**
	 * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
	 * The list contents are of type {@link org.tetrabox.minijava.xtext.miniJava.Statement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statements</em>' containment reference list.
	 * @see org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage#getBlock_Statements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Statement> getStatements();

} // Block
