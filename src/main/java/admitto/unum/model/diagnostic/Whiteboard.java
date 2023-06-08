/**
 * Admitto Unum 2023
 */
package admitto.unum.model.diagnostic;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Whiteboard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link admitto.unum.model.diagnostic.Whiteboard#getPostings <em>Postings</em>}</li>
 * </ul>
 *
 * @see admitto.unum.model.diagnostic.DiagnosticPackage#getWhiteboard()
 * @model
 * @generated
 */
public interface Whiteboard
    extends
        EObject {
    /**
     * Returns the value of the '<em><b>Postings</b></em>' containment reference list.
     * The list contents are of type {@link admitto.unum.model.diagnostic.Posting}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Postings</em>' containment reference list.
     * @see admitto.unum.model.diagnostic.DiagnosticPackage#getWhiteboard_Postings()
     * @model containment="true"
     * @generated
     */
    EList<Posting> getPostings();

} // Whiteboard
