/**
 */
package iso20022;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Building Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Characteristic of a MessageDefinition, having a unique meaning within the scope of that MessageDefinition.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso20022.MessageBuildingBlock#getSimpleType <em>Simple Type</em>}</li>
 *   <li>{@link iso20022.MessageBuildingBlock#getComplexType <em>Complex Type</em>}</li>
 * </ul>
 *
 * @see iso20022.Iso20022Package#getMessageBuildingBlock()
 * @model
 * @generated
 */
public interface MessageBuildingBlock extends MessageConstruct {
	/**
	 * Returns the value of the '<em><b>Simple Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The simple content model of a MessageBuildingBlock when it is expressed using a DataType
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Simple Type</em>' reference.
	 * @see #setSimpleType(DataType)
	 * @see iso20022.Iso20022Package#getMessageBuildingBlock_SimpleType()
	 * @model ordered="false"
	 * @generated
	 */
	DataType getSimpleType();

	/**
	 * Sets the value of the '{@link iso20022.MessageBuildingBlock#getSimpleType <em>Simple Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simple Type</em>' reference.
	 * @see #getSimpleType()
	 * @generated
	 */
	void setSimpleType(DataType value);

	/**
	 * Returns the value of the '<em><b>Complex Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link iso20022.MessageComponentType#getMessageBuildingBlock <em>Message Building Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the complex content model of a MessageBuildingBlock when it is expressed using a MessageComponentType
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Complex Type</em>' reference.
	 * @see #setComplexType(MessageComponentType)
	 * @see iso20022.Iso20022Package#getMessageBuildingBlock_ComplexType()
	 * @see iso20022.MessageComponentType#getMessageBuildingBlock
	 * @model opposite="messageBuildingBlock" ordered="false"
	 * @generated
	 */
	MessageComponentType getComplexType();

	/**
	 * Sets the value of the '{@link iso20022.MessageBuildingBlock#getComplexType <em>Complex Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Complex Type</em>' reference.
	 * @see #getComplexType()
	 * @generated
	 */
	void setComplexType(MessageComponentType value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A MessageBuildingBlock must have exactly one of the following: simpleType or complexType.
	 * complexType->size() + simpleType->size()  = 1
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" contextRequired="true" contextOrdered="false" diagnosticsRequired="true" diagnosticsOrdered="false"
	 * @generated
	 */
	boolean MessageBuildingBlockHasExactlyOneType(Map context, DiagnosticChain diagnostics);

} // MessageBuildingBlock
