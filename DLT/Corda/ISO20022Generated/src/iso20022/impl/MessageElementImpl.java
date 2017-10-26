/**
 */
package iso20022.impl;

import java.lang.Boolean;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import iso20022.BusinessComponent;
import iso20022.BusinessElement;
import iso20022.Iso20022Package;
import iso20022.MessageElement;
import iso20022.MessageElementContainer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso20022.impl.MessageElementImpl#isIsTechnical <em>Is Technical</em>}</li>
 *   <li>{@link iso20022.impl.MessageElementImpl#getBusinessComponentTrace <em>Business Component Trace</em>}</li>
 *   <li>{@link iso20022.impl.MessageElementImpl#getBusinessElementTrace <em>Business Element Trace</em>}</li>
 *   <li>{@link iso20022.impl.MessageElementImpl#getComponentContext <em>Component Context</em>}</li>
 *   <li>{@link iso20022.impl.MessageElementImpl#isIsDerived <em>Is Derived</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class MessageElementImpl extends MessageConstructImpl implements MessageElement {
	/**
	 * The default value of the '{@link #isIsTechnical() <em>Is Technical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsTechnical()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_TECHNICAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #getBusinessComponentTrace() <em>Business Component Trace</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessComponentTrace()
	 * @generated
	 * @ordered
	 */
	protected BusinessComponent businessComponentTrace;

	/**
	 * The cached value of the '{@link #getBusinessElementTrace() <em>Business Element Trace</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessElementTrace()
	 * @generated
	 * @ordered
	 */
	protected BusinessElement businessElementTrace;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Iso20022Package.eINSTANCE.getMessageElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isIsTechnical() {
		// TODO: implement this method to return the 'Is Technical' attribute >>> DONE
		// Ensure that you remove @generated or mark it @generated NOT
		return getBusinessComponentTrace() == null && getBusinessElementTrace() == null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessComponent getBusinessComponentTrace() {
		if (businessComponentTrace != null && businessComponentTrace.eIsProxy()) {
			InternalEObject oldBusinessComponentTrace = (InternalEObject)businessComponentTrace;
			businessComponentTrace = (BusinessComponent)eResolveProxy(oldBusinessComponentTrace);
			if (businessComponentTrace != oldBusinessComponentTrace) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Iso20022Package.MESSAGE_ELEMENT__BUSINESS_COMPONENT_TRACE, oldBusinessComponentTrace, businessComponentTrace));
			}
		}
		return businessComponentTrace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessComponent basicGetBusinessComponentTrace() {
		return businessComponentTrace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBusinessComponentTrace(BusinessComponent newBusinessComponentTrace, NotificationChain msgs) {
		BusinessComponent oldBusinessComponentTrace = businessComponentTrace;
		businessComponentTrace = newBusinessComponentTrace;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Iso20022Package.MESSAGE_ELEMENT__BUSINESS_COMPONENT_TRACE, oldBusinessComponentTrace, newBusinessComponentTrace);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBusinessComponentTrace(BusinessComponent newBusinessComponentTrace) {
		if (newBusinessComponentTrace != businessComponentTrace) {
			NotificationChain msgs = null;
			if (businessComponentTrace != null)
				msgs = ((InternalEObject)businessComponentTrace).eInverseRemove(this, Iso20022Package.BUSINESS_COMPONENT__DERIVATION_ELEMENT, BusinessComponent.class, msgs);
			if (newBusinessComponentTrace != null)
				msgs = ((InternalEObject)newBusinessComponentTrace).eInverseAdd(this, Iso20022Package.BUSINESS_COMPONENT__DERIVATION_ELEMENT, BusinessComponent.class, msgs);
			msgs = basicSetBusinessComponentTrace(newBusinessComponentTrace, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Iso20022Package.MESSAGE_ELEMENT__BUSINESS_COMPONENT_TRACE, newBusinessComponentTrace, newBusinessComponentTrace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessElement getBusinessElementTrace() {
		if (businessElementTrace != null && businessElementTrace.eIsProxy()) {
			InternalEObject oldBusinessElementTrace = (InternalEObject)businessElementTrace;
			businessElementTrace = (BusinessElement)eResolveProxy(oldBusinessElementTrace);
			if (businessElementTrace != oldBusinessElementTrace) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Iso20022Package.MESSAGE_ELEMENT__BUSINESS_ELEMENT_TRACE, oldBusinessElementTrace, businessElementTrace));
			}
		}
		return businessElementTrace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessElement basicGetBusinessElementTrace() {
		return businessElementTrace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBusinessElementTrace(BusinessElement newBusinessElementTrace, NotificationChain msgs) {
		BusinessElement oldBusinessElementTrace = businessElementTrace;
		businessElementTrace = newBusinessElementTrace;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Iso20022Package.MESSAGE_ELEMENT__BUSINESS_ELEMENT_TRACE, oldBusinessElementTrace, newBusinessElementTrace);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBusinessElementTrace(BusinessElement newBusinessElementTrace) {
		if (newBusinessElementTrace != businessElementTrace) {
			NotificationChain msgs = null;
			if (businessElementTrace != null)
				msgs = ((InternalEObject)businessElementTrace).eInverseRemove(this, Iso20022Package.BUSINESS_ELEMENT__DERIVATION, BusinessElement.class, msgs);
			if (newBusinessElementTrace != null)
				msgs = ((InternalEObject)newBusinessElementTrace).eInverseAdd(this, Iso20022Package.BUSINESS_ELEMENT__DERIVATION, BusinessElement.class, msgs);
			msgs = basicSetBusinessElementTrace(newBusinessElementTrace, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Iso20022Package.MESSAGE_ELEMENT__BUSINESS_ELEMENT_TRACE, newBusinessElementTrace, newBusinessElementTrace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageElementContainer getComponentContext() {
		if (eContainerFeatureID() != Iso20022Package.MESSAGE_ELEMENT__COMPONENT_CONTEXT) return null;
		return (MessageElementContainer)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponentContext(MessageElementContainer newComponentContext, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newComponentContext, Iso20022Package.MESSAGE_ELEMENT__COMPONENT_CONTEXT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentContext(MessageElementContainer newComponentContext) {
		if (newComponentContext != eInternalContainer() || (eContainerFeatureID() != Iso20022Package.MESSAGE_ELEMENT__COMPONENT_CONTEXT && newComponentContext != null)) {
			if (EcoreUtil.isAncestor(this, newComponentContext))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newComponentContext != null)
				msgs = ((InternalEObject)newComponentContext).eInverseAdd(this, Iso20022Package.MESSAGE_ELEMENT_CONTAINER__MESSAGE_ELEMENT, MessageElementContainer.class, msgs);
			msgs = basicSetComponentContext(newComponentContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Iso20022Package.MESSAGE_ELEMENT__COMPONENT_CONTEXT, newComponentContext, newComponentContext));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Iso20022Package.MESSAGE_ELEMENT__IS_DERIVED, oldIsDerived, isDerived));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean NoMoreThanOneTrace(Map context, DiagnosticChain diagnostics) {
		// TODO: implement this method >>> DONE
		// Ensure that you remove @generated or mark it @generated NOT
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean CardinalityAlignment(Map context, DiagnosticChain diagnostics) {
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
			case Iso20022Package.MESSAGE_ELEMENT__BUSINESS_COMPONENT_TRACE:
				if (businessComponentTrace != null)
					msgs = ((InternalEObject)businessComponentTrace).eInverseRemove(this, Iso20022Package.BUSINESS_COMPONENT__DERIVATION_ELEMENT, BusinessComponent.class, msgs);
				return basicSetBusinessComponentTrace((BusinessComponent)otherEnd, msgs);
			case Iso20022Package.MESSAGE_ELEMENT__BUSINESS_ELEMENT_TRACE:
				if (businessElementTrace != null)
					msgs = ((InternalEObject)businessElementTrace).eInverseRemove(this, Iso20022Package.BUSINESS_ELEMENT__DERIVATION, BusinessElement.class, msgs);
				return basicSetBusinessElementTrace((BusinessElement)otherEnd, msgs);
			case Iso20022Package.MESSAGE_ELEMENT__COMPONENT_CONTEXT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetComponentContext((MessageElementContainer)otherEnd, msgs);
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
			case Iso20022Package.MESSAGE_ELEMENT__BUSINESS_COMPONENT_TRACE:
				return basicSetBusinessComponentTrace(null, msgs);
			case Iso20022Package.MESSAGE_ELEMENT__BUSINESS_ELEMENT_TRACE:
				return basicSetBusinessElementTrace(null, msgs);
			case Iso20022Package.MESSAGE_ELEMENT__COMPONENT_CONTEXT:
				return basicSetComponentContext(null, msgs);
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
			case Iso20022Package.MESSAGE_ELEMENT__COMPONENT_CONTEXT:
				return eInternalContainer().eInverseRemove(this, Iso20022Package.MESSAGE_ELEMENT_CONTAINER__MESSAGE_ELEMENT, MessageElementContainer.class, msgs);
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
			case Iso20022Package.MESSAGE_ELEMENT__IS_TECHNICAL:
				return isIsTechnical();
			case Iso20022Package.MESSAGE_ELEMENT__BUSINESS_COMPONENT_TRACE:
				if (resolve) return getBusinessComponentTrace();
				return basicGetBusinessComponentTrace();
			case Iso20022Package.MESSAGE_ELEMENT__BUSINESS_ELEMENT_TRACE:
				if (resolve) return getBusinessElementTrace();
				return basicGetBusinessElementTrace();
			case Iso20022Package.MESSAGE_ELEMENT__COMPONENT_CONTEXT:
				return getComponentContext();
			case Iso20022Package.MESSAGE_ELEMENT__IS_DERIVED:
				return isIsDerived();
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
			case Iso20022Package.MESSAGE_ELEMENT__BUSINESS_COMPONENT_TRACE:
				setBusinessComponentTrace((BusinessComponent)newValue);
				return;
			case Iso20022Package.MESSAGE_ELEMENT__BUSINESS_ELEMENT_TRACE:
				setBusinessElementTrace((BusinessElement)newValue);
				return;
			case Iso20022Package.MESSAGE_ELEMENT__COMPONENT_CONTEXT:
				setComponentContext((MessageElementContainer)newValue);
				return;
			case Iso20022Package.MESSAGE_ELEMENT__IS_DERIVED:
				setIsDerived((Boolean)newValue);
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
			case Iso20022Package.MESSAGE_ELEMENT__BUSINESS_COMPONENT_TRACE:
				setBusinessComponentTrace((BusinessComponent)null);
				return;
			case Iso20022Package.MESSAGE_ELEMENT__BUSINESS_ELEMENT_TRACE:
				setBusinessElementTrace((BusinessElement)null);
				return;
			case Iso20022Package.MESSAGE_ELEMENT__COMPONENT_CONTEXT:
				setComponentContext((MessageElementContainer)null);
				return;
			case Iso20022Package.MESSAGE_ELEMENT__IS_DERIVED:
				setIsDerived(IS_DERIVED_EDEFAULT);
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
			case Iso20022Package.MESSAGE_ELEMENT__IS_TECHNICAL:
				return isIsTechnical() != IS_TECHNICAL_EDEFAULT;
			case Iso20022Package.MESSAGE_ELEMENT__BUSINESS_COMPONENT_TRACE:
				return businessComponentTrace != null;
			case Iso20022Package.MESSAGE_ELEMENT__BUSINESS_ELEMENT_TRACE:
				return businessElementTrace != null;
			case Iso20022Package.MESSAGE_ELEMENT__COMPONENT_CONTEXT:
				return getComponentContext() != null;
			case Iso20022Package.MESSAGE_ELEMENT__IS_DERIVED:
				return isDerived != IS_DERIVED_EDEFAULT;
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
			case Iso20022Package.MESSAGE_ELEMENT___NO_MORE_THAN_ONE_TRACE__MAP_DIAGNOSTICCHAIN:
				return NoMoreThanOneTrace((Map)arguments.get(0), (DiagnosticChain)arguments.get(1));
			case Iso20022Package.MESSAGE_ELEMENT___CARDINALITY_ALIGNMENT__MAP_DIAGNOSTICCHAIN:
				return CardinalityAlignment((Map)arguments.get(0), (DiagnosticChain)arguments.get(1));
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
		result.append(" (isDerived: ");
		result.append(isDerived);
		result.append(')');
		return result.toString();
	}

} //MessageElementImpl
