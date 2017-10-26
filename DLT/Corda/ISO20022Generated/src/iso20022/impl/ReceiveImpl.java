/**
 */
package iso20022.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import iso20022.Iso20022Package;
import iso20022.MessageTransmission;
import iso20022.Participant;
import iso20022.Receive;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Receive</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso20022.impl.ReceiveImpl#getMessageTransmission <em>Message Transmission</em>}</li>
 *   <li>{@link iso20022.impl.ReceiveImpl#getReceiver <em>Receiver</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReceiveImpl extends ModelEntityImpl implements Receive {
	/**
	 * The cached value of the '{@link #getReceiver() <em>Receiver</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiver()
	 * @generated
	 * @ordered
	 */
	protected Participant receiver;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReceiveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Iso20022Package.eINSTANCE.getReceive();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageTransmission getMessageTransmission() {
		if (eContainerFeatureID() != Iso20022Package.RECEIVE__MESSAGE_TRANSMISSION) return null;
		return (MessageTransmission)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMessageTransmission(MessageTransmission newMessageTransmission, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newMessageTransmission, Iso20022Package.RECEIVE__MESSAGE_TRANSMISSION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageTransmission(MessageTransmission newMessageTransmission) {
		if (newMessageTransmission != eInternalContainer() || (eContainerFeatureID() != Iso20022Package.RECEIVE__MESSAGE_TRANSMISSION && newMessageTransmission != null)) {
			if (EcoreUtil.isAncestor(this, newMessageTransmission))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newMessageTransmission != null)
				msgs = ((InternalEObject)newMessageTransmission).eInverseAdd(this, Iso20022Package.MESSAGE_TRANSMISSION__RECEIVE, MessageTransmission.class, msgs);
			msgs = basicSetMessageTransmission(newMessageTransmission, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Iso20022Package.RECEIVE__MESSAGE_TRANSMISSION, newMessageTransmission, newMessageTransmission));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Participant getReceiver() {
		if (receiver != null && receiver.eIsProxy()) {
			InternalEObject oldReceiver = (InternalEObject)receiver;
			receiver = (Participant)eResolveProxy(oldReceiver);
			if (receiver != oldReceiver) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Iso20022Package.RECEIVE__RECEIVER, oldReceiver, receiver));
			}
		}
		return receiver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Participant basicGetReceiver() {
		return receiver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReceiver(Participant newReceiver, NotificationChain msgs) {
		Participant oldReceiver = receiver;
		receiver = newReceiver;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Iso20022Package.RECEIVE__RECEIVER, oldReceiver, newReceiver);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceiver(Participant newReceiver) {
		if (newReceiver != receiver) {
			NotificationChain msgs = null;
			if (receiver != null)
				msgs = ((InternalEObject)receiver).eInverseRemove(this, Iso20022Package.PARTICIPANT__RECEIVES, Participant.class, msgs);
			if (newReceiver != null)
				msgs = ((InternalEObject)newReceiver).eInverseAdd(this, Iso20022Package.PARTICIPANT__RECEIVES, Participant.class, msgs);
			msgs = basicSetReceiver(newReceiver, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Iso20022Package.RECEIVE__RECEIVER, newReceiver, newReceiver));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Iso20022Package.RECEIVE__MESSAGE_TRANSMISSION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetMessageTransmission((MessageTransmission)otherEnd, msgs);
			case Iso20022Package.RECEIVE__RECEIVER:
				if (receiver != null)
					msgs = ((InternalEObject)receiver).eInverseRemove(this, Iso20022Package.PARTICIPANT__RECEIVES, Participant.class, msgs);
				return basicSetReceiver((Participant)otherEnd, msgs);
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
			case Iso20022Package.RECEIVE__MESSAGE_TRANSMISSION:
				return basicSetMessageTransmission(null, msgs);
			case Iso20022Package.RECEIVE__RECEIVER:
				return basicSetReceiver(null, msgs);
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
			case Iso20022Package.RECEIVE__MESSAGE_TRANSMISSION:
				return eInternalContainer().eInverseRemove(this, Iso20022Package.MESSAGE_TRANSMISSION__RECEIVE, MessageTransmission.class, msgs);
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
			case Iso20022Package.RECEIVE__MESSAGE_TRANSMISSION:
				return getMessageTransmission();
			case Iso20022Package.RECEIVE__RECEIVER:
				if (resolve) return getReceiver();
				return basicGetReceiver();
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
			case Iso20022Package.RECEIVE__MESSAGE_TRANSMISSION:
				setMessageTransmission((MessageTransmission)newValue);
				return;
			case Iso20022Package.RECEIVE__RECEIVER:
				setReceiver((Participant)newValue);
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
			case Iso20022Package.RECEIVE__MESSAGE_TRANSMISSION:
				setMessageTransmission((MessageTransmission)null);
				return;
			case Iso20022Package.RECEIVE__RECEIVER:
				setReceiver((Participant)null);
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
			case Iso20022Package.RECEIVE__MESSAGE_TRANSMISSION:
				return getMessageTransmission() != null;
			case Iso20022Package.RECEIVE__RECEIVER:
				return receiver != null;
		}
		return super.eIsSet(featureID);
	}

} //ReceiveImpl
