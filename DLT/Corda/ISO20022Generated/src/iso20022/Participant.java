/**
 */
package iso20022;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Participant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * involvement of a BusinessRole in a BusinessTransaction
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso20022.Participant#getBusinessTransaction <em>Business Transaction</em>}</li>
 *   <li>{@link iso20022.Participant#getReceives <em>Receives</em>}</li>
 *   <li>{@link iso20022.Participant#getSends <em>Sends</em>}</li>
 *   <li>{@link iso20022.Participant#getBusinessRoleTrace <em>Business Role Trace</em>}</li>
 * </ul>
 *
 * @see iso20022.Iso20022Package#getParticipant()
 * @model
 * @generated
 */
public interface Participant extends RepositoryConcept, MultiplicityEntity {
	/**
	 * Returns the value of the '<em><b>Business Transaction</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link iso20022.BusinessTransaction#getParticipant <em>Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the BusinessTransaction in which the Participant plays a role
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Business Transaction</em>' container reference.
	 * @see #setBusinessTransaction(BusinessTransaction)
	 * @see iso20022.Iso20022Package#getParticipant_BusinessTransaction()
	 * @see iso20022.BusinessTransaction#getParticipant
	 * @model opposite="participant" required="true" transient="false" ordered="false"
	 * @generated
	 */
	BusinessTransaction getBusinessTransaction();

	/**
	 * Sets the value of the '{@link iso20022.Participant#getBusinessTransaction <em>Business Transaction</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Business Transaction</em>' container reference.
	 * @see #getBusinessTransaction()
	 * @generated
	 */
	void setBusinessTransaction(BusinessTransaction value);

	/**
	 * Returns the value of the '<em><b>Receives</b></em>' reference list.
	 * The list contents are of type {@link iso20022.Receive}.
	 * It is bidirectional and its opposite is '{@link iso20022.Receive#getReceiver <em>Receiver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The handling of a stimulus passed from a sending participant
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Receives</em>' reference list.
	 * @see iso20022.Iso20022Package#getParticipant_Receives()
	 * @see iso20022.Receive#getReceiver
	 * @model opposite="receiver" ordered="false"
	 * @generated
	 */
	EList<Receive> getReceives();

	/**
	 * Returns the value of the '<em><b>Sends</b></em>' reference list.
	 * The list contents are of type {@link iso20022.Send}.
	 * It is bidirectional and its opposite is '{@link iso20022.Send#getSender <em>Sender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The passing of information from a sending Participant to a receiving Participant
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sends</em>' reference list.
	 * @see iso20022.Iso20022Package#getParticipant_Sends()
	 * @see iso20022.Send#getSender
	 * @model opposite="sender" ordered="false"
	 * @generated
	 */
	EList<Send> getSends();

	/**
	 * Returns the value of the '<em><b>Business Role Trace</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link iso20022.BusinessRole#getBusinessRoleTrace <em>Business Role Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the BusinessRoleTrace that traces the Participant to its BusinessRole
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Business Role Trace</em>' reference.
	 * @see #setBusinessRoleTrace(BusinessRole)
	 * @see iso20022.Iso20022Package#getParticipant_BusinessRoleTrace()
	 * @see iso20022.BusinessRole#getBusinessRoleTrace
	 * @model opposite="businessRoleTrace" required="true" ordered="false"
	 *        annotation="urn:iso:std:iso:20022:2013:ecore:extension basis='IMPLEMENTATION_ENHANCEMENT' description='Traces are represented as a direct reference to the traced-to repository concept instead of using an intermediate Trace meta class'"
	 * @generated
	 */
	BusinessRole getBusinessRoleTrace();

	/**
	 * Sets the value of the '{@link iso20022.Participant#getBusinessRoleTrace <em>Business Role Trace</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Business Role Trace</em>' reference.
	 * @see #getBusinessRoleTrace()
	 * @generated
	 */
	void setBusinessRoleTrace(BusinessRole value);

} // Participant
