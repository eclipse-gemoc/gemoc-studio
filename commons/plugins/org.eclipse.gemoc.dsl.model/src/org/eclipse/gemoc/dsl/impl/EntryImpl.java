/**
 */
package org.eclipse.gemoc.dsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.gemoc.dsl.DslPackage;
import org.eclipse.gemoc.dsl.Entry;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gemoc.dsl.impl.EntryImpl#getKey <em>Key</em>}</li>
 *   <li>{@link org.eclipse.gemoc.dsl.impl.EntryImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntryImpl extends MinimalEObjectImpl.Container implements Entry {
	/**
	 * The default value of the '{@link #getKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected static final String KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected String key = KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DslPackage.Literals.ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKey() {
		return key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKey(String newKey) {
		String oldKey = key;
		key = newKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.ENTRY__KEY, oldKey, key));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.ENTRY__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DslPackage.ENTRY__KEY:
				return getKey();
			case DslPackage.ENTRY__VALUE:
				return getValue();
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
			case DslPackage.ENTRY__KEY:
				setKey((String)newValue);
				return;
			case DslPackage.ENTRY__VALUE:
				setValue((String)newValue);
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
			case DslPackage.ENTRY__KEY:
				setKey(KEY_EDEFAULT);
				return;
			case DslPackage.ENTRY__VALUE:
				setValue(VALUE_EDEFAULT);
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
			case DslPackage.ENTRY__KEY:
				return KEY_EDEFAULT == null ? key != null : !KEY_EDEFAULT.equals(key);
			case DslPackage.ENTRY__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (key: ");
		result.append(key);
		result.append(", value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

	/**
	   * Parse the value String to an EList of Strings while treating quoted values as single
	   * element.
	   * 
	   * @param strDel -
	   *          String deliminer
	   * @param bAllowSingleQuote -
	   *          single quotes such as ' can be used to group value
	   * @param bAllowDoubleQuote -
	   *          double quote such as " can be used to group value
	   * @return String[] - parsed list
	   * @throws OSSInvalidDataException -
	   *           error during parsing
	   */
	  public EList<String> getQuotedStringValueAsStringEList(String strDel,
	      boolean bAllowSingleQuote, boolean bAllowDoubleQuote) throws Exception {
		  EList<String> lstElements = new BasicEList<String>();
	    String strParse = this.value;
	    if (strParse != null) {
	      int iCurrentIndex = 0;
	      int iNextIndex;
	      int iDelLength = strDel.length();
	      int iParseLength = strParse.length();

	      while (iCurrentIndex < iParseLength) {
	        if ((bAllowSingleQuote) && (strParse.charAt(iCurrentIndex) == '\'')) {
	          // Find next single quote and treat the things in the middle as
	          // single element
	          iNextIndex = strParse.indexOf('\'', iCurrentIndex + 1);
	          if (iNextIndex == -1) {
	            throw new Exception("Incorrect input. " + strParse
	                + " No single quote following the one" + " at location " + iCurrentIndex);
	          }
	          lstElements.add(strParse.substring(iCurrentIndex + 1, iNextIndex));
	          iCurrentIndex = iNextIndex + 1;
	          if (strParse.substring(iCurrentIndex).startsWith(strDel)) {
	            iCurrentIndex += iDelLength;
	          }
	        } else if ((bAllowDoubleQuote) && (strParse.charAt(iCurrentIndex) == '"')) {
	          // Find next double quote and treat the things in the middle as
	          // single element
	          iNextIndex = strParse.indexOf('"', iCurrentIndex + 1);
	          if (iNextIndex == -1) {
	            throw new Exception("Incorrect input. " + strParse
	                + " No double quote following the one" + " at location " + iCurrentIndex);
	          }
	          lstElements.add(strParse.substring(iCurrentIndex + 1, iNextIndex));
	          iCurrentIndex = iNextIndex + 1;
	          if (strParse.substring(iCurrentIndex).startsWith(strDel)) {
	            iCurrentIndex += iDelLength;
	          }
	        } else {
	          // Find next separator and treat the things in the middle as
	          // single element
	          iNextIndex = strParse.indexOf(strDel, iCurrentIndex);
	          if (iNextIndex == -1) {
	            // No other delimiter found so take the rest of the string
	            lstElements.add(strParse.substring(iCurrentIndex));
	            iCurrentIndex = iParseLength;
	          } else {
	            lstElements.add(strParse.substring(iCurrentIndex, iNextIndex));
	            iCurrentIndex = iNextIndex + iDelLength;
	          }
	        }
	      }
	    }

	    return lstElements;
	  }
} //EntryImpl
