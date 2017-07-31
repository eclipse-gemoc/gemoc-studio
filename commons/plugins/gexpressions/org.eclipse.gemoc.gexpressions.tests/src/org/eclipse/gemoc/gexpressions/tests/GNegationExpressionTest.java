/**
 */
package org.eclipse.gemoc.gexpressions.tests;

import junit.textui.TestRunner;

import org.eclipse.gemoc.gexpressions.GNegationExpression;
import org.eclipse.gemoc.gexpressions.GexpressionsFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>GNegation Expression</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class GNegationExpressionTest extends GUnaryOperatorExpressionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(GNegationExpressionTest.class);
	}

	/**
	 * Constructs a new GNegation Expression test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GNegationExpressionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this GNegation Expression test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected GNegationExpression getFixture() {
		return (GNegationExpression)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(GexpressionsFactory.eINSTANCE.createGNegationExpression());
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

} //GNegationExpressionTest
