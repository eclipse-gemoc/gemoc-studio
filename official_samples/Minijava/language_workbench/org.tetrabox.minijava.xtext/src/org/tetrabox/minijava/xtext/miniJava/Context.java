/**
 */
package org.tetrabox.minijava.xtext.miniJava;

import java.util.Map;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.tetrabox.minijava.xtext.miniJava.Context#getBindings <em>Bindings</em>}</li>
 *   <li>{@link org.tetrabox.minijava.xtext.miniJava.Context#getParentContext <em>Parent Context</em>}</li>
 *   <li>{@link org.tetrabox.minijava.xtext.miniJava.Context#getChildContext <em>Child Context</em>}</li>
 *   <li>{@link org.tetrabox.minijava.xtext.miniJava.Context#getCache <em>Cache</em>}</li>
 * </ul>
 *
 * @see org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage#getContext()
 * @model
 * @generated
 */
public interface Context extends EObject {
	/**
	 * Returns the value of the '<em><b>Bindings</b></em>' containment reference list.
	 * The list contents are of type {@link org.tetrabox.minijava.xtext.miniJava.SymbolBinding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bindings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bindings</em>' containment reference list.
	 * @see org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage#getContext_Bindings()
	 * @model containment="true"
	 * @generated
	 */
	EList<SymbolBinding> getBindings();

	/**
	 * Returns the value of the '<em><b>Parent Context</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.tetrabox.minijava.xtext.miniJava.Context#getChildContext <em>Child Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Context</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Context</em>' container reference.
	 * @see #setParentContext(Context)
	 * @see org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage#getContext_ParentContext()
	 * @see org.tetrabox.minijava.xtext.miniJava.Context#getChildContext
	 * @model opposite="childContext" transient="false"
	 * @generated
	 */
	Context getParentContext();

	/**
	 * Sets the value of the '{@link org.tetrabox.minijava.xtext.miniJava.Context#getParentContext <em>Parent Context</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Context</em>' container reference.
	 * @see #getParentContext()
	 * @generated
	 */
	void setParentContext(Context value);

	/**
	 * Returns the value of the '<em><b>Child Context</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.tetrabox.minijava.xtext.miniJava.Context#getParentContext <em>Parent Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child Context</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Context</em>' containment reference.
	 * @see #setChildContext(Context)
	 * @see org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage#getContext_ChildContext()
	 * @see org.tetrabox.minijava.xtext.miniJava.Context#getParentContext
	 * @model opposite="parentContext" containment="true"
	 * @generated
	 */
	Context getChildContext();

	/**
	 * Sets the value of the '{@link org.tetrabox.minijava.xtext.miniJava.Context#getChildContext <em>Child Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Child Context</em>' containment reference.
	 * @see #getChildContext()
	 * @generated
	 */
	void setChildContext(Context value);

	/**
	 * Returns the value of the '<em><b>Cache</b></em>' reference list.
	 * The list contents are of type {@link java.util.Map.Entry}<code>&lt;org.tetrabox.minijava.xtext.miniJava.Symbol, org.tetrabox.minijava.xtext.miniJava.SymbolBinding&gt;</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cache</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cache</em>' reference list.
	 * @see org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage#getContext_Cache()
	 * @model mapType="org.tetrabox.minijava.xtext.miniJava.SymbolToSymbolBindingMap&lt;org.tetrabox.minijava.xtext.miniJava.Symbol, org.tetrabox.minijava.xtext.miniJava.SymbolBinding&gt;"
	 * @generated
	 */
	EList<Map.Entry<Symbol, SymbolBinding>> getCache();

} // Context
