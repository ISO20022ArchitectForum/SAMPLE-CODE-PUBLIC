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

import iso20022.BusinessRole;
import iso20022.BusinessTransaction;
import iso20022.Iso20022Package;
import iso20022.MultiplicityEntity;
import iso20022.Participant;
import iso20022.Receive;
import iso20022.Send;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Participant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso20022.impl.ParticipantImpl#getMaxOccurs <em>Max Occurs</em>}</li>
 *   <li>{@link iso20022.impl.ParticipantImpl#getMinOccurs <em>Min Occurs</em>}</li>
 *   <li>{@link iso20022.impl.ParticipantImpl#getBusinessTransaction <em>Business Transaction</em>}</li>
 *   <li>{@link iso20022.impl.ParticipantImpl#getReceives <em>Receives</em>}</li>
 *   <li>{@link iso20022.impl.ParticipantImpl#getSends <em>Sends</em>}</li>
 *   <li>{@link iso20022.impl.ParticipantImpl#getBusinessRoleTrace <em>Business Role Trace</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParticipantImpl extends RepositoryConceptImpl implements Participant {
	/**
	 * The default value of the '{@link #getMaxOccurs() <em>Max Occurs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxOccurs()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MAX_OCCURS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxOccurs() <em>Max Occurs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxOccurs()
	 * @generated
	 * @ordered
	 */
	protected Integer maxOccurs = MAX_OCCURS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinOccurs() <em>Min Occurs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinOccurs()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MIN_OCCURS_EDEFAULT = new Integer(0);

	/**
	 * The cached value of the '{@link #getMinOccurs() <em>Min Occurs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinOccurs()
	 * @generated
	 * @ordered
	 */
	protected Integer minOccurs = MIN_OCCURS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReceives() <em>Receives</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceives()
	 * @generated
	 * @ordered
	 */
	protected EList<Receive> receives;

	/**
	 * The cached value of the '{@link #getSends() <em>Sends</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSends()
	 * @generated
	 * @ordered
	 */
	protected EList<Send> sends;

	/**
	 * The cached value of the '{@link #getBusinessRoleTrace() <em>Business Role Trace</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessRoleTrace()
	 * @generated
	 * @ordered
	 */
	protected BusinessRole businessRoleTrace;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParticipantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Iso20022Package.eINSTANCE.getParticipant();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getMaxOccurs() {
		return maxOccurs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxOccurs(Integer newMaxOccurs) {
		Integer oldMaxOccurs = maxOccurs;
		maxOccurs = newMaxOccurs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Iso20022Package.PARTICIPANT__MAX_OCCURS, oldMaxOccurs, maxOccurs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getMinOccurs() {
		return minOccurs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinOccurs(Integer newMinOccurs) {
		Integer oldMinOccurs = minOccurs;
		minOccurs = newMinOccurs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Iso20022Package.PARTICIPANT__MIN_OCCURS, oldMinOccurs, minOccurs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessTransaction getBusinessTransaction() {
		if (eContainerFeatureID() != Iso20022Package.PARTICIPANT__BUSINESS_TRANSACTION) return null;
		return (BusinessTransaction)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBusinessTransaction(BusinessTransaction newBusinessTransaction, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newBusinessTransaction, Iso20022Package.PARTICIPANT__BUSINESS_TRANSACTION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBusinessTransaction(BusinessTransaction newBusinessTransaction) {
		if (newBusinessTransaction != eInternalContainer() || (eContainerFeatureID() != Iso20022Package.PARTICIPANT__BUSINESS_TRANSACTION && newBusinessTransaction != null)) {
			if (EcoreUtil.isAncestor(this, newBusinessTransaction))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newBusinessTransaction != null)
				msgs = ((InternalEObject)newBusinessTransaction).eInverseAdd(this, Iso20022Package.BUSINESS_TRANSACTION__PARTICIPANT, BusinessTransaction.class, msgs);
			msgs = basicSetBusinessTransaction(newBusinessTransaction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Iso20022Package.PARTICIPANT__BUSINESS_TRANSACTION, newBusinessTransaction, newBusinessTransaction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Receive> getReceives() {
		if (receives == null) {
			receives = new EObjectWithInverseResolvingEList<Receive>(Receive.class, this, Iso20022Package.PARTICIPANT__RECEIVES, Iso20022Package.RECEIVE__RECEIVER);
		}
		return receives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Send> getSends() {
		if (sends == null) {
			sends = new EObjectWithInverseResolvingEList<Send>(Send.class, this, Iso20022Package.PARTICIPANT__SENDS, Iso20022Package.SEND__SENDER);
		}
		return sends;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessRole getBusinessRoleTrace() {
		if (businessRoleTrace != null && businessRoleTrace.eIsProxy()) {
			InternalEObject oldBusinessRoleTrace = (InternalEObject)businessRoleTrace;
			businessRoleTrace = (BusinessRole)eResolveProxy(oldBusinessRoleTrace);
			if (businessRoleTrace != oldBusinessRoleTrace) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Iso20022Package.PARTICIPANT__BUSINESS_ROLE_TRACE, oldBusinessRoleTrace, businessRoleTrace));
			}
		}
		return businessRoleTrace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessRole basicGetBusinessRoleTrace() {
		return businessRoleTrace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBusinessRoleTrace(BusinessRole newBusinessRoleTrace, NotificationChain msgs) {
		BusinessRole oldBusinessRoleTrace = businessRoleTrace;
		businessRoleTrace = newBusinessRoleTrace;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Iso20022Package.PARTICIPANT__BUSINESS_ROLE_TRACE, oldBusinessRoleTrace, newBusinessRoleTrace);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBusinessRoleTrace(BusinessRole newBusinessRoleTrace) {
		if (newBusinessRoleTrace != businessRoleTrace) {
			NotificationChain msgs = null;
			if (businessRoleTrace != null)
				msgs = ((InternalEObject)businessRoleTrace).eInverseRemove(this, Iso20022Package.BUSINESS_ROLE__BUSINESS_ROLE_TRACE, BusinessRole.class, msgs);
			if (newBusinessRoleTrace != null)
				msgs = ((InternalEObject)newBusinessRoleTrace).eInverseAdd(this, Iso20022Package.BUSINESS_ROLE__BUSINESS_ROLE_TRACE, BusinessRole.class, msgs);
			msgs = basicSetBusinessRoleTrace(newBusinessRoleTrace, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Iso20022Package.PARTICIPANT__BUSINESS_ROLE_TRACE, newBusinessRoleTrace, newBusinessRoleTrace));
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
			case Iso20022Package.PARTICIPANT__BUSINESS_TRANSACTION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetBusinessTransaction((BusinessTransaction)otherEnd, msgs);
			case Iso20022Package.PARTICIPANT__RECEIVES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReceives()).basicAdd(otherEnd, msgs);
			case Iso20022Package.PARTICIPANT__SENDS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSends()).basicAdd(otherEnd, msgs);
			case Iso20022Package.PARTICIPANT__BUSINESS_ROLE_TRACE:
				if (businessRoleTrace != null)
					msgs = ((InternalEObject)businessRoleTrace).eInverseRemove(this, Iso20022Package.BUSINESS_ROLE__BUSINESS_ROLE_TRACE, BusinessRole.class, msgs);
				return basicSetBusinessRoleTrace((BusinessRole)otherEnd, msgs);
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
			case Iso20022Package.PARTICIPANT__BUSINESS_TRANSACTION:
				return basicSetBusinessTransaction(null, msgs);
			case Iso20022Package.PARTICIPANT__RECEIVES:
				return ((InternalEList<?>)getReceives()).basicRemove(otherEnd, msgs);
			case Iso20022Package.PARTICIPANT__SENDS:
				return ((InternalEList<?>)getSends()).basicRemove(otherEnd, msgs);
			case Iso20022Package.PARTICIPANT__BUSINESS_ROLE_TRACE:
				return basicSetBusinessRoleTrace(null, msgs);
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
			case Iso20022Package.PARTICIPANT__BUSINESS_TRANSACTION:
				return eInternalContainer().eInverseRemove(this, Iso20022Package.BUSINESS_TRANSACTION__PARTICIPANT, BusinessTransaction.class, msgs);
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
			case Iso20022Package.PARTICIPANT__MAX_OCCURS:
				return getMaxOccurs();
			case Iso20022Package.PARTICIPANT__MIN_OCCURS:
				return getMinOccurs();
			case Iso20022Package.PARTICIPANT__BUSINESS_TRANSACTION:
				return getBusinessTransaction();
			case Iso20022Package.PARTICIPANT__RECEIVES:
				return getReceives();
			case Iso20022Package.PARTICIPANT__SENDS:
				return getSends();
			case Iso20022Package.PARTICIPANT__BUSINESS_ROLE_TRACE:
				if (resolve) return getBusinessRoleTrace();
				return basicGetBusinessRoleTrace();
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
			case Iso20022Package.PARTICIPANT__MAX_OCCURS:
				setMaxOccurs((Integer)newValue);
				return;
			case Iso20022Package.PARTICIPANT__MIN_OCCURS:
				setMinOccurs((Integer)newValue);
				return;
			case Iso20022Package.PARTICIPANT__BUSINESS_TRANSACTION:
				setBusinessTransaction((BusinessTransaction)newValue);
				return;
			case Iso20022Package.PARTICIPANT__RECEIVES:
				getReceives().clear();
				getReceives().addAll((Collection<? extends Receive>)newValue);
				return;
			case Iso20022Package.PARTICIPANT__SENDS:
				getSends().clear();
				getSends().addAll((Collection<? extends Send>)newValue);
				return;
			case Iso20022Package.PARTICIPANT__BUSINESS_ROLE_TRACE:
				setBusinessRoleTrace((BusinessRole)newValue);
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
			case Iso20022Package.PARTICIPANT__MAX_OCCURS:
				setMaxOccurs(MAX_OCCURS_EDEFAULT);
				return;
			case Iso20022Package.PARTICIPANT__MIN_OCCURS:
				setMinOccurs(MIN_OCCURS_EDEFAULT);
				return;
			case Iso20022Package.PARTICIPANT__BUSINESS_TRANSACTION:
				setBusinessTransaction((BusinessTransaction)null);
				return;
			case Iso20022Package.PARTICIPANT__RECEIVES:
				getReceives().clear();
				return;
			case Iso20022Package.PARTICIPANT__SENDS:
				getSends().clear();
				return;
			case Iso20022Package.PARTICIPANT__BUSINESS_ROLE_TRACE:
				setBusinessRoleTrace((BusinessRole)null);
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
			case Iso20022Package.PARTICIPANT__MAX_OCCURS:
				return MAX_OCCURS_EDEFAULT == null ? maxOccurs != null : !MAX_OCCURS_EDEFAULT.equals(maxOccurs);
			case Iso20022Package.PARTICIPANT__MIN_OCCURS:
				return MIN_OCCURS_EDEFAULT == null ? minOccurs != null : !MIN_OCCURS_EDEFAULT.equals(minOccurs);
			case Iso20022Package.PARTICIPANT__BUSINESS_TRANSACTION:
				return getBusinessTransaction() != null;
			case Iso20022Package.PARTICIPANT__RECEIVES:
				return receives != null && !receives.isEmpty();
			case Iso20022Package.PARTICIPANT__SENDS:
				return sends != null && !sends.isEmpty();
			case Iso20022Package.PARTICIPANT__BUSINESS_ROLE_TRACE:
				return businessRoleTrace != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == MultiplicityEntity.class) {
			switch (derivedFeatureID) {
				case Iso20022Package.PARTICIPANT__MAX_OCCURS: return Iso20022Package.MULTIPLICITY_ENTITY__MAX_OCCURS;
				case Iso20022Package.PARTICIPANT__MIN_OCCURS: return Iso20022Package.MULTIPLICITY_ENTITY__MIN_OCCURS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == MultiplicityEntity.class) {
			switch (baseFeatureID) {
				case Iso20022Package.MULTIPLICITY_ENTITY__MAX_OCCURS: return Iso20022Package.PARTICIPANT__MAX_OCCURS;
				case Iso20022Package.MULTIPLICITY_ENTITY__MIN_OCCURS: return Iso20022Package.PARTICIPANT__MIN_OCCURS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (maxOccurs: ");
		result.append(maxOccurs);
		result.append(", minOccurs: ");
		result.append(minOccurs);
		result.append(')');
		return result.toString();
	}

} //ParticipantImpl
