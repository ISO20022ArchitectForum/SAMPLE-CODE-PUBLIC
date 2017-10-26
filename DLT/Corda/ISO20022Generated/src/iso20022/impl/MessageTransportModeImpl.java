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
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import iso20022.BusinessTransaction;
import iso20022.DeliveryAssurance;
import iso20022.Durability;
import iso20022.Iso20022Package;
import iso20022.MessageCasting;
import iso20022.MessageDeliveryOrder;
import iso20022.MessageTransportMode;
import iso20022.MessageValidationLevel;
import iso20022.MessageValidationOnOff;
import iso20022.MessageValidationResults;
import iso20022.ReceiverAsynchronicity;
import iso20022.SenderAsynchronicity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message Transport Mode</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso20022.impl.MessageTransportModeImpl#getBoundedCommunicationDelay <em>Bounded Communication Delay</em>}</li>
 *   <li>{@link iso20022.impl.MessageTransportModeImpl#getMaximumClockVariation <em>Maximum Clock Variation</em>}</li>
 *   <li>{@link iso20022.impl.MessageTransportModeImpl#getMaximumMessageSize <em>Maximum Message Size</em>}</li>
 *   <li>{@link iso20022.impl.MessageTransportModeImpl#getMessageDeliveryWindow <em>Message Delivery Window</em>}</li>
 *   <li>{@link iso20022.impl.MessageTransportModeImpl#getMessageSendingWindow <em>Message Sending Window</em>}</li>
 *   <li>{@link iso20022.impl.MessageTransportModeImpl#getDeliveryAssurance <em>Delivery Assurance</em>}</li>
 *   <li>{@link iso20022.impl.MessageTransportModeImpl#getDurability <em>Durability</em>}</li>
 *   <li>{@link iso20022.impl.MessageTransportModeImpl#getMessageCasting <em>Message Casting</em>}</li>
 *   <li>{@link iso20022.impl.MessageTransportModeImpl#getMessageDeliveryOrder <em>Message Delivery Order</em>}</li>
 *   <li>{@link iso20022.impl.MessageTransportModeImpl#getMessageValidationLevel <em>Message Validation Level</em>}</li>
 *   <li>{@link iso20022.impl.MessageTransportModeImpl#getMessageValidationOnOff <em>Message Validation On Off</em>}</li>
 *   <li>{@link iso20022.impl.MessageTransportModeImpl#getMessageValidationResults <em>Message Validation Results</em>}</li>
 *   <li>{@link iso20022.impl.MessageTransportModeImpl#getReceiverAsynchronicity <em>Receiver Asynchronicity</em>}</li>
 *   <li>{@link iso20022.impl.MessageTransportModeImpl#getSenderAsynchronicity <em>Sender Asynchronicity</em>}</li>
 *   <li>{@link iso20022.impl.MessageTransportModeImpl#getBusinessTransaction <em>Business Transaction</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MessageTransportModeImpl extends TopLevelCatalogueEntryImpl implements MessageTransportMode {
	/**
	 * The default value of the '{@link #getBoundedCommunicationDelay() <em>Bounded Communication Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoundedCommunicationDelay()
	 * @generated
	 * @ordered
	 */
	protected static final String BOUNDED_COMMUNICATION_DELAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBoundedCommunicationDelay() <em>Bounded Communication Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoundedCommunicationDelay()
	 * @generated
	 * @ordered
	 */
	protected String boundedCommunicationDelay = BOUNDED_COMMUNICATION_DELAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaximumClockVariation() <em>Maximum Clock Variation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumClockVariation()
	 * @generated
	 * @ordered
	 */
	protected static final String MAXIMUM_CLOCK_VARIATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaximumClockVariation() <em>Maximum Clock Variation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumClockVariation()
	 * @generated
	 * @ordered
	 */
	protected String maximumClockVariation = MAXIMUM_CLOCK_VARIATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaximumMessageSize() <em>Maximum Message Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumMessageSize()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MAXIMUM_MESSAGE_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaximumMessageSize() <em>Maximum Message Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumMessageSize()
	 * @generated
	 * @ordered
	 */
	protected Integer maximumMessageSize = MAXIMUM_MESSAGE_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMessageDeliveryWindow() <em>Message Delivery Window</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageDeliveryWindow()
	 * @generated
	 * @ordered
	 */
	protected static final String MESSAGE_DELIVERY_WINDOW_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMessageDeliveryWindow() <em>Message Delivery Window</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageDeliveryWindow()
	 * @generated
	 * @ordered
	 */
	protected String messageDeliveryWindow = MESSAGE_DELIVERY_WINDOW_EDEFAULT;

	/**
	 * The default value of the '{@link #getMessageSendingWindow() <em>Message Sending Window</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageSendingWindow()
	 * @generated
	 * @ordered
	 */
	protected static final String MESSAGE_SENDING_WINDOW_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMessageSendingWindow() <em>Message Sending Window</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageSendingWindow()
	 * @generated
	 * @ordered
	 */
	protected String messageSendingWindow = MESSAGE_SENDING_WINDOW_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeliveryAssurance() <em>Delivery Assurance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliveryAssurance()
	 * @generated
	 * @ordered
	 */
	protected static final DeliveryAssurance DELIVERY_ASSURANCE_EDEFAULT = DeliveryAssurance.AT_LEAST_ONCE;

	/**
	 * The cached value of the '{@link #getDeliveryAssurance() <em>Delivery Assurance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliveryAssurance()
	 * @generated
	 * @ordered
	 */
	protected DeliveryAssurance deliveryAssurance = DELIVERY_ASSURANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDurability() <em>Durability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDurability()
	 * @generated
	 * @ordered
	 */
	protected static final Durability DURABILITY_EDEFAULT = Durability.DURABLE;

	/**
	 * The cached value of the '{@link #getDurability() <em>Durability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDurability()
	 * @generated
	 * @ordered
	 */
	protected Durability durability = DURABILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getMessageCasting() <em>Message Casting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageCasting()
	 * @generated
	 * @ordered
	 */
	protected static final MessageCasting MESSAGE_CASTING_EDEFAULT = MessageCasting.UNICAST;

	/**
	 * The cached value of the '{@link #getMessageCasting() <em>Message Casting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageCasting()
	 * @generated
	 * @ordered
	 */
	protected MessageCasting messageCasting = MESSAGE_CASTING_EDEFAULT;

	/**
	 * The default value of the '{@link #getMessageDeliveryOrder() <em>Message Delivery Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageDeliveryOrder()
	 * @generated
	 * @ordered
	 */
	protected static final MessageDeliveryOrder MESSAGE_DELIVERY_ORDER_EDEFAULT = MessageDeliveryOrder.EXPECTED_CAUSAL_ORDER;

	/**
	 * The cached value of the '{@link #getMessageDeliveryOrder() <em>Message Delivery Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageDeliveryOrder()
	 * @generated
	 * @ordered
	 */
	protected MessageDeliveryOrder messageDeliveryOrder = MESSAGE_DELIVERY_ORDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getMessageValidationLevel() <em>Message Validation Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageValidationLevel()
	 * @generated
	 * @ordered
	 */
	protected static final MessageValidationLevel MESSAGE_VALIDATION_LEVEL_EDEFAULT = MessageValidationLevel.NO_VALIDATION;

	/**
	 * The cached value of the '{@link #getMessageValidationLevel() <em>Message Validation Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageValidationLevel()
	 * @generated
	 * @ordered
	 */
	protected MessageValidationLevel messageValidationLevel = MESSAGE_VALIDATION_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getMessageValidationOnOff() <em>Message Validation On Off</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageValidationOnOff()
	 * @generated
	 * @ordered
	 */
	protected static final MessageValidationOnOff MESSAGE_VALIDATION_ON_OFF_EDEFAULT = MessageValidationOnOff.VALIDATION_ON;

	/**
	 * The cached value of the '{@link #getMessageValidationOnOff() <em>Message Validation On Off</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageValidationOnOff()
	 * @generated
	 * @ordered
	 */
	protected MessageValidationOnOff messageValidationOnOff = MESSAGE_VALIDATION_ON_OFF_EDEFAULT;

	/**
	 * The default value of the '{@link #getMessageValidationResults() <em>Message Validation Results</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageValidationResults()
	 * @generated
	 * @ordered
	 */
	protected static final MessageValidationResults MESSAGE_VALIDATION_RESULTS_EDEFAULT = MessageValidationResults.REJECT;

	/**
	 * The cached value of the '{@link #getMessageValidationResults() <em>Message Validation Results</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageValidationResults()
	 * @generated
	 * @ordered
	 */
	protected MessageValidationResults messageValidationResults = MESSAGE_VALIDATION_RESULTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getReceiverAsynchronicity() <em>Receiver Asynchronicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiverAsynchronicity()
	 * @generated
	 * @ordered
	 */
	protected static final ReceiverAsynchronicity RECEIVER_ASYNCHRONICITY_EDEFAULT = ReceiverAsynchronicity.ENDPOINT_SYNCHRONOUS;

	/**
	 * The cached value of the '{@link #getReceiverAsynchronicity() <em>Receiver Asynchronicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiverAsynchronicity()
	 * @generated
	 * @ordered
	 */
	protected ReceiverAsynchronicity receiverAsynchronicity = RECEIVER_ASYNCHRONICITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getSenderAsynchronicity() <em>Sender Asynchronicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSenderAsynchronicity()
	 * @generated
	 * @ordered
	 */
	protected static final SenderAsynchronicity SENDER_ASYNCHRONICITY_EDEFAULT = SenderAsynchronicity.ENDPOINT_SYNCHRONOUS;

	/**
	 * The cached value of the '{@link #getSenderAsynchronicity() <em>Sender Asynchronicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSenderAsynchronicity()
	 * @generated
	 * @ordered
	 */
	protected SenderAsynchronicity senderAsynchronicity = SENDER_ASYNCHRONICITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBusinessTransaction() <em>Business Transaction</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessTransaction()
	 * @generated
	 * @ordered
	 */
	protected EList<BusinessTransaction> businessTransaction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageTransportModeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Iso20022Package.eINSTANCE.getMessageTransportMode();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBoundedCommunicationDelay() {
		return boundedCommunicationDelay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoundedCommunicationDelay(String newBoundedCommunicationDelay) {
		String oldBoundedCommunicationDelay = boundedCommunicationDelay;
		boundedCommunicationDelay = newBoundedCommunicationDelay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Iso20022Package.MESSAGE_TRANSPORT_MODE__BOUNDED_COMMUNICATION_DELAY, oldBoundedCommunicationDelay, boundedCommunicationDelay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMaximumClockVariation() {
		return maximumClockVariation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximumClockVariation(String newMaximumClockVariation) {
		String oldMaximumClockVariation = maximumClockVariation;
		maximumClockVariation = newMaximumClockVariation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Iso20022Package.MESSAGE_TRANSPORT_MODE__MAXIMUM_CLOCK_VARIATION, oldMaximumClockVariation, maximumClockVariation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getMaximumMessageSize() {
		return maximumMessageSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximumMessageSize(Integer newMaximumMessageSize) {
		Integer oldMaximumMessageSize = maximumMessageSize;
		maximumMessageSize = newMaximumMessageSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Iso20022Package.MESSAGE_TRANSPORT_MODE__MAXIMUM_MESSAGE_SIZE, oldMaximumMessageSize, maximumMessageSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMessageDeliveryWindow() {
		return messageDeliveryWindow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageDeliveryWindow(String newMessageDeliveryWindow) {
		String oldMessageDeliveryWindow = messageDeliveryWindow;
		messageDeliveryWindow = newMessageDeliveryWindow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Iso20022Package.MESSAGE_TRANSPORT_MODE__MESSAGE_DELIVERY_WINDOW, oldMessageDeliveryWindow, messageDeliveryWindow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMessageSendingWindow() {
		return messageSendingWindow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageSendingWindow(String newMessageSendingWindow) {
		String oldMessageSendingWindow = messageSendingWindow;
		messageSendingWindow = newMessageSendingWindow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Iso20022Package.MESSAGE_TRANSPORT_MODE__MESSAGE_SENDING_WINDOW, oldMessageSendingWindow, messageSendingWindow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeliveryAssurance getDeliveryAssurance() {
		return deliveryAssurance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeliveryAssurance(DeliveryAssurance newDeliveryAssurance) {
		DeliveryAssurance oldDeliveryAssurance = deliveryAssurance;
		deliveryAssurance = newDeliveryAssurance == null ? DELIVERY_ASSURANCE_EDEFAULT : newDeliveryAssurance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Iso20022Package.MESSAGE_TRANSPORT_MODE__DELIVERY_ASSURANCE, oldDeliveryAssurance, deliveryAssurance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Durability getDurability() {
		return durability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDurability(Durability newDurability) {
		Durability oldDurability = durability;
		durability = newDurability == null ? DURABILITY_EDEFAULT : newDurability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Iso20022Package.MESSAGE_TRANSPORT_MODE__DURABILITY, oldDurability, durability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageCasting getMessageCasting() {
		return messageCasting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageCasting(MessageCasting newMessageCasting) {
		MessageCasting oldMessageCasting = messageCasting;
		messageCasting = newMessageCasting == null ? MESSAGE_CASTING_EDEFAULT : newMessageCasting;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Iso20022Package.MESSAGE_TRANSPORT_MODE__MESSAGE_CASTING, oldMessageCasting, messageCasting));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageDeliveryOrder getMessageDeliveryOrder() {
		return messageDeliveryOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageDeliveryOrder(MessageDeliveryOrder newMessageDeliveryOrder) {
		MessageDeliveryOrder oldMessageDeliveryOrder = messageDeliveryOrder;
		messageDeliveryOrder = newMessageDeliveryOrder == null ? MESSAGE_DELIVERY_ORDER_EDEFAULT : newMessageDeliveryOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Iso20022Package.MESSAGE_TRANSPORT_MODE__MESSAGE_DELIVERY_ORDER, oldMessageDeliveryOrder, messageDeliveryOrder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageValidationLevel getMessageValidationLevel() {
		return messageValidationLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageValidationLevel(MessageValidationLevel newMessageValidationLevel) {
		MessageValidationLevel oldMessageValidationLevel = messageValidationLevel;
		messageValidationLevel = newMessageValidationLevel == null ? MESSAGE_VALIDATION_LEVEL_EDEFAULT : newMessageValidationLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Iso20022Package.MESSAGE_TRANSPORT_MODE__MESSAGE_VALIDATION_LEVEL, oldMessageValidationLevel, messageValidationLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageValidationOnOff getMessageValidationOnOff() {
		return messageValidationOnOff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageValidationOnOff(MessageValidationOnOff newMessageValidationOnOff) {
		MessageValidationOnOff oldMessageValidationOnOff = messageValidationOnOff;
		messageValidationOnOff = newMessageValidationOnOff == null ? MESSAGE_VALIDATION_ON_OFF_EDEFAULT : newMessageValidationOnOff;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Iso20022Package.MESSAGE_TRANSPORT_MODE__MESSAGE_VALIDATION_ON_OFF, oldMessageValidationOnOff, messageValidationOnOff));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageValidationResults getMessageValidationResults() {
		return messageValidationResults;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageValidationResults(MessageValidationResults newMessageValidationResults) {
		MessageValidationResults oldMessageValidationResults = messageValidationResults;
		messageValidationResults = newMessageValidationResults == null ? MESSAGE_VALIDATION_RESULTS_EDEFAULT : newMessageValidationResults;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Iso20022Package.MESSAGE_TRANSPORT_MODE__MESSAGE_VALIDATION_RESULTS, oldMessageValidationResults, messageValidationResults));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReceiverAsynchronicity getReceiverAsynchronicity() {
		return receiverAsynchronicity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceiverAsynchronicity(ReceiverAsynchronicity newReceiverAsynchronicity) {
		ReceiverAsynchronicity oldReceiverAsynchronicity = receiverAsynchronicity;
		receiverAsynchronicity = newReceiverAsynchronicity == null ? RECEIVER_ASYNCHRONICITY_EDEFAULT : newReceiverAsynchronicity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Iso20022Package.MESSAGE_TRANSPORT_MODE__RECEIVER_ASYNCHRONICITY, oldReceiverAsynchronicity, receiverAsynchronicity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SenderAsynchronicity getSenderAsynchronicity() {
		return senderAsynchronicity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSenderAsynchronicity(SenderAsynchronicity newSenderAsynchronicity) {
		SenderAsynchronicity oldSenderAsynchronicity = senderAsynchronicity;
		senderAsynchronicity = newSenderAsynchronicity == null ? SENDER_ASYNCHRONICITY_EDEFAULT : newSenderAsynchronicity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Iso20022Package.MESSAGE_TRANSPORT_MODE__SENDER_ASYNCHRONICITY, oldSenderAsynchronicity, senderAsynchronicity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BusinessTransaction> getBusinessTransaction() {
		if (businessTransaction == null) {
			businessTransaction = new EObjectWithInverseResolvingEList<BusinessTransaction>(BusinessTransaction.class, this, Iso20022Package.MESSAGE_TRANSPORT_MODE__BUSINESS_TRANSACTION, Iso20022Package.BUSINESS_TRANSACTION__MESSAGE_TRANSPORT_MODE);
		}
		return businessTransaction;
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
			case Iso20022Package.MESSAGE_TRANSPORT_MODE__BUSINESS_TRANSACTION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBusinessTransaction()).basicAdd(otherEnd, msgs);
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
			case Iso20022Package.MESSAGE_TRANSPORT_MODE__BUSINESS_TRANSACTION:
				return ((InternalEList<?>)getBusinessTransaction()).basicRemove(otherEnd, msgs);
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
			case Iso20022Package.MESSAGE_TRANSPORT_MODE__BOUNDED_COMMUNICATION_DELAY:
				return getBoundedCommunicationDelay();
			case Iso20022Package.MESSAGE_TRANSPORT_MODE__MAXIMUM_CLOCK_VARIATION:
				return getMaximumClockVariation();
			case Iso20022Package.MESSAGE_TRANSPORT_MODE__MAXIMUM_MESSAGE_SIZE:
				return getMaximumMessageSize();
			case Iso20022Package.MESSAGE_TRANSPORT_MODE__MESSAGE_DELIVERY_WINDOW:
				return getMessageDeliveryWindow();
			case Iso20022Package.MESSAGE_TRANSPORT_MODE__MESSAGE_SENDING_WINDOW:
				return getMessageSendingWindow();
			case Iso20022Package.MESSAGE_TRANSPORT_MODE__DELIVERY_ASSURANCE:
				return getDeliveryAssurance();
			case Iso20022Package.MESSAGE_TRANSPORT_MODE__DURABILITY:
				return getDurability();
			case Iso20022Package.MESSAGE_TRANSPORT_MODE__MESSAGE_CASTING:
				return getMessageCasting();
			case Iso20022Package.MESSAGE_TRANSPORT_MODE__MESSAGE_DELIVERY_ORDER:
				return getMessageDeliveryOrder();
			case Iso20022Package.MESSAGE_TRANSPORT_MODE__MESSAGE_VALIDATION_LEVEL:
				return getMessageValidationLevel();
			case Iso20022Package.MESSAGE_TRANSPORT_MODE__MESSAGE_VALIDATION_ON_OFF:
				return getMessageValidationOnOff();
			case Iso20022Package.MESSAGE_TRANSPORT_MODE__MESSAGE_VALIDATION_RESULTS:
				return getMessageValidationResults();
			case Iso20022Package.MESSAGE_TRANSPORT_MODE__RECEIVER_ASYNCHRONICITY:
				return getReceiverAsynchronicity();
			case Iso20022Package.MESSAGE_TRANSPORT_MODE__SENDER_ASYNCHRONICITY:
				return getSenderAsynchronicity();
			case Iso20022Package.MESSAGE_TRANSPORT_MODE__BUSINESS_TRANSACTION:
				return getBusinessTransaction();
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
			case Iso20022Package.MESSAGE_TRANSPORT_MODE__BOUNDED_COMMUNICATION_DELAY:
				setBoundedCommunicationDelay((String)newValue);
				return;
			case Iso20022Package.MESSAGE_TRANSPORT_MODE__MAXIMUM_CLOCK_VARIATION:
				setMaximumClockVariation((String)newValue);
				return;
			case Iso20022Package.MESSAGE_TRANSPORT_MODE__MAXIMUM_MESSAGE_SIZE:
				setMaximumMessageSize((Integer)newValue);
				return;
			case Iso20022Package.MESSAGE_TRANSPORT_MODE__MESSAGE_DELIVERY_WINDOW:
				setMessageDeliveryWindow((String)newValue);
				return;
			case Iso20022Package.MESSAGE_TRANSPORT_MODE__MESSAGE_SENDING_WINDOW:
				setMessageSendingWindow((String)newValue);
				return;
			case Iso20022Package.MESSAGE_TRANSPORT_MODE__DELIVERY_ASSURANCE:
				setDeliveryAssurance((DeliveryAssurance)newValue);
				return;
			case Iso20022Package.MESSAGE_TRANSPORT_MODE__DURABILITY:
				setDurability((Durability)newValue);
				return;
			case Iso20022Package.MESSAGE_TRANSPORT_MODE__MESSAGE_CASTING:
				setMessageCasting((MessageCasting)newValue);
				return;
			case Iso20022Package.MESSAGE_TRANSPORT_MODE__MESSAGE_DELIVERY_ORDER:
				setMessageDeliveryOrder((MessageDeliveryOrder)newValue);
				return;
			case Iso20022Package.MESSAGE_TRANSPORT_MODE__MESSAGE_VALIDATION_LEVEL:
				setMessageValidationLevel((MessageValidationLevel)newValue);
				return;
			case Iso20022Package.MESSAGE_TRANSPORT_MODE__MESSAGE_VALIDATION_ON_OFF:
				setMessageValidationOnOff((MessageValidationOnOff)newValue);
				return;
			case Iso20022Package.MESSAGE_TRANSPORT_MODE__MESSAGE_VALIDATION_RESULTS:
				setMessageValidationResults((MessageValidationResults)newValue);
				return;
			case Iso20022Package.MESSAGE_TRANSPORT_MODE__RECEIVER_ASYNCHRONICITY:
				setReceiverAsynchronicity((ReceiverAsynchronicity)newValue);
				return;
			case Iso20022Package.MESSAGE_TRANSPORT_MODE__SENDER_ASYNCHRONICITY:
				setSenderAsynchronicity((SenderAsynchronicity)newValue);
				return;
			case Iso20022Package.MESSAGE_TRANSPORT_MODE__BUSINESS_TRANSACTION:
				getBusinessTransaction().clear();
				getBusinessTransaction().addAll((Collection<? extends BusinessTransaction>)newValue);
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
			case Iso20022Package.MESSAGE_TRANSPORT_MODE__BOUNDED_COMMUNICATION_DELAY:
				setBoundedCommunicationDelay(BOUNDED_COMMUNICATION_DELAY_EDEFAULT);
				return;
			case Iso20022Package.MESSAGE_TRANSPORT_MODE__MAXIMUM_CLOCK_VARIATION:
				setMaximumClockVariation(MAXIMUM_CLOCK_VARIATION_EDEFAULT);
				return;
			case Iso20022Package.MESSAGE_TRANSPORT_MODE__MAXIMUM_MESSAGE_SIZE:
				setMaximumMessageSize(MAXIMUM_MESSAGE_SIZE_EDEFAULT);
				return;
			case Iso20022Package.MESSAGE_TRANSPORT_MODE__MESSAGE_DELIVERY_WINDOW:
				setMessageDeliveryWindow(MESSAGE_DELIVERY_WINDOW_EDEFAULT);
				return;
			case Iso20022Package.MESSAGE_TRANSPORT_MODE__MESSAGE_SENDING_WINDOW:
				setMessageSendingWindow(MESSAGE_SENDING_WINDOW_EDEFAULT);
				return;
			case Iso20022Package.MESSAGE_TRANSPORT_MODE__DELIVERY_ASSURANCE:
				setDeliveryAssurance(DELIVERY_ASSURANCE_EDEFAULT);
				return;
			case Iso20022Package.MESSAGE_TRANSPORT_MODE__DURABILITY:
				setDurability(DURABILITY_EDEFAULT);
				return;
			case Iso20022Package.MESSAGE_TRANSPORT_MODE__MESSAGE_CASTING:
				setMessageCasting(MESSAGE_CASTING_EDEFAULT);
				return;
			case Iso20022Package.MESSAGE_TRANSPORT_MODE__MESSAGE_DELIVERY_ORDER:
				setMessageDeliveryOrder(MESSAGE_DELIVERY_ORDER_EDEFAULT);
				return;
			case Iso20022Package.MESSAGE_TRANSPORT_MODE__MESSAGE_VALIDATION_LEVEL:
				setMessageValidationLevel(MESSAGE_VALIDATION_LEVEL_EDEFAULT);
				return;
			case Iso20022Package.MESSAGE_TRANSPORT_MODE__MESSAGE_VALIDATION_ON_OFF:
				setMessageValidationOnOff(MESSAGE_VALIDATION_ON_OFF_EDEFAULT);
				return;
			case Iso20022Package.MESSAGE_TRANSPORT_MODE__MESSAGE_VALIDATION_RESULTS:
				setMessageValidationResults(MESSAGE_VALIDATION_RESULTS_EDEFAULT);
				return;
			case Iso20022Package.MESSAGE_TRANSPORT_MODE__RECEIVER_ASYNCHRONICITY:
				setReceiverAsynchronicity(RECEIVER_ASYNCHRONICITY_EDEFAULT);
				return;
			case Iso20022Package.MESSAGE_TRANSPORT_MODE__SENDER_ASYNCHRONICITY:
				setSenderAsynchronicity(SENDER_ASYNCHRONICITY_EDEFAULT);
				return;
			case Iso20022Package.MESSAGE_TRANSPORT_MODE__BUSINESS_TRANSACTION:
				getBusinessTransaction().clear();
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
			case Iso20022Package.MESSAGE_TRANSPORT_MODE__BOUNDED_COMMUNICATION_DELAY:
				return BOUNDED_COMMUNICATION_DELAY_EDEFAULT == null ? boundedCommunicationDelay != null : !BOUNDED_COMMUNICATION_DELAY_EDEFAULT.equals(boundedCommunicationDelay);
			case Iso20022Package.MESSAGE_TRANSPORT_MODE__MAXIMUM_CLOCK_VARIATION:
				return MAXIMUM_CLOCK_VARIATION_EDEFAULT == null ? maximumClockVariation != null : !MAXIMUM_CLOCK_VARIATION_EDEFAULT.equals(maximumClockVariation);
			case Iso20022Package.MESSAGE_TRANSPORT_MODE__MAXIMUM_MESSAGE_SIZE:
				return MAXIMUM_MESSAGE_SIZE_EDEFAULT == null ? maximumMessageSize != null : !MAXIMUM_MESSAGE_SIZE_EDEFAULT.equals(maximumMessageSize);
			case Iso20022Package.MESSAGE_TRANSPORT_MODE__MESSAGE_DELIVERY_WINDOW:
				return MESSAGE_DELIVERY_WINDOW_EDEFAULT == null ? messageDeliveryWindow != null : !MESSAGE_DELIVERY_WINDOW_EDEFAULT.equals(messageDeliveryWindow);
			case Iso20022Package.MESSAGE_TRANSPORT_MODE__MESSAGE_SENDING_WINDOW:
				return MESSAGE_SENDING_WINDOW_EDEFAULT == null ? messageSendingWindow != null : !MESSAGE_SENDING_WINDOW_EDEFAULT.equals(messageSendingWindow);
			case Iso20022Package.MESSAGE_TRANSPORT_MODE__DELIVERY_ASSURANCE:
				return deliveryAssurance != DELIVERY_ASSURANCE_EDEFAULT;
			case Iso20022Package.MESSAGE_TRANSPORT_MODE__DURABILITY:
				return durability != DURABILITY_EDEFAULT;
			case Iso20022Package.MESSAGE_TRANSPORT_MODE__MESSAGE_CASTING:
				return messageCasting != MESSAGE_CASTING_EDEFAULT;
			case Iso20022Package.MESSAGE_TRANSPORT_MODE__MESSAGE_DELIVERY_ORDER:
				return messageDeliveryOrder != MESSAGE_DELIVERY_ORDER_EDEFAULT;
			case Iso20022Package.MESSAGE_TRANSPORT_MODE__MESSAGE_VALIDATION_LEVEL:
				return messageValidationLevel != MESSAGE_VALIDATION_LEVEL_EDEFAULT;
			case Iso20022Package.MESSAGE_TRANSPORT_MODE__MESSAGE_VALIDATION_ON_OFF:
				return messageValidationOnOff != MESSAGE_VALIDATION_ON_OFF_EDEFAULT;
			case Iso20022Package.MESSAGE_TRANSPORT_MODE__MESSAGE_VALIDATION_RESULTS:
				return messageValidationResults != MESSAGE_VALIDATION_RESULTS_EDEFAULT;
			case Iso20022Package.MESSAGE_TRANSPORT_MODE__RECEIVER_ASYNCHRONICITY:
				return receiverAsynchronicity != RECEIVER_ASYNCHRONICITY_EDEFAULT;
			case Iso20022Package.MESSAGE_TRANSPORT_MODE__SENDER_ASYNCHRONICITY:
				return senderAsynchronicity != SENDER_ASYNCHRONICITY_EDEFAULT;
			case Iso20022Package.MESSAGE_TRANSPORT_MODE__BUSINESS_TRANSACTION:
				return businessTransaction != null && !businessTransaction.isEmpty();
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
		result.append(" (boundedCommunicationDelay: ");
		result.append(boundedCommunicationDelay);
		result.append(", maximumClockVariation: ");
		result.append(maximumClockVariation);
		result.append(", maximumMessageSize: ");
		result.append(maximumMessageSize);
		result.append(", messageDeliveryWindow: ");
		result.append(messageDeliveryWindow);
		result.append(", messageSendingWindow: ");
		result.append(messageSendingWindow);
		result.append(", deliveryAssurance: ");
		result.append(deliveryAssurance);
		result.append(", durability: ");
		result.append(durability);
		result.append(", messageCasting: ");
		result.append(messageCasting);
		result.append(", messageDeliveryOrder: ");
		result.append(messageDeliveryOrder);
		result.append(", messageValidationLevel: ");
		result.append(messageValidationLevel);
		result.append(", messageValidationOnOff: ");
		result.append(messageValidationOnOff);
		result.append(", messageValidationResults: ");
		result.append(messageValidationResults);
		result.append(", receiverAsynchronicity: ");
		result.append(receiverAsynchronicity);
		result.append(", senderAsynchronicity: ");
		result.append(senderAsynchronicity);
		result.append(')');
		return result.toString();
	}

} //MessageTransportModeImpl
