/**
 */
package org.tetrabox.minijava.xtext.miniJava;

import java.util.Map;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.tetrabox.minijava.xtext.miniJava.Method#isIsabstract <em>Isabstract</em>}</li>
 *   <li>{@link org.tetrabox.minijava.xtext.miniJava.Method#isIsstatic <em>Isstatic</em>}</li>
 *   <li>{@link org.tetrabox.minijava.xtext.miniJava.Method#getParams <em>Params</em>}</li>
 *   <li>{@link org.tetrabox.minijava.xtext.miniJava.Method#getBody <em>Body</em>}</li>
 *   <li>{@link org.tetrabox.minijava.xtext.miniJava.Method#getCache <em>Cache</em>}</li>
 * </ul>
 *
 * @see org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage#getMethod()
 * @model
 * @generated
 */
public interface Method extends Member {
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
	 * @see org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage#getMethod_Isabstract()
	 * @model
	 * @generated
	 */
	boolean isIsabstract();

	/**
	 * Sets the value of the '{@link org.tetrabox.minijava.xtext.miniJava.Method#isIsabstract <em>Isabstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Isabstract</em>' attribute.
	 * @see #isIsabstract()
	 * @generated
	 */
	void setIsabstract(boolean value);

	/**
	 * Returns the value of the '<em><b>Isstatic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Isstatic</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Isstatic</em>' attribute.
	 * @see #setIsstatic(boolean)
	 * @see org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage#getMethod_Isstatic()
	 * @model
	 * @generated
	 */
	boolean isIsstatic();

	/**
	 * Sets the value of the '{@link org.tetrabox.minijava.xtext.miniJava.Method#isIsstatic <em>Isstatic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Isstatic</em>' attribute.
	 * @see #isIsstatic()
	 * @generated
	 */
	void setIsstatic(boolean value);

	/**
	 * Returns the value of the '<em><b>Params</b></em>' containment reference list.
	 * The list contents are of type {@link org.tetrabox.minijava.xtext.miniJava.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Params</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Params</em>' containment reference list.
	 * @see org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage#getMethod_Params()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParams();

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(Block)
	 * @see org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage#getMethod_Body()
	 * @model containment="true"
	 * @generated
	 */
	Block getBody();

	/**
	 * Sets the value of the '{@link org.tetrabox.minijava.xtext.miniJava.Method#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(Block value);

	/**
	 * Returns the value of the '<em><b>Cache</b></em>' reference list.
	 * The list contents are of type {@link java.util.Map.Entry}<code>&lt;org.tetrabox.minijava.xtext.miniJava.Clazz, org.tetrabox.minijava.xtext.miniJava.Method&gt;</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cache</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cache</em>' reference list.
	 * @see org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage#getMethod_Cache()
	 * @model mapType="org.tetrabox.minijava.xtext.miniJava.ClazzToMethodMap&lt;org.tetrabox.minijava.xtext.miniJava.Clazz, org.tetrabox.minijava.xtext.miniJava.Method&gt;"
	 * @generated
	 */
	EList<Map.Entry<Clazz, Method>> getCache();

} // Method
