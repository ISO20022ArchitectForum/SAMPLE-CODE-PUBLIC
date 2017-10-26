/**
 */
package iso20022.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import iso20022.BusinessProcess;
import iso20022.BusinessRole;
import iso20022.Iso20022Package;
import iso20022.Participant;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Business Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso20022.impl.BusinessRoleImpl#getBusinessRoleTrace <em>Business Role Trace</em>}</li>
 *   <li>{@link iso20022.impl.BusinessRoleImpl#getBusinessProcess <em>Business Process</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BusinessRoleImpl extends RepositoryConceptImpl implements BusinessRole {
	/**
	 * The cached value of the '{@link #getBusinessRoleTrace() <em>Business Role Trace</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessRoleTrace()
	 * @generated
	 * @ordered
	 */
	protected EList<Participant> businessRoleTrace;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusinessRoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Iso20022Package.eINSTANCE.getBusinessRole();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Participant> getBusinessRoleTrace() {
		if (businessRoleTrace == null) {
			businessRoleTrace = new EObjectWithInverseResolvingEList<Participant>(Participant.class, this, Iso20022Package.BUSINESS_ROLE__BUSINESS_ROLE_TRACE, Iso20022Package.PARTICIPANT__BUSINESS_ROLE_TRACE);
		}
		return businessRoleTrace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessProcess getBusinessProcess() {
		if (eContainerFeatureID() != Iso20022Package.BUSINESS_ROLE__BUSINESS_PROCESS) return null;
		return (BusinessProcess)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBusinessProcess(BusinessProcess newBusinessProcess, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newBusinessProcess, Iso20022Package.BUSINESS_ROLE__BUSINESS_PROCESS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBusinessProcess(BusinessProcess newBusinessProcess) {
		if (newBusinessProcess != eInternalContainer() || (eContainerFeatureID() != Iso20022Package.BUSINESS_ROLE__BUSINESS_PROCESS && newBusinessProcess != null)) {
			if (EcoreUtil.isAncestor(this, newBusinessProcess))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newBusinessProcess != null)
				msgs = ((InternalEObject)newBusinessProcess).eInverseAdd(this, Iso20022Package.BUSINESS_PROCESS__BUSINESS_ROLE, BusinessProcess.class, msgs);
			msgs = basicSetBusinessProcess(newBusinessProcess, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Iso20022Package.BUSINESS_ROLE__BUSINESS_PROCESS, newBusinessProcess, newBusinessProcess));
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
			case Iso20022Package.BUSINESS_ROLE__BUSINESS_ROLE_TRACE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBusinessRoleTrace()).basicAdd(otherEnd, msgs);
			case Iso20022Package.BUSINESS_ROLE__BUSINESS_PROCESS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetBusinessProcess((BusinessProcess)otherEnd, msgs);
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
			case Iso20022Package.BUSINESS_ROLE__BUSINESS_ROLE_TRACE:
				return ((InternalEList<?>)getBusinessRoleTrace()).basicRemove(otherEnd, msgs);
			case Iso20022Package.BUSINESS_ROLE__BUSINESS_PROCESS:
				return basicSetBusinessProcess(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case Iso20022Package.BUSINESS_ROLE__BUSINESS_PROCESS:
				return eInternalContainer().eInverseRemove(this, Iso20022Package.BUSINESS_PROCESS__BUSINESS_ROLE, BusinessProcess.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Iso20022Package.BUSINESS_ROLE__BUSINESS_ROLE_TRACE:
				return getBusinessRoleTrace();
			case Iso20022Package.BUSINESS_ROLE__BUSINESS_PROCESS:
				return getBusinessProcess();
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
			case Iso20022Package.BUSINESS_ROLE__BUSINESS_ROLE_TRACE:
				getBusinessRoleTrace().clear();
				getBusinessRoleTrace().addAll((Collection<? extends Participant>)newValue);
				return;
			case Iso20022Package.BUSINESS_ROLE__BUSINESS_PROCESS:
				setBusinessProcess((BusinessProcess)newValue);
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
			case Iso20022Package.BUSINESS_ROLE__BUSINESS_ROLE_TRACE:
				getBusinessRoleTrace().clear();
				return;
			case Iso20022Package.BUSINESS_ROLE__BUSINESS_PROCESS:
				setBusinessProcess((BusinessProcess)null);
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
			case Iso20022Package.BUSINESS_ROLE__BUSINESS_ROLE_TRACE:
				return businessRoleTrace != null && !businessRoleTrace.isEmpty();
			case Iso20022Package.BUSINESS_ROLE__BUSINESS_PROCESS:
				return getBusinessProcess() != null;
		}
		return super.eIsSet(featureID);
	}

} //BusinessRoleImpl
