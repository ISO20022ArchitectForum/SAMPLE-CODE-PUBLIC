/**
 */
package iso20022;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Kind of MessageElement whose type is a DataType or a MessageComponentType
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso20022.MessageAttribute#getSimpleType <em>Simple Type</em>}</li>
 *   <li>{@link iso20022.MessageAttribute#getComplexType <em>Complex Type</em>}</li>
 * </ul>
 *
 * @see iso20022.Iso20022Package#getMessageAttribute()
 * @model
 * @generated
 */
public interface MessageAttribute extends MessageElement {
	/**
	 * Returns the value of the '<em><b>Simple Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the simple content model of a MessageAttribute when it is expressed using a DataType
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Simple Type</em>' reference.
	 * @see #setSimpleType(DataType)
	 * @see iso20022.Iso20022Package#getMessageAttribute_SimpleType()
	 * @model ordered="false"
	 * @generated
	 */
	DataType getSimpleType();

	/**
	 * Sets the value of the '{@link iso20022.MessageAttribute#getSimpleType <em>Simple Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simple Type</em>' reference.
	 * @see #getSimpleType()
	 * @generated
	 */
	void setSimpleType(DataType value);

	/**
	 * Returns the value of the '<em><b>Complex Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the complex content model of a MessageAttribute when it is expressed using a MessageComponentType
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Complex Type</em>' reference.
	 * @see #setComplexType(MessageComponentType)
	 * @see iso20022.Iso20022Package#getMessageAttribute_ComplexType()
	 * @model ordered="false"
	 * @generated
	 */
	MessageComponentType getComplexType();

	/**
	 * Sets the value of the '{@link iso20022.MessageAttribute#getComplexType <em>Complex Type</em>}' reference.
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
	 * A MessageAttribute must have exactly one of the following: simpleType and complexType
	 * complexType->size() + simpleType->size()  = 1
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" contextRequired="true" contextOrdered="false" diagnosticsRequired="true" diagnosticsOrdered="false"
	 * @generated
	 */
	boolean MessageAttributeHasExactlyOneType(Map context, DiagnosticChain diagnostics);

} // MessageAttribute
