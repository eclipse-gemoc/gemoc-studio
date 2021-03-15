/**
 */
package org.tetrabox.minijava.xtext.miniJava.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage;
import org.tetrabox.minijava.xtext.miniJava.Symbol;
import org.tetrabox.minijava.xtext.miniJava.SymbolRef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Symbol Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.tetrabox.minijava.xtext.miniJava.impl.SymbolRefImpl#getSymbol <em>Symbol</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SymbolRefImpl extends ExpressionImpl implements SymbolRef {
	/**
	 * The cached value of the '{@link #getSymbol() <em>Symbol</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbol()
	 * @generated
	 * @ordered
	 */
	protected Symbol symbol;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SymbolRefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MiniJavaPackage.Literals.SYMBOL_REF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symbol getSymbol() {
		if (symbol != null && symbol.eIsProxy()) {
			InternalEObject oldSymbol = (InternalEObject)symbol;
			symbol = (Symbol)eResolveProxy(oldSymbol);
			if (symbol != oldSymbol) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MiniJavaPackage.SYMBOL_REF__SYMBOL, oldSymbol, symbol));
			}
		}
		return symbol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symbol basicGetSymbol() {
		return symbol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSymbol(Symbol newSymbol) {
		Symbol oldSymbol = symbol;
		symbol = newSymbol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiniJavaPackage.SYMBOL_REF__SYMBOL, oldSymbol, symbol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MiniJavaPackage.SYMBOL_REF__SYMBOL:
				if (resolve) return getSymbol();
				return basicGetSymbol();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MiniJavaPackage.SYMBOL_REF__SYMBOL:
				setSymbol((Symbol)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MiniJavaPackage.SYMBOL_REF__SYMBOL:
				setSymbol((Symbol)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MiniJavaPackage.SYMBOL_REF__SYMBOL:
				return symbol != null;
		}
		return super.eIsSet(featureID);
	}

} //SymbolRefImpl
