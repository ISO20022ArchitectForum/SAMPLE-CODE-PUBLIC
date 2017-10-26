/**
 */
package iso20022;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Business Transaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * particular solution that meets the communication requirements and the interaction requirements of a particular BusinessProcess and BusinessArea
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso20022.BusinessTransaction#getBusinessProcessTrace <em>Business Process Trace</em>}</li>
 *   <li>{@link iso20022.BusinessTransaction#getParticipant <em>Participant</em>}</li>
 *   <li>{@link iso20022.BusinessTransaction#getTransmission <em>Transmission</em>}</li>
 *   <li>{@link iso20022.BusinessTransaction#getMessageTransportMode <em>Message Transport Mode</em>}</li>
 *   <li>{@link iso20022.BusinessTransaction#getSubTransaction <em>Sub Transaction</em>}</li>
 *   <li>{@link iso20022.BusinessTransaction#getParentTransaction <em>Parent Transaction</em>}</li>
 *   <li>{@link iso20022.BusinessTransaction#getTrace <em>Trace</em>}</li>
 * </ul>
 *
 * @see iso20022.Iso20022Package#getBusinessTransaction()
 * @model
 * @generated
 */
public interface BusinessTransaction extends TopLevelCatalogueEntry {
	/**
	 * Returns the value of the '<em><b>Business Process Trace</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link iso20022.BusinessProcess#getBusinessProcessTrace <em>Business Process Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the BusinessProcessTrace that is used to trace the BusinessTransaction
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Business Process Trace</em>' reference.
	 * @see #setBusinessProcessTrace(BusinessProcess)
	 * @see iso20022.Iso20022Package#getBusinessTransaction_BusinessProcessTrace()
	 * @see iso20022.BusinessProcess#getBusinessProcessTrace
	 * @model opposite="businessProcessTrace" required="true" ordered="false"
	 *        annotation="urn:iso:std:iso:20022:2013:ecore:extension basis='IMPLEMENTATION_ENHANCEMENT' description='Traces are represented as a direct reference to the traced-to repository concept instead of using an intermediate Trace meta class'"
	 * @generated
	 */
	BusinessProcess getBusinessProcessTrace();

	/**
	 * Sets the value of the '{@link iso20022.BusinessTransaction#getBusinessProcessTrace <em>Business Process Trace</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Business Process Trace</em>' reference.
	 * @see #getBusinessProcessTrace()
	 * @generated
	 */
	void setBusinessProcessTrace(BusinessProcess value);

	/**
	 * Returns the value of the '<em><b>Participant</b></em>' containment reference list.
	 * The list contents are of type {@link iso20022.Participant}.
	 * It is bidirectional and its opposite is '{@link iso20022.Participant#getBusinessTransaction <em>Business Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the involvement of a BusinessRole in a BusinessTransaction
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Participant</em>' containment reference list.
	 * @see iso20022.Iso20022Package#getBusinessTransaction_Participant()
	 * @see iso20022.Participant#getBusinessTransaction
	 * @model opposite="businessTransaction" containment="true" ordered="false"
	 * @generated
	 */
	EList<Participant> getParticipant();

	/**
	 * Returns the value of the '<em><b>Transmission</b></em>' containment reference list.
	 * The list contents are of type {@link iso20022.MessageTransmission}.
	 * It is bidirectional and its opposite is '{@link iso20022.MessageTransmission#getBusinessTransaction <em>Business Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * he conveyance of information from a sending Participant in the context of a BusinessTransaction
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transmission</em>' containment reference list.
	 * @see iso20022.Iso20022Package#getBusinessTransaction_Transmission()
	 * @see iso20022.MessageTransmission#getBusinessTransaction
	 * @model opposite="businessTransaction" containment="true"
	 * @generated
	 */
	EList<MessageTransmission> getTransmission();

	/**
	 * Returns the value of the '<em><b>Message Transport Mode</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link iso20022.MessageTransportMode#getBusinessTransaction <em>Business Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Provides a set of characterstics for a MessageTransportMode to have in the context of a single BusinessTransaction
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message Transport Mode</em>' reference.
	 * @see #setMessageTransportMode(MessageTransportMode)
	 * @see iso20022.Iso20022Package#getBusinessTransaction_MessageTransportMode()
	 * @see iso20022.MessageTransportMode#getBusinessTransaction
	 * @model opposite="businessTransaction" required="true" ordered="false"
	 * @generated
	 */
	MessageTransportMode getMessageTransportMode();

	/**
	 * Sets the value of the '{@link iso20022.BusinessTransaction#getMessageTransportMode <em>Message Transport Mode</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Transport Mode</em>' reference.
	 * @see #getMessageTransportMode()
	 * @generated
	 */
	void setMessageTransportMode(MessageTransportMode value);

	/**
	 * Returns the value of the '<em><b>Sub Transaction</b></em>' reference list.
	 * The list contents are of type {@link iso20022.BusinessTransaction}.
	 * It is bidirectional and its opposite is '{@link iso20022.BusinessTransaction#getParentTransaction <em>Parent Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * decomposition of a BusinessTransaction into a number of sub transactions which are BusinessTransactions in their own right.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sub Transaction</em>' reference list.
	 * @see iso20022.Iso20022Package#getBusinessTransaction_SubTransaction()
	 * @see iso20022.BusinessTransaction#getParentTransaction
	 * @model opposite="parentTransaction" ordered="false"
	 * @generated
	 */
	EList<BusinessTransaction> getSubTransaction();

	/**
	 * Returns the value of the '<em><b>Parent Transaction</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link iso20022.BusinessTransaction#getSubTransaction <em>Sub Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * assembly of a number of BusinessTransactions that together form a BusinessTransaction
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parent Transaction</em>' reference.
	 * @see #setParentTransaction(BusinessTransaction)
	 * @see iso20022.Iso20022Package#getBusinessTransaction_ParentTransaction()
	 * @see iso20022.BusinessTransaction#getSubTransaction
	 * @model opposite="subTransaction" ordered="false"
	 * @generated
	 */
	BusinessTransaction getParentTransaction();

	/**
	 * Sets the value of the '{@link iso20022.BusinessTransaction#getParentTransaction <em>Parent Transaction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Transaction</em>' reference.
	 * @see #getParentTransaction()
	 * @generated
	 */
	void setParentTransaction(BusinessTransaction value);

	/**
	 * Returns the value of the '<em><b>Trace</b></em>' reference list.
	 * The list contents are of type {@link iso20022.MessageChoreography}.
	 * It is bidirectional and its opposite is '{@link iso20022.MessageChoreography#getBusinessTransactionTrace <em>Business Transaction Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * all of the BusinessTransactionTraces that derive MessageChoreographies from one BusinessTransaction
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trace</em>' reference list.
	 * @see iso20022.Iso20022Package#getBusinessTransaction_Trace()
	 * @see iso20022.MessageChoreography#getBusinessTransactionTrace
	 * @model opposite="businessTransactionTrace" ordered="false"
	 *        annotation="urn:iso:std:iso:20022:2013:ecore:extension basis='IMPLEMENTATION_ENHANCEMENT' description='Traces are represented as a direct reference to the traced-to repository concept instead of using an intermediate Trace meta class'"
	 * @generated
	 */
	EList<MessageChoreography> getTrace();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All MessageTransmissions contained in this BusinessTransaction shall have different names.
	 * transmission->forAll(msg1,msg2 | msg1 <> msg2 implies msg1.name <> msg2.name)
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" contextRequired="true" contextOrdered="false" diagnosticsRequired="true" diagnosticsOrdered="false"
	 * @generated
	 */
	boolean MessageTransmissionsHaveUniqueNames(Map context, DiagnosticChain diagnostics);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All Participants of this BusinessTransaction shall have different names.
	 * participant->forAll(p1,p2 | p1 <> p2 implies p1.name <> p2.name)
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" contextRequired="true" contextOrdered="false" diagnosticsRequired="true" diagnosticsOrdered="false"
	 * @generated
	 */
	boolean ParticipantsHaveUniqueNames(Map context, DiagnosticChain diagnostics);

} // BusinessTransaction
