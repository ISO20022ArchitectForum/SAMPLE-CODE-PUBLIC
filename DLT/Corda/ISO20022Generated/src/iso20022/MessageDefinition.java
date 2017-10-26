/**
 */
package iso20022;

import java.lang.String;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Formal description of the structure of a MessageInstance
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso20022.MessageDefinition#getMessageSet <em>Message Set</em>}</li>
 *   <li>{@link iso20022.MessageDefinition#getXmlName <em>Xml Name</em>}</li>
 *   <li>{@link iso20022.MessageDefinition#getXmlTag <em>Xml Tag</em>}</li>
 *   <li>{@link iso20022.MessageDefinition#getBusinessArea <em>Business Area</em>}</li>
 *   <li>{@link iso20022.MessageDefinition#getXors <em>Xors</em>}</li>
 *   <li>{@link iso20022.MessageDefinition#getRootElement <em>Root Element</em>}</li>
 *   <li>{@link iso20022.MessageDefinition#getMessageBuildingBlock <em>Message Building Block</em>}</li>
 *   <li>{@link iso20022.MessageDefinition#getChoreography <em>Choreography</em>}</li>
 *   <li>{@link iso20022.MessageDefinition#getTrace <em>Trace</em>}</li>
 *   <li>{@link iso20022.MessageDefinition#getMessageDefinitionIdentifier <em>Message Definition Identifier</em>}</li>
 *   <li>{@link iso20022.MessageDefinition#getDerivation <em>Derivation</em>}</li>
 * </ul>
 *
 * @see iso20022.Iso20022Package#getMessageDefinition()
 * @model
 * @generated
 */
public interface MessageDefinition extends RepositoryType {
	/**
	 * Returns the value of the '<em><b>Message Set</b></em>' reference list.
	 * The list contents are of type {@link iso20022.MessageSet}.
	 * It is bidirectional and its opposite is '{@link iso20022.MessageSet#getMessageDefinition <em>Message Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the MessageSet to which the MessageDefinition belongs
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message Set</em>' reference list.
	 * @see iso20022.Iso20022Package#getMessageDefinition_MessageSet()
	 * @see iso20022.MessageSet#getMessageDefinition
	 * @model opposite="messageDefinition" ordered="false"
	 * @generated
	 */
	EList<MessageSet> getMessageSet();

	/**
	 * Returns the value of the '<em><b>Xml Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name used in an XML schema for the ComplexType that defines the Message Definition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Xml Name</em>' attribute.
	 * @see #setXmlName(String)
	 * @see iso20022.Iso20022Package#getMessageDefinition_XmlName()
	 * @model ordered="false"
	 *        annotation="urn:iso:std:iso:20022:2013:ecore:extension basis='LEGACY'"
	 * @generated
	 */
	String getXmlName();

	/**
	 * Sets the value of the '{@link iso20022.MessageDefinition#getXmlName <em>Xml Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xml Name</em>' attribute.
	 * @see #getXmlName()
	 * @generated
	 */
	void setXmlName(String value);

	/**
	 * Returns the value of the '<em><b>Xml Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name used in an XML schema for the first element under the root element of a Message Definition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Xml Tag</em>' attribute.
	 * @see #setXmlTag(String)
	 * @see iso20022.Iso20022Package#getMessageDefinition_XmlTag()
	 * @model ordered="false"
	 *        annotation="urn:iso:std:iso:20022:2013:ecore:extension basis='LEGACY'"
	 * @generated
	 */
	String getXmlTag();

	/**
	 * Sets the value of the '{@link iso20022.MessageDefinition#getXmlTag <em>Xml Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xml Tag</em>' attribute.
	 * @see #getXmlTag()
	 * @generated
	 */
	void setXmlTag(String value);

	/**
	 * Returns the value of the '<em><b>Business Area</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link iso20022.BusinessArea#getMessageDefinition <em>Message Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The BusinessArea to which this MessageDefinition belongs
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Business Area</em>' container reference.
	 * @see #setBusinessArea(BusinessArea)
	 * @see iso20022.Iso20022Package#getMessageDefinition_BusinessArea()
	 * @see iso20022.BusinessArea#getMessageDefinition
	 * @model opposite="messageDefinition" required="true" transient="false" ordered="false"
	 * @generated
	 */
	BusinessArea getBusinessArea();

	/**
	 * Sets the value of the '{@link iso20022.MessageDefinition#getBusinessArea <em>Business Area</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Business Area</em>' container reference.
	 * @see #getBusinessArea()
	 * @generated
	 */
	void setBusinessArea(BusinessArea value);

	/**
	 * Returns the value of the '<em><b>Xors</b></em>' containment reference list.
	 * The list contents are of type {@link iso20022.Xor}.
	 * It is bidirectional and its opposite is '{@link iso20022.Xor#getMessageDefinition <em>Message Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * XORs applied to a selection of the elements of the Message Definition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Xors</em>' containment reference list.
	 * @see iso20022.Iso20022Package#getMessageDefinition_Xors()
	 * @see iso20022.Xor#getMessageDefinition
	 * @model opposite="messageDefinition" containment="true"
	 *        annotation="urn:iso:std:iso:20022:2013:ecore:extension basis='LEGACY'"
	 * @generated
	 */
	EList<Xor> getXors();

	/**
	 * Returns the value of the '<em><b>Root Element</b></em>' attribute.
	 * The default value is <code>"Document"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * a property of MessageDefinition that specifies the top level element of the MessageDefinition
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Root Element</em>' attribute.
	 * @see #setRootElement(String)
	 * @see iso20022.Iso20022Package#getMessageDefinition_RootElement()
	 * @model default="Document" required="true" ordered="false"
	 * @generated
	 */
	String getRootElement();

	/**
	 * Sets the value of the '{@link iso20022.MessageDefinition#getRootElement <em>Root Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root Element</em>' attribute.
	 * @see #getRootElement()
	 * @generated
	 */
	void setRootElement(String value);

	/**
	 * Returns the value of the '<em><b>Message Building Block</b></em>' containment reference list.
	 * The list contents are of type {@link iso20022.MessageBuildingBlock}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * a MessageBuildingBlock belonging to this MessageDefinition
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message Building Block</em>' containment reference list.
	 * @see iso20022.Iso20022Package#getMessageDefinition_MessageBuildingBlock()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<MessageBuildingBlock> getMessageBuildingBlock();

	/**
	 * Returns the value of the '<em><b>Choreography</b></em>' reference list.
	 * The list contents are of type {@link iso20022.MessageChoreography}.
	 * It is bidirectional and its opposite is '{@link iso20022.MessageChoreography#getMessageDefinition <em>Message Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the MessageChoreography to which the MessageDefinition belongs
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Choreography</em>' reference list.
	 * @see iso20022.Iso20022Package#getMessageDefinition_Choreography()
	 * @see iso20022.MessageChoreography#getMessageDefinition
	 * @model opposite="messageDefinition" ordered="false"
	 * @generated
	 */
	EList<MessageChoreography> getChoreography();

	/**
	 * Returns the value of the '<em><b>Trace</b></em>' reference list.
	 * The list contents are of type {@link iso20022.MessageTransmission}.
	 * It is bidirectional and its opposite is '{@link iso20022.MessageTransmission#getDerivation <em>Derivation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * all of the MessageTypeTraces from one MessageDefinition that are traced to different MessageTransmissions
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trace</em>' reference list.
	 * @see iso20022.Iso20022Package#getMessageDefinition_Trace()
	 * @see iso20022.MessageTransmission#getDerivation
	 * @model opposite="derivation" ordered="false"
	 *        annotation="urn:iso:std:iso:20022:2013:ecore:extension basis='IMPLEMENTATION_ENHANCEMENT' description='Traces are represented as a direct reference to the traced-to repository concept instead of using an intermediate Trace meta class'"
	 * @generated
	 */
	EList<MessageTransmission> getTrace();

	/**
	 * Returns the value of the '<em><b>Message Definition Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The MessageDefinitionIdentifier for this MessageDefinition
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message Definition Identifier</em>' containment reference.
	 * @see #setMessageDefinitionIdentifier(MessageDefinitionIdentifier)
	 * @see iso20022.Iso20022Package#getMessageDefinition_MessageDefinitionIdentifier()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	MessageDefinitionIdentifier getMessageDefinitionIdentifier();

	/**
	 * Sets the value of the '{@link iso20022.MessageDefinition#getMessageDefinitionIdentifier <em>Message Definition Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Definition Identifier</em>' containment reference.
	 * @see #getMessageDefinitionIdentifier()
	 * @generated
	 */
	void setMessageDefinitionIdentifier(MessageDefinitionIdentifier value);

	/**
	 * Returns the value of the '<em><b>Derivation</b></em>' reference list.
	 * The list contents are of type {@link iso20022.SyntaxMessageScheme}.
	 * It is bidirectional and its opposite is '{@link iso20022.SyntaxMessageScheme#getMessageDefinitionTrace <em>Message Definition Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All of the SyntaxMessageSchemes that are derived from from one MessageDefinition
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Derivation</em>' reference list.
	 * @see iso20022.Iso20022Package#getMessageDefinition_Derivation()
	 * @see iso20022.SyntaxMessageScheme#getMessageDefinitionTrace
	 * @model opposite="messageDefinitionTrace" ordered="false"
	 *        annotation="urn:iso:std:iso:20022:2013:ecore:extension basis='IMPLEMENTATION_ENHANCEMENT' description='Traces are represented as a direct reference to the traced-to repository concept instead of using an intermediate Trace meta class'"
	 * @generated
	 */
	EList<SyntaxMessageScheme> getDerivation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The businessArea of the messageDefinitionIdentifier of this MessageDefinition is equal to the code of the BusinessArea that contains this MessageDefinition
	 * businessArea.code = messageDefinitionIdentifier.businessArea
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" contextRequired="true" contextOrdered="false" diagnosticsRequired="true" diagnosticsOrdered="false"
	 * @generated
	 */
	boolean BusinessAreaNameMatch(Map context, DiagnosticChain diagnostics);

} // MessageDefinition
