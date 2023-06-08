/**
 * Admitto Unum 2023
 */
package admitto.unum.model.diagnostic.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import admitto.unum.model.diagnostic.DiagnosticCategory;
import admitto.unum.model.diagnostic.DiagnosticFactory;
import admitto.unum.model.diagnostic.DiagnosticPackage;
import admitto.unum.model.diagnostic.Name;
import admitto.unum.model.diagnostic.Posting;
import admitto.unum.model.diagnostic.QualifiedName;
import admitto.unum.model.diagnostic.SimpleName;
import admitto.unum.model.diagnostic.Whiteboard;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DiagnosticPackageImpl
    extends EPackageImpl
    implements
        DiagnosticPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass nameEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass simpleNameEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass qualifiedNameEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass diagnosticCategoryEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass whiteboardEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass postingEClass = null;

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
     * @see admitto.unum.model.diagnostic.DiagnosticPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private DiagnosticPackageImpl() {
        super(eNS_URI, DiagnosticFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link DiagnosticPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static DiagnosticPackage init() {
        if (isInited)
            return (DiagnosticPackage) EPackage.Registry.INSTANCE.getEPackage(DiagnosticPackage.eNS_URI);

        // Obtain or create and register package
        Object registeredDiagnosticPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
        DiagnosticPackageImpl theDiagnosticPackage = registeredDiagnosticPackage instanceof DiagnosticPackageImpl
                ? (DiagnosticPackageImpl) registeredDiagnosticPackage
                : new DiagnosticPackageImpl();

        isInited = true;

        // Create package meta-data objects
        theDiagnosticPackage.createPackageContents();

        // Initialize created meta-data
        theDiagnosticPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theDiagnosticPackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(DiagnosticPackage.eNS_URI, theDiagnosticPackage);
        return theDiagnosticPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getName_() {
        return nameEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getName__IsSimpleName() {
        return nameEClass.getEOperations()
            .get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getName__IsQualifiedName() {
        return nameEClass.getEOperations()
            .get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getSimpleName() {
        return simpleNameEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getSimpleName_Identifier() {
        return (EAttribute) simpleNameEClass.getEStructuralFeatures()
            .get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getQualifiedName() {
        return qualifiedNameEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getQualifiedName_Name() {
        return (EReference) qualifiedNameEClass.getEStructuralFeatures()
            .get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getQualifiedName_Qualifier() {
        return (EReference) qualifiedNameEClass.getEStructuralFeatures()
            .get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getQualifiedName_QualifiednameeOpposite() {
        return (EReference) qualifiedNameEClass.getEStructuralFeatures()
            .get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getDiagnosticCategory() {
        return diagnosticCategoryEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getDiagnosticCategory_ConditionName() {
        return (EReference) diagnosticCategoryEClass.getEStructuralFeatures()
            .get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getDiagnosticCategory_CategoryName() {
        return (EReference) diagnosticCategoryEClass.getEStructuralFeatures()
            .get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getDiagnosticCategory_Specificity() {
        return (EReference) diagnosticCategoryEClass.getEStructuralFeatures()
            .get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getWhiteboard() {
        return whiteboardEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getWhiteboard_Postings() {
        return (EReference) whiteboardEClass.getEStructuralFeatures()
            .get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getPosting() {
        return postingEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getPosting_Name() {
        return (EReference) postingEClass.getEStructuralFeatures()
            .get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getPosting_Id() {
        return (EAttribute) postingEClass.getEStructuralFeatures()
            .get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getPosting_Value() {
        return (EAttribute) postingEClass.getEStructuralFeatures()
            .get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DiagnosticFactory getDiagnosticFactory() {
        return (DiagnosticFactory) getEFactoryInstance();
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
        if (isCreated)
            return;
        isCreated = true;

        // Create classes and their features
        nameEClass = createEClass(NAME);
        createEOperation(nameEClass, NAME___IS_SIMPLE_NAME);
        createEOperation(nameEClass, NAME___IS_QUALIFIED_NAME);

        simpleNameEClass = createEClass(SIMPLE_NAME);
        createEAttribute(simpleNameEClass, SIMPLE_NAME__IDENTIFIER);

        qualifiedNameEClass = createEClass(QUALIFIED_NAME);
        createEReference(qualifiedNameEClass, QUALIFIED_NAME__NAME);
        createEReference(qualifiedNameEClass, QUALIFIED_NAME__QUALIFIER);
        createEReference(qualifiedNameEClass, QUALIFIED_NAME__QUALIFIEDNAMEE_OPPOSITE);

        diagnosticCategoryEClass = createEClass(DIAGNOSTIC_CATEGORY);
        createEReference(diagnosticCategoryEClass, DIAGNOSTIC_CATEGORY__CONDITION_NAME);
        createEReference(diagnosticCategoryEClass, DIAGNOSTIC_CATEGORY__CATEGORY_NAME);
        createEReference(diagnosticCategoryEClass, DIAGNOSTIC_CATEGORY__SPECIFICITY);

        whiteboardEClass = createEClass(WHITEBOARD);
        createEReference(whiteboardEClass, WHITEBOARD__POSTINGS);

        postingEClass = createEClass(POSTING);
        createEReference(postingEClass, POSTING__NAME);
        createEAttribute(postingEClass, POSTING__ID);
        createEAttribute(postingEClass, POSTING__VALUE);
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
        if (isInitialized)
            return;
        isInitialized = true;

        // Initialize package
        setName(eNAME);
        setNsPrefix(eNS_PREFIX);
        setNsURI(eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        simpleNameEClass.getESuperTypes()
            .add(this.getName_());
        qualifiedNameEClass.getESuperTypes()
            .add(this.getName_());

        // Initialize classes, features, and operations; add parameters
        initEClass(nameEClass, Name.class, "Name", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEOperation(getName__IsSimpleName(),
                       ecorePackage.getEBoolean(),
                       "isSimpleName",
                       0,
                       1,
                       IS_UNIQUE,
                       IS_ORDERED);

        initEOperation(getName__IsQualifiedName(),
                       ecorePackage.getEBoolean(),
                       "isQualifiedName",
                       0,
                       1,
                       IS_UNIQUE,
                       IS_ORDERED);

        initEClass(simpleNameEClass,
                   SimpleName.class,
                   "SimpleName",
                   !IS_ABSTRACT,
                   !IS_INTERFACE,
                   IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getSimpleName_Identifier(),
                       ecorePackage.getEString(),
                       "identifier",
                       null,
                       1,
                       1,
                       SimpleName.class,
                       !IS_TRANSIENT,
                       !IS_VOLATILE,
                       IS_CHANGEABLE,
                       !IS_UNSETTABLE,
                       !IS_ID,
                       !IS_UNIQUE,
                       !IS_DERIVED,
                       IS_ORDERED);

        initEClass(qualifiedNameEClass,
                   QualifiedName.class,
                   "QualifiedName",
                   !IS_ABSTRACT,
                   !IS_INTERFACE,
                   IS_GENERATED_INSTANCE_CLASS);
        initEReference(getQualifiedName_Name(),
                       this.getSimpleName(),
                       null,
                       "name",
                       null,
                       1,
                       1,
                       QualifiedName.class,
                       !IS_TRANSIENT,
                       !IS_VOLATILE,
                       IS_CHANGEABLE,
                       IS_COMPOSITE,
                       !IS_RESOLVE_PROXIES,
                       !IS_UNSETTABLE,
                       IS_UNIQUE,
                       !IS_DERIVED,
                       IS_ORDERED);
        initEReference(getQualifiedName_Qualifier(),
                       this.getQualifiedName(),
                       this.getQualifiedName_QualifiednameeOpposite(),
                       "qualifier",
                       null,
                       0,
                       1,
                       QualifiedName.class,
                       !IS_TRANSIENT,
                       !IS_VOLATILE,
                       IS_CHANGEABLE,
                       !IS_COMPOSITE,
                       IS_RESOLVE_PROXIES,
                       !IS_UNSETTABLE,
                       IS_UNIQUE,
                       !IS_DERIVED,
                       IS_ORDERED);
        initEReference(getQualifiedName_QualifiednameeOpposite(),
                       this.getQualifiedName(),
                       this.getQualifiedName_Qualifier(),
                       "qualifiednameeOpposite",
                       null,
                       0,
                       1,
                       QualifiedName.class,
                       !IS_TRANSIENT,
                       !IS_VOLATILE,
                       IS_CHANGEABLE,
                       !IS_COMPOSITE,
                       IS_RESOLVE_PROXIES,
                       !IS_UNSETTABLE,
                       IS_UNIQUE,
                       !IS_DERIVED,
                       IS_ORDERED);

        initEClass(diagnosticCategoryEClass,
                   DiagnosticCategory.class,
                   "DiagnosticCategory",
                   !IS_ABSTRACT,
                   !IS_INTERFACE,
                   IS_GENERATED_INSTANCE_CLASS);
        initEReference(getDiagnosticCategory_ConditionName(),
                       this.getSimpleName(),
                       null,
                       "conditionName",
                       null,
                       1,
                       1,
                       DiagnosticCategory.class,
                       !IS_TRANSIENT,
                       !IS_VOLATILE,
                       IS_CHANGEABLE,
                       !IS_COMPOSITE,
                       IS_RESOLVE_PROXIES,
                       !IS_UNSETTABLE,
                       IS_UNIQUE,
                       !IS_DERIVED,
                       IS_ORDERED);
        initEReference(getDiagnosticCategory_CategoryName(),
                       this.getSimpleName(),
                       null,
                       "categoryName",
                       null,
                       1,
                       1,
                       DiagnosticCategory.class,
                       !IS_TRANSIENT,
                       !IS_VOLATILE,
                       IS_CHANGEABLE,
                       !IS_COMPOSITE,
                       IS_RESOLVE_PROXIES,
                       !IS_UNSETTABLE,
                       IS_UNIQUE,
                       !IS_DERIVED,
                       IS_ORDERED);
        initEReference(getDiagnosticCategory_Specificity(),
                       this.getQualifiedName(),
                       null,
                       "specificity",
                       null,
                       0,
                       1,
                       DiagnosticCategory.class,
                       !IS_TRANSIENT,
                       !IS_VOLATILE,
                       IS_CHANGEABLE,
                       !IS_COMPOSITE,
                       IS_RESOLVE_PROXIES,
                       !IS_UNSETTABLE,
                       IS_UNIQUE,
                       !IS_DERIVED,
                       IS_ORDERED);

        initEClass(whiteboardEClass,
                   Whiteboard.class,
                   "Whiteboard",
                   !IS_ABSTRACT,
                   !IS_INTERFACE,
                   IS_GENERATED_INSTANCE_CLASS);
        initEReference(getWhiteboard_Postings(),
                       this.getPosting(),
                       null,
                       "postings",
                       null,
                       0,
                       -1,
                       Whiteboard.class,
                       !IS_TRANSIENT,
                       !IS_VOLATILE,
                       IS_CHANGEABLE,
                       IS_COMPOSITE,
                       !IS_RESOLVE_PROXIES,
                       !IS_UNSETTABLE,
                       IS_UNIQUE,
                       !IS_DERIVED,
                       IS_ORDERED);

        initEClass(postingEClass, Posting.class, "Posting", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getPosting_Name(),
                       this.getName_(),
                       null,
                       "name",
                       null,
                       1,
                       1,
                       Posting.class,
                       !IS_TRANSIENT,
                       !IS_VOLATILE,
                       IS_CHANGEABLE,
                       IS_COMPOSITE,
                       !IS_RESOLVE_PROXIES,
                       !IS_UNSETTABLE,
                       IS_UNIQUE,
                       !IS_DERIVED,
                       IS_ORDERED);
        initEAttribute(getPosting_Id(),
                       ecorePackage.getEString(),
                       "id",
                       null,
                       0,
                       1,
                       Posting.class,
                       !IS_TRANSIENT,
                       !IS_VOLATILE,
                       IS_CHANGEABLE,
                       !IS_UNSETTABLE,
                       IS_ID,
                       !IS_UNIQUE,
                       !IS_DERIVED,
                       !IS_ORDERED);
        initEAttribute(getPosting_Value(),
                       ecorePackage.getEJavaObject(),
                       "value",
                       null,
                       0,
                       1,
                       Posting.class,
                       !IS_TRANSIENT,
                       !IS_VOLATILE,
                       IS_CHANGEABLE,
                       !IS_UNSETTABLE,
                       !IS_ID,
                       !IS_UNIQUE,
                       !IS_DERIVED,
                       !IS_ORDERED);

        // Create resource
        createResource(eNS_URI);
    }

} // DiagnosticPackageImpl
