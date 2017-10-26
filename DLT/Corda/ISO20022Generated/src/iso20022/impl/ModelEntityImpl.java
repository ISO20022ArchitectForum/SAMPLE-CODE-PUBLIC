/**
 */
package iso20022.impl;

import java.lang.String;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import iso20022.Iso20022Package;
import iso20022.ModelEntity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso20022.impl.ModelEntityImpl#getNextVersions <em>Next Versions</em>}</li>
 *   <li>{@link iso20022.impl.ModelEntityImpl#getPreviousVersion <em>Previous Version</em>}</li>
 *   <li>{@link iso20022.impl.ModelEntityImpl#getObjectIdentifier <em>Object Identifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ModelEntityImpl extends MinimalEObjectImpl.Container implements ModelEntity {
	/**
	 * The cached value of the '{@link #getNextVersions() <em>Next Versions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextVersions()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelEntity> nextVersions;

	/**
	 * The cached value of the '{@link #getPreviousVersion() <em>Previous Version</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreviousVersion()
	 * @generated
	 * @ordered
	 */
	protected ModelEntity previousVersion;

	/**
	 * The default value of the '{@link #getObjectIdentifier() <em>Object Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String OBJECT_IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getObjectIdentifier() <em>Object Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String objectIdentifier = OBJECT_IDENTIFIER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Iso20022Package.eINSTANCE.getModelEntity();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelEntity> getNextVersions() {
		if (nextVersions == null) {
			nextVersions = new EObjectWithInverseResolvingEList<ModelEntity>(ModelEntity.class, this, Iso20022Package.MODEL_ENTITY__NEXT_VERSIONS, Iso20022Package.MODEL_ENTITY__PREVIOUS_VERSION);
		}
		return nextVersions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelEntity getPreviousVersion() {
		if (previousVersion != null && previousVersion.eIsProxy()) {
			InternalEObject oldPreviousVersion = (InternalEObject)previousVersion;
			previousVersion = (ModelEntity)eResolveProxy(oldPreviousVersion);
			if (previousVersion != oldPreviousVersion) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Iso20022Package.MODEL_ENTITY__PREVIOUS_VERSION, oldPreviousVersion, previousVersion));
			}
		}
		return previousVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelEntity basicGetPreviousVersion() {
		return previousVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreviousVersion(ModelEntity newPreviousVersion, NotificationChain msgs) {
		ModelEntity oldPreviousVersion = previousVersion;
		previousVersion = newPreviousVersion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Iso20022Package.MODEL_ENTITY__PREVIOUS_VERSION, oldPreviousVersion, newPreviousVersion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreviousVersion(ModelEntity newPreviousVersion) {
		if (newPreviousVersion != previousVersion) {
			NotificationChain msgs = null;
			if (previousVersion != null)
				msgs = ((InternalEObject)previousVersion).eInverseRemove(this, Iso20022Package.MODEL_ENTITY__NEXT_VERSIONS, ModelEntity.class, msgs);
			if (newPreviousVersion != null)
				msgs = ((InternalEObject)newPreviousVersion).eInverseAdd(this, Iso20022Package.MODEL_ENTITY__NEXT_VERSIONS, ModelEntity.class, msgs);
			msgs = basicSetPreviousVersion(newPreviousVersion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Iso20022Package.MODEL_ENTITY__PREVIOUS_VERSION, newPreviousVersion, newPreviousVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getObjectIdentifier() {
		return objectIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectIdentifier(String newObjectIdentifier) {
		String oldObjectIdentifier = objectIdentifier;
		objectIdentifier = newObjectIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Iso20022Package.MODEL_ENTITY__OBJECT_IDENTIFIER, oldObjectIdentifier, objectIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Iso20022Package.MODEL_ENTITY__NEXT_VERSIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNextVersions()).basicAdd(otherEnd, msgs);
			case Iso20022Package.MODEL_ENTITY__PREVIOUS_VERSION:
				if (previousVersion != null)
					msgs = ((InternalEObject)previousVersion).eInverseRemove(this, Iso20022Package.MODEL_ENTITY__NEXT_VERSIONS, ModelEntity.class, msgs);
				return basicSetPreviousVersion((ModelEntity)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Iso20022Package.MODEL_ENTITY__NEXT_VERSIONS:
				return ((InternalEList<?>)getNextVersions()).basicRemove(otherEnd, msgs);
			case Iso20022Package.MODEL_ENTITY__PREVIOUS_VERSION:
				return basicSetPreviousVersion(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Iso20022Package.MODEL_ENTITY__NEXT_VERSIONS:
				return getNextVersions();
			case Iso20022Package.MODEL_ENTITY__PREVIOUS_VERSION:
				if (resolve) return getPreviousVersion();
				return basicGetPreviousVersion();
			case Iso20022Package.MODEL_ENTITY__OBJECT_IDENTIFIER:
				return getObjectIdentifier();
		}
		return super.eGet(featureID, resolve, coreType);
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
			case Iso20022Package.MODEL_ENTITY__NEXT_VERSIONS:
				getNextVersions().clear();
				getNextVersions().addAll((Collection<? extends ModelEntity>)newValue);
				return;
			case Iso20022Package.MODEL_ENTITY__PREVIOUS_VERSION:
				setPreviousVersion((ModelEntity)newValue);
				return;
			case Iso20022Package.MODEL_ENTITY__OBJECT_IDENTIFIER:
				setObjectIdentifier((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Iso20022Package.MODEL_ENTITY__NEXT_VERSIONS:
				getNextVersions().clear();
				return;
			case Iso20022Package.MODEL_ENTITY__PREVIOUS_VERSION:
				setPreviousVersion((ModelEntity)null);
				return;
			case Iso20022Package.MODEL_ENTITY__OBJECT_IDENTIFIER:
				setObjectIdentifier(OBJECT_IDENTIFIER_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Iso20022Package.MODEL_ENTITY__NEXT_VERSIONS:
				return nextVersions != null && !nextVersions.isEmpty();
			case Iso20022Package.MODEL_ENTITY__PREVIOUS_VERSION:
				return previousVersion != null;
			case Iso20022Package.MODEL_ENTITY__OBJECT_IDENTIFIER:
				return OBJECT_IDENTIFIER_EDEFAULT == null ? objectIdentifier != null : !OBJECT_IDENTIFIER_EDEFAULT.equals(objectIdentifier);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (objectIdentifier: ");
		result.append(objectIdentifier);
		result.append(')');
		return result.toString();
	}

} //ModelEntityImpl
