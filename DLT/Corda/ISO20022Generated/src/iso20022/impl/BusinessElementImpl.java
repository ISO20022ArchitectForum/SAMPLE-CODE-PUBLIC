/**
 */
package iso20022.impl;

import java.lang.Boolean;
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

import iso20022.BusinessComponent;
import iso20022.BusinessElement;
import iso20022.BusinessElementType;
import iso20022.Iso20022Package;
import iso20022.MessageElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Business Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso20022.impl.BusinessElementImpl#isIsDerived <em>Is Derived</em>}</li>
 *   <li>{@link iso20022.impl.BusinessElementImpl#getDerivation <em>Derivation</em>}</li>
 *   <li>{@link iso20022.impl.BusinessElementImpl#getBusinessElementType <em>Business Element Type</em>}</li>
 *   <li>{@link iso20022.impl.BusinessElementImpl#getElementContext <em>Element Context</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class BusinessElementImpl extends ConstructImpl implements BusinessElement {
	/**
	 * The default value of the '{@link #isIsDerived() <em>Is Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDerived()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DERIVED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsDerived() <em>Is Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDerived()
	 * @generated
	 * @ordered
	 */
	protected boolean isDerived = IS_DERIVED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDerivation() <em>Derivation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivation()
	 * @generated
	 * @ordered
	 */
	protected EList<MessageElement> derivation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusinessElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Iso20022Package.eINSTANCE.getBusinessElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsDerived() {
		return isDerived;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDerived(boolean newIsDerived) {
		boolean oldIsDerived = isDerived;
		isDerived = newIsDerived;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Iso20022Package.BUSINESS_ELEMENT__IS_DERIVED, oldIsDerived, isDerived));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MessageElement> getDerivation() {
		if (derivation == null) {
			derivation = new EObjectWithInverseResolvingEList<MessageElement>(MessageElement.class, this, Iso20022Package.BUSINESS_ELEMENT__DERIVATION, Iso20022Package.MESSAGE_ELEMENT__BUSINESS_ELEMENT_TRACE);
		}
		return derivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessElementType getBusinessElementType() {
		BusinessElementType businessElementType = basicGetBusinessElementType();
		return businessElementType != null && businessElementType.eIsProxy() ? (BusinessElementType)eResolveProxy((InternalEObject)businessElementType) : businessElementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public abstract BusinessElementType basicGetBusinessElementType();
		// TODO: implement this method to return the 'Business Element Type' reference >>> DONE

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessComponent getElementContext() {
		if (eContainerFeatureID() != Iso20022Package.BUSINESS_ELEMENT__ELEMENT_CONTEXT) return null;
		return (BusinessComponent)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElementContext(BusinessComponent newElementContext, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newElementContext, Iso20022Package.BUSINESS_ELEMENT__ELEMENT_CONTEXT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementContext(BusinessComponent newElementContext) {
		if (newElementContext != eInternalContainer() || (eContainerFeatureID() != Iso20022Package.BUSINESS_ELEMENT__ELEMENT_CONTEXT && newElementContext != null)) {
			if (EcoreUtil.isAncestor(this, newElementContext))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newElementContext != null)
				msgs = ((InternalEObject)newElementContext).eInverseAdd(this, Iso20022Package.BUSINESS_COMPONENT__ELEMENT, BusinessComponent.class, msgs);
			msgs = basicSetElementContext(newElementContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Iso20022Package.BUSINESS_ELEMENT__ELEMENT_CONTEXT, newElementContext, newElementContext));
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
			case Iso20022Package.BUSINESS_ELEMENT__DERIVATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDerivation()).basicAdd(otherEnd, msgs);
			case Iso20022Package.BUSINESS_ELEMENT__ELEMENT_CONTEXT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetElementContext((BusinessComponent)otherEnd, msgs);
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
			case Iso20022Package.BUSINESS_ELEMENT__DERIVATION:
				return ((InternalEList<?>)getDerivation()).basicRemove(otherEnd, msgs);
			case Iso20022Package.BUSINESS_ELEMENT__ELEMENT_CONTEXT:
				return basicSetElementContext(null, msgs);
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
			case Iso20022Package.BUSINESS_ELEMENT__ELEMENT_CONTEXT:
				return eInternalContainer().eInverseRemove(this, Iso20022Package.BUSINESS_COMPONENT__ELEMENT, BusinessComponent.class, msgs);
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
			case Iso20022Package.BUSINESS_ELEMENT__IS_DERIVED:
				return isIsDerived();
			case Iso20022Package.BUSINESS_ELEMENT__DERIVATION:
				return getDerivation();
			case Iso20022Package.BUSINESS_ELEMENT__BUSINESS_ELEMENT_TYPE:
				if (resolve) return getBusinessElementType();
				return basicGetBusinessElementType();
			case Iso20022Package.BUSINESS_ELEMENT__ELEMENT_CONTEXT:
				return getElementContext();
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
			case Iso20022Package.BUSINESS_ELEMENT__IS_DERIVED:
				setIsDerived((Boolean)newValue);
				return;
			case Iso20022Package.BUSINESS_ELEMENT__DERIVATION:
				getDerivation().clear();
				getDerivation().addAll((Collection<? extends MessageElement>)newValue);
				return;
			case Iso20022Package.BUSINESS_ELEMENT__ELEMENT_CONTEXT:
				setElementContext((BusinessComponent)newValue);
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
			case Iso20022Package.BUSINESS_ELEMENT__IS_DERIVED:
				setIsDerived(IS_DERIVED_EDEFAULT);
				return;
			case Iso20022Package.BUSINESS_ELEMENT__DERIVATION:
				getDerivation().clear();
				return;
			case Iso20022Package.BUSINESS_ELEMENT__ELEMENT_CONTEXT:
				setElementContext((BusinessComponent)null);
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
			case Iso20022Package.BUSINESS_ELEMENT__IS_DERIVED:
				return isDerived != IS_DERIVED_EDEFAULT;
			case Iso20022Package.BUSINESS_ELEMENT__DERIVATION:
				return derivation != null && !derivation.isEmpty();
			case Iso20022Package.BUSINESS_ELEMENT__BUSINESS_ELEMENT_TYPE:
				return basicGetBusinessElementType() != null;
			case Iso20022Package.BUSINESS_ELEMENT__ELEMENT_CONTEXT:
				return getElementContext() != null;
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
		result.append(" (isDerived: ");
		result.append(isDerived);
		result.append(')');
		return result.toString();
	}

} //BusinessElementImpl
