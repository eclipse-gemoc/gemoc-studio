/**
 */
package org.tetrabox.minijava.xtext.miniJava;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Symbol Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.tetrabox.minijava.xtext.miniJava.SymbolBinding#getValue <em>Value</em>}</li>
 *   <li>{@link org.tetrabox.minijava.xtext.miniJava.SymbolBinding#getSymbol <em>Symbol</em>}</li>
 * </ul>
 *
 * @see org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage#getSymbolBinding()
 * @model
 * @generated
 */
public interface SymbolBinding extends EObject {
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
	 * @see org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage#getSymbolBinding_Value()
	 * @model
	 * @generated
	 */
	Value getValue();

	/**
	 * Sets the value of the '{@link org.tetrabox.minijava.xtext.miniJava.SymbolBinding#getValue <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Value value);

	/**
	 * Returns the value of the '<em><b>Symbol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Symbol</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symbol</em>' reference.
	 * @see #setSymbol(Symbol)
	 * @see org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage#getSymbolBinding_Symbol()
	 * @model required="true"
	 * @generated
	 */
	Symbol getSymbol();

	/**
	 * Sets the value of the '{@link org.tetrabox.minijava.xtext.miniJava.SymbolBinding#getSymbol <em>Symbol</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symbol</em>' reference.
	 * @see #getSymbol()
	 * @generated
	 */
	void setSymbol(Symbol value);

} // SymbolBinding
