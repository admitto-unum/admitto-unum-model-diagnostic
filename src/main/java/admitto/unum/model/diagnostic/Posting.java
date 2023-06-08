/**
 * Admitto Unum 2023
 */
package admitto.unum.model.diagnostic;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Posting</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link admitto.unum.model.diagnostic.Posting#getName <em>Name</em>}</li>
 *   <li>{@link admitto.unum.model.diagnostic.Posting#getId <em>Id</em>}</li>
 *   <li>{@link admitto.unum.model.diagnostic.Posting#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see admitto.unum.model.diagnostic.DiagnosticPackage#getPosting()
 * @model
 * @generated
 */
public interface Posting
    extends
        EObject {
    /**
     * Returns the value of the '<em><b>Name</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' containment reference.
     * @see #setName(Name)
     * @see admitto.unum.model.diagnostic.DiagnosticPackage#getPosting_Name()
     * @model containment="true" required="true"
     * @generated
     */
    Name getName();

    /**
     * Sets the value of the '{@link admitto.unum.model.diagnostic.Posting#getName <em>Name</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' containment reference.
     * @see #getName()
     * @generated
     */
    void setName(Name value);

    /**
     * Returns the value of the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Id</em>' attribute.
     * @see #setId(String)
     * @see admitto.unum.model.diagnostic.DiagnosticPackage#getPosting_Id()
     * @model unique="false" id="true" ordered="false"
     * @generated
     */
    String getId();

    /**
     * Sets the value of the '{@link admitto.unum.model.diagnostic.Posting#getId <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Id</em>' attribute.
     * @see #getId()
     * @generated
     */
    void setId(String value);

    /**
     * Returns the value of the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Value</em>' attribute.
     * @see #setValue(Object)
     * @see admitto.unum.model.diagnostic.DiagnosticPackage#getPosting_Value()
     * @model unique="false" ordered="false"
     * @generated
     */
    Object getValue();

    /**
     * Sets the value of the '{@link admitto.unum.model.diagnostic.Posting#getValue <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value</em>' attribute.
     * @see #getValue()
     * @generated
     */
    void setValue(Object value);

} // Posting
