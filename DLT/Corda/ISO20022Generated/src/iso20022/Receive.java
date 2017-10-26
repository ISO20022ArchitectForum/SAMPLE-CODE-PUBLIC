/**
 */
package iso20022;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Receive</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * the handling of a stimulus passed from a sender instance
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso20022.Receive#getMessageTransmission <em>Message Transmission</em>}</li>
 *   <li>{@link iso20022.Receive#getReceiver <em>Receiver</em>}</li>
 * </ul>
 *
 * @see iso20022.Iso20022Package#getReceive()
 * @model
 * @generated
 */
public interface Receive extends ModelEntity {
	/**
	 * Returns the value of the '<em><b>Message Transmission</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link iso20022.MessageTransmission#getReceive <em>Receive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the stimulus handled as part of the Receive
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message Transmission</em>' container reference.
	 * @see #setMessageTransmission(MessageTransmission)
	 * @see iso20022.Iso20022Package#getReceive_MessageTransmission()
	 * @see iso20022.MessageTransmission#getReceive
	 * @model opposite="receive" required="true" transient="false" ordered="false"
	 * @generated
	 */
	MessageTransmission getMessageTransmission();

	/**
	 * Sets the value of the '{@link iso20022.Receive#getMessageTransmission <em>Message Transmission</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Transmission</em>' container reference.
	 * @see #getMessageTransmission()
	 * @generated
	 */
	void setMessageTransmission(MessageTransmission value);

	/**
	 * Returns the value of the '<em><b>Receiver</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link iso20022.Participant#getReceives <em>Receives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the object handling a stimulus passed from the sender
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Receiver</em>' reference.
	 * @see #setReceiver(Participant)
	 * @see iso20022.Iso20022Package#getReceive_Receiver()
	 * @see iso20022.Participant#getReceives
	 * @model opposite="receives" required="true" ordered="false"
	 * @generated
	 */
	Participant getReceiver();

	/**
	 * Sets the value of the '{@link iso20022.Receive#getReceiver <em>Receiver</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receiver</em>' reference.
	 * @see #getReceiver()
	 * @generated
	 */
	void setReceiver(Participant value);

} // Receive
