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
 *   <li>{@link admitto.unum.model.diagnostic.QualifiedName#getQualifiednameeOpposite <em>Qualifiednamee Opposite</em>}</li>
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
     * Returns the value of the '<em><b>Qualifier</b></em>' reference.
     * It is bidirectional and its opposite is '{@link admitto.unum.model.diagnostic.QualifiedName#getQualifiednameeOpposite <em>Qualifiednamee Opposite</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Qualifier</em>' reference.
     * @see #setQualifier(QualifiedName)
     * @see admitto.unum.model.diagnostic.DiagnosticPackage#getQualifiedName_Qualifier()
     * @see admitto.unum.model.diagnostic.QualifiedName#getQualifiednameeOpposite
     * @model opposite="qualifiednameeOpposite"
     * @generated
     */
    QualifiedName getQualifier();

    /**
     * Sets the value of the '{@link admitto.unum.model.diagnostic.QualifiedName#getQualifier <em>Qualifier</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Qualifier</em>' reference.
     * @see #getQualifier()
     * @generated
     */
    void setQualifier(QualifiedName value);

    /**
     * Returns the value of the '<em><b>Qualifiednamee Opposite</b></em>' reference.
     * It is bidirectional and its opposite is '{@link admitto.unum.model.diagnostic.QualifiedName#getQualifier <em>Qualifier</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Qualifiednamee Opposite</em>' reference.
     * @see #setQualifiednameeOpposite(QualifiedName)
     * @see admitto.unum.model.diagnostic.DiagnosticPackage#getQualifiedName_QualifiednameeOpposite()
     * @see admitto.unum.model.diagnostic.QualifiedName#getQualifier
     * @model opposite="qualifier"
     * @generated
     */
    QualifiedName getQualifiednameeOpposite();

    /**
     * Sets the value of the '{@link admitto.unum.model.diagnostic.QualifiedName#getQualifiednameeOpposite <em>Qualifiednamee Opposite</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Qualifiednamee Opposite</em>' reference.
     * @see #getQualifiednameeOpposite()
     * @generated
     */
    void setQualifiednameeOpposite(QualifiedName value);

} // QualifiedName
