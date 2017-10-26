/**
 */
package iso20022;

import java.lang.String;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Transport Mode</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * group of settings for the values for the MessageTransportCharacteristics properties
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso20022.MessageTransportMode#getBoundedCommunicationDelay <em>Bounded Communication Delay</em>}</li>
 *   <li>{@link iso20022.MessageTransportMode#getMaximumClockVariation <em>Maximum Clock Variation</em>}</li>
 *   <li>{@link iso20022.MessageTransportMode#getMaximumMessageSize <em>Maximum Message Size</em>}</li>
 *   <li>{@link iso20022.MessageTransportMode#getMessageDeliveryWindow <em>Message Delivery Window</em>}</li>
 *   <li>{@link iso20022.MessageTransportMode#getMessageSendingWindow <em>Message Sending Window</em>}</li>
 *   <li>{@link iso20022.MessageTransportMode#getDeliveryAssurance <em>Delivery Assurance</em>}</li>
 *   <li>{@link iso20022.MessageTransportMode#getDurability <em>Durability</em>}</li>
 *   <li>{@link iso20022.MessageTransportMode#getMessageCasting <em>Message Casting</em>}</li>
 *   <li>{@link iso20022.MessageTransportMode#getMessageDeliveryOrder <em>Message Delivery Order</em>}</li>
 *   <li>{@link iso20022.MessageTransportMode#getMessageValidationLevel <em>Message Validation Level</em>}</li>
 *   <li>{@link iso20022.MessageTransportMode#getMessageValidationOnOff <em>Message Validation On Off</em>}</li>
 *   <li>{@link iso20022.MessageTransportMode#getMessageValidationResults <em>Message Validation Results</em>}</li>
 *   <li>{@link iso20022.MessageTransportMode#getReceiverAsynchronicity <em>Receiver Asynchronicity</em>}</li>
 *   <li>{@link iso20022.MessageTransportMode#getSenderAsynchronicity <em>Sender Asynchronicity</em>}</li>
 *   <li>{@link iso20022.MessageTransportMode#getBusinessTransaction <em>Business Transaction</em>}</li>
 * </ul>
 *
 * @see iso20022.Iso20022Package#getMessageTransportMode()
 * @model
 * @generated
 */
public interface MessageTransportMode extends TopLevelCatalogueEntry {
	/**
	 * Returns the value of the '<em><b>Bounded Communication Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the maximum duration of time within which a TransportMessage must be delivered
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bounded Communication Delay</em>' attribute.
	 * @see #setBoundedCommunicationDelay(String)
	 * @see iso20022.Iso20022Package#getMessageTransportMode_BoundedCommunicationDelay()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getBoundedCommunicationDelay();

	/**
	 * Sets the value of the '{@link iso20022.MessageTransportMode#getBoundedCommunicationDelay <em>Bounded Communication Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bounded Communication Delay</em>' attribute.
	 * @see #getBoundedCommunicationDelay()
	 * @generated
	 */
	void setBoundedCommunicationDelay(String value);

	/**
	 * Returns the value of the '<em><b>Maximum Clock Variation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * clocks must maintain a maximum (inclusive) variance from UTC for the supported MessageTransportMode
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Maximum Clock Variation</em>' attribute.
	 * @see #setMaximumClockVariation(String)
	 * @see iso20022.Iso20022Package#getMessageTransportMode_MaximumClockVariation()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getMaximumClockVariation();

	/**
	 * Sets the value of the '{@link iso20022.MessageTransportMode#getMaximumClockVariation <em>Maximum Clock Variation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Clock Variation</em>' attribute.
	 * @see #getMaximumClockVariation()
	 * @generated
	 */
	void setMaximumClockVariation(String value);

	/**
	 * Returns the value of the '<em><b>Maximum Message Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the maximum size of a TransportMessage in kilobytes (any positive integer greater than zero).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Maximum Message Size</em>' attribute.
	 * @see #setMaximumMessageSize(Integer)
	 * @see iso20022.Iso20022Package#getMessageTransportMode_MaximumMessageSize()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Integer getMaximumMessageSize();

	/**
	 * Sets the value of the '{@link iso20022.MessageTransportMode#getMaximumMessageSize <em>Maximum Message Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Message Size</em>' attribute.
	 * @see #getMaximumMessageSize()
	 * @generated
	 */
	void setMaximumMessageSize(Integer value);

	/**
	 * Returns the value of the '<em><b>Message Delivery Window</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the MessageDeliveryOrder is relaxed by a rolling window of time in which the Transport Messages may be delivered out of order whereby for each TransportMessage delivered it defines the maximum duration of time it may be out of sequence within
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message Delivery Window</em>' attribute.
	 * @see #setMessageDeliveryWindow(String)
	 * @see iso20022.Iso20022Package#getMessageTransportMode_MessageDeliveryWindow()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getMessageDeliveryWindow();

	/**
	 * Sets the value of the '{@link iso20022.MessageTransportMode#getMessageDeliveryWindow <em>Message Delivery Window</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Delivery Window</em>' attribute.
	 * @see #getMessageDeliveryWindow()
	 * @generated
	 */
	void setMessageDeliveryWindow(String value);

	/**
	 * Returns the value of the '<em><b>Message Sending Window</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the Choreography is relaxed by a rolling window of time in which the Business Messages may be sent out of order whereby for each Business Message sent it defines the maximum duration of time it may be out of sequence with
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message Sending Window</em>' attribute.
	 * @see #setMessageSendingWindow(String)
	 * @see iso20022.Iso20022Package#getMessageTransportMode_MessageSendingWindow()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getMessageSendingWindow();

	/**
	 * Sets the value of the '{@link iso20022.MessageTransportMode#getMessageSendingWindow <em>Message Sending Window</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Sending Window</em>' attribute.
	 * @see #getMessageSendingWindow()
	 * @generated
	 */
	void setMessageSendingWindow(String value);

	/**
	 * Returns the value of the '<em><b>Delivery Assurance</b></em>' attribute.
	 * The literals are from the enumeration {@link iso20022.DeliveryAssurance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the degree to which the sending MessagingEndpoint is assured that a TransportMessage will be delivered
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delivery Assurance</em>' attribute.
	 * @see iso20022.DeliveryAssurance
	 * @see #setDeliveryAssurance(DeliveryAssurance)
	 * @see iso20022.Iso20022Package#getMessageTransportMode_DeliveryAssurance()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DeliveryAssurance getDeliveryAssurance();

	/**
	 * Sets the value of the '{@link iso20022.MessageTransportMode#getDeliveryAssurance <em>Delivery Assurance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delivery Assurance</em>' attribute.
	 * @see iso20022.DeliveryAssurance
	 * @see #getDeliveryAssurance()
	 * @generated
	 */
	void setDeliveryAssurance(DeliveryAssurance value);

	/**
	 * Returns the value of the '<em><b>Durability</b></em>' attribute.
	 * The literals are from the enumeration {@link iso20022.Durability}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * whether the MessageTransportSystem safely retains a TransportMessage until it has been received by the destination MessagingEndpoint
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Durability</em>' attribute.
	 * @see iso20022.Durability
	 * @see #setDurability(Durability)
	 * @see iso20022.Iso20022Package#getMessageTransportMode_Durability()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Durability getDurability();

	/**
	 * Sets the value of the '{@link iso20022.MessageTransportMode#getDurability <em>Durability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Durability</em>' attribute.
	 * @see iso20022.Durability
	 * @see #getDurability()
	 * @generated
	 */
	void setDurability(Durability value);

	/**
	 * Returns the value of the '<em><b>Message Casting</b></em>' attribute.
	 * The literals are from the enumeration {@link iso20022.MessageCasting}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * specifies how receiving MessagingEndpoints may be addressed in a TransportMessage
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message Casting</em>' attribute.
	 * @see iso20022.MessageCasting
	 * @see #setMessageCasting(MessageCasting)
	 * @see iso20022.Iso20022Package#getMessageTransportMode_MessageCasting()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	MessageCasting getMessageCasting();

	/**
	 * Sets the value of the '{@link iso20022.MessageTransportMode#getMessageCasting <em>Message Casting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Casting</em>' attribute.
	 * @see iso20022.MessageCasting
	 * @see #getMessageCasting()
	 * @generated
	 */
	void setMessageCasting(MessageCasting value);

	/**
	 * Returns the value of the '<em><b>Message Delivery Order</b></em>' attribute.
	 * The literals are from the enumeration {@link iso20022.MessageDeliveryOrder}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * indicates to what extent Transport Messages from a sending MessagingEndpoint arrive in the order in which they were sent at the receiving MessagingEndpoints
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message Delivery Order</em>' attribute.
	 * @see iso20022.MessageDeliveryOrder
	 * @see #setMessageDeliveryOrder(MessageDeliveryOrder)
	 * @see iso20022.Iso20022Package#getMessageTransportMode_MessageDeliveryOrder()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	MessageDeliveryOrder getMessageDeliveryOrder();

	/**
	 * Sets the value of the '{@link iso20022.MessageTransportMode#getMessageDeliveryOrder <em>Message Delivery Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Delivery Order</em>' attribute.
	 * @see iso20022.MessageDeliveryOrder
	 * @see #getMessageDeliveryOrder()
	 * @generated
	 */
	void setMessageDeliveryOrder(MessageDeliveryOrder value);

	/**
	 * Returns the value of the '<em><b>Message Validation Level</b></em>' attribute.
	 * The literals are from the enumeration {@link iso20022.MessageValidationLevel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the level of validation the MessageTransportSystem has tested the message
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message Validation Level</em>' attribute.
	 * @see iso20022.MessageValidationLevel
	 * @see #setMessageValidationLevel(MessageValidationLevel)
	 * @see iso20022.Iso20022Package#getMessageTransportMode_MessageValidationLevel()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	MessageValidationLevel getMessageValidationLevel();

	/**
	 * Sets the value of the '{@link iso20022.MessageTransportMode#getMessageValidationLevel <em>Message Validation Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Validation Level</em>' attribute.
	 * @see iso20022.MessageValidationLevel
	 * @see #getMessageValidationLevel()
	 * @generated
	 */
	void setMessageValidationLevel(MessageValidationLevel value);

	/**
	 * Returns the value of the '<em><b>Message Validation On Off</b></em>' attribute.
	 * The literals are from the enumeration {@link iso20022.MessageValidationOnOff}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * specifies whether the MessageTransportSystem validates the MessageInstance with respect to SyntaxMessageScheme, Constraints, the MarketPractices, and the MessageChoreography
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message Validation On Off</em>' attribute.
	 * @see iso20022.MessageValidationOnOff
	 * @see #setMessageValidationOnOff(MessageValidationOnOff)
	 * @see iso20022.Iso20022Package#getMessageTransportMode_MessageValidationOnOff()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	MessageValidationOnOff getMessageValidationOnOff();

	/**
	 * Sets the value of the '{@link iso20022.MessageTransportMode#getMessageValidationOnOff <em>Message Validation On Off</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Validation On Off</em>' attribute.
	 * @see iso20022.MessageValidationOnOff
	 * @see #getMessageValidationOnOff()
	 * @generated
	 */
	void setMessageValidationOnOff(MessageValidationOnOff value);

	/**
	 * Returns the value of the '<em><b>Message Validation Results</b></em>' attribute.
	 * The literals are from the enumeration {@link iso20022.MessageValidationResults}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * specifies how the MessageTransport System acts upon the results of MessageValidationOnOff
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message Validation Results</em>' attribute.
	 * @see iso20022.MessageValidationResults
	 * @see #setMessageValidationResults(MessageValidationResults)
	 * @see iso20022.Iso20022Package#getMessageTransportMode_MessageValidationResults()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	MessageValidationResults getMessageValidationResults();

	/**
	 * Sets the value of the '{@link iso20022.MessageTransportMode#getMessageValidationResults <em>Message Validation Results</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Validation Results</em>' attribute.
	 * @see iso20022.MessageValidationResults
	 * @see #getMessageValidationResults()
	 * @generated
	 */
	void setMessageValidationResults(MessageValidationResults value);

	/**
	 * Returns the value of the '<em><b>Receiver Asynchronicity</b></em>' attribute.
	 * The literals are from the enumeration {@link iso20022.ReceiverAsynchronicity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * indicates whether a receiving MessagingEndpoint blocks the sending and receipt of other Transport Messages until it sends a response to this TransportMessage
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Receiver Asynchronicity</em>' attribute.
	 * @see iso20022.ReceiverAsynchronicity
	 * @see #setReceiverAsynchronicity(ReceiverAsynchronicity)
	 * @see iso20022.Iso20022Package#getMessageTransportMode_ReceiverAsynchronicity()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ReceiverAsynchronicity getReceiverAsynchronicity();

	/**
	 * Sets the value of the '{@link iso20022.MessageTransportMode#getReceiverAsynchronicity <em>Receiver Asynchronicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receiver Asynchronicity</em>' attribute.
	 * @see iso20022.ReceiverAsynchronicity
	 * @see #getReceiverAsynchronicity()
	 * @generated
	 */
	void setReceiverAsynchronicity(ReceiverAsynchronicity value);

	/**
	 * Returns the value of the '<em><b>Sender Asynchronicity</b></em>' attribute.
	 * The literals are from the enumeration {@link iso20022.SenderAsynchronicity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * indicates whether a sending MessagingEndpoint blocks after sending a TransportMessage to the MessageTransportSystem while waiting for a response from a MessagingEndpoint
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sender Asynchronicity</em>' attribute.
	 * @see iso20022.SenderAsynchronicity
	 * @see #setSenderAsynchronicity(SenderAsynchronicity)
	 * @see iso20022.Iso20022Package#getMessageTransportMode_SenderAsynchronicity()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	SenderAsynchronicity getSenderAsynchronicity();

	/**
	 * Sets the value of the '{@link iso20022.MessageTransportMode#getSenderAsynchronicity <em>Sender Asynchronicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sender Asynchronicity</em>' attribute.
	 * @see iso20022.SenderAsynchronicity
	 * @see #getSenderAsynchronicity()
	 * @generated
	 */
	void setSenderAsynchronicity(SenderAsynchronicity value);

	/**
	 * Returns the value of the '<em><b>Business Transaction</b></em>' reference list.
	 * The list contents are of type {@link iso20022.BusinessTransaction}.
	 * It is bidirectional and its opposite is '{@link iso20022.BusinessTransaction#getMessageTransportMode <em>Message Transport Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * specifies the BusinessTransaction for which a set of MessageTransportMode characteristics apply
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Business Transaction</em>' reference list.
	 * @see iso20022.Iso20022Package#getMessageTransportMode_BusinessTransaction()
	 * @see iso20022.BusinessTransaction#getMessageTransportMode
	 * @model opposite="messageTransportMode" ordered="false"
	 * @generated
	 */
	EList<BusinessTransaction> getBusinessTransaction();

} // MessageTransportMode
