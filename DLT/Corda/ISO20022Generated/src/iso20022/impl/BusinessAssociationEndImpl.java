/**
 */
package iso20022.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import iso20022.Aggregation;
import iso20022.BusinessAssociationEnd;
import iso20022.BusinessComponent;
import iso20022.BusinessElementType;
import iso20022.Iso20022Package;
import iso20022.RepositoryType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Business Association End</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso20022.impl.BusinessAssociationEndImpl#getOpposite <em>Opposite</em>}</li>
 *   <li>{@link iso20022.impl.BusinessAssociationEndImpl#getAggregation <em>Aggregation</em>}</li>
 *   <li>{@link iso20022.impl.BusinessAssociationEndImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BusinessAssociationEndImpl extends BusinessElementImpl implements BusinessAssociationEnd {
	/**
	 * The cached value of the '{@link #getOpposite() <em>Opposite</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpposite()
	 * @generated
	 * @ordered
	 */
	protected BusinessAssociationEnd opposite;

	/**
	 * The default value of the '{@link #getAggregation() <em>Aggregation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregation()
	 * @generated
	 * @ordered
	 */
	protected static final Aggregation AGGREGATION_EDEFAULT = Aggregation.NONE;

	/**
	 * The cached value of the '{@link #getAggregation() <em>Aggregation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregation()
	 * @generated
	 * @ordered
	 */
	protected Aggregation aggregation = AGGREGATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected BusinessComponent type;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusinessAssociationEndImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Iso20022Package.eINSTANCE.getBusinessAssociationEnd();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessAssociationEnd getOpposite() {
		if (opposite != null && opposite.eIsProxy()) {
			InternalEObject oldOpposite = (InternalEObject)opposite;
			opposite = (BusinessAssociationEnd)eResolveProxy(oldOpposite);
			if (opposite != oldOpposite) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Iso20022Package.BUSINESS_ASSOCIATION_END__OPPOSITE, oldOpposite, opposite));
			}
		}
		return opposite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessAssociationEnd basicGetOpposite() {
		return opposite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpposite(BusinessAssociationEnd newOpposite) {
		BusinessAssociationEnd oldOpposite = opposite;
		opposite = newOpposite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Iso20022Package.BUSINESS_ASSOCIATION_END__OPPOSITE, oldOpposite, opposite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aggregation getAggregation() {
		return aggregation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAggregation(Aggregation newAggregation) {
		Aggregation oldAggregation = aggregation;
		aggregation = newAggregation == null ? AGGREGATION_EDEFAULT : newAggregation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Iso20022Package.BUSINESS_ASSOCIATION_END__AGGREGATION, oldAggregation, aggregation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessComponent getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (BusinessComponent)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Iso20022Package.BUSINESS_ASSOCIATION_END__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessComponent basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(BusinessComponent newType, NotificationChain msgs) {
		BusinessComponent oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Iso20022Package.BUSINESS_ASSOCIATION_END__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(BusinessComponent newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, Iso20022Package.BUSINESS_COMPONENT__ASSOCIATION_DOMAIN, BusinessComponent.class, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, Iso20022Package.BUSINESS_COMPONENT__ASSOCIATION_DOMAIN, BusinessComponent.class, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Iso20022Package.BUSINESS_ASSOCIATION_END__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean AtMostOneAggregatedEnd(Map context, DiagnosticChain diagnostics) {
		// TODO: implement this method >>> DONE
		// Ensure that you remove @generated or mark it @generated NOT
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean ContextConsistentWithType(Map context, DiagnosticChain diagnostics) {
		// TODO: implement this method >>> DONE
		// Ensure that you remove @generated or mark it @generated NOT
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Iso20022Package.BUSINESS_ASSOCIATION_END__TYPE:
				if (type != null)
					msgs = ((InternalEObject)type).eInverseRemove(this, Iso20022Package.BUSINESS_COMPONENT__ASSOCIATION_DOMAIN, BusinessComponent.class, msgs);
				return basicSetType((BusinessComponent)otherEnd, msgs);
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
			case Iso20022Package.BUSINESS_ASSOCIATION_END__TYPE:
				return basicSetType(null, msgs);
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
			case Iso20022Package.BUSINESS_ASSOCIATION_END__OPPOSITE:
				if (resolve) return getOpposite();
				return basicGetOpposite();
			case Iso20022Package.BUSINESS_ASSOCIATION_END__AGGREGATION:
				return getAggregation();
			case Iso20022Package.BUSINESS_ASSOCIATION_END__TYPE:
				if (resolve) return getType();
				return basicGetType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Iso20022Package.BUSINESS_ASSOCIATION_END__OPPOSITE:
				setOpposite((BusinessAssociationEnd)newValue);
				return;
			case Iso20022Package.BUSINESS_ASSOCIATION_END__AGGREGATION:
				setAggregation((Aggregation)newValue);
				return;
			case Iso20022Package.BUSINESS_ASSOCIATION_END__TYPE:
				setType((BusinessComponent)newValue);
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
			case Iso20022Package.BUSINESS_ASSOCIATION_END__OPPOSITE:
				setOpposite((BusinessAssociationEnd)null);
				return;
			case Iso20022Package.BUSINESS_ASSOCIATION_END__AGGREGATION:
				setAggregation(AGGREGATION_EDEFAULT);
				return;
			case Iso20022Package.BUSINESS_ASSOCIATION_END__TYPE:
				setType((BusinessComponent)null);
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
			case Iso20022Package.BUSINESS_ASSOCIATION_END__OPPOSITE:
				return opposite != null;
			case Iso20022Package.BUSINESS_ASSOCIATION_END__AGGREGATION:
				return aggregation != AGGREGATION_EDEFAULT;
			case Iso20022Package.BUSINESS_ASSOCIATION_END__TYPE:
				return type != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case Iso20022Package.BUSINESS_ASSOCIATION_END___AT_MOST_ONE_AGGREGATED_END__MAP_DIAGNOSTICCHAIN:
				return AtMostOneAggregatedEnd((Map)arguments.get(0), (DiagnosticChain)arguments.get(1));
			case Iso20022Package.BUSINESS_ASSOCIATION_END___CONTEXT_CONSISTENT_WITH_TYPE__MAP_DIAGNOSTICCHAIN:
				return ContextConsistentWithType((Map)arguments.get(0), (DiagnosticChain)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (aggregation: ");
		result.append(aggregation);
		result.append(')');
		return result.toString();
	}

	@Override
	public BusinessElementType basicGetBusinessElementType() {

		return getType();
	}
	
	@Override
	public RepositoryType basicGetMemberType() {
		return getType();
	}

} //BusinessAssociationEndImpl
