/**
 */
package iso20022;

import java.lang.String;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Transmission</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * the passing of information from one Participant to another in the context of a BusinessTransaction
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso20022.MessageTransmission#getBusinessTransaction <em>Business Transaction</em>}</li>
 *   <li>{@link iso20022.MessageTransmission#getDerivation <em>Derivation</em>}</li>
 *   <li>{@link iso20022.MessageTransmission#getMessageTypeDescription <em>Message Type Description</em>}</li>
 *   <li>{@link iso20022.MessageTransmission#getSend <em>Send</em>}</li>
 *   <li>{@link iso20022.MessageTransmission#getReceive <em>Receive</em>}</li>
 * </ul>
 *
 * @see iso20022.Iso20022Package#getMessageTransmission()
 * @model
 * @generated
 */
public interface MessageTransmission extends RepositoryConcept {
	/**
	 * Returns the value of the '<em><b>Business Transaction</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link iso20022.BusinessTransaction#getTransmission <em>Transmission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the BusinessTransaction to which the MessageTransmission belongs
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Business Transaction</em>' container reference.
	 * @see #setBusinessTransaction(BusinessTransaction)
	 * @see iso20022.Iso20022Package#getMessageTransmission_BusinessTransaction()
	 * @see iso20022.BusinessTransaction#getTransmission
	 * @model opposite="transmission" required="true" transient="false" ordered="false"
	 * @generated
	 */
	BusinessTransaction getBusinessTransaction();

	/**
	 * Sets the value of the '{@link iso20022.MessageTransmission#getBusinessTransaction <em>Business Transaction</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Business Transaction</em>' container reference.
	 * @see #getBusinessTransaction()
	 * @generated
	 */
	void setBusinessTransaction(BusinessTransaction value);

	/**
	 * Returns the value of the '<em><b>Derivation</b></em>' reference list.
	 * The list contents are of type {@link iso20022.MessageDefinition}.
	 * It is bidirectional and its opposite is '{@link iso20022.MessageDefinition#getTrace <em>Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * all of the MessagetypeTraces that derive MessageDefinitions from one MessageTransmission
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Derivation</em>' reference list.
	 * @see iso20022.Iso20022Package#getMessageTransmission_Derivation()
	 * @see iso20022.MessageDefinition#getTrace
	 * @model opposite="trace" ordered="false"
	 *        annotation="urn:iso:std:iso:20022:2013:ecore:extension basis='IMPLEMENTATION_ENHANCEMENT' description='Traces are represented as a direct reference to the traced-to repository concept instead of using an intermediate Trace meta class'"
	 * @generated
	 */
	EList<MessageDefinition> getDerivation();

	/**
	 * Returns the value of the '<em><b>Message Type Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the purpose and scope of the MessageTransmission in the BusinessTransaction
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message Type Description</em>' attribute.
	 * @see #setMessageTypeDescription(String)
	 * @see iso20022.Iso20022Package#getMessageTransmission_MessageTypeDescription()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getMessageTypeDescription();

	/**
	 * Sets the value of the '{@link iso20022.MessageTransmission#getMessageTypeDescription <em>Message Type Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Type Description</em>' attribute.
	 * @see #getMessageTypeDescription()
	 * @generated
	 */
	void setMessageTypeDescription(String value);

	/**
	 * Returns the value of the '<em><b>Send</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link iso20022.Send#getMessageTransmission <em>Message Transmission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the passing of a MessagTransmission from a sender instance to a receiver instance
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Send</em>' containment reference.
	 * @see #setSend(Send)
	 * @see iso20022.Iso20022Package#getMessageTransmission_Send()
	 * @see iso20022.Send#getMessageTransmission
	 * @model opposite="messageTransmission" containment="true" required="true" ordered="false"
	 * @generated
	 */
	Send getSend();

	/**
	 * Sets the value of the '{@link iso20022.MessageTransmission#getSend <em>Send</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Send</em>' containment reference.
	 * @see #getSend()
	 * @generated
	 */
	void setSend(Send value);

	/**
	 * Returns the value of the '<em><b>Receive</b></em>' containment reference list.
	 * The list contents are of type {@link iso20022.Receive}.
	 * It is bidirectional and its opposite is '{@link iso20022.Receive#getMessageTransmission <em>Message Transmission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the handling of a MessageTransmission passed from a sender instance
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Receive</em>' containment reference list.
	 * @see iso20022.Iso20022Package#getMessageTransmission_Receive()
	 * @see iso20022.Receive#getMessageTransmission
	 * @model opposite="messageTransmission" containment="true" ordered="false"
	 * @generated
	 */
	EList<Receive> getReceive();

} // MessageTransmission
