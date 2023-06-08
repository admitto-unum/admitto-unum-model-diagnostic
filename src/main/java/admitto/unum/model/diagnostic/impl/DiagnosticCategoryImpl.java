/**
 * Admitto Unum 2023
 */
package admitto.unum.model.diagnostic.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import admitto.unum.model.diagnostic.DiagnosticCategory;
import admitto.unum.model.diagnostic.DiagnosticPackage;
import admitto.unum.model.diagnostic.QualifiedName;
import admitto.unum.model.diagnostic.SimpleName;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Category</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link admitto.unum.model.diagnostic.impl.DiagnosticCategoryImpl#getConditionName <em>Condition Name</em>}</li>
 *   <li>{@link admitto.unum.model.diagnostic.impl.DiagnosticCategoryImpl#getCategoryName <em>Category Name</em>}</li>
 *   <li>{@link admitto.unum.model.diagnostic.impl.DiagnosticCategoryImpl#getSpecificity <em>Specificity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiagnosticCategoryImpl
    extends MinimalEObjectImpl.Container
    implements
        DiagnosticCategory {
    /**
     * The cached value of the '{@link #getConditionName() <em>Condition Name</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConditionName()
     * @generated
     * @ordered
     */
    protected SimpleName conditionName;

    /**
     * The cached value of the '{@link #getCategoryName() <em>Category Name</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCategoryName()
     * @generated
     * @ordered
     */
    protected SimpleName categoryName;

    /**
     * The cached value of the '{@link #getSpecificity() <em>Specificity</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSpecificity()
     * @generated
     * @ordered
     */
    protected QualifiedName specificity;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DiagnosticCategoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DiagnosticPackage.Literals.DIAGNOSTIC_CATEGORY;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SimpleName getConditionName() {
        if (conditionName != null && conditionName.eIsProxy()) {
            InternalEObject oldConditionName = (InternalEObject) conditionName;
            conditionName = (SimpleName) eResolveProxy(oldConditionName);
            if (conditionName != oldConditionName) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(
                            this,
                                Notification.RESOLVE,
                                DiagnosticPackage.DIAGNOSTIC_CATEGORY__CONDITION_NAME,
                                oldConditionName,
                                conditionName));
            }
        }
        return conditionName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SimpleName basicGetConditionName() {
        return conditionName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setConditionName(SimpleName newConditionName) {
        SimpleName oldConditionName = conditionName;
        conditionName = newConditionName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(
                    this,
                        Notification.SET,
                        DiagnosticPackage.DIAGNOSTIC_CATEGORY__CONDITION_NAME,
                        oldConditionName,
                        conditionName));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SimpleName getCategoryName() {
        if (categoryName != null && categoryName.eIsProxy()) {
            InternalEObject oldCategoryName = (InternalEObject) categoryName;
            categoryName = (SimpleName) eResolveProxy(oldCategoryName);
            if (categoryName != oldCategoryName) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(
                            this,
                                Notification.RESOLVE,
                                DiagnosticPackage.DIAGNOSTIC_CATEGORY__CATEGORY_NAME,
                                oldCategoryName,
                                categoryName));
            }
        }
        return categoryName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SimpleName basicGetCategoryName() {
        return categoryName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCategoryName(SimpleName newCategoryName) {
        SimpleName oldCategoryName = categoryName;
        categoryName = newCategoryName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(
                    this,
                        Notification.SET,
                        DiagnosticPackage.DIAGNOSTIC_CATEGORY__CATEGORY_NAME,
                        oldCategoryName,
                        categoryName));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public QualifiedName getSpecificity() {
        if (specificity != null && specificity.eIsProxy()) {
            InternalEObject oldSpecificity = (InternalEObject) specificity;
            specificity = (QualifiedName) eResolveProxy(oldSpecificity);
            if (specificity != oldSpecificity) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(
                            this,
                                Notification.RESOLVE,
                                DiagnosticPackage.DIAGNOSTIC_CATEGORY__SPECIFICITY,
                                oldSpecificity,
                                specificity));
            }
        }
        return specificity;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public QualifiedName basicGetSpecificity() {
        return specificity;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSpecificity(QualifiedName newSpecificity) {
        QualifiedName oldSpecificity = specificity;
        specificity = newSpecificity;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(
                    this,
                        Notification.SET,
                        DiagnosticPackage.DIAGNOSTIC_CATEGORY__SPECIFICITY,
                        oldSpecificity,
                        specificity));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case DiagnosticPackage.DIAGNOSTIC_CATEGORY__CONDITION_NAME:
                if (resolve)
                    return getConditionName();
                return basicGetConditionName();
            case DiagnosticPackage.DIAGNOSTIC_CATEGORY__CATEGORY_NAME:
                if (resolve)
                    return getCategoryName();
                return basicGetCategoryName();
            case DiagnosticPackage.DIAGNOSTIC_CATEGORY__SPECIFICITY:
                if (resolve)
                    return getSpecificity();
                return basicGetSpecificity();
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
            case DiagnosticPackage.DIAGNOSTIC_CATEGORY__CONDITION_NAME:
                setConditionName((SimpleName) newValue);
                return;
            case DiagnosticPackage.DIAGNOSTIC_CATEGORY__CATEGORY_NAME:
                setCategoryName((SimpleName) newValue);
                return;
            case DiagnosticPackage.DIAGNOSTIC_CATEGORY__SPECIFICITY:
                setSpecificity((QualifiedName) newValue);
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
            case DiagnosticPackage.DIAGNOSTIC_CATEGORY__CONDITION_NAME:
                setConditionName((SimpleName) null);
                return;
            case DiagnosticPackage.DIAGNOSTIC_CATEGORY__CATEGORY_NAME:
                setCategoryName((SimpleName) null);
                return;
            case DiagnosticPackage.DIAGNOSTIC_CATEGORY__SPECIFICITY:
                setSpecificity((QualifiedName) null);
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
            case DiagnosticPackage.DIAGNOSTIC_CATEGORY__CONDITION_NAME:
                return conditionName != null;
            case DiagnosticPackage.DIAGNOSTIC_CATEGORY__CATEGORY_NAME:
                return categoryName != null;
            case DiagnosticPackage.DIAGNOSTIC_CATEGORY__SPECIFICITY:
                return specificity != null;
            default:
                return super.eIsSet(featureID);
        }
    }

} // DiagnosticCategoryImpl
