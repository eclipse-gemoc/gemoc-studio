/**
 */
package org.tetrabox.minijava.xtext.miniJava.impl;

import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.tetrabox.minijava.xtext.miniJava.AccessLevel;
import org.tetrabox.minijava.xtext.miniJava.And;
import org.tetrabox.minijava.xtext.miniJava.ArrayAccess;
import org.tetrabox.minijava.xtext.miniJava.ArrayInstance;
import org.tetrabox.minijava.xtext.miniJava.ArrayLength;
import org.tetrabox.minijava.xtext.miniJava.ArrayRefValue;
import org.tetrabox.minijava.xtext.miniJava.ArrayTypeRef;
import org.tetrabox.minijava.xtext.miniJava.Assignee;
import org.tetrabox.minijava.xtext.miniJava.Assignment;
import org.tetrabox.minijava.xtext.miniJava.Block;
import org.tetrabox.minijava.xtext.miniJava.BoolConstant;
import org.tetrabox.minijava.xtext.miniJava.BooleanTypeRef;
import org.tetrabox.minijava.xtext.miniJava.BooleanValue;
import org.tetrabox.minijava.xtext.miniJava.Call;
import org.tetrabox.minijava.xtext.miniJava.ClassRef;
import org.tetrabox.minijava.xtext.miniJava.Clazz;
import org.tetrabox.minijava.xtext.miniJava.Context;
import org.tetrabox.minijava.xtext.miniJava.Division;
import org.tetrabox.minijava.xtext.miniJava.Equality;
import org.tetrabox.minijava.xtext.miniJava.Expression;
import org.tetrabox.minijava.xtext.miniJava.Field;
import org.tetrabox.minijava.xtext.miniJava.FieldAccess;
import org.tetrabox.minijava.xtext.miniJava.FieldBinding;
import org.tetrabox.minijava.xtext.miniJava.ForStatement;
import org.tetrabox.minijava.xtext.miniJava.Frame;
import org.tetrabox.minijava.xtext.miniJava.IfStatement;
import org.tetrabox.minijava.xtext.miniJava.Import;
import org.tetrabox.minijava.xtext.miniJava.Inequality;
import org.tetrabox.minijava.xtext.miniJava.Inferior;
import org.tetrabox.minijava.xtext.miniJava.InferiorOrEqual;
import org.tetrabox.minijava.xtext.miniJava.IntConstant;
import org.tetrabox.minijava.xtext.miniJava.IntegerTypeRef;
import org.tetrabox.minijava.xtext.miniJava.IntegerValue;
import org.tetrabox.minijava.xtext.miniJava.Interface;
import org.tetrabox.minijava.xtext.miniJava.Member;
import org.tetrabox.minijava.xtext.miniJava.Method;
import org.tetrabox.minijava.xtext.miniJava.MethodCall;
import org.tetrabox.minijava.xtext.miniJava.MethodCall2;
import org.tetrabox.minijava.xtext.miniJava.MiniJavaFactory;
import org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage;
import org.tetrabox.minijava.xtext.miniJava.Minus;
import org.tetrabox.minijava.xtext.miniJava.Modulo;
import org.tetrabox.minijava.xtext.miniJava.Multiplication;
import org.tetrabox.minijava.xtext.miniJava.NamedElement;
import org.tetrabox.minijava.xtext.miniJava.NativeExpression;
import org.tetrabox.minijava.xtext.miniJava.Neg;
import org.tetrabox.minijava.xtext.miniJava.NewArray;
import org.tetrabox.minijava.xtext.miniJava.NewCall;
import org.tetrabox.minijava.xtext.miniJava.NewObject;
import org.tetrabox.minijava.xtext.miniJava.Not;
import org.tetrabox.minijava.xtext.miniJava.Null;
import org.tetrabox.minijava.xtext.miniJava.NullValue;
import org.tetrabox.minijava.xtext.miniJava.ObjectInstance;
import org.tetrabox.minijava.xtext.miniJava.ObjectRefValue;
import org.tetrabox.minijava.xtext.miniJava.Or;
import org.tetrabox.minijava.xtext.miniJava.OutputStream;
import org.tetrabox.minijava.xtext.miniJava.Parameter;
import org.tetrabox.minijava.xtext.miniJava.Plus;
import org.tetrabox.minijava.xtext.miniJava.PrintStatement;
import org.tetrabox.minijava.xtext.miniJava.Program;
import org.tetrabox.minijava.xtext.miniJava.Return;
import org.tetrabox.minijava.xtext.miniJava.SingleTypeRef;
import org.tetrabox.minijava.xtext.miniJava.State;
import org.tetrabox.minijava.xtext.miniJava.Statement;
import org.tetrabox.minijava.xtext.miniJava.StringConstant;
import org.tetrabox.minijava.xtext.miniJava.StringTypeRef;
import org.tetrabox.minijava.xtext.miniJava.StringValue;
import org.tetrabox.minijava.xtext.miniJava.Super;
import org.tetrabox.minijava.xtext.miniJava.Superior;
import org.tetrabox.minijava.xtext.miniJava.SuperiorOrEqual;
import org.tetrabox.minijava.xtext.miniJava.Symbol;
import org.tetrabox.minijava.xtext.miniJava.SymbolBinding;
import org.tetrabox.minijava.xtext.miniJava.SymbolRef;
import org.tetrabox.minijava.xtext.miniJava.This;
import org.tetrabox.minijava.xtext.miniJava.TypeDeclaration;
import org.tetrabox.minijava.xtext.miniJava.TypeRef;
import org.tetrabox.minijava.xtext.miniJava.TypedDeclaration;
import org.tetrabox.minijava.xtext.miniJava.Value;
import org.tetrabox.minijava.xtext.miniJava.VariableDeclaration;
import org.tetrabox.minijava.xtext.miniJava.VoidTypeRef;
import org.tetrabox.minijava.xtext.miniJava.WhileStatement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MiniJavaPackageImpl extends EPackageImpl implements MiniJavaPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass programEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass importEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clazzEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass printStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass returnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ifStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass whileStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleTypeRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typedDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass symbolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assigneeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayTypeRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerTypeRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanTypeRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringTypeRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass voidTypeRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass andEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass equalityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inequalityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass superiorOrEqualEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inferiorOrEqualEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass superiorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inferiorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass plusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass minusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiplicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass divisionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayAccessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayLengthEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass negEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldAccessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringConstantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intConstantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boolConstantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass thisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass superEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nullEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass newObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass newArrayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass symbolRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass symbolBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputStreamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass frameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nullValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass newCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodCall2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectRefValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayRefValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass symbolToSymbolBindingMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clazzToMethodMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduloEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nativeExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum accessLevelEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MiniJavaPackageImpl() {
		super(eNS_URI, MiniJavaFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link MiniJavaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MiniJavaPackage init() {
		if (isInited) return (MiniJavaPackage)EPackage.Registry.INSTANCE.getEPackage(MiniJavaPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMiniJavaPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MiniJavaPackageImpl theMiniJavaPackage = registeredMiniJavaPackage instanceof MiniJavaPackageImpl ? (MiniJavaPackageImpl)registeredMiniJavaPackage : new MiniJavaPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theMiniJavaPackage.createPackageContents();

		// Initialize created meta-data
		theMiniJavaPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMiniJavaPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MiniJavaPackage.eNS_URI, theMiniJavaPackage);
		return theMiniJavaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProgram() {
		return programEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProgram_Name() {
		return (EAttribute)programEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgram_Imports() {
		return (EReference)programEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgram_Classes() {
		return (EReference)programEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImport() {
		return importEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImport_ImportedNamespace() {
		return (EAttribute)importEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeDeclaration() {
		return typeDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeDeclaration_AccessLevel() {
		return (EAttribute)typeDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeDeclaration_Implementz() {
		return (EReference)typeDeclarationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeDeclaration_Members() {
		return (EReference)typeDeclarationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClazz() {
		return clazzEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClazz_Isabstract() {
		return (EAttribute)clazzEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClazz_SuperClass() {
		return (EReference)clazzEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterface() {
		return interfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMember() {
		return memberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMember_Access() {
		return (EAttribute)memberEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMethod() {
		return methodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethod_Isabstract() {
		return (EAttribute)methodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethod_Isstatic() {
		return (EAttribute)methodEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethod_Params() {
		return (EReference)methodEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethod_Body() {
		return (EReference)methodEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethod_Cache() {
		return (EReference)methodEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getField() {
		return fieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getField_DefaultValue() {
		return (EReference)fieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlock() {
		return blockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlock_Statements() {
		return (EReference)blockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatement() {
		return statementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrintStatement() {
		return printStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrintStatement_Expression() {
		return (EReference)printStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReturn() {
		return returnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReturn_Expression() {
		return (EReference)returnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIfStatement() {
		return ifStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIfStatement_Expression() {
		return (EReference)ifStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIfStatement_ThenBlock() {
		return (EReference)ifStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIfStatement_ElseBlock() {
		return (EReference)ifStatementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWhileStatement() {
		return whileStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWhileStatement_Condition() {
		return (EReference)whileStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWhileStatement_Block() {
		return (EReference)whileStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForStatement() {
		return forStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForStatement_Declaration() {
		return (EReference)forStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForStatement_Condition() {
		return (EReference)forStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForStatement_Progression() {
		return (EReference)forStatementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForStatement_Block() {
		return (EReference)forStatementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeRef() {
		return typeRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSingleTypeRef() {
		return singleTypeRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassRef() {
		return classRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassRef_ReferencedClass() {
		return (EReference)classRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypedDeclaration() {
		return typedDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypedDeclaration_TypeRef() {
		return (EReference)typedDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSymbol() {
		return symbolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableDeclaration() {
		return variableDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssignment() {
		return assignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignment_Assignee() {
		return (EReference)assignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignment_Value() {
		return (EReference)assignmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssignee() {
		return assigneeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression() {
		return expressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArrayTypeRef() {
		return arrayTypeRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrayTypeRef_TypeRef() {
		return (EReference)arrayTypeRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerTypeRef() {
		return integerTypeRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanTypeRef() {
		return booleanTypeRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringTypeRef() {
		return stringTypeRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVoidTypeRef() {
		return voidTypeRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOr() {
		return orEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOr_Left() {
		return (EReference)orEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOr_Right() {
		return (EReference)orEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnd() {
		return andEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnd_Left() {
		return (EReference)andEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnd_Right() {
		return (EReference)andEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEquality() {
		return equalityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEquality_Left() {
		return (EReference)equalityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEquality_Right() {
		return (EReference)equalityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInequality() {
		return inequalityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInequality_Left() {
		return (EReference)inequalityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInequality_Right() {
		return (EReference)inequalityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSuperiorOrEqual() {
		return superiorOrEqualEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSuperiorOrEqual_Left() {
		return (EReference)superiorOrEqualEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSuperiorOrEqual_Right() {
		return (EReference)superiorOrEqualEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInferiorOrEqual() {
		return inferiorOrEqualEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInferiorOrEqual_Left() {
		return (EReference)inferiorOrEqualEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInferiorOrEqual_Right() {
		return (EReference)inferiorOrEqualEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSuperior() {
		return superiorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSuperior_Left() {
		return (EReference)superiorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSuperior_Right() {
		return (EReference)superiorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInferior() {
		return inferiorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInferior_Left() {
		return (EReference)inferiorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInferior_Right() {
		return (EReference)inferiorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlus() {
		return plusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlus_Left() {
		return (EReference)plusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlus_Right() {
		return (EReference)plusEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMinus() {
		return minusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMinus_Left() {
		return (EReference)minusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMinus_Right() {
		return (EReference)minusEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiplication() {
		return multiplicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiplication_Left() {
		return (EReference)multiplicationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiplication_Right() {
		return (EReference)multiplicationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDivision() {
		return divisionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDivision_Left() {
		return (EReference)divisionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDivision_Right() {
		return (EReference)divisionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArrayAccess() {
		return arrayAccessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrayAccess_Object() {
		return (EReference)arrayAccessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrayAccess_Index() {
		return (EReference)arrayAccessEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArrayLength() {
		return arrayLengthEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrayLength_Array() {
		return (EReference)arrayLengthEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNot() {
		return notEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNot_Expression() {
		return (EReference)notEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNeg() {
		return negEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNeg_Expression() {
		return (EReference)negEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFieldAccess() {
		return fieldAccessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFieldAccess_Receiver() {
		return (EReference)fieldAccessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFieldAccess_Field() {
		return (EReference)fieldAccessEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMethodCall() {
		return methodCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodCall_Receiver() {
		return (EReference)methodCallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodCall_Method() {
		return (EReference)methodCallEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodCall_Args() {
		return (EReference)methodCallEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringConstant() {
		return stringConstantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringConstant_Value() {
		return (EAttribute)stringConstantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntConstant() {
		return intConstantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntConstant_Value() {
		return (EAttribute)intConstantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoolConstant() {
		return boolConstantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBoolConstant_Value() {
		return (EAttribute)boolConstantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThis() {
		return thisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSuper() {
		return superEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNull() {
		return nullEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNewObject() {
		return newObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNewObject_Type() {
		return (EReference)newObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNewObject_Args() {
		return (EReference)newObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNewArray() {
		return newArrayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNewArray_Type() {
		return (EReference)newArrayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNewArray_Size() {
		return (EReference)newArrayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSymbolRef() {
		return symbolRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSymbolRef_Symbol() {
		return (EReference)symbolRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContext() {
		return contextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContext_Bindings() {
		return (EReference)contextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContext_ParentContext() {
		return (EReference)contextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContext_ChildContext() {
		return (EReference)contextEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContext_Cache() {
		return (EReference)contextEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValue() {
		return valueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerValue() {
		return integerValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerValue_Value() {
		return (EAttribute)integerValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSymbolBinding() {
		return symbolBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSymbolBinding_Value() {
		return (EReference)symbolBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSymbolBinding_Symbol() {
		return (EReference)symbolBindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFieldBinding() {
		return fieldBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFieldBinding_Field() {
		return (EReference)fieldBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFieldBinding_Value() {
		return (EReference)fieldBindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringValue() {
		return stringValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringValue_Value() {
		return (EAttribute)stringValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanValue() {
		return booleanValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanValue_Value() {
		return (EAttribute)booleanValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputStream() {
		return outputStreamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputStream_Stream() {
		return (EAttribute)outputStreamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getState() {
		return stateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_RootFrame() {
		return (EReference)stateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_ObjectsHeap() {
		return (EReference)stateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_OutputStream() {
		return (EReference)stateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_ArraysHeap() {
		return (EReference)stateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_ContextCache() {
		return (EReference)stateEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_FrameCache() {
		return (EReference)stateEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFrame() {
		return frameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFrame_Call() {
		return (EReference)frameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFrame_Instance() {
		return (EReference)frameEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFrame_ChildFrame() {
		return (EReference)frameEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFrame_ParentFrame() {
		return (EReference)frameEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFrame_RootContext() {
		return (EReference)frameEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFrame_ReturnValue() {
		return (EReference)frameEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNullValue() {
		return nullValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCall() {
		return callEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNewCall() {
		return newCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNewCall_Newz() {
		return (EReference)newCallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMethodCall2() {
		return methodCall2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodCall2_Methodcall() {
		return (EReference)methodCall2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectInstance() {
		return objectInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectInstance_Fieldbindings() {
		return (EReference)objectInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectInstance_Type() {
		return (EReference)objectInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArrayInstance() {
		return arrayInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrayInstance_Value() {
		return (EReference)arrayInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArrayInstance_Size() {
		return (EAttribute)arrayInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectRefValue() {
		return objectRefValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectRefValue_Instance() {
		return (EReference)objectRefValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArrayRefValue() {
		return arrayRefValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrayRefValue_Instance() {
		return (EReference)arrayRefValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSymbolToSymbolBindingMap() {
		return symbolToSymbolBindingMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSymbolToSymbolBindingMap_Key() {
		return (EReference)symbolToSymbolBindingMapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSymbolToSymbolBindingMap_Value() {
		return (EReference)symbolToSymbolBindingMapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClazzToMethodMap() {
		return clazzToMethodMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClazzToMethodMap_Key() {
		return (EReference)clazzToMethodMapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClazzToMethodMap_Value() {
		return (EReference)clazzToMethodMapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModulo() {
		return moduloEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModulo_Left() {
		return (EReference)moduloEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModulo_Right() {
		return (EReference)moduloEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNativeExpression() {
		return nativeExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNativeExpression_Value() {
		return (EAttribute)nativeExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAccessLevel() {
		return accessLevelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MiniJavaFactory getMiniJavaFactory() {
		return (MiniJavaFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		programEClass = createEClass(PROGRAM);
		createEAttribute(programEClass, PROGRAM__NAME);
		createEReference(programEClass, PROGRAM__IMPORTS);
		createEReference(programEClass, PROGRAM__CLASSES);

		importEClass = createEClass(IMPORT);
		createEAttribute(importEClass, IMPORT__IMPORTED_NAMESPACE);

		typeDeclarationEClass = createEClass(TYPE_DECLARATION);
		createEAttribute(typeDeclarationEClass, TYPE_DECLARATION__ACCESS_LEVEL);
		createEReference(typeDeclarationEClass, TYPE_DECLARATION__IMPLEMENTZ);
		createEReference(typeDeclarationEClass, TYPE_DECLARATION__MEMBERS);

		clazzEClass = createEClass(CLAZZ);
		createEAttribute(clazzEClass, CLAZZ__ISABSTRACT);
		createEReference(clazzEClass, CLAZZ__SUPER_CLASS);

		interfaceEClass = createEClass(INTERFACE);

		memberEClass = createEClass(MEMBER);
		createEAttribute(memberEClass, MEMBER__ACCESS);

		methodEClass = createEClass(METHOD);
		createEAttribute(methodEClass, METHOD__ISABSTRACT);
		createEAttribute(methodEClass, METHOD__ISSTATIC);
		createEReference(methodEClass, METHOD__PARAMS);
		createEReference(methodEClass, METHOD__BODY);
		createEReference(methodEClass, METHOD__CACHE);

		parameterEClass = createEClass(PARAMETER);

		fieldEClass = createEClass(FIELD);
		createEReference(fieldEClass, FIELD__DEFAULT_VALUE);

		blockEClass = createEClass(BLOCK);
		createEReference(blockEClass, BLOCK__STATEMENTS);

		statementEClass = createEClass(STATEMENT);

		printStatementEClass = createEClass(PRINT_STATEMENT);
		createEReference(printStatementEClass, PRINT_STATEMENT__EXPRESSION);

		returnEClass = createEClass(RETURN);
		createEReference(returnEClass, RETURN__EXPRESSION);

		ifStatementEClass = createEClass(IF_STATEMENT);
		createEReference(ifStatementEClass, IF_STATEMENT__EXPRESSION);
		createEReference(ifStatementEClass, IF_STATEMENT__THEN_BLOCK);
		createEReference(ifStatementEClass, IF_STATEMENT__ELSE_BLOCK);

		whileStatementEClass = createEClass(WHILE_STATEMENT);
		createEReference(whileStatementEClass, WHILE_STATEMENT__CONDITION);
		createEReference(whileStatementEClass, WHILE_STATEMENT__BLOCK);

		forStatementEClass = createEClass(FOR_STATEMENT);
		createEReference(forStatementEClass, FOR_STATEMENT__DECLARATION);
		createEReference(forStatementEClass, FOR_STATEMENT__CONDITION);
		createEReference(forStatementEClass, FOR_STATEMENT__PROGRESSION);
		createEReference(forStatementEClass, FOR_STATEMENT__BLOCK);

		typeRefEClass = createEClass(TYPE_REF);

		singleTypeRefEClass = createEClass(SINGLE_TYPE_REF);

		classRefEClass = createEClass(CLASS_REF);
		createEReference(classRefEClass, CLASS_REF__REFERENCED_CLASS);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		typedDeclarationEClass = createEClass(TYPED_DECLARATION);
		createEReference(typedDeclarationEClass, TYPED_DECLARATION__TYPE_REF);

		symbolEClass = createEClass(SYMBOL);

		variableDeclarationEClass = createEClass(VARIABLE_DECLARATION);

		assignmentEClass = createEClass(ASSIGNMENT);
		createEReference(assignmentEClass, ASSIGNMENT__ASSIGNEE);
		createEReference(assignmentEClass, ASSIGNMENT__VALUE);

		assigneeEClass = createEClass(ASSIGNEE);

		expressionEClass = createEClass(EXPRESSION);

		arrayTypeRefEClass = createEClass(ARRAY_TYPE_REF);
		createEReference(arrayTypeRefEClass, ARRAY_TYPE_REF__TYPE_REF);

		integerTypeRefEClass = createEClass(INTEGER_TYPE_REF);

		booleanTypeRefEClass = createEClass(BOOLEAN_TYPE_REF);

		stringTypeRefEClass = createEClass(STRING_TYPE_REF);

		voidTypeRefEClass = createEClass(VOID_TYPE_REF);

		orEClass = createEClass(OR);
		createEReference(orEClass, OR__LEFT);
		createEReference(orEClass, OR__RIGHT);

		andEClass = createEClass(AND);
		createEReference(andEClass, AND__LEFT);
		createEReference(andEClass, AND__RIGHT);

		equalityEClass = createEClass(EQUALITY);
		createEReference(equalityEClass, EQUALITY__LEFT);
		createEReference(equalityEClass, EQUALITY__RIGHT);

		inequalityEClass = createEClass(INEQUALITY);
		createEReference(inequalityEClass, INEQUALITY__LEFT);
		createEReference(inequalityEClass, INEQUALITY__RIGHT);

		superiorOrEqualEClass = createEClass(SUPERIOR_OR_EQUAL);
		createEReference(superiorOrEqualEClass, SUPERIOR_OR_EQUAL__LEFT);
		createEReference(superiorOrEqualEClass, SUPERIOR_OR_EQUAL__RIGHT);

		inferiorOrEqualEClass = createEClass(INFERIOR_OR_EQUAL);
		createEReference(inferiorOrEqualEClass, INFERIOR_OR_EQUAL__LEFT);
		createEReference(inferiorOrEqualEClass, INFERIOR_OR_EQUAL__RIGHT);

		superiorEClass = createEClass(SUPERIOR);
		createEReference(superiorEClass, SUPERIOR__LEFT);
		createEReference(superiorEClass, SUPERIOR__RIGHT);

		inferiorEClass = createEClass(INFERIOR);
		createEReference(inferiorEClass, INFERIOR__LEFT);
		createEReference(inferiorEClass, INFERIOR__RIGHT);

		plusEClass = createEClass(PLUS);
		createEReference(plusEClass, PLUS__LEFT);
		createEReference(plusEClass, PLUS__RIGHT);

		minusEClass = createEClass(MINUS);
		createEReference(minusEClass, MINUS__LEFT);
		createEReference(minusEClass, MINUS__RIGHT);

		multiplicationEClass = createEClass(MULTIPLICATION);
		createEReference(multiplicationEClass, MULTIPLICATION__LEFT);
		createEReference(multiplicationEClass, MULTIPLICATION__RIGHT);

		divisionEClass = createEClass(DIVISION);
		createEReference(divisionEClass, DIVISION__LEFT);
		createEReference(divisionEClass, DIVISION__RIGHT);

		arrayAccessEClass = createEClass(ARRAY_ACCESS);
		createEReference(arrayAccessEClass, ARRAY_ACCESS__OBJECT);
		createEReference(arrayAccessEClass, ARRAY_ACCESS__INDEX);

		arrayLengthEClass = createEClass(ARRAY_LENGTH);
		createEReference(arrayLengthEClass, ARRAY_LENGTH__ARRAY);

		notEClass = createEClass(NOT);
		createEReference(notEClass, NOT__EXPRESSION);

		negEClass = createEClass(NEG);
		createEReference(negEClass, NEG__EXPRESSION);

		fieldAccessEClass = createEClass(FIELD_ACCESS);
		createEReference(fieldAccessEClass, FIELD_ACCESS__RECEIVER);
		createEReference(fieldAccessEClass, FIELD_ACCESS__FIELD);

		methodCallEClass = createEClass(METHOD_CALL);
		createEReference(methodCallEClass, METHOD_CALL__RECEIVER);
		createEReference(methodCallEClass, METHOD_CALL__METHOD);
		createEReference(methodCallEClass, METHOD_CALL__ARGS);

		stringConstantEClass = createEClass(STRING_CONSTANT);
		createEAttribute(stringConstantEClass, STRING_CONSTANT__VALUE);

		intConstantEClass = createEClass(INT_CONSTANT);
		createEAttribute(intConstantEClass, INT_CONSTANT__VALUE);

		boolConstantEClass = createEClass(BOOL_CONSTANT);
		createEAttribute(boolConstantEClass, BOOL_CONSTANT__VALUE);

		thisEClass = createEClass(THIS);

		superEClass = createEClass(SUPER);

		nullEClass = createEClass(NULL);

		newObjectEClass = createEClass(NEW_OBJECT);
		createEReference(newObjectEClass, NEW_OBJECT__TYPE);
		createEReference(newObjectEClass, NEW_OBJECT__ARGS);

		newArrayEClass = createEClass(NEW_ARRAY);
		createEReference(newArrayEClass, NEW_ARRAY__TYPE);
		createEReference(newArrayEClass, NEW_ARRAY__SIZE);

		symbolRefEClass = createEClass(SYMBOL_REF);
		createEReference(symbolRefEClass, SYMBOL_REF__SYMBOL);

		contextEClass = createEClass(CONTEXT);
		createEReference(contextEClass, CONTEXT__BINDINGS);
		createEReference(contextEClass, CONTEXT__PARENT_CONTEXT);
		createEReference(contextEClass, CONTEXT__CHILD_CONTEXT);
		createEReference(contextEClass, CONTEXT__CACHE);

		valueEClass = createEClass(VALUE);

		integerValueEClass = createEClass(INTEGER_VALUE);
		createEAttribute(integerValueEClass, INTEGER_VALUE__VALUE);

		symbolBindingEClass = createEClass(SYMBOL_BINDING);
		createEReference(symbolBindingEClass, SYMBOL_BINDING__VALUE);
		createEReference(symbolBindingEClass, SYMBOL_BINDING__SYMBOL);

		fieldBindingEClass = createEClass(FIELD_BINDING);
		createEReference(fieldBindingEClass, FIELD_BINDING__FIELD);
		createEReference(fieldBindingEClass, FIELD_BINDING__VALUE);

		stringValueEClass = createEClass(STRING_VALUE);
		createEAttribute(stringValueEClass, STRING_VALUE__VALUE);

		booleanValueEClass = createEClass(BOOLEAN_VALUE);
		createEAttribute(booleanValueEClass, BOOLEAN_VALUE__VALUE);

		outputStreamEClass = createEClass(OUTPUT_STREAM);
		createEAttribute(outputStreamEClass, OUTPUT_STREAM__STREAM);

		stateEClass = createEClass(STATE);
		createEReference(stateEClass, STATE__ROOT_FRAME);
		createEReference(stateEClass, STATE__OBJECTS_HEAP);
		createEReference(stateEClass, STATE__OUTPUT_STREAM);
		createEReference(stateEClass, STATE__ARRAYS_HEAP);
		createEReference(stateEClass, STATE__CONTEXT_CACHE);
		createEReference(stateEClass, STATE__FRAME_CACHE);

		frameEClass = createEClass(FRAME);
		createEReference(frameEClass, FRAME__CALL);
		createEReference(frameEClass, FRAME__INSTANCE);
		createEReference(frameEClass, FRAME__CHILD_FRAME);
		createEReference(frameEClass, FRAME__PARENT_FRAME);
		createEReference(frameEClass, FRAME__ROOT_CONTEXT);
		createEReference(frameEClass, FRAME__RETURN_VALUE);

		nullValueEClass = createEClass(NULL_VALUE);

		callEClass = createEClass(CALL);

		newCallEClass = createEClass(NEW_CALL);
		createEReference(newCallEClass, NEW_CALL__NEWZ);

		methodCall2EClass = createEClass(METHOD_CALL2);
		createEReference(methodCall2EClass, METHOD_CALL2__METHODCALL);

		objectInstanceEClass = createEClass(OBJECT_INSTANCE);
		createEReference(objectInstanceEClass, OBJECT_INSTANCE__FIELDBINDINGS);
		createEReference(objectInstanceEClass, OBJECT_INSTANCE__TYPE);

		arrayInstanceEClass = createEClass(ARRAY_INSTANCE);
		createEReference(arrayInstanceEClass, ARRAY_INSTANCE__VALUE);
		createEAttribute(arrayInstanceEClass, ARRAY_INSTANCE__SIZE);

		objectRefValueEClass = createEClass(OBJECT_REF_VALUE);
		createEReference(objectRefValueEClass, OBJECT_REF_VALUE__INSTANCE);

		arrayRefValueEClass = createEClass(ARRAY_REF_VALUE);
		createEReference(arrayRefValueEClass, ARRAY_REF_VALUE__INSTANCE);

		symbolToSymbolBindingMapEClass = createEClass(SYMBOL_TO_SYMBOL_BINDING_MAP);
		createEReference(symbolToSymbolBindingMapEClass, SYMBOL_TO_SYMBOL_BINDING_MAP__KEY);
		createEReference(symbolToSymbolBindingMapEClass, SYMBOL_TO_SYMBOL_BINDING_MAP__VALUE);

		clazzToMethodMapEClass = createEClass(CLAZZ_TO_METHOD_MAP);
		createEReference(clazzToMethodMapEClass, CLAZZ_TO_METHOD_MAP__KEY);
		createEReference(clazzToMethodMapEClass, CLAZZ_TO_METHOD_MAP__VALUE);

		moduloEClass = createEClass(MODULO);
		createEReference(moduloEClass, MODULO__LEFT);
		createEReference(moduloEClass, MODULO__RIGHT);

		nativeExpressionEClass = createEClass(NATIVE_EXPRESSION);
		createEAttribute(nativeExpressionEClass, NATIVE_EXPRESSION__VALUE);

		// Create enums
		accessLevelEEnum = createEEnum(ACCESS_LEVEL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		typeDeclarationEClass.getESuperTypes().add(this.getNamedElement());
		clazzEClass.getESuperTypes().add(this.getTypeDeclaration());
		interfaceEClass.getESuperTypes().add(this.getTypeDeclaration());
		memberEClass.getESuperTypes().add(this.getTypedDeclaration());
		methodEClass.getESuperTypes().add(this.getMember());
		parameterEClass.getESuperTypes().add(this.getSymbol());
		fieldEClass.getESuperTypes().add(this.getMember());
		blockEClass.getESuperTypes().add(this.getStatement());
		printStatementEClass.getESuperTypes().add(this.getStatement());
		returnEClass.getESuperTypes().add(this.getStatement());
		ifStatementEClass.getESuperTypes().add(this.getStatement());
		whileStatementEClass.getESuperTypes().add(this.getStatement());
		forStatementEClass.getESuperTypes().add(this.getStatement());
		singleTypeRefEClass.getESuperTypes().add(this.getTypeRef());
		classRefEClass.getESuperTypes().add(this.getSingleTypeRef());
		typedDeclarationEClass.getESuperTypes().add(this.getNamedElement());
		symbolEClass.getESuperTypes().add(this.getTypedDeclaration());
		variableDeclarationEClass.getESuperTypes().add(this.getSymbol());
		variableDeclarationEClass.getESuperTypes().add(this.getAssignee());
		assignmentEClass.getESuperTypes().add(this.getStatement());
		expressionEClass.getESuperTypes().add(this.getStatement());
		expressionEClass.getESuperTypes().add(this.getAssignee());
		arrayTypeRefEClass.getESuperTypes().add(this.getTypeRef());
		integerTypeRefEClass.getESuperTypes().add(this.getSingleTypeRef());
		booleanTypeRefEClass.getESuperTypes().add(this.getSingleTypeRef());
		stringTypeRefEClass.getESuperTypes().add(this.getSingleTypeRef());
		voidTypeRefEClass.getESuperTypes().add(this.getSingleTypeRef());
		orEClass.getESuperTypes().add(this.getExpression());
		andEClass.getESuperTypes().add(this.getExpression());
		equalityEClass.getESuperTypes().add(this.getExpression());
		inequalityEClass.getESuperTypes().add(this.getExpression());
		superiorOrEqualEClass.getESuperTypes().add(this.getExpression());
		inferiorOrEqualEClass.getESuperTypes().add(this.getExpression());
		superiorEClass.getESuperTypes().add(this.getExpression());
		inferiorEClass.getESuperTypes().add(this.getExpression());
		plusEClass.getESuperTypes().add(this.getExpression());
		minusEClass.getESuperTypes().add(this.getExpression());
		multiplicationEClass.getESuperTypes().add(this.getExpression());
		divisionEClass.getESuperTypes().add(this.getExpression());
		arrayAccessEClass.getESuperTypes().add(this.getExpression());
		arrayLengthEClass.getESuperTypes().add(this.getExpression());
		notEClass.getESuperTypes().add(this.getExpression());
		negEClass.getESuperTypes().add(this.getExpression());
		fieldAccessEClass.getESuperTypes().add(this.getExpression());
		methodCallEClass.getESuperTypes().add(this.getExpression());
		stringConstantEClass.getESuperTypes().add(this.getExpression());
		intConstantEClass.getESuperTypes().add(this.getExpression());
		boolConstantEClass.getESuperTypes().add(this.getExpression());
		thisEClass.getESuperTypes().add(this.getExpression());
		superEClass.getESuperTypes().add(this.getExpression());
		nullEClass.getESuperTypes().add(this.getExpression());
		newObjectEClass.getESuperTypes().add(this.getExpression());
		newArrayEClass.getESuperTypes().add(this.getExpression());
		symbolRefEClass.getESuperTypes().add(this.getExpression());
		integerValueEClass.getESuperTypes().add(this.getValue());
		stringValueEClass.getESuperTypes().add(this.getValue());
		booleanValueEClass.getESuperTypes().add(this.getValue());
		nullValueEClass.getESuperTypes().add(this.getValue());
		newCallEClass.getESuperTypes().add(this.getCall());
		methodCall2EClass.getESuperTypes().add(this.getCall());
		objectRefValueEClass.getESuperTypes().add(this.getValue());
		arrayRefValueEClass.getESuperTypes().add(this.getValue());
		moduloEClass.getESuperTypes().add(this.getExpression());
		nativeExpressionEClass.getESuperTypes().add(this.getExpression());

		// Initialize classes, features, and operations; add parameters
		initEClass(programEClass, Program.class, "Program", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProgram_Name(), ecorePackage.getEString(), "name", null, 0, 1, Program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProgram_Imports(), this.getImport(), null, "imports", null, 0, -1, Program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProgram_Classes(), this.getTypeDeclaration(), null, "classes", null, 0, -1, Program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(importEClass, Import.class, "Import", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImport_ImportedNamespace(), ecorePackage.getEString(), "importedNamespace", null, 0, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeDeclarationEClass, TypeDeclaration.class, "TypeDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTypeDeclaration_AccessLevel(), this.getAccessLevel(), "accessLevel", null, 0, 1, TypeDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypeDeclaration_Implementz(), this.getInterface(), null, "implementz", null, 0, -1, TypeDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypeDeclaration_Members(), this.getMember(), null, "members", null, 0, -1, TypeDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(clazzEClass, Clazz.class, "Clazz", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClazz_Isabstract(), ecorePackage.getEBoolean(), "isabstract", null, 0, 1, Clazz.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClazz_SuperClass(), this.getClazz(), null, "superClass", null, 0, 1, Clazz.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interfaceEClass, Interface.class, "Interface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(memberEClass, Member.class, "Member", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMember_Access(), this.getAccessLevel(), "access", null, 0, 1, Member.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(methodEClass, Method.class, "Method", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMethod_Isabstract(), ecorePackage.getEBoolean(), "isabstract", null, 0, 1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethod_Isstatic(), ecorePackage.getEBoolean(), "isstatic", null, 0, 1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMethod_Params(), this.getParameter(), null, "params", null, 0, -1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMethod_Body(), this.getBlock(), null, "body", null, 0, 1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMethod_Cache(), this.getClazzToMethodMap(), null, "cache", null, 0, -1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fieldEClass, Field.class, "Field", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getField_DefaultValue(), this.getExpression(), null, "defaultValue", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(blockEClass, Block.class, "Block", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBlock_Statements(), this.getStatement(), null, "statements", null, 0, -1, Block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statementEClass, Statement.class, "Statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(printStatementEClass, PrintStatement.class, "PrintStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPrintStatement_Expression(), this.getExpression(), null, "expression", null, 0, 1, PrintStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(returnEClass, Return.class, "Return", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReturn_Expression(), this.getExpression(), null, "expression", null, 0, 1, Return.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ifStatementEClass, IfStatement.class, "IfStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIfStatement_Expression(), this.getExpression(), null, "expression", null, 0, 1, IfStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIfStatement_ThenBlock(), this.getBlock(), null, "thenBlock", null, 0, 1, IfStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIfStatement_ElseBlock(), this.getBlock(), null, "elseBlock", null, 0, 1, IfStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(whileStatementEClass, WhileStatement.class, "WhileStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWhileStatement_Condition(), this.getExpression(), null, "condition", null, 0, 1, WhileStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWhileStatement_Block(), this.getBlock(), null, "block", null, 0, 1, WhileStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(forStatementEClass, ForStatement.class, "ForStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getForStatement_Declaration(), this.getAssignment(), null, "declaration", null, 0, 1, ForStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForStatement_Condition(), this.getExpression(), null, "condition", null, 0, 1, ForStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForStatement_Progression(), this.getAssignment(), null, "progression", null, 0, 1, ForStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForStatement_Block(), this.getBlock(), null, "block", null, 0, 1, ForStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeRefEClass, TypeRef.class, "TypeRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(singleTypeRefEClass, SingleTypeRef.class, "SingleTypeRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(classRefEClass, ClassRef.class, "ClassRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClassRef_ReferencedClass(), this.getTypeDeclaration(), null, "referencedClass", null, 0, 1, ClassRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typedDeclarationEClass, TypedDeclaration.class, "TypedDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypedDeclaration_TypeRef(), this.getTypeRef(), null, "typeRef", null, 0, 1, TypedDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(symbolEClass, Symbol.class, "Symbol", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(variableDeclarationEClass, VariableDeclaration.class, "VariableDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(assignmentEClass, Assignment.class, "Assignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssignment_Assignee(), this.getAssignee(), null, "assignee", null, 0, 1, Assignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssignment_Value(), this.getExpression(), null, "value", null, 0, 1, Assignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assigneeEClass, Assignee.class, "Assignee", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(expressionEClass, Expression.class, "Expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(arrayTypeRefEClass, ArrayTypeRef.class, "ArrayTypeRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArrayTypeRef_TypeRef(), this.getSingleTypeRef(), null, "typeRef", null, 0, 1, ArrayTypeRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(integerTypeRefEClass, IntegerTypeRef.class, "IntegerTypeRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(booleanTypeRefEClass, BooleanTypeRef.class, "BooleanTypeRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stringTypeRefEClass, StringTypeRef.class, "StringTypeRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(voidTypeRefEClass, VoidTypeRef.class, "VoidTypeRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(orEClass, Or.class, "Or", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOr_Left(), this.getExpression(), null, "left", null, 0, 1, Or.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOr_Right(), this.getExpression(), null, "right", null, 0, 1, Or.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(andEClass, And.class, "And", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnd_Left(), this.getExpression(), null, "left", null, 0, 1, And.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnd_Right(), this.getExpression(), null, "right", null, 0, 1, And.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(equalityEClass, Equality.class, "Equality", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEquality_Left(), this.getExpression(), null, "left", null, 0, 1, Equality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEquality_Right(), this.getExpression(), null, "right", null, 0, 1, Equality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inequalityEClass, Inequality.class, "Inequality", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInequality_Left(), this.getExpression(), null, "left", null, 0, 1, Inequality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInequality_Right(), this.getExpression(), null, "right", null, 0, 1, Inequality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(superiorOrEqualEClass, SuperiorOrEqual.class, "SuperiorOrEqual", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSuperiorOrEqual_Left(), this.getExpression(), null, "left", null, 0, 1, SuperiorOrEqual.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSuperiorOrEqual_Right(), this.getExpression(), null, "right", null, 0, 1, SuperiorOrEqual.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inferiorOrEqualEClass, InferiorOrEqual.class, "InferiorOrEqual", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInferiorOrEqual_Left(), this.getExpression(), null, "left", null, 0, 1, InferiorOrEqual.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInferiorOrEqual_Right(), this.getExpression(), null, "right", null, 0, 1, InferiorOrEqual.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(superiorEClass, Superior.class, "Superior", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSuperior_Left(), this.getExpression(), null, "left", null, 0, 1, Superior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSuperior_Right(), this.getExpression(), null, "right", null, 0, 1, Superior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inferiorEClass, Inferior.class, "Inferior", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInferior_Left(), this.getExpression(), null, "left", null, 0, 1, Inferior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInferior_Right(), this.getExpression(), null, "right", null, 0, 1, Inferior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(plusEClass, Plus.class, "Plus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlus_Left(), this.getExpression(), null, "left", null, 0, 1, Plus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlus_Right(), this.getExpression(), null, "right", null, 0, 1, Plus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(minusEClass, Minus.class, "Minus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMinus_Left(), this.getExpression(), null, "left", null, 0, 1, Minus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMinus_Right(), this.getExpression(), null, "right", null, 0, 1, Minus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(multiplicationEClass, Multiplication.class, "Multiplication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMultiplication_Left(), this.getExpression(), null, "left", null, 0, 1, Multiplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMultiplication_Right(), this.getExpression(), null, "right", null, 0, 1, Multiplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(divisionEClass, Division.class, "Division", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDivision_Left(), this.getExpression(), null, "left", null, 0, 1, Division.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDivision_Right(), this.getExpression(), null, "right", null, 0, 1, Division.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arrayAccessEClass, ArrayAccess.class, "ArrayAccess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArrayAccess_Object(), this.getExpression(), null, "object", null, 0, 1, ArrayAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArrayAccess_Index(), this.getExpression(), null, "index", null, 0, 1, ArrayAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arrayLengthEClass, ArrayLength.class, "ArrayLength", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArrayLength_Array(), this.getExpression(), null, "array", null, 0, 1, ArrayLength.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(notEClass, Not.class, "Not", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNot_Expression(), this.getExpression(), null, "expression", null, 0, 1, Not.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(negEClass, Neg.class, "Neg", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNeg_Expression(), this.getExpression(), null, "expression", null, 0, 1, Neg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fieldAccessEClass, FieldAccess.class, "FieldAccess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFieldAccess_Receiver(), this.getExpression(), null, "receiver", null, 0, 1, FieldAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFieldAccess_Field(), this.getField(), null, "field", null, 0, 1, FieldAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(methodCallEClass, MethodCall.class, "MethodCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMethodCall_Receiver(), this.getExpression(), null, "receiver", null, 0, 1, MethodCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMethodCall_Method(), this.getMethod(), null, "method", null, 0, 1, MethodCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMethodCall_Args(), this.getExpression(), null, "args", null, 0, -1, MethodCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringConstantEClass, StringConstant.class, "StringConstant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringConstant_Value(), ecorePackage.getEString(), "value", null, 0, 1, StringConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(intConstantEClass, IntConstant.class, "IntConstant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntConstant_Value(), ecorePackage.getEInt(), "value", null, 0, 1, IntConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(boolConstantEClass, BoolConstant.class, "BoolConstant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBoolConstant_Value(), ecorePackage.getEString(), "value", null, 0, 1, BoolConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(thisEClass, This.class, "This", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(superEClass, Super.class, "Super", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(nullEClass, Null.class, "Null", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(newObjectEClass, NewObject.class, "NewObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNewObject_Type(), this.getClazz(), null, "type", null, 0, 1, NewObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNewObject_Args(), this.getExpression(), null, "args", null, 0, -1, NewObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(newArrayEClass, NewArray.class, "NewArray", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNewArray_Type(), this.getTypeRef(), null, "type", null, 0, 1, NewArray.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNewArray_Size(), this.getExpression(), null, "size", null, 0, 1, NewArray.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(symbolRefEClass, SymbolRef.class, "SymbolRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSymbolRef_Symbol(), this.getSymbol(), null, "symbol", null, 0, 1, SymbolRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contextEClass, Context.class, "Context", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContext_Bindings(), this.getSymbolBinding(), null, "bindings", null, 0, -1, Context.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContext_ParentContext(), this.getContext(), this.getContext_ChildContext(), "parentContext", null, 0, 1, Context.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContext_ChildContext(), this.getContext(), this.getContext_ParentContext(), "childContext", null, 0, 1, Context.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContext_Cache(), this.getSymbolToSymbolBindingMap(), null, "cache", null, 0, -1, Context.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueEClass, Value.class, "Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(integerValueEClass, IntegerValue.class, "IntegerValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntegerValue_Value(), ecorePackage.getEInt(), "value", null, 0, 1, IntegerValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(symbolBindingEClass, SymbolBinding.class, "SymbolBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSymbolBinding_Value(), this.getValue(), null, "value", null, 0, 1, SymbolBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSymbolBinding_Symbol(), this.getSymbol(), null, "symbol", null, 1, 1, SymbolBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fieldBindingEClass, FieldBinding.class, "FieldBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFieldBinding_Field(), this.getField(), null, "field", null, 1, 1, FieldBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFieldBinding_Value(), this.getValue(), null, "value", null, 0, 1, FieldBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringValueEClass, StringValue.class, "StringValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringValue_Value(), ecorePackage.getEString(), "value", null, 0, 1, StringValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanValueEClass, BooleanValue.class, "BooleanValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooleanValue_Value(), ecorePackage.getEBoolean(), "value", null, 0, 1, BooleanValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outputStreamEClass, OutputStream.class, "OutputStream", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOutputStream_Stream(), ecorePackage.getEString(), "stream", null, 0, -1, OutputStream.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateEClass, State.class, "State", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getState_RootFrame(), this.getFrame(), null, "rootFrame", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_ObjectsHeap(), this.getObjectInstance(), null, "objectsHeap", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_OutputStream(), this.getOutputStream(), null, "outputStream", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_ArraysHeap(), this.getArrayInstance(), null, "arraysHeap", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_ContextCache(), this.getContext(), null, "contextCache", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_FrameCache(), this.getFrame(), null, "frameCache", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(frameEClass, Frame.class, "Frame", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFrame_Call(), this.getCall(), null, "call", null, 0, 1, Frame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFrame_Instance(), this.getObjectInstance(), null, "instance", null, 0, 1, Frame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFrame_ChildFrame(), this.getFrame(), this.getFrame_ParentFrame(), "childFrame", null, 0, 1, Frame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFrame_ParentFrame(), this.getFrame(), this.getFrame_ChildFrame(), "parentFrame", null, 0, 1, Frame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFrame_RootContext(), this.getContext(), null, "rootContext", null, 0, 1, Frame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFrame_ReturnValue(), this.getValue(), null, "returnValue", null, 0, 1, Frame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nullValueEClass, NullValue.class, "NullValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(callEClass, Call.class, "Call", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(newCallEClass, NewCall.class, "NewCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNewCall_Newz(), this.getNewObject(), null, "newz", null, 1, 1, NewCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(methodCall2EClass, MethodCall2.class, "MethodCall2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMethodCall2_Methodcall(), this.getMethodCall(), null, "methodcall", null, 1, 1, MethodCall2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectInstanceEClass, ObjectInstance.class, "ObjectInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjectInstance_Fieldbindings(), this.getFieldBinding(), null, "fieldbindings", null, 0, -1, ObjectInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjectInstance_Type(), this.getClazz(), null, "type", null, 1, 1, ObjectInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arrayInstanceEClass, ArrayInstance.class, "ArrayInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArrayInstance_Value(), this.getValue(), null, "value", null, 0, -1, ArrayInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArrayInstance_Size(), ecorePackage.getEInt(), "size", null, 0, 1, ArrayInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectRefValueEClass, ObjectRefValue.class, "ObjectRefValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjectRefValue_Instance(), this.getObjectInstance(), null, "instance", null, 0, 1, ObjectRefValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arrayRefValueEClass, ArrayRefValue.class, "ArrayRefValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArrayRefValue_Instance(), this.getArrayInstance(), null, "instance", null, 0, 1, ArrayRefValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(symbolToSymbolBindingMapEClass, Map.Entry.class, "SymbolToSymbolBindingMap", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSymbolToSymbolBindingMap_Key(), this.getSymbol(), null, "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSymbolToSymbolBindingMap_Value(), this.getSymbolBinding(), null, "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(clazzToMethodMapEClass, Map.Entry.class, "ClazzToMethodMap", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClazzToMethodMap_Key(), this.getClazz(), null, "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClazzToMethodMap_Value(), this.getMethod(), null, "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moduloEClass, Modulo.class, "Modulo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModulo_Left(), this.getExpression(), null, "left", null, 0, 1, Modulo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModulo_Right(), this.getExpression(), null, "right", null, 0, 1, Modulo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nativeExpressionEClass, NativeExpression.class, "NativeExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNativeExpression_Value(), ecorePackage.getEString(), "value", null, 0, 1, NativeExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(accessLevelEEnum, AccessLevel.class, "AccessLevel");
		addEEnumLiteral(accessLevelEEnum, AccessLevel.PRIVATE);
		addEEnumLiteral(accessLevelEEnum, AccessLevel.PROTECTED);
		addEEnumLiteral(accessLevelEEnum, AccessLevel.PUBLIC);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// aspect
		createAspectAnnotations();
		// RuntimeData
		createRuntimeDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>aspect</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createAspectAnnotations() {
		String source = "aspect";
		addAnnotation
		  (contextEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (valueEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (integerValueEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (symbolBindingEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (fieldBindingEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (stringValueEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (booleanValueEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (outputStreamEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (stateEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (frameEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (nullValueEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (callEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (newCallEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (methodCall2EClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (objectInstanceEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (arrayInstanceEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (objectRefValueEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (arrayRefValueEClass,
		   source,
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>RuntimeData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createRuntimeDataAnnotations() {
		String source = "RuntimeData";
		addAnnotation
		  (contextEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (valueEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (integerValueEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (symbolBindingEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (fieldBindingEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (stringValueEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (booleanValueEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (frameEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (nullValueEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (callEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (newCallEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (methodCall2EClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (objectInstanceEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (arrayInstanceEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (objectRefValueEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (arrayRefValueEClass,
		   source,
		   new String[] {
		   });
	}

} //MiniJavaPackageImpl
