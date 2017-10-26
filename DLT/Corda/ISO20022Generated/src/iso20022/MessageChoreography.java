/**
 */
package iso20022;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Choreography</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * precise and complete description of a MessageInstance exchange within a BusinessTransaction, describing the sequence and correlation of MessageInstances within a conversation, including the constraints on the interaction between Participants
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso20022.MessageChoreography#getBusinessTransactionTrace <em>Business Transaction Trace</em>}</li>
 *   <li>{@link iso20022.MessageChoreography#getMessageDefinition <em>Message Definition</em>}</li>
 * </ul>
 *
 * @see iso20022.Iso20022Package#getMessageChoreography()
 * @model
 * @generated
 */
public interface MessageChoreography extends TopLevelCatalogueEntry {
	/**
	 * Returns the value of the '<em><b>Business Transaction Trace</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link iso20022.BusinessTransaction#getTrace <em>Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the BusinessTransactionTrace from the MessageChoreography to the BusinessTransaction
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Business Transaction Trace</em>' reference.
	 * @see #setBusinessTransactionTrace(BusinessTransaction)
	 * @see iso20022.Iso20022Package#getMessageChoreography_BusinessTransactionTrace()
	 * @see iso20022.BusinessTransaction#getTrace
	 * @model opposite="trace" ordered="false"
	 *        annotation="urn:iso:std:iso:20022:2013:ecore:extension basis='IMPLEMENTATION_ENHANCEMENT' description='Traces are represented as a direct reference to the traced-to repository concept instead of using an intermediate Trace meta class'"
	 * @generated
	 */
	BusinessTransaction getBusinessTransactionTrace();

	/**
	 * Sets the value of the '{@link iso20022.MessageChoreography#getBusinessTransactionTrace <em>Business Transaction Trace</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Business Transaction Trace</em>' reference.
	 * @see #getBusinessTransactionTrace()
	 * @generated
	 */
	void setBusinessTransactionTrace(BusinessTransaction value);

	/**
	 * Returns the value of the '<em><b>Message Definition</b></em>' reference list.
	 * The list contents are of type {@link iso20022.MessageDefinition}.
	 * It is bidirectional and its opposite is '{@link iso20022.MessageDefinition#getChoreography <em>Choreography</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The MessageDefinition that is used in a MessageChoreography.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message Definition</em>' reference list.
	 * @see iso20022.Iso20022Package#getMessageChoreography_MessageDefinition()
	 * @see iso20022.MessageDefinition#getChoreography
	 * @model opposite="choreography" required="true" ordered="false"
	 * @generated
	 */
	EList<MessageDefinition> getMessageDefinition();

} // MessageChoreography
