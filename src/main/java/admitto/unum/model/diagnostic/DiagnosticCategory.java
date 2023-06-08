/**
 * Admitto Unum 2023
 */
package admitto.unum.model.diagnostic;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link admitto.unum.model.diagnostic.DiagnosticCategory#getConditionName <em>Condition Name</em>}</li>
 *   <li>{@link admitto.unum.model.diagnostic.DiagnosticCategory#getCategoryName <em>Category Name</em>}</li>
 *   <li>{@link admitto.unum.model.diagnostic.DiagnosticCategory#getSpecificity <em>Specificity</em>}</li>
 * </ul>
 *
 * @see admitto.unum.model.diagnostic.DiagnosticPackage#getDiagnosticCategory()
 * @model
 * @generated
 */
public interface DiagnosticCategory
    extends
        EObject {
    /**
     * Returns the value of the '<em><b>Condition Name</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Condition Name</em>' reference.
     * @see #setConditionName(SimpleName)
     * @see admitto.unum.model.diagnostic.DiagnosticPackage#getDiagnosticCategory_ConditionName()
     * @model required="true"
     * @generated
     */
    SimpleName getConditionName();

    /**
     * Sets the value of the '{@link admitto.unum.model.diagnostic.DiagnosticCategory#getConditionName <em>Condition Name</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Condition Name</em>' reference.
     * @see #getConditionName()
     * @generated
     */
    void setConditionName(SimpleName value);

    /**
     * Returns the value of the '<em><b>Category Name</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Category Name</em>' reference.
     * @see #setCategoryName(SimpleName)
     * @see admitto.unum.model.diagnostic.DiagnosticPackage#getDiagnosticCategory_CategoryName()
     * @model required="true"
     * @generated
     */
    SimpleName getCategoryName();

    /**
     * Sets the value of the '{@link admitto.unum.model.diagnostic.DiagnosticCategory#getCategoryName <em>Category Name</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Category Name</em>' reference.
     * @see #getCategoryName()
     * @generated
     */
    void setCategoryName(SimpleName value);

    /**
     * Returns the value of the '<em><b>Specificity</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Specificity</em>' reference.
     * @see #setSpecificity(QualifiedName)
     * @see admitto.unum.model.diagnostic.DiagnosticPackage#getDiagnosticCategory_Specificity()
     * @model
     * @generated
     */
    QualifiedName getSpecificity();

    /**
     * Sets the value of the '{@link admitto.unum.model.diagnostic.DiagnosticCategory#getSpecificity <em>Specificity</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Specificity</em>' reference.
     * @see #getSpecificity()
     * @generated
     */
    void setSpecificity(QualifiedName value);

} // DiagnosticCategory
