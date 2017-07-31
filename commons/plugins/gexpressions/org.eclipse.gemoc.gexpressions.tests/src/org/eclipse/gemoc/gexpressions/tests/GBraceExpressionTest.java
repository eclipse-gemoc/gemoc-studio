/**
 */
package org.eclipse.gemoc.gexpressions.tests;

import junit.textui.TestRunner;

import org.eclipse.gemoc.gexpressions.GBraceExpression;
import org.eclipse.gemoc.gexpressions.GexpressionsFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>GBrace Expression</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class GBraceExpressionTest extends GPrimaryExpressionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(GBraceExpressionTest.class);
	}

	/**
	 * Constructs a new GBrace Expression test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GBraceExpressionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this GBrace Expression test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected GBraceExpression getFixture() {
		return (GBraceExpression)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(GexpressionsFactory.eINSTANCE.createGBraceExpression());
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

} //GBraceExpressionTest
