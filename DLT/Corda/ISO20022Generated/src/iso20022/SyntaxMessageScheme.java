/**
 */
package iso20022;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Syntax Message Scheme</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * syntax processable notation used to define the structure of a MessageInstance in a particular syntax
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso20022.SyntaxMessageScheme#getMessageDefinitionTrace <em>Message Definition Trace</em>}</li>
 * </ul>
 *
 * @see iso20022.Iso20022Package#getSyntaxMessageScheme()
 * @model
 * @generated
 */
public interface SyntaxMessageScheme extends TopLevelCatalogueEntry {
	/**
	 * Returns the value of the '<em><b>Message Definition Trace</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link iso20022.MessageDefinition#getDerivation <em>Derivation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the MessageDefinitionTrace from the SyntaxMessageScheme to the MessageDefinition
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message Definition Trace</em>' reference.
	 * @see #setMessageDefinitionTrace(MessageDefinition)
	 * @see iso20022.Iso20022Package#getSyntaxMessageScheme_MessageDefinitionTrace()
	 * @see iso20022.MessageDefinition#getDerivation
	 * @model opposite="derivation" ordered="false"
	 *        annotation="urn:iso:std:iso:20022:2013:ecore:extension basis='IMPLEMENTATION_ENHANCEMENT' description='Traces are represented as a direct reference to the traced-to repository concept instead of using an intermediate Trace meta class'"
	 * @generated
	 */
	MessageDefinition getMessageDefinitionTrace();

	/**
	 * Sets the value of the '{@link iso20022.SyntaxMessageScheme#getMessageDefinitionTrace <em>Message Definition Trace</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Definition Trace</em>' reference.
	 * @see #getMessageDefinitionTrace()
	 * @generated
	 */
	void setMessageDefinitionTrace(MessageDefinition value);

} // SyntaxMessageScheme
