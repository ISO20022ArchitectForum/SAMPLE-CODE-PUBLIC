/**
 */
package iso20022;

import java.lang.String;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Definition Identifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Unique identification of a MessageDefinition within the ISO 20022 namespace, identifying the BusinessArea to which the MessageDefinition belongs, the Message Functionality it covers, its flavour and its version
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso20022.MessageDefinitionIdentifier#getBusinessArea <em>Business Area</em>}</li>
 *   <li>{@link iso20022.MessageDefinitionIdentifier#getMessageFunctionality <em>Message Functionality</em>}</li>
 *   <li>{@link iso20022.MessageDefinitionIdentifier#getFlavour <em>Flavour</em>}</li>
 *   <li>{@link iso20022.MessageDefinitionIdentifier#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @see iso20022.Iso20022Package#getMessageDefinitionIdentifier()
 * @model
 * @generated
 */
public interface MessageDefinitionIdentifier extends ModelEntity {
	/**
	 * Returns the value of the '<em><b>Business Area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * part of a MessageDefinitionIdentifier describing the BusinessArea to which the MessageDefinition using this MessageDefinitionIdentifier belongs
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Business Area</em>' attribute.
	 * @see #setBusinessArea(String)
	 * @see iso20022.Iso20022Package#getMessageDefinitionIdentifier_BusinessArea()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getBusinessArea();

	/**
	 * Sets the value of the '{@link iso20022.MessageDefinitionIdentifier#getBusinessArea <em>Business Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Business Area</em>' attribute.
	 * @see #getBusinessArea()
	 * @generated
	 */
	void setBusinessArea(String value);

	/**
	 * Returns the value of the '<em><b>Message Functionality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * function and purpose for which a MessageInstance described by a MessageDefinition can be used
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message Functionality</em>' attribute.
	 * @see #setMessageFunctionality(String)
	 * @see iso20022.Iso20022Package#getMessageDefinitionIdentifier_MessageFunctionality()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getMessageFunctionality();

	/**
	 * Sets the value of the '{@link iso20022.MessageDefinitionIdentifier#getMessageFunctionality <em>Message Functionality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Functionality</em>' attribute.
	 * @see #getMessageFunctionality()
	 * @generated
	 */
	void setMessageFunctionality(String value);

	/**
	 * Returns the value of the '<em><b>Flavour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * a variation of a messageFunctionality, whereby MessageDefinitions that are based on this MessageDefinition are compliant to the MessageDefinition from which this MessageDefinition is derived.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Flavour</em>' attribute.
	 * @see #setFlavour(String)
	 * @see iso20022.Iso20022Package#getMessageDefinitionIdentifier_Flavour()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getFlavour();

	/**
	 * Sets the value of the '{@link iso20022.MessageDefinitionIdentifier#getFlavour <em>Flavour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flavour</em>' attribute.
	 * @see #getFlavour()
	 * @generated
	 */
	void setFlavour(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * identifies the version of the MessageDefinition
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see iso20022.Iso20022Package#getMessageDefinitionIdentifier_Version()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link iso20022.MessageDefinitionIdentifier#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

} // MessageDefinitionIdentifier
