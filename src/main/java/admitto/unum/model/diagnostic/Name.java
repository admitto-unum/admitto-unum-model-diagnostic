/**
 * Admitto Unum 2023
 */
package admitto.unum.model.diagnostic;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Name</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see admitto.unum.model.diagnostic.DiagnosticPackage#getName_()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Name
    extends
        EObject {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Check if this Name represents a simple name.
     *
     * @return  true iff the class implementation represents a simple (nonqualified) name.  The implemenataton class should not be both a SimpleName and QualifiedName.
     * <!-- end-model-doc -->
     * @model kind="operation"
     * @generated
     */
    boolean isSimpleName();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Check if this Name is a qualified name.
     *
     * @return true iff the class implemenation represents a Qualified Name.  The implemenataton class should not be both a SimpleName and QualifiedName.
     * <!-- end-model-doc -->
     * @model kind="operation"
     * @generated
     */
    boolean isQualifiedName();

} // Name
