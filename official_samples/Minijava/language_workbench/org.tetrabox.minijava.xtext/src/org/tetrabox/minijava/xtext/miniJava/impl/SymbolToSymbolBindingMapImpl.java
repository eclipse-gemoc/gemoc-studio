/**
 */
package org.tetrabox.minijava.xtext.miniJava.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicEMap;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage;
import org.tetrabox.minijava.xtext.miniJava.Symbol;
import org.tetrabox.minijava.xtext.miniJava.SymbolBinding;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Symbol To Symbol Binding Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.tetrabox.minijava.xtext.miniJava.impl.SymbolToSymbolBindingMapImpl#getTypedKey <em>Key</em>}</li>
 *   <li>{@link org.tetrabox.minijava.xtext.miniJava.impl.SymbolToSymbolBindingMapImpl#getTypedValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SymbolToSymbolBindingMapImpl extends MinimalEObjectImpl.Container implements BasicEMap.Entry<Symbol,SymbolBinding> {
	/**
	 * The cached value of the '{@link #getTypedKey() <em>Key</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypedKey()
	 * @generated
	 * @ordered
	 */
	protected Symbol key;

	/**
	 * The cached value of the '{@link #getTypedValue() <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypedValue()
	 * @generated
	 * @ordered
	 */
	protected SymbolBinding value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SymbolToSymbolBindingMapImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MiniJavaPackage.Literals.SYMBOL_TO_SYMBOL_BINDING_MAP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symbol getTypedKey() {
		if (key != null && key.eIsProxy()) {
			InternalEObject oldKey = (InternalEObject)key;
			key = (Symbol)eResolveProxy(oldKey);
			if (key != oldKey) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MiniJavaPackage.SYMBOL_TO_SYMBOL_BINDING_MAP__KEY, oldKey, key));
			}
		}
		return key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symbol basicGetTypedKey() {
		return key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypedKey(Symbol newKey) {
		Symbol oldKey = key;
		key = newKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiniJavaPackage.SYMBOL_TO_SYMBOL_BINDING_MAP__KEY, oldKey, key));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymbolBinding getTypedValue() {
		if (value != null && value.eIsProxy()) {
			InternalEObject oldValue = (InternalEObject)value;
			value = (SymbolBinding)eResolveProxy(oldValue);
			if (value != oldValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MiniJavaPackage.SYMBOL_TO_SYMBOL_BINDING_MAP__VALUE, oldValue, value));
			}
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymbolBinding basicGetTypedValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypedValue(SymbolBinding newValue) {
		SymbolBinding oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiniJavaPackage.SYMBOL_TO_SYMBOL_BINDING_MAP__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MiniJavaPackage.SYMBOL_TO_SYMBOL_BINDING_MAP__KEY:
				if (resolve) return getTypedKey();
				return basicGetTypedKey();
			case MiniJavaPackage.SYMBOL_TO_SYMBOL_BINDING_MAP__VALUE:
				if (resolve) return getTypedValue();
				return basicGetTypedValue();
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
			case MiniJavaPackage.SYMBOL_TO_SYMBOL_BINDING_MAP__KEY:
				setTypedKey((Symbol)newValue);
				return;
			case MiniJavaPackage.SYMBOL_TO_SYMBOL_BINDING_MAP__VALUE:
				setTypedValue((SymbolBinding)newValue);
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
			case MiniJavaPackage.SYMBOL_TO_SYMBOL_BINDING_MAP__KEY:
				setTypedKey((Symbol)null);
				return;
			case MiniJavaPackage.SYMBOL_TO_SYMBOL_BINDING_MAP__VALUE:
				setTypedValue((SymbolBinding)null);
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
			case MiniJavaPackage.SYMBOL_TO_SYMBOL_BINDING_MAP__KEY:
				return key != null;
			case MiniJavaPackage.SYMBOL_TO_SYMBOL_BINDING_MAP__VALUE:
				return value != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected int hash = -1;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHash() {
		if (hash == -1) {
			Object theKey = getKey();
			hash = (theKey == null ? 0 : theKey.hashCode());
		}
		return hash;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHash(int hash) {
		this.hash = hash;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symbol getKey() {
		return getTypedKey();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKey(Symbol key) {
		setTypedKey(key);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymbolBinding getValue() {
		return getTypedValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymbolBinding setValue(SymbolBinding value) {
		SymbolBinding oldValue = getValue();
		setTypedValue(value);
		return oldValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EMap<Symbol, SymbolBinding> getEMap() {
		EObject container = eContainer();
		return container == null ? null : (EMap<Symbol, SymbolBinding>)container.eGet(eContainmentFeature());
	}

} //SymbolToSymbolBindingMapImpl
