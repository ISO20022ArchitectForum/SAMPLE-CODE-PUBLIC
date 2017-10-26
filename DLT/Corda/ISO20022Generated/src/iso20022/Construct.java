/**
 */
package iso20022;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Construct</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Abstract layer : Abstract meta class for representing a BusinessElement, a MessageElement or a MessageBuildingBlock.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso20022.Construct#getMemberType <em>Member Type</em>}</li>
 * </ul>
 *
 * @see iso20022.Iso20022Package#getConstruct()
 * @model abstract="true"
 *        annotation="urn:iso:std:iso:20022:2013:ecore:extension basis='IMPLEMENTATION_ENHANCEMENT' description='Abstract layer : Abstract meta class for representing a BusinessElement, a MessageElement or a MessageBuildingBlock.'"
 * @generated
 */
public interface Construct extends RepositoryConcept, MultiplicityEntity {
	/**
	 * Returns the value of the '<em><b>Member Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of this Member
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Member Type</em>' reference.
	 * @see iso20022.Iso20022Package#getConstruct_MemberType()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="urn:iso:std:iso:20022:2013:ecore:extension basis='IMPLEMENTATION_ENHANCEMENT'"
	 * @generated
	 */
	RepositoryType getMemberType();

} // Construct
