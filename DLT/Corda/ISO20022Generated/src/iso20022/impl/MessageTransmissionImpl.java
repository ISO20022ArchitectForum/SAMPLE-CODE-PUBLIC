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
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import iso20022.BusinessTransaction;
import iso20022.Iso20022Package;
import iso20022.MessageDefinition;
import iso20022.MessageTransmission;
import iso20022.Receive;
import iso20022.Send;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message Transmission</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso20022.impl.MessageTransmissionImpl#getBusinessTransaction <em>Business Transaction</em>}</li>
 *   <li>{@link iso20022.impl.MessageTransmissionImpl#getDerivation <em>Derivation</em>}</li>
 *   <li>{@link iso20022.impl.MessageTransmissionImpl#getMessageTypeDescription <em>Message Type Description</em>}</li>
 *   <li>{@link iso20022.impl.MessageTransmissionImpl#getSend <em>Send</em>}</li>
 *   <li>{@link iso20022.impl.MessageTransmissionImpl#getReceive <em>Receive</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MessageTransmissionImpl extends RepositoryConceptImpl implements MessageTransmission {
	/**
	 * The cached value of the '{@link #getDerivation() <em>Derivation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivation()
	 * @generated
	 * @ordered
	 */
	protected EList<MessageDefinition> derivation;

	/**
	 * The default value of the '{@link #getMessageTypeDescription() <em>Message Type Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageTypeDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String MESSAGE_TYPE_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMessageTypeDescription() <em>Message Type Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageTypeDescription()
	 * @generated
	 * @ordered
	 */
	protected String messageTypeDescription = MESSAGE_TYPE_DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSend() <em>Send</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSend()
	 * @generated
	 * @ordered
	 */
	protected Send send;

	/**
	 * The cached value of the '{@link #getReceive() <em>Receive</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceive()
	 * @generated
	 * @ordered
	 */
	protected EList<Receive> receive;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageTransmissionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Iso20022Package.eINSTANCE.getMessageTransmission();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessTransaction getBusinessTransaction() {
		if (eContainerFeatureID() != Iso20022Package.MESSAGE_TRANSMISSION__BUSINESS_TRANSACTION) return null;
		return (BusinessTransaction)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBusinessTransaction(BusinessTransaction newBusinessTransaction, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newBusinessTransaction, Iso20022Package.MESSAGE_TRANSMISSION__BUSINESS_TRANSACTION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBusinessTransaction(BusinessTransaction newBusinessTransaction) {
		if (newBusinessTransaction != eInternalContainer() || (eContainerFeatureID() != Iso20022Package.MESSAGE_TRANSMISSION__BUSINESS_TRANSACTION && newBusinessTransaction != null)) {
			if (EcoreUtil.isAncestor(this, newBusinessTransaction))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newBusinessTransaction != null)
				msgs = ((InternalEObject)newBusinessTransaction).eInverseAdd(this, Iso20022Package.BUSINESS_TRANSACTION__TRANSMISSION, BusinessTransaction.class, msgs);
			msgs = basicSetBusinessTransaction(newBusinessTransaction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Iso20022Package.MESSAGE_TRANSMISSION__BUSINESS_TRANSACTION, newBusinessTransaction, newBusinessTransaction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MessageDefinition> getDerivation() {
		if (derivation == null) {
			derivation = new EObjectWithInverseResolvingEList.ManyInverse<MessageDefinition>(MessageDefinition.class, this, Iso20022Package.MESSAGE_TRANSMISSION__DERIVATION, Iso20022Package.MESSAGE_DEFINITION__TRACE);
		}
		return derivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMessageTypeDescription() {
		return messageTypeDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageTypeDescription(String newMessageTypeDescription) {
		String oldMessageTypeDescription = messageTypeDescription;
		messageTypeDescription = newMessageTypeDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Iso20022Package.MESSAGE_TRANSMISSION__MESSAGE_TYPE_DESCRIPTION, oldMessageTypeDescription, messageTypeDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Send getSend() {
		return send;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSend(Send newSend, NotificationChain msgs) {
		Send oldSend = send;
		send = newSend;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Iso20022Package.MESSAGE_TRANSMISSION__SEND, oldSend, newSend);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSend(Send newSend) {
		if (newSend != send) {
			NotificationChain msgs = null;
			if (send != null)
				msgs = ((InternalEObject)send).eInverseRemove(this, Iso20022Package.SEND__MESSAGE_TRANSMISSION, Send.class, msgs);
			if (newSend != null)
				msgs = ((InternalEObject)newSend).eInverseAdd(this, Iso20022Package.SEND__MESSAGE_TRANSMISSION, Send.class, msgs);
			msgs = basicSetSend(newSend, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Iso20022Package.MESSAGE_TRANSMISSION__SEND, newSend, newSend));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Receive> getReceive() {
		if (receive == null) {
			receive = new EObjectContainmentWithInverseEList<Receive>(Receive.class, this, Iso20022Package.MESSAGE_TRANSMISSION__RECEIVE, Iso20022Package.RECEIVE__MESSAGE_TRANSMISSION);
		}
		return receive;
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
			case Iso20022Package.MESSAGE_TRANSMISSION__BUSINESS_TRANSACTION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetBusinessTransaction((BusinessTransaction)otherEnd, msgs);
			case Iso20022Package.MESSAGE_TRANSMISSION__DERIVATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDerivation()).basicAdd(otherEnd, msgs);
			case Iso20022Package.MESSAGE_TRANSMISSION__SEND:
				if (send != null)
					msgs = ((InternalEObject)send).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Iso20022Package.MESSAGE_TRANSMISSION__SEND, null, msgs);
				return basicSetSend((Send)otherEnd, msgs);
			case Iso20022Package.MESSAGE_TRANSMISSION__RECEIVE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReceive()).basicAdd(otherEnd, msgs);
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
			case Iso20022Package.MESSAGE_TRANSMISSION__BUSINESS_TRANSACTION:
				return basicSetBusinessTransaction(null, msgs);
			case Iso20022Package.MESSAGE_TRANSMISSION__DERIVATION:
				return ((InternalEList<?>)getDerivation()).basicRemove(otherEnd, msgs);
			case Iso20022Package.MESSAGE_TRANSMISSION__SEND:
				return basicSetSend(null, msgs);
			case Iso20022Package.MESSAGE_TRANSMISSION__RECEIVE:
				return ((InternalEList<?>)getReceive()).basicRemove(otherEnd, msgs);
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
			case Iso20022Package.MESSAGE_TRANSMISSION__BUSINESS_TRANSACTION:
				return eInternalContainer().eInverseRemove(this, Iso20022Package.BUSINESS_TRANSACTION__TRANSMISSION, BusinessTransaction.class, msgs);
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
			case Iso20022Package.MESSAGE_TRANSMISSION__BUSINESS_TRANSACTION:
				return getBusinessTransaction();
			case Iso20022Package.MESSAGE_TRANSMISSION__DERIVATION:
				return getDerivation();
			case Iso20022Package.MESSAGE_TRANSMISSION__MESSAGE_TYPE_DESCRIPTION:
				return getMessageTypeDescription();
			case Iso20022Package.MESSAGE_TRANSMISSION__SEND:
				return getSend();
			case Iso20022Package.MESSAGE_TRANSMISSION__RECEIVE:
				return getReceive();
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
			case Iso20022Package.MESSAGE_TRANSMISSION__BUSINESS_TRANSACTION:
				setBusinessTransaction((BusinessTransaction)newValue);
				return;
			case Iso20022Package.MESSAGE_TRANSMISSION__DERIVATION:
				getDerivation().clear();
				getDerivation().addAll((Collection<? extends MessageDefinition>)newValue);
				return;
			case Iso20022Package.MESSAGE_TRANSMISSION__MESSAGE_TYPE_DESCRIPTION:
				setMessageTypeDescription((String)newValue);
				return;
			case Iso20022Package.MESSAGE_TRANSMISSION__SEND:
				setSend((Send)newValue);
				return;
			case Iso20022Package.MESSAGE_TRANSMISSION__RECEIVE:
				getReceive().clear();
				getReceive().addAll((Collection<? extends Receive>)newValue);
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
			case Iso20022Package.MESSAGE_TRANSMISSION__BUSINESS_TRANSACTION:
				setBusinessTransaction((BusinessTransaction)null);
				return;
			case Iso20022Package.MESSAGE_TRANSMISSION__DERIVATION:
				getDerivation().clear();
				return;
			case Iso20022Package.MESSAGE_TRANSMISSION__MESSAGE_TYPE_DESCRIPTION:
				setMessageTypeDescription(MESSAGE_TYPE_DESCRIPTION_EDEFAULT);
				return;
			case Iso20022Package.MESSAGE_TRANSMISSION__SEND:
				setSend((Send)null);
				return;
			case Iso20022Package.MESSAGE_TRANSMISSION__RECEIVE:
				getReceive().clear();
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
			case Iso20022Package.MESSAGE_TRANSMISSION__BUSINESS_TRANSACTION:
				return getBusinessTransaction() != null;
			case Iso20022Package.MESSAGE_TRANSMISSION__DERIVATION:
				return derivation != null && !derivation.isEmpty();
			case Iso20022Package.MESSAGE_TRANSMISSION__MESSAGE_TYPE_DESCRIPTION:
				return MESSAGE_TYPE_DESCRIPTION_EDEFAULT == null ? messageTypeDescription != null : !MESSAGE_TYPE_DESCRIPTION_EDEFAULT.equals(messageTypeDescription);
			case Iso20022Package.MESSAGE_TRANSMISSION__SEND:
				return send != null;
			case Iso20022Package.MESSAGE_TRANSMISSION__RECEIVE:
				return receive != null && !receive.isEmpty();
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
		result.append(" (messageTypeDescription: ");
		result.append(messageTypeDescription);
		result.append(')');
		return result.toString();
	}

} //MessageTransmissionImpl
