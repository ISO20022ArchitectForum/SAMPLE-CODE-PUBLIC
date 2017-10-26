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
import org.eclipse.emf.ecore.util.InternalEList;

import iso20022.BusinessTransaction;
import iso20022.Iso20022Package;
import iso20022.MessageChoreography;
import iso20022.MessageDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message Choreography</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso20022.impl.MessageChoreographyImpl#getBusinessTransactionTrace <em>Business Transaction Trace</em>}</li>
 *   <li>{@link iso20022.impl.MessageChoreographyImpl#getMessageDefinition <em>Message Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MessageChoreographyImpl extends TopLevelCatalogueEntryImpl implements MessageChoreography {
	/**
	 * The cached value of the '{@link #getBusinessTransactionTrace() <em>Business Transaction Trace</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessTransactionTrace()
	 * @generated
	 * @ordered
	 */
	protected BusinessTransaction businessTransactionTrace;

	/**
	 * The cached value of the '{@link #getMessageDefinition() <em>Message Definition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageDefinition()
	 * @generated
	 * @ordered
	 */
	protected EList<MessageDefinition> messageDefinition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageChoreographyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Iso20022Package.eINSTANCE.getMessageChoreography();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessTransaction getBusinessTransactionTrace() {
		if (businessTransactionTrace != null && businessTransactionTrace.eIsProxy()) {
			InternalEObject oldBusinessTransactionTrace = (InternalEObject)businessTransactionTrace;
			businessTransactionTrace = (BusinessTransaction)eResolveProxy(oldBusinessTransactionTrace);
			if (businessTransactionTrace != oldBusinessTransactionTrace) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Iso20022Package.MESSAGE_CHOREOGRAPHY__BUSINESS_TRANSACTION_TRACE, oldBusinessTransactionTrace, businessTransactionTrace));
			}
		}
		return businessTransactionTrace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessTransaction basicGetBusinessTransactionTrace() {
		return businessTransactionTrace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBusinessTransactionTrace(BusinessTransaction newBusinessTransactionTrace, NotificationChain msgs) {
		BusinessTransaction oldBusinessTransactionTrace = businessTransactionTrace;
		businessTransactionTrace = newBusinessTransactionTrace;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Iso20022Package.MESSAGE_CHOREOGRAPHY__BUSINESS_TRANSACTION_TRACE, oldBusinessTransactionTrace, newBusinessTransactionTrace);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBusinessTransactionTrace(BusinessTransaction newBusinessTransactionTrace) {
		if (newBusinessTransactionTrace != businessTransactionTrace) {
			NotificationChain msgs = null;
			if (businessTransactionTrace != null)
				msgs = ((InternalEObject)businessTransactionTrace).eInverseRemove(this, Iso20022Package.BUSINESS_TRANSACTION__TRACE, BusinessTransaction.class, msgs);
			if (newBusinessTransactionTrace != null)
				msgs = ((InternalEObject)newBusinessTransactionTrace).eInverseAdd(this, Iso20022Package.BUSINESS_TRANSACTION__TRACE, BusinessTransaction.class, msgs);
			msgs = basicSetBusinessTransactionTrace(newBusinessTransactionTrace, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Iso20022Package.MESSAGE_CHOREOGRAPHY__BUSINESS_TRANSACTION_TRACE, newBusinessTransactionTrace, newBusinessTransactionTrace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MessageDefinition> getMessageDefinition() {
		if (messageDefinition == null) {
			messageDefinition = new EObjectWithInverseResolvingEList.ManyInverse<MessageDefinition>(MessageDefinition.class, this, Iso20022Package.MESSAGE_CHOREOGRAPHY__MESSAGE_DEFINITION, Iso20022Package.MESSAGE_DEFINITION__CHOREOGRAPHY);
		}
		return messageDefinition;
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
			case Iso20022Package.MESSAGE_CHOREOGRAPHY__BUSINESS_TRANSACTION_TRACE:
				if (businessTransactionTrace != null)
					msgs = ((InternalEObject)businessTransactionTrace).eInverseRemove(this, Iso20022Package.BUSINESS_TRANSACTION__TRACE, BusinessTransaction.class, msgs);
				return basicSetBusinessTransactionTrace((BusinessTransaction)otherEnd, msgs);
			case Iso20022Package.MESSAGE_CHOREOGRAPHY__MESSAGE_DEFINITION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMessageDefinition()).basicAdd(otherEnd, msgs);
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
			case Iso20022Package.MESSAGE_CHOREOGRAPHY__BUSINESS_TRANSACTION_TRACE:
				return basicSetBusinessTransactionTrace(null, msgs);
			case Iso20022Package.MESSAGE_CHOREOGRAPHY__MESSAGE_DEFINITION:
				return ((InternalEList<?>)getMessageDefinition()).basicRemove(otherEnd, msgs);
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
			case Iso20022Package.MESSAGE_CHOREOGRAPHY__BUSINESS_TRANSACTION_TRACE:
				if (resolve) return getBusinessTransactionTrace();
				return basicGetBusinessTransactionTrace();
			case Iso20022Package.MESSAGE_CHOREOGRAPHY__MESSAGE_DEFINITION:
				return getMessageDefinition();
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
			case Iso20022Package.MESSAGE_CHOREOGRAPHY__BUSINESS_TRANSACTION_TRACE:
				setBusinessTransactionTrace((BusinessTransaction)newValue);
				return;
			case Iso20022Package.MESSAGE_CHOREOGRAPHY__MESSAGE_DEFINITION:
				getMessageDefinition().clear();
				getMessageDefinition().addAll((Collection<? extends MessageDefinition>)newValue);
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
			case Iso20022Package.MESSAGE_CHOREOGRAPHY__BUSINESS_TRANSACTION_TRACE:
				setBusinessTransactionTrace((BusinessTransaction)null);
				return;
			case Iso20022Package.MESSAGE_CHOREOGRAPHY__MESSAGE_DEFINITION:
				getMessageDefinition().clear();
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
			case Iso20022Package.MESSAGE_CHOREOGRAPHY__BUSINESS_TRANSACTION_TRACE:
				return businessTransactionTrace != null;
			case Iso20022Package.MESSAGE_CHOREOGRAPHY__MESSAGE_DEFINITION:
				return messageDefinition != null && !messageDefinition.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MessageChoreographyImpl
