/**
 */
package org.eclipse.gemoc.gexpressions.tests;

import junit.textui.TestRunner;

import org.eclipse.gemoc.gexpressions.GStringExpression;
import org.eclipse.gemoc.gexpressions.GexpressionsFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>GString Expression</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class GStringExpressionTest extends GPrimaryExpressionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(GStringExpressionTest.class);
	}

	/**
	 * Constructs a new GString Expression test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GStringExpressionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this GString Expression test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected GStringExpression getFixture() {
		return (GStringExpression)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(GexpressionsFactory.eINSTANCE.createGStringExpression());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //GStringExpressionTest
