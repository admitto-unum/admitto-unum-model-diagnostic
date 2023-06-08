/**
 * Admitto Unum 2023
 */
package admitto.unum.model.diagnostic;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Qualified Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link admitto.unum.model.diagnostic.QualifiedName#getName <em>Name</em>}</li>
 *   <li>{@link admitto.unum.model.diagnostic.QualifiedName#getQualifier <em>Qualifier</em>}</li>
 * </ul>
 *
 * @see admitto.unum.model.diagnostic.DiagnosticPackage#getQualifiedName()
 * @model
 * @generated
 */
public interface QualifiedName
    extends
        Name {
    /**
     * Returns the value of the '<em><b>Name</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' containment reference.
     * @see #setName(SimpleName)
     * @see admitto.unum.model.diagnostic.DiagnosticPackage#getQualifiedName_Name()
     * @model containment="true" required="true"
     * @generated
     */
    SimpleName getName();

    /**
     * Sets the value of the '{@link admitto.unum.model.diagnostic.QualifiedName#getName <em>Name</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' containment reference.
     * @see #getName()
     * @generated
     */
    void setName(SimpleName value);

    /**
     * Returns the value of the '<em><b>Qualifier</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Return the superior name of this name.  If this instance does not have a superior name (i.e. it's the base name) then this reference is a null.
     *
     * <!-- end-model-doc -->
     * @return the value of the '<em>Qualifier</em>' containment reference.
     * @see #setQualifier(QualifiedName)
     * @see admitto.unum.model.diagnostic.DiagnosticPackage#getQualifiedName_Qualifier()
     * @model containment="true"
     * @generated
     */
    QualifiedName getQualifier();

    /**
     * Sets the value of the '{@link admitto.unum.model.diagnostic.QualifiedName#getQualifier <em>Qualifier</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Qualifier</em>' containment reference.
     * @see #getQualifier()
     * @generated
     */
    void setQualifier(QualifiedName value);

} // QualifiedName
