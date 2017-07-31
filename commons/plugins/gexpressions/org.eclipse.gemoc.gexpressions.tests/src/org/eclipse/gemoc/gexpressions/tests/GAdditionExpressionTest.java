/**
 */
package org.eclipse.gemoc.gexpressions.tests;

import junit.textui.TestRunner;

import org.eclipse.gemoc.gexpressions.GAdditionExpression;
import org.eclipse.gemoc.gexpressions.GexpressionsFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>GAddition Expression</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class GAdditionExpressionTest extends GBinaryOperatorExpressionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(GAdditionExpressionTest.class);
	}

	/**
	 * Constructs a new GAddition Expression test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GAdditionExpressionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this GAddition Expression test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected GAdditionExpression getFixture() {
		return (GAdditionExpression)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(GexpressionsFactory.eINSTANCE.createGAdditionExpression());
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

} //GAdditionExpressionTest
