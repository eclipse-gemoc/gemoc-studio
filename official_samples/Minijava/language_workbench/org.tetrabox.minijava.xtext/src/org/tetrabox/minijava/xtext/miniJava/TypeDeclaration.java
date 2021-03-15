/**
 */
package org.tetrabox.minijava.xtext.miniJava;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.tetrabox.minijava.xtext.miniJava.TypeDeclaration#getAccessLevel <em>Access Level</em>}</li>
 *   <li>{@link org.tetrabox.minijava.xtext.miniJava.TypeDeclaration#getImplementz <em>Implementz</em>}</li>
 *   <li>{@link org.tetrabox.minijava.xtext.miniJava.TypeDeclaration#getMembers <em>Members</em>}</li>
 * </ul>
 *
 * @see org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage#getTypeDeclaration()
 * @model
 * @generated
 */
public interface TypeDeclaration extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Access Level</b></em>' attribute.
	 * The literals are from the enumeration {@link org.tetrabox.minijava.xtext.miniJava.AccessLevel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Level</em>' attribute.
	 * @see org.tetrabox.minijava.xtext.miniJava.AccessLevel
	 * @see #setAccessLevel(AccessLevel)
	 * @see org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage#getTypeDeclaration_AccessLevel()
	 * @model
	 * @generated
	 */
	AccessLevel getAccessLevel();

	/**
	 * Sets the value of the '{@link org.tetrabox.minijava.xtext.miniJava.TypeDeclaration#getAccessLevel <em>Access Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Level</em>' attribute.
	 * @see org.tetrabox.minijava.xtext.miniJava.AccessLevel
	 * @see #getAccessLevel()
	 * @generated
	 */
	void setAccessLevel(AccessLevel value);

	/**
	 * Returns the value of the '<em><b>Implementz</b></em>' reference list.
	 * The list contents are of type {@link org.tetrabox.minijava.xtext.miniJava.Interface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implementz</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementz</em>' reference list.
	 * @see org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage#getTypeDeclaration_Implementz()
	 * @model
	 * @generated
	 */
	EList<Interface> getImplementz();

	/**
	 * Returns the value of the '<em><b>Members</b></em>' containment reference list.
	 * The list contents are of type {@link org.tetrabox.minijava.xtext.miniJava.Member}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Members</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Members</em>' containment reference list.
	 * @see org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage#getTypeDeclaration_Members()
	 * @model containment="true"
	 * @generated
	 */
	EList<Member> getMembers();

} // TypeDeclaration
