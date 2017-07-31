/**
 */
package test;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link test.State#getKind <em>Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @see test.TestPackage#getState()
 * @model
 * @generated
 */
public interface State extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link test.Kind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see test.Kind
	 * @see #setKind(Kind)
	 * @see test.TestPackage#getState_Kind()
	 * @model required="true"
	 * @generated
	 */
	Kind getKind();

	/**
	 * Sets the value of the '{@link test.State#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see test.Kind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(Kind value);

} // State
