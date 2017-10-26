/**
 */
package iso20022;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Business Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * unrealized definition of the business activities undertaken by BusinessRoles within a BusinessArea whereby each BusinessProcess fulfils one type of business activity and whereby a BusinessProcess may include and extend other BusinessProcesses
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso20022.BusinessProcess#getExtender <em>Extender</em>}</li>
 *   <li>{@link iso20022.BusinessProcess#getExtended <em>Extended</em>}</li>
 *   <li>{@link iso20022.BusinessProcess#getIncluded <em>Included</em>}</li>
 *   <li>{@link iso20022.BusinessProcess#getIncluder <em>Includer</em>}</li>
 *   <li>{@link iso20022.BusinessProcess#getBusinessRole <em>Business Role</em>}</li>
 *   <li>{@link iso20022.BusinessProcess#getBusinessProcessTrace <em>Business Process Trace</em>}</li>
 * </ul>
 *
 * @see iso20022.Iso20022Package#getBusinessProcess()
 * @model
 * @generated
 */
public interface BusinessProcess extends TopLevelCatalogueEntry {
	/**
	 * Returns the value of the '<em><b>Extender</b></em>' reference list.
	 * The list contents are of type {@link iso20022.BusinessProcess}.
	 * It is bidirectional and its opposite is '{@link iso20022.BusinessProcess#getExtended <em>Extended</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * specifies the BusinessProcess that is extending another BusinessProcess
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extender</em>' reference list.
	 * @see iso20022.Iso20022Package#getBusinessProcess_Extender()
	 * @see iso20022.BusinessProcess#getExtended
	 * @model opposite="extended" ordered="false"
	 * @generated
	 */
	EList<BusinessProcess> getExtender();

	/**
	 * Returns the value of the '<em><b>Extended</b></em>' reference list.
	 * The list contents are of type {@link iso20022.BusinessProcess}.
	 * It is bidirectional and its opposite is '{@link iso20022.BusinessProcess#getExtender <em>Extender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * specifies the BusinessProcess that is extended by another BusinessProcess
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extended</em>' reference list.
	 * @see iso20022.Iso20022Package#getBusinessProcess_Extended()
	 * @see iso20022.BusinessProcess#getExtender
	 * @model opposite="extender" ordered="false"
	 * @generated
	 */
	EList<BusinessProcess> getExtended();

	/**
	 * Returns the value of the '<em><b>Included</b></em>' reference list.
	 * The list contents are of type {@link iso20022.BusinessProcess}.
	 * It is bidirectional and its opposite is '{@link iso20022.BusinessProcess#getIncluder <em>Includer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * specifies the BusinessProcess that is included by another BusinessProcess
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Included</em>' reference list.
	 * @see iso20022.Iso20022Package#getBusinessProcess_Included()
	 * @see iso20022.BusinessProcess#getIncluder
	 * @model opposite="includer" ordered="false"
	 * @generated
	 */
	EList<BusinessProcess> getIncluded();

	/**
	 * Returns the value of the '<em><b>Includer</b></em>' reference list.
	 * The list contents are of type {@link iso20022.BusinessProcess}.
	 * It is bidirectional and its opposite is '{@link iso20022.BusinessProcess#getIncluded <em>Included</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * specifies the BusinessProcess that is incuding another BusinessProcess
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Includer</em>' reference list.
	 * @see iso20022.Iso20022Package#getBusinessProcess_Includer()
	 * @see iso20022.BusinessProcess#getIncluded
	 * @model opposite="included" ordered="false"
	 * @generated
	 */
	EList<BusinessProcess> getIncluder();

	/**
	 * Returns the value of the '<em><b>Business Role</b></em>' containment reference list.
	 * The list contents are of type {@link iso20022.BusinessRole}.
	 * It is bidirectional and its opposite is '{@link iso20022.BusinessRole#getBusinessProcess <em>Business Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the BusinessRole that plays a role in BusinessProcess that owns it.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Business Role</em>' containment reference list.
	 * @see iso20022.Iso20022Package#getBusinessProcess_BusinessRole()
	 * @see iso20022.BusinessRole#getBusinessProcess
	 * @model opposite="businessProcess" containment="true" ordered="false"
	 * @generated
	 */
	EList<BusinessRole> getBusinessRole();

	/**
	 * Returns the value of the '<em><b>Business Process Trace</b></em>' reference list.
	 * The list contents are of type {@link iso20022.BusinessTransaction}.
	 * It is bidirectional and its opposite is '{@link iso20022.BusinessTransaction#getBusinessProcessTrace <em>Business Process Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Business Process Trace</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Business Process Trace</em>' reference list.
	 * @see iso20022.Iso20022Package#getBusinessProcess_BusinessProcessTrace()
	 * @see iso20022.BusinessTransaction#getBusinessProcessTrace
	 * @model opposite="businessProcessTrace" ordered="false"
	 *        annotation="urn:iso:std:iso:20022:2013:ecore:extension basis='IMPLEMENTATION_ENHANCEMENT' description='Traces are represented as a direct reference to the traced-to repository concept instead of using an intermediate Trace meta class'"
	 * @generated
	 */
	EList<BusinessTransaction> getBusinessProcessTrace();

} // BusinessProcess
