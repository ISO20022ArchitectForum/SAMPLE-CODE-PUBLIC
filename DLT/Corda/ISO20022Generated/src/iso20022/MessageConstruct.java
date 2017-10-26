/**
 */
package iso20022;

import java.lang.String;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Construct</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Abstract layer : Abstract meta class for representing a MessageElement or a MessageBuildingBlock
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso20022.MessageConstruct#getXmlTag <em>Xml Tag</em>}</li>
 *   <li>{@link iso20022.MessageConstruct#getXmlMemberType <em>Xml Member Type</em>}</li>
 * </ul>
 *
 * @see iso20022.Iso20022Package#getMessageConstruct()
 * @model abstract="true"
 *        annotation="urn:iso:std:iso:20022:2013:ecore:extension basis='IMPLEMENTATION_ENHANCEMENT' description='Abstract layer : Abstract meta class for representing a MessageElement or a MessageBuildingBlock'"
 * @generated
 */
public interface MessageConstruct extends Construct {
	/**
	 * Returns the value of the '<em><b>Xml Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * XML schema tag name for the element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Xml Tag</em>' attribute.
	 * @see #setXmlTag(String)
	 * @see iso20022.Iso20022Package#getMessageConstruct_XmlTag()
	 * @model ordered="false"
	 *        annotation="urn:iso:std:iso:20022:2013:ecore:extension basis='LEGACY'"
	 * @generated
	 */
	String getXmlTag();

	/**
	 * Sets the value of the '{@link iso20022.MessageConstruct#getXmlTag <em>Xml Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xml Tag</em>' attribute.
	 * @see #getXmlTag()
	 * @generated
	 */
	void setXmlTag(String value);

	/**
	 * Returns the value of the '<em><b>Xml Member Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Direct reference to the type of a MessageElement or MessageBuildingBlock
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Xml Member Type</em>' reference.
	 * @see iso20022.Iso20022Package#getMessageConstruct_XmlMemberType()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="urn:iso:std:iso:20022:2013:ecore:extension basis='IMPLEMENTATION_ENHANCEMENT'"
	 * @generated
	 */
	LogicalType getXmlMemberType();

} // MessageConstruct
