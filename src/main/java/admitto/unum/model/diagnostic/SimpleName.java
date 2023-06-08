/**
 * Admitto Unum 2023
 */
package admitto.unum.model.diagnostic;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link admitto.unum.model.diagnostic.SimpleName#getIdentifier <em>Identifier</em>}</li>
 * </ul>
 *
 * @see admitto.unum.model.diagnostic.DiagnosticPackage#getSimpleName()
 * @model
 * @generated
 */
public interface SimpleName
    extends
        Name {
    /**
     * Returns the value of the '<em><b>Identifier</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Identifier</em>' attribute.
     * @see #setIdentifier(String)
     * @see admitto.unum.model.diagnostic.DiagnosticPackage#getSimpleName_Identifier()
     * @model unique="false" required="true"
     * @generated
     */
    String getIdentifier();

    /**
     * Sets the value of the '{@link admitto.unum.model.diagnostic.SimpleName#getIdentifier <em>Identifier</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Identifier</em>' attribute.
     * @see #getIdentifier()
     * @generated
     */
    void setIdentifier(String value);

} // SimpleName
