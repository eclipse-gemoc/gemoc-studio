/**
 */
package org.tetrabox.minijava.xtext.miniJava;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Symbol Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.tetrabox.minijava.xtext.miniJava.SymbolRef#getSymbol <em>Symbol</em>}</li>
 * </ul>
 *
 * @see org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage#getSymbolRef()
 * @model
 * @generated
 */
public interface SymbolRef extends Expression {
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
	 * @see org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage#getSymbolRef_Symbol()
	 * @model
	 * @generated
	 */
	Symbol getSymbol();

	/**
	 * Sets the value of the '{@link org.tetrabox.minijava.xtext.miniJava.SymbolRef#getSymbol <em>Symbol</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symbol</em>' reference.
	 * @see #getSymbol()
	 * @generated
	 */
	void setSymbol(Symbol value);

} // SymbolRef
