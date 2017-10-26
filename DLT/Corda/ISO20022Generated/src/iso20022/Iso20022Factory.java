/**
 */
package iso20022;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see iso20022.Iso20022Package
 * @generated
 */
public interface Iso20022Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Iso20022Factory eINSTANCE = iso20022.impl.Iso20022FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Address</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Address</em>'.
	 * @generated
	 */
	Address createAddress();

	/**
	 * Returns a new object of class '<em>Broadcast List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Broadcast List</em>'.
	 * @generated
	 */
	BroadcastList createBroadcastList();

	/**
	 * Returns a new object of class '<em>Messaging Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Messaging Endpoint</em>'.
	 * @generated
	 */
	MessagingEndpoint createMessagingEndpoint();

	/**
	 * Returns a new object of class '<em>Message Transport System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message Transport System</em>'.
	 * @generated
	 */
	MessageTransportSystem createMessageTransportSystem();

	/**
	 * Returns a new object of class '<em>Transport Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transport Message</em>'.
	 * @generated
	 */
	TransportMessage createTransportMessage();

	/**
	 * Returns a new object of class '<em>Message Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message Instance</em>'.
	 * @generated
	 */
	MessageInstance createMessageInstance();

	/**
	 * Returns a new object of class '<em>Syntax Message Scheme</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Syntax Message Scheme</em>'.
	 * @generated
	 */
	SyntaxMessageScheme createSyntaxMessageScheme();

	/**
	 * Returns a new object of class '<em>Semantic Markup</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Semantic Markup</em>'.
	 * @generated
	 */
	SemanticMarkup createSemanticMarkup();

	/**
	 * Returns a new object of class '<em>Semantic Markup Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Semantic Markup Element</em>'.
	 * @generated
	 */
	SemanticMarkupElement createSemanticMarkupElement();

	/**
	 * Returns a new object of class '<em>Doclet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Doclet</em>'.
	 * @generated
	 */
	Doclet createDoclet();

	/**
	 * Returns a new object of class '<em>Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constraint</em>'.
	 * @generated
	 */
	Constraint createConstraint();

	/**
	 * Returns a new object of class '<em>Business Process Catalogue</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Business Process Catalogue</em>'.
	 * @generated
	 */
	BusinessProcessCatalogue createBusinessProcessCatalogue();

	/**
	 * Returns a new object of class '<em>Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Repository</em>'.
	 * @generated
	 */
	Repository createRepository();

	/**
	 * Returns a new object of class '<em>Data Dictionary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Dictionary</em>'.
	 * @generated
	 */
	DataDictionary createDataDictionary();

	/**
	 * Returns a new object of class '<em>Message Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message Definition</em>'.
	 * @generated
	 */
	MessageDefinition createMessageDefinition();

	/**
	 * Returns a new object of class '<em>Message Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message Set</em>'.
	 * @generated
	 */
	MessageSet createMessageSet();

	/**
	 * Returns a new object of class '<em>Syntax</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Syntax</em>'.
	 * @generated
	 */
	Syntax createSyntax();

	/**
	 * Returns a new object of class '<em>Encoding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Encoding</em>'.
	 * @generated
	 */
	Encoding createEncoding();

	/**
	 * Returns a new object of class '<em>Business Area</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Business Area</em>'.
	 * @generated
	 */
	BusinessArea createBusinessArea();

	/**
	 * Returns a new object of class '<em>Xor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Xor</em>'.
	 * @generated
	 */
	Xor createXor();

	/**
	 * Returns a new object of class '<em>Business Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Business Component</em>'.
	 * @generated
	 */
	BusinessComponent createBusinessComponent();

	/**
	 * Returns a new object of class '<em>Message Building Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message Building Block</em>'.
	 * @generated
	 */
	MessageBuildingBlock createMessageBuildingBlock();

	/**
	 * Returns a new object of class '<em>Business Association End</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Business Association End</em>'.
	 * @generated
	 */
	BusinessAssociationEnd createBusinessAssociationEnd();

	/**
	 * Returns a new object of class '<em>Message Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message Component</em>'.
	 * @generated
	 */
	MessageComponent createMessageComponent();

	/**
	 * Returns a new object of class '<em>Message Choreography</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message Choreography</em>'.
	 * @generated
	 */
	MessageChoreography createMessageChoreography();

	/**
	 * Returns a new object of class '<em>Business Transaction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Business Transaction</em>'.
	 * @generated
	 */
	BusinessTransaction createBusinessTransaction();

	/**
	 * Returns a new object of class '<em>Business Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Business Process</em>'.
	 * @generated
	 */
	BusinessProcess createBusinessProcess();

	/**
	 * Returns a new object of class '<em>Business Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Business Role</em>'.
	 * @generated
	 */
	BusinessRole createBusinessRole();

	/**
	 * Returns a new object of class '<em>Participant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Participant</em>'.
	 * @generated
	 */
	Participant createParticipant();

	/**
	 * Returns a new object of class '<em>Receive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Receive</em>'.
	 * @generated
	 */
	Receive createReceive();

	/**
	 * Returns a new object of class '<em>Message Transmission</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message Transmission</em>'.
	 * @generated
	 */
	MessageTransmission createMessageTransmission();

	/**
	 * Returns a new object of class '<em>Send</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Send</em>'.
	 * @generated
	 */
	Send createSend();

	/**
	 * Returns a new object of class '<em>Message Transport Mode</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message Transport Mode</em>'.
	 * @generated
	 */
	MessageTransportMode createMessageTransportMode();

	/**
	 * Returns a new object of class '<em>Message Definition Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message Definition Identifier</em>'.
	 * @generated
	 */
	MessageDefinitionIdentifier createMessageDefinitionIdentifier();

	/**
	 * Returns a new object of class '<em>Conversation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conversation</em>'.
	 * @generated
	 */
	Conversation createConversation();

	/**
	 * Returns a new object of class '<em>Message Association End</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message Association End</em>'.
	 * @generated
	 */
	MessageAssociationEnd createMessageAssociationEnd();

	/**
	 * Returns a new object of class '<em>Message Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message Attribute</em>'.
	 * @generated
	 */
	MessageAttribute createMessageAttribute();

	/**
	 * Returns a new object of class '<em>Business Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Business Attribute</em>'.
	 * @generated
	 */
	BusinessAttribute createBusinessAttribute();

	/**
	 * Returns a new object of class '<em>Text</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text</em>'.
	 * @generated
	 */
	Text createText();

	/**
	 * Returns a new object of class '<em>String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String</em>'.
	 * @generated
	 */
	String createString();

	/**
	 * Returns a new object of class '<em>Identifier Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Identifier Set</em>'.
	 * @generated
	 */
	IdentifierSet createIdentifierSet();

	/**
	 * Returns a new object of class '<em>Indicator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Indicator</em>'.
	 * @generated
	 */
	Indicator createIndicator();

	/**
	 * Returns a new object of class '<em>Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean</em>'.
	 * @generated
	 */
	Boolean createBoolean();

	/**
	 * Returns a new object of class '<em>Rate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rate</em>'.
	 * @generated
	 */
	Rate createRate();

	/**
	 * Returns a new object of class '<em>Decimal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Decimal</em>'.
	 * @generated
	 */
	Decimal createDecimal();

	/**
	 * Returns a new object of class '<em>External Schema</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>External Schema</em>'.
	 * @generated
	 */
	ExternalSchema createExternalSchema();

	/**
	 * Returns a new object of class '<em>Quantity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Quantity</em>'.
	 * @generated
	 */
	Quantity createQuantity();

	/**
	 * Returns a new object of class '<em>Code</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Code</em>'.
	 * @generated
	 */
	Code createCode();

	/**
	 * Returns a new object of class '<em>Code Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Code Set</em>'.
	 * @generated
	 */
	CodeSet createCodeSet();

	/**
	 * Returns a new object of class '<em>Amount</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Amount</em>'.
	 * @generated
	 */
	Amount createAmount();

	/**
	 * Returns a new object of class '<em>Choice Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Choice Component</em>'.
	 * @generated
	 */
	ChoiceComponent createChoiceComponent();

	/**
	 * Returns a new object of class '<em>End Point Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>End Point Category</em>'.
	 * @generated
	 */
	EndPointCategory createEndPointCategory();

	/**
	 * Returns a new object of class '<em>Binary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binary</em>'.
	 * @generated
	 */
	Binary createBinary();

	/**
	 * Returns a new object of class '<em>Date</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Date</em>'.
	 * @generated
	 */
	Date createDate();

	/**
	 * Returns a new object of class '<em>Date Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Date Time</em>'.
	 * @generated
	 */
	DateTime createDateTime();

	/**
	 * Returns a new object of class '<em>Day</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Day</em>'.
	 * @generated
	 */
	Day createDay();

	/**
	 * Returns a new object of class '<em>Duration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Duration</em>'.
	 * @generated
	 */
	Duration createDuration();

	/**
	 * Returns a new object of class '<em>Month</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Month</em>'.
	 * @generated
	 */
	Month createMonth();

	/**
	 * Returns a new object of class '<em>Month Day</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Month Day</em>'.
	 * @generated
	 */
	MonthDay createMonthDay();

	/**
	 * Returns a new object of class '<em>Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time</em>'.
	 * @generated
	 */
	Time createTime();

	/**
	 * Returns a new object of class '<em>Year</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Year</em>'.
	 * @generated
	 */
	Year createYear();

	/**
	 * Returns a new object of class '<em>Year Month</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Year Month</em>'.
	 * @generated
	 */
	YearMonth createYearMonth();

	/**
	 * Returns a new object of class '<em>User Defined</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Defined</em>'.
	 * @generated
	 */
	UserDefined createUserDefined();

	/**
	 * Returns a new object of class '<em>Industry Message Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Industry Message Set</em>'.
	 * @generated
	 */
	IndustryMessageSet createIndustryMessageSet();

	/**
	 * Returns a new object of class '<em>Convergence Documentation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Convergence Documentation</em>'.
	 * @generated
	 */
	ConvergenceDocumentation createConvergenceDocumentation();

	/**
	 * Returns a new object of class '<em>ISO15022 Message Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ISO15022 Message Set</em>'.
	 * @generated
	 */
	ISO15022MessageSet createISO15022MessageSet();

	/**
	 * Returns a new object of class '<em>Schema Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Schema Type</em>'.
	 * @generated
	 */
	SchemaType createSchemaType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Iso20022Package getIso20022Package();

} //Iso20022Factory
