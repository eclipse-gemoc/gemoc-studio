/**
 */
package org.tetrabox.minijava.xtext.miniJava;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage
 * @generated
 */
public interface MiniJavaFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MiniJavaFactory eINSTANCE = org.tetrabox.minijava.xtext.miniJava.impl.MiniJavaFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Program</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Program</em>'.
	 * @generated
	 */
	Program createProgram();

	/**
	 * Returns a new object of class '<em>Import</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Import</em>'.
	 * @generated
	 */
	Import createImport();

	/**
	 * Returns a new object of class '<em>Type Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Declaration</em>'.
	 * @generated
	 */
	TypeDeclaration createTypeDeclaration();

	/**
	 * Returns a new object of class '<em>Clazz</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Clazz</em>'.
	 * @generated
	 */
	Clazz createClazz();

	/**
	 * Returns a new object of class '<em>Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interface</em>'.
	 * @generated
	 */
	Interface createInterface();

	/**
	 * Returns a new object of class '<em>Member</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Member</em>'.
	 * @generated
	 */
	Member createMember();

	/**
	 * Returns a new object of class '<em>Method</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Method</em>'.
	 * @generated
	 */
	Method createMethod();

	/**
	 * Returns a new object of class '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter</em>'.
	 * @generated
	 */
	Parameter createParameter();

	/**
	 * Returns a new object of class '<em>Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Field</em>'.
	 * @generated
	 */
	Field createField();

	/**
	 * Returns a new object of class '<em>Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Block</em>'.
	 * @generated
	 */
	Block createBlock();

	/**
	 * Returns a new object of class '<em>Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Statement</em>'.
	 * @generated
	 */
	Statement createStatement();

	/**
	 * Returns a new object of class '<em>Print Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Print Statement</em>'.
	 * @generated
	 */
	PrintStatement createPrintStatement();

	/**
	 * Returns a new object of class '<em>Return</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Return</em>'.
	 * @generated
	 */
	Return createReturn();

	/**
	 * Returns a new object of class '<em>If Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>If Statement</em>'.
	 * @generated
	 */
	IfStatement createIfStatement();

	/**
	 * Returns a new object of class '<em>While Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>While Statement</em>'.
	 * @generated
	 */
	WhileStatement createWhileStatement();

	/**
	 * Returns a new object of class '<em>For Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>For Statement</em>'.
	 * @generated
	 */
	ForStatement createForStatement();

	/**
	 * Returns a new object of class '<em>Type Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Ref</em>'.
	 * @generated
	 */
	TypeRef createTypeRef();

	/**
	 * Returns a new object of class '<em>Single Type Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Single Type Ref</em>'.
	 * @generated
	 */
	SingleTypeRef createSingleTypeRef();

	/**
	 * Returns a new object of class '<em>Class Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class Ref</em>'.
	 * @generated
	 */
	ClassRef createClassRef();

	/**
	 * Returns a new object of class '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Named Element</em>'.
	 * @generated
	 */
	NamedElement createNamedElement();

	/**
	 * Returns a new object of class '<em>Typed Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Typed Declaration</em>'.
	 * @generated
	 */
	TypedDeclaration createTypedDeclaration();

	/**
	 * Returns a new object of class '<em>Symbol</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Symbol</em>'.
	 * @generated
	 */
	Symbol createSymbol();

	/**
	 * Returns a new object of class '<em>Variable Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable Declaration</em>'.
	 * @generated
	 */
	VariableDeclaration createVariableDeclaration();

	/**
	 * Returns a new object of class '<em>Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assignment</em>'.
	 * @generated
	 */
	Assignment createAssignment();

	/**
	 * Returns a new object of class '<em>Assignee</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assignee</em>'.
	 * @generated
	 */
	Assignee createAssignee();

	/**
	 * Returns a new object of class '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression</em>'.
	 * @generated
	 */
	Expression createExpression();

	/**
	 * Returns a new object of class '<em>Array Type Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Array Type Ref</em>'.
	 * @generated
	 */
	ArrayTypeRef createArrayTypeRef();

	/**
	 * Returns a new object of class '<em>Integer Type Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Type Ref</em>'.
	 * @generated
	 */
	IntegerTypeRef createIntegerTypeRef();

	/**
	 * Returns a new object of class '<em>Boolean Type Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Type Ref</em>'.
	 * @generated
	 */
	BooleanTypeRef createBooleanTypeRef();

	/**
	 * Returns a new object of class '<em>String Type Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Type Ref</em>'.
	 * @generated
	 */
	StringTypeRef createStringTypeRef();

	/**
	 * Returns a new object of class '<em>Void Type Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Void Type Ref</em>'.
	 * @generated
	 */
	VoidTypeRef createVoidTypeRef();

	/**
	 * Returns a new object of class '<em>Or</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Or</em>'.
	 * @generated
	 */
	Or createOr();

	/**
	 * Returns a new object of class '<em>And</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>And</em>'.
	 * @generated
	 */
	And createAnd();

	/**
	 * Returns a new object of class '<em>Equality</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Equality</em>'.
	 * @generated
	 */
	Equality createEquality();

	/**
	 * Returns a new object of class '<em>Inequality</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inequality</em>'.
	 * @generated
	 */
	Inequality createInequality();

	/**
	 * Returns a new object of class '<em>Superior Or Equal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Superior Or Equal</em>'.
	 * @generated
	 */
	SuperiorOrEqual createSuperiorOrEqual();

	/**
	 * Returns a new object of class '<em>Inferior Or Equal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inferior Or Equal</em>'.
	 * @generated
	 */
	InferiorOrEqual createInferiorOrEqual();

	/**
	 * Returns a new object of class '<em>Superior</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Superior</em>'.
	 * @generated
	 */
	Superior createSuperior();

	/**
	 * Returns a new object of class '<em>Inferior</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inferior</em>'.
	 * @generated
	 */
	Inferior createInferior();

	/**
	 * Returns a new object of class '<em>Plus</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plus</em>'.
	 * @generated
	 */
	Plus createPlus();

	/**
	 * Returns a new object of class '<em>Minus</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Minus</em>'.
	 * @generated
	 */
	Minus createMinus();

	/**
	 * Returns a new object of class '<em>Multiplication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multiplication</em>'.
	 * @generated
	 */
	Multiplication createMultiplication();

	/**
	 * Returns a new object of class '<em>Division</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Division</em>'.
	 * @generated
	 */
	Division createDivision();

	/**
	 * Returns a new object of class '<em>Array Access</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Array Access</em>'.
	 * @generated
	 */
	ArrayAccess createArrayAccess();

	/**
	 * Returns a new object of class '<em>Array Length</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Array Length</em>'.
	 * @generated
	 */
	ArrayLength createArrayLength();

	/**
	 * Returns a new object of class '<em>Not</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Not</em>'.
	 * @generated
	 */
	Not createNot();

	/**
	 * Returns a new object of class '<em>Neg</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Neg</em>'.
	 * @generated
	 */
	Neg createNeg();

	/**
	 * Returns a new object of class '<em>Field Access</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Field Access</em>'.
	 * @generated
	 */
	FieldAccess createFieldAccess();

	/**
	 * Returns a new object of class '<em>Method Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Method Call</em>'.
	 * @generated
	 */
	MethodCall createMethodCall();

	/**
	 * Returns a new object of class '<em>String Constant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Constant</em>'.
	 * @generated
	 */
	StringConstant createStringConstant();

	/**
	 * Returns a new object of class '<em>Int Constant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Int Constant</em>'.
	 * @generated
	 */
	IntConstant createIntConstant();

	/**
	 * Returns a new object of class '<em>Bool Constant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bool Constant</em>'.
	 * @generated
	 */
	BoolConstant createBoolConstant();

	/**
	 * Returns a new object of class '<em>This</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>This</em>'.
	 * @generated
	 */
	This createThis();

	/**
	 * Returns a new object of class '<em>Super</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Super</em>'.
	 * @generated
	 */
	Super createSuper();

	/**
	 * Returns a new object of class '<em>Null</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Null</em>'.
	 * @generated
	 */
	Null createNull();

	/**
	 * Returns a new object of class '<em>New Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>New Object</em>'.
	 * @generated
	 */
	NewObject createNewObject();

	/**
	 * Returns a new object of class '<em>New Array</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>New Array</em>'.
	 * @generated
	 */
	NewArray createNewArray();

	/**
	 * Returns a new object of class '<em>Symbol Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Symbol Ref</em>'.
	 * @generated
	 */
	SymbolRef createSymbolRef();

	/**
	 * Returns a new object of class '<em>Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Context</em>'.
	 * @generated
	 */
	Context createContext();

	/**
	 * Returns a new object of class '<em>Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value</em>'.
	 * @generated
	 */
	Value createValue();

	/**
	 * Returns a new object of class '<em>Integer Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Value</em>'.
	 * @generated
	 */
	IntegerValue createIntegerValue();

	/**
	 * Returns a new object of class '<em>Symbol Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Symbol Binding</em>'.
	 * @generated
	 */
	SymbolBinding createSymbolBinding();

	/**
	 * Returns a new object of class '<em>Field Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Field Binding</em>'.
	 * @generated
	 */
	FieldBinding createFieldBinding();

	/**
	 * Returns a new object of class '<em>String Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Value</em>'.
	 * @generated
	 */
	StringValue createStringValue();

	/**
	 * Returns a new object of class '<em>Boolean Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Value</em>'.
	 * @generated
	 */
	BooleanValue createBooleanValue();

	/**
	 * Returns a new object of class '<em>Output Stream</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Output Stream</em>'.
	 * @generated
	 */
	OutputStream createOutputStream();

	/**
	 * Returns a new object of class '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State</em>'.
	 * @generated
	 */
	State createState();

	/**
	 * Returns a new object of class '<em>Frame</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Frame</em>'.
	 * @generated
	 */
	Frame createFrame();

	/**
	 * Returns a new object of class '<em>Null Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Null Value</em>'.
	 * @generated
	 */
	NullValue createNullValue();

	/**
	 * Returns a new object of class '<em>New Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>New Call</em>'.
	 * @generated
	 */
	NewCall createNewCall();

	/**
	 * Returns a new object of class '<em>Method Call2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Method Call2</em>'.
	 * @generated
	 */
	MethodCall2 createMethodCall2();

	/**
	 * Returns a new object of class '<em>Object Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Instance</em>'.
	 * @generated
	 */
	ObjectInstance createObjectInstance();

	/**
	 * Returns a new object of class '<em>Array Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Array Instance</em>'.
	 * @generated
	 */
	ArrayInstance createArrayInstance();

	/**
	 * Returns a new object of class '<em>Object Ref Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Ref Value</em>'.
	 * @generated
	 */
	ObjectRefValue createObjectRefValue();

	/**
	 * Returns a new object of class '<em>Array Ref Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Array Ref Value</em>'.
	 * @generated
	 */
	ArrayRefValue createArrayRefValue();

	/**
	 * Returns a new object of class '<em>Modulo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modulo</em>'.
	 * @generated
	 */
	Modulo createModulo();

	/**
	 * Returns a new object of class '<em>Native Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Native Expression</em>'.
	 * @generated
	 */
	NativeExpression createNativeExpression();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MiniJavaPackage getMiniJavaPackage();

} //MiniJavaFactory
