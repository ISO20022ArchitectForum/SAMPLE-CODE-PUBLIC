/**
 */
package iso20022;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Send</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * the passing of a stimulus from a sender instance to a receiver instance
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso20022.Send#getSender <em>Sender</em>}</li>
 *   <li>{@link iso20022.Send#getMessageTransmission <em>Message Transmission</em>}</li>
 * </ul>
 *
 * @see iso20022.Iso20022Package#getSend()
 * @model
 * @generated
 */
public interface Send extends ModelEntity {
	/**
	 * Returns the value of the '<em><b>Sender</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link iso20022.Participant#getSends <em>Sends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The object passing a stimulus to a receiver object
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sender</em>' reference.
	 * @see #setSender(Participant)
	 * @see iso20022.Iso20022Package#getSend_Sender()
	 * @see iso20022.Participant#getSends
	 * @model opposite="sends" required="true" ordered="false"
	 * @generated
	 */
	Participant getSender();

	/**
	 * Sets the value of the '{@link iso20022.Send#getSender <em>Sender</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sender</em>' reference.
	 * @see #getSender()
	 * @generated
	 */
	void setSender(Participant value);

	/**
	 * Returns the value of the '<em><b>Message Transmission</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link iso20022.MessageTransmission#getSend <em>Send</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the stimulus handled as part of the Send
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message Transmission</em>' container reference.
	 * @see #setMessageTransmission(MessageTransmission)
	 * @see iso20022.Iso20022Package#getSend_MessageTransmission()
	 * @see iso20022.MessageTransmission#getSend
	 * @model opposite="send" required="true" transient="false" ordered="false"
	 * @generated
	 */
	MessageTransmission getMessageTransmission();

	/**
	 * Sets the value of the '{@link iso20022.Send#getMessageTransmission <em>Message Transmission</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Transmission</em>' container reference.
	 * @see #getMessageTransmission()
	 * @generated
	 */
	void setMessageTransmission(MessageTransmission value);

} // Send
