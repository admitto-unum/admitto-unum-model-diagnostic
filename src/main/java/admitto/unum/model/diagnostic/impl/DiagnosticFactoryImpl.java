/**
 * Admitto Unum 2023
 */
package admitto.unum.model.diagnostic.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import admitto.unum.model.diagnostic.DiagnosticCategory;
import admitto.unum.model.diagnostic.DiagnosticFactory;
import admitto.unum.model.diagnostic.DiagnosticPackage;
import admitto.unum.model.diagnostic.QualifiedName;
import admitto.unum.model.diagnostic.SimpleName;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DiagnosticFactoryImpl
    extends EFactoryImpl
    implements
        DiagnosticFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static DiagnosticFactory init() {
        try {
            DiagnosticFactory theDiagnosticFactory =
                    (DiagnosticFactory) EPackage.Registry.INSTANCE.getEFactory(DiagnosticPackage.eNS_URI);
            if (theDiagnosticFactory != null) {
                return theDiagnosticFactory;
            }
        } catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new DiagnosticFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DiagnosticFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case DiagnosticPackage.SIMPLE_NAME:
                return createSimpleName();
            case DiagnosticPackage.QUALIFIED_NAME:
                return createQualifiedName();
            case DiagnosticPackage.DIAGNOSTIC_CATEGORY:
                return createDiagnosticCategory();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SimpleName createSimpleName() {
        SimpleNameImpl simpleName = new SimpleNameImpl();
        return simpleName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public QualifiedName createQualifiedName() {
        QualifiedNameImpl qualifiedName = new QualifiedNameImpl();
        return qualifiedName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DiagnosticCategory createDiagnosticCategory() {
        DiagnosticCategoryImpl diagnosticCategory = new DiagnosticCategoryImpl();
        return diagnosticCategory;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DiagnosticPackage getDiagnosticPackage() {
        return (DiagnosticPackage) getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated DiagnosticPackage.eINSTANCE
     * @not_generated
     */
    @Deprecated
    public static DiagnosticPackage getPackage() {
        return DiagnosticPackage.eINSTANCE;
    }

} // DiagnosticFactoryImpl
