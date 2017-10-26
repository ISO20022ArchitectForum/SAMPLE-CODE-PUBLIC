/**
 */
package iso20022;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transport Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * document that is an instance of the MessageTransportSystem message schema
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso20022.TransportMessage#getSender <em>Sender</em>}</li>
 *   <li>{@link iso20022.TransportMessage#getMessageInstance <em>Message Instance</em>}</li>
 *   <li>{@link iso20022.TransportMessage#getReceiver <em>Receiver</em>}</li>
 * </ul>
 *
 * @see iso20022.Iso20022Package#getTransportMessage()
 * @model
 * @generated
 */
public interface TransportMessage extends ModelEntity {
	/**
	 * Returns the value of the '<em><b>Sender</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link iso20022.MessagingEndpoint#getSentMessage <em>Sent Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the sending MessagingEndpoint of a TransportMessage
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sender</em>' reference.
	 * @see #setSender(MessagingEndpoint)
	 * @see iso20022.Iso20022Package#getTransportMessage_Sender()
	 * @see iso20022.MessagingEndpoint#getSentMessage
	 * @model opposite="sentMessage" required="true" ordered="false"
	 * @generated
	 */
	MessagingEndpoint getSender();

	/**
	 * Sets the value of the '{@link iso20022.TransportMessage#getSender <em>Sender</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sender</em>' reference.
	 * @see #getSender()
	 * @generated
	 */
	void setSender(MessagingEndpoint value);

	/**
	 * Returns the value of the '<em><b>Message Instance</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link iso20022.MessageInstance#getTransportMessage <em>Transport Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the MessageInstance that is part of the TransportMessage
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message Instance</em>' reference.
	 * @see #setMessageInstance(MessageInstance)
	 * @see iso20022.Iso20022Package#getTransportMessage_MessageInstance()
	 * @see iso20022.MessageInstance#getTransportMessage
	 * @model opposite="transportMessage" required="true" ordered="false"
	 * @generated
	 */
	MessageInstance getMessageInstance();

	/**
	 * Sets the value of the '{@link iso20022.TransportMessage#getMessageInstance <em>Message Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Instance</em>' reference.
	 * @see #getMessageInstance()
	 * @generated
	 */
	void setMessageInstance(MessageInstance value);

	/**
	 * Returns the value of the '<em><b>Receiver</b></em>' reference list.
	 * The list contents are of type {@link iso20022.MessagingEndpoint}.
	 * It is bidirectional and its opposite is '{@link iso20022.MessagingEndpoint#getReceivedMessage <em>Received Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the receiving MessagingEndpoint in a TransportMessage
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Receiver</em>' reference list.
	 * @see iso20022.Iso20022Package#getTransportMessage_Receiver()
	 * @see iso20022.MessagingEndpoint#getReceivedMessage
	 * @model opposite="receivedMessage" ordered="false"
	 * @generated
	 */
	EList<MessagingEndpoint> getReceiver();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The sender and receiver of a TransportMessage must use the same MessageTransportSystem
	 * receiver->asBag().transportSystem = sender.transportSystem->asBag()
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" contextRequired="true" contextOrdered="false" diagnosticsRequired="true" diagnosticsOrdered="false"
	 * @generated
	 */
	boolean sameMessageTransportSystem(Map context, DiagnosticChain diagnostics);

} // TransportMessage
