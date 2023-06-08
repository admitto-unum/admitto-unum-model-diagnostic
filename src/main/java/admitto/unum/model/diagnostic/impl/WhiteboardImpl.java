/**
 * Admitto Unum 2023
 */
package admitto.unum.model.diagnostic.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import admitto.unum.model.diagnostic.DiagnosticPackage;
import admitto.unum.model.diagnostic.Posting;
import admitto.unum.model.diagnostic.Whiteboard;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Whiteboard</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link admitto.unum.model.diagnostic.impl.WhiteboardImpl#getPostings <em>Postings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WhiteboardImpl
    extends MinimalEObjectImpl.Container
    implements
        Whiteboard {
    /**
     * The cached value of the '{@link #getPostings() <em>Postings</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPostings()
     * @generated
     * @ordered
     */
    protected EList<Posting> postings;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected WhiteboardImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DiagnosticPackage.Literals.WHITEBOARD;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<Posting> getPostings() {
        if (postings == null) {
            postings =
                    new EObjectContainmentEList<>(Posting.class, this, DiagnosticPackage.WHITEBOARD__POSTINGS);
        }
        return postings;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case DiagnosticPackage.WHITEBOARD__POSTINGS:
                return ((InternalEList<?>) getPostings()).basicRemove(otherEnd, msgs);
            default:
                return super.eInverseRemove(otherEnd, featureID, msgs);
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case DiagnosticPackage.WHITEBOARD__POSTINGS:
                return getPostings();
            default:
                return super.eGet(featureID, resolve, coreType);
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case DiagnosticPackage.WHITEBOARD__POSTINGS:
                getPostings().clear();
                getPostings().addAll((Collection<? extends Posting>) newValue);
                return;
            default:
                super.eSet(featureID, newValue);
                return;
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case DiagnosticPackage.WHITEBOARD__POSTINGS:
                getPostings().clear();
                return;
            default:
                super.eUnset(featureID);
                return;
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case DiagnosticPackage.WHITEBOARD__POSTINGS:
                return postings != null && !postings.isEmpty();
            default:
                return super.eIsSet(featureID);
        }
    }

} // WhiteboardImpl
