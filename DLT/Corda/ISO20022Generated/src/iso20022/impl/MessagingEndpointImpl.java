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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import iso20022.Address;
import iso20022.Iso20022Package;
import iso20022.MessageTransportSystem;
import iso20022.MessagingEndpoint;
import iso20022.TransportMessage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Messaging Endpoint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso20022.impl.MessagingEndpointImpl#getTransportSystem <em>Transport System</em>}</li>
 *   <li>{@link iso20022.impl.MessagingEndpointImpl#getReceivedMessage <em>Received Message</em>}</li>
 *   <li>{@link iso20022.impl.MessagingEndpointImpl#getSentMessage <em>Sent Message</em>}</li>
 *   <li>{@link iso20022.impl.MessagingEndpointImpl#getLocation <em>Location</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MessagingEndpointImpl extends ModelEntityImpl implements MessagingEndpoint {
	/**
	 * The cached value of the '{@link #getReceivedMessage() <em>Received Message</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceivedMessage()
	 * @generated
	 * @ordered
	 */
	protected EList<TransportMessage> receivedMessage;

	/**
	 * The cached value of the '{@link #getSentMessage() <em>Sent Message</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSentMessage()
	 * @generated
	 * @ordered
	 */
	protected EList<TransportMessage> sentMessage;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected EList<Address> location;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessagingEndpointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Iso20022Package.eINSTANCE.getMessagingEndpoint();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageTransportSystem getTransportSystem() {
		if (eContainerFeatureID() != Iso20022Package.MESSAGING_ENDPOINT__TRANSPORT_SYSTEM) return null;
		return (MessageTransportSystem)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransportSystem(MessageTransportSystem newTransportSystem, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTransportSystem, Iso20022Package.MESSAGING_ENDPOINT__TRANSPORT_SYSTEM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransportSystem(MessageTransportSystem newTransportSystem) {
		if (newTransportSystem != eInternalContainer() || (eContainerFeatureID() != Iso20022Package.MESSAGING_ENDPOINT__TRANSPORT_SYSTEM && newTransportSystem != null)) {
			if (EcoreUtil.isAncestor(this, newTransportSystem))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTransportSystem != null)
				msgs = ((InternalEObject)newTransportSystem).eInverseAdd(this, Iso20022Package.MESSAGE_TRANSPORT_SYSTEM__ENDPOINT, MessageTransportSystem.class, msgs);
			msgs = basicSetTransportSystem(newTransportSystem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Iso20022Package.MESSAGING_ENDPOINT__TRANSPORT_SYSTEM, newTransportSystem, newTransportSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TransportMessage> getReceivedMessage() {
		if (receivedMessage == null) {
			receivedMessage = new EObjectWithInverseResolvingEList.ManyInverse<TransportMessage>(TransportMessage.class, this, Iso20022Package.MESSAGING_ENDPOINT__RECEIVED_MESSAGE, Iso20022Package.TRANSPORT_MESSAGE__RECEIVER);
		}
		return receivedMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TransportMessage> getSentMessage() {
		if (sentMessage == null) {
			sentMessage = new EObjectWithInverseResolvingEList<TransportMessage>(TransportMessage.class, this, Iso20022Package.MESSAGING_ENDPOINT__SENT_MESSAGE, Iso20022Package.TRANSPORT_MESSAGE__SENDER);
		}
		return sentMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Address> getLocation() {
		if (location == null) {
			location = new EObjectWithInverseResolvingEList<Address>(Address.class, this, Iso20022Package.MESSAGING_ENDPOINT__LOCATION, Iso20022Package.ADDRESS__ENDPOINT);
		}
		return location;
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
			case Iso20022Package.MESSAGING_ENDPOINT__TRANSPORT_SYSTEM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTransportSystem((MessageTransportSystem)otherEnd, msgs);
			case Iso20022Package.MESSAGING_ENDPOINT__RECEIVED_MESSAGE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReceivedMessage()).basicAdd(otherEnd, msgs);
			case Iso20022Package.MESSAGING_ENDPOINT__SENT_MESSAGE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSentMessage()).basicAdd(otherEnd, msgs);
			case Iso20022Package.MESSAGING_ENDPOINT__LOCATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLocation()).basicAdd(otherEnd, msgs);
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
			case Iso20022Package.MESSAGING_ENDPOINT__TRANSPORT_SYSTEM:
				return basicSetTransportSystem(null, msgs);
			case Iso20022Package.MESSAGING_ENDPOINT__RECEIVED_MESSAGE:
				return ((InternalEList<?>)getReceivedMessage()).basicRemove(otherEnd, msgs);
			case Iso20022Package.MESSAGING_ENDPOINT__SENT_MESSAGE:
				return ((InternalEList<?>)getSentMessage()).basicRemove(otherEnd, msgs);
			case Iso20022Package.MESSAGING_ENDPOINT__LOCATION:
				return ((InternalEList<?>)getLocation()).basicRemove(otherEnd, msgs);
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
			case Iso20022Package.MESSAGING_ENDPOINT__TRANSPORT_SYSTEM:
				return eInternalContainer().eInverseRemove(this, Iso20022Package.MESSAGE_TRANSPORT_SYSTEM__ENDPOINT, MessageTransportSystem.class, msgs);
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
			case Iso20022Package.MESSAGING_ENDPOINT__TRANSPORT_SYSTEM:
				return getTransportSystem();
			case Iso20022Package.MESSAGING_ENDPOINT__RECEIVED_MESSAGE:
				return getReceivedMessage();
			case Iso20022Package.MESSAGING_ENDPOINT__SENT_MESSAGE:
				return getSentMessage();
			case Iso20022Package.MESSAGING_ENDPOINT__LOCATION:
				return getLocation();
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
			case Iso20022Package.MESSAGING_ENDPOINT__TRANSPORT_SYSTEM:
				setTransportSystem((MessageTransportSystem)newValue);
				return;
			case Iso20022Package.MESSAGING_ENDPOINT__RECEIVED_MESSAGE:
				getReceivedMessage().clear();
				getReceivedMessage().addAll((Collection<? extends TransportMessage>)newValue);
				return;
			case Iso20022Package.MESSAGING_ENDPOINT__SENT_MESSAGE:
				getSentMessage().clear();
				getSentMessage().addAll((Collection<? extends TransportMessage>)newValue);
				return;
			case Iso20022Package.MESSAGING_ENDPOINT__LOCATION:
				getLocation().clear();
				getLocation().addAll((Collection<? extends Address>)newValue);
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
			case Iso20022Package.MESSAGING_ENDPOINT__TRANSPORT_SYSTEM:
				setTransportSystem((MessageTransportSystem)null);
				return;
			case Iso20022Package.MESSAGING_ENDPOINT__RECEIVED_MESSAGE:
				getReceivedMessage().clear();
				return;
			case Iso20022Package.MESSAGING_ENDPOINT__SENT_MESSAGE:
				getSentMessage().clear();
				return;
			case Iso20022Package.MESSAGING_ENDPOINT__LOCATION:
				getLocation().clear();
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
			case Iso20022Package.MESSAGING_ENDPOINT__TRANSPORT_SYSTEM:
				return getTransportSystem() != null;
			case Iso20022Package.MESSAGING_ENDPOINT__RECEIVED_MESSAGE:
				return receivedMessage != null && !receivedMessage.isEmpty();
			case Iso20022Package.MESSAGING_ENDPOINT__SENT_MESSAGE:
				return sentMessage != null && !sentMessage.isEmpty();
			case Iso20022Package.MESSAGING_ENDPOINT__LOCATION:
				return location != null && !location.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MessagingEndpointImpl
