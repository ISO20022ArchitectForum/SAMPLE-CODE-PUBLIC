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
import iso20022.Send;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Send</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso20022.impl.SendImpl#getSender <em>Sender</em>}</li>
 *   <li>{@link iso20022.impl.SendImpl#getMessageTransmission <em>Message Transmission</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SendImpl extends ModelEntityImpl implements Send {
	/**
	 * The cached value of the '{@link #getSender() <em>Sender</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSender()
	 * @generated
	 * @ordered
	 */
	protected Participant sender;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SendImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Iso20022Package.eINSTANCE.getSend();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Participant getSender() {
		if (sender != null && sender.eIsProxy()) {
			InternalEObject oldSender = (InternalEObject)sender;
			sender = (Participant)eResolveProxy(oldSender);
			if (sender != oldSender) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Iso20022Package.SEND__SENDER, oldSender, sender));
			}
		}
		return sender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Participant basicGetSender() {
		return sender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSender(Participant newSender, NotificationChain msgs) {
		Participant oldSender = sender;
		sender = newSender;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Iso20022Package.SEND__SENDER, oldSender, newSender);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSender(Participant newSender) {
		if (newSender != sender) {
			NotificationChain msgs = null;
			if (sender != null)
				msgs = ((InternalEObject)sender).eInverseRemove(this, Iso20022Package.PARTICIPANT__SENDS, Participant.class, msgs);
			if (newSender != null)
				msgs = ((InternalEObject)newSender).eInverseAdd(this, Iso20022Package.PARTICIPANT__SENDS, Participant.class, msgs);
			msgs = basicSetSender(newSender, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Iso20022Package.SEND__SENDER, newSender, newSender));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageTransmission getMessageTransmission() {
		if (eContainerFeatureID() != Iso20022Package.SEND__MESSAGE_TRANSMISSION) return null;
		return (MessageTransmission)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMessageTransmission(MessageTransmission newMessageTransmission, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newMessageTransmission, Iso20022Package.SEND__MESSAGE_TRANSMISSION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageTransmission(MessageTransmission newMessageTransmission) {
		if (newMessageTransmission != eInternalContainer() || (eContainerFeatureID() != Iso20022Package.SEND__MESSAGE_TRANSMISSION && newMessageTransmission != null)) {
			if (EcoreUtil.isAncestor(this, newMessageTransmission))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newMessageTransmission != null)
				msgs = ((InternalEObject)newMessageTransmission).eInverseAdd(this, Iso20022Package.MESSAGE_TRANSMISSION__SEND, MessageTransmission.class, msgs);
			msgs = basicSetMessageTransmission(newMessageTransmission, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Iso20022Package.SEND__MESSAGE_TRANSMISSION, newMessageTransmission, newMessageTransmission));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Iso20022Package.SEND__SENDER:
				if (sender != null)
					msgs = ((InternalEObject)sender).eInverseRemove(this, Iso20022Package.PARTICIPANT__SENDS, Participant.class, msgs);
				return basicSetSender((Participant)otherEnd, msgs);
			case Iso20022Package.SEND__MESSAGE_TRANSMISSION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetMessageTransmission((MessageTransmission)otherEnd, msgs);
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
			case Iso20022Package.SEND__SENDER:
				return basicSetSender(null, msgs);
			case Iso20022Package.SEND__MESSAGE_TRANSMISSION:
				return basicSetMessageTransmission(null, msgs);
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
			case Iso20022Package.SEND__MESSAGE_TRANSMISSION:
				return eInternalContainer().eInverseRemove(this, Iso20022Package.MESSAGE_TRANSMISSION__SEND, MessageTransmission.class, msgs);
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
			case Iso20022Package.SEND__SENDER:
				if (resolve) return getSender();
				return basicGetSender();
			case Iso20022Package.SEND__MESSAGE_TRANSMISSION:
				return getMessageTransmission();
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
			case Iso20022Package.SEND__SENDER:
				setSender((Participant)newValue);
				return;
			case Iso20022Package.SEND__MESSAGE_TRANSMISSION:
				setMessageTransmission((MessageTransmission)newValue);
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
			case Iso20022Package.SEND__SENDER:
				setSender((Participant)null);
				return;
			case Iso20022Package.SEND__MESSAGE_TRANSMISSION:
				setMessageTransmission((MessageTransmission)null);
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
			case Iso20022Package.SEND__SENDER:
				return sender != null;
			case Iso20022Package.SEND__MESSAGE_TRANSMISSION:
				return getMessageTransmission() != null;
		}
		return super.eIsSet(featureID);
	}

} //SendImpl
