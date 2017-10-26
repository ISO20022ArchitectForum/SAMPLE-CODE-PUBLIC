/**
 */
package iso20022.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

import iso20022.AbstractDateTimeConcept;
import iso20022.Address;
import iso20022.Amount;
import iso20022.Binary;
import iso20022.BroadcastList;
import iso20022.BusinessArea;
import iso20022.BusinessAssociationEnd;
import iso20022.BusinessAttribute;
import iso20022.BusinessComponent;
import iso20022.BusinessConcept;
import iso20022.BusinessElement;
import iso20022.BusinessElementType;
import iso20022.BusinessProcess;
import iso20022.BusinessProcessCatalogue;
import iso20022.BusinessRole;
import iso20022.BusinessTransaction;
import iso20022.ChoiceComponent;
import iso20022.Code;
import iso20022.CodeSet;
import iso20022.Constraint;
import iso20022.Construct;
import iso20022.ConvergenceDocumentation;
import iso20022.Conversation;
import iso20022.DataDictionary;
import iso20022.DataType;
import iso20022.Date;
import iso20022.DateTime;
import iso20022.Day;
import iso20022.Decimal;
import iso20022.Doclet;
import iso20022.Duration;
import iso20022.Encoding;
import iso20022.EndPointCategory;
import iso20022.ExternalSchema;
import iso20022.ISO15022MessageSet;
import iso20022.IdentifierSet;
import iso20022.Indicator;
import iso20022.IndustryMessageSet;
import iso20022.Iso20022Package;
import iso20022.LogicalType;
import iso20022.MessageAssociationEnd;
import iso20022.MessageAttribute;
import iso20022.MessageBuildingBlock;
import iso20022.MessageChoreography;
import iso20022.MessageComponent;
import iso20022.MessageComponentType;
import iso20022.MessageConcept;
import iso20022.MessageConstruct;
import iso20022.MessageDefinition;
import iso20022.MessageDefinitionIdentifier;
import iso20022.MessageElement;
import iso20022.MessageElementContainer;
import iso20022.MessageInstance;
import iso20022.MessageSet;
import iso20022.MessageTransmission;
import iso20022.MessageTransportMode;
import iso20022.MessageTransportSystem;
import iso20022.MessagingEndpoint;
import iso20022.ModelEntity;
import iso20022.Month;
import iso20022.MonthDay;
import iso20022.MultiplicityEntity;
import iso20022.Participant;
import iso20022.Quantity;
import iso20022.Rate;
import iso20022.Receive;
import iso20022.Repository;
import iso20022.RepositoryConcept;
import iso20022.RepositoryType;
import iso20022.SchemaType;
import iso20022.SemanticMarkup;
import iso20022.SemanticMarkupElement;
import iso20022.Send;
import iso20022.Syntax;
import iso20022.SyntaxMessageScheme;
import iso20022.Text;
import iso20022.Time;
import iso20022.TopLevelCatalogueEntry;
import iso20022.TopLevelDictionaryEntry;
import iso20022.TransportMessage;
import iso20022.UserDefined;
import iso20022.Xor;
import iso20022.Year;
import iso20022.YearMonth;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see iso20022.Iso20022Package
 * @generated
 */
public class Iso20022AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Iso20022Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Iso20022AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Iso20022Package.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Iso20022Switch<Adapter> modelSwitch =
		new Iso20022Switch<Adapter>() {
			@Override
			public Adapter caseAddress(Address object) {
				return createAddressAdapter();
			}
			@Override
			public Adapter caseModelEntity(ModelEntity object) {
				return createModelEntityAdapter();
			}
			@Override
			public Adapter caseBroadcastList(BroadcastList object) {
				return createBroadcastListAdapter();
			}
			@Override
			public Adapter caseMessagingEndpoint(MessagingEndpoint object) {
				return createMessagingEndpointAdapter();
			}
			@Override
			public Adapter caseMessageTransportSystem(MessageTransportSystem object) {
				return createMessageTransportSystemAdapter();
			}
			@Override
			public Adapter caseTransportMessage(TransportMessage object) {
				return createTransportMessageAdapter();
			}
			@Override
			public Adapter caseMessageInstance(MessageInstance object) {
				return createMessageInstanceAdapter();
			}
			@Override
			public Adapter caseSyntaxMessageScheme(SyntaxMessageScheme object) {
				return createSyntaxMessageSchemeAdapter();
			}
			@Override
			public Adapter caseTopLevelCatalogueEntry(TopLevelCatalogueEntry object) {
				return createTopLevelCatalogueEntryAdapter();
			}
			@Override
			public Adapter caseRepositoryConcept(RepositoryConcept object) {
				return createRepositoryConceptAdapter();
			}
			@Override
			public Adapter caseSemanticMarkup(SemanticMarkup object) {
				return createSemanticMarkupAdapter();
			}
			@Override
			public Adapter caseSemanticMarkupElement(SemanticMarkupElement object) {
				return createSemanticMarkupElementAdapter();
			}
			@Override
			public Adapter caseDoclet(Doclet object) {
				return createDocletAdapter();
			}
			@Override
			public Adapter caseConstraint(Constraint object) {
				return createConstraintAdapter();
			}
			@Override
			public Adapter caseBusinessProcessCatalogue(BusinessProcessCatalogue object) {
				return createBusinessProcessCatalogueAdapter();
			}
			@Override
			public Adapter caseRepository(Repository object) {
				return createRepositoryAdapter();
			}
			@Override
			public Adapter caseDataDictionary(DataDictionary object) {
				return createDataDictionaryAdapter();
			}
			@Override
			public Adapter caseTopLevelDictionaryEntry(TopLevelDictionaryEntry object) {
				return createTopLevelDictionaryEntryAdapter();
			}
			@Override
			public Adapter caseMessageDefinition(MessageDefinition object) {
				return createMessageDefinitionAdapter();
			}
			@Override
			public Adapter caseRepositoryType(RepositoryType object) {
				return createRepositoryTypeAdapter();
			}
			@Override
			public Adapter caseMessageSet(MessageSet object) {
				return createMessageSetAdapter();
			}
			@Override
			public Adapter caseSyntax(Syntax object) {
				return createSyntaxAdapter();
			}
			@Override
			public Adapter caseEncoding(Encoding object) {
				return createEncodingAdapter();
			}
			@Override
			public Adapter caseBusinessArea(BusinessArea object) {
				return createBusinessAreaAdapter();
			}
			@Override
			public Adapter caseXor(Xor object) {
				return createXorAdapter();
			}
			@Override
			public Adapter caseMessageElement(MessageElement object) {
				return createMessageElementAdapter();
			}
			@Override
			public Adapter caseMessageConstruct(MessageConstruct object) {
				return createMessageConstructAdapter();
			}
			@Override
			public Adapter caseConstruct(Construct object) {
				return createConstructAdapter();
			}
			@Override
			public Adapter caseMultiplicityEntity(MultiplicityEntity object) {
				return createMultiplicityEntityAdapter();
			}
			@Override
			public Adapter caseLogicalType(LogicalType object) {
				return createLogicalTypeAdapter();
			}
			@Override
			public Adapter caseMessageConcept(MessageConcept object) {
				return createMessageConceptAdapter();
			}
			@Override
			public Adapter caseBusinessComponent(BusinessComponent object) {
				return createBusinessComponentAdapter();
			}
			@Override
			public Adapter caseBusinessElementType(BusinessElementType object) {
				return createBusinessElementTypeAdapter();
			}
			@Override
			public Adapter caseBusinessConcept(BusinessConcept object) {
				return createBusinessConceptAdapter();
			}
			@Override
			public Adapter caseBusinessElement(BusinessElement object) {
				return createBusinessElementAdapter();
			}
			@Override
			public Adapter caseMessageComponentType(MessageComponentType object) {
				return createMessageComponentTypeAdapter();
			}
			@Override
			public Adapter caseMessageBuildingBlock(MessageBuildingBlock object) {
				return createMessageBuildingBlockAdapter();
			}
			@Override
			public Adapter caseDataType(DataType object) {
				return createDataTypeAdapter();
			}
			@Override
			public Adapter caseBusinessAssociationEnd(BusinessAssociationEnd object) {
				return createBusinessAssociationEndAdapter();
			}
			@Override
			public Adapter caseMessageElementContainer(MessageElementContainer object) {
				return createMessageElementContainerAdapter();
			}
			@Override
			public Adapter caseMessageComponent(MessageComponent object) {
				return createMessageComponentAdapter();
			}
			@Override
			public Adapter caseMessageChoreography(MessageChoreography object) {
				return createMessageChoreographyAdapter();
			}
			@Override
			public Adapter caseBusinessTransaction(BusinessTransaction object) {
				return createBusinessTransactionAdapter();
			}
			@Override
			public Adapter caseBusinessProcess(BusinessProcess object) {
				return createBusinessProcessAdapter();
			}
			@Override
			public Adapter caseBusinessRole(BusinessRole object) {
				return createBusinessRoleAdapter();
			}
			@Override
			public Adapter caseParticipant(Participant object) {
				return createParticipantAdapter();
			}
			@Override
			public Adapter caseReceive(Receive object) {
				return createReceiveAdapter();
			}
			@Override
			public Adapter caseMessageTransmission(MessageTransmission object) {
				return createMessageTransmissionAdapter();
			}
			@Override
			public Adapter caseSend(Send object) {
				return createSendAdapter();
			}
			@Override
			public Adapter caseMessageTransportMode(MessageTransportMode object) {
				return createMessageTransportModeAdapter();
			}
			@Override
			public Adapter caseMessageDefinitionIdentifier(MessageDefinitionIdentifier object) {
				return createMessageDefinitionIdentifierAdapter();
			}
			@Override
			public Adapter caseConversation(Conversation object) {
				return createConversationAdapter();
			}
			@Override
			public Adapter caseMessageAssociationEnd(MessageAssociationEnd object) {
				return createMessageAssociationEndAdapter();
			}
			@Override
			public Adapter caseMessageAttribute(MessageAttribute object) {
				return createMessageAttributeAdapter();
			}
			@Override
			public Adapter caseBusinessAttribute(BusinessAttribute object) {
				return createBusinessAttributeAdapter();
			}
			@Override
			public Adapter caseText(Text object) {
				return createTextAdapter();
			}
			@Override
			public Adapter caseString(iso20022.String object) {
				return createStringAdapter();
			}
			@Override
			public Adapter caseIdentifierSet(IdentifierSet object) {
				return createIdentifierSetAdapter();
			}
			@Override
			public Adapter caseIndicator(Indicator object) {
				return createIndicatorAdapter();
			}
			@Override
			public Adapter caseBoolean(iso20022.Boolean object) {
				return createBooleanAdapter();
			}
			@Override
			public Adapter caseRate(Rate object) {
				return createRateAdapter();
			}
			@Override
			public Adapter caseDecimal(Decimal object) {
				return createDecimalAdapter();
			}
			@Override
			public Adapter caseExternalSchema(ExternalSchema object) {
				return createExternalSchemaAdapter();
			}
			@Override
			public Adapter caseQuantity(Quantity object) {
				return createQuantityAdapter();
			}
			@Override
			public Adapter caseCode(Code object) {
				return createCodeAdapter();
			}
			@Override
			public Adapter caseCodeSet(CodeSet object) {
				return createCodeSetAdapter();
			}
			@Override
			public Adapter caseAmount(Amount object) {
				return createAmountAdapter();
			}
			@Override
			public Adapter caseChoiceComponent(ChoiceComponent object) {
				return createChoiceComponentAdapter();
			}
			@Override
			public Adapter caseAbstractDateTimeConcept(AbstractDateTimeConcept object) {
				return createAbstractDateTimeConceptAdapter();
			}
			@Override
			public Adapter caseEndPointCategory(EndPointCategory object) {
				return createEndPointCategoryAdapter();
			}
			@Override
			public Adapter caseBinary(Binary object) {
				return createBinaryAdapter();
			}
			@Override
			public Adapter caseDate(Date object) {
				return createDateAdapter();
			}
			@Override
			public Adapter caseDateTime(DateTime object) {
				return createDateTimeAdapter();
			}
			@Override
			public Adapter caseDay(Day object) {
				return createDayAdapter();
			}
			@Override
			public Adapter caseDuration(Duration object) {
				return createDurationAdapter();
			}
			@Override
			public Adapter caseMonth(Month object) {
				return createMonthAdapter();
			}
			@Override
			public Adapter caseMonthDay(MonthDay object) {
				return createMonthDayAdapter();
			}
			@Override
			public Adapter caseTime(Time object) {
				return createTimeAdapter();
			}
			@Override
			public Adapter caseYear(Year object) {
				return createYearAdapter();
			}
			@Override
			public Adapter caseYearMonth(YearMonth object) {
				return createYearMonthAdapter();
			}
			@Override
			public Adapter caseUserDefined(UserDefined object) {
				return createUserDefinedAdapter();
			}
			@Override
			public Adapter caseIndustryMessageSet(IndustryMessageSet object) {
				return createIndustryMessageSetAdapter();
			}
			@Override
			public Adapter caseConvergenceDocumentation(ConvergenceDocumentation object) {
				return createConvergenceDocumentationAdapter();
			}
			@Override
			public Adapter caseISO15022MessageSet(ISO15022MessageSet object) {
				return createISO15022MessageSetAdapter();
			}
			@Override
			public Adapter caseSchemaType(SchemaType object) {
				return createSchemaTypeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link iso20022.Address <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso20022.Address
	 * @generated
	 */
	public Adapter createAddressAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso20022.ModelEntity <em>Model Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso20022.ModelEntity
	 * @generated
	 */
	public Adapter createModelEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso20022.BroadcastList <em>Broadcast List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso20022.BroadcastList
	 * @generated
	 */
	public Adapter createBroadcastListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso20022.MessagingEndpoint <em>Messaging Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso20022.MessagingEndpoint
	 * @generated
	 */
	public Adapter createMessagingEndpointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso20022.MessageTransportSystem <em>Message Transport System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso20022.MessageTransportSystem
	 * @generated
	 */
	public Adapter createMessageTransportSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso20022.TransportMessage <em>Transport Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso20022.TransportMessage
	 * @generated
	 */
	public Adapter createTransportMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso20022.MessageInstance <em>Message Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso20022.MessageInstance
	 * @generated
	 */
	public Adapter createMessageInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso20022.SyntaxMessageScheme <em>Syntax Message Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso20022.SyntaxMessageScheme
	 * @generated
	 */
	public Adapter createSyntaxMessageSchemeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso20022.TopLevelCatalogueEntry <em>Top Level Catalogue Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso20022.TopLevelCatalogueEntry
	 * @generated
	 */
	public Adapter createTopLevelCatalogueEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso20022.RepositoryConcept <em>Repository Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso20022.RepositoryConcept
	 * @generated
	 */
	public Adapter createRepositoryConceptAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso20022.SemanticMarkup <em>Semantic Markup</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso20022.SemanticMarkup
	 * @generated
	 */
	public Adapter createSemanticMarkupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso20022.SemanticMarkupElement <em>Semantic Markup Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso20022.SemanticMarkupElement
	 * @generated
	 */
	public Adapter createSemanticMarkupElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso20022.Doclet <em>Doclet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso20022.Doclet
	 * @generated
	 */
	public Adapter createDocletAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso20022.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso20022.Constraint
	 * @generated
	 */
	public Adapter createConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso20022.BusinessProcessCatalogue <em>Business Process Catalogue</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso20022.BusinessProcessCatalogue
	 * @generated
	 */
	public Adapter createBusinessProcessCatalogueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso20022.Repository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso20022.Repository
	 * @generated
	 */
	public Adapter createRepositoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso20022.DataDictionary <em>Data Dictionary</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso20022.DataDictionary
	 * @generated
	 */
	public Adapter createDataDictionaryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso20022.TopLevelDictionaryEntry <em>Top Level Dictionary Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso20022.TopLevelDictionaryEntry
	 * @generated
	 */
	public Adapter createTopLevelDictionaryEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso20022.MessageDefinition <em>Message Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso20022.MessageDefinition
	 * @generated
	 */
	public Adapter createMessageDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso20022.RepositoryType <em>Repository Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso20022.RepositoryType
	 * @generated
	 */
	public Adapter createRepositoryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso20022.MessageSet <em>Message Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso20022.MessageSet
	 * @generated
	 */
	public Adapter createMessageSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso20022.Syntax <em>Syntax</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso20022.Syntax
	 * @generated
	 */
	public Adapter createSyntaxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso20022.Encoding <em>Encoding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso20022.Encoding
	 * @generated
	 */
	public Adapter createEncodingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso20022.BusinessArea <em>Business Area</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso20022.BusinessArea
	 * @generated
	 */
	public Adapter createBusinessAreaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso20022.Xor <em>Xor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso20022.Xor
	 * @generated
	 */
	public Adapter createXorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso20022.MessageElement <em>Message Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso20022.MessageElement
	 * @generated
	 */
	public Adapter createMessageElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso20022.MessageConstruct <em>Message Construct</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso20022.MessageConstruct
	 * @generated
	 */
	public Adapter createMessageConstructAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso20022.Construct <em>Construct</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso20022.Construct
	 * @generated
	 */
	public Adapter createConstructAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso20022.MultiplicityEntity <em>Multiplicity Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso20022.MultiplicityEntity
	 * @generated
	 */
	public Adapter createMultiplicityEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso20022.LogicalType <em>Logical Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso20022.LogicalType
	 * @generated
	 */
	public Adapter createLogicalTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso20022.MessageConcept <em>Message Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso20022.MessageConcept
	 * @generated
	 */
	public Adapter createMessageConceptAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso20022.BusinessComponent <em>Business Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso20022.BusinessComponent
	 * @generated
	 */
	public Adapter createBusinessComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso20022.BusinessElementType <em>Business Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso20022.BusinessElementType
	 * @generated
	 */
	public Adapter createBusinessElementTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso20022.BusinessConcept <em>Business Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso20022.BusinessConcept
	 * @generated
	 */
	public Adapter createBusinessConceptAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso20022.BusinessElement <em>Business Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso20022.BusinessElement
	 * @generated
	 */
	public Adapter createBusinessElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso20022.MessageComponentType <em>Message Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso20022.MessageComponentType
	 * @generated
	 */
	public Adapter createMessageComponentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso20022.MessageBuildingBlock <em>Message Building Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso20022.MessageBuildingBlock
	 * @generated
	 */
	public Adapter createMessageBuildingBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso20022.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso20022.DataType
	 * @generated
	 */
	public Adapter createDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso20022.BusinessAssociationEnd <em>Business Association End</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso20022.BusinessAssociationEnd
	 * @generated
	 */
	public Adapter createBusinessAssociationEndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso20022.MessageElementContainer <em>Message Element Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso20022.MessageElementContainer
	 * @generated
	 */
	public Adapter createMessageElementContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso20022.MessageComponent <em>Message Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso20022.MessageComponent
	 * @generated
	 */
	public Adapter createMessageComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso20022.MessageChoreography <em>Message Choreography</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso20022.MessageChoreography
	 * @generated
	 */
	public Adapter createMessageChoreographyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso20022.BusinessTransaction <em>Business Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso20022.BusinessTransaction
	 * @generated
	 */
	public Adapter createBusinessTransactionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso20022.BusinessProcess <em>Business Process</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso20022.BusinessProcess
	 * @generated
	 */
	public Adapter createBusinessProcessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso20022.BusinessRole <em>Business Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso20022.BusinessRole
	 * @generated
	 */
	public Adapter createBusinessRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso20022.Participant <em>Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso20022.Participant
	 * @generated
	 */
	public Adapter createParticipantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso20022.Receive <em>Receive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso20022.Receive
	 * @generated
	 */
	public Adapter createReceiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso20022.MessageTransmission <em>Message Transmission</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso20022.MessageTransmission
	 * @generated
	 */
	public Adapter createMessageTransmissionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso20022.Send <em>Send</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso20022.Send
	 * @generated
	 */
	public Adapter createSendAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso20022.MessageTransportMode <em>Message Transport Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso20022.MessageTransportMode
	 * @generated
	 */
	public Adapter createMessageTransportModeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso20022.MessageDefinitionIdentifier <em>Message Definition Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso20022.MessageDefinitionIdentifier
	 * @generated
	 */
	public Adapter createMessageDefinitionIdentifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso20022.Conversation <em>Conversation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso20022.Conversation
	 * @generated
	 */
	public Adapter createConversationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso20022.MessageAssociationEnd <em>Message Association End</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso20022.MessageAssociationEnd
	 * @generated
	 */
	public Adapter createMessageAssociationEndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso20022.MessageAttribute <em>Message Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso20022.MessageAttribute
	 * @generated
	 */
	public Adapter createMessageAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso20022.BusinessAttribute <em>Business Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso20022.BusinessAttribute
	 * @generated
	 */
	public Adapter createBusinessAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso20022.Text <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso20022.Text
	 * @generated
	 */
	public Adapter createTextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso20022.String <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso20022.String
	 * @generated
	 */
	public Adapter createStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso20022.IdentifierSet <em>Identifier Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso20022.IdentifierSet
	 * @generated
	 */
	public Adapter createIdentifierSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso20022.Indicator <em>Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso20022.Indicator
	 * @generated
	 */
	public Adapter createIndicatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso20022.Boolean <em>Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso20022.Boolean
	 * @generated
	 */
	public Adapter createBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso20022.Rate <em>Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso20022.Rate
	 * @generated
	 */
	public Adapter createRateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso20022.Decimal <em>Decimal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso20022.Decimal
	 * @generated
	 */
	public Adapter createDecimalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso20022.ExternalSchema <em>External Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso20022.ExternalSchema
	 * @generated
	 */
	public Adapter createExternalSchemaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso20022.Quantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso20022.Quantity
	 * @generated
	 */
	public Adapter createQuantityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso20022.Code <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso20022.Code
	 * @generated
	 */
	public Adapter createCodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso20022.CodeSet <em>Code Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso20022.CodeSet
	 * @generated
	 */
	public Adapter createCodeSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso20022.Amount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso20022.Amount
	 * @generated
	 */
	public Adapter createAmountAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso20022.ChoiceComponent <em>Choice Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso20022.ChoiceComponent
	 * @generated
	 */
	public Adapter createChoiceComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso20022.AbstractDateTimeConcept <em>Abstract Date Time Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso20022.AbstractDateTimeConcept
	 * @generated
	 */
	public Adapter createAbstractDateTimeConceptAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso20022.EndPointCategory <em>End Point Category</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso20022.EndPointCategory
	 * @generated
	 */
	public Adapter createEndPointCategoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso20022.Binary <em>Binary</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso20022.Binary
	 * @generated
	 */
	public Adapter createBinaryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso20022.Date <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso20022.Date
	 * @generated
	 */
	public Adapter createDateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso20022.DateTime <em>Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso20022.DateTime
	 * @generated
	 */
	public Adapter createDateTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso20022.Day <em>Day</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso20022.Day
	 * @generated
	 */
	public Adapter createDayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso20022.Duration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso20022.Duration
	 * @generated
	 */
	public Adapter createDurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso20022.Month <em>Month</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso20022.Month
	 * @generated
	 */
	public Adapter createMonthAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso20022.MonthDay <em>Month Day</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso20022.MonthDay
	 * @generated
	 */
	public Adapter createMonthDayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso20022.Time <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso20022.Time
	 * @generated
	 */
	public Adapter createTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso20022.Year <em>Year</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso20022.Year
	 * @generated
	 */
	public Adapter createYearAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso20022.YearMonth <em>Year Month</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso20022.YearMonth
	 * @generated
	 */
	public Adapter createYearMonthAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso20022.UserDefined <em>User Defined</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso20022.UserDefined
	 * @generated
	 */
	public Adapter createUserDefinedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso20022.IndustryMessageSet <em>Industry Message Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso20022.IndustryMessageSet
	 * @generated
	 */
	public Adapter createIndustryMessageSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso20022.ConvergenceDocumentation <em>Convergence Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso20022.ConvergenceDocumentation
	 * @generated
	 */
	public Adapter createConvergenceDocumentationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso20022.ISO15022MessageSet <em>ISO15022 Message Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso20022.ISO15022MessageSet
	 * @generated
	 */
	public Adapter createISO15022MessageSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iso20022.SchemaType <em>Schema Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iso20022.SchemaType
	 * @generated
	 */
	public Adapter createSchemaTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Iso20022AdapterFactory
