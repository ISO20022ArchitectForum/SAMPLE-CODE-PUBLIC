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
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import iso20022.Iso20022Package;
import iso20022.MessageInstance;
import iso20022.MessagingEndpoint;
import iso20022.TransportMessage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transport Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso20022.impl.TransportMessageImpl#getSender <em>Sender</em>}</li>
 *   <li>{@link iso20022.impl.TransportMessageImpl#getMessageInstance <em>Message Instance</em>}</li>
 *   <li>{@link iso20022.impl.TransportMessageImpl#getReceiver <em>Receiver</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransportMessageImpl extends ModelEntityImpl implements TransportMessage {
	/**
	 * The cached value of the '{@link #getSender() <em>Sender</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSender()
	 * @generated
	 * @ordered
	 */
	protected MessagingEndpoint sender;

	/**
	 * The cached value of the '{@link #getMessageInstance() <em>Message Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageInstance()
	 * @generated
	 * @ordered
	 */
	protected MessageInstance messageInstance;

	/**
	 * The cached value of the '{@link #getReceiver() <em>Receiver</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiver()
	 * @generated
	 * @ordered
	 */
	protected EList<MessagingEndpoint> receiver;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransportMessageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Iso20022Package.eINSTANCE.getTransportMessage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessagingEndpoint getSender() {
		if (sender != null && sender.eIsProxy()) {
			InternalEObject oldSender = (InternalEObject)sender;
			sender = (MessagingEndpoint)eResolveProxy(oldSender);
			if (sender != oldSender) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Iso20022Package.TRANSPORT_MESSAGE__SENDER, oldSender, sender));
			}
		}
		return sender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessagingEndpoint basicGetSender() {
		return sender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSender(MessagingEndpoint newSender, NotificationChain msgs) {
		MessagingEndpoint oldSender = sender;
		sender = newSender;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Iso20022Package.TRANSPORT_MESSAGE__SENDER, oldSender, newSender);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSender(MessagingEndpoint newSender) {
		if (newSender != sender) {
			NotificationChain msgs = null;
			if (sender != null)
				msgs = ((InternalEObject)sender).eInverseRemove(this, Iso20022Package.MESSAGING_ENDPOINT__SENT_MESSAGE, MessagingEndpoint.class, msgs);
			if (newSender != null)
				msgs = ((InternalEObject)newSender).eInverseAdd(this, Iso20022Package.MESSAGING_ENDPOINT__SENT_MESSAGE, MessagingEndpoint.class, msgs);
			msgs = basicSetSender(newSender, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Iso20022Package.TRANSPORT_MESSAGE__SENDER, newSender, newSender));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageInstance getMessageInstance() {
		if (messageInstance != null && messageInstance.eIsProxy()) {
			InternalEObject oldMessageInstance = (InternalEObject)messageInstance;
			messageInstance = (MessageInstance)eResolveProxy(oldMessageInstance);
			if (messageInstance != oldMessageInstance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Iso20022Package.TRANSPORT_MESSAGE__MESSAGE_INSTANCE, oldMessageInstance, messageInstance));
			}
		}
		return messageInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageInstance basicGetMessageInstance() {
		return messageInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMessageInstance(MessageInstance newMessageInstance, NotificationChain msgs) {
		MessageInstance oldMessageInstance = messageInstance;
		messageInstance = newMessageInstance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Iso20022Package.TRANSPORT_MESSAGE__MESSAGE_INSTANCE, oldMessageInstance, newMessageInstance);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageInstance(MessageInstance newMessageInstance) {
		if (newMessageInstance != messageInstance) {
			NotificationChain msgs = null;
			if (messageInstance != null)
				msgs = ((InternalEObject)messageInstance).eInverseRemove(this, Iso20022Package.MESSAGE_INSTANCE__TRANSPORT_MESSAGE, MessageInstance.class, msgs);
			if (newMessageInstance != null)
				msgs = ((InternalEObject)newMessageInstance).eInverseAdd(this, Iso20022Package.MESSAGE_INSTANCE__TRANSPORT_MESSAGE, MessageInstance.class, msgs);
			msgs = basicSetMessageInstance(newMessageInstance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Iso20022Package.TRANSPORT_MESSAGE__MESSAGE_INSTANCE, newMessageInstance, newMessageInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MessagingEndpoint> getReceiver() {
		if (receiver == null) {
			receiver = new EObjectWithInverseResolvingEList.ManyInverse<MessagingEndpoint>(MessagingEndpoint.class, this, Iso20022Package.TRANSPORT_MESSAGE__RECEIVER, Iso20022Package.MESSAGING_ENDPOINT__RECEIVED_MESSAGE);
		}
		return receiver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean sameMessageTransportSystem(Map context, DiagnosticChain diagnostics) {
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
			case Iso20022Package.TRANSPORT_MESSAGE__SENDER:
				if (sender != null)
					msgs = ((InternalEObject)sender).eInverseRemove(this, Iso20022Package.MESSAGING_ENDPOINT__SENT_MESSAGE, MessagingEndpoint.class, msgs);
				return basicSetSender((MessagingEndpoint)otherEnd, msgs);
			case Iso20022Package.TRANSPORT_MESSAGE__MESSAGE_INSTANCE:
				if (messageInstance != null)
					msgs = ((InternalEObject)messageInstance).eInverseRemove(this, Iso20022Package.MESSAGE_INSTANCE__TRANSPORT_MESSAGE, MessageInstance.class, msgs);
				return basicSetMessageInstance((MessageInstance)otherEnd, msgs);
			case Iso20022Package.TRANSPORT_MESSAGE__RECEIVER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReceiver()).basicAdd(otherEnd, msgs);
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
			case Iso20022Package.TRANSPORT_MESSAGE__SENDER:
				return basicSetSender(null, msgs);
			case Iso20022Package.TRANSPORT_MESSAGE__MESSAGE_INSTANCE:
				return basicSetMessageInstance(null, msgs);
			case Iso20022Package.TRANSPORT_MESSAGE__RECEIVER:
				return ((InternalEList<?>)getReceiver()).basicRemove(otherEnd, msgs);
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
			case Iso20022Package.TRANSPORT_MESSAGE__SENDER:
				if (resolve) return getSender();
				return basicGetSender();
			case Iso20022Package.TRANSPORT_MESSAGE__MESSAGE_INSTANCE:
				if (resolve) return getMessageInstance();
				return basicGetMessageInstance();
			case Iso20022Package.TRANSPORT_MESSAGE__RECEIVER:
				return getReceiver();
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
			case Iso20022Package.TRANSPORT_MESSAGE__SENDER:
				setSender((MessagingEndpoint)newValue);
				return;
			case Iso20022Package.TRANSPORT_MESSAGE__MESSAGE_INSTANCE:
				setMessageInstance((MessageInstance)newValue);
				return;
			case Iso20022Package.TRANSPORT_MESSAGE__RECEIVER:
				getReceiver().clear();
				getReceiver().addAll((Collection<? extends MessagingEndpoint>)newValue);
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
			case Iso20022Package.TRANSPORT_MESSAGE__SENDER:
				setSender((MessagingEndpoint)null);
				return;
			case Iso20022Package.TRANSPORT_MESSAGE__MESSAGE_INSTANCE:
				setMessageInstance((MessageInstance)null);
				return;
			case Iso20022Package.TRANSPORT_MESSAGE__RECEIVER:
				getReceiver().clear();
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
			case Iso20022Package.TRANSPORT_MESSAGE__SENDER:
				return sender != null;
			case Iso20022Package.TRANSPORT_MESSAGE__MESSAGE_INSTANCE:
				return messageInstance != null;
			case Iso20022Package.TRANSPORT_MESSAGE__RECEIVER:
				return receiver != null && !receiver.isEmpty();
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
			case Iso20022Package.TRANSPORT_MESSAGE___SAME_MESSAGE_TRANSPORT_SYSTEM__MAP_DIAGNOSTICCHAIN:
				return sameMessageTransportSystem((Map)arguments.get(0), (DiagnosticChain)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //TransportMessageImpl
