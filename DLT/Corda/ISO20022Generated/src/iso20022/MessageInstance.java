/**
 */
package iso20022;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * instance of MessageDefinition, containing a set of structured information exchanged between BusinessRoles, in the scope of a BusinessTransaction
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso20022.MessageInstance#getSpecification <em>Specification</em>}</li>
 *   <li>{@link iso20022.MessageInstance#getTransportMessage <em>Transport Message</em>}</li>
 * </ul>
 *
 * @see iso20022.Iso20022Package#getMessageInstance()
 * @model
 * @generated
 */
public interface MessageInstance extends ModelEntity {
	/**
	 * Returns the value of the '<em><b>Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the SyntaxScheme instantiated by this MessageInstance
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Specification</em>' reference.
	 * @see #setSpecification(SyntaxMessageScheme)
	 * @see iso20022.Iso20022Package#getMessageInstance_Specification()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	SyntaxMessageScheme getSpecification();

	/**
	 * Sets the value of the '{@link iso20022.MessageInstance#getSpecification <em>Specification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specification</em>' reference.
	 * @see #getSpecification()
	 * @generated
	 */
	void setSpecification(SyntaxMessageScheme value);

	/**
	 * Returns the value of the '<em><b>Transport Message</b></em>' reference list.
	 * The list contents are of type {@link iso20022.TransportMessage}.
	 * It is bidirectional and its opposite is '{@link iso20022.TransportMessage#getMessageInstance <em>Message Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the TransportMessage that contains the MessageInstance
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transport Message</em>' reference list.
	 * @see iso20022.Iso20022Package#getMessageInstance_TransportMessage()
	 * @see iso20022.TransportMessage#getMessageInstance
	 * @model opposite="messageInstance" required="true" ordered="false"
	 * @generated
	 */
	EList<TransportMessage> getTransportMessage();

} // MessageInstance
