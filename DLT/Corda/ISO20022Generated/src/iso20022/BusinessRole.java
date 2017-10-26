/**
 */
package iso20022;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Business Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Functional role played by a business actor in a particular BusinessProcess or BusinessTransaction.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso20022.BusinessRole#getBusinessRoleTrace <em>Business Role Trace</em>}</li>
 *   <li>{@link iso20022.BusinessRole#getBusinessProcess <em>Business Process</em>}</li>
 * </ul>
 *
 * @see iso20022.Iso20022Package#getBusinessRole()
 * @model
 * @generated
 */
public interface BusinessRole extends RepositoryConcept {
	/**
	 * Returns the value of the '<em><b>Business Role Trace</b></em>' reference list.
	 * The list contents are of type {@link iso20022.Participant}.
	 * It is bidirectional and its opposite is '{@link iso20022.Participant#getBusinessRoleTrace <em>Business Role Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the BusinessRoleTrace for a BusinessRole
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Business Role Trace</em>' reference list.
	 * @see iso20022.Iso20022Package#getBusinessRole_BusinessRoleTrace()
	 * @see iso20022.Participant#getBusinessRoleTrace
	 * @model opposite="businessRoleTrace" ordered="false"
	 *        annotation="urn:iso:std:iso:20022:2013:ecore:extension basis='IMPLEMENTATION_ENHANCEMENT' description='Traces are represented as a direct reference to the traced-to repository concept instead of using an intermediate Trace meta class'"
	 * @generated
	 */
	EList<Participant> getBusinessRoleTrace();

	/**
	 * Returns the value of the '<em><b>Business Process</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link iso20022.BusinessProcess#getBusinessRole <em>Business Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the BusinessProcess that owns the BusinessRole
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Business Process</em>' container reference.
	 * @see #setBusinessProcess(BusinessProcess)
	 * @see iso20022.Iso20022Package#getBusinessRole_BusinessProcess()
	 * @see iso20022.BusinessProcess#getBusinessRole
	 * @model opposite="businessRole" required="true" transient="false" ordered="false"
	 * @generated
	 */
	BusinessProcess getBusinessProcess();

	/**
	 * Sets the value of the '{@link iso20022.BusinessRole#getBusinessProcess <em>Business Process</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Business Process</em>' container reference.
	 * @see #getBusinessProcess()
	 * @generated
	 */
	void setBusinessProcess(BusinessProcess value);

} // BusinessRole
