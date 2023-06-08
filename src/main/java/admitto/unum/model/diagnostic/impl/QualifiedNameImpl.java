/**
 * Admitto Unum 2023
 */
package admitto.unum.model.diagnostic.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import admitto.unum.model.diagnostic.DiagnosticPackage;
import admitto.unum.model.diagnostic.QualifiedName;
import admitto.unum.model.diagnostic.SimpleName;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Qualified Name</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link admitto.unum.model.diagnostic.impl.QualifiedNameImpl#getName <em>Name</em>}</li>
 *   <li>{@link admitto.unum.model.diagnostic.impl.QualifiedNameImpl#getQualifier <em>Qualifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QualifiedNameImpl
    extends MinimalEObjectImpl.Container
    implements
        QualifiedName {
    /**
     * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected SimpleName name;

    /**
     * The cached value of the '{@link #getQualifier() <em>Qualifier</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQualifier()
     * @generated
     * @ordered
     */
    protected QualifiedName qualifier;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected QualifiedNameImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DiagnosticPackage.Literals.QUALIFIED_NAME;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SimpleName getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetName(SimpleName newName, NotificationChain msgs) {
        SimpleName oldName = name;
        name = newName;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(
                    this,
                        Notification.SET,
                        DiagnosticPackage.QUALIFIED_NAME__NAME,
                        oldName,
                        newName);
            if (msgs == null)
                msgs = notification;
            else
                msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setName(SimpleName newName) {
        if (newName != name) {
            NotificationChain msgs = null;
            if (name != null)
                msgs = ((InternalEObject) name)
                    .eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DiagnosticPackage.QUALIFIED_NAME__NAME, null, msgs);
            if (newName != null)
                msgs = ((InternalEObject) newName)
                    .eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DiagnosticPackage.QUALIFIED_NAME__NAME, null, msgs);
            msgs = basicSetName(newName, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(
                    this,
                        Notification.SET,
                        DiagnosticPackage.QUALIFIED_NAME__NAME,
                        newName,
                        newName));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public QualifiedName getQualifier() {
        return qualifier;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetQualifier(QualifiedName newQualifier, NotificationChain msgs) {
        QualifiedName oldQualifier = qualifier;
        qualifier = newQualifier;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(
                    this,
                        Notification.SET,
                        DiagnosticPackage.QUALIFIED_NAME__QUALIFIER,
                        oldQualifier,
                        newQualifier);
            if (msgs == null)
                msgs = notification;
            else
                msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setQualifier(QualifiedName newQualifier) {
        if (newQualifier != qualifier) {
            NotificationChain msgs = null;
            if (qualifier != null)
                msgs = ((InternalEObject) qualifier)
                    .eInverseRemove(this,
                                    EOPPOSITE_FEATURE_BASE - DiagnosticPackage.QUALIFIED_NAME__QUALIFIER,
                                    null,
                                    msgs);
            if (newQualifier != null)
                msgs = ((InternalEObject) newQualifier)
                    .eInverseAdd(this,
                                 EOPPOSITE_FEATURE_BASE - DiagnosticPackage.QUALIFIED_NAME__QUALIFIER,
                                 null,
                                 msgs);
            msgs = basicSetQualifier(newQualifier, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(
                    this,
                        Notification.SET,
                        DiagnosticPackage.QUALIFIED_NAME__QUALIFIER,
                        newQualifier,
                        newQualifier));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @not_generated
     */
    @Override
    public boolean isSimpleName() {
        return false;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @not_generated
     */
    @Override
    public boolean isQualifiedName() {
        return true;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case DiagnosticPackage.QUALIFIED_NAME__NAME:
                return basicSetName(null, msgs);
            case DiagnosticPackage.QUALIFIED_NAME__QUALIFIER:
                return basicSetQualifier(null, msgs);
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
            case DiagnosticPackage.QUALIFIED_NAME__NAME:
                return getName();
            case DiagnosticPackage.QUALIFIED_NAME__QUALIFIER:
                return getQualifier();
            default:
                return super.eGet(featureID, resolve, coreType);
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case DiagnosticPackage.QUALIFIED_NAME__NAME:
                setName((SimpleName) newValue);
                return;
            case DiagnosticPackage.QUALIFIED_NAME__QUALIFIER:
                setQualifier((QualifiedName) newValue);
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
            case DiagnosticPackage.QUALIFIED_NAME__NAME:
                setName((SimpleName) null);
                return;
            case DiagnosticPackage.QUALIFIED_NAME__QUALIFIER:
                setQualifier((QualifiedName) null);
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
            case DiagnosticPackage.QUALIFIED_NAME__NAME:
                return name != null;
            case DiagnosticPackage.QUALIFIED_NAME__QUALIFIER:
                return qualifier != null;
            default:
                return super.eIsSet(featureID);
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eInvoke(int operationID, EList<?> arguments)
        throws InvocationTargetException {
        switch (operationID) {
            case DiagnosticPackage.QUALIFIED_NAME___IS_SIMPLE_NAME:
                return isSimpleName();
            case DiagnosticPackage.QUALIFIED_NAME___IS_QUALIFIED_NAME:
                return isQualifiedName();
            default:
                return super.eInvoke(operationID, arguments);
        }
    }

} // QualifiedNameImpl
