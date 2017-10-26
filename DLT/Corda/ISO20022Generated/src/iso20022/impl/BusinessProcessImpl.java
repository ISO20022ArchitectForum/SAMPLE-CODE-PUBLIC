/**
 */
package iso20022.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import iso20022.BusinessProcess;
import iso20022.BusinessRole;
import iso20022.BusinessTransaction;
import iso20022.Iso20022Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Business Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso20022.impl.BusinessProcessImpl#getExtender <em>Extender</em>}</li>
 *   <li>{@link iso20022.impl.BusinessProcessImpl#getExtended <em>Extended</em>}</li>
 *   <li>{@link iso20022.impl.BusinessProcessImpl#getIncluded <em>Included</em>}</li>
 *   <li>{@link iso20022.impl.BusinessProcessImpl#getIncluder <em>Includer</em>}</li>
 *   <li>{@link iso20022.impl.BusinessProcessImpl#getBusinessRole <em>Business Role</em>}</li>
 *   <li>{@link iso20022.impl.BusinessProcessImpl#getBusinessProcessTrace <em>Business Process Trace</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BusinessProcessImpl extends TopLevelCatalogueEntryImpl implements BusinessProcess {
	/**
	 * The cached value of the '{@link #getExtender() <em>Extender</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtender()
	 * @generated
	 * @ordered
	 */
	protected EList<BusinessProcess> extender;

	/**
	 * The cached value of the '{@link #getExtended() <em>Extended</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtended()
	 * @generated
	 * @ordered
	 */
	protected EList<BusinessProcess> extended;

	/**
	 * The cached value of the '{@link #getIncluded() <em>Included</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncluded()
	 * @generated
	 * @ordered
	 */
	protected EList<BusinessProcess> included;

	/**
	 * The cached value of the '{@link #getIncluder() <em>Includer</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncluder()
	 * @generated
	 * @ordered
	 */
	protected EList<BusinessProcess> includer;

	/**
	 * The cached value of the '{@link #getBusinessRole() <em>Business Role</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessRole()
	 * @generated
	 * @ordered
	 */
	protected EList<BusinessRole> businessRole;

	/**
	 * The cached value of the '{@link #getBusinessProcessTrace() <em>Business Process Trace</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessProcessTrace()
	 * @generated
	 * @ordered
	 */
	protected EList<BusinessTransaction> businessProcessTrace;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusinessProcessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Iso20022Package.eINSTANCE.getBusinessProcess();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BusinessProcess> getExtender() {
		if (extender == null) {
			extender = new EObjectWithInverseResolvingEList.ManyInverse<BusinessProcess>(BusinessProcess.class, this, Iso20022Package.BUSINESS_PROCESS__EXTENDER, Iso20022Package.BUSINESS_PROCESS__EXTENDED);
		}
		return extender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BusinessProcess> getExtended() {
		if (extended == null) {
			extended = new EObjectWithInverseResolvingEList.ManyInverse<BusinessProcess>(BusinessProcess.class, this, Iso20022Package.BUSINESS_PROCESS__EXTENDED, Iso20022Package.BUSINESS_PROCESS__EXTENDER);
		}
		return extended;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BusinessProcess> getIncluded() {
		if (included == null) {
			included = new EObjectWithInverseResolvingEList.ManyInverse<BusinessProcess>(BusinessProcess.class, this, Iso20022Package.BUSINESS_PROCESS__INCLUDED, Iso20022Package.BUSINESS_PROCESS__INCLUDER);
		}
		return included;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BusinessProcess> getIncluder() {
		if (includer == null) {
			includer = new EObjectWithInverseResolvingEList.ManyInverse<BusinessProcess>(BusinessProcess.class, this, Iso20022Package.BUSINESS_PROCESS__INCLUDER, Iso20022Package.BUSINESS_PROCESS__INCLUDED);
		}
		return includer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BusinessRole> getBusinessRole() {
		if (businessRole == null) {
			businessRole = new EObjectContainmentWithInverseEList<BusinessRole>(BusinessRole.class, this, Iso20022Package.BUSINESS_PROCESS__BUSINESS_ROLE, Iso20022Package.BUSINESS_ROLE__BUSINESS_PROCESS);
		}
		return businessRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BusinessTransaction> getBusinessProcessTrace() {
		if (businessProcessTrace == null) {
			businessProcessTrace = new EObjectWithInverseResolvingEList<BusinessTransaction>(BusinessTransaction.class, this, Iso20022Package.BUSINESS_PROCESS__BUSINESS_PROCESS_TRACE, Iso20022Package.BUSINESS_TRANSACTION__BUSINESS_PROCESS_TRACE);
		}
		return businessProcessTrace;
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
			case Iso20022Package.BUSINESS_PROCESS__EXTENDER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getExtender()).basicAdd(otherEnd, msgs);
			case Iso20022Package.BUSINESS_PROCESS__EXTENDED:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getExtended()).basicAdd(otherEnd, msgs);
			case Iso20022Package.BUSINESS_PROCESS__INCLUDED:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncluded()).basicAdd(otherEnd, msgs);
			case Iso20022Package.BUSINESS_PROCESS__INCLUDER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncluder()).basicAdd(otherEnd, msgs);
			case Iso20022Package.BUSINESS_PROCESS__BUSINESS_ROLE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBusinessRole()).basicAdd(otherEnd, msgs);
			case Iso20022Package.BUSINESS_PROCESS__BUSINESS_PROCESS_TRACE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBusinessProcessTrace()).basicAdd(otherEnd, msgs);
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
			case Iso20022Package.BUSINESS_PROCESS__EXTENDER:
				return ((InternalEList<?>)getExtender()).basicRemove(otherEnd, msgs);
			case Iso20022Package.BUSINESS_PROCESS__EXTENDED:
				return ((InternalEList<?>)getExtended()).basicRemove(otherEnd, msgs);
			case Iso20022Package.BUSINESS_PROCESS__INCLUDED:
				return ((InternalEList<?>)getIncluded()).basicRemove(otherEnd, msgs);
			case Iso20022Package.BUSINESS_PROCESS__INCLUDER:
				return ((InternalEList<?>)getIncluder()).basicRemove(otherEnd, msgs);
			case Iso20022Package.BUSINESS_PROCESS__BUSINESS_ROLE:
				return ((InternalEList<?>)getBusinessRole()).basicRemove(otherEnd, msgs);
			case Iso20022Package.BUSINESS_PROCESS__BUSINESS_PROCESS_TRACE:
				return ((InternalEList<?>)getBusinessProcessTrace()).basicRemove(otherEnd, msgs);
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
			case Iso20022Package.BUSINESS_PROCESS__EXTENDER:
				return getExtender();
			case Iso20022Package.BUSINESS_PROCESS__EXTENDED:
				return getExtended();
			case Iso20022Package.BUSINESS_PROCESS__INCLUDED:
				return getIncluded();
			case Iso20022Package.BUSINESS_PROCESS__INCLUDER:
				return getIncluder();
			case Iso20022Package.BUSINESS_PROCESS__BUSINESS_ROLE:
				return getBusinessRole();
			case Iso20022Package.BUSINESS_PROCESS__BUSINESS_PROCESS_TRACE:
				return getBusinessProcessTrace();
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
			case Iso20022Package.BUSINESS_PROCESS__EXTENDER:
				getExtender().clear();
				getExtender().addAll((Collection<? extends BusinessProcess>)newValue);
				return;
			case Iso20022Package.BUSINESS_PROCESS__EXTENDED:
				getExtended().clear();
				getExtended().addAll((Collection<? extends BusinessProcess>)newValue);
				return;
			case Iso20022Package.BUSINESS_PROCESS__INCLUDED:
				getIncluded().clear();
				getIncluded().addAll((Collection<? extends BusinessProcess>)newValue);
				return;
			case Iso20022Package.BUSINESS_PROCESS__INCLUDER:
				getIncluder().clear();
				getIncluder().addAll((Collection<? extends BusinessProcess>)newValue);
				return;
			case Iso20022Package.BUSINESS_PROCESS__BUSINESS_ROLE:
				getBusinessRole().clear();
				getBusinessRole().addAll((Collection<? extends BusinessRole>)newValue);
				return;
			case Iso20022Package.BUSINESS_PROCESS__BUSINESS_PROCESS_TRACE:
				getBusinessProcessTrace().clear();
				getBusinessProcessTrace().addAll((Collection<? extends BusinessTransaction>)newValue);
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
			case Iso20022Package.BUSINESS_PROCESS__EXTENDER:
				getExtender().clear();
				return;
			case Iso20022Package.BUSINESS_PROCESS__EXTENDED:
				getExtended().clear();
				return;
			case Iso20022Package.BUSINESS_PROCESS__INCLUDED:
				getIncluded().clear();
				return;
			case Iso20022Package.BUSINESS_PROCESS__INCLUDER:
				getIncluder().clear();
				return;
			case Iso20022Package.BUSINESS_PROCESS__BUSINESS_ROLE:
				getBusinessRole().clear();
				return;
			case Iso20022Package.BUSINESS_PROCESS__BUSINESS_PROCESS_TRACE:
				getBusinessProcessTrace().clear();
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
			case Iso20022Package.BUSINESS_PROCESS__EXTENDER:
				return extender != null && !extender.isEmpty();
			case Iso20022Package.BUSINESS_PROCESS__EXTENDED:
				return extended != null && !extended.isEmpty();
			case Iso20022Package.BUSINESS_PROCESS__INCLUDED:
				return included != null && !included.isEmpty();
			case Iso20022Package.BUSINESS_PROCESS__INCLUDER:
				return includer != null && !includer.isEmpty();
			case Iso20022Package.BUSINESS_PROCESS__BUSINESS_ROLE:
				return businessRole != null && !businessRole.isEmpty();
			case Iso20022Package.BUSINESS_PROCESS__BUSINESS_PROCESS_TRACE:
				return businessProcessTrace != null && !businessProcessTrace.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BusinessProcessImpl
