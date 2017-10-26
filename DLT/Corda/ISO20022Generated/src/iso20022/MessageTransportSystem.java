/**
 */
package iso20022;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Transport System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * mechanism that receives Transport Messages from the sending MessagingEndpoint, transports them, and delivers them to the receiving MessagingEndpoint
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso20022.MessageTransportSystem#getEndpoint <em>Endpoint</em>}</li>
 * </ul>
 *
 * @see iso20022.Iso20022Package#getMessageTransportSystem()
 * @model
 * @generated
 */
public interface MessageTransportSystem extends ModelEntity {
	/**
	 * Returns the value of the '<em><b>Endpoint</b></em>' containment reference list.
	 * The list contents are of type {@link iso20022.MessagingEndpoint}.
	 * It is bidirectional and its opposite is '{@link iso20022.MessagingEndpoint#getTransportSystem <em>Transport System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * a MessagingEndpoint owned by a single MessageTransportSystem
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Endpoint</em>' containment reference list.
	 * @see iso20022.Iso20022Package#getMessageTransportSystem_Endpoint()
	 * @see iso20022.MessagingEndpoint#getTransportSystem
	 * @model opposite="transportSystem" containment="true" ordered="false"
	 * @generated
	 */
	EList<MessagingEndpoint> getEndpoint();

} // MessageTransportSystem
