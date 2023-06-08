/**
 * Admitto Unum 2023
 */
package admitto.unum.model.diagnostic.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import admitto.unum.model.diagnostic.DiagnosticPackage;
import admitto.unum.model.diagnostic.Name;
import admitto.unum.model.diagnostic.Posting;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Posting</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link admitto.unum.model.diagnostic.impl.PostingImpl#getName <em>Name</em>}</li>
 *   <li>{@link admitto.unum.model.diagnostic.impl.PostingImpl#getId <em>Id</em>}</li>
 *   <li>{@link admitto.unum.model.diagnostic.impl.PostingImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PostingImpl
    extends MinimalEObjectImpl.Container
    implements
        Posting {
    /**
     * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected Name name;

    /**
     * The default value of the '{@link #getId() <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getId()
     * @generated
     * @ordered
     */
    protected static final String ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getId()
     * @generated
     * @ordered
     */
    protected String id = ID_EDEFAULT;

    /**
     * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValue()
     * @generated
     * @ordered
     */
    protected static final Object VALUE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValue()
     * @generated
     * @ordered
     */
    protected Object value = VALUE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PostingImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DiagnosticPackage.Literals.POSTING;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Name getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetName(Name newName, NotificationChain msgs) {
        Name oldName = name;
        name = newName;
        if (eNotificationRequired()) {
            ENotificationImpl notification =
                    new ENotificationImpl(this, Notification.SET, DiagnosticPackage.POSTING__NAME, oldName, newName);
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
    public void setName(Name newName) {
        if (newName != name) {
            NotificationChain msgs = null;
            if (name != null)
                msgs = ((InternalEObject) name)
                    .eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DiagnosticPackage.POSTING__NAME, null, msgs);
            if (newName != null)
                msgs = ((InternalEObject) newName)
                    .eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DiagnosticPackage.POSTING__NAME, null, msgs);
            msgs = basicSetName(newName, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DiagnosticPackage.POSTING__NAME, newName, newName));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getId() {
        return id;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setId(String newId) {
        String oldId = id;
        id = newId;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DiagnosticPackage.POSTING__ID, oldId, id));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getValue() {
        return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setValue(Object newValue) {
        Object oldValue = value;
        value = newValue;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DiagnosticPackage.POSTING__VALUE, oldValue, value));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case DiagnosticPackage.POSTING__NAME:
                return basicSetName(null, msgs);
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
            case DiagnosticPackage.POSTING__NAME:
                return getName();
            case DiagnosticPackage.POSTING__ID:
                return getId();
            case DiagnosticPackage.POSTING__VALUE:
                return getValue();
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
            case DiagnosticPackage.POSTING__NAME:
                setName((Name) newValue);
                return;
            case DiagnosticPackage.POSTING__ID:
                setId((String) newValue);
                return;
            case DiagnosticPackage.POSTING__VALUE:
                setValue(newValue);
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
            case DiagnosticPackage.POSTING__NAME:
                setName((Name) null);
                return;
            case DiagnosticPackage.POSTING__ID:
                setId(ID_EDEFAULT);
                return;
            case DiagnosticPackage.POSTING__VALUE:
                setValue(VALUE_EDEFAULT);
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
            case DiagnosticPackage.POSTING__NAME:
                return name != null;
            case DiagnosticPackage.POSTING__ID:
                return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
            case DiagnosticPackage.POSTING__VALUE:
                return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
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
    public String toString() {
        if (eIsProxy())
            return super.toString();

        StringBuilder result = new StringBuilder(super.toString());
        result.append(" (id: ");
        result.append(id);
        result.append(", value: ");
        result.append(value);
        result.append(')');
        return result.toString();
    }

} // PostingImpl
