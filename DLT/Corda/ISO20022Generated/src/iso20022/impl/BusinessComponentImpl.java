/**
 */
package iso20022.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import iso20022.BusinessAssociationEnd;
import iso20022.BusinessComponent;
import iso20022.BusinessElement;
import iso20022.Iso20022Package;
import iso20022.MessageComponentType;
import iso20022.MessageElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Business Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso20022.impl.BusinessComponentImpl#getSubType <em>Sub Type</em>}</li>
 *   <li>{@link iso20022.impl.BusinessComponentImpl#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link iso20022.impl.BusinessComponentImpl#getElement <em>Element</em>}</li>
 *   <li>{@link iso20022.impl.BusinessComponentImpl#getDerivationComponent <em>Derivation Component</em>}</li>
 *   <li>{@link iso20022.impl.BusinessComponentImpl#getAssociationDomain <em>Association Domain</em>}</li>
 *   <li>{@link iso20022.impl.BusinessComponentImpl#getDerivationElement <em>Derivation Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BusinessComponentImpl extends TopLevelDictionaryEntryImpl implements BusinessComponent {
	/**
	 * The cached value of the '{@link #getSubType() <em>Sub Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubType()
	 * @generated
	 * @ordered
	 */
	protected EList<BusinessComponent> subType;

	/**
	 * The cached value of the '{@link #getSuperType() <em>Super Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperType()
	 * @generated
	 * @ordered
	 */
	protected BusinessComponent superType;

	/**
	 * The cached value of the '{@link #getElement() <em>Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement()
	 * @generated
	 * @ordered
	 */
	protected EList<BusinessElement> element;

	/**
	 * The cached value of the '{@link #getDerivationComponent() <em>Derivation Component</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivationComponent()
	 * @generated
	 * @ordered
	 */
	protected EList<MessageComponentType> derivationComponent;

	/**
	 * The cached value of the '{@link #getAssociationDomain() <em>Association Domain</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociationDomain()
	 * @generated
	 * @ordered
	 */
	protected EList<BusinessAssociationEnd> associationDomain;

	/**
	 * The cached value of the '{@link #getDerivationElement() <em>Derivation Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivationElement()
	 * @generated
	 * @ordered
	 */
	protected EList<MessageElement> derivationElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusinessComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Iso20022Package.eINSTANCE.getBusinessComponent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BusinessComponent> getSubType() {
		if (subType == null) {
			subType = new EObjectWithInverseResolvingEList<BusinessComponent>(BusinessComponent.class, this, Iso20022Package.BUSINESS_COMPONENT__SUB_TYPE, Iso20022Package.BUSINESS_COMPONENT__SUPER_TYPE);
		}
		return subType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessComponent getSuperType() {
		if (superType != null && superType.eIsProxy()) {
			InternalEObject oldSuperType = (InternalEObject)superType;
			superType = (BusinessComponent)eResolveProxy(oldSuperType);
			if (superType != oldSuperType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Iso20022Package.BUSINESS_COMPONENT__SUPER_TYPE, oldSuperType, superType));
			}
		}
		return superType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessComponent basicGetSuperType() {
		return superType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSuperType(BusinessComponent newSuperType, NotificationChain msgs) {
		BusinessComponent oldSuperType = superType;
		superType = newSuperType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Iso20022Package.BUSINESS_COMPONENT__SUPER_TYPE, oldSuperType, newSuperType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuperType(BusinessComponent newSuperType) {
		if (newSuperType != superType) {
			NotificationChain msgs = null;
			if (superType != null)
				msgs = ((InternalEObject)superType).eInverseRemove(this, Iso20022Package.BUSINESS_COMPONENT__SUB_TYPE, BusinessComponent.class, msgs);
			if (newSuperType != null)
				msgs = ((InternalEObject)newSuperType).eInverseAdd(this, Iso20022Package.BUSINESS_COMPONENT__SUB_TYPE, BusinessComponent.class, msgs);
			msgs = basicSetSuperType(newSuperType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Iso20022Package.BUSINESS_COMPONENT__SUPER_TYPE, newSuperType, newSuperType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BusinessElement> getElement() {
		if (element == null) {
			element = new EObjectContainmentWithInverseEList<BusinessElement>(BusinessElement.class, this, Iso20022Package.BUSINESS_COMPONENT__ELEMENT, Iso20022Package.BUSINESS_ELEMENT__ELEMENT_CONTEXT);
		}
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MessageComponentType> getDerivationComponent() {
		if (derivationComponent == null) {
			derivationComponent = new EObjectWithInverseResolvingEList<MessageComponentType>(MessageComponentType.class, this, Iso20022Package.BUSINESS_COMPONENT__DERIVATION_COMPONENT, Iso20022Package.MESSAGE_COMPONENT_TYPE__TRACE);
		}
		return derivationComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BusinessAssociationEnd> getAssociationDomain() {
		if (associationDomain == null) {
			associationDomain = new EObjectWithInverseResolvingEList<BusinessAssociationEnd>(BusinessAssociationEnd.class, this, Iso20022Package.BUSINESS_COMPONENT__ASSOCIATION_DOMAIN, Iso20022Package.BUSINESS_ASSOCIATION_END__TYPE);
		}
		return associationDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MessageElement> getDerivationElement() {
		if (derivationElement == null) {
			derivationElement = new EObjectWithInverseResolvingEList<MessageElement>(MessageElement.class, this, Iso20022Package.BUSINESS_COMPONENT__DERIVATION_ELEMENT, Iso20022Package.MESSAGE_ELEMENT__BUSINESS_COMPONENT_TRACE);
		}
		return derivationElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean BusinessElementsHaveUniqueNames(Map context, DiagnosticChain diagnostics) {
		// TODO: implement this method >>> DONE
		// Ensure that you remove @generated or mark it @generated NOT
		return true;
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
			case Iso20022Package.BUSINESS_COMPONENT__SUB_TYPE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubType()).basicAdd(otherEnd, msgs);
			case Iso20022Package.BUSINESS_COMPONENT__SUPER_TYPE:
				if (superType != null)
					msgs = ((InternalEObject)superType).eInverseRemove(this, Iso20022Package.BUSINESS_COMPONENT__SUB_TYPE, BusinessComponent.class, msgs);
				return basicSetSuperType((BusinessComponent)otherEnd, msgs);
			case Iso20022Package.BUSINESS_COMPONENT__ELEMENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getElement()).basicAdd(otherEnd, msgs);
			case Iso20022Package.BUSINESS_COMPONENT__DERIVATION_COMPONENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDerivationComponent()).basicAdd(otherEnd, msgs);
			case Iso20022Package.BUSINESS_COMPONENT__ASSOCIATION_DOMAIN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAssociationDomain()).basicAdd(otherEnd, msgs);
			case Iso20022Package.BUSINESS_COMPONENT__DERIVATION_ELEMENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDerivationElement()).basicAdd(otherEnd, msgs);
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
			case Iso20022Package.BUSINESS_COMPONENT__SUB_TYPE:
				return ((InternalEList<?>)getSubType()).basicRemove(otherEnd, msgs);
			case Iso20022Package.BUSINESS_COMPONENT__SUPER_TYPE:
				return basicSetSuperType(null, msgs);
			case Iso20022Package.BUSINESS_COMPONENT__ELEMENT:
				return ((InternalEList<?>)getElement()).basicRemove(otherEnd, msgs);
			case Iso20022Package.BUSINESS_COMPONENT__DERIVATION_COMPONENT:
				return ((InternalEList<?>)getDerivationComponent()).basicRemove(otherEnd, msgs);
			case Iso20022Package.BUSINESS_COMPONENT__ASSOCIATION_DOMAIN:
				return ((InternalEList<?>)getAssociationDomain()).basicRemove(otherEnd, msgs);
			case Iso20022Package.BUSINESS_COMPONENT__DERIVATION_ELEMENT:
				return ((InternalEList<?>)getDerivationElement()).basicRemove(otherEnd, msgs);
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
			case Iso20022Package.BUSINESS_COMPONENT__SUB_TYPE:
				return getSubType();
			case Iso20022Package.BUSINESS_COMPONENT__SUPER_TYPE:
				if (resolve) return getSuperType();
				return basicGetSuperType();
			case Iso20022Package.BUSINESS_COMPONENT__ELEMENT:
				return getElement();
			case Iso20022Package.BUSINESS_COMPONENT__DERIVATION_COMPONENT:
				return getDerivationComponent();
			case Iso20022Package.BUSINESS_COMPONENT__ASSOCIATION_DOMAIN:
				return getAssociationDomain();
			case Iso20022Package.BUSINESS_COMPONENT__DERIVATION_ELEMENT:
				return getDerivationElement();
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
			case Iso20022Package.BUSINESS_COMPONENT__SUB_TYPE:
				getSubType().clear();
				getSubType().addAll((Collection<? extends BusinessComponent>)newValue);
				return;
			case Iso20022Package.BUSINESS_COMPONENT__SUPER_TYPE:
				setSuperType((BusinessComponent)newValue);
				return;
			case Iso20022Package.BUSINESS_COMPONENT__ELEMENT:
				getElement().clear();
				getElement().addAll((Collection<? extends BusinessElement>)newValue);
				return;
			case Iso20022Package.BUSINESS_COMPONENT__DERIVATION_COMPONENT:
				getDerivationComponent().clear();
				getDerivationComponent().addAll((Collection<? extends MessageComponentType>)newValue);
				return;
			case Iso20022Package.BUSINESS_COMPONENT__ASSOCIATION_DOMAIN:
				getAssociationDomain().clear();
				getAssociationDomain().addAll((Collection<? extends BusinessAssociationEnd>)newValue);
				return;
			case Iso20022Package.BUSINESS_COMPONENT__DERIVATION_ELEMENT:
				getDerivationElement().clear();
				getDerivationElement().addAll((Collection<? extends MessageElement>)newValue);
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
			case Iso20022Package.BUSINESS_COMPONENT__SUB_TYPE:
				getSubType().clear();
				return;
			case Iso20022Package.BUSINESS_COMPONENT__SUPER_TYPE:
				setSuperType((BusinessComponent)null);
				return;
			case Iso20022Package.BUSINESS_COMPONENT__ELEMENT:
				getElement().clear();
				return;
			case Iso20022Package.BUSINESS_COMPONENT__DERIVATION_COMPONENT:
				getDerivationComponent().clear();
				return;
			case Iso20022Package.BUSINESS_COMPONENT__ASSOCIATION_DOMAIN:
				getAssociationDomain().clear();
				return;
			case Iso20022Package.BUSINESS_COMPONENT__DERIVATION_ELEMENT:
				getDerivationElement().clear();
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
			case Iso20022Package.BUSINESS_COMPONENT__SUB_TYPE:
				return subType != null && !subType.isEmpty();
			case Iso20022Package.BUSINESS_COMPONENT__SUPER_TYPE:
				return superType != null;
			case Iso20022Package.BUSINESS_COMPONENT__ELEMENT:
				return element != null && !element.isEmpty();
			case Iso20022Package.BUSINESS_COMPONENT__DERIVATION_COMPONENT:
				return derivationComponent != null && !derivationComponent.isEmpty();
			case Iso20022Package.BUSINESS_COMPONENT__ASSOCIATION_DOMAIN:
				return associationDomain != null && !associationDomain.isEmpty();
			case Iso20022Package.BUSINESS_COMPONENT__DERIVATION_ELEMENT:
				return derivationElement != null && !derivationElement.isEmpty();
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
			case Iso20022Package.BUSINESS_COMPONENT___BUSINESS_ELEMENTS_HAVE_UNIQUE_NAMES__MAP_DIAGNOSTICCHAIN:
				return BusinessElementsHaveUniqueNames((Map)arguments.get(0), (DiagnosticChain)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //BusinessComponentImpl
