/**
 * Admitto Unum 2023
 */
package admitto.unum.model.diagnostic;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see admitto.unum.model.diagnostic.DiagnosticPackage
 * @generated
 */
public interface DiagnosticFactory
    extends
        EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    DiagnosticFactory eINSTANCE = admitto.unum.model.diagnostic.impl.DiagnosticFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Simple Name</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Simple Name</em>'.
     * @generated
     */
    SimpleName createSimpleName();

    /**
     * Returns a new object of class '<em>Qualified Name</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Qualified Name</em>'.
     * @generated
     */
    QualifiedName createQualifiedName();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    DiagnosticPackage getDiagnosticPackage();

} // DiagnosticFactory
