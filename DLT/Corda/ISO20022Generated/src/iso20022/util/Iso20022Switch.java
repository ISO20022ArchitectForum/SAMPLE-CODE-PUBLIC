/**
 */
package iso20022.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

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
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see iso20022.Iso20022Package
 * @generated
 */
public class Iso20022Switch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Iso20022Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Iso20022Switch() {
		if (modelPackage == null) {
			modelPackage = Iso20022Package.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case Iso20022Package.ADDRESS: {
				Address address = (Address)theEObject;
				T result = caseAddress(address);
				if (result == null) result = caseModelEntity(address);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iso20022Package.MODEL_ENTITY: {
				ModelEntity modelEntity = (ModelEntity)theEObject;
				T result = caseModelEntity(modelEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iso20022Package.BROADCAST_LIST: {
				BroadcastList broadcastList = (BroadcastList)theEObject;
				T result = caseBroadcastList(broadcastList);
				if (result == null) result = caseModelEntity(broadcastList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iso20022Package.MESSAGING_ENDPOINT: {
				MessagingEndpoint messagingEndpoint = (MessagingEndpoint)theEObject;
				T result = caseMessagingEndpoint(messagingEndpoint);
				if (result == null) result = caseModelEntity(messagingEndpoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iso20022Package.MESSAGE_TRANSPORT_SYSTEM: {
				MessageTransportSystem messageTransportSystem = (MessageTransportSystem)theEObject;
				T result = caseMessageTransportSystem(messageTransportSystem);
				if (result == null) result = caseModelEntity(messageTransportSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iso20022Package.TRANSPORT_MESSAGE: {
				TransportMessage transportMessage = (TransportMessage)theEObject;
				T result = caseTransportMessage(transportMessage);
				if (result == null) result = caseModelEntity(transportMessage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iso20022Package.MESSAGE_INSTANCE: {
				MessageInstance messageInstance = (MessageInstance)theEObject;
				T result = caseMessageInstance(messageInstance);
				if (result == null) result = caseModelEntity(messageInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iso20022Package.SYNTAX_MESSAGE_SCHEME: {
				SyntaxMessageScheme syntaxMessageScheme = (SyntaxMessageScheme)theEObject;
				T result = caseSyntaxMessageScheme(syntaxMessageScheme);
				if (result == null) result = caseTopLevelCatalogueEntry(syntaxMessageScheme);
				if (result == null) result = caseRepositoryConcept(syntaxMessageScheme);
				if (result == null) result = caseModelEntity(syntaxMessageScheme);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iso20022Package.TOP_LEVEL_CATALOGUE_ENTRY: {
				TopLevelCatalogueEntry topLevelCatalogueEntry = (TopLevelCatalogueEntry)theEObject;
				T result = caseTopLevelCatalogueEntry(topLevelCatalogueEntry);
				if (result == null) result = caseRepositoryConcept(topLevelCatalogueEntry);
				if (result == null) result = caseModelEntity(topLevelCatalogueEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iso20022Package.REPOSITORY_CONCEPT: {
				RepositoryConcept repositoryConcept = (RepositoryConcept)theEObject;
				T result = caseRepositoryConcept(repositoryConcept);
				if (result == null) result = caseModelEntity(repositoryConcept);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iso20022Package.SEMANTIC_MARKUP: {
				SemanticMarkup semanticMarkup = (SemanticMarkup)theEObject;
				T result = caseSemanticMarkup(semanticMarkup);
				if (result == null) result = caseModelEntity(semanticMarkup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iso20022Package.SEMANTIC_MARKUP_ELEMENT: {
				SemanticMarkupElement semanticMarkupElement = (SemanticMarkupElement)theEObject;
				T result = caseSemanticMarkupElement(semanticMarkupElement);
				if (result == null) result = caseModelEntity(semanticMarkupElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iso20022Package.DOCLET: {
				Doclet doclet = (Doclet)theEObject;
				T result = caseDoclet(doclet);
				if (result == null) result = caseModelEntity(doclet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iso20022Package.CONSTRAINT: {
				Constraint constraint = (Constraint)theEObject;
				T result = caseConstraint(constraint);
				if (result == null) result = caseRepositoryConcept(constraint);
				if (result == null) result = caseModelEntity(constraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iso20022Package.BUSINESS_PROCESS_CATALOGUE: {
				BusinessProcessCatalogue businessProcessCatalogue = (BusinessProcessCatalogue)theEObject;
				T result = caseBusinessProcessCatalogue(businessProcessCatalogue);
				if (result == null) result = caseModelEntity(businessProcessCatalogue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iso20022Package.REPOSITORY: {
				Repository repository = (Repository)theEObject;
				T result = caseRepository(repository);
				if (result == null) result = caseModelEntity(repository);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iso20022Package.DATA_DICTIONARY: {
				DataDictionary dataDictionary = (DataDictionary)theEObject;
				T result = caseDataDictionary(dataDictionary);
				if (result == null) result = caseModelEntity(dataDictionary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iso20022Package.TOP_LEVEL_DICTIONARY_ENTRY: {
				TopLevelDictionaryEntry topLevelDictionaryEntry = (TopLevelDictionaryEntry)theEObject;
				T result = caseTopLevelDictionaryEntry(topLevelDictionaryEntry);
				if (result == null) result = caseRepositoryConcept(topLevelDictionaryEntry);
				if (result == null) result = caseModelEntity(topLevelDictionaryEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iso20022Package.MESSAGE_DEFINITION: {
				MessageDefinition messageDefinition = (MessageDefinition)theEObject;
				T result = caseMessageDefinition(messageDefinition);
				if (result == null) result = caseRepositoryType(messageDefinition);
				if (result == null) result = caseRepositoryConcept(messageDefinition);
				if (result == null) result = caseModelEntity(messageDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iso20022Package.REPOSITORY_TYPE: {
				RepositoryType repositoryType = (RepositoryType)theEObject;
				T result = caseRepositoryType(repositoryType);
				if (result == null) result = caseRepositoryConcept(repositoryType);
				if (result == null) result = caseModelEntity(repositoryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iso20022Package.MESSAGE_SET: {
				MessageSet messageSet = (MessageSet)theEObject;
				T result = caseMessageSet(messageSet);
				if (result == null) result = caseTopLevelCatalogueEntry(messageSet);
				if (result == null) result = caseRepositoryConcept(messageSet);
				if (result == null) result = caseModelEntity(messageSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iso20022Package.SYNTAX: {
				Syntax syntax = (Syntax)theEObject;
				T result = caseSyntax(syntax);
				if (result == null) result = caseModelEntity(syntax);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iso20022Package.ENCODING: {
				Encoding encoding = (Encoding)theEObject;
				T result = caseEncoding(encoding);
				if (result == null) result = caseModelEntity(encoding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iso20022Package.BUSINESS_AREA: {
				BusinessArea businessArea = (BusinessArea)theEObject;
				T result = caseBusinessArea(businessArea);
				if (result == null) result = caseTopLevelCatalogueEntry(businessArea);
				if (result == null) result = caseRepositoryConcept(businessArea);
				if (result == null) result = caseModelEntity(businessArea);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iso20022Package.XOR: {
				Xor xor = (Xor)theEObject;
				T result = caseXor(xor);
				if (result == null) result = caseRepositoryConcept(xor);
				if (result == null) result = caseModelEntity(xor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iso20022Package.MESSAGE_ELEMENT: {
				MessageElement messageElement = (MessageElement)theEObject;
				T result = caseMessageElement(messageElement);
				if (result == null) result = caseMessageConstruct(messageElement);
				if (result == null) result = caseMessageConcept(messageElement);
				if (result == null) result = caseConstruct(messageElement);
				if (result == null) result = caseRepositoryConcept(messageElement);
				if (result == null) result = caseMultiplicityEntity(messageElement);
				if (result == null) result = caseModelEntity(messageElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iso20022Package.MESSAGE_CONSTRUCT: {
				MessageConstruct messageConstruct = (MessageConstruct)theEObject;
				T result = caseMessageConstruct(messageConstruct);
				if (result == null) result = caseConstruct(messageConstruct);
				if (result == null) result = caseRepositoryConcept(messageConstruct);
				if (result == null) result = caseMultiplicityEntity(messageConstruct);
				if (result == null) result = caseModelEntity(messageConstruct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iso20022Package.CONSTRUCT: {
				Construct construct = (Construct)theEObject;
				T result = caseConstruct(construct);
				if (result == null) result = caseRepositoryConcept(construct);
				if (result == null) result = caseMultiplicityEntity(construct);
				if (result == null) result = caseModelEntity(construct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iso20022Package.MULTIPLICITY_ENTITY: {
				MultiplicityEntity multiplicityEntity = (MultiplicityEntity)theEObject;
				T result = caseMultiplicityEntity(multiplicityEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iso20022Package.LOGICAL_TYPE: {
				LogicalType logicalType = (LogicalType)theEObject;
				T result = caseLogicalType(logicalType);
				if (result == null) result = caseRepositoryType(logicalType);
				if (result == null) result = caseRepositoryConcept(logicalType);
				if (result == null) result = caseModelEntity(logicalType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iso20022Package.MESSAGE_CONCEPT: {
				MessageConcept messageConcept = (MessageConcept)theEObject;
				T result = caseMessageConcept(messageConcept);
				if (result == null) result = caseModelEntity(messageConcept);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iso20022Package.BUSINESS_COMPONENT: {
				BusinessComponent businessComponent = (BusinessComponent)theEObject;
				T result = caseBusinessComponent(businessComponent);
				if (result == null) result = caseTopLevelDictionaryEntry(businessComponent);
				if (result == null) result = caseBusinessElementType(businessComponent);
				if (result == null) result = caseBusinessConcept(businessComponent);
				if (result == null) result = caseRepositoryType(businessComponent);
				if (result == null) result = caseRepositoryConcept(businessComponent);
				if (result == null) result = caseModelEntity(businessComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iso20022Package.BUSINESS_ELEMENT_TYPE: {
				BusinessElementType businessElementType = (BusinessElementType)theEObject;
				T result = caseBusinessElementType(businessElementType);
				if (result == null) result = caseRepositoryType(businessElementType);
				if (result == null) result = caseRepositoryConcept(businessElementType);
				if (result == null) result = caseModelEntity(businessElementType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iso20022Package.BUSINESS_CONCEPT: {
				BusinessConcept businessConcept = (BusinessConcept)theEObject;
				T result = caseBusinessConcept(businessConcept);
				if (result == null) result = caseModelEntity(businessConcept);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iso20022Package.BUSINESS_ELEMENT: {
				BusinessElement businessElement = (BusinessElement)theEObject;
				T result = caseBusinessElement(businessElement);
				if (result == null) result = caseConstruct(businessElement);
				if (result == null) result = caseBusinessConcept(businessElement);
				if (result == null) result = caseRepositoryConcept(businessElement);
				if (result == null) result = caseMultiplicityEntity(businessElement);
				if (result == null) result = caseModelEntity(businessElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iso20022Package.MESSAGE_COMPONENT_TYPE: {
				MessageComponentType messageComponentType = (MessageComponentType)theEObject;
				T result = caseMessageComponentType(messageComponentType);
				if (result == null) result = caseTopLevelDictionaryEntry(messageComponentType);
				if (result == null) result = caseLogicalType(messageComponentType);
				if (result == null) result = caseMessageConcept(messageComponentType);
				if (result == null) result = caseRepositoryType(messageComponentType);
				if (result == null) result = caseRepositoryConcept(messageComponentType);
				if (result == null) result = caseModelEntity(messageComponentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iso20022Package.MESSAGE_BUILDING_BLOCK: {
				MessageBuildingBlock messageBuildingBlock = (MessageBuildingBlock)theEObject;
				T result = caseMessageBuildingBlock(messageBuildingBlock);
				if (result == null) result = caseMessageConstruct(messageBuildingBlock);
				if (result == null) result = caseConstruct(messageBuildingBlock);
				if (result == null) result = caseRepositoryConcept(messageBuildingBlock);
				if (result == null) result = caseMultiplicityEntity(messageBuildingBlock);
				if (result == null) result = caseModelEntity(messageBuildingBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iso20022Package.DATA_TYPE: {
				DataType dataType = (DataType)theEObject;
				T result = caseDataType(dataType);
				if (result == null) result = caseTopLevelDictionaryEntry(dataType);
				if (result == null) result = caseBusinessElementType(dataType);
				if (result == null) result = caseLogicalType(dataType);
				if (result == null) result = caseRepositoryType(dataType);
				if (result == null) result = caseRepositoryConcept(dataType);
				if (result == null) result = caseModelEntity(dataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iso20022Package.BUSINESS_ASSOCIATION_END: {
				BusinessAssociationEnd businessAssociationEnd = (BusinessAssociationEnd)theEObject;
				T result = caseBusinessAssociationEnd(businessAssociationEnd);
				if (result == null) result = caseBusinessElement(businessAssociationEnd);
				if (result == null) result = caseConstruct(businessAssociationEnd);
				if (result == null) result = caseBusinessConcept(businessAssociationEnd);
				if (result == null) result = caseRepositoryConcept(businessAssociationEnd);
				if (result == null) result = caseMultiplicityEntity(businessAssociationEnd);
				if (result == null) result = caseModelEntity(businessAssociationEnd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iso20022Package.MESSAGE_ELEMENT_CONTAINER: {
				MessageElementContainer messageElementContainer = (MessageElementContainer)theEObject;
				T result = caseMessageElementContainer(messageElementContainer);
				if (result == null) result = caseMessageComponentType(messageElementContainer);
				if (result == null) result = caseTopLevelDictionaryEntry(messageElementContainer);
				if (result == null) result = caseLogicalType(messageElementContainer);
				if (result == null) result = caseMessageConcept(messageElementContainer);
				if (result == null) result = caseRepositoryType(messageElementContainer);
				if (result == null) result = caseRepositoryConcept(messageElementContainer);
				if (result == null) result = caseModelEntity(messageElementContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iso20022Package.MESSAGE_COMPONENT: {
				MessageComponent messageComponent = (MessageComponent)theEObject;
				T result = caseMessageComponent(messageComponent);
				if (result == null) result = caseMessageElementContainer(messageComponent);
				if (result == null) result = caseMessageComponentType(messageComponent);
				if (result == null) result = caseTopLevelDictionaryEntry(messageComponent);
				if (result == null) result = caseLogicalType(messageComponent);
				if (result == null) result = caseMessageConcept(messageComponent);
				if (result == null) result = caseRepositoryType(messageComponent);
				if (result == null) result = caseRepositoryConcept(messageComponent);
				if (result == null) result = caseModelEntity(messageComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iso20022Package.MESSAGE_CHOREOGRAPHY: {
				MessageChoreography messageChoreography = (MessageChoreography)theEObject;
				T result = caseMessageChoreography(messageChoreography);
				if (result == null) result = caseTopLevelCatalogueEntry(messageChoreography);
				if (result == null) result = caseRepositoryConcept(messageChoreography);
				if (result == null) result = caseModelEntity(messageChoreography);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iso20022Package.BUSINESS_TRANSACTION: {
				BusinessTransaction businessTransaction = (BusinessTransaction)theEObject;
				T result = caseBusinessTransaction(businessTransaction);
				if (result == null) result = caseTopLevelCatalogueEntry(businessTransaction);
				if (result == null) result = caseRepositoryConcept(businessTransaction);
				if (result == null) result = caseModelEntity(businessTransaction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iso20022Package.BUSINESS_PROCESS: {
				BusinessProcess businessProcess = (BusinessProcess)theEObject;
				T result = caseBusinessProcess(businessProcess);
				if (result == null) result = caseTopLevelCatalogueEntry(businessProcess);
				if (result == null) result = caseRepositoryConcept(businessProcess);
				if (result == null) result = caseModelEntity(businessProcess);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iso20022Package.BUSINESS_ROLE: {
				BusinessRole businessRole = (BusinessRole)theEObject;
				T result = caseBusinessRole(businessRole);
				if (result == null) result = caseRepositoryConcept(businessRole);
				if (result == null) result = caseModelEntity(businessRole);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iso20022Package.PARTICIPANT: {
				Participant participant = (Participant)theEObject;
				T result = caseParticipant(participant);
				if (result == null) result = caseRepositoryConcept(participant);
				if (result == null) result = caseMultiplicityEntity(participant);
				if (result == null) result = caseModelEntity(participant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iso20022Package.RECEIVE: {
				Receive receive = (Receive)theEObject;
				T result = caseReceive(receive);
				if (result == null) result = caseModelEntity(receive);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iso20022Package.MESSAGE_TRANSMISSION: {
				MessageTransmission messageTransmission = (MessageTransmission)theEObject;
				T result = caseMessageTransmission(messageTransmission);
				if (result == null) result = caseRepositoryConcept(messageTransmission);
				if (result == null) result = caseModelEntity(messageTransmission);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iso20022Package.SEND: {
				Send send = (Send)theEObject;
				T result = caseSend(send);
				if (result == null) result = caseModelEntity(send);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iso20022Package.MESSAGE_TRANSPORT_MODE: {
				MessageTransportMode messageTransportMode = (MessageTransportMode)theEObject;
				T result = caseMessageTransportMode(messageTransportMode);
				if (result == null) result = caseTopLevelCatalogueEntry(messageTransportMode);
				if (result == null) result = caseRepositoryConcept(messageTransportMode);
				if (result == null) result = caseModelEntity(messageTransportMode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iso20022Package.MESSAGE_DEFINITION_IDENTIFIER: {
				MessageDefinitionIdentifier messageDefinitionIdentifier = (MessageDefinitionIdentifier)theEObject;
				T result = caseMessageDefinitionIdentifier(messageDefinitionIdentifier);
				if (result == null) result = caseModelEntity(messageDefinitionIdentifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iso20022Package.CONVERSATION: {
				Conversation conversation = (Conversation)theEObject;
				T result = caseConversation(conversation);
				if (result == null) result = caseModelEntity(conversation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iso20022Package.MESSAGE_ASSOCIATION_END: {
				MessageAssociationEnd messageAssociationEnd = (MessageAssociationEnd)theEObject;
				T result = caseMessageAssociationEnd(messageAssociationEnd);
				if (result == null) result = caseMessageElement(messageAssociationEnd);
				if (result == null) result = caseMessageConstruct(messageAssociationEnd);
				if (result == null) result = caseMessageConcept(messageAssociationEnd);
				if (result == null) result = caseConstruct(messageAssociationEnd);
				if (result == null) result = caseRepositoryConcept(messageAssociationEnd);
				if (result == null) result = caseMultiplicityEntity(messageAssociationEnd);
				if (result == null) result = caseModelEntity(messageAssociationEnd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iso20022Package.MESSAGE_ATTRIBUTE: {
				MessageAttribute messageAttribute = (MessageAttribute)theEObject;
				T result = caseMessageAttribute(messageAttribute);
				if (result == null) result = caseMessageElement(messageAttribute);
				if (result == null) result = caseMessageConstruct(messageAttribute);
				if (result == null) result = caseMessageConcept(messageAttribute);
				if (result == null) result = caseConstruct(messageAttribute);
				if (result == null) result = caseRepositoryConcept(messageAttribute);
				if (result == null) result = caseMultiplicityEntity(messageAttribute);
				if (result == null) result = caseModelEntity(messageAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iso20022Package.BUSINESS_ATTRIBUTE: {
				BusinessAttribute businessAttribute = (BusinessAttribute)theEObject;
				T result = caseBusinessAttribute(businessAttribute);
				if (result == null) result = caseBusinessElement(businessAttribute);
				if (result == null) result = caseConstruct(businessAttribute);
				if (result == null) result = caseBusinessConcept(businessAttribute);
				if (result == null) result = caseRepositoryConcept(businessAttribute);
				if (result == null) result = caseMultiplicityEntity(businessAttribute);
				if (result == null) result = caseModelEntity(businessAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iso20022Package.TEXT: {
				Text text = (Text)theEObject;
				T result = caseText(text);
				if (result == null) result = caseString(text);
				if (result == null) result = caseDataType(text);
				if (result == null) result = caseTopLevelDictionaryEntry(text);
				if (result == null) result = caseBusinessElementType(text);
				if (result == null) result = caseLogicalType(text);
				if (result == null) result = caseRepositoryType(text);
				if (result == null) result = caseRepositoryConcept(text);
				if (result == null) result = caseModelEntity(text);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iso20022Package.STRING: {
				iso20022.String string = (iso20022.String)theEObject;
				T result = caseString(string);
				if (result == null) result = caseDataType(string);
				if (result == null) result = caseTopLevelDictionaryEntry(string);
				if (result == null) result = caseBusinessElementType(string);
				if (result == null) result = caseLogicalType(string);
				if (result == null) result = caseRepositoryType(string);
				if (result == null) result = caseRepositoryConcept(string);
				if (result == null) result = caseModelEntity(string);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iso20022Package.IDENTIFIER_SET: {
				IdentifierSet identifierSet = (IdentifierSet)theEObject;
				T result = caseIdentifierSet(identifierSet);
				if (result == null) result = caseString(identifierSet);
				if (result == null) result = caseDataType(identifierSet);
				if (result == null) result = caseTopLevelDictionaryEntry(identifierSet);
				if (result == null) result = caseBusinessElementType(identifierSet);
				if (result == null) result = caseLogicalType(identifierSet);
				if (result == null) result = caseRepositoryType(identifierSet);
				if (result == null) result = caseRepositoryConcept(identifierSet);
				if (result == null) result = caseModelEntity(identifierSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iso20022Package.INDICATOR: {
				Indicator indicator = (Indicator)theEObject;
				T result = caseIndicator(indicator);
				if (result == null) result = caseBoolean(indicator);
				if (result == null) result = caseDataType(indicator);
				if (result == null) result = caseTopLevelDictionaryEntry(indicator);
				if (result == null) result = caseBusinessElementType(indicator);
				if (result == null) result = caseLogicalType(indicator);
				if (result == null) result = caseRepositoryType(indicator);
				if (result == null) result = caseRepositoryConcept(indicator);
				if (result == null) result = caseModelEntity(indicator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iso20022Package.BOOLEAN: {
				iso20022.Boolean boolean_ = (iso20022.Boolean)theEObject;
				T result = caseBoolean(boolean_);
				if (result == null) result = caseDataType(boolean_);
				if (result == null) result = caseTopLevelDictionaryEntry(boolean_);
				if (result == null) result = caseBusinessElementType(boolean_);
				if (result == null) result = caseLogicalType(boolean_);
				if (result == null) result = caseRepositoryType(boolean_);
				if (result == null) result = caseRepositoryConcept(boolean_);
				if (result == null) result = caseModelEntity(boolean_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iso20022Package.RATE: {
				Rate rate = (Rate)theEObject;
				T result = caseRate(rate);
				if (result == null) result = caseDecimal(rate);
				if (result == null) result = caseDataType(rate);
				if (result == null) result = caseTopLevelDictionaryEntry(rate);
				if (result == null) result = caseBusinessElementType(rate);
				if (result == null) result = caseLogicalType(rate);
				if (result == null) result = caseRepositoryType(rate);
				if (result == null) result = caseRepositoryConcept(rate);
				if (result == null) result = caseModelEntity(rate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iso20022Package.DECIMAL: {
				Decimal decimal = (Decimal)theEObject;
				T result = caseDecimal(decimal);
				if (result == null) result = caseDataType(decimal);
				if (result == null) result = caseTopLevelDictionaryEntry(decimal);
				if (result == null) result = caseBusinessElementType(decimal);
				if (result == null) result = caseLogicalType(decimal);
				if (result == null) result = caseRepositoryType(decimal);
				if (result == null) result = caseRepositoryConcept(decimal);
				if (result == null) result = caseModelEntity(decimal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iso20022Package.EXTERNAL_SCHEMA: {
				ExternalSchema externalSchema = (ExternalSchema)theEObject;
				T result = caseExternalSchema(externalSchema);
				if (result == null) result = caseMessageComponentType(externalSchema);
				if (result == null) result = caseTopLevelDictionaryEntry(externalSchema);
				if (result == null) result = caseLogicalType(externalSchema);
				if (result == null) result = caseMessageConcept(externalSchema);
				if (result == null) result = caseRepositoryType(externalSchema);
				if (result == null) result = caseRepositoryConcept(externalSchema);
				if (result == null) result = caseModelEntity(externalSchema);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iso20022Package.QUANTITY: {
				Quantity quantity = (Quantity)theEObject;
				T result = caseQuantity(quantity);
				if (result == null) result = caseDecimal(quantity);
				if (result == null) result = caseDataType(quantity);
				if (result == null) result = caseTopLevelDictionaryEntry(quantity);
				if (result == null) result = caseBusinessElementType(quantity);
				if (result == null) result = caseLogicalType(quantity);
				if (result == null) result = caseRepositoryType(quantity);
				if (result == null) result = caseRepositoryConcept(quantity);
				if (result == null) result = caseModelEntity(quantity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iso20022Package.CODE: {
				Code code = (Code)theEObject;
				T result = caseCode(code);
				if (result == null) result = caseRepositoryConcept(code);
				if (result == null) result = caseModelEntity(code);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iso20022Package.CODE_SET: {
				CodeSet codeSet = (CodeSet)theEObject;
				T result = caseCodeSet(codeSet);
				if (result == null) result = caseString(codeSet);
				if (result == null) result = caseDataType(codeSet);
				if (result == null) result = caseTopLevelDictionaryEntry(codeSet);
				if (result == null) result = caseBusinessElementType(codeSet);
				if (result == null) result = caseLogicalType(codeSet);
				if (result == null) result = caseRepositoryType(codeSet);
				if (result == null) result = caseRepositoryConcept(codeSet);
				if (result == null) result = caseModelEntity(codeSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iso20022Package.AMOUNT: {
				Amount amount = (Amount)theEObject;
				T result = caseAmount(amount);
				if (result == null) result = caseDecimal(amount);
				if (result == null) result = caseDataType(amount);
				if (result == null) result = caseTopLevelDictionaryEntry(amount);
				if (result == null) result = caseBusinessElementType(amount);
				if (result == null) result = caseLogicalType(amount);
				if (result == null) result = caseRepositoryType(amount);
				if (result == null) result = caseRepositoryConcept(amount);
				if (result == null) result = caseModelEntity(amount);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iso20022Package.CHOICE_COMPONENT: {
				ChoiceComponent choiceComponent = (ChoiceComponent)theEObject;
				T result = caseChoiceComponent(choiceComponent);
				if (result == null) result = caseMessageElementContainer(choiceComponent);
				if (result == null) result = caseMessageComponentType(choiceComponent);
				if (result == null) result = caseTopLevelDictionaryEntry(choiceComponent);
				if (result == null) result = caseLogicalType(choiceComponent);
				if (result == null) result = caseMessageConcept(choiceComponent);
				if (result == null) result = caseRepositoryType(choiceComponent);
				if (result == null) result = caseRepositoryConcept(choiceComponent);
				if (result == null) result = caseModelEntity(choiceComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iso20022Package.ABSTRACT_DATE_TIME_CONCEPT: {
				AbstractDateTimeConcept abstractDateTimeConcept = (AbstractDateTimeConcept)theEObject;
				T result = caseAbstractDateTimeConcept(abstractDateTimeConcept);
				if (result == null) result = caseDataType(abstractDateTimeConcept);
				if (result == null) result = caseTopLevelDictionaryEntry(abstractDateTimeConcept);
				if (result == null) result = caseBusinessElementType(abstractDateTimeConcept);
				if (result == null) result = caseLogicalType(abstractDateTimeConcept);
				if (result == null) result = caseRepositoryType(abstractDateTimeConcept);
				if (result == null) result = caseRepositoryConcept(abstractDateTimeConcept);
				if (result == null) result = caseModelEntity(abstractDateTimeConcept);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iso20022Package.END_POINT_CATEGORY: {
				EndPointCategory endPointCategory = (EndPointCategory)theEObject;
				T result = caseEndPointCategory(endPointCategory);
				if (result == null) result = caseTopLevelDictionaryEntry(endPointCategory);
				if (result == null) result = caseRepositoryConcept(endPointCategory);
				if (result == null) result = caseModelEntity(endPointCategory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iso20022Package.BINARY: {
				Binary binary = (Binary)theEObject;
				T result = caseBinary(binary);
				if (result == null) result = caseDataType(binary);
				if (result == null) result = caseTopLevelDictionaryEntry(binary);
				if (result == null) result = caseBusinessElementType(binary);
				if (result == null) result = caseLogicalType(binary);
				if (result == null) result = caseRepositoryType(binary);
				if (result == null) result = caseRepositoryConcept(binary);
				if (result == null) result = caseModelEntity(binary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iso20022Package.DATE: {
				Date date = (Date)theEObject;
				T result = caseDate(date);
				if (result == null) result = caseAbstractDateTimeConcept(date);
				if (result == null) result = caseDataType(date);
				if (result == null) result = caseTopLevelDictionaryEntry(date);
				if (result == null) result = caseBusinessElementType(date);
				if (result == null) result = caseLogicalType(date);
				if (result == null) result = caseRepositoryType(date);
				if (result == null) result = caseRepositoryConcept(date);
				if (result == null) result = caseModelEntity(date);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iso20022Package.DATE_TIME: {
				DateTime dateTime = (DateTime)theEObject;
				T result = caseDateTime(dateTime);
				if (result == null) result = caseAbstractDateTimeConcept(dateTime);
				if (result == null) result = caseDataType(dateTime);
				if (result == null) result = caseTopLevelDictionaryEntry(dateTime);
				if (result == null) result = caseBusinessElementType(dateTime);
				if (result == null) result = caseLogicalType(dateTime);
				if (result == null) result = caseRepositoryType(dateTime);
				if (result == null) result = caseRepositoryConcept(dateTime);
				if (result == null) result = caseModelEntity(dateTime);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iso20022Package.DAY: {
				Day day = (Day)theEObject;
				T result = caseDay(day);
				if (result == null) result = caseAbstractDateTimeConcept(day);
				if (result == null) result = caseDataType(day);
				if (result == null) result = caseTopLevelDictionaryEntry(day);
				if (result == null) result = caseBusinessElementType(day);
				if (result == null) result = caseLogicalType(day);
				if (result == null) result = caseRepositoryType(day);
				if (result == null) result = caseRepositoryConcept(day);
				if (result == null) result = caseModelEntity(day);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iso20022Package.DURATION: {
				Duration duration = (Duration)theEObject;
				T result = caseDuration(duration);
				if (result == null) result = caseAbstractDateTimeConcept(duration);
				if (result == null) result = caseDataType(duration);
				if (result == null) result = caseTopLevelDictionaryEntry(duration);
				if (result == null) result = caseBusinessElementType(duration);
				if (result == null) result = caseLogicalType(duration);
				if (result == null) result = caseRepositoryType(duration);
				if (result == null) result = caseRepositoryConcept(duration);
				if (result == null) result = caseModelEntity(duration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iso20022Package.MONTH: {
				Month month = (Month)theEObject;
				T result = caseMonth(month);
				if (result == null) result = caseAbstractDateTimeConcept(month);
				if (result == null) result = caseDataType(month);
				if (result == null) result = caseTopLevelDictionaryEntry(month);
				if (result == null) result = caseBusinessElementType(month);
				if (result == null) result = caseLogicalType(month);
				if (result == null) result = caseRepositoryType(month);
				if (result == null) result = caseRepositoryConcept(month);
				if (result == null) result = caseModelEntity(month);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iso20022Package.MONTH_DAY: {
				MonthDay monthDay = (MonthDay)theEObject;
				T result = caseMonthDay(monthDay);
				if (result == null) result = caseAbstractDateTimeConcept(monthDay);
				if (result == null) result = caseDataType(monthDay);
				if (result == null) result = caseTopLevelDictionaryEntry(monthDay);
				if (result == null) result = caseBusinessElementType(monthDay);
				if (result == null) result = caseLogicalType(monthDay);
				if (result == null) result = caseRepositoryType(monthDay);
				if (result == null) result = caseRepositoryConcept(monthDay);
				if (result == null) result = caseModelEntity(monthDay);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iso20022Package.TIME: {
				Time time = (Time)theEObject;
				T result = caseTime(time);
				if (result == null) result = caseAbstractDateTimeConcept(time);
				if (result == null) result = caseDataType(time);
				if (result == null) result = caseTopLevelDictionaryEntry(time);
				if (result == null) result = caseBusinessElementType(time);
				if (result == null) result = caseLogicalType(time);
				if (result == null) result = caseRepositoryType(time);
				if (result == null) result = caseRepositoryConcept(time);
				if (result == null) result = caseModelEntity(time);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iso20022Package.YEAR: {
				Year year = (Year)theEObject;
				T result = caseYear(year);
				if (result == null) result = caseAbstractDateTimeConcept(year);
				if (result == null) result = caseDataType(year);
				if (result == null) result = caseTopLevelDictionaryEntry(year);
				if (result == null) result = caseBusinessElementType(year);
				if (result == null) result = caseLogicalType(year);
				if (result == null) result = caseRepositoryType(year);
				if (result == null) result = caseRepositoryConcept(year);
				if (result == null) result = caseModelEntity(year);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iso20022Package.YEAR_MONTH: {
				YearMonth yearMonth = (YearMonth)theEObject;
				T result = caseYearMonth(yearMonth);
				if (result == null) result = caseAbstractDateTimeConcept(yearMonth);
				if (result == null) result = caseDataType(yearMonth);
				if (result == null) result = caseTopLevelDictionaryEntry(yearMonth);
				if (result == null) result = caseBusinessElementType(yearMonth);
				if (result == null) result = caseLogicalType(yearMonth);
				if (result == null) result = caseRepositoryType(yearMonth);
				if (result == null) result = caseRepositoryConcept(yearMonth);
				if (result == null) result = caseModelEntity(yearMonth);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iso20022Package.USER_DEFINED: {
				UserDefined userDefined = (UserDefined)theEObject;
				T result = caseUserDefined(userDefined);
				if (result == null) result = caseMessageComponentType(userDefined);
				if (result == null) result = caseTopLevelDictionaryEntry(userDefined);
				if (result == null) result = caseLogicalType(userDefined);
				if (result == null) result = caseMessageConcept(userDefined);
				if (result == null) result = caseRepositoryType(userDefined);
				if (result == null) result = caseRepositoryConcept(userDefined);
				if (result == null) result = caseModelEntity(userDefined);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iso20022Package.INDUSTRY_MESSAGE_SET: {
				IndustryMessageSet industryMessageSet = (IndustryMessageSet)theEObject;
				T result = caseIndustryMessageSet(industryMessageSet);
				if (result == null) result = caseTopLevelCatalogueEntry(industryMessageSet);
				if (result == null) result = caseRepositoryConcept(industryMessageSet);
				if (result == null) result = caseModelEntity(industryMessageSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iso20022Package.CONVERGENCE_DOCUMENTATION: {
				ConvergenceDocumentation convergenceDocumentation = (ConvergenceDocumentation)theEObject;
				T result = caseConvergenceDocumentation(convergenceDocumentation);
				if (result == null) result = caseTopLevelCatalogueEntry(convergenceDocumentation);
				if (result == null) result = caseRepositoryConcept(convergenceDocumentation);
				if (result == null) result = caseModelEntity(convergenceDocumentation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iso20022Package.ISO15022_MESSAGE_SET: {
				ISO15022MessageSet iso15022MessageSet = (ISO15022MessageSet)theEObject;
				T result = caseISO15022MessageSet(iso15022MessageSet);
				if (result == null) result = caseIndustryMessageSet(iso15022MessageSet);
				if (result == null) result = caseTopLevelCatalogueEntry(iso15022MessageSet);
				if (result == null) result = caseRepositoryConcept(iso15022MessageSet);
				if (result == null) result = caseModelEntity(iso15022MessageSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Iso20022Package.SCHEMA_TYPE: {
				SchemaType schemaType = (SchemaType)theEObject;
				T result = caseSchemaType(schemaType);
				if (result == null) result = caseDataType(schemaType);
				if (result == null) result = caseTopLevelDictionaryEntry(schemaType);
				if (result == null) result = caseBusinessElementType(schemaType);
				if (result == null) result = caseLogicalType(schemaType);
				if (result == null) result = caseRepositoryType(schemaType);
				if (result == null) result = caseRepositoryConcept(schemaType);
				if (result == null) result = caseModelEntity(schemaType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Address</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Address</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddress(Address object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelEntity(ModelEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Broadcast List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Broadcast List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBroadcastList(BroadcastList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Messaging Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Messaging Endpoint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessagingEndpoint(MessagingEndpoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Transport System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Transport System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageTransportSystem(MessageTransportSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transport Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transport Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransportMessage(TransportMessage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageInstance(MessageInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Syntax Message Scheme</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Syntax Message Scheme</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSyntaxMessageScheme(SyntaxMessageScheme object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Top Level Catalogue Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Top Level Catalogue Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTopLevelCatalogueEntry(TopLevelCatalogueEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Repository Concept</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Repository Concept</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRepositoryConcept(RepositoryConcept object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Semantic Markup</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Semantic Markup</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSemanticMarkup(SemanticMarkup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Semantic Markup Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Semantic Markup Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSemanticMarkupElement(SemanticMarkupElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Doclet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Doclet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDoclet(Doclet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraint(Constraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Business Process Catalogue</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Business Process Catalogue</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBusinessProcessCatalogue(BusinessProcessCatalogue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Repository</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Repository</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRepository(Repository object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Dictionary</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Dictionary</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataDictionary(DataDictionary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Top Level Dictionary Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Top Level Dictionary Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTopLevelDictionaryEntry(TopLevelDictionaryEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageDefinition(MessageDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Repository Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Repository Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRepositoryType(RepositoryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageSet(MessageSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Syntax</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Syntax</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSyntax(Syntax object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Encoding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encoding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncoding(Encoding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Business Area</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Business Area</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBusinessArea(BusinessArea object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Xor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Xor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXor(Xor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageElement(MessageElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Construct</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Construct</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageConstruct(MessageConstruct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Construct</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Construct</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstruct(Construct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multiplicity Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiplicity Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiplicityEntity(MultiplicityEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logical Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logical Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogicalType(LogicalType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Concept</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Concept</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageConcept(MessageConcept object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Business Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Business Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBusinessComponent(BusinessComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Business Element Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Business Element Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBusinessElementType(BusinessElementType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Business Concept</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Business Concept</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBusinessConcept(BusinessConcept object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Business Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Business Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBusinessElement(BusinessElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Component Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Component Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageComponentType(MessageComponentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Building Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Building Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageBuildingBlock(MessageBuildingBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataType(DataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Business Association End</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Business Association End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBusinessAssociationEnd(BusinessAssociationEnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Element Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Element Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageElementContainer(MessageElementContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageComponent(MessageComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Choreography</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Choreography</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageChoreography(MessageChoreography object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Business Transaction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Business Transaction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBusinessTransaction(BusinessTransaction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Business Process</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Business Process</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBusinessProcess(BusinessProcess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Business Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Business Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBusinessRole(BusinessRole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Participant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Participant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParticipant(Participant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Receive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Receive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReceive(Receive object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Transmission</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Transmission</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageTransmission(MessageTransmission object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Send</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Send</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSend(Send object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Transport Mode</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Transport Mode</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageTransportMode(MessageTransportMode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Definition Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Definition Identifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageDefinitionIdentifier(MessageDefinitionIdentifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conversation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conversation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConversation(Conversation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Association End</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Association End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageAssociationEnd(MessageAssociationEnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageAttribute(MessageAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Business Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Business Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBusinessAttribute(BusinessAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseText(Text object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseString(iso20022.String object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifier Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifier Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifierSet(IdentifierSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Indicator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Indicator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndicator(Indicator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoolean(iso20022.Boolean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRate(Rate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decimal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decimal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDecimal(Decimal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Schema</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Schema</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalSchema(ExternalSchema object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quantity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quantity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuantity(Quantity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCode(Code object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeSet(CodeSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Amount</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Amount</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAmount(Amount object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Choice Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Choice Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChoiceComponent(ChoiceComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Date Time Concept</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Date Time Concept</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractDateTimeConcept(AbstractDateTimeConcept object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>End Point Category</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>End Point Category</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEndPointCategory(EndPointCategory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinary(Binary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDate(Date object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date Time</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDateTime(DateTime object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Day</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Day</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDay(Day object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Duration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Duration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDuration(Duration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Month</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Month</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMonth(Month object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Month Day</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Month Day</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMonthDay(MonthDay object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTime(Time object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Year</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Year</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYear(Year object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Year Month</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Year Month</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYearMonth(YearMonth object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Defined</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Defined</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserDefined(UserDefined object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Industry Message Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Industry Message Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndustryMessageSet(IndustryMessageSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Convergence Documentation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Convergence Documentation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConvergenceDocumentation(ConvergenceDocumentation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISO15022 Message Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISO15022 Message Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISO15022MessageSet(ISO15022MessageSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Schema Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schema Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchemaType(SchemaType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //Iso20022Switch
