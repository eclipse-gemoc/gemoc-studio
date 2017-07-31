/**
 */
package org.eclipse.gemoc.gexpressions.tests;

import junit.textui.TestRunner;

import org.eclipse.gemoc.gexpressions.GIfExpression;
import org.eclipse.gemoc.gexpressions.GexpressionsFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>GIf Expression</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class GIfExpressionTest extends GPrimaryExpressionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(GIfExpressionTest.class);
	}

	/**
	 * Constructs a new GIf Expression test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GIfExpressionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this GIf Expression test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected GIfExpression getFixture() {
		return (GIfExpression)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(GexpressionsFactory.eINSTANCE.createGIfExpression());
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

} //GIfExpressionTest
