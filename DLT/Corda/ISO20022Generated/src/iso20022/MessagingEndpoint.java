/**
 */
package iso20022;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Messaging Endpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * addressable node on the MessageTransportSystem which is capable of sending and receiving TransportMessages
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso20022.MessagingEndpoint#getTransportSystem <em>Transport System</em>}</li>
 *   <li>{@link iso20022.MessagingEndpoint#getReceivedMessage <em>Received Message</em>}</li>
 *   <li>{@link iso20022.MessagingEndpoint#getSentMessage <em>Sent Message</em>}</li>
 *   <li>{@link iso20022.MessagingEndpoint#getLocation <em>Location</em>}</li>
 * </ul>
 *
 * @see iso20022.Iso20022Package#getMessagingEndpoint()
 * @model
 * @generated
 */
public interface MessagingEndpoint extends ModelEntity {
	/**
	 * Returns the value of the '<em><b>Transport System</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link iso20022.MessageTransportSystem#getEndpoint <em>Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the MessageTransportSystem that owns and uses this MessagingEndpoint
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transport System</em>' container reference.
	 * @see #setTransportSystem(MessageTransportSystem)
	 * @see iso20022.Iso20022Package#getMessagingEndpoint_TransportSystem()
	 * @see iso20022.MessageTransportSystem#getEndpoint
	 * @model opposite="endpoint" required="true" transient="false" ordered="false"
	 * @generated
	 */
	MessageTransportSystem getTransportSystem();

	/**
	 * Sets the value of the '{@link iso20022.MessagingEndpoint#getTransportSystem <em>Transport System</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transport System</em>' container reference.
	 * @see #getTransportSystem()
	 * @generated
	 */
	void setTransportSystem(MessageTransportSystem value);

	/**
	 * Returns the value of the '<em><b>Received Message</b></em>' reference list.
	 * The list contents are of type {@link iso20022.TransportMessage}.
	 * It is bidirectional and its opposite is '{@link iso20022.TransportMessage#getReceiver <em>Receiver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the TransportMessage that is received by the receiving MessagingEndpoint
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Received Message</em>' reference list.
	 * @see iso20022.Iso20022Package#getMessagingEndpoint_ReceivedMessage()
	 * @see iso20022.TransportMessage#getReceiver
	 * @model opposite="receiver" ordered="false"
	 * @generated
	 */
	EList<TransportMessage> getReceivedMessage();

	/**
	 * Returns the value of the '<em><b>Sent Message</b></em>' reference list.
	 * The list contents are of type {@link iso20022.TransportMessage}.
	 * It is bidirectional and its opposite is '{@link iso20022.TransportMessage#getSender <em>Sender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the TransportMessage that is sent by the sending MessagingEndpoint
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sent Message</em>' reference list.
	 * @see iso20022.Iso20022Package#getMessagingEndpoint_SentMessage()
	 * @see iso20022.TransportMessage#getSender
	 * @model opposite="sender" ordered="false"
	 * @generated
	 */
	EList<TransportMessage> getSentMessage();

	/**
	 * Returns the value of the '<em><b>Location</b></em>' reference list.
	 * The list contents are of type {@link iso20022.Address}.
	 * It is bidirectional and its opposite is '{@link iso20022.Address#getEndpoint <em>Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * an Address used to identify the MessagingEndpoint
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location</em>' reference list.
	 * @see iso20022.Iso20022Package#getMessagingEndpoint_Location()
	 * @see iso20022.Address#getEndpoint
	 * @model opposite="endpoint" ordered="false"
	 * @generated
	 */
	EList<Address> getLocation();

} // MessagingEndpoint
