/**
 * Admitto Unum 2023
 */
package admitto.unum.model.diagnostic;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see admitto.unum.model.diagnostic.DiagnosticFactory
 * @model kind="package"
 * @generated
 */
public interface DiagnosticPackage
    extends
        EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "diagnostic";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://admitto.unum/models/diagnostic";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "hdm";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    DiagnosticPackage eINSTANCE = admitto.unum.model.diagnostic.impl.DiagnosticPackageImpl.init();

    /**
     * The meta object id for the '{@link admitto.unum.model.diagnostic.Name <em>Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see admitto.unum.model.diagnostic.Name
     * @see admitto.unum.model.diagnostic.impl.DiagnosticPackageImpl#getName_()
     * @generated
     */
    int NAME = 0;

    /**
     * The number of structural features of the '<em>Name</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAME_FEATURE_COUNT = 0;

    /**
     * The operation id for the '<em>Is Simple Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAME___IS_SIMPLE_NAME = 0;

    /**
     * The operation id for the '<em>Is Qualified Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAME___IS_QUALIFIED_NAME = 1;

    /**
     * The number of operations of the '<em>Name</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAME_OPERATION_COUNT = 2;

    /**
     * The meta object id for the '{@link admitto.unum.model.diagnostic.impl.SimpleNameImpl <em>Simple Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see admitto.unum.model.diagnostic.impl.SimpleNameImpl
     * @see admitto.unum.model.diagnostic.impl.DiagnosticPackageImpl#getSimpleName()
     * @generated
     */
    int SIMPLE_NAME = 1;

    /**
     * The feature id for the '<em><b>Identifier</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_NAME__IDENTIFIER = NAME_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Simple Name</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_NAME_FEATURE_COUNT = NAME_FEATURE_COUNT + 1;

    /**
     * The operation id for the '<em>Is Simple Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_NAME___IS_SIMPLE_NAME = NAME___IS_SIMPLE_NAME;

    /**
     * The operation id for the '<em>Is Qualified Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_NAME___IS_QUALIFIED_NAME = NAME___IS_QUALIFIED_NAME;

    /**
     * The number of operations of the '<em>Simple Name</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_NAME_OPERATION_COUNT = NAME_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link admitto.unum.model.diagnostic.impl.QualifiedNameImpl <em>Qualified Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see admitto.unum.model.diagnostic.impl.QualifiedNameImpl
     * @see admitto.unum.model.diagnostic.impl.DiagnosticPackageImpl#getQualifiedName()
     * @generated
     */
    int QUALIFIED_NAME = 2;

    /**
     * The feature id for the '<em><b>Name</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUALIFIED_NAME__NAME = NAME_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Qualifier</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUALIFIED_NAME__QUALIFIER = NAME_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Qualifiednamee Opposite</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUALIFIED_NAME__QUALIFIEDNAMEE_OPPOSITE = NAME_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Qualified Name</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUALIFIED_NAME_FEATURE_COUNT = NAME_FEATURE_COUNT + 3;

    /**
     * The operation id for the '<em>Is Simple Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUALIFIED_NAME___IS_SIMPLE_NAME = NAME___IS_SIMPLE_NAME;

    /**
     * The operation id for the '<em>Is Qualified Name</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUALIFIED_NAME___IS_QUALIFIED_NAME = NAME___IS_QUALIFIED_NAME;

    /**
     * The number of operations of the '<em>Qualified Name</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUALIFIED_NAME_OPERATION_COUNT = NAME_OPERATION_COUNT + 0;


    /**
     * The meta object id for the '{@link admitto.unum.model.diagnostic.impl.DiagnosticCategoryImpl <em>Category</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see admitto.unum.model.diagnostic.impl.DiagnosticCategoryImpl
     * @see admitto.unum.model.diagnostic.impl.DiagnosticPackageImpl#getDiagnosticCategory()
     * @generated
     */
    int DIAGNOSTIC_CATEGORY = 3;

    /**
     * The feature id for the '<em><b>Condition Name</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIAGNOSTIC_CATEGORY__CONDITION_NAME = 0;

    /**
     * The feature id for the '<em><b>Category Name</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIAGNOSTIC_CATEGORY__CATEGORY_NAME = 1;

    /**
     * The feature id for the '<em><b>Specificity</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIAGNOSTIC_CATEGORY__SPECIFICITY = 2;

    /**
     * The number of structural features of the '<em>Category</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIAGNOSTIC_CATEGORY_FEATURE_COUNT = 3;

    /**
     * The number of operations of the '<em>Category</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIAGNOSTIC_CATEGORY_OPERATION_COUNT = 0;


    /**
     * Returns the meta object for class '{@link admitto.unum.model.diagnostic.Name <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Name</em>'.
     * @see admitto.unum.model.diagnostic.Name
     * @generated
     */
    EClass getName_();

    /**
     * Returns the meta object for the '{@link admitto.unum.model.diagnostic.Name#isSimpleName() <em>Is Simple Name</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Is Simple Name</em>' operation.
     * @see admitto.unum.model.diagnostic.Name#isSimpleName()
     * @generated
     */
    EOperation getName__IsSimpleName();

    /**
     * Returns the meta object for the '{@link admitto.unum.model.diagnostic.Name#isQualifiedName() <em>Is Qualified Name</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Is Qualified Name</em>' operation.
     * @see admitto.unum.model.diagnostic.Name#isQualifiedName()
     * @generated
     */
    EOperation getName__IsQualifiedName();

    /**
     * Returns the meta object for class '{@link admitto.unum.model.diagnostic.SimpleName <em>Simple Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Simple Name</em>'.
     * @see admitto.unum.model.diagnostic.SimpleName
     * @generated
     */
    EClass getSimpleName();

    /**
     * Returns the meta object for the attribute '{@link admitto.unum.model.diagnostic.SimpleName#getIdentifier <em>Identifier</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Identifier</em>'.
     * @see admitto.unum.model.diagnostic.SimpleName#getIdentifier()
     * @see #getSimpleName()
     * @generated
     */
    EAttribute getSimpleName_Identifier();

    /**
     * Returns the meta object for class '{@link admitto.unum.model.diagnostic.QualifiedName <em>Qualified Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Qualified Name</em>'.
     * @see admitto.unum.model.diagnostic.QualifiedName
     * @generated
     */
    EClass getQualifiedName();

    /**
     * Returns the meta object for the containment reference '{@link admitto.unum.model.diagnostic.QualifiedName#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Name</em>'.
     * @see admitto.unum.model.diagnostic.QualifiedName#getName()
     * @see #getQualifiedName()
     * @generated
     */
    EReference getQualifiedName_Name();

    /**
     * Returns the meta object for the reference '{@link admitto.unum.model.diagnostic.QualifiedName#getQualifier <em>Qualifier</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Qualifier</em>'.
     * @see admitto.unum.model.diagnostic.QualifiedName#getQualifier()
     * @see #getQualifiedName()
     * @generated
     */
    EReference getQualifiedName_Qualifier();

    /**
     * Returns the meta object for the reference '{@link admitto.unum.model.diagnostic.QualifiedName#getQualifiednameeOpposite <em>Qualifiednamee Opposite</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Qualifiednamee Opposite</em>'.
     * @see admitto.unum.model.diagnostic.QualifiedName#getQualifiednameeOpposite()
     * @see #getQualifiedName()
     * @generated
     */
    EReference getQualifiedName_QualifiednameeOpposite();

    /**
     * Returns the meta object for class '{@link admitto.unum.model.diagnostic.DiagnosticCategory <em>Category</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Category</em>'.
     * @see admitto.unum.model.diagnostic.DiagnosticCategory
     * @generated
     */
    EClass getDiagnosticCategory();

    /**
     * Returns the meta object for the reference '{@link admitto.unum.model.diagnostic.DiagnosticCategory#getConditionName <em>Condition Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Condition Name</em>'.
     * @see admitto.unum.model.diagnostic.DiagnosticCategory#getConditionName()
     * @see #getDiagnosticCategory()
     * @generated
     */
    EReference getDiagnosticCategory_ConditionName();

    /**
     * Returns the meta object for the reference '{@link admitto.unum.model.diagnostic.DiagnosticCategory#getCategoryName <em>Category Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Category Name</em>'.
     * @see admitto.unum.model.diagnostic.DiagnosticCategory#getCategoryName()
     * @see #getDiagnosticCategory()
     * @generated
     */
    EReference getDiagnosticCategory_CategoryName();

    /**
     * Returns the meta object for the reference '{@link admitto.unum.model.diagnostic.DiagnosticCategory#getSpecificity <em>Specificity</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Specificity</em>'.
     * @see admitto.unum.model.diagnostic.DiagnosticCategory#getSpecificity()
     * @see #getDiagnosticCategory()
     * @generated
     */
    EReference getDiagnosticCategory_Specificity();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    DiagnosticFactory getDiagnosticFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each operation of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '{@link admitto.unum.model.diagnostic.Name <em>Name</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see admitto.unum.model.diagnostic.Name
         * @see admitto.unum.model.diagnostic.impl.DiagnosticPackageImpl#getName_()
         * @generated
         */
        EClass NAME = eINSTANCE.getName_();

        /**
         * The meta object literal for the '<em><b>Is Simple Name</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation NAME___IS_SIMPLE_NAME = eINSTANCE.getName__IsSimpleName();

        /**
         * The meta object literal for the '<em><b>Is Qualified Name</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation NAME___IS_QUALIFIED_NAME = eINSTANCE.getName__IsQualifiedName();

        /**
         * The meta object literal for the '{@link admitto.unum.model.diagnostic.impl.SimpleNameImpl <em>Simple Name</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see admitto.unum.model.diagnostic.impl.SimpleNameImpl
         * @see admitto.unum.model.diagnostic.impl.DiagnosticPackageImpl#getSimpleName()
         * @generated
         */
        EClass SIMPLE_NAME = eINSTANCE.getSimpleName();

        /**
         * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SIMPLE_NAME__IDENTIFIER = eINSTANCE.getSimpleName_Identifier();

        /**
         * The meta object literal for the '{@link admitto.unum.model.diagnostic.impl.QualifiedNameImpl <em>Qualified Name</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see admitto.unum.model.diagnostic.impl.QualifiedNameImpl
         * @see admitto.unum.model.diagnostic.impl.DiagnosticPackageImpl#getQualifiedName()
         * @generated
         */
        EClass QUALIFIED_NAME = eINSTANCE.getQualifiedName();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference QUALIFIED_NAME__NAME = eINSTANCE.getQualifiedName_Name();

        /**
         * The meta object literal for the '<em><b>Qualifier</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference QUALIFIED_NAME__QUALIFIER = eINSTANCE.getQualifiedName_Qualifier();

        /**
         * The meta object literal for the '<em><b>Qualifiednamee Opposite</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference QUALIFIED_NAME__QUALIFIEDNAMEE_OPPOSITE = eINSTANCE.getQualifiedName_QualifiednameeOpposite();

        /**
         * The meta object literal for the '{@link admitto.unum.model.diagnostic.impl.DiagnosticCategoryImpl <em>Category</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see admitto.unum.model.diagnostic.impl.DiagnosticCategoryImpl
         * @see admitto.unum.model.diagnostic.impl.DiagnosticPackageImpl#getDiagnosticCategory()
         * @generated
         */
        EClass DIAGNOSTIC_CATEGORY = eINSTANCE.getDiagnosticCategory();

        /**
         * The meta object literal for the '<em><b>Condition Name</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DIAGNOSTIC_CATEGORY__CONDITION_NAME = eINSTANCE.getDiagnosticCategory_ConditionName();

        /**
         * The meta object literal for the '<em><b>Category Name</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DIAGNOSTIC_CATEGORY__CATEGORY_NAME = eINSTANCE.getDiagnosticCategory_CategoryName();

        /**
         * The meta object literal for the '<em><b>Specificity</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DIAGNOSTIC_CATEGORY__SPECIFICITY = eINSTANCE.getDiagnosticCategory_Specificity();

    }

} // DiagnosticPackage
