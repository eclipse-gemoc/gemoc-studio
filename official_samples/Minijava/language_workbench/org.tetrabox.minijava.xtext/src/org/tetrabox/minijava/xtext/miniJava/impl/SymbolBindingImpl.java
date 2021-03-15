/**
 */
package org.tetrabox.minijava.xtext.miniJava.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage;
import org.tetrabox.minijava.xtext.miniJava.Symbol;
import org.tetrabox.minijava.xtext.miniJava.SymbolBinding;
import org.tetrabox.minijava.xtext.miniJava.Value;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Symbol Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.tetrabox.minijava.xtext.miniJava.impl.SymbolBindingImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.tetrabox.minijava.xtext.miniJava.impl.SymbolBindingImpl#getSymbol <em>Symbol</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SymbolBindingImpl extends MinimalEObjectImpl.Container implements SymbolBinding {
	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected Value value;

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
	protected SymbolBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MiniJavaPackage.Literals.SYMBOL_BINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Value getValue() {
		if (value != null && value.eIsProxy()) {
			InternalEObject oldValue = (InternalEObject)value;
			value = (Value)eResolveProxy(oldValue);
			if (value != oldValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MiniJavaPackage.SYMBOL_BINDING__VALUE, oldValue, value));
			}
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Value basicGetValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(Value newValue) {
		Value oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiniJavaPackage.SYMBOL_BINDING__VALUE, oldValue, value));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MiniJavaPackage.SYMBOL_BINDING__SYMBOL, oldSymbol, symbol));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MiniJavaPackage.SYMBOL_BINDING__SYMBOL, oldSymbol, symbol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MiniJavaPackage.SYMBOL_BINDING__VALUE:
				if (resolve) return getValue();
				return basicGetValue();
			case MiniJavaPackage.SYMBOL_BINDING__SYMBOL:
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
			case MiniJavaPackage.SYMBOL_BINDING__VALUE:
				setValue((Value)newValue);
				return;
			case MiniJavaPackage.SYMBOL_BINDING__SYMBOL:
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
			case MiniJavaPackage.SYMBOL_BINDING__VALUE:
				setValue((Value)null);
				return;
			case MiniJavaPackage.SYMBOL_BINDING__SYMBOL:
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
			case MiniJavaPackage.SYMBOL_BINDING__VALUE:
				return value != null;
			case MiniJavaPackage.SYMBOL_BINDING__SYMBOL:
				return symbol != null;
		}
		return super.eIsSet(featureID);
	}

} //SymbolBindingImpl
