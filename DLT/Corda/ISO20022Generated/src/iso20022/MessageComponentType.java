/**
 */
package iso20022;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Component Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * MessageComponent, ExternalSchema, UserDefined or ChoiceComponent
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso20022.MessageComponentType#getMessageBuildingBlock <em>Message Building Block</em>}</li>
 *   <li>{@link iso20022.MessageComponentType#isIsTechnical <em>Is Technical</em>}</li>
 *   <li>{@link iso20022.MessageComponentType#getTrace <em>Trace</em>}</li>
 * </ul>
 *
 * @see iso20022.Iso20022Package#getMessageComponentType()
 * @model abstract="true"
 *        annotation="urn:iso:std:iso:20022:2013:ecore:extension basis='IMPLEMENTATION_ENHANCEMENT' description='The property element is moved from MessageComponentType to the new abstract Meta Class MessageElementContainer so that only such MessageElementContainer may own MessageElements. This MessageElementContainer class is the super class of MessageComponent and ChoiceComponent. As such, it is constrained directly in the MOF MetaClass structure that an ExternalSchema may not contain MessageElement; instead of constraining this with an OCL rule.'"
 * @generated
 */
public interface MessageComponentType extends TopLevelDictionaryEntry, LogicalType, MessageConcept {
	/**
	 * Returns the value of the '<em><b>Message Building Block</b></em>' reference list.
	 * The list contents are of type {@link iso20022.MessageBuildingBlock}.
	 * It is bidirectional and its opposite is '{@link iso20022.MessageBuildingBlock#getComplexType <em>Complex Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The MessageBuildingBlock that is the context for this MessageComponentType
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message Building Block</em>' reference list.
	 * @see iso20022.Iso20022Package#getMessageComponentType_MessageBuildingBlock()
	 * @see iso20022.MessageBuildingBlock#getComplexType
	 * @model opposite="complexType" ordered="false"
	 * @generated
	 */
	EList<MessageBuildingBlock> getMessageBuildingBlock();

	/**
	 * Returns the value of the '<em><b>Is Technical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A property indicating the absense of a semantic relationship to a BusinessComponent, i.e. it is not derived from a BusinessComponent
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Technical</em>' attribute.
	 * @see iso20022.Iso20022Package#getMessageComponentType_IsTechnical()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	boolean isIsTechnical();

	/**
	 * Returns the value of the '<em><b>Trace</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link iso20022.BusinessComponent#getDerivationComponent <em>Derivation Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The BusinessComponent that this MessageComponentType is derived from.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trace</em>' reference.
	 * @see #setTrace(BusinessComponent)
	 * @see iso20022.Iso20022Package#getMessageComponentType_Trace()
	 * @see iso20022.BusinessComponent#getDerivationComponent
	 * @model opposite="derivationComponent" ordered="false"
	 *        annotation="urn:iso:std:iso:20022:2013:ecore:extension basis='IMPLEMENTATION_ENHANCEMENT' description='Traces are represented as a direct reference to the traced-to repository concept instead of using an intermediate Trace meta class'"
	 * @generated
	 */
	BusinessComponent getTrace();

	/**
	 * Sets the value of the '{@link iso20022.MessageComponentType#getTrace <em>Trace</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trace</em>' reference.
	 * @see #getTrace()
	 * @generated
	 */
	void setTrace(BusinessComponent value);

} // MessageComponentType
