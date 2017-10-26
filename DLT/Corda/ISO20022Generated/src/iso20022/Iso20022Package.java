/**
 */
package iso20022;

import java.lang.String;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see iso20022.Iso20022Factory
 * @model kind="package"
 *        annotation="urn:iso:std:iso:20022:2013:ecore:extension basis='IMPLEMENTATION_CONSTRAINTS' description='#1. namespace uri is urn:iso:std:iso:20022:2013:ecore \r\n#2. ISO20022 meta classes are grouped under a single package. \r\n#3. In the Meta Model, eAttributes are typed with specific EMF DataTypes (EBoolean, EString,...) Those EMF DataTypes are mapped to XSD DataTypes as described in #TODOINSERT REF TO EMF BOOK  \r\n#4. All ISO20022 meta classes extend the abstract meta class ModelEntity that conveys versioning information and the ObjectIdentifier'"
 * @generated
 */
public interface Iso20022Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "iso20022";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "urn:iso:std:iso:20022:2013:ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "iso20022";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Iso20022Package eINSTANCE = iso20022.impl.Iso20022PackageImpl.init();

	/**
	 * The meta object id for the '{@link iso20022.impl.ModelEntityImpl <em>Model Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso20022.impl.ModelEntityImpl
	 * @see iso20022.impl.Iso20022PackageImpl#getModelEntity()
	 * @generated
	 */
	int MODEL_ENTITY = 1;

	/**
	 * The feature id for the '<em><b>Next Versions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ENTITY__NEXT_VERSIONS = 0;

	/**
	 * The feature id for the '<em><b>Previous Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ENTITY__PREVIOUS_VERSION = 1;

	/**
	 * The feature id for the '<em><b>Object Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ENTITY__OBJECT_IDENTIFIER = 2;

	/**
	 * The number of structural features of the '<em>Model Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ENTITY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Model Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ENTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso20022.impl.AddressImpl <em>Address</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso20022.impl.AddressImpl
	 * @see iso20022.impl.Iso20022PackageImpl#getAddress()
	 * @generated
	 */
	int ADDRESS = 0;

	/**
	 * The feature id for the '<em><b>Next Versions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__NEXT_VERSIONS = MODEL_ENTITY__NEXT_VERSIONS;

	/**
	 * The feature id for the '<em><b>Previous Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__PREVIOUS_VERSION = MODEL_ENTITY__PREVIOUS_VERSION;

	/**
	 * The feature id for the '<em><b>Object Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__OBJECT_IDENTIFIER = MODEL_ENTITY__OBJECT_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Broad Cast List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__BROAD_CAST_LIST = MODEL_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Endpoint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__ENDPOINT = MODEL_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_FEATURE_COUNT = MODEL_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_OPERATION_COUNT = MODEL_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso20022.impl.BroadcastListImpl <em>Broadcast List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso20022.impl.BroadcastListImpl
	 * @see iso20022.impl.Iso20022PackageImpl#getBroadcastList()
	 * @generated
	 */
	int BROADCAST_LIST = 2;

	/**
	 * The feature id for the '<em><b>Next Versions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROADCAST_LIST__NEXT_VERSIONS = MODEL_ENTITY__NEXT_VERSIONS;

	/**
	 * The feature id for the '<em><b>Previous Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROADCAST_LIST__PREVIOUS_VERSION = MODEL_ENTITY__PREVIOUS_VERSION;

	/**
	 * The feature id for the '<em><b>Object Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROADCAST_LIST__OBJECT_IDENTIFIER = MODEL_ENTITY__OBJECT_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Address</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROADCAST_LIST__ADDRESS = MODEL_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Broadcast List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROADCAST_LIST_FEATURE_COUNT = MODEL_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Broadcast List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROADCAST_LIST_OPERATION_COUNT = MODEL_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso20022.impl.MessagingEndpointImpl <em>Messaging Endpoint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso20022.impl.MessagingEndpointImpl
	 * @see iso20022.impl.Iso20022PackageImpl#getMessagingEndpoint()
	 * @generated
	 */
	int MESSAGING_ENDPOINT = 3;

	/**
	 * The feature id for the '<em><b>Next Versions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGING_ENDPOINT__NEXT_VERSIONS = MODEL_ENTITY__NEXT_VERSIONS;

	/**
	 * The feature id for the '<em><b>Previous Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGING_ENDPOINT__PREVIOUS_VERSION = MODEL_ENTITY__PREVIOUS_VERSION;

	/**
	 * The feature id for the '<em><b>Object Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGING_ENDPOINT__OBJECT_IDENTIFIER = MODEL_ENTITY__OBJECT_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Transport System</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGING_ENDPOINT__TRANSPORT_SYSTEM = MODEL_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Received Message</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGING_ENDPOINT__RECEIVED_MESSAGE = MODEL_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sent Message</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGING_ENDPOINT__SENT_MESSAGE = MODEL_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGING_ENDPOINT__LOCATION = MODEL_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Messaging Endpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGING_ENDPOINT_FEATURE_COUNT = MODEL_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Messaging Endpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGING_ENDPOINT_OPERATION_COUNT = MODEL_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso20022.impl.MessageTransportSystemImpl <em>Message Transport System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso20022.impl.MessageTransportSystemImpl
	 * @see iso20022.impl.Iso20022PackageImpl#getMessageTransportSystem()
	 * @generated
	 */
	int MESSAGE_TRANSPORT_SYSTEM = 4;

	/**
	 * The feature id for the '<em><b>Next Versions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TRANSPORT_SYSTEM__NEXT_VERSIONS = MODEL_ENTITY__NEXT_VERSIONS;

	/**
	 * The feature id for the '<em><b>Previous Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TRANSPORT_SYSTEM__PREVIOUS_VERSION = MODEL_ENTITY__PREVIOUS_VERSION;

	/**
	 * The feature id for the '<em><b>Object Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TRANSPORT_SYSTEM__OBJECT_IDENTIFIER = MODEL_ENTITY__OBJECT_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Endpoint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TRANSPORT_SYSTEM__ENDPOINT = MODEL_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Message Transport System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TRANSPORT_SYSTEM_FEATURE_COUNT = MODEL_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Message Transport System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TRANSPORT_SYSTEM_OPERATION_COUNT = MODEL_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso20022.impl.TransportMessageImpl <em>Transport Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso20022.impl.TransportMessageImpl
	 * @see iso20022.impl.Iso20022PackageImpl#getTransportMessage()
	 * @generated
	 */
	int TRANSPORT_MESSAGE = 5;

	/**
	 * The feature id for the '<em><b>Next Versions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_MESSAGE__NEXT_VERSIONS = MODEL_ENTITY__NEXT_VERSIONS;

	/**
	 * The feature id for the '<em><b>Previous Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_MESSAGE__PREVIOUS_VERSION = MODEL_ENTITY__PREVIOUS_VERSION;

	/**
	 * The feature id for the '<em><b>Object Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_MESSAGE__OBJECT_IDENTIFIER = MODEL_ENTITY__OBJECT_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Sender</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_MESSAGE__SENDER = MODEL_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Message Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_MESSAGE__MESSAGE_INSTANCE = MODEL_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Receiver</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_MESSAGE__RECEIVER = MODEL_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Transport Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_MESSAGE_FEATURE_COUNT = MODEL_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Same Message Transport System</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_MESSAGE___SAME_MESSAGE_TRANSPORT_SYSTEM__MAP_DIAGNOSTICCHAIN = MODEL_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Transport Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_MESSAGE_OPERATION_COUNT = MODEL_ENTITY_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link iso20022.impl.MessageInstanceImpl <em>Message Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso20022.impl.MessageInstanceImpl
	 * @see iso20022.impl.Iso20022PackageImpl#getMessageInstance()
	 * @generated
	 */
	int MESSAGE_INSTANCE = 6;

	/**
	 * The feature id for the '<em><b>Next Versions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_INSTANCE__NEXT_VERSIONS = MODEL_ENTITY__NEXT_VERSIONS;

	/**
	 * The feature id for the '<em><b>Previous Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_INSTANCE__PREVIOUS_VERSION = MODEL_ENTITY__PREVIOUS_VERSION;

	/**
	 * The feature id for the '<em><b>Object Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_INSTANCE__OBJECT_IDENTIFIER = MODEL_ENTITY__OBJECT_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_INSTANCE__SPECIFICATION = MODEL_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Transport Message</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_INSTANCE__TRANSPORT_MESSAGE = MODEL_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Message Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_INSTANCE_FEATURE_COUNT = MODEL_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Message Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_INSTANCE_OPERATION_COUNT = MODEL_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso20022.impl.RepositoryConceptImpl <em>Repository Concept</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso20022.impl.RepositoryConceptImpl
	 * @see iso20022.impl.Iso20022PackageImpl#getRepositoryConcept()
	 * @generated
	 */
	int REPOSITORY_CONCEPT = 9;

	/**
	 * The feature id for the '<em><b>Next Versions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_CONCEPT__NEXT_VERSIONS = MODEL_ENTITY__NEXT_VERSIONS;

	/**
	 * The feature id for the '<em><b>Previous Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_CONCEPT__PREVIOUS_VERSION = MODEL_ENTITY__PREVIOUS_VERSION;

	/**
	 * The feature id for the '<em><b>Object Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_CONCEPT__OBJECT_IDENTIFIER = MODEL_ENTITY__OBJECT_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_CONCEPT__NAME = MODEL_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_CONCEPT__DEFINITION = MODEL_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Semantic Markup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_CONCEPT__SEMANTIC_MARKUP = MODEL_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Doclet</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_CONCEPT__DOCLET = MODEL_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Example</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_CONCEPT__EXAMPLE = MODEL_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_CONCEPT__CONSTRAINT = MODEL_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Registration Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_CONCEPT__REGISTRATION_STATUS = MODEL_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Removal Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_CONCEPT__REMOVAL_DATE = MODEL_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Repository Concept</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_CONCEPT_FEATURE_COUNT = MODEL_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Removal Date Registration Status</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_CONCEPT___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN = MODEL_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Name First Letter Uppercase</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_CONCEPT___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN = MODEL_ENTITY_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Repository Concept</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_CONCEPT_OPERATION_COUNT = MODEL_ENTITY_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link iso20022.impl.TopLevelCatalogueEntryImpl <em>Top Level Catalogue Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso20022.impl.TopLevelCatalogueEntryImpl
	 * @see iso20022.impl.Iso20022PackageImpl#getTopLevelCatalogueEntry()
	 * @generated
	 */
	int TOP_LEVEL_CATALOGUE_ENTRY = 8;

	/**
	 * The feature id for the '<em><b>Next Versions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_CATALOGUE_ENTRY__NEXT_VERSIONS = REPOSITORY_CONCEPT__NEXT_VERSIONS;

	/**
	 * The feature id for the '<em><b>Previous Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_CATALOGUE_ENTRY__PREVIOUS_VERSION = REPOSITORY_CONCEPT__PREVIOUS_VERSION;

	/**
	 * The feature id for the '<em><b>Object Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_CATALOGUE_ENTRY__OBJECT_IDENTIFIER = REPOSITORY_CONCEPT__OBJECT_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_CATALOGUE_ENTRY__NAME = REPOSITORY_CONCEPT__NAME;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_CATALOGUE_ENTRY__DEFINITION = REPOSITORY_CONCEPT__DEFINITION;

	/**
	 * The feature id for the '<em><b>Semantic Markup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_CATALOGUE_ENTRY__SEMANTIC_MARKUP = REPOSITORY_CONCEPT__SEMANTIC_MARKUP;

	/**
	 * The feature id for the '<em><b>Doclet</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_CATALOGUE_ENTRY__DOCLET = REPOSITORY_CONCEPT__DOCLET;

	/**
	 * The feature id for the '<em><b>Example</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_CATALOGUE_ENTRY__EXAMPLE = REPOSITORY_CONCEPT__EXAMPLE;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_CATALOGUE_ENTRY__CONSTRAINT = REPOSITORY_CONCEPT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Registration Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_CATALOGUE_ENTRY__REGISTRATION_STATUS = REPOSITORY_CONCEPT__REGISTRATION_STATUS;

	/**
	 * The feature id for the '<em><b>Removal Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_CATALOGUE_ENTRY__REMOVAL_DATE = REPOSITORY_CONCEPT__REMOVAL_DATE;

	/**
	 * The feature id for the '<em><b>Business Process Catalogue</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_CATALOGUE_ENTRY__BUSINESS_PROCESS_CATALOGUE = REPOSITORY_CONCEPT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Top Level Catalogue Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_CATALOGUE_ENTRY_FEATURE_COUNT = REPOSITORY_CONCEPT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Removal Date Registration Status</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_CATALOGUE_ENTRY___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN = REPOSITORY_CONCEPT___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN;

	/**
	 * The operation id for the '<em>Name First Letter Uppercase</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_CATALOGUE_ENTRY___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN = REPOSITORY_CONCEPT___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN;

	/**
	 * The number of operations of the '<em>Top Level Catalogue Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_CATALOGUE_ENTRY_OPERATION_COUNT = REPOSITORY_CONCEPT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso20022.impl.SyntaxMessageSchemeImpl <em>Syntax Message Scheme</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso20022.impl.SyntaxMessageSchemeImpl
	 * @see iso20022.impl.Iso20022PackageImpl#getSyntaxMessageScheme()
	 * @generated
	 */
	int SYNTAX_MESSAGE_SCHEME = 7;

	/**
	 * The feature id for the '<em><b>Next Versions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTAX_MESSAGE_SCHEME__NEXT_VERSIONS = TOP_LEVEL_CATALOGUE_ENTRY__NEXT_VERSIONS;

	/**
	 * The feature id for the '<em><b>Previous Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTAX_MESSAGE_SCHEME__PREVIOUS_VERSION = TOP_LEVEL_CATALOGUE_ENTRY__PREVIOUS_VERSION;

	/**
	 * The feature id for the '<em><b>Object Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTAX_MESSAGE_SCHEME__OBJECT_IDENTIFIER = TOP_LEVEL_CATALOGUE_ENTRY__OBJECT_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTAX_MESSAGE_SCHEME__NAME = TOP_LEVEL_CATALOGUE_ENTRY__NAME;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTAX_MESSAGE_SCHEME__DEFINITION = TOP_LEVEL_CATALOGUE_ENTRY__DEFINITION;

	/**
	 * The feature id for the '<em><b>Semantic Markup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTAX_MESSAGE_SCHEME__SEMANTIC_MARKUP = TOP_LEVEL_CATALOGUE_ENTRY__SEMANTIC_MARKUP;

	/**
	 * The feature id for the '<em><b>Doclet</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTAX_MESSAGE_SCHEME__DOCLET = TOP_LEVEL_CATALOGUE_ENTRY__DOCLET;

	/**
	 * The feature id for the '<em><b>Example</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTAX_MESSAGE_SCHEME__EXAMPLE = TOP_LEVEL_CATALOGUE_ENTRY__EXAMPLE;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTAX_MESSAGE_SCHEME__CONSTRAINT = TOP_LEVEL_CATALOGUE_ENTRY__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Registration Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTAX_MESSAGE_SCHEME__REGISTRATION_STATUS = TOP_LEVEL_CATALOGUE_ENTRY__REGISTRATION_STATUS;

	/**
	 * The feature id for the '<em><b>Removal Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTAX_MESSAGE_SCHEME__REMOVAL_DATE = TOP_LEVEL_CATALOGUE_ENTRY__REMOVAL_DATE;

	/**
	 * The feature id for the '<em><b>Business Process Catalogue</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTAX_MESSAGE_SCHEME__BUSINESS_PROCESS_CATALOGUE = TOP_LEVEL_CATALOGUE_ENTRY__BUSINESS_PROCESS_CATALOGUE;

	/**
	 * The feature id for the '<em><b>Message Definition Trace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTAX_MESSAGE_SCHEME__MESSAGE_DEFINITION_TRACE = TOP_LEVEL_CATALOGUE_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Syntax Message Scheme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTAX_MESSAGE_SCHEME_FEATURE_COUNT = TOP_LEVEL_CATALOGUE_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Removal Date Registration Status</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTAX_MESSAGE_SCHEME___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN = TOP_LEVEL_CATALOGUE_ENTRY___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN;

	/**
	 * The operation id for the '<em>Name First Letter Uppercase</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTAX_MESSAGE_SCHEME___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN = TOP_LEVEL_CATALOGUE_ENTRY___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN;

	/**
	 * The number of operations of the '<em>Syntax Message Scheme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTAX_MESSAGE_SCHEME_OPERATION_COUNT = TOP_LEVEL_CATALOGUE_ENTRY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso20022.impl.SemanticMarkupImpl <em>Semantic Markup</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso20022.impl.SemanticMarkupImpl
	 * @see iso20022.impl.Iso20022PackageImpl#getSemanticMarkup()
	 * @generated
	 */
	int SEMANTIC_MARKUP = 10;

	/**
	 * The feature id for the '<em><b>Next Versions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_MARKUP__NEXT_VERSIONS = MODEL_ENTITY__NEXT_VERSIONS;

	/**
	 * The feature id for the '<em><b>Previous Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_MARKUP__PREVIOUS_VERSION = MODEL_ENTITY__PREVIOUS_VERSION;

	/**
	 * The feature id for the '<em><b>Object Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_MARKUP__OBJECT_IDENTIFIER = MODEL_ENTITY__OBJECT_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_MARKUP__TYPE = MODEL_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_MARKUP__ELEMENTS = MODEL_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Semantic Markup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_MARKUP_FEATURE_COUNT = MODEL_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Semantic Markup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_MARKUP_OPERATION_COUNT = MODEL_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso20022.impl.SemanticMarkupElementImpl <em>Semantic Markup Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso20022.impl.SemanticMarkupElementImpl
	 * @see iso20022.impl.Iso20022PackageImpl#getSemanticMarkupElement()
	 * @generated
	 */
	int SEMANTIC_MARKUP_ELEMENT = 11;

	/**
	 * The feature id for the '<em><b>Next Versions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_MARKUP_ELEMENT__NEXT_VERSIONS = MODEL_ENTITY__NEXT_VERSIONS;

	/**
	 * The feature id for the '<em><b>Previous Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_MARKUP_ELEMENT__PREVIOUS_VERSION = MODEL_ENTITY__PREVIOUS_VERSION;

	/**
	 * The feature id for the '<em><b>Object Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_MARKUP_ELEMENT__OBJECT_IDENTIFIER = MODEL_ENTITY__OBJECT_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_MARKUP_ELEMENT__NAME = MODEL_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_MARKUP_ELEMENT__VALUE = MODEL_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Semantic Markup Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_MARKUP_ELEMENT_FEATURE_COUNT = MODEL_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Semantic Markup Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_MARKUP_ELEMENT_OPERATION_COUNT = MODEL_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso20022.impl.DocletImpl <em>Doclet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso20022.impl.DocletImpl
	 * @see iso20022.impl.Iso20022PackageImpl#getDoclet()
	 * @generated
	 */
	int DOCLET = 12;

	/**
	 * The feature id for the '<em><b>Next Versions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCLET__NEXT_VERSIONS = MODEL_ENTITY__NEXT_VERSIONS;

	/**
	 * The feature id for the '<em><b>Previous Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCLET__PREVIOUS_VERSION = MODEL_ENTITY__PREVIOUS_VERSION;

	/**
	 * The feature id for the '<em><b>Object Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCLET__OBJECT_IDENTIFIER = MODEL_ENTITY__OBJECT_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCLET__TYPE = MODEL_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCLET__CONTENT = MODEL_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Doclet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCLET_FEATURE_COUNT = MODEL_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Doclet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCLET_OPERATION_COUNT = MODEL_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso20022.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso20022.impl.ConstraintImpl
	 * @see iso20022.impl.Iso20022PackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 13;

	/**
	 * The feature id for the '<em><b>Next Versions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__NEXT_VERSIONS = REPOSITORY_CONCEPT__NEXT_VERSIONS;

	/**
	 * The feature id for the '<em><b>Previous Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__PREVIOUS_VERSION = REPOSITORY_CONCEPT__PREVIOUS_VERSION;

	/**
	 * The feature id for the '<em><b>Object Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__OBJECT_IDENTIFIER = REPOSITORY_CONCEPT__OBJECT_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__NAME = REPOSITORY_CONCEPT__NAME;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__DEFINITION = REPOSITORY_CONCEPT__DEFINITION;

	/**
	 * The feature id for the '<em><b>Semantic Markup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__SEMANTIC_MARKUP = REPOSITORY_CONCEPT__SEMANTIC_MARKUP;

	/**
	 * The feature id for the '<em><b>Doclet</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__DOCLET = REPOSITORY_CONCEPT__DOCLET;

	/**
	 * The feature id for the '<em><b>Example</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__EXAMPLE = REPOSITORY_CONCEPT__EXAMPLE;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__CONSTRAINT = REPOSITORY_CONCEPT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Registration Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__REGISTRATION_STATUS = REPOSITORY_CONCEPT__REGISTRATION_STATUS;

	/**
	 * The feature id for the '<em><b>Removal Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__REMOVAL_DATE = REPOSITORY_CONCEPT__REMOVAL_DATE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__EXPRESSION = REPOSITORY_CONCEPT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expression Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__EXPRESSION_LANGUAGE = REPOSITORY_CONCEPT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__OWNER = REPOSITORY_CONCEPT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = REPOSITORY_CONCEPT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Removal Date Registration Status</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN = REPOSITORY_CONCEPT___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN;

	/**
	 * The operation id for the '<em>Name First Letter Uppercase</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN = REPOSITORY_CONCEPT___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN;

	/**
	 * The number of operations of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_OPERATION_COUNT = REPOSITORY_CONCEPT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso20022.impl.BusinessProcessCatalogueImpl <em>Business Process Catalogue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso20022.impl.BusinessProcessCatalogueImpl
	 * @see iso20022.impl.Iso20022PackageImpl#getBusinessProcessCatalogue()
	 * @generated
	 */
	int BUSINESS_PROCESS_CATALOGUE = 14;

	/**
	 * The feature id for the '<em><b>Next Versions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_PROCESS_CATALOGUE__NEXT_VERSIONS = MODEL_ENTITY__NEXT_VERSIONS;

	/**
	 * The feature id for the '<em><b>Previous Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_PROCESS_CATALOGUE__PREVIOUS_VERSION = MODEL_ENTITY__PREVIOUS_VERSION;

	/**
	 * The feature id for the '<em><b>Object Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_PROCESS_CATALOGUE__OBJECT_IDENTIFIER = MODEL_ENTITY__OBJECT_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_PROCESS_CATALOGUE__REPOSITORY = MODEL_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Top Level Catalogue Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_PROCESS_CATALOGUE__TOP_LEVEL_CATALOGUE_ENTRY = MODEL_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Business Process Catalogue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_PROCESS_CATALOGUE_FEATURE_COUNT = MODEL_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Entries Have Unique Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_PROCESS_CATALOGUE___ENTRIES_HAVE_UNIQUE_NAME__MAP_DIAGNOSTICCHAIN = MODEL_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Business Process Catalogue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_PROCESS_CATALOGUE_OPERATION_COUNT = MODEL_ENTITY_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link iso20022.impl.RepositoryImpl <em>Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso20022.impl.RepositoryImpl
	 * @see iso20022.impl.Iso20022PackageImpl#getRepository()
	 * @generated
	 */
	int REPOSITORY = 15;

	/**
	 * The feature id for the '<em><b>Next Versions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__NEXT_VERSIONS = MODEL_ENTITY__NEXT_VERSIONS;

	/**
	 * The feature id for the '<em><b>Previous Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__PREVIOUS_VERSION = MODEL_ENTITY__PREVIOUS_VERSION;

	/**
	 * The feature id for the '<em><b>Object Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__OBJECT_IDENTIFIER = MODEL_ENTITY__OBJECT_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Data Dictionary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__DATA_DICTIONARY = MODEL_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Business Process Catalogue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__BUSINESS_PROCESS_CATALOGUE = MODEL_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_FEATURE_COUNT = MODEL_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_OPERATION_COUNT = MODEL_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso20022.impl.DataDictionaryImpl <em>Data Dictionary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso20022.impl.DataDictionaryImpl
	 * @see iso20022.impl.Iso20022PackageImpl#getDataDictionary()
	 * @generated
	 */
	int DATA_DICTIONARY = 16;

	/**
	 * The feature id for the '<em><b>Next Versions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DICTIONARY__NEXT_VERSIONS = MODEL_ENTITY__NEXT_VERSIONS;

	/**
	 * The feature id for the '<em><b>Previous Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DICTIONARY__PREVIOUS_VERSION = MODEL_ENTITY__PREVIOUS_VERSION;

	/**
	 * The feature id for the '<em><b>Object Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DICTIONARY__OBJECT_IDENTIFIER = MODEL_ENTITY__OBJECT_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Top Level Dictionary Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DICTIONARY__TOP_LEVEL_DICTIONARY_ENTRY = MODEL_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DICTIONARY__REPOSITORY = MODEL_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Data Dictionary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DICTIONARY_FEATURE_COUNT = MODEL_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Entries Have Unique Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DICTIONARY___ENTRIES_HAVE_UNIQUE_NAME__MAP_DIAGNOSTICCHAIN = MODEL_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Data Dictionary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DICTIONARY_OPERATION_COUNT = MODEL_ENTITY_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link iso20022.impl.TopLevelDictionaryEntryImpl <em>Top Level Dictionary Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso20022.impl.TopLevelDictionaryEntryImpl
	 * @see iso20022.impl.Iso20022PackageImpl#getTopLevelDictionaryEntry()
	 * @generated
	 */
	int TOP_LEVEL_DICTIONARY_ENTRY = 17;

	/**
	 * The feature id for the '<em><b>Next Versions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_DICTIONARY_ENTRY__NEXT_VERSIONS = REPOSITORY_CONCEPT__NEXT_VERSIONS;

	/**
	 * The feature id for the '<em><b>Previous Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_DICTIONARY_ENTRY__PREVIOUS_VERSION = REPOSITORY_CONCEPT__PREVIOUS_VERSION;

	/**
	 * The feature id for the '<em><b>Object Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_DICTIONARY_ENTRY__OBJECT_IDENTIFIER = REPOSITORY_CONCEPT__OBJECT_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_DICTIONARY_ENTRY__NAME = REPOSITORY_CONCEPT__NAME;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_DICTIONARY_ENTRY__DEFINITION = REPOSITORY_CONCEPT__DEFINITION;

	/**
	 * The feature id for the '<em><b>Semantic Markup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_DICTIONARY_ENTRY__SEMANTIC_MARKUP = REPOSITORY_CONCEPT__SEMANTIC_MARKUP;

	/**
	 * The feature id for the '<em><b>Doclet</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_DICTIONARY_ENTRY__DOCLET = REPOSITORY_CONCEPT__DOCLET;

	/**
	 * The feature id for the '<em><b>Example</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_DICTIONARY_ENTRY__EXAMPLE = REPOSITORY_CONCEPT__EXAMPLE;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_DICTIONARY_ENTRY__CONSTRAINT = REPOSITORY_CONCEPT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Registration Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_DICTIONARY_ENTRY__REGISTRATION_STATUS = REPOSITORY_CONCEPT__REGISTRATION_STATUS;

	/**
	 * The feature id for the '<em><b>Removal Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_DICTIONARY_ENTRY__REMOVAL_DATE = REPOSITORY_CONCEPT__REMOVAL_DATE;

	/**
	 * The feature id for the '<em><b>Data Dictionary</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_DICTIONARY_ENTRY__DATA_DICTIONARY = REPOSITORY_CONCEPT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Top Level Dictionary Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_DICTIONARY_ENTRY_FEATURE_COUNT = REPOSITORY_CONCEPT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Removal Date Registration Status</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_DICTIONARY_ENTRY___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN = REPOSITORY_CONCEPT___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN;

	/**
	 * The operation id for the '<em>Name First Letter Uppercase</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_DICTIONARY_ENTRY___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN = REPOSITORY_CONCEPT___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN;

	/**
	 * The number of operations of the '<em>Top Level Dictionary Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_DICTIONARY_ENTRY_OPERATION_COUNT = REPOSITORY_CONCEPT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso20022.impl.RepositoryTypeImpl <em>Repository Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso20022.impl.RepositoryTypeImpl
	 * @see iso20022.impl.Iso20022PackageImpl#getRepositoryType()
	 * @generated
	 */
	int REPOSITORY_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Next Versions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_TYPE__NEXT_VERSIONS = REPOSITORY_CONCEPT__NEXT_VERSIONS;

	/**
	 * The feature id for the '<em><b>Previous Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_TYPE__PREVIOUS_VERSION = REPOSITORY_CONCEPT__PREVIOUS_VERSION;

	/**
	 * The feature id for the '<em><b>Object Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_TYPE__OBJECT_IDENTIFIER = REPOSITORY_CONCEPT__OBJECT_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_TYPE__NAME = REPOSITORY_CONCEPT__NAME;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_TYPE__DEFINITION = REPOSITORY_CONCEPT__DEFINITION;

	/**
	 * The feature id for the '<em><b>Semantic Markup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_TYPE__SEMANTIC_MARKUP = REPOSITORY_CONCEPT__SEMANTIC_MARKUP;

	/**
	 * The feature id for the '<em><b>Doclet</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_TYPE__DOCLET = REPOSITORY_CONCEPT__DOCLET;

	/**
	 * The feature id for the '<em><b>Example</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_TYPE__EXAMPLE = REPOSITORY_CONCEPT__EXAMPLE;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_TYPE__CONSTRAINT = REPOSITORY_CONCEPT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Registration Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_TYPE__REGISTRATION_STATUS = REPOSITORY_CONCEPT__REGISTRATION_STATUS;

	/**
	 * The feature id for the '<em><b>Removal Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_TYPE__REMOVAL_DATE = REPOSITORY_CONCEPT__REMOVAL_DATE;

	/**
	 * The number of structural features of the '<em>Repository Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_TYPE_FEATURE_COUNT = REPOSITORY_CONCEPT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Removal Date Registration Status</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_TYPE___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN = REPOSITORY_CONCEPT___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN;

	/**
	 * The operation id for the '<em>Name First Letter Uppercase</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_TYPE___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN = REPOSITORY_CONCEPT___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN;

	/**
	 * The number of operations of the '<em>Repository Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_TYPE_OPERATION_COUNT = REPOSITORY_CONCEPT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso20022.impl.MessageDefinitionImpl <em>Message Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso20022.impl.MessageDefinitionImpl
	 * @see iso20022.impl.Iso20022PackageImpl#getMessageDefinition()
	 * @generated
	 */
	int MESSAGE_DEFINITION = 18;

	/**
	 * The feature id for the '<em><b>Next Versions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DEFINITION__NEXT_VERSIONS = REPOSITORY_TYPE__NEXT_VERSIONS;

	/**
	 * The feature id for the '<em><b>Previous Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DEFINITION__PREVIOUS_VERSION = REPOSITORY_TYPE__PREVIOUS_VERSION;

	/**
	 * The feature id for the '<em><b>Object Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DEFINITION__OBJECT_IDENTIFIER = REPOSITORY_TYPE__OBJECT_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DEFINITION__NAME = REPOSITORY_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DEFINITION__DEFINITION = REPOSITORY_TYPE__DEFINITION;

	/**
	 * The feature id for the '<em><b>Semantic Markup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DEFINITION__SEMANTIC_MARKUP = REPOSITORY_TYPE__SEMANTIC_MARKUP;

	/**
	 * The feature id for the '<em><b>Doclet</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DEFINITION__DOCLET = REPOSITORY_TYPE__DOCLET;

	/**
	 * The feature id for the '<em><b>Example</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DEFINITION__EXAMPLE = REPOSITORY_TYPE__EXAMPLE;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DEFINITION__CONSTRAINT = REPOSITORY_TYPE__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Registration Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DEFINITION__REGISTRATION_STATUS = REPOSITORY_TYPE__REGISTRATION_STATUS;

	/**
	 * The feature id for the '<em><b>Removal Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DEFINITION__REMOVAL_DATE = REPOSITORY_TYPE__REMOVAL_DATE;

	/**
	 * The feature id for the '<em><b>Message Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DEFINITION__MESSAGE_SET = REPOSITORY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Xml Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DEFINITION__XML_NAME = REPOSITORY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Xml Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DEFINITION__XML_TAG = REPOSITORY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Business Area</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DEFINITION__BUSINESS_AREA = REPOSITORY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Xors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DEFINITION__XORS = REPOSITORY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Root Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DEFINITION__ROOT_ELEMENT = REPOSITORY_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Message Building Block</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DEFINITION__MESSAGE_BUILDING_BLOCK = REPOSITORY_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Choreography</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DEFINITION__CHOREOGRAPHY = REPOSITORY_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Trace</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DEFINITION__TRACE = REPOSITORY_TYPE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Message Definition Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DEFINITION__MESSAGE_DEFINITION_IDENTIFIER = REPOSITORY_TYPE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Derivation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DEFINITION__DERIVATION = REPOSITORY_TYPE_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Message Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DEFINITION_FEATURE_COUNT = REPOSITORY_TYPE_FEATURE_COUNT + 11;

	/**
	 * The operation id for the '<em>Removal Date Registration Status</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DEFINITION___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN = REPOSITORY_TYPE___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN;

	/**
	 * The operation id for the '<em>Name First Letter Uppercase</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DEFINITION___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN = REPOSITORY_TYPE___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN;

	/**
	 * The operation id for the '<em>Business Area Name Match</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DEFINITION___BUSINESS_AREA_NAME_MATCH__MAP_DIAGNOSTICCHAIN = REPOSITORY_TYPE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Message Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DEFINITION_OPERATION_COUNT = REPOSITORY_TYPE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link iso20022.impl.MessageSetImpl <em>Message Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso20022.impl.MessageSetImpl
	 * @see iso20022.impl.Iso20022PackageImpl#getMessageSet()
	 * @generated
	 */
	int MESSAGE_SET = 20;

	/**
	 * The feature id for the '<em><b>Next Versions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_SET__NEXT_VERSIONS = TOP_LEVEL_CATALOGUE_ENTRY__NEXT_VERSIONS;

	/**
	 * The feature id for the '<em><b>Previous Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_SET__PREVIOUS_VERSION = TOP_LEVEL_CATALOGUE_ENTRY__PREVIOUS_VERSION;

	/**
	 * The feature id for the '<em><b>Object Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_SET__OBJECT_IDENTIFIER = TOP_LEVEL_CATALOGUE_ENTRY__OBJECT_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_SET__NAME = TOP_LEVEL_CATALOGUE_ENTRY__NAME;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_SET__DEFINITION = TOP_LEVEL_CATALOGUE_ENTRY__DEFINITION;

	/**
	 * The feature id for the '<em><b>Semantic Markup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_SET__SEMANTIC_MARKUP = TOP_LEVEL_CATALOGUE_ENTRY__SEMANTIC_MARKUP;

	/**
	 * The feature id for the '<em><b>Doclet</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_SET__DOCLET = TOP_LEVEL_CATALOGUE_ENTRY__DOCLET;

	/**
	 * The feature id for the '<em><b>Example</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_SET__EXAMPLE = TOP_LEVEL_CATALOGUE_ENTRY__EXAMPLE;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_SET__CONSTRAINT = TOP_LEVEL_CATALOGUE_ENTRY__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Registration Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_SET__REGISTRATION_STATUS = TOP_LEVEL_CATALOGUE_ENTRY__REGISTRATION_STATUS;

	/**
	 * The feature id for the '<em><b>Removal Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_SET__REMOVAL_DATE = TOP_LEVEL_CATALOGUE_ENTRY__REMOVAL_DATE;

	/**
	 * The feature id for the '<em><b>Business Process Catalogue</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_SET__BUSINESS_PROCESS_CATALOGUE = TOP_LEVEL_CATALOGUE_ENTRY__BUSINESS_PROCESS_CATALOGUE;

	/**
	 * The feature id for the '<em><b>Generated Syntax</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_SET__GENERATED_SYNTAX = TOP_LEVEL_CATALOGUE_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Valid Encoding</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_SET__VALID_ENCODING = TOP_LEVEL_CATALOGUE_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Message Definition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_SET__MESSAGE_DEFINITION = TOP_LEVEL_CATALOGUE_ENTRY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Message Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_SET_FEATURE_COUNT = TOP_LEVEL_CATALOGUE_ENTRY_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Removal Date Registration Status</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_SET___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN = TOP_LEVEL_CATALOGUE_ENTRY___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN;

	/**
	 * The operation id for the '<em>Name First Letter Uppercase</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_SET___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN = TOP_LEVEL_CATALOGUE_ENTRY___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN;

	/**
	 * The operation id for the '<em>Generated Syntax Derivation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_SET___GENERATED_SYNTAX_DERIVATION__MAP_DIAGNOSTICCHAIN = TOP_LEVEL_CATALOGUE_ENTRY_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Message Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_SET_OPERATION_COUNT = TOP_LEVEL_CATALOGUE_ENTRY_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link iso20022.impl.SyntaxImpl <em>Syntax</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso20022.impl.SyntaxImpl
	 * @see iso20022.impl.Iso20022PackageImpl#getSyntax()
	 * @generated
	 */
	int SYNTAX = 21;

	/**
	 * The feature id for the '<em><b>Next Versions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTAX__NEXT_VERSIONS = MODEL_ENTITY__NEXT_VERSIONS;

	/**
	 * The feature id for the '<em><b>Previous Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTAX__PREVIOUS_VERSION = MODEL_ENTITY__PREVIOUS_VERSION;

	/**
	 * The feature id for the '<em><b>Object Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTAX__OBJECT_IDENTIFIER = MODEL_ENTITY__OBJECT_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Possible Encodings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTAX__POSSIBLE_ENCODINGS = MODEL_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Generated For</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTAX__GENERATED_FOR = MODEL_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Syntax</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTAX_FEATURE_COUNT = MODEL_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Generated For Derivation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTAX___GENERATED_FOR_DERIVATION__MAP_DIAGNOSTICCHAIN = MODEL_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Syntax</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTAX_OPERATION_COUNT = MODEL_ENTITY_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link iso20022.impl.EncodingImpl <em>Encoding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso20022.impl.EncodingImpl
	 * @see iso20022.impl.Iso20022PackageImpl#getEncoding()
	 * @generated
	 */
	int ENCODING = 22;

	/**
	 * The feature id for the '<em><b>Next Versions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCODING__NEXT_VERSIONS = MODEL_ENTITY__NEXT_VERSIONS;

	/**
	 * The feature id for the '<em><b>Previous Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCODING__PREVIOUS_VERSION = MODEL_ENTITY__PREVIOUS_VERSION;

	/**
	 * The feature id for the '<em><b>Object Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCODING__OBJECT_IDENTIFIER = MODEL_ENTITY__OBJECT_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Message Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCODING__MESSAGE_SET = MODEL_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Syntax</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCODING__SYNTAX = MODEL_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Encoding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCODING_FEATURE_COUNT = MODEL_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Encoding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCODING_OPERATION_COUNT = MODEL_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso20022.impl.BusinessAreaImpl <em>Business Area</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso20022.impl.BusinessAreaImpl
	 * @see iso20022.impl.Iso20022PackageImpl#getBusinessArea()
	 * @generated
	 */
	int BUSINESS_AREA = 23;

	/**
	 * The feature id for the '<em><b>Next Versions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_AREA__NEXT_VERSIONS = TOP_LEVEL_CATALOGUE_ENTRY__NEXT_VERSIONS;

	/**
	 * The feature id for the '<em><b>Previous Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_AREA__PREVIOUS_VERSION = TOP_LEVEL_CATALOGUE_ENTRY__PREVIOUS_VERSION;

	/**
	 * The feature id for the '<em><b>Object Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_AREA__OBJECT_IDENTIFIER = TOP_LEVEL_CATALOGUE_ENTRY__OBJECT_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_AREA__NAME = TOP_LEVEL_CATALOGUE_ENTRY__NAME;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_AREA__DEFINITION = TOP_LEVEL_CATALOGUE_ENTRY__DEFINITION;

	/**
	 * The feature id for the '<em><b>Semantic Markup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_AREA__SEMANTIC_MARKUP = TOP_LEVEL_CATALOGUE_ENTRY__SEMANTIC_MARKUP;

	/**
	 * The feature id for the '<em><b>Doclet</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_AREA__DOCLET = TOP_LEVEL_CATALOGUE_ENTRY__DOCLET;

	/**
	 * The feature id for the '<em><b>Example</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_AREA__EXAMPLE = TOP_LEVEL_CATALOGUE_ENTRY__EXAMPLE;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_AREA__CONSTRAINT = TOP_LEVEL_CATALOGUE_ENTRY__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Registration Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_AREA__REGISTRATION_STATUS = TOP_LEVEL_CATALOGUE_ENTRY__REGISTRATION_STATUS;

	/**
	 * The feature id for the '<em><b>Removal Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_AREA__REMOVAL_DATE = TOP_LEVEL_CATALOGUE_ENTRY__REMOVAL_DATE;

	/**
	 * The feature id for the '<em><b>Business Process Catalogue</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_AREA__BUSINESS_PROCESS_CATALOGUE = TOP_LEVEL_CATALOGUE_ENTRY__BUSINESS_PROCESS_CATALOGUE;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_AREA__CODE = TOP_LEVEL_CATALOGUE_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Message Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_AREA__MESSAGE_DEFINITION = TOP_LEVEL_CATALOGUE_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Business Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_AREA_FEATURE_COUNT = TOP_LEVEL_CATALOGUE_ENTRY_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Removal Date Registration Status</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_AREA___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN = TOP_LEVEL_CATALOGUE_ENTRY___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN;

	/**
	 * The operation id for the '<em>Name First Letter Uppercase</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_AREA___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN = TOP_LEVEL_CATALOGUE_ENTRY___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN;

	/**
	 * The number of operations of the '<em>Business Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_AREA_OPERATION_COUNT = TOP_LEVEL_CATALOGUE_ENTRY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso20022.impl.XorImpl <em>Xor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso20022.impl.XorImpl
	 * @see iso20022.impl.Iso20022PackageImpl#getXor()
	 * @generated
	 */
	int XOR = 24;

	/**
	 * The feature id for the '<em><b>Next Versions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR__NEXT_VERSIONS = REPOSITORY_CONCEPT__NEXT_VERSIONS;

	/**
	 * The feature id for the '<em><b>Previous Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR__PREVIOUS_VERSION = REPOSITORY_CONCEPT__PREVIOUS_VERSION;

	/**
	 * The feature id for the '<em><b>Object Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR__OBJECT_IDENTIFIER = REPOSITORY_CONCEPT__OBJECT_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR__NAME = REPOSITORY_CONCEPT__NAME;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR__DEFINITION = REPOSITORY_CONCEPT__DEFINITION;

	/**
	 * The feature id for the '<em><b>Semantic Markup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR__SEMANTIC_MARKUP = REPOSITORY_CONCEPT__SEMANTIC_MARKUP;

	/**
	 * The feature id for the '<em><b>Doclet</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR__DOCLET = REPOSITORY_CONCEPT__DOCLET;

	/**
	 * The feature id for the '<em><b>Example</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR__EXAMPLE = REPOSITORY_CONCEPT__EXAMPLE;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR__CONSTRAINT = REPOSITORY_CONCEPT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Registration Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR__REGISTRATION_STATUS = REPOSITORY_CONCEPT__REGISTRATION_STATUS;

	/**
	 * The feature id for the '<em><b>Removal Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR__REMOVAL_DATE = REPOSITORY_CONCEPT__REMOVAL_DATE;

	/**
	 * The feature id for the '<em><b>Impacted Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR__IMPACTED_ELEMENTS = REPOSITORY_CONCEPT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Message Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR__MESSAGE_COMPONENT = REPOSITORY_CONCEPT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Impacted Message Building Blocks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR__IMPACTED_MESSAGE_BUILDING_BLOCKS = REPOSITORY_CONCEPT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Message Definition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR__MESSAGE_DEFINITION = REPOSITORY_CONCEPT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Xor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_FEATURE_COUNT = REPOSITORY_CONCEPT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Removal Date Registration Status</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN = REPOSITORY_CONCEPT___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN;

	/**
	 * The operation id for the '<em>Name First Letter Uppercase</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN = REPOSITORY_CONCEPT___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN;

	/**
	 * The number of operations of the '<em>Xor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_OPERATION_COUNT = REPOSITORY_CONCEPT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso20022.impl.ConstructImpl <em>Construct</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso20022.impl.ConstructImpl
	 * @see iso20022.impl.Iso20022PackageImpl#getConstruct()
	 * @generated
	 */
	int CONSTRUCT = 27;

	/**
	 * The feature id for the '<em><b>Next Versions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCT__NEXT_VERSIONS = REPOSITORY_CONCEPT__NEXT_VERSIONS;

	/**
	 * The feature id for the '<em><b>Previous Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCT__PREVIOUS_VERSION = REPOSITORY_CONCEPT__PREVIOUS_VERSION;

	/**
	 * The feature id for the '<em><b>Object Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCT__OBJECT_IDENTIFIER = REPOSITORY_CONCEPT__OBJECT_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCT__NAME = REPOSITORY_CONCEPT__NAME;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCT__DEFINITION = REPOSITORY_CONCEPT__DEFINITION;

	/**
	 * The feature id for the '<em><b>Semantic Markup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCT__SEMANTIC_MARKUP = REPOSITORY_CONCEPT__SEMANTIC_MARKUP;

	/**
	 * The feature id for the '<em><b>Doclet</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCT__DOCLET = REPOSITORY_CONCEPT__DOCLET;

	/**
	 * The feature id for the '<em><b>Example</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCT__EXAMPLE = REPOSITORY_CONCEPT__EXAMPLE;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCT__CONSTRAINT = REPOSITORY_CONCEPT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Registration Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCT__REGISTRATION_STATUS = REPOSITORY_CONCEPT__REGISTRATION_STATUS;

	/**
	 * The feature id for the '<em><b>Removal Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCT__REMOVAL_DATE = REPOSITORY_CONCEPT__REMOVAL_DATE;

	/**
	 * The feature id for the '<em><b>Max Occurs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCT__MAX_OCCURS = REPOSITORY_CONCEPT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Min Occurs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCT__MIN_OCCURS = REPOSITORY_CONCEPT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Member Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCT__MEMBER_TYPE = REPOSITORY_CONCEPT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Construct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCT_FEATURE_COUNT = REPOSITORY_CONCEPT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Removal Date Registration Status</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCT___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN = REPOSITORY_CONCEPT___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN;

	/**
	 * The operation id for the '<em>Name First Letter Uppercase</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCT___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN = REPOSITORY_CONCEPT___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN;

	/**
	 * The number of operations of the '<em>Construct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCT_OPERATION_COUNT = REPOSITORY_CONCEPT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso20022.impl.MessageConstructImpl <em>Message Construct</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso20022.impl.MessageConstructImpl
	 * @see iso20022.impl.Iso20022PackageImpl#getMessageConstruct()
	 * @generated
	 */
	int MESSAGE_CONSTRUCT = 26;

	/**
	 * The feature id for the '<em><b>Next Versions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_CONSTRUCT__NEXT_VERSIONS = CONSTRUCT__NEXT_VERSIONS;

	/**
	 * The feature id for the '<em><b>Previous Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_CONSTRUCT__PREVIOUS_VERSION = CONSTRUCT__PREVIOUS_VERSION;

	/**
	 * The feature id for the '<em><b>Object Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_CONSTRUCT__OBJECT_IDENTIFIER = CONSTRUCT__OBJECT_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_CONSTRUCT__NAME = CONSTRUCT__NAME;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_CONSTRUCT__DEFINITION = CONSTRUCT__DEFINITION;

	/**
	 * The feature id for the '<em><b>Semantic Markup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_CONSTRUCT__SEMANTIC_MARKUP = CONSTRUCT__SEMANTIC_MARKUP;

	/**
	 * The feature id for the '<em><b>Doclet</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_CONSTRUCT__DOCLET = CONSTRUCT__DOCLET;

	/**
	 * The feature id for the '<em><b>Example</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_CONSTRUCT__EXAMPLE = CONSTRUCT__EXAMPLE;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_CONSTRUCT__CONSTRAINT = CONSTRUCT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Registration Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_CONSTRUCT__REGISTRATION_STATUS = CONSTRUCT__REGISTRATION_STATUS;

	/**
	 * The feature id for the '<em><b>Removal Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_CONSTRUCT__REMOVAL_DATE = CONSTRUCT__REMOVAL_DATE;

	/**
	 * The feature id for the '<em><b>Max Occurs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_CONSTRUCT__MAX_OCCURS = CONSTRUCT__MAX_OCCURS;

	/**
	 * The feature id for the '<em><b>Min Occurs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_CONSTRUCT__MIN_OCCURS = CONSTRUCT__MIN_OCCURS;

	/**
	 * The feature id for the '<em><b>Member Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_CONSTRUCT__MEMBER_TYPE = CONSTRUCT__MEMBER_TYPE;

	/**
	 * The feature id for the '<em><b>Xml Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_CONSTRUCT__XML_TAG = CONSTRUCT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Xml Member Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_CONSTRUCT__XML_MEMBER_TYPE = CONSTRUCT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Message Construct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_CONSTRUCT_FEATURE_COUNT = CONSTRUCT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Removal Date Registration Status</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_CONSTRUCT___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN = CONSTRUCT___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN;

	/**
	 * The operation id for the '<em>Name First Letter Uppercase</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_CONSTRUCT___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN = CONSTRUCT___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN;

	/**
	 * The number of operations of the '<em>Message Construct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_CONSTRUCT_OPERATION_COUNT = CONSTRUCT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso20022.impl.MessageElementImpl <em>Message Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso20022.impl.MessageElementImpl
	 * @see iso20022.impl.Iso20022PackageImpl#getMessageElement()
	 * @generated
	 */
	int MESSAGE_ELEMENT = 25;

	/**
	 * The feature id for the '<em><b>Next Versions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ELEMENT__NEXT_VERSIONS = MESSAGE_CONSTRUCT__NEXT_VERSIONS;

	/**
	 * The feature id for the '<em><b>Previous Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ELEMENT__PREVIOUS_VERSION = MESSAGE_CONSTRUCT__PREVIOUS_VERSION;

	/**
	 * The feature id for the '<em><b>Object Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ELEMENT__OBJECT_IDENTIFIER = MESSAGE_CONSTRUCT__OBJECT_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ELEMENT__NAME = MESSAGE_CONSTRUCT__NAME;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ELEMENT__DEFINITION = MESSAGE_CONSTRUCT__DEFINITION;

	/**
	 * The feature id for the '<em><b>Semantic Markup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ELEMENT__SEMANTIC_MARKUP = MESSAGE_CONSTRUCT__SEMANTIC_MARKUP;

	/**
	 * The feature id for the '<em><b>Doclet</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ELEMENT__DOCLET = MESSAGE_CONSTRUCT__DOCLET;

	/**
	 * The feature id for the '<em><b>Example</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ELEMENT__EXAMPLE = MESSAGE_CONSTRUCT__EXAMPLE;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ELEMENT__CONSTRAINT = MESSAGE_CONSTRUCT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Registration Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ELEMENT__REGISTRATION_STATUS = MESSAGE_CONSTRUCT__REGISTRATION_STATUS;

	/**
	 * The feature id for the '<em><b>Removal Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ELEMENT__REMOVAL_DATE = MESSAGE_CONSTRUCT__REMOVAL_DATE;

	/**
	 * The feature id for the '<em><b>Max Occurs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ELEMENT__MAX_OCCURS = MESSAGE_CONSTRUCT__MAX_OCCURS;

	/**
	 * The feature id for the '<em><b>Min Occurs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ELEMENT__MIN_OCCURS = MESSAGE_CONSTRUCT__MIN_OCCURS;

	/**
	 * The feature id for the '<em><b>Member Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ELEMENT__MEMBER_TYPE = MESSAGE_CONSTRUCT__MEMBER_TYPE;

	/**
	 * The feature id for the '<em><b>Xml Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ELEMENT__XML_TAG = MESSAGE_CONSTRUCT__XML_TAG;

	/**
	 * The feature id for the '<em><b>Xml Member Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ELEMENT__XML_MEMBER_TYPE = MESSAGE_CONSTRUCT__XML_MEMBER_TYPE;

	/**
	 * The feature id for the '<em><b>Is Technical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ELEMENT__IS_TECHNICAL = MESSAGE_CONSTRUCT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Business Component Trace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ELEMENT__BUSINESS_COMPONENT_TRACE = MESSAGE_CONSTRUCT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Business Element Trace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ELEMENT__BUSINESS_ELEMENT_TRACE = MESSAGE_CONSTRUCT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Component Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ELEMENT__COMPONENT_CONTEXT = MESSAGE_CONSTRUCT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Is Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ELEMENT__IS_DERIVED = MESSAGE_CONSTRUCT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Message Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ELEMENT_FEATURE_COUNT = MESSAGE_CONSTRUCT_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Removal Date Registration Status</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ELEMENT___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN = MESSAGE_CONSTRUCT___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN;

	/**
	 * The operation id for the '<em>Name First Letter Uppercase</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ELEMENT___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN = MESSAGE_CONSTRUCT___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN;

	/**
	 * The operation id for the '<em>No More Than One Trace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ELEMENT___NO_MORE_THAN_ONE_TRACE__MAP_DIAGNOSTICCHAIN = MESSAGE_CONSTRUCT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Cardinality Alignment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ELEMENT___CARDINALITY_ALIGNMENT__MAP_DIAGNOSTICCHAIN = MESSAGE_CONSTRUCT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Message Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ELEMENT_OPERATION_COUNT = MESSAGE_CONSTRUCT_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link iso20022.impl.MultiplicityEntityImpl <em>Multiplicity Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso20022.impl.MultiplicityEntityImpl
	 * @see iso20022.impl.Iso20022PackageImpl#getMultiplicityEntity()
	 * @generated
	 */
	int MULTIPLICITY_ENTITY = 28;

	/**
	 * The feature id for the '<em><b>Max Occurs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_ENTITY__MAX_OCCURS = 0;

	/**
	 * The feature id for the '<em><b>Min Occurs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_ENTITY__MIN_OCCURS = 1;

	/**
	 * The number of structural features of the '<em>Multiplicity Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_ENTITY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Multiplicity Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_ENTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iso20022.impl.LogicalTypeImpl <em>Logical Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso20022.impl.LogicalTypeImpl
	 * @see iso20022.impl.Iso20022PackageImpl#getLogicalType()
	 * @generated
	 */
	int LOGICAL_TYPE = 29;

	/**
	 * The feature id for the '<em><b>Next Versions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_TYPE__NEXT_VERSIONS = REPOSITORY_TYPE__NEXT_VERSIONS;

	/**
	 * The feature id for the '<em><b>Previous Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_TYPE__PREVIOUS_VERSION = REPOSITORY_TYPE__PREVIOUS_VERSION;

	/**
	 * The feature id for the '<em><b>Object Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_TYPE__OBJECT_IDENTIFIER = REPOSITORY_TYPE__OBJECT_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_TYPE__NAME = REPOSITORY_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_TYPE__DEFINITION = REPOSITORY_TYPE__DEFINITION;

	/**
	 * The feature id for the '<em><b>Semantic Markup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_TYPE__SEMANTIC_MARKUP = REPOSITORY_TYPE__SEMANTIC_MARKUP;

	/**
	 * The feature id for the '<em><b>Doclet</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_TYPE__DOCLET = REPOSITORY_TYPE__DOCLET;

	/**
	 * The feature id for the '<em><b>Example</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_TYPE__EXAMPLE = REPOSITORY_TYPE__EXAMPLE;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_TYPE__CONSTRAINT = REPOSITORY_TYPE__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Registration Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_TYPE__REGISTRATION_STATUS = REPOSITORY_TYPE__REGISTRATION_STATUS;

	/**
	 * The feature id for the '<em><b>Removal Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_TYPE__REMOVAL_DATE = REPOSITORY_TYPE__REMOVAL_DATE;

	/**
	 * The number of structural features of the '<em>Logical Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_TYPE_FEATURE_COUNT = REPOSITORY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Removal Date Registration Status</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_TYPE___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN = REPOSITORY_TYPE___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN;

	/**
	 * The operation id for the '<em>Name First Letter Uppercase</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_TYPE___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN = REPOSITORY_TYPE___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN;

	/**
	 * The number of operations of the '<em>Logical Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_TYPE_OPERATION_COUNT = REPOSITORY_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso20022.impl.MessageConceptImpl <em>Message Concept</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso20022.impl.MessageConceptImpl
	 * @see iso20022.impl.Iso20022PackageImpl#getMessageConcept()
	 * @generated
	 */
	int MESSAGE_CONCEPT = 30;

	/**
	 * The feature id for the '<em><b>Next Versions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_CONCEPT__NEXT_VERSIONS = MODEL_ENTITY__NEXT_VERSIONS;

	/**
	 * The feature id for the '<em><b>Previous Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_CONCEPT__PREVIOUS_VERSION = MODEL_ENTITY__PREVIOUS_VERSION;

	/**
	 * The feature id for the '<em><b>Object Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_CONCEPT__OBJECT_IDENTIFIER = MODEL_ENTITY__OBJECT_IDENTIFIER;

	/**
	 * The number of structural features of the '<em>Message Concept</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_CONCEPT_FEATURE_COUNT = MODEL_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Message Concept</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_CONCEPT_OPERATION_COUNT = MODEL_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso20022.impl.BusinessComponentImpl <em>Business Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso20022.impl.BusinessComponentImpl
	 * @see iso20022.impl.Iso20022PackageImpl#getBusinessComponent()
	 * @generated
	 */
	int BUSINESS_COMPONENT = 31;

	/**
	 * The feature id for the '<em><b>Next Versions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_COMPONENT__NEXT_VERSIONS = TOP_LEVEL_DICTIONARY_ENTRY__NEXT_VERSIONS;

	/**
	 * The feature id for the '<em><b>Previous Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_COMPONENT__PREVIOUS_VERSION = TOP_LEVEL_DICTIONARY_ENTRY__PREVIOUS_VERSION;

	/**
	 * The feature id for the '<em><b>Object Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_COMPONENT__OBJECT_IDENTIFIER = TOP_LEVEL_DICTIONARY_ENTRY__OBJECT_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_COMPONENT__NAME = TOP_LEVEL_DICTIONARY_ENTRY__NAME;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_COMPONENT__DEFINITION = TOP_LEVEL_DICTIONARY_ENTRY__DEFINITION;

	/**
	 * The feature id for the '<em><b>Semantic Markup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_COMPONENT__SEMANTIC_MARKUP = TOP_LEVEL_DICTIONARY_ENTRY__SEMANTIC_MARKUP;

	/**
	 * The feature id for the '<em><b>Doclet</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_COMPONENT__DOCLET = TOP_LEVEL_DICTIONARY_ENTRY__DOCLET;

	/**
	 * The feature id for the '<em><b>Example</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_COMPONENT__EXAMPLE = TOP_LEVEL_DICTIONARY_ENTRY__EXAMPLE;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_COMPONENT__CONSTRAINT = TOP_LEVEL_DICTIONARY_ENTRY__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Registration Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_COMPONENT__REGISTRATION_STATUS = TOP_LEVEL_DICTIONARY_ENTRY__REGISTRATION_STATUS;

	/**
	 * The feature id for the '<em><b>Removal Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_COMPONENT__REMOVAL_DATE = TOP_LEVEL_DICTIONARY_ENTRY__REMOVAL_DATE;

	/**
	 * The feature id for the '<em><b>Data Dictionary</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_COMPONENT__DATA_DICTIONARY = TOP_LEVEL_DICTIONARY_ENTRY__DATA_DICTIONARY;

	/**
	 * The feature id for the '<em><b>Sub Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_COMPONENT__SUB_TYPE = TOP_LEVEL_DICTIONARY_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_COMPONENT__SUPER_TYPE = TOP_LEVEL_DICTIONARY_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_COMPONENT__ELEMENT = TOP_LEVEL_DICTIONARY_ENTRY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Derivation Component</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_COMPONENT__DERIVATION_COMPONENT = TOP_LEVEL_DICTIONARY_ENTRY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Association Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_COMPONENT__ASSOCIATION_DOMAIN = TOP_LEVEL_DICTIONARY_ENTRY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Derivation Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_COMPONENT__DERIVATION_ELEMENT = TOP_LEVEL_DICTIONARY_ENTRY_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Business Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_COMPONENT_FEATURE_COUNT = TOP_LEVEL_DICTIONARY_ENTRY_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Removal Date Registration Status</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_COMPONENT___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN = TOP_LEVEL_DICTIONARY_ENTRY___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN;

	/**
	 * The operation id for the '<em>Name First Letter Uppercase</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_COMPONENT___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN = TOP_LEVEL_DICTIONARY_ENTRY___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN;

	/**
	 * The operation id for the '<em>Business Elements Have Unique Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_COMPONENT___BUSINESS_ELEMENTS_HAVE_UNIQUE_NAMES__MAP_DIAGNOSTICCHAIN = TOP_LEVEL_DICTIONARY_ENTRY_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Business Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_COMPONENT_OPERATION_COUNT = TOP_LEVEL_DICTIONARY_ENTRY_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link iso20022.impl.BusinessElementTypeImpl <em>Business Element Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso20022.impl.BusinessElementTypeImpl
	 * @see iso20022.impl.Iso20022PackageImpl#getBusinessElementType()
	 * @generated
	 */
	int BUSINESS_ELEMENT_TYPE = 32;

	/**
	 * The feature id for the '<em><b>Next Versions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ELEMENT_TYPE__NEXT_VERSIONS = REPOSITORY_TYPE__NEXT_VERSIONS;

	/**
	 * The feature id for the '<em><b>Previous Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ELEMENT_TYPE__PREVIOUS_VERSION = REPOSITORY_TYPE__PREVIOUS_VERSION;

	/**
	 * The feature id for the '<em><b>Object Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ELEMENT_TYPE__OBJECT_IDENTIFIER = REPOSITORY_TYPE__OBJECT_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ELEMENT_TYPE__NAME = REPOSITORY_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ELEMENT_TYPE__DEFINITION = REPOSITORY_TYPE__DEFINITION;

	/**
	 * The feature id for the '<em><b>Semantic Markup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ELEMENT_TYPE__SEMANTIC_MARKUP = REPOSITORY_TYPE__SEMANTIC_MARKUP;

	/**
	 * The feature id for the '<em><b>Doclet</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ELEMENT_TYPE__DOCLET = REPOSITORY_TYPE__DOCLET;

	/**
	 * The feature id for the '<em><b>Example</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ELEMENT_TYPE__EXAMPLE = REPOSITORY_TYPE__EXAMPLE;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ELEMENT_TYPE__CONSTRAINT = REPOSITORY_TYPE__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Registration Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ELEMENT_TYPE__REGISTRATION_STATUS = REPOSITORY_TYPE__REGISTRATION_STATUS;

	/**
	 * The feature id for the '<em><b>Removal Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ELEMENT_TYPE__REMOVAL_DATE = REPOSITORY_TYPE__REMOVAL_DATE;

	/**
	 * The number of structural features of the '<em>Business Element Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ELEMENT_TYPE_FEATURE_COUNT = REPOSITORY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Removal Date Registration Status</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ELEMENT_TYPE___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN = REPOSITORY_TYPE___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN;

	/**
	 * The operation id for the '<em>Name First Letter Uppercase</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ELEMENT_TYPE___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN = REPOSITORY_TYPE___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN;

	/**
	 * The number of operations of the '<em>Business Element Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ELEMENT_TYPE_OPERATION_COUNT = REPOSITORY_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso20022.impl.BusinessConceptImpl <em>Business Concept</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso20022.impl.BusinessConceptImpl
	 * @see iso20022.impl.Iso20022PackageImpl#getBusinessConcept()
	 * @generated
	 */
	int BUSINESS_CONCEPT = 33;

	/**
	 * The feature id for the '<em><b>Next Versions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_CONCEPT__NEXT_VERSIONS = MODEL_ENTITY__NEXT_VERSIONS;

	/**
	 * The feature id for the '<em><b>Previous Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_CONCEPT__PREVIOUS_VERSION = MODEL_ENTITY__PREVIOUS_VERSION;

	/**
	 * The feature id for the '<em><b>Object Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_CONCEPT__OBJECT_IDENTIFIER = MODEL_ENTITY__OBJECT_IDENTIFIER;

	/**
	 * The number of structural features of the '<em>Business Concept</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_CONCEPT_FEATURE_COUNT = MODEL_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Business Concept</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_CONCEPT_OPERATION_COUNT = MODEL_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso20022.impl.BusinessElementImpl <em>Business Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso20022.impl.BusinessElementImpl
	 * @see iso20022.impl.Iso20022PackageImpl#getBusinessElement()
	 * @generated
	 */
	int BUSINESS_ELEMENT = 34;

	/**
	 * The feature id for the '<em><b>Next Versions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ELEMENT__NEXT_VERSIONS = CONSTRUCT__NEXT_VERSIONS;

	/**
	 * The feature id for the '<em><b>Previous Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ELEMENT__PREVIOUS_VERSION = CONSTRUCT__PREVIOUS_VERSION;

	/**
	 * The feature id for the '<em><b>Object Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ELEMENT__OBJECT_IDENTIFIER = CONSTRUCT__OBJECT_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ELEMENT__NAME = CONSTRUCT__NAME;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ELEMENT__DEFINITION = CONSTRUCT__DEFINITION;

	/**
	 * The feature id for the '<em><b>Semantic Markup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ELEMENT__SEMANTIC_MARKUP = CONSTRUCT__SEMANTIC_MARKUP;

	/**
	 * The feature id for the '<em><b>Doclet</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ELEMENT__DOCLET = CONSTRUCT__DOCLET;

	/**
	 * The feature id for the '<em><b>Example</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ELEMENT__EXAMPLE = CONSTRUCT__EXAMPLE;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ELEMENT__CONSTRAINT = CONSTRUCT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Registration Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ELEMENT__REGISTRATION_STATUS = CONSTRUCT__REGISTRATION_STATUS;

	/**
	 * The feature id for the '<em><b>Removal Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ELEMENT__REMOVAL_DATE = CONSTRUCT__REMOVAL_DATE;

	/**
	 * The feature id for the '<em><b>Max Occurs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ELEMENT__MAX_OCCURS = CONSTRUCT__MAX_OCCURS;

	/**
	 * The feature id for the '<em><b>Min Occurs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ELEMENT__MIN_OCCURS = CONSTRUCT__MIN_OCCURS;

	/**
	 * The feature id for the '<em><b>Member Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ELEMENT__MEMBER_TYPE = CONSTRUCT__MEMBER_TYPE;

	/**
	 * The feature id for the '<em><b>Is Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ELEMENT__IS_DERIVED = CONSTRUCT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Derivation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ELEMENT__DERIVATION = CONSTRUCT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Business Element Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ELEMENT__BUSINESS_ELEMENT_TYPE = CONSTRUCT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Element Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ELEMENT__ELEMENT_CONTEXT = CONSTRUCT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Business Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ELEMENT_FEATURE_COUNT = CONSTRUCT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Removal Date Registration Status</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ELEMENT___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN = CONSTRUCT___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN;

	/**
	 * The operation id for the '<em>Name First Letter Uppercase</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ELEMENT___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN = CONSTRUCT___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN;

	/**
	 * The number of operations of the '<em>Business Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ELEMENT_OPERATION_COUNT = CONSTRUCT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso20022.impl.MessageComponentTypeImpl <em>Message Component Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso20022.impl.MessageComponentTypeImpl
	 * @see iso20022.impl.Iso20022PackageImpl#getMessageComponentType()
	 * @generated
	 */
	int MESSAGE_COMPONENT_TYPE = 35;

	/**
	 * The feature id for the '<em><b>Next Versions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_COMPONENT_TYPE__NEXT_VERSIONS = TOP_LEVEL_DICTIONARY_ENTRY__NEXT_VERSIONS;

	/**
	 * The feature id for the '<em><b>Previous Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_COMPONENT_TYPE__PREVIOUS_VERSION = TOP_LEVEL_DICTIONARY_ENTRY__PREVIOUS_VERSION;

	/**
	 * The feature id for the '<em><b>Object Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_COMPONENT_TYPE__OBJECT_IDENTIFIER = TOP_LEVEL_DICTIONARY_ENTRY__OBJECT_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_COMPONENT_TYPE__NAME = TOP_LEVEL_DICTIONARY_ENTRY__NAME;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_COMPONENT_TYPE__DEFINITION = TOP_LEVEL_DICTIONARY_ENTRY__DEFINITION;

	/**
	 * The feature id for the '<em><b>Semantic Markup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_COMPONENT_TYPE__SEMANTIC_MARKUP = TOP_LEVEL_DICTIONARY_ENTRY__SEMANTIC_MARKUP;

	/**
	 * The feature id for the '<em><b>Doclet</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_COMPONENT_TYPE__DOCLET = TOP_LEVEL_DICTIONARY_ENTRY__DOCLET;

	/**
	 * The feature id for the '<em><b>Example</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_COMPONENT_TYPE__EXAMPLE = TOP_LEVEL_DICTIONARY_ENTRY__EXAMPLE;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_COMPONENT_TYPE__CONSTRAINT = TOP_LEVEL_DICTIONARY_ENTRY__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Registration Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_COMPONENT_TYPE__REGISTRATION_STATUS = TOP_LEVEL_DICTIONARY_ENTRY__REGISTRATION_STATUS;

	/**
	 * The feature id for the '<em><b>Removal Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_COMPONENT_TYPE__REMOVAL_DATE = TOP_LEVEL_DICTIONARY_ENTRY__REMOVAL_DATE;

	/**
	 * The feature id for the '<em><b>Data Dictionary</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_COMPONENT_TYPE__DATA_DICTIONARY = TOP_LEVEL_DICTIONARY_ENTRY__DATA_DICTIONARY;

	/**
	 * The feature id for the '<em><b>Message Building Block</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_COMPONENT_TYPE__MESSAGE_BUILDING_BLOCK = TOP_LEVEL_DICTIONARY_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Technical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_COMPONENT_TYPE__IS_TECHNICAL = TOP_LEVEL_DICTIONARY_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Trace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_COMPONENT_TYPE__TRACE = TOP_LEVEL_DICTIONARY_ENTRY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Message Component Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_COMPONENT_TYPE_FEATURE_COUNT = TOP_LEVEL_DICTIONARY_ENTRY_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Removal Date Registration Status</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_COMPONENT_TYPE___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN = TOP_LEVEL_DICTIONARY_ENTRY___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN;

	/**
	 * The operation id for the '<em>Name First Letter Uppercase</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_COMPONENT_TYPE___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN = TOP_LEVEL_DICTIONARY_ENTRY___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN;

	/**
	 * The number of operations of the '<em>Message Component Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_COMPONENT_TYPE_OPERATION_COUNT = TOP_LEVEL_DICTIONARY_ENTRY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso20022.impl.MessageBuildingBlockImpl <em>Message Building Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso20022.impl.MessageBuildingBlockImpl
	 * @see iso20022.impl.Iso20022PackageImpl#getMessageBuildingBlock()
	 * @generated
	 */
	int MESSAGE_BUILDING_BLOCK = 36;

	/**
	 * The feature id for the '<em><b>Next Versions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_BUILDING_BLOCK__NEXT_VERSIONS = MESSAGE_CONSTRUCT__NEXT_VERSIONS;

	/**
	 * The feature id for the '<em><b>Previous Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_BUILDING_BLOCK__PREVIOUS_VERSION = MESSAGE_CONSTRUCT__PREVIOUS_VERSION;

	/**
	 * The feature id for the '<em><b>Object Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_BUILDING_BLOCK__OBJECT_IDENTIFIER = MESSAGE_CONSTRUCT__OBJECT_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_BUILDING_BLOCK__NAME = MESSAGE_CONSTRUCT__NAME;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_BUILDING_BLOCK__DEFINITION = MESSAGE_CONSTRUCT__DEFINITION;

	/**
	 * The feature id for the '<em><b>Semantic Markup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_BUILDING_BLOCK__SEMANTIC_MARKUP = MESSAGE_CONSTRUCT__SEMANTIC_MARKUP;

	/**
	 * The feature id for the '<em><b>Doclet</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_BUILDING_BLOCK__DOCLET = MESSAGE_CONSTRUCT__DOCLET;

	/**
	 * The feature id for the '<em><b>Example</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_BUILDING_BLOCK__EXAMPLE = MESSAGE_CONSTRUCT__EXAMPLE;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_BUILDING_BLOCK__CONSTRAINT = MESSAGE_CONSTRUCT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Registration Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_BUILDING_BLOCK__REGISTRATION_STATUS = MESSAGE_CONSTRUCT__REGISTRATION_STATUS;

	/**
	 * The feature id for the '<em><b>Removal Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_BUILDING_BLOCK__REMOVAL_DATE = MESSAGE_CONSTRUCT__REMOVAL_DATE;

	/**
	 * The feature id for the '<em><b>Max Occurs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_BUILDING_BLOCK__MAX_OCCURS = MESSAGE_CONSTRUCT__MAX_OCCURS;

	/**
	 * The feature id for the '<em><b>Min Occurs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_BUILDING_BLOCK__MIN_OCCURS = MESSAGE_CONSTRUCT__MIN_OCCURS;

	/**
	 * The feature id for the '<em><b>Member Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_BUILDING_BLOCK__MEMBER_TYPE = MESSAGE_CONSTRUCT__MEMBER_TYPE;

	/**
	 * The feature id for the '<em><b>Xml Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_BUILDING_BLOCK__XML_TAG = MESSAGE_CONSTRUCT__XML_TAG;

	/**
	 * The feature id for the '<em><b>Xml Member Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_BUILDING_BLOCK__XML_MEMBER_TYPE = MESSAGE_CONSTRUCT__XML_MEMBER_TYPE;

	/**
	 * The feature id for the '<em><b>Simple Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_BUILDING_BLOCK__SIMPLE_TYPE = MESSAGE_CONSTRUCT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Complex Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_BUILDING_BLOCK__COMPLEX_TYPE = MESSAGE_CONSTRUCT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Message Building Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_BUILDING_BLOCK_FEATURE_COUNT = MESSAGE_CONSTRUCT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Removal Date Registration Status</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_BUILDING_BLOCK___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN = MESSAGE_CONSTRUCT___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN;

	/**
	 * The operation id for the '<em>Name First Letter Uppercase</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_BUILDING_BLOCK___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN = MESSAGE_CONSTRUCT___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN;

	/**
	 * The operation id for the '<em>Message Building Block Has Exactly One Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_BUILDING_BLOCK___MESSAGE_BUILDING_BLOCK_HAS_EXACTLY_ONE_TYPE__MAP_DIAGNOSTICCHAIN = MESSAGE_CONSTRUCT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Message Building Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_BUILDING_BLOCK_OPERATION_COUNT = MESSAGE_CONSTRUCT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link iso20022.impl.DataTypeImpl <em>Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso20022.impl.DataTypeImpl
	 * @see iso20022.impl.Iso20022PackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 37;

	/**
	 * The feature id for the '<em><b>Next Versions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__NEXT_VERSIONS = TOP_LEVEL_DICTIONARY_ENTRY__NEXT_VERSIONS;

	/**
	 * The feature id for the '<em><b>Previous Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__PREVIOUS_VERSION = TOP_LEVEL_DICTIONARY_ENTRY__PREVIOUS_VERSION;

	/**
	 * The feature id for the '<em><b>Object Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__OBJECT_IDENTIFIER = TOP_LEVEL_DICTIONARY_ENTRY__OBJECT_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__NAME = TOP_LEVEL_DICTIONARY_ENTRY__NAME;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__DEFINITION = TOP_LEVEL_DICTIONARY_ENTRY__DEFINITION;

	/**
	 * The feature id for the '<em><b>Semantic Markup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__SEMANTIC_MARKUP = TOP_LEVEL_DICTIONARY_ENTRY__SEMANTIC_MARKUP;

	/**
	 * The feature id for the '<em><b>Doclet</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__DOCLET = TOP_LEVEL_DICTIONARY_ENTRY__DOCLET;

	/**
	 * The feature id for the '<em><b>Example</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__EXAMPLE = TOP_LEVEL_DICTIONARY_ENTRY__EXAMPLE;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__CONSTRAINT = TOP_LEVEL_DICTIONARY_ENTRY__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Registration Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__REGISTRATION_STATUS = TOP_LEVEL_DICTIONARY_ENTRY__REGISTRATION_STATUS;

	/**
	 * The feature id for the '<em><b>Removal Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__REMOVAL_DATE = TOP_LEVEL_DICTIONARY_ENTRY__REMOVAL_DATE;

	/**
	 * The feature id for the '<em><b>Data Dictionary</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__DATA_DICTIONARY = TOP_LEVEL_DICTIONARY_ENTRY__DATA_DICTIONARY;

	/**
	 * The number of structural features of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FEATURE_COUNT = TOP_LEVEL_DICTIONARY_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Removal Date Registration Status</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN = TOP_LEVEL_DICTIONARY_ENTRY___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN;

	/**
	 * The operation id for the '<em>Name First Letter Uppercase</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN = TOP_LEVEL_DICTIONARY_ENTRY___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN;

	/**
	 * The number of operations of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_OPERATION_COUNT = TOP_LEVEL_DICTIONARY_ENTRY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso20022.impl.BusinessAssociationEndImpl <em>Business Association End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso20022.impl.BusinessAssociationEndImpl
	 * @see iso20022.impl.Iso20022PackageImpl#getBusinessAssociationEnd()
	 * @generated
	 */
	int BUSINESS_ASSOCIATION_END = 38;

	/**
	 * The feature id for the '<em><b>Next Versions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ASSOCIATION_END__NEXT_VERSIONS = BUSINESS_ELEMENT__NEXT_VERSIONS;

	/**
	 * The feature id for the '<em><b>Previous Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ASSOCIATION_END__PREVIOUS_VERSION = BUSINESS_ELEMENT__PREVIOUS_VERSION;

	/**
	 * The feature id for the '<em><b>Object Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ASSOCIATION_END__OBJECT_IDENTIFIER = BUSINESS_ELEMENT__OBJECT_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ASSOCIATION_END__NAME = BUSINESS_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ASSOCIATION_END__DEFINITION = BUSINESS_ELEMENT__DEFINITION;

	/**
	 * The feature id for the '<em><b>Semantic Markup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ASSOCIATION_END__SEMANTIC_MARKUP = BUSINESS_ELEMENT__SEMANTIC_MARKUP;

	/**
	 * The feature id for the '<em><b>Doclet</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ASSOCIATION_END__DOCLET = BUSINESS_ELEMENT__DOCLET;

	/**
	 * The feature id for the '<em><b>Example</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ASSOCIATION_END__EXAMPLE = BUSINESS_ELEMENT__EXAMPLE;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ASSOCIATION_END__CONSTRAINT = BUSINESS_ELEMENT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Registration Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ASSOCIATION_END__REGISTRATION_STATUS = BUSINESS_ELEMENT__REGISTRATION_STATUS;

	/**
	 * The feature id for the '<em><b>Removal Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ASSOCIATION_END__REMOVAL_DATE = BUSINESS_ELEMENT__REMOVAL_DATE;

	/**
	 * The feature id for the '<em><b>Max Occurs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ASSOCIATION_END__MAX_OCCURS = BUSINESS_ELEMENT__MAX_OCCURS;

	/**
	 * The feature id for the '<em><b>Min Occurs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ASSOCIATION_END__MIN_OCCURS = BUSINESS_ELEMENT__MIN_OCCURS;

	/**
	 * The feature id for the '<em><b>Member Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ASSOCIATION_END__MEMBER_TYPE = BUSINESS_ELEMENT__MEMBER_TYPE;

	/**
	 * The feature id for the '<em><b>Is Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ASSOCIATION_END__IS_DERIVED = BUSINESS_ELEMENT__IS_DERIVED;

	/**
	 * The feature id for the '<em><b>Derivation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ASSOCIATION_END__DERIVATION = BUSINESS_ELEMENT__DERIVATION;

	/**
	 * The feature id for the '<em><b>Business Element Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ASSOCIATION_END__BUSINESS_ELEMENT_TYPE = BUSINESS_ELEMENT__BUSINESS_ELEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Element Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ASSOCIATION_END__ELEMENT_CONTEXT = BUSINESS_ELEMENT__ELEMENT_CONTEXT;

	/**
	 * The feature id for the '<em><b>Opposite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ASSOCIATION_END__OPPOSITE = BUSINESS_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Aggregation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ASSOCIATION_END__AGGREGATION = BUSINESS_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ASSOCIATION_END__TYPE = BUSINESS_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Business Association End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ASSOCIATION_END_FEATURE_COUNT = BUSINESS_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Removal Date Registration Status</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ASSOCIATION_END___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN = BUSINESS_ELEMENT___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN;

	/**
	 * The operation id for the '<em>Name First Letter Uppercase</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ASSOCIATION_END___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN = BUSINESS_ELEMENT___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN;

	/**
	 * The operation id for the '<em>At Most One Aggregated End</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ASSOCIATION_END___AT_MOST_ONE_AGGREGATED_END__MAP_DIAGNOSTICCHAIN = BUSINESS_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Context Consistent With Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ASSOCIATION_END___CONTEXT_CONSISTENT_WITH_TYPE__MAP_DIAGNOSTICCHAIN = BUSINESS_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Business Association End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ASSOCIATION_END_OPERATION_COUNT = BUSINESS_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link iso20022.impl.MessageElementContainerImpl <em>Message Element Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso20022.impl.MessageElementContainerImpl
	 * @see iso20022.impl.Iso20022PackageImpl#getMessageElementContainer()
	 * @generated
	 */
	int MESSAGE_ELEMENT_CONTAINER = 39;

	/**
	 * The feature id for the '<em><b>Next Versions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ELEMENT_CONTAINER__NEXT_VERSIONS = MESSAGE_COMPONENT_TYPE__NEXT_VERSIONS;

	/**
	 * The feature id for the '<em><b>Previous Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ELEMENT_CONTAINER__PREVIOUS_VERSION = MESSAGE_COMPONENT_TYPE__PREVIOUS_VERSION;

	/**
	 * The feature id for the '<em><b>Object Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ELEMENT_CONTAINER__OBJECT_IDENTIFIER = MESSAGE_COMPONENT_TYPE__OBJECT_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ELEMENT_CONTAINER__NAME = MESSAGE_COMPONENT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ELEMENT_CONTAINER__DEFINITION = MESSAGE_COMPONENT_TYPE__DEFINITION;

	/**
	 * The feature id for the '<em><b>Semantic Markup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ELEMENT_CONTAINER__SEMANTIC_MARKUP = MESSAGE_COMPONENT_TYPE__SEMANTIC_MARKUP;

	/**
	 * The feature id for the '<em><b>Doclet</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ELEMENT_CONTAINER__DOCLET = MESSAGE_COMPONENT_TYPE__DOCLET;

	/**
	 * The feature id for the '<em><b>Example</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ELEMENT_CONTAINER__EXAMPLE = MESSAGE_COMPONENT_TYPE__EXAMPLE;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ELEMENT_CONTAINER__CONSTRAINT = MESSAGE_COMPONENT_TYPE__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Registration Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ELEMENT_CONTAINER__REGISTRATION_STATUS = MESSAGE_COMPONENT_TYPE__REGISTRATION_STATUS;

	/**
	 * The feature id for the '<em><b>Removal Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ELEMENT_CONTAINER__REMOVAL_DATE = MESSAGE_COMPONENT_TYPE__REMOVAL_DATE;

	/**
	 * The feature id for the '<em><b>Data Dictionary</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ELEMENT_CONTAINER__DATA_DICTIONARY = MESSAGE_COMPONENT_TYPE__DATA_DICTIONARY;

	/**
	 * The feature id for the '<em><b>Message Building Block</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ELEMENT_CONTAINER__MESSAGE_BUILDING_BLOCK = MESSAGE_COMPONENT_TYPE__MESSAGE_BUILDING_BLOCK;

	/**
	 * The feature id for the '<em><b>Is Technical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ELEMENT_CONTAINER__IS_TECHNICAL = MESSAGE_COMPONENT_TYPE__IS_TECHNICAL;

	/**
	 * The feature id for the '<em><b>Trace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ELEMENT_CONTAINER__TRACE = MESSAGE_COMPONENT_TYPE__TRACE;

	/**
	 * The feature id for the '<em><b>Message Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ELEMENT_CONTAINER__MESSAGE_ELEMENT = MESSAGE_COMPONENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Message Element Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ELEMENT_CONTAINER_FEATURE_COUNT = MESSAGE_COMPONENT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Removal Date Registration Status</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ELEMENT_CONTAINER___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN = MESSAGE_COMPONENT_TYPE___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN;

	/**
	 * The operation id for the '<em>Name First Letter Uppercase</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ELEMENT_CONTAINER___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN = MESSAGE_COMPONENT_TYPE___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN;

	/**
	 * The operation id for the '<em>Message Elements Have Unique Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ELEMENT_CONTAINER___MESSAGE_ELEMENTS_HAVE_UNIQUE_NAMES__MAP_DIAGNOSTICCHAIN = MESSAGE_COMPONENT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Technical Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ELEMENT_CONTAINER___TECHNICAL_ELEMENT__MAP_DIAGNOSTICCHAIN = MESSAGE_COMPONENT_TYPE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Message Element Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ELEMENT_CONTAINER_OPERATION_COUNT = MESSAGE_COMPONENT_TYPE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link iso20022.impl.MessageComponentImpl <em>Message Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso20022.impl.MessageComponentImpl
	 * @see iso20022.impl.Iso20022PackageImpl#getMessageComponent()
	 * @generated
	 */
	int MESSAGE_COMPONENT = 40;

	/**
	 * The feature id for the '<em><b>Next Versions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_COMPONENT__NEXT_VERSIONS = MESSAGE_ELEMENT_CONTAINER__NEXT_VERSIONS;

	/**
	 * The feature id for the '<em><b>Previous Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_COMPONENT__PREVIOUS_VERSION = MESSAGE_ELEMENT_CONTAINER__PREVIOUS_VERSION;

	/**
	 * The feature id for the '<em><b>Object Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_COMPONENT__OBJECT_IDENTIFIER = MESSAGE_ELEMENT_CONTAINER__OBJECT_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_COMPONENT__NAME = MESSAGE_ELEMENT_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_COMPONENT__DEFINITION = MESSAGE_ELEMENT_CONTAINER__DEFINITION;

	/**
	 * The feature id for the '<em><b>Semantic Markup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_COMPONENT__SEMANTIC_MARKUP = MESSAGE_ELEMENT_CONTAINER__SEMANTIC_MARKUP;

	/**
	 * The feature id for the '<em><b>Doclet</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_COMPONENT__DOCLET = MESSAGE_ELEMENT_CONTAINER__DOCLET;

	/**
	 * The feature id for the '<em><b>Example</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_COMPONENT__EXAMPLE = MESSAGE_ELEMENT_CONTAINER__EXAMPLE;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_COMPONENT__CONSTRAINT = MESSAGE_ELEMENT_CONTAINER__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Registration Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_COMPONENT__REGISTRATION_STATUS = MESSAGE_ELEMENT_CONTAINER__REGISTRATION_STATUS;

	/**
	 * The feature id for the '<em><b>Removal Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_COMPONENT__REMOVAL_DATE = MESSAGE_ELEMENT_CONTAINER__REMOVAL_DATE;

	/**
	 * The feature id for the '<em><b>Data Dictionary</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_COMPONENT__DATA_DICTIONARY = MESSAGE_ELEMENT_CONTAINER__DATA_DICTIONARY;

	/**
	 * The feature id for the '<em><b>Message Building Block</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_COMPONENT__MESSAGE_BUILDING_BLOCK = MESSAGE_ELEMENT_CONTAINER__MESSAGE_BUILDING_BLOCK;

	/**
	 * The feature id for the '<em><b>Is Technical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_COMPONENT__IS_TECHNICAL = MESSAGE_ELEMENT_CONTAINER__IS_TECHNICAL;

	/**
	 * The feature id for the '<em><b>Trace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_COMPONENT__TRACE = MESSAGE_ELEMENT_CONTAINER__TRACE;

	/**
	 * The feature id for the '<em><b>Message Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_COMPONENT__MESSAGE_ELEMENT = MESSAGE_ELEMENT_CONTAINER__MESSAGE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Xors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_COMPONENT__XORS = MESSAGE_ELEMENT_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Message Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_COMPONENT_FEATURE_COUNT = MESSAGE_ELEMENT_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Removal Date Registration Status</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_COMPONENT___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN = MESSAGE_ELEMENT_CONTAINER___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN;

	/**
	 * The operation id for the '<em>Name First Letter Uppercase</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_COMPONENT___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN = MESSAGE_ELEMENT_CONTAINER___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN;

	/**
	 * The operation id for the '<em>Message Elements Have Unique Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_COMPONENT___MESSAGE_ELEMENTS_HAVE_UNIQUE_NAMES__MAP_DIAGNOSTICCHAIN = MESSAGE_ELEMENT_CONTAINER___MESSAGE_ELEMENTS_HAVE_UNIQUE_NAMES__MAP_DIAGNOSTICCHAIN;

	/**
	 * The operation id for the '<em>Technical Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_COMPONENT___TECHNICAL_ELEMENT__MAP_DIAGNOSTICCHAIN = MESSAGE_ELEMENT_CONTAINER___TECHNICAL_ELEMENT__MAP_DIAGNOSTICCHAIN;

	/**
	 * The number of operations of the '<em>Message Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_COMPONENT_OPERATION_COUNT = MESSAGE_ELEMENT_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso20022.impl.MessageChoreographyImpl <em>Message Choreography</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso20022.impl.MessageChoreographyImpl
	 * @see iso20022.impl.Iso20022PackageImpl#getMessageChoreography()
	 * @generated
	 */
	int MESSAGE_CHOREOGRAPHY = 41;

	/**
	 * The feature id for the '<em><b>Next Versions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_CHOREOGRAPHY__NEXT_VERSIONS = TOP_LEVEL_CATALOGUE_ENTRY__NEXT_VERSIONS;

	/**
	 * The feature id for the '<em><b>Previous Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_CHOREOGRAPHY__PREVIOUS_VERSION = TOP_LEVEL_CATALOGUE_ENTRY__PREVIOUS_VERSION;

	/**
	 * The feature id for the '<em><b>Object Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_CHOREOGRAPHY__OBJECT_IDENTIFIER = TOP_LEVEL_CATALOGUE_ENTRY__OBJECT_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_CHOREOGRAPHY__NAME = TOP_LEVEL_CATALOGUE_ENTRY__NAME;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_CHOREOGRAPHY__DEFINITION = TOP_LEVEL_CATALOGUE_ENTRY__DEFINITION;

	/**
	 * The feature id for the '<em><b>Semantic Markup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_CHOREOGRAPHY__SEMANTIC_MARKUP = TOP_LEVEL_CATALOGUE_ENTRY__SEMANTIC_MARKUP;

	/**
	 * The feature id for the '<em><b>Doclet</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_CHOREOGRAPHY__DOCLET = TOP_LEVEL_CATALOGUE_ENTRY__DOCLET;

	/**
	 * The feature id for the '<em><b>Example</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_CHOREOGRAPHY__EXAMPLE = TOP_LEVEL_CATALOGUE_ENTRY__EXAMPLE;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_CHOREOGRAPHY__CONSTRAINT = TOP_LEVEL_CATALOGUE_ENTRY__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Registration Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_CHOREOGRAPHY__REGISTRATION_STATUS = TOP_LEVEL_CATALOGUE_ENTRY__REGISTRATION_STATUS;

	/**
	 * The feature id for the '<em><b>Removal Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_CHOREOGRAPHY__REMOVAL_DATE = TOP_LEVEL_CATALOGUE_ENTRY__REMOVAL_DATE;

	/**
	 * The feature id for the '<em><b>Business Process Catalogue</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_CHOREOGRAPHY__BUSINESS_PROCESS_CATALOGUE = TOP_LEVEL_CATALOGUE_ENTRY__BUSINESS_PROCESS_CATALOGUE;

	/**
	 * The feature id for the '<em><b>Business Transaction Trace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_CHOREOGRAPHY__BUSINESS_TRANSACTION_TRACE = TOP_LEVEL_CATALOGUE_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Message Definition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_CHOREOGRAPHY__MESSAGE_DEFINITION = TOP_LEVEL_CATALOGUE_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Message Choreography</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_CHOREOGRAPHY_FEATURE_COUNT = TOP_LEVEL_CATALOGUE_ENTRY_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Removal Date Registration Status</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_CHOREOGRAPHY___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN = TOP_LEVEL_CATALOGUE_ENTRY___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN;

	/**
	 * The operation id for the '<em>Name First Letter Uppercase</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_CHOREOGRAPHY___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN = TOP_LEVEL_CATALOGUE_ENTRY___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN;

	/**
	 * The number of operations of the '<em>Message Choreography</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_CHOREOGRAPHY_OPERATION_COUNT = TOP_LEVEL_CATALOGUE_ENTRY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso20022.impl.BusinessTransactionImpl <em>Business Transaction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso20022.impl.BusinessTransactionImpl
	 * @see iso20022.impl.Iso20022PackageImpl#getBusinessTransaction()
	 * @generated
	 */
	int BUSINESS_TRANSACTION = 42;

	/**
	 * The feature id for the '<em><b>Next Versions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_TRANSACTION__NEXT_VERSIONS = TOP_LEVEL_CATALOGUE_ENTRY__NEXT_VERSIONS;

	/**
	 * The feature id for the '<em><b>Previous Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_TRANSACTION__PREVIOUS_VERSION = TOP_LEVEL_CATALOGUE_ENTRY__PREVIOUS_VERSION;

	/**
	 * The feature id for the '<em><b>Object Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_TRANSACTION__OBJECT_IDENTIFIER = TOP_LEVEL_CATALOGUE_ENTRY__OBJECT_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_TRANSACTION__NAME = TOP_LEVEL_CATALOGUE_ENTRY__NAME;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_TRANSACTION__DEFINITION = TOP_LEVEL_CATALOGUE_ENTRY__DEFINITION;

	/**
	 * The feature id for the '<em><b>Semantic Markup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_TRANSACTION__SEMANTIC_MARKUP = TOP_LEVEL_CATALOGUE_ENTRY__SEMANTIC_MARKUP;

	/**
	 * The feature id for the '<em><b>Doclet</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_TRANSACTION__DOCLET = TOP_LEVEL_CATALOGUE_ENTRY__DOCLET;

	/**
	 * The feature id for the '<em><b>Example</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_TRANSACTION__EXAMPLE = TOP_LEVEL_CATALOGUE_ENTRY__EXAMPLE;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_TRANSACTION__CONSTRAINT = TOP_LEVEL_CATALOGUE_ENTRY__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Registration Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_TRANSACTION__REGISTRATION_STATUS = TOP_LEVEL_CATALOGUE_ENTRY__REGISTRATION_STATUS;

	/**
	 * The feature id for the '<em><b>Removal Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_TRANSACTION__REMOVAL_DATE = TOP_LEVEL_CATALOGUE_ENTRY__REMOVAL_DATE;

	/**
	 * The feature id for the '<em><b>Business Process Catalogue</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_TRANSACTION__BUSINESS_PROCESS_CATALOGUE = TOP_LEVEL_CATALOGUE_ENTRY__BUSINESS_PROCESS_CATALOGUE;

	/**
	 * The feature id for the '<em><b>Business Process Trace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_TRANSACTION__BUSINESS_PROCESS_TRACE = TOP_LEVEL_CATALOGUE_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_TRANSACTION__PARTICIPANT = TOP_LEVEL_CATALOGUE_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Transmission</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_TRANSACTION__TRANSMISSION = TOP_LEVEL_CATALOGUE_ENTRY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Message Transport Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_TRANSACTION__MESSAGE_TRANSPORT_MODE = TOP_LEVEL_CATALOGUE_ENTRY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Sub Transaction</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_TRANSACTION__SUB_TRANSACTION = TOP_LEVEL_CATALOGUE_ENTRY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Parent Transaction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_TRANSACTION__PARENT_TRANSACTION = TOP_LEVEL_CATALOGUE_ENTRY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Trace</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_TRANSACTION__TRACE = TOP_LEVEL_CATALOGUE_ENTRY_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Business Transaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_TRANSACTION_FEATURE_COUNT = TOP_LEVEL_CATALOGUE_ENTRY_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Removal Date Registration Status</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_TRANSACTION___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN = TOP_LEVEL_CATALOGUE_ENTRY___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN;

	/**
	 * The operation id for the '<em>Name First Letter Uppercase</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_TRANSACTION___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN = TOP_LEVEL_CATALOGUE_ENTRY___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN;

	/**
	 * The operation id for the '<em>Message Transmissions Have Unique Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_TRANSACTION___MESSAGE_TRANSMISSIONS_HAVE_UNIQUE_NAMES__MAP_DIAGNOSTICCHAIN = TOP_LEVEL_CATALOGUE_ENTRY_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Participants Have Unique Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_TRANSACTION___PARTICIPANTS_HAVE_UNIQUE_NAMES__MAP_DIAGNOSTICCHAIN = TOP_LEVEL_CATALOGUE_ENTRY_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Business Transaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_TRANSACTION_OPERATION_COUNT = TOP_LEVEL_CATALOGUE_ENTRY_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link iso20022.impl.BusinessProcessImpl <em>Business Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso20022.impl.BusinessProcessImpl
	 * @see iso20022.impl.Iso20022PackageImpl#getBusinessProcess()
	 * @generated
	 */
	int BUSINESS_PROCESS = 43;

	/**
	 * The feature id for the '<em><b>Next Versions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_PROCESS__NEXT_VERSIONS = TOP_LEVEL_CATALOGUE_ENTRY__NEXT_VERSIONS;

	/**
	 * The feature id for the '<em><b>Previous Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_PROCESS__PREVIOUS_VERSION = TOP_LEVEL_CATALOGUE_ENTRY__PREVIOUS_VERSION;

	/**
	 * The feature id for the '<em><b>Object Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_PROCESS__OBJECT_IDENTIFIER = TOP_LEVEL_CATALOGUE_ENTRY__OBJECT_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_PROCESS__NAME = TOP_LEVEL_CATALOGUE_ENTRY__NAME;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_PROCESS__DEFINITION = TOP_LEVEL_CATALOGUE_ENTRY__DEFINITION;

	/**
	 * The feature id for the '<em><b>Semantic Markup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_PROCESS__SEMANTIC_MARKUP = TOP_LEVEL_CATALOGUE_ENTRY__SEMANTIC_MARKUP;

	/**
	 * The feature id for the '<em><b>Doclet</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_PROCESS__DOCLET = TOP_LEVEL_CATALOGUE_ENTRY__DOCLET;

	/**
	 * The feature id for the '<em><b>Example</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_PROCESS__EXAMPLE = TOP_LEVEL_CATALOGUE_ENTRY__EXAMPLE;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_PROCESS__CONSTRAINT = TOP_LEVEL_CATALOGUE_ENTRY__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Registration Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_PROCESS__REGISTRATION_STATUS = TOP_LEVEL_CATALOGUE_ENTRY__REGISTRATION_STATUS;

	/**
	 * The feature id for the '<em><b>Removal Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_PROCESS__REMOVAL_DATE = TOP_LEVEL_CATALOGUE_ENTRY__REMOVAL_DATE;

	/**
	 * The feature id for the '<em><b>Business Process Catalogue</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_PROCESS__BUSINESS_PROCESS_CATALOGUE = TOP_LEVEL_CATALOGUE_ENTRY__BUSINESS_PROCESS_CATALOGUE;

	/**
	 * The feature id for the '<em><b>Extender</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_PROCESS__EXTENDER = TOP_LEVEL_CATALOGUE_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Extended</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_PROCESS__EXTENDED = TOP_LEVEL_CATALOGUE_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Included</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_PROCESS__INCLUDED = TOP_LEVEL_CATALOGUE_ENTRY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Includer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_PROCESS__INCLUDER = TOP_LEVEL_CATALOGUE_ENTRY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Business Role</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_PROCESS__BUSINESS_ROLE = TOP_LEVEL_CATALOGUE_ENTRY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Business Process Trace</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_PROCESS__BUSINESS_PROCESS_TRACE = TOP_LEVEL_CATALOGUE_ENTRY_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Business Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_PROCESS_FEATURE_COUNT = TOP_LEVEL_CATALOGUE_ENTRY_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Removal Date Registration Status</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_PROCESS___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN = TOP_LEVEL_CATALOGUE_ENTRY___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN;

	/**
	 * The operation id for the '<em>Name First Letter Uppercase</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_PROCESS___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN = TOP_LEVEL_CATALOGUE_ENTRY___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN;

	/**
	 * The number of operations of the '<em>Business Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_PROCESS_OPERATION_COUNT = TOP_LEVEL_CATALOGUE_ENTRY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso20022.impl.BusinessRoleImpl <em>Business Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso20022.impl.BusinessRoleImpl
	 * @see iso20022.impl.Iso20022PackageImpl#getBusinessRole()
	 * @generated
	 */
	int BUSINESS_ROLE = 44;

	/**
	 * The feature id for the '<em><b>Next Versions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ROLE__NEXT_VERSIONS = REPOSITORY_CONCEPT__NEXT_VERSIONS;

	/**
	 * The feature id for the '<em><b>Previous Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ROLE__PREVIOUS_VERSION = REPOSITORY_CONCEPT__PREVIOUS_VERSION;

	/**
	 * The feature id for the '<em><b>Object Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ROLE__OBJECT_IDENTIFIER = REPOSITORY_CONCEPT__OBJECT_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ROLE__NAME = REPOSITORY_CONCEPT__NAME;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ROLE__DEFINITION = REPOSITORY_CONCEPT__DEFINITION;

	/**
	 * The feature id for the '<em><b>Semantic Markup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ROLE__SEMANTIC_MARKUP = REPOSITORY_CONCEPT__SEMANTIC_MARKUP;

	/**
	 * The feature id for the '<em><b>Doclet</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ROLE__DOCLET = REPOSITORY_CONCEPT__DOCLET;

	/**
	 * The feature id for the '<em><b>Example</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ROLE__EXAMPLE = REPOSITORY_CONCEPT__EXAMPLE;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ROLE__CONSTRAINT = REPOSITORY_CONCEPT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Registration Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ROLE__REGISTRATION_STATUS = REPOSITORY_CONCEPT__REGISTRATION_STATUS;

	/**
	 * The feature id for the '<em><b>Removal Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ROLE__REMOVAL_DATE = REPOSITORY_CONCEPT__REMOVAL_DATE;

	/**
	 * The feature id for the '<em><b>Business Role Trace</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ROLE__BUSINESS_ROLE_TRACE = REPOSITORY_CONCEPT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Business Process</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ROLE__BUSINESS_PROCESS = REPOSITORY_CONCEPT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Business Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ROLE_FEATURE_COUNT = REPOSITORY_CONCEPT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Removal Date Registration Status</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ROLE___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN = REPOSITORY_CONCEPT___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN;

	/**
	 * The operation id for the '<em>Name First Letter Uppercase</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ROLE___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN = REPOSITORY_CONCEPT___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN;

	/**
	 * The number of operations of the '<em>Business Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ROLE_OPERATION_COUNT = REPOSITORY_CONCEPT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso20022.impl.ParticipantImpl <em>Participant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso20022.impl.ParticipantImpl
	 * @see iso20022.impl.Iso20022PackageImpl#getParticipant()
	 * @generated
	 */
	int PARTICIPANT = 45;

	/**
	 * The feature id for the '<em><b>Next Versions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__NEXT_VERSIONS = REPOSITORY_CONCEPT__NEXT_VERSIONS;

	/**
	 * The feature id for the '<em><b>Previous Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__PREVIOUS_VERSION = REPOSITORY_CONCEPT__PREVIOUS_VERSION;

	/**
	 * The feature id for the '<em><b>Object Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__OBJECT_IDENTIFIER = REPOSITORY_CONCEPT__OBJECT_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__NAME = REPOSITORY_CONCEPT__NAME;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__DEFINITION = REPOSITORY_CONCEPT__DEFINITION;

	/**
	 * The feature id for the '<em><b>Semantic Markup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__SEMANTIC_MARKUP = REPOSITORY_CONCEPT__SEMANTIC_MARKUP;

	/**
	 * The feature id for the '<em><b>Doclet</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__DOCLET = REPOSITORY_CONCEPT__DOCLET;

	/**
	 * The feature id for the '<em><b>Example</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__EXAMPLE = REPOSITORY_CONCEPT__EXAMPLE;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__CONSTRAINT = REPOSITORY_CONCEPT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Registration Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__REGISTRATION_STATUS = REPOSITORY_CONCEPT__REGISTRATION_STATUS;

	/**
	 * The feature id for the '<em><b>Removal Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__REMOVAL_DATE = REPOSITORY_CONCEPT__REMOVAL_DATE;

	/**
	 * The feature id for the '<em><b>Max Occurs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__MAX_OCCURS = REPOSITORY_CONCEPT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Min Occurs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__MIN_OCCURS = REPOSITORY_CONCEPT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Business Transaction</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__BUSINESS_TRANSACTION = REPOSITORY_CONCEPT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Receives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__RECEIVES = REPOSITORY_CONCEPT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Sends</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__SENDS = REPOSITORY_CONCEPT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Business Role Trace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__BUSINESS_ROLE_TRACE = REPOSITORY_CONCEPT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Participant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_FEATURE_COUNT = REPOSITORY_CONCEPT_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Removal Date Registration Status</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN = REPOSITORY_CONCEPT___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN;

	/**
	 * The operation id for the '<em>Name First Letter Uppercase</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN = REPOSITORY_CONCEPT___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN;

	/**
	 * The number of operations of the '<em>Participant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_OPERATION_COUNT = REPOSITORY_CONCEPT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso20022.impl.ReceiveImpl <em>Receive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso20022.impl.ReceiveImpl
	 * @see iso20022.impl.Iso20022PackageImpl#getReceive()
	 * @generated
	 */
	int RECEIVE = 46;

	/**
	 * The feature id for the '<em><b>Next Versions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE__NEXT_VERSIONS = MODEL_ENTITY__NEXT_VERSIONS;

	/**
	 * The feature id for the '<em><b>Previous Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE__PREVIOUS_VERSION = MODEL_ENTITY__PREVIOUS_VERSION;

	/**
	 * The feature id for the '<em><b>Object Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE__OBJECT_IDENTIFIER = MODEL_ENTITY__OBJECT_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Message Transmission</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE__MESSAGE_TRANSMISSION = MODEL_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Receiver</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE__RECEIVER = MODEL_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Receive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_FEATURE_COUNT = MODEL_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Receive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_OPERATION_COUNT = MODEL_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso20022.impl.MessageTransmissionImpl <em>Message Transmission</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso20022.impl.MessageTransmissionImpl
	 * @see iso20022.impl.Iso20022PackageImpl#getMessageTransmission()
	 * @generated
	 */
	int MESSAGE_TRANSMISSION = 47;

	/**
	 * The feature id for the '<em><b>Next Versions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TRANSMISSION__NEXT_VERSIONS = REPOSITORY_CONCEPT__NEXT_VERSIONS;

	/**
	 * The feature id for the '<em><b>Previous Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TRANSMISSION__PREVIOUS_VERSION = REPOSITORY_CONCEPT__PREVIOUS_VERSION;

	/**
	 * The feature id for the '<em><b>Object Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TRANSMISSION__OBJECT_IDENTIFIER = REPOSITORY_CONCEPT__OBJECT_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TRANSMISSION__NAME = REPOSITORY_CONCEPT__NAME;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TRANSMISSION__DEFINITION = REPOSITORY_CONCEPT__DEFINITION;

	/**
	 * The feature id for the '<em><b>Semantic Markup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TRANSMISSION__SEMANTIC_MARKUP = REPOSITORY_CONCEPT__SEMANTIC_MARKUP;

	/**
	 * The feature id for the '<em><b>Doclet</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TRANSMISSION__DOCLET = REPOSITORY_CONCEPT__DOCLET;

	/**
	 * The feature id for the '<em><b>Example</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TRANSMISSION__EXAMPLE = REPOSITORY_CONCEPT__EXAMPLE;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TRANSMISSION__CONSTRAINT = REPOSITORY_CONCEPT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Registration Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TRANSMISSION__REGISTRATION_STATUS = REPOSITORY_CONCEPT__REGISTRATION_STATUS;

	/**
	 * The feature id for the '<em><b>Removal Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TRANSMISSION__REMOVAL_DATE = REPOSITORY_CONCEPT__REMOVAL_DATE;

	/**
	 * The feature id for the '<em><b>Business Transaction</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TRANSMISSION__BUSINESS_TRANSACTION = REPOSITORY_CONCEPT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Derivation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TRANSMISSION__DERIVATION = REPOSITORY_CONCEPT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Message Type Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TRANSMISSION__MESSAGE_TYPE_DESCRIPTION = REPOSITORY_CONCEPT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Send</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TRANSMISSION__SEND = REPOSITORY_CONCEPT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Receive</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TRANSMISSION__RECEIVE = REPOSITORY_CONCEPT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Message Transmission</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TRANSMISSION_FEATURE_COUNT = REPOSITORY_CONCEPT_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Removal Date Registration Status</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TRANSMISSION___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN = REPOSITORY_CONCEPT___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN;

	/**
	 * The operation id for the '<em>Name First Letter Uppercase</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TRANSMISSION___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN = REPOSITORY_CONCEPT___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN;

	/**
	 * The number of operations of the '<em>Message Transmission</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TRANSMISSION_OPERATION_COUNT = REPOSITORY_CONCEPT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso20022.impl.SendImpl <em>Send</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso20022.impl.SendImpl
	 * @see iso20022.impl.Iso20022PackageImpl#getSend()
	 * @generated
	 */
	int SEND = 48;

	/**
	 * The feature id for the '<em><b>Next Versions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND__NEXT_VERSIONS = MODEL_ENTITY__NEXT_VERSIONS;

	/**
	 * The feature id for the '<em><b>Previous Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND__PREVIOUS_VERSION = MODEL_ENTITY__PREVIOUS_VERSION;

	/**
	 * The feature id for the '<em><b>Object Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND__OBJECT_IDENTIFIER = MODEL_ENTITY__OBJECT_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Sender</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND__SENDER = MODEL_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Message Transmission</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND__MESSAGE_TRANSMISSION = MODEL_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Send</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_FEATURE_COUNT = MODEL_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Send</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_OPERATION_COUNT = MODEL_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso20022.impl.MessageTransportModeImpl <em>Message Transport Mode</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso20022.impl.MessageTransportModeImpl
	 * @see iso20022.impl.Iso20022PackageImpl#getMessageTransportMode()
	 * @generated
	 */
	int MESSAGE_TRANSPORT_MODE = 49;

	/**
	 * The feature id for the '<em><b>Next Versions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TRANSPORT_MODE__NEXT_VERSIONS = TOP_LEVEL_CATALOGUE_ENTRY__NEXT_VERSIONS;

	/**
	 * The feature id for the '<em><b>Previous Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TRANSPORT_MODE__PREVIOUS_VERSION = TOP_LEVEL_CATALOGUE_ENTRY__PREVIOUS_VERSION;

	/**
	 * The feature id for the '<em><b>Object Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TRANSPORT_MODE__OBJECT_IDENTIFIER = TOP_LEVEL_CATALOGUE_ENTRY__OBJECT_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TRANSPORT_MODE__NAME = TOP_LEVEL_CATALOGUE_ENTRY__NAME;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TRANSPORT_MODE__DEFINITION = TOP_LEVEL_CATALOGUE_ENTRY__DEFINITION;

	/**
	 * The feature id for the '<em><b>Semantic Markup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TRANSPORT_MODE__SEMANTIC_MARKUP = TOP_LEVEL_CATALOGUE_ENTRY__SEMANTIC_MARKUP;

	/**
	 * The feature id for the '<em><b>Doclet</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TRANSPORT_MODE__DOCLET = TOP_LEVEL_CATALOGUE_ENTRY__DOCLET;

	/**
	 * The feature id for the '<em><b>Example</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TRANSPORT_MODE__EXAMPLE = TOP_LEVEL_CATALOGUE_ENTRY__EXAMPLE;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TRANSPORT_MODE__CONSTRAINT = TOP_LEVEL_CATALOGUE_ENTRY__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Registration Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TRANSPORT_MODE__REGISTRATION_STATUS = TOP_LEVEL_CATALOGUE_ENTRY__REGISTRATION_STATUS;

	/**
	 * The feature id for the '<em><b>Removal Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TRANSPORT_MODE__REMOVAL_DATE = TOP_LEVEL_CATALOGUE_ENTRY__REMOVAL_DATE;

	/**
	 * The feature id for the '<em><b>Business Process Catalogue</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TRANSPORT_MODE__BUSINESS_PROCESS_CATALOGUE = TOP_LEVEL_CATALOGUE_ENTRY__BUSINESS_PROCESS_CATALOGUE;

	/**
	 * The feature id for the '<em><b>Bounded Communication Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TRANSPORT_MODE__BOUNDED_COMMUNICATION_DELAY = TOP_LEVEL_CATALOGUE_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Maximum Clock Variation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TRANSPORT_MODE__MAXIMUM_CLOCK_VARIATION = TOP_LEVEL_CATALOGUE_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Maximum Message Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TRANSPORT_MODE__MAXIMUM_MESSAGE_SIZE = TOP_LEVEL_CATALOGUE_ENTRY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Message Delivery Window</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TRANSPORT_MODE__MESSAGE_DELIVERY_WINDOW = TOP_LEVEL_CATALOGUE_ENTRY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Message Sending Window</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TRANSPORT_MODE__MESSAGE_SENDING_WINDOW = TOP_LEVEL_CATALOGUE_ENTRY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Delivery Assurance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TRANSPORT_MODE__DELIVERY_ASSURANCE = TOP_LEVEL_CATALOGUE_ENTRY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Durability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TRANSPORT_MODE__DURABILITY = TOP_LEVEL_CATALOGUE_ENTRY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Message Casting</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TRANSPORT_MODE__MESSAGE_CASTING = TOP_LEVEL_CATALOGUE_ENTRY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Message Delivery Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TRANSPORT_MODE__MESSAGE_DELIVERY_ORDER = TOP_LEVEL_CATALOGUE_ENTRY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Message Validation Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TRANSPORT_MODE__MESSAGE_VALIDATION_LEVEL = TOP_LEVEL_CATALOGUE_ENTRY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Message Validation On Off</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TRANSPORT_MODE__MESSAGE_VALIDATION_ON_OFF = TOP_LEVEL_CATALOGUE_ENTRY_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Message Validation Results</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TRANSPORT_MODE__MESSAGE_VALIDATION_RESULTS = TOP_LEVEL_CATALOGUE_ENTRY_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Receiver Asynchronicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TRANSPORT_MODE__RECEIVER_ASYNCHRONICITY = TOP_LEVEL_CATALOGUE_ENTRY_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Sender Asynchronicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TRANSPORT_MODE__SENDER_ASYNCHRONICITY = TOP_LEVEL_CATALOGUE_ENTRY_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Business Transaction</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TRANSPORT_MODE__BUSINESS_TRANSACTION = TOP_LEVEL_CATALOGUE_ENTRY_FEATURE_COUNT + 14;

	/**
	 * The number of structural features of the '<em>Message Transport Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TRANSPORT_MODE_FEATURE_COUNT = TOP_LEVEL_CATALOGUE_ENTRY_FEATURE_COUNT + 15;

	/**
	 * The operation id for the '<em>Removal Date Registration Status</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TRANSPORT_MODE___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN = TOP_LEVEL_CATALOGUE_ENTRY___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN;

	/**
	 * The operation id for the '<em>Name First Letter Uppercase</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TRANSPORT_MODE___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN = TOP_LEVEL_CATALOGUE_ENTRY___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN;

	/**
	 * The number of operations of the '<em>Message Transport Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TRANSPORT_MODE_OPERATION_COUNT = TOP_LEVEL_CATALOGUE_ENTRY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso20022.impl.MessageDefinitionIdentifierImpl <em>Message Definition Identifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso20022.impl.MessageDefinitionIdentifierImpl
	 * @see iso20022.impl.Iso20022PackageImpl#getMessageDefinitionIdentifier()
	 * @generated
	 */
	int MESSAGE_DEFINITION_IDENTIFIER = 50;

	/**
	 * The feature id for the '<em><b>Next Versions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DEFINITION_IDENTIFIER__NEXT_VERSIONS = MODEL_ENTITY__NEXT_VERSIONS;

	/**
	 * The feature id for the '<em><b>Previous Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DEFINITION_IDENTIFIER__PREVIOUS_VERSION = MODEL_ENTITY__PREVIOUS_VERSION;

	/**
	 * The feature id for the '<em><b>Object Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DEFINITION_IDENTIFIER__OBJECT_IDENTIFIER = MODEL_ENTITY__OBJECT_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Business Area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DEFINITION_IDENTIFIER__BUSINESS_AREA = MODEL_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Message Functionality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DEFINITION_IDENTIFIER__MESSAGE_FUNCTIONALITY = MODEL_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Flavour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DEFINITION_IDENTIFIER__FLAVOUR = MODEL_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DEFINITION_IDENTIFIER__VERSION = MODEL_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Message Definition Identifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DEFINITION_IDENTIFIER_FEATURE_COUNT = MODEL_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Message Definition Identifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DEFINITION_IDENTIFIER_OPERATION_COUNT = MODEL_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso20022.impl.ConversationImpl <em>Conversation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso20022.impl.ConversationImpl
	 * @see iso20022.impl.Iso20022PackageImpl#getConversation()
	 * @generated
	 */
	int CONVERSATION = 51;

	/**
	 * The feature id for the '<em><b>Next Versions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSATION__NEXT_VERSIONS = MODEL_ENTITY__NEXT_VERSIONS;

	/**
	 * The feature id for the '<em><b>Previous Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSATION__PREVIOUS_VERSION = MODEL_ENTITY__PREVIOUS_VERSION;

	/**
	 * The feature id for the '<em><b>Object Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSATION__OBJECT_IDENTIFIER = MODEL_ENTITY__OBJECT_IDENTIFIER;

	/**
	 * The number of structural features of the '<em>Conversation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSATION_FEATURE_COUNT = MODEL_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Conversation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSATION_OPERATION_COUNT = MODEL_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso20022.impl.MessageAssociationEndImpl <em>Message Association End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso20022.impl.MessageAssociationEndImpl
	 * @see iso20022.impl.Iso20022PackageImpl#getMessageAssociationEnd()
	 * @generated
	 */
	int MESSAGE_ASSOCIATION_END = 52;

	/**
	 * The feature id for the '<em><b>Next Versions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ASSOCIATION_END__NEXT_VERSIONS = MESSAGE_ELEMENT__NEXT_VERSIONS;

	/**
	 * The feature id for the '<em><b>Previous Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ASSOCIATION_END__PREVIOUS_VERSION = MESSAGE_ELEMENT__PREVIOUS_VERSION;

	/**
	 * The feature id for the '<em><b>Object Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ASSOCIATION_END__OBJECT_IDENTIFIER = MESSAGE_ELEMENT__OBJECT_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ASSOCIATION_END__NAME = MESSAGE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ASSOCIATION_END__DEFINITION = MESSAGE_ELEMENT__DEFINITION;

	/**
	 * The feature id for the '<em><b>Semantic Markup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ASSOCIATION_END__SEMANTIC_MARKUP = MESSAGE_ELEMENT__SEMANTIC_MARKUP;

	/**
	 * The feature id for the '<em><b>Doclet</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ASSOCIATION_END__DOCLET = MESSAGE_ELEMENT__DOCLET;

	/**
	 * The feature id for the '<em><b>Example</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ASSOCIATION_END__EXAMPLE = MESSAGE_ELEMENT__EXAMPLE;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ASSOCIATION_END__CONSTRAINT = MESSAGE_ELEMENT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Registration Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ASSOCIATION_END__REGISTRATION_STATUS = MESSAGE_ELEMENT__REGISTRATION_STATUS;

	/**
	 * The feature id for the '<em><b>Removal Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ASSOCIATION_END__REMOVAL_DATE = MESSAGE_ELEMENT__REMOVAL_DATE;

	/**
	 * The feature id for the '<em><b>Max Occurs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ASSOCIATION_END__MAX_OCCURS = MESSAGE_ELEMENT__MAX_OCCURS;

	/**
	 * The feature id for the '<em><b>Min Occurs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ASSOCIATION_END__MIN_OCCURS = MESSAGE_ELEMENT__MIN_OCCURS;

	/**
	 * The feature id for the '<em><b>Member Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ASSOCIATION_END__MEMBER_TYPE = MESSAGE_ELEMENT__MEMBER_TYPE;

	/**
	 * The feature id for the '<em><b>Xml Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ASSOCIATION_END__XML_TAG = MESSAGE_ELEMENT__XML_TAG;

	/**
	 * The feature id for the '<em><b>Xml Member Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ASSOCIATION_END__XML_MEMBER_TYPE = MESSAGE_ELEMENT__XML_MEMBER_TYPE;

	/**
	 * The feature id for the '<em><b>Is Technical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ASSOCIATION_END__IS_TECHNICAL = MESSAGE_ELEMENT__IS_TECHNICAL;

	/**
	 * The feature id for the '<em><b>Business Component Trace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ASSOCIATION_END__BUSINESS_COMPONENT_TRACE = MESSAGE_ELEMENT__BUSINESS_COMPONENT_TRACE;

	/**
	 * The feature id for the '<em><b>Business Element Trace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ASSOCIATION_END__BUSINESS_ELEMENT_TRACE = MESSAGE_ELEMENT__BUSINESS_ELEMENT_TRACE;

	/**
	 * The feature id for the '<em><b>Component Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ASSOCIATION_END__COMPONENT_CONTEXT = MESSAGE_ELEMENT__COMPONENT_CONTEXT;

	/**
	 * The feature id for the '<em><b>Is Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ASSOCIATION_END__IS_DERIVED = MESSAGE_ELEMENT__IS_DERIVED;

	/**
	 * The feature id for the '<em><b>Is Composite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ASSOCIATION_END__IS_COMPOSITE = MESSAGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ASSOCIATION_END__TYPE = MESSAGE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Message Association End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ASSOCIATION_END_FEATURE_COUNT = MESSAGE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Removal Date Registration Status</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ASSOCIATION_END___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN = MESSAGE_ELEMENT___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN;

	/**
	 * The operation id for the '<em>Name First Letter Uppercase</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ASSOCIATION_END___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN = MESSAGE_ELEMENT___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN;

	/**
	 * The operation id for the '<em>No More Than One Trace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ASSOCIATION_END___NO_MORE_THAN_ONE_TRACE__MAP_DIAGNOSTICCHAIN = MESSAGE_ELEMENT___NO_MORE_THAN_ONE_TRACE__MAP_DIAGNOSTICCHAIN;

	/**
	 * The operation id for the '<em>Cardinality Alignment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ASSOCIATION_END___CARDINALITY_ALIGNMENT__MAP_DIAGNOSTICCHAIN = MESSAGE_ELEMENT___CARDINALITY_ALIGNMENT__MAP_DIAGNOSTICCHAIN;

	/**
	 * The number of operations of the '<em>Message Association End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ASSOCIATION_END_OPERATION_COUNT = MESSAGE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso20022.impl.MessageAttributeImpl <em>Message Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso20022.impl.MessageAttributeImpl
	 * @see iso20022.impl.Iso20022PackageImpl#getMessageAttribute()
	 * @generated
	 */
	int MESSAGE_ATTRIBUTE = 53;

	/**
	 * The feature id for the '<em><b>Next Versions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ATTRIBUTE__NEXT_VERSIONS = MESSAGE_ELEMENT__NEXT_VERSIONS;

	/**
	 * The feature id for the '<em><b>Previous Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ATTRIBUTE__PREVIOUS_VERSION = MESSAGE_ELEMENT__PREVIOUS_VERSION;

	/**
	 * The feature id for the '<em><b>Object Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ATTRIBUTE__OBJECT_IDENTIFIER = MESSAGE_ELEMENT__OBJECT_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ATTRIBUTE__NAME = MESSAGE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ATTRIBUTE__DEFINITION = MESSAGE_ELEMENT__DEFINITION;

	/**
	 * The feature id for the '<em><b>Semantic Markup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ATTRIBUTE__SEMANTIC_MARKUP = MESSAGE_ELEMENT__SEMANTIC_MARKUP;

	/**
	 * The feature id for the '<em><b>Doclet</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ATTRIBUTE__DOCLET = MESSAGE_ELEMENT__DOCLET;

	/**
	 * The feature id for the '<em><b>Example</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ATTRIBUTE__EXAMPLE = MESSAGE_ELEMENT__EXAMPLE;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ATTRIBUTE__CONSTRAINT = MESSAGE_ELEMENT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Registration Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ATTRIBUTE__REGISTRATION_STATUS = MESSAGE_ELEMENT__REGISTRATION_STATUS;

	/**
	 * The feature id for the '<em><b>Removal Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ATTRIBUTE__REMOVAL_DATE = MESSAGE_ELEMENT__REMOVAL_DATE;

	/**
	 * The feature id for the '<em><b>Max Occurs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ATTRIBUTE__MAX_OCCURS = MESSAGE_ELEMENT__MAX_OCCURS;

	/**
	 * The feature id for the '<em><b>Min Occurs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ATTRIBUTE__MIN_OCCURS = MESSAGE_ELEMENT__MIN_OCCURS;

	/**
	 * The feature id for the '<em><b>Member Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ATTRIBUTE__MEMBER_TYPE = MESSAGE_ELEMENT__MEMBER_TYPE;

	/**
	 * The feature id for the '<em><b>Xml Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ATTRIBUTE__XML_TAG = MESSAGE_ELEMENT__XML_TAG;

	/**
	 * The feature id for the '<em><b>Xml Member Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ATTRIBUTE__XML_MEMBER_TYPE = MESSAGE_ELEMENT__XML_MEMBER_TYPE;

	/**
	 * The feature id for the '<em><b>Is Technical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ATTRIBUTE__IS_TECHNICAL = MESSAGE_ELEMENT__IS_TECHNICAL;

	/**
	 * The feature id for the '<em><b>Business Component Trace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ATTRIBUTE__BUSINESS_COMPONENT_TRACE = MESSAGE_ELEMENT__BUSINESS_COMPONENT_TRACE;

	/**
	 * The feature id for the '<em><b>Business Element Trace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ATTRIBUTE__BUSINESS_ELEMENT_TRACE = MESSAGE_ELEMENT__BUSINESS_ELEMENT_TRACE;

	/**
	 * The feature id for the '<em><b>Component Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ATTRIBUTE__COMPONENT_CONTEXT = MESSAGE_ELEMENT__COMPONENT_CONTEXT;

	/**
	 * The feature id for the '<em><b>Is Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ATTRIBUTE__IS_DERIVED = MESSAGE_ELEMENT__IS_DERIVED;

	/**
	 * The feature id for the '<em><b>Simple Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ATTRIBUTE__SIMPLE_TYPE = MESSAGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Complex Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ATTRIBUTE__COMPLEX_TYPE = MESSAGE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Message Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ATTRIBUTE_FEATURE_COUNT = MESSAGE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Removal Date Registration Status</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ATTRIBUTE___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN = MESSAGE_ELEMENT___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN;

	/**
	 * The operation id for the '<em>Name First Letter Uppercase</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ATTRIBUTE___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN = MESSAGE_ELEMENT___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN;

	/**
	 * The operation id for the '<em>No More Than One Trace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ATTRIBUTE___NO_MORE_THAN_ONE_TRACE__MAP_DIAGNOSTICCHAIN = MESSAGE_ELEMENT___NO_MORE_THAN_ONE_TRACE__MAP_DIAGNOSTICCHAIN;

	/**
	 * The operation id for the '<em>Cardinality Alignment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ATTRIBUTE___CARDINALITY_ALIGNMENT__MAP_DIAGNOSTICCHAIN = MESSAGE_ELEMENT___CARDINALITY_ALIGNMENT__MAP_DIAGNOSTICCHAIN;

	/**
	 * The operation id for the '<em>Message Attribute Has Exactly One Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ATTRIBUTE___MESSAGE_ATTRIBUTE_HAS_EXACTLY_ONE_TYPE__MAP_DIAGNOSTICCHAIN = MESSAGE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Message Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_ATTRIBUTE_OPERATION_COUNT = MESSAGE_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link iso20022.impl.BusinessAttributeImpl <em>Business Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso20022.impl.BusinessAttributeImpl
	 * @see iso20022.impl.Iso20022PackageImpl#getBusinessAttribute()
	 * @generated
	 */
	int BUSINESS_ATTRIBUTE = 54;

	/**
	 * The feature id for the '<em><b>Next Versions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ATTRIBUTE__NEXT_VERSIONS = BUSINESS_ELEMENT__NEXT_VERSIONS;

	/**
	 * The feature id for the '<em><b>Previous Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ATTRIBUTE__PREVIOUS_VERSION = BUSINESS_ELEMENT__PREVIOUS_VERSION;

	/**
	 * The feature id for the '<em><b>Object Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ATTRIBUTE__OBJECT_IDENTIFIER = BUSINESS_ELEMENT__OBJECT_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ATTRIBUTE__NAME = BUSINESS_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ATTRIBUTE__DEFINITION = BUSINESS_ELEMENT__DEFINITION;

	/**
	 * The feature id for the '<em><b>Semantic Markup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ATTRIBUTE__SEMANTIC_MARKUP = BUSINESS_ELEMENT__SEMANTIC_MARKUP;

	/**
	 * The feature id for the '<em><b>Doclet</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ATTRIBUTE__DOCLET = BUSINESS_ELEMENT__DOCLET;

	/**
	 * The feature id for the '<em><b>Example</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ATTRIBUTE__EXAMPLE = BUSINESS_ELEMENT__EXAMPLE;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ATTRIBUTE__CONSTRAINT = BUSINESS_ELEMENT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Registration Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ATTRIBUTE__REGISTRATION_STATUS = BUSINESS_ELEMENT__REGISTRATION_STATUS;

	/**
	 * The feature id for the '<em><b>Removal Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ATTRIBUTE__REMOVAL_DATE = BUSINESS_ELEMENT__REMOVAL_DATE;

	/**
	 * The feature id for the '<em><b>Max Occurs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ATTRIBUTE__MAX_OCCURS = BUSINESS_ELEMENT__MAX_OCCURS;

	/**
	 * The feature id for the '<em><b>Min Occurs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ATTRIBUTE__MIN_OCCURS = BUSINESS_ELEMENT__MIN_OCCURS;

	/**
	 * The feature id for the '<em><b>Member Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ATTRIBUTE__MEMBER_TYPE = BUSINESS_ELEMENT__MEMBER_TYPE;

	/**
	 * The feature id for the '<em><b>Is Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ATTRIBUTE__IS_DERIVED = BUSINESS_ELEMENT__IS_DERIVED;

	/**
	 * The feature id for the '<em><b>Derivation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ATTRIBUTE__DERIVATION = BUSINESS_ELEMENT__DERIVATION;

	/**
	 * The feature id for the '<em><b>Business Element Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ATTRIBUTE__BUSINESS_ELEMENT_TYPE = BUSINESS_ELEMENT__BUSINESS_ELEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Element Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ATTRIBUTE__ELEMENT_CONTEXT = BUSINESS_ELEMENT__ELEMENT_CONTEXT;

	/**
	 * The feature id for the '<em><b>Simple Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ATTRIBUTE__SIMPLE_TYPE = BUSINESS_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Complex Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ATTRIBUTE__COMPLEX_TYPE = BUSINESS_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Business Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ATTRIBUTE_FEATURE_COUNT = BUSINESS_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Removal Date Registration Status</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ATTRIBUTE___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN = BUSINESS_ELEMENT___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN;

	/**
	 * The operation id for the '<em>Name First Letter Uppercase</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ATTRIBUTE___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN = BUSINESS_ELEMENT___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN;

	/**
	 * The operation id for the '<em>Business Attribute Has Exactly One Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ATTRIBUTE___BUSINESS_ATTRIBUTE_HAS_EXACTLY_ONE_TYPE__MAP_DIAGNOSTICCHAIN = BUSINESS_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>No Deriving Code Set Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ATTRIBUTE___NO_DERIVING_CODE_SET_TYPE__MAP_DIAGNOSTICCHAIN = BUSINESS_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Business Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ATTRIBUTE_OPERATION_COUNT = BUSINESS_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link iso20022.impl.StringImpl <em>String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso20022.impl.StringImpl
	 * @see iso20022.impl.Iso20022PackageImpl#getString()
	 * @generated
	 */
	int STRING = 56;

	/**
	 * The feature id for the '<em><b>Next Versions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING__NEXT_VERSIONS = DATA_TYPE__NEXT_VERSIONS;

	/**
	 * The feature id for the '<em><b>Previous Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING__PREVIOUS_VERSION = DATA_TYPE__PREVIOUS_VERSION;

	/**
	 * The feature id for the '<em><b>Object Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING__OBJECT_IDENTIFIER = DATA_TYPE__OBJECT_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING__NAME = DATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING__DEFINITION = DATA_TYPE__DEFINITION;

	/**
	 * The feature id for the '<em><b>Semantic Markup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING__SEMANTIC_MARKUP = DATA_TYPE__SEMANTIC_MARKUP;

	/**
	 * The feature id for the '<em><b>Doclet</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING__DOCLET = DATA_TYPE__DOCLET;

	/**
	 * The feature id for the '<em><b>Example</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING__EXAMPLE = DATA_TYPE__EXAMPLE;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING__CONSTRAINT = DATA_TYPE__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Registration Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING__REGISTRATION_STATUS = DATA_TYPE__REGISTRATION_STATUS;

	/**
	 * The feature id for the '<em><b>Removal Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING__REMOVAL_DATE = DATA_TYPE__REMOVAL_DATE;

	/**
	 * The feature id for the '<em><b>Data Dictionary</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING__DATA_DICTIONARY = DATA_TYPE__DATA_DICTIONARY;

	/**
	 * The feature id for the '<em><b>Min Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING__MIN_LENGTH = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING__MAX_LENGTH = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING__LENGTH = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING__PATTERN = DATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Removal Date Registration Status</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN = DATA_TYPE___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN;

	/**
	 * The operation id for the '<em>Name First Letter Uppercase</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN = DATA_TYPE___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN;

	/**
	 * The number of operations of the '<em>String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso20022.impl.TextImpl <em>Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso20022.impl.TextImpl
	 * @see iso20022.impl.Iso20022PackageImpl#getText()
	 * @generated
	 */
	int TEXT = 55;

	/**
	 * The feature id for the '<em><b>Next Versions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__NEXT_VERSIONS = STRING__NEXT_VERSIONS;

	/**
	 * The feature id for the '<em><b>Previous Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__PREVIOUS_VERSION = STRING__PREVIOUS_VERSION;

	/**
	 * The feature id for the '<em><b>Object Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__OBJECT_IDENTIFIER = STRING__OBJECT_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__NAME = STRING__NAME;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__DEFINITION = STRING__DEFINITION;

	/**
	 * The feature id for the '<em><b>Semantic Markup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__SEMANTIC_MARKUP = STRING__SEMANTIC_MARKUP;

	/**
	 * The feature id for the '<em><b>Doclet</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__DOCLET = STRING__DOCLET;

	/**
	 * The feature id for the '<em><b>Example</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__EXAMPLE = STRING__EXAMPLE;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__CONSTRAINT = STRING__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Registration Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__REGISTRATION_STATUS = STRING__REGISTRATION_STATUS;

	/**
	 * The feature id for the '<em><b>Removal Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__REMOVAL_DATE = STRING__REMOVAL_DATE;

	/**
	 * The feature id for the '<em><b>Data Dictionary</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__DATA_DICTIONARY = STRING__DATA_DICTIONARY;

	/**
	 * The feature id for the '<em><b>Min Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__MIN_LENGTH = STRING__MIN_LENGTH;

	/**
	 * The feature id for the '<em><b>Max Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__MAX_LENGTH = STRING__MAX_LENGTH;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__LENGTH = STRING__LENGTH;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__PATTERN = STRING__PATTERN;

	/**
	 * The number of structural features of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FEATURE_COUNT = STRING_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Removal Date Registration Status</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN = STRING___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN;

	/**
	 * The operation id for the '<em>Name First Letter Uppercase</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN = STRING___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN;

	/**
	 * The number of operations of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_OPERATION_COUNT = STRING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso20022.impl.IdentifierSetImpl <em>Identifier Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso20022.impl.IdentifierSetImpl
	 * @see iso20022.impl.Iso20022PackageImpl#getIdentifierSet()
	 * @generated
	 */
	int IDENTIFIER_SET = 57;

	/**
	 * The feature id for the '<em><b>Next Versions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_SET__NEXT_VERSIONS = STRING__NEXT_VERSIONS;

	/**
	 * The feature id for the '<em><b>Previous Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_SET__PREVIOUS_VERSION = STRING__PREVIOUS_VERSION;

	/**
	 * The feature id for the '<em><b>Object Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_SET__OBJECT_IDENTIFIER = STRING__OBJECT_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_SET__NAME = STRING__NAME;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_SET__DEFINITION = STRING__DEFINITION;

	/**
	 * The feature id for the '<em><b>Semantic Markup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_SET__SEMANTIC_MARKUP = STRING__SEMANTIC_MARKUP;

	/**
	 * The feature id for the '<em><b>Doclet</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_SET__DOCLET = STRING__DOCLET;

	/**
	 * The feature id for the '<em><b>Example</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_SET__EXAMPLE = STRING__EXAMPLE;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_SET__CONSTRAINT = STRING__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Registration Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_SET__REGISTRATION_STATUS = STRING__REGISTRATION_STATUS;

	/**
	 * The feature id for the '<em><b>Removal Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_SET__REMOVAL_DATE = STRING__REMOVAL_DATE;

	/**
	 * The feature id for the '<em><b>Data Dictionary</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_SET__DATA_DICTIONARY = STRING__DATA_DICTIONARY;

	/**
	 * The feature id for the '<em><b>Min Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_SET__MIN_LENGTH = STRING__MIN_LENGTH;

	/**
	 * The feature id for the '<em><b>Max Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_SET__MAX_LENGTH = STRING__MAX_LENGTH;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_SET__LENGTH = STRING__LENGTH;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_SET__PATTERN = STRING__PATTERN;

	/**
	 * The feature id for the '<em><b>Identification Scheme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_SET__IDENTIFICATION_SCHEME = STRING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Identifier Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_SET_FEATURE_COUNT = STRING_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Removal Date Registration Status</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_SET___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN = STRING___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN;

	/**
	 * The operation id for the '<em>Name First Letter Uppercase</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_SET___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN = STRING___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN;

	/**
	 * The number of operations of the '<em>Identifier Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_SET_OPERATION_COUNT = STRING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso20022.impl.BooleanImpl <em>Boolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso20022.impl.BooleanImpl
	 * @see iso20022.impl.Iso20022PackageImpl#getBoolean()
	 * @generated
	 */
	int BOOLEAN = 59;

	/**
	 * The feature id for the '<em><b>Next Versions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN__NEXT_VERSIONS = DATA_TYPE__NEXT_VERSIONS;

	/**
	 * The feature id for the '<em><b>Previous Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN__PREVIOUS_VERSION = DATA_TYPE__PREVIOUS_VERSION;

	/**
	 * The feature id for the '<em><b>Object Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN__OBJECT_IDENTIFIER = DATA_TYPE__OBJECT_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN__NAME = DATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN__DEFINITION = DATA_TYPE__DEFINITION;

	/**
	 * The feature id for the '<em><b>Semantic Markup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN__SEMANTIC_MARKUP = DATA_TYPE__SEMANTIC_MARKUP;

	/**
	 * The feature id for the '<em><b>Doclet</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN__DOCLET = DATA_TYPE__DOCLET;

	/**
	 * The feature id for the '<em><b>Example</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN__EXAMPLE = DATA_TYPE__EXAMPLE;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN__CONSTRAINT = DATA_TYPE__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Registration Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN__REGISTRATION_STATUS = DATA_TYPE__REGISTRATION_STATUS;

	/**
	 * The feature id for the '<em><b>Removal Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN__REMOVAL_DATE = DATA_TYPE__REMOVAL_DATE;

	/**
	 * The feature id for the '<em><b>Data Dictionary</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN__DATA_DICTIONARY = DATA_TYPE__DATA_DICTIONARY;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN__PATTERN = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Removal Date Registration Status</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN = DATA_TYPE___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN;

	/**
	 * The operation id for the '<em>Name First Letter Uppercase</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN = DATA_TYPE___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN;

	/**
	 * The number of operations of the '<em>Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso20022.impl.IndicatorImpl <em>Indicator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso20022.impl.IndicatorImpl
	 * @see iso20022.impl.Iso20022PackageImpl#getIndicator()
	 * @generated
	 */
	int INDICATOR = 58;

	/**
	 * The feature id for the '<em><b>Next Versions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDICATOR__NEXT_VERSIONS = BOOLEAN__NEXT_VERSIONS;

	/**
	 * The feature id for the '<em><b>Previous Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDICATOR__PREVIOUS_VERSION = BOOLEAN__PREVIOUS_VERSION;

	/**
	 * The feature id for the '<em><b>Object Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDICATOR__OBJECT_IDENTIFIER = BOOLEAN__OBJECT_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDICATOR__NAME = BOOLEAN__NAME;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDICATOR__DEFINITION = BOOLEAN__DEFINITION;

	/**
	 * The feature id for the '<em><b>Semantic Markup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDICATOR__SEMANTIC_MARKUP = BOOLEAN__SEMANTIC_MARKUP;

	/**
	 * The feature id for the '<em><b>Doclet</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDICATOR__DOCLET = BOOLEAN__DOCLET;

	/**
	 * The feature id for the '<em><b>Example</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDICATOR__EXAMPLE = BOOLEAN__EXAMPLE;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDICATOR__CONSTRAINT = BOOLEAN__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Registration Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDICATOR__REGISTRATION_STATUS = BOOLEAN__REGISTRATION_STATUS;

	/**
	 * The feature id for the '<em><b>Removal Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDICATOR__REMOVAL_DATE = BOOLEAN__REMOVAL_DATE;

	/**
	 * The feature id for the '<em><b>Data Dictionary</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDICATOR__DATA_DICTIONARY = BOOLEAN__DATA_DICTIONARY;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDICATOR__PATTERN = BOOLEAN__PATTERN;

	/**
	 * The feature id for the '<em><b>Meaning When True</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDICATOR__MEANING_WHEN_TRUE = BOOLEAN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Meaning When False</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDICATOR__MEANING_WHEN_FALSE = BOOLEAN_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Indicator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDICATOR_FEATURE_COUNT = BOOLEAN_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Removal Date Registration Status</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDICATOR___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN = BOOLEAN___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN;

	/**
	 * The operation id for the '<em>Name First Letter Uppercase</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDICATOR___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN = BOOLEAN___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN;

	/**
	 * The number of operations of the '<em>Indicator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDICATOR_OPERATION_COUNT = BOOLEAN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso20022.impl.DecimalImpl <em>Decimal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso20022.impl.DecimalImpl
	 * @see iso20022.impl.Iso20022PackageImpl#getDecimal()
	 * @generated
	 */
	int DECIMAL = 61;

	/**
	 * The feature id for the '<em><b>Next Versions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL__NEXT_VERSIONS = DATA_TYPE__NEXT_VERSIONS;

	/**
	 * The feature id for the '<em><b>Previous Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL__PREVIOUS_VERSION = DATA_TYPE__PREVIOUS_VERSION;

	/**
	 * The feature id for the '<em><b>Object Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL__OBJECT_IDENTIFIER = DATA_TYPE__OBJECT_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL__NAME = DATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL__DEFINITION = DATA_TYPE__DEFINITION;

	/**
	 * The feature id for the '<em><b>Semantic Markup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL__SEMANTIC_MARKUP = DATA_TYPE__SEMANTIC_MARKUP;

	/**
	 * The feature id for the '<em><b>Doclet</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL__DOCLET = DATA_TYPE__DOCLET;

	/**
	 * The feature id for the '<em><b>Example</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL__EXAMPLE = DATA_TYPE__EXAMPLE;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL__CONSTRAINT = DATA_TYPE__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Registration Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL__REGISTRATION_STATUS = DATA_TYPE__REGISTRATION_STATUS;

	/**
	 * The feature id for the '<em><b>Removal Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL__REMOVAL_DATE = DATA_TYPE__REMOVAL_DATE;

	/**
	 * The feature id for the '<em><b>Data Dictionary</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL__DATA_DICTIONARY = DATA_TYPE__DATA_DICTIONARY;

	/**
	 * The feature id for the '<em><b>Min Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL__MIN_INCLUSIVE = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Min Exclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL__MIN_EXCLUSIVE = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Max Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL__MAX_INCLUSIVE = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Max Exclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL__MAX_EXCLUSIVE = DATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Total Digits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL__TOTAL_DIGITS = DATA_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Fraction Digits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL__FRACTION_DIGITS = DATA_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL__PATTERN = DATA_TYPE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Decimal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Removal Date Registration Status</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN = DATA_TYPE___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN;

	/**
	 * The operation id for the '<em>Name First Letter Uppercase</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN = DATA_TYPE___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN;

	/**
	 * The number of operations of the '<em>Decimal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso20022.impl.RateImpl <em>Rate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso20022.impl.RateImpl
	 * @see iso20022.impl.Iso20022PackageImpl#getRate()
	 * @generated
	 */
	int RATE = 60;

	/**
	 * The feature id for the '<em><b>Next Versions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATE__NEXT_VERSIONS = DECIMAL__NEXT_VERSIONS;

	/**
	 * The feature id for the '<em><b>Previous Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATE__PREVIOUS_VERSION = DECIMAL__PREVIOUS_VERSION;

	/**
	 * The feature id for the '<em><b>Object Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATE__OBJECT_IDENTIFIER = DECIMAL__OBJECT_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATE__NAME = DECIMAL__NAME;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATE__DEFINITION = DECIMAL__DEFINITION;

	/**
	 * The feature id for the '<em><b>Semantic Markup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATE__SEMANTIC_MARKUP = DECIMAL__SEMANTIC_MARKUP;

	/**
	 * The feature id for the '<em><b>Doclet</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATE__DOCLET = DECIMAL__DOCLET;

	/**
	 * The feature id for the '<em><b>Example</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATE__EXAMPLE = DECIMAL__EXAMPLE;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATE__CONSTRAINT = DECIMAL__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Registration Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATE__REGISTRATION_STATUS = DECIMAL__REGISTRATION_STATUS;

	/**
	 * The feature id for the '<em><b>Removal Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATE__REMOVAL_DATE = DECIMAL__REMOVAL_DATE;

	/**
	 * The feature id for the '<em><b>Data Dictionary</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATE__DATA_DICTIONARY = DECIMAL__DATA_DICTIONARY;

	/**
	 * The feature id for the '<em><b>Min Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATE__MIN_INCLUSIVE = DECIMAL__MIN_INCLUSIVE;

	/**
	 * The feature id for the '<em><b>Min Exclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATE__MIN_EXCLUSIVE = DECIMAL__MIN_EXCLUSIVE;

	/**
	 * The feature id for the '<em><b>Max Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATE__MAX_INCLUSIVE = DECIMAL__MAX_INCLUSIVE;

	/**
	 * The feature id for the '<em><b>Max Exclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATE__MAX_EXCLUSIVE = DECIMAL__MAX_EXCLUSIVE;

	/**
	 * The feature id for the '<em><b>Total Digits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATE__TOTAL_DIGITS = DECIMAL__TOTAL_DIGITS;

	/**
	 * The feature id for the '<em><b>Fraction Digits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATE__FRACTION_DIGITS = DECIMAL__FRACTION_DIGITS;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATE__PATTERN = DECIMAL__PATTERN;

	/**
	 * The feature id for the '<em><b>Base Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATE__BASE_VALUE = DECIMAL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Base Unit Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATE__BASE_UNIT_CODE = DECIMAL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Rate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATE_FEATURE_COUNT = DECIMAL_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Removal Date Registration Status</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATE___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN = DECIMAL___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN;

	/**
	 * The operation id for the '<em>Name First Letter Uppercase</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATE___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN = DECIMAL___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN;

	/**
	 * The number of operations of the '<em>Rate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATE_OPERATION_COUNT = DECIMAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso20022.impl.ExternalSchemaImpl <em>External Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso20022.impl.ExternalSchemaImpl
	 * @see iso20022.impl.Iso20022PackageImpl#getExternalSchema()
	 * @generated
	 */
	int EXTERNAL_SCHEMA = 62;

	/**
	 * The feature id for the '<em><b>Next Versions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_SCHEMA__NEXT_VERSIONS = MESSAGE_COMPONENT_TYPE__NEXT_VERSIONS;

	/**
	 * The feature id for the '<em><b>Previous Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_SCHEMA__PREVIOUS_VERSION = MESSAGE_COMPONENT_TYPE__PREVIOUS_VERSION;

	/**
	 * The feature id for the '<em><b>Object Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_SCHEMA__OBJECT_IDENTIFIER = MESSAGE_COMPONENT_TYPE__OBJECT_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_SCHEMA__NAME = MESSAGE_COMPONENT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_SCHEMA__DEFINITION = MESSAGE_COMPONENT_TYPE__DEFINITION;

	/**
	 * The feature id for the '<em><b>Semantic Markup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_SCHEMA__SEMANTIC_MARKUP = MESSAGE_COMPONENT_TYPE__SEMANTIC_MARKUP;

	/**
	 * The feature id for the '<em><b>Doclet</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_SCHEMA__DOCLET = MESSAGE_COMPONENT_TYPE__DOCLET;

	/**
	 * The feature id for the '<em><b>Example</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_SCHEMA__EXAMPLE = MESSAGE_COMPONENT_TYPE__EXAMPLE;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_SCHEMA__CONSTRAINT = MESSAGE_COMPONENT_TYPE__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Registration Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_SCHEMA__REGISTRATION_STATUS = MESSAGE_COMPONENT_TYPE__REGISTRATION_STATUS;

	/**
	 * The feature id for the '<em><b>Removal Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_SCHEMA__REMOVAL_DATE = MESSAGE_COMPONENT_TYPE__REMOVAL_DATE;

	/**
	 * The feature id for the '<em><b>Data Dictionary</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_SCHEMA__DATA_DICTIONARY = MESSAGE_COMPONENT_TYPE__DATA_DICTIONARY;

	/**
	 * The feature id for the '<em><b>Message Building Block</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_SCHEMA__MESSAGE_BUILDING_BLOCK = MESSAGE_COMPONENT_TYPE__MESSAGE_BUILDING_BLOCK;

	/**
	 * The feature id for the '<em><b>Is Technical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_SCHEMA__IS_TECHNICAL = MESSAGE_COMPONENT_TYPE__IS_TECHNICAL;

	/**
	 * The feature id for the '<em><b>Trace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_SCHEMA__TRACE = MESSAGE_COMPONENT_TYPE__TRACE;

	/**
	 * The feature id for the '<em><b>Namespace List</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_SCHEMA__NAMESPACE_LIST = MESSAGE_COMPONENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Process Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_SCHEMA__PROCESS_CONTENT = MESSAGE_COMPONENT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>External Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_SCHEMA_FEATURE_COUNT = MESSAGE_COMPONENT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Removal Date Registration Status</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_SCHEMA___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN = MESSAGE_COMPONENT_TYPE___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN;

	/**
	 * The operation id for the '<em>Name First Letter Uppercase</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_SCHEMA___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN = MESSAGE_COMPONENT_TYPE___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN;

	/**
	 * The number of operations of the '<em>External Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_SCHEMA_OPERATION_COUNT = MESSAGE_COMPONENT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso20022.impl.QuantityImpl <em>Quantity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso20022.impl.QuantityImpl
	 * @see iso20022.impl.Iso20022PackageImpl#getQuantity()
	 * @generated
	 */
	int QUANTITY = 63;

	/**
	 * The feature id for the '<em><b>Next Versions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY__NEXT_VERSIONS = DECIMAL__NEXT_VERSIONS;

	/**
	 * The feature id for the '<em><b>Previous Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY__PREVIOUS_VERSION = DECIMAL__PREVIOUS_VERSION;

	/**
	 * The feature id for the '<em><b>Object Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY__OBJECT_IDENTIFIER = DECIMAL__OBJECT_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY__NAME = DECIMAL__NAME;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY__DEFINITION = DECIMAL__DEFINITION;

	/**
	 * The feature id for the '<em><b>Semantic Markup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY__SEMANTIC_MARKUP = DECIMAL__SEMANTIC_MARKUP;

	/**
	 * The feature id for the '<em><b>Doclet</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY__DOCLET = DECIMAL__DOCLET;

	/**
	 * The feature id for the '<em><b>Example</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY__EXAMPLE = DECIMAL__EXAMPLE;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY__CONSTRAINT = DECIMAL__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Registration Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY__REGISTRATION_STATUS = DECIMAL__REGISTRATION_STATUS;

	/**
	 * The feature id for the '<em><b>Removal Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY__REMOVAL_DATE = DECIMAL__REMOVAL_DATE;

	/**
	 * The feature id for the '<em><b>Data Dictionary</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY__DATA_DICTIONARY = DECIMAL__DATA_DICTIONARY;

	/**
	 * The feature id for the '<em><b>Min Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY__MIN_INCLUSIVE = DECIMAL__MIN_INCLUSIVE;

	/**
	 * The feature id for the '<em><b>Min Exclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY__MIN_EXCLUSIVE = DECIMAL__MIN_EXCLUSIVE;

	/**
	 * The feature id for the '<em><b>Max Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY__MAX_INCLUSIVE = DECIMAL__MAX_INCLUSIVE;

	/**
	 * The feature id for the '<em><b>Max Exclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY__MAX_EXCLUSIVE = DECIMAL__MAX_EXCLUSIVE;

	/**
	 * The feature id for the '<em><b>Total Digits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY__TOTAL_DIGITS = DECIMAL__TOTAL_DIGITS;

	/**
	 * The feature id for the '<em><b>Fraction Digits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY__FRACTION_DIGITS = DECIMAL__FRACTION_DIGITS;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY__PATTERN = DECIMAL__PATTERN;

	/**
	 * The feature id for the '<em><b>Unit Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY__UNIT_CODE = DECIMAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Quantity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_FEATURE_COUNT = DECIMAL_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Removal Date Registration Status</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN = DECIMAL___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN;

	/**
	 * The operation id for the '<em>Name First Letter Uppercase</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN = DECIMAL___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN;

	/**
	 * The number of operations of the '<em>Quantity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_OPERATION_COUNT = DECIMAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso20022.impl.CodeImpl <em>Code</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso20022.impl.CodeImpl
	 * @see iso20022.impl.Iso20022PackageImpl#getCode()
	 * @generated
	 */
	int CODE = 64;

	/**
	 * The feature id for the '<em><b>Next Versions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__NEXT_VERSIONS = REPOSITORY_CONCEPT__NEXT_VERSIONS;

	/**
	 * The feature id for the '<em><b>Previous Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__PREVIOUS_VERSION = REPOSITORY_CONCEPT__PREVIOUS_VERSION;

	/**
	 * The feature id for the '<em><b>Object Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__OBJECT_IDENTIFIER = REPOSITORY_CONCEPT__OBJECT_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__NAME = REPOSITORY_CONCEPT__NAME;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__DEFINITION = REPOSITORY_CONCEPT__DEFINITION;

	/**
	 * The feature id for the '<em><b>Semantic Markup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__SEMANTIC_MARKUP = REPOSITORY_CONCEPT__SEMANTIC_MARKUP;

	/**
	 * The feature id for the '<em><b>Doclet</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__DOCLET = REPOSITORY_CONCEPT__DOCLET;

	/**
	 * The feature id for the '<em><b>Example</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__EXAMPLE = REPOSITORY_CONCEPT__EXAMPLE;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__CONSTRAINT = REPOSITORY_CONCEPT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Registration Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__REGISTRATION_STATUS = REPOSITORY_CONCEPT__REGISTRATION_STATUS;

	/**
	 * The feature id for the '<em><b>Removal Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__REMOVAL_DATE = REPOSITORY_CONCEPT__REMOVAL_DATE;

	/**
	 * The feature id for the '<em><b>Code Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__CODE_NAME = REPOSITORY_CONCEPT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__OWNER = REPOSITORY_CONCEPT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_FEATURE_COUNT = REPOSITORY_CONCEPT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Removal Date Registration Status</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN = REPOSITORY_CONCEPT___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN;

	/**
	 * The operation id for the '<em>Name First Letter Uppercase</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN = REPOSITORY_CONCEPT___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN;

	/**
	 * The number of operations of the '<em>Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_OPERATION_COUNT = REPOSITORY_CONCEPT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso20022.impl.CodeSetImpl <em>Code Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso20022.impl.CodeSetImpl
	 * @see iso20022.impl.Iso20022PackageImpl#getCodeSet()
	 * @generated
	 */
	int CODE_SET = 65;

	/**
	 * The feature id for the '<em><b>Next Versions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_SET__NEXT_VERSIONS = STRING__NEXT_VERSIONS;

	/**
	 * The feature id for the '<em><b>Previous Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_SET__PREVIOUS_VERSION = STRING__PREVIOUS_VERSION;

	/**
	 * The feature id for the '<em><b>Object Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_SET__OBJECT_IDENTIFIER = STRING__OBJECT_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_SET__NAME = STRING__NAME;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_SET__DEFINITION = STRING__DEFINITION;

	/**
	 * The feature id for the '<em><b>Semantic Markup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_SET__SEMANTIC_MARKUP = STRING__SEMANTIC_MARKUP;

	/**
	 * The feature id for the '<em><b>Doclet</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_SET__DOCLET = STRING__DOCLET;

	/**
	 * The feature id for the '<em><b>Example</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_SET__EXAMPLE = STRING__EXAMPLE;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_SET__CONSTRAINT = STRING__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Registration Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_SET__REGISTRATION_STATUS = STRING__REGISTRATION_STATUS;

	/**
	 * The feature id for the '<em><b>Removal Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_SET__REMOVAL_DATE = STRING__REMOVAL_DATE;

	/**
	 * The feature id for the '<em><b>Data Dictionary</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_SET__DATA_DICTIONARY = STRING__DATA_DICTIONARY;

	/**
	 * The feature id for the '<em><b>Min Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_SET__MIN_LENGTH = STRING__MIN_LENGTH;

	/**
	 * The feature id for the '<em><b>Max Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_SET__MAX_LENGTH = STRING__MAX_LENGTH;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_SET__LENGTH = STRING__LENGTH;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_SET__PATTERN = STRING__PATTERN;

	/**
	 * The feature id for the '<em><b>Trace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_SET__TRACE = STRING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Derivation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_SET__DERIVATION = STRING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Identification Scheme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_SET__IDENTIFICATION_SCHEME = STRING_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_SET__CODE = STRING_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Code Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_SET_FEATURE_COUNT = STRING_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Removal Date Registration Status</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_SET___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN = STRING___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN;

	/**
	 * The operation id for the '<em>Name First Letter Uppercase</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_SET___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN = STRING___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN;

	/**
	 * The number of operations of the '<em>Code Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_SET_OPERATION_COUNT = STRING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso20022.impl.AmountImpl <em>Amount</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso20022.impl.AmountImpl
	 * @see iso20022.impl.Iso20022PackageImpl#getAmount()
	 * @generated
	 */
	int AMOUNT = 66;

	/**
	 * The feature id for the '<em><b>Next Versions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT__NEXT_VERSIONS = DECIMAL__NEXT_VERSIONS;

	/**
	 * The feature id for the '<em><b>Previous Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT__PREVIOUS_VERSION = DECIMAL__PREVIOUS_VERSION;

	/**
	 * The feature id for the '<em><b>Object Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT__OBJECT_IDENTIFIER = DECIMAL__OBJECT_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT__NAME = DECIMAL__NAME;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT__DEFINITION = DECIMAL__DEFINITION;

	/**
	 * The feature id for the '<em><b>Semantic Markup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT__SEMANTIC_MARKUP = DECIMAL__SEMANTIC_MARKUP;

	/**
	 * The feature id for the '<em><b>Doclet</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT__DOCLET = DECIMAL__DOCLET;

	/**
	 * The feature id for the '<em><b>Example</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT__EXAMPLE = DECIMAL__EXAMPLE;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT__CONSTRAINT = DECIMAL__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Registration Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT__REGISTRATION_STATUS = DECIMAL__REGISTRATION_STATUS;

	/**
	 * The feature id for the '<em><b>Removal Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT__REMOVAL_DATE = DECIMAL__REMOVAL_DATE;

	/**
	 * The feature id for the '<em><b>Data Dictionary</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT__DATA_DICTIONARY = DECIMAL__DATA_DICTIONARY;

	/**
	 * The feature id for the '<em><b>Min Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT__MIN_INCLUSIVE = DECIMAL__MIN_INCLUSIVE;

	/**
	 * The feature id for the '<em><b>Min Exclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT__MIN_EXCLUSIVE = DECIMAL__MIN_EXCLUSIVE;

	/**
	 * The feature id for the '<em><b>Max Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT__MAX_INCLUSIVE = DECIMAL__MAX_INCLUSIVE;

	/**
	 * The feature id for the '<em><b>Max Exclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT__MAX_EXCLUSIVE = DECIMAL__MAX_EXCLUSIVE;

	/**
	 * The feature id for the '<em><b>Total Digits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT__TOTAL_DIGITS = DECIMAL__TOTAL_DIGITS;

	/**
	 * The feature id for the '<em><b>Fraction Digits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT__FRACTION_DIGITS = DECIMAL__FRACTION_DIGITS;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT__PATTERN = DECIMAL__PATTERN;

	/**
	 * The feature id for the '<em><b>Currency Identifier Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT__CURRENCY_IDENTIFIER_SET = DECIMAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Amount</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_FEATURE_COUNT = DECIMAL_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Removal Date Registration Status</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN = DECIMAL___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN;

	/**
	 * The operation id for the '<em>Name First Letter Uppercase</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN = DECIMAL___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN;

	/**
	 * The number of operations of the '<em>Amount</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_OPERATION_COUNT = DECIMAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso20022.impl.ChoiceComponentImpl <em>Choice Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso20022.impl.ChoiceComponentImpl
	 * @see iso20022.impl.Iso20022PackageImpl#getChoiceComponent()
	 * @generated
	 */
	int CHOICE_COMPONENT = 67;

	/**
	 * The feature id for the '<em><b>Next Versions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_COMPONENT__NEXT_VERSIONS = MESSAGE_ELEMENT_CONTAINER__NEXT_VERSIONS;

	/**
	 * The feature id for the '<em><b>Previous Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_COMPONENT__PREVIOUS_VERSION = MESSAGE_ELEMENT_CONTAINER__PREVIOUS_VERSION;

	/**
	 * The feature id for the '<em><b>Object Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_COMPONENT__OBJECT_IDENTIFIER = MESSAGE_ELEMENT_CONTAINER__OBJECT_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_COMPONENT__NAME = MESSAGE_ELEMENT_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_COMPONENT__DEFINITION = MESSAGE_ELEMENT_CONTAINER__DEFINITION;

	/**
	 * The feature id for the '<em><b>Semantic Markup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_COMPONENT__SEMANTIC_MARKUP = MESSAGE_ELEMENT_CONTAINER__SEMANTIC_MARKUP;

	/**
	 * The feature id for the '<em><b>Doclet</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_COMPONENT__DOCLET = MESSAGE_ELEMENT_CONTAINER__DOCLET;

	/**
	 * The feature id for the '<em><b>Example</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_COMPONENT__EXAMPLE = MESSAGE_ELEMENT_CONTAINER__EXAMPLE;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_COMPONENT__CONSTRAINT = MESSAGE_ELEMENT_CONTAINER__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Registration Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_COMPONENT__REGISTRATION_STATUS = MESSAGE_ELEMENT_CONTAINER__REGISTRATION_STATUS;

	/**
	 * The feature id for the '<em><b>Removal Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_COMPONENT__REMOVAL_DATE = MESSAGE_ELEMENT_CONTAINER__REMOVAL_DATE;

	/**
	 * The feature id for the '<em><b>Data Dictionary</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_COMPONENT__DATA_DICTIONARY = MESSAGE_ELEMENT_CONTAINER__DATA_DICTIONARY;

	/**
	 * The feature id for the '<em><b>Message Building Block</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_COMPONENT__MESSAGE_BUILDING_BLOCK = MESSAGE_ELEMENT_CONTAINER__MESSAGE_BUILDING_BLOCK;

	/**
	 * The feature id for the '<em><b>Is Technical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_COMPONENT__IS_TECHNICAL = MESSAGE_ELEMENT_CONTAINER__IS_TECHNICAL;

	/**
	 * The feature id for the '<em><b>Trace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_COMPONENT__TRACE = MESSAGE_ELEMENT_CONTAINER__TRACE;

	/**
	 * The feature id for the '<em><b>Message Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_COMPONENT__MESSAGE_ELEMENT = MESSAGE_ELEMENT_CONTAINER__MESSAGE_ELEMENT;

	/**
	 * The number of structural features of the '<em>Choice Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_COMPONENT_FEATURE_COUNT = MESSAGE_ELEMENT_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Removal Date Registration Status</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_COMPONENT___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN = MESSAGE_ELEMENT_CONTAINER___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN;

	/**
	 * The operation id for the '<em>Name First Letter Uppercase</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_COMPONENT___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN = MESSAGE_ELEMENT_CONTAINER___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN;

	/**
	 * The operation id for the '<em>Message Elements Have Unique Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_COMPONENT___MESSAGE_ELEMENTS_HAVE_UNIQUE_NAMES__MAP_DIAGNOSTICCHAIN = MESSAGE_ELEMENT_CONTAINER___MESSAGE_ELEMENTS_HAVE_UNIQUE_NAMES__MAP_DIAGNOSTICCHAIN;

	/**
	 * The operation id for the '<em>Technical Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_COMPONENT___TECHNICAL_ELEMENT__MAP_DIAGNOSTICCHAIN = MESSAGE_ELEMENT_CONTAINER___TECHNICAL_ELEMENT__MAP_DIAGNOSTICCHAIN;

	/**
	 * The operation id for the '<em>At Least One Property</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_COMPONENT___AT_LEAST_ONE_PROPERTY__MAP_DIAGNOSTICCHAIN = MESSAGE_ELEMENT_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Choice Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_COMPONENT_OPERATION_COUNT = MESSAGE_ELEMENT_CONTAINER_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link iso20022.impl.AbstractDateTimeConceptImpl <em>Abstract Date Time Concept</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso20022.impl.AbstractDateTimeConceptImpl
	 * @see iso20022.impl.Iso20022PackageImpl#getAbstractDateTimeConcept()
	 * @generated
	 */
	int ABSTRACT_DATE_TIME_CONCEPT = 68;

	/**
	 * The feature id for the '<em><b>Next Versions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DATE_TIME_CONCEPT__NEXT_VERSIONS = DATA_TYPE__NEXT_VERSIONS;

	/**
	 * The feature id for the '<em><b>Previous Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DATE_TIME_CONCEPT__PREVIOUS_VERSION = DATA_TYPE__PREVIOUS_VERSION;

	/**
	 * The feature id for the '<em><b>Object Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DATE_TIME_CONCEPT__OBJECT_IDENTIFIER = DATA_TYPE__OBJECT_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DATE_TIME_CONCEPT__NAME = DATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DATE_TIME_CONCEPT__DEFINITION = DATA_TYPE__DEFINITION;

	/**
	 * The feature id for the '<em><b>Semantic Markup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DATE_TIME_CONCEPT__SEMANTIC_MARKUP = DATA_TYPE__SEMANTIC_MARKUP;

	/**
	 * The feature id for the '<em><b>Doclet</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DATE_TIME_CONCEPT__DOCLET = DATA_TYPE__DOCLET;

	/**
	 * The feature id for the '<em><b>Example</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DATE_TIME_CONCEPT__EXAMPLE = DATA_TYPE__EXAMPLE;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DATE_TIME_CONCEPT__CONSTRAINT = DATA_TYPE__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Registration Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DATE_TIME_CONCEPT__REGISTRATION_STATUS = DATA_TYPE__REGISTRATION_STATUS;

	/**
	 * The feature id for the '<em><b>Removal Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DATE_TIME_CONCEPT__REMOVAL_DATE = DATA_TYPE__REMOVAL_DATE;

	/**
	 * The feature id for the '<em><b>Data Dictionary</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DATE_TIME_CONCEPT__DATA_DICTIONARY = DATA_TYPE__DATA_DICTIONARY;

	/**
	 * The feature id for the '<em><b>Min Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DATE_TIME_CONCEPT__MIN_INCLUSIVE = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Min Exclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DATE_TIME_CONCEPT__MIN_EXCLUSIVE = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Max Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DATE_TIME_CONCEPT__MAX_INCLUSIVE = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Max Exclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DATE_TIME_CONCEPT__MAX_EXCLUSIVE = DATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DATE_TIME_CONCEPT__PATTERN = DATA_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Abstract Date Time Concept</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DATE_TIME_CONCEPT_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Removal Date Registration Status</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DATE_TIME_CONCEPT___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN = DATA_TYPE___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN;

	/**
	 * The operation id for the '<em>Name First Letter Uppercase</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DATE_TIME_CONCEPT___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN = DATA_TYPE___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN;

	/**
	 * The number of operations of the '<em>Abstract Date Time Concept</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DATE_TIME_CONCEPT_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso20022.impl.EndPointCategoryImpl <em>End Point Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso20022.impl.EndPointCategoryImpl
	 * @see iso20022.impl.Iso20022PackageImpl#getEndPointCategory()
	 * @generated
	 */
	int END_POINT_CATEGORY = 69;

	/**
	 * The feature id for the '<em><b>Next Versions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT_CATEGORY__NEXT_VERSIONS = TOP_LEVEL_DICTIONARY_ENTRY__NEXT_VERSIONS;

	/**
	 * The feature id for the '<em><b>Previous Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT_CATEGORY__PREVIOUS_VERSION = TOP_LEVEL_DICTIONARY_ENTRY__PREVIOUS_VERSION;

	/**
	 * The feature id for the '<em><b>Object Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT_CATEGORY__OBJECT_IDENTIFIER = TOP_LEVEL_DICTIONARY_ENTRY__OBJECT_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT_CATEGORY__NAME = TOP_LEVEL_DICTIONARY_ENTRY__NAME;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT_CATEGORY__DEFINITION = TOP_LEVEL_DICTIONARY_ENTRY__DEFINITION;

	/**
	 * The feature id for the '<em><b>Semantic Markup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT_CATEGORY__SEMANTIC_MARKUP = TOP_LEVEL_DICTIONARY_ENTRY__SEMANTIC_MARKUP;

	/**
	 * The feature id for the '<em><b>Doclet</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT_CATEGORY__DOCLET = TOP_LEVEL_DICTIONARY_ENTRY__DOCLET;

	/**
	 * The feature id for the '<em><b>Example</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT_CATEGORY__EXAMPLE = TOP_LEVEL_DICTIONARY_ENTRY__EXAMPLE;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT_CATEGORY__CONSTRAINT = TOP_LEVEL_DICTIONARY_ENTRY__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Registration Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT_CATEGORY__REGISTRATION_STATUS = TOP_LEVEL_DICTIONARY_ENTRY__REGISTRATION_STATUS;

	/**
	 * The feature id for the '<em><b>Removal Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT_CATEGORY__REMOVAL_DATE = TOP_LEVEL_DICTIONARY_ENTRY__REMOVAL_DATE;

	/**
	 * The feature id for the '<em><b>Data Dictionary</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT_CATEGORY__DATA_DICTIONARY = TOP_LEVEL_DICTIONARY_ENTRY__DATA_DICTIONARY;

	/**
	 * The feature id for the '<em><b>End Points</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT_CATEGORY__END_POINTS = TOP_LEVEL_DICTIONARY_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>End Point Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT_CATEGORY_FEATURE_COUNT = TOP_LEVEL_DICTIONARY_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Removal Date Registration Status</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT_CATEGORY___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN = TOP_LEVEL_DICTIONARY_ENTRY___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN;

	/**
	 * The operation id for the '<em>Name First Letter Uppercase</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT_CATEGORY___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN = TOP_LEVEL_DICTIONARY_ENTRY___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN;

	/**
	 * The number of operations of the '<em>End Point Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT_CATEGORY_OPERATION_COUNT = TOP_LEVEL_DICTIONARY_ENTRY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso20022.impl.BinaryImpl <em>Binary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso20022.impl.BinaryImpl
	 * @see iso20022.impl.Iso20022PackageImpl#getBinary()
	 * @generated
	 */
	int BINARY = 70;

	/**
	 * The feature id for the '<em><b>Next Versions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY__NEXT_VERSIONS = DATA_TYPE__NEXT_VERSIONS;

	/**
	 * The feature id for the '<em><b>Previous Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY__PREVIOUS_VERSION = DATA_TYPE__PREVIOUS_VERSION;

	/**
	 * The feature id for the '<em><b>Object Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY__OBJECT_IDENTIFIER = DATA_TYPE__OBJECT_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY__NAME = DATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY__DEFINITION = DATA_TYPE__DEFINITION;

	/**
	 * The feature id for the '<em><b>Semantic Markup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY__SEMANTIC_MARKUP = DATA_TYPE__SEMANTIC_MARKUP;

	/**
	 * The feature id for the '<em><b>Doclet</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY__DOCLET = DATA_TYPE__DOCLET;

	/**
	 * The feature id for the '<em><b>Example</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY__EXAMPLE = DATA_TYPE__EXAMPLE;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY__CONSTRAINT = DATA_TYPE__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Registration Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY__REGISTRATION_STATUS = DATA_TYPE__REGISTRATION_STATUS;

	/**
	 * The feature id for the '<em><b>Removal Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY__REMOVAL_DATE = DATA_TYPE__REMOVAL_DATE;

	/**
	 * The feature id for the '<em><b>Data Dictionary</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY__DATA_DICTIONARY = DATA_TYPE__DATA_DICTIONARY;

	/**
	 * The feature id for the '<em><b>Min Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY__MIN_LENGTH = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY__MAX_LENGTH = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY__LENGTH = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY__PATTERN = DATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Binary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Removal Date Registration Status</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN = DATA_TYPE___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN;

	/**
	 * The operation id for the '<em>Name First Letter Uppercase</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN = DATA_TYPE___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN;

	/**
	 * The number of operations of the '<em>Binary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso20022.impl.DateImpl <em>Date</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso20022.impl.DateImpl
	 * @see iso20022.impl.Iso20022PackageImpl#getDate()
	 * @generated
	 */
	int DATE = 71;

	/**
	 * The feature id for the '<em><b>Next Versions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE__NEXT_VERSIONS = ABSTRACT_DATE_TIME_CONCEPT__NEXT_VERSIONS;

	/**
	 * The feature id for the '<em><b>Previous Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE__PREVIOUS_VERSION = ABSTRACT_DATE_TIME_CONCEPT__PREVIOUS_VERSION;

	/**
	 * The feature id for the '<em><b>Object Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE__OBJECT_IDENTIFIER = ABSTRACT_DATE_TIME_CONCEPT__OBJECT_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE__NAME = ABSTRACT_DATE_TIME_CONCEPT__NAME;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE__DEFINITION = ABSTRACT_DATE_TIME_CONCEPT__DEFINITION;

	/**
	 * The feature id for the '<em><b>Semantic Markup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE__SEMANTIC_MARKUP = ABSTRACT_DATE_TIME_CONCEPT__SEMANTIC_MARKUP;

	/**
	 * The feature id for the '<em><b>Doclet</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE__DOCLET = ABSTRACT_DATE_TIME_CONCEPT__DOCLET;

	/**
	 * The feature id for the '<em><b>Example</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE__EXAMPLE = ABSTRACT_DATE_TIME_CONCEPT__EXAMPLE;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE__CONSTRAINT = ABSTRACT_DATE_TIME_CONCEPT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Registration Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE__REGISTRATION_STATUS = ABSTRACT_DATE_TIME_CONCEPT__REGISTRATION_STATUS;

	/**
	 * The feature id for the '<em><b>Removal Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE__REMOVAL_DATE = ABSTRACT_DATE_TIME_CONCEPT__REMOVAL_DATE;

	/**
	 * The feature id for the '<em><b>Data Dictionary</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE__DATA_DICTIONARY = ABSTRACT_DATE_TIME_CONCEPT__DATA_DICTIONARY;

	/**
	 * The feature id for the '<em><b>Min Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE__MIN_INCLUSIVE = ABSTRACT_DATE_TIME_CONCEPT__MIN_INCLUSIVE;

	/**
	 * The feature id for the '<em><b>Min Exclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE__MIN_EXCLUSIVE = ABSTRACT_DATE_TIME_CONCEPT__MIN_EXCLUSIVE;

	/**
	 * The feature id for the '<em><b>Max Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE__MAX_INCLUSIVE = ABSTRACT_DATE_TIME_CONCEPT__MAX_INCLUSIVE;

	/**
	 * The feature id for the '<em><b>Max Exclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE__MAX_EXCLUSIVE = ABSTRACT_DATE_TIME_CONCEPT__MAX_EXCLUSIVE;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE__PATTERN = ABSTRACT_DATE_TIME_CONCEPT__PATTERN;

	/**
	 * The number of structural features of the '<em>Date</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FEATURE_COUNT = ABSTRACT_DATE_TIME_CONCEPT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Removal Date Registration Status</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN = ABSTRACT_DATE_TIME_CONCEPT___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN;

	/**
	 * The operation id for the '<em>Name First Letter Uppercase</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN = ABSTRACT_DATE_TIME_CONCEPT___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN;

	/**
	 * The number of operations of the '<em>Date</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_OPERATION_COUNT = ABSTRACT_DATE_TIME_CONCEPT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso20022.impl.DateTimeImpl <em>Date Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso20022.impl.DateTimeImpl
	 * @see iso20022.impl.Iso20022PackageImpl#getDateTime()
	 * @generated
	 */
	int DATE_TIME = 72;

	/**
	 * The feature id for the '<em><b>Next Versions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME__NEXT_VERSIONS = ABSTRACT_DATE_TIME_CONCEPT__NEXT_VERSIONS;

	/**
	 * The feature id for the '<em><b>Previous Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME__PREVIOUS_VERSION = ABSTRACT_DATE_TIME_CONCEPT__PREVIOUS_VERSION;

	/**
	 * The feature id for the '<em><b>Object Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME__OBJECT_IDENTIFIER = ABSTRACT_DATE_TIME_CONCEPT__OBJECT_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME__NAME = ABSTRACT_DATE_TIME_CONCEPT__NAME;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME__DEFINITION = ABSTRACT_DATE_TIME_CONCEPT__DEFINITION;

	/**
	 * The feature id for the '<em><b>Semantic Markup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME__SEMANTIC_MARKUP = ABSTRACT_DATE_TIME_CONCEPT__SEMANTIC_MARKUP;

	/**
	 * The feature id for the '<em><b>Doclet</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME__DOCLET = ABSTRACT_DATE_TIME_CONCEPT__DOCLET;

	/**
	 * The feature id for the '<em><b>Example</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME__EXAMPLE = ABSTRACT_DATE_TIME_CONCEPT__EXAMPLE;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME__CONSTRAINT = ABSTRACT_DATE_TIME_CONCEPT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Registration Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME__REGISTRATION_STATUS = ABSTRACT_DATE_TIME_CONCEPT__REGISTRATION_STATUS;

	/**
	 * The feature id for the '<em><b>Removal Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME__REMOVAL_DATE = ABSTRACT_DATE_TIME_CONCEPT__REMOVAL_DATE;

	/**
	 * The feature id for the '<em><b>Data Dictionary</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME__DATA_DICTIONARY = ABSTRACT_DATE_TIME_CONCEPT__DATA_DICTIONARY;

	/**
	 * The feature id for the '<em><b>Min Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME__MIN_INCLUSIVE = ABSTRACT_DATE_TIME_CONCEPT__MIN_INCLUSIVE;

	/**
	 * The feature id for the '<em><b>Min Exclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME__MIN_EXCLUSIVE = ABSTRACT_DATE_TIME_CONCEPT__MIN_EXCLUSIVE;

	/**
	 * The feature id for the '<em><b>Max Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME__MAX_INCLUSIVE = ABSTRACT_DATE_TIME_CONCEPT__MAX_INCLUSIVE;

	/**
	 * The feature id for the '<em><b>Max Exclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME__MAX_EXCLUSIVE = ABSTRACT_DATE_TIME_CONCEPT__MAX_EXCLUSIVE;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME__PATTERN = ABSTRACT_DATE_TIME_CONCEPT__PATTERN;

	/**
	 * The number of structural features of the '<em>Date Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_FEATURE_COUNT = ABSTRACT_DATE_TIME_CONCEPT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Removal Date Registration Status</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN = ABSTRACT_DATE_TIME_CONCEPT___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN;

	/**
	 * The operation id for the '<em>Name First Letter Uppercase</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN = ABSTRACT_DATE_TIME_CONCEPT___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN;

	/**
	 * The number of operations of the '<em>Date Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_OPERATION_COUNT = ABSTRACT_DATE_TIME_CONCEPT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso20022.impl.DayImpl <em>Day</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso20022.impl.DayImpl
	 * @see iso20022.impl.Iso20022PackageImpl#getDay()
	 * @generated
	 */
	int DAY = 73;

	/**
	 * The feature id for the '<em><b>Next Versions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY__NEXT_VERSIONS = ABSTRACT_DATE_TIME_CONCEPT__NEXT_VERSIONS;

	/**
	 * The feature id for the '<em><b>Previous Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY__PREVIOUS_VERSION = ABSTRACT_DATE_TIME_CONCEPT__PREVIOUS_VERSION;

	/**
	 * The feature id for the '<em><b>Object Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY__OBJECT_IDENTIFIER = ABSTRACT_DATE_TIME_CONCEPT__OBJECT_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY__NAME = ABSTRACT_DATE_TIME_CONCEPT__NAME;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY__DEFINITION = ABSTRACT_DATE_TIME_CONCEPT__DEFINITION;

	/**
	 * The feature id for the '<em><b>Semantic Markup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY__SEMANTIC_MARKUP = ABSTRACT_DATE_TIME_CONCEPT__SEMANTIC_MARKUP;

	/**
	 * The feature id for the '<em><b>Doclet</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY__DOCLET = ABSTRACT_DATE_TIME_CONCEPT__DOCLET;

	/**
	 * The feature id for the '<em><b>Example</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY__EXAMPLE = ABSTRACT_DATE_TIME_CONCEPT__EXAMPLE;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY__CONSTRAINT = ABSTRACT_DATE_TIME_CONCEPT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Registration Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY__REGISTRATION_STATUS = ABSTRACT_DATE_TIME_CONCEPT__REGISTRATION_STATUS;

	/**
	 * The feature id for the '<em><b>Removal Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY__REMOVAL_DATE = ABSTRACT_DATE_TIME_CONCEPT__REMOVAL_DATE;

	/**
	 * The feature id for the '<em><b>Data Dictionary</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY__DATA_DICTIONARY = ABSTRACT_DATE_TIME_CONCEPT__DATA_DICTIONARY;

	/**
	 * The feature id for the '<em><b>Min Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY__MIN_INCLUSIVE = ABSTRACT_DATE_TIME_CONCEPT__MIN_INCLUSIVE;

	/**
	 * The feature id for the '<em><b>Min Exclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY__MIN_EXCLUSIVE = ABSTRACT_DATE_TIME_CONCEPT__MIN_EXCLUSIVE;

	/**
	 * The feature id for the '<em><b>Max Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY__MAX_INCLUSIVE = ABSTRACT_DATE_TIME_CONCEPT__MAX_INCLUSIVE;

	/**
	 * The feature id for the '<em><b>Max Exclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY__MAX_EXCLUSIVE = ABSTRACT_DATE_TIME_CONCEPT__MAX_EXCLUSIVE;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY__PATTERN = ABSTRACT_DATE_TIME_CONCEPT__PATTERN;

	/**
	 * The number of structural features of the '<em>Day</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY_FEATURE_COUNT = ABSTRACT_DATE_TIME_CONCEPT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Removal Date Registration Status</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN = ABSTRACT_DATE_TIME_CONCEPT___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN;

	/**
	 * The operation id for the '<em>Name First Letter Uppercase</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN = ABSTRACT_DATE_TIME_CONCEPT___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN;

	/**
	 * The number of operations of the '<em>Day</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY_OPERATION_COUNT = ABSTRACT_DATE_TIME_CONCEPT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso20022.impl.DurationImpl <em>Duration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso20022.impl.DurationImpl
	 * @see iso20022.impl.Iso20022PackageImpl#getDuration()
	 * @generated
	 */
	int DURATION = 74;

	/**
	 * The feature id for the '<em><b>Next Versions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION__NEXT_VERSIONS = ABSTRACT_DATE_TIME_CONCEPT__NEXT_VERSIONS;

	/**
	 * The feature id for the '<em><b>Previous Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION__PREVIOUS_VERSION = ABSTRACT_DATE_TIME_CONCEPT__PREVIOUS_VERSION;

	/**
	 * The feature id for the '<em><b>Object Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION__OBJECT_IDENTIFIER = ABSTRACT_DATE_TIME_CONCEPT__OBJECT_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION__NAME = ABSTRACT_DATE_TIME_CONCEPT__NAME;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION__DEFINITION = ABSTRACT_DATE_TIME_CONCEPT__DEFINITION;

	/**
	 * The feature id for the '<em><b>Semantic Markup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION__SEMANTIC_MARKUP = ABSTRACT_DATE_TIME_CONCEPT__SEMANTIC_MARKUP;

	/**
	 * The feature id for the '<em><b>Doclet</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION__DOCLET = ABSTRACT_DATE_TIME_CONCEPT__DOCLET;

	/**
	 * The feature id for the '<em><b>Example</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION__EXAMPLE = ABSTRACT_DATE_TIME_CONCEPT__EXAMPLE;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION__CONSTRAINT = ABSTRACT_DATE_TIME_CONCEPT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Registration Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION__REGISTRATION_STATUS = ABSTRACT_DATE_TIME_CONCEPT__REGISTRATION_STATUS;

	/**
	 * The feature id for the '<em><b>Removal Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION__REMOVAL_DATE = ABSTRACT_DATE_TIME_CONCEPT__REMOVAL_DATE;

	/**
	 * The feature id for the '<em><b>Data Dictionary</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION__DATA_DICTIONARY = ABSTRACT_DATE_TIME_CONCEPT__DATA_DICTIONARY;

	/**
	 * The feature id for the '<em><b>Min Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION__MIN_INCLUSIVE = ABSTRACT_DATE_TIME_CONCEPT__MIN_INCLUSIVE;

	/**
	 * The feature id for the '<em><b>Min Exclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION__MIN_EXCLUSIVE = ABSTRACT_DATE_TIME_CONCEPT__MIN_EXCLUSIVE;

	/**
	 * The feature id for the '<em><b>Max Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION__MAX_INCLUSIVE = ABSTRACT_DATE_TIME_CONCEPT__MAX_INCLUSIVE;

	/**
	 * The feature id for the '<em><b>Max Exclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION__MAX_EXCLUSIVE = ABSTRACT_DATE_TIME_CONCEPT__MAX_EXCLUSIVE;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION__PATTERN = ABSTRACT_DATE_TIME_CONCEPT__PATTERN;

	/**
	 * The number of structural features of the '<em>Duration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_FEATURE_COUNT = ABSTRACT_DATE_TIME_CONCEPT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Removal Date Registration Status</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN = ABSTRACT_DATE_TIME_CONCEPT___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN;

	/**
	 * The operation id for the '<em>Name First Letter Uppercase</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN = ABSTRACT_DATE_TIME_CONCEPT___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN;

	/**
	 * The number of operations of the '<em>Duration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_OPERATION_COUNT = ABSTRACT_DATE_TIME_CONCEPT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso20022.impl.MonthImpl <em>Month</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso20022.impl.MonthImpl
	 * @see iso20022.impl.Iso20022PackageImpl#getMonth()
	 * @generated
	 */
	int MONTH = 75;

	/**
	 * The feature id for the '<em><b>Next Versions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONTH__NEXT_VERSIONS = ABSTRACT_DATE_TIME_CONCEPT__NEXT_VERSIONS;

	/**
	 * The feature id for the '<em><b>Previous Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONTH__PREVIOUS_VERSION = ABSTRACT_DATE_TIME_CONCEPT__PREVIOUS_VERSION;

	/**
	 * The feature id for the '<em><b>Object Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONTH__OBJECT_IDENTIFIER = ABSTRACT_DATE_TIME_CONCEPT__OBJECT_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONTH__NAME = ABSTRACT_DATE_TIME_CONCEPT__NAME;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONTH__DEFINITION = ABSTRACT_DATE_TIME_CONCEPT__DEFINITION;

	/**
	 * The feature id for the '<em><b>Semantic Markup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONTH__SEMANTIC_MARKUP = ABSTRACT_DATE_TIME_CONCEPT__SEMANTIC_MARKUP;

	/**
	 * The feature id for the '<em><b>Doclet</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONTH__DOCLET = ABSTRACT_DATE_TIME_CONCEPT__DOCLET;

	/**
	 * The feature id for the '<em><b>Example</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONTH__EXAMPLE = ABSTRACT_DATE_TIME_CONCEPT__EXAMPLE;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONTH__CONSTRAINT = ABSTRACT_DATE_TIME_CONCEPT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Registration Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONTH__REGISTRATION_STATUS = ABSTRACT_DATE_TIME_CONCEPT__REGISTRATION_STATUS;

	/**
	 * The feature id for the '<em><b>Removal Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONTH__REMOVAL_DATE = ABSTRACT_DATE_TIME_CONCEPT__REMOVAL_DATE;

	/**
	 * The feature id for the '<em><b>Data Dictionary</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONTH__DATA_DICTIONARY = ABSTRACT_DATE_TIME_CONCEPT__DATA_DICTIONARY;

	/**
	 * The feature id for the '<em><b>Min Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONTH__MIN_INCLUSIVE = ABSTRACT_DATE_TIME_CONCEPT__MIN_INCLUSIVE;

	/**
	 * The feature id for the '<em><b>Min Exclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONTH__MIN_EXCLUSIVE = ABSTRACT_DATE_TIME_CONCEPT__MIN_EXCLUSIVE;

	/**
	 * The feature id for the '<em><b>Max Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONTH__MAX_INCLUSIVE = ABSTRACT_DATE_TIME_CONCEPT__MAX_INCLUSIVE;

	/**
	 * The feature id for the '<em><b>Max Exclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONTH__MAX_EXCLUSIVE = ABSTRACT_DATE_TIME_CONCEPT__MAX_EXCLUSIVE;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONTH__PATTERN = ABSTRACT_DATE_TIME_CONCEPT__PATTERN;

	/**
	 * The number of structural features of the '<em>Month</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONTH_FEATURE_COUNT = ABSTRACT_DATE_TIME_CONCEPT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Removal Date Registration Status</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONTH___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN = ABSTRACT_DATE_TIME_CONCEPT___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN;

	/**
	 * The operation id for the '<em>Name First Letter Uppercase</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONTH___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN = ABSTRACT_DATE_TIME_CONCEPT___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN;

	/**
	 * The number of operations of the '<em>Month</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONTH_OPERATION_COUNT = ABSTRACT_DATE_TIME_CONCEPT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso20022.impl.MonthDayImpl <em>Month Day</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso20022.impl.MonthDayImpl
	 * @see iso20022.impl.Iso20022PackageImpl#getMonthDay()
	 * @generated
	 */
	int MONTH_DAY = 76;

	/**
	 * The feature id for the '<em><b>Next Versions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONTH_DAY__NEXT_VERSIONS = ABSTRACT_DATE_TIME_CONCEPT__NEXT_VERSIONS;

	/**
	 * The feature id for the '<em><b>Previous Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONTH_DAY__PREVIOUS_VERSION = ABSTRACT_DATE_TIME_CONCEPT__PREVIOUS_VERSION;

	/**
	 * The feature id for the '<em><b>Object Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONTH_DAY__OBJECT_IDENTIFIER = ABSTRACT_DATE_TIME_CONCEPT__OBJECT_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONTH_DAY__NAME = ABSTRACT_DATE_TIME_CONCEPT__NAME;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONTH_DAY__DEFINITION = ABSTRACT_DATE_TIME_CONCEPT__DEFINITION;

	/**
	 * The feature id for the '<em><b>Semantic Markup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONTH_DAY__SEMANTIC_MARKUP = ABSTRACT_DATE_TIME_CONCEPT__SEMANTIC_MARKUP;

	/**
	 * The feature id for the '<em><b>Doclet</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONTH_DAY__DOCLET = ABSTRACT_DATE_TIME_CONCEPT__DOCLET;

	/**
	 * The feature id for the '<em><b>Example</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONTH_DAY__EXAMPLE = ABSTRACT_DATE_TIME_CONCEPT__EXAMPLE;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONTH_DAY__CONSTRAINT = ABSTRACT_DATE_TIME_CONCEPT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Registration Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONTH_DAY__REGISTRATION_STATUS = ABSTRACT_DATE_TIME_CONCEPT__REGISTRATION_STATUS;

	/**
	 * The feature id for the '<em><b>Removal Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONTH_DAY__REMOVAL_DATE = ABSTRACT_DATE_TIME_CONCEPT__REMOVAL_DATE;

	/**
	 * The feature id for the '<em><b>Data Dictionary</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONTH_DAY__DATA_DICTIONARY = ABSTRACT_DATE_TIME_CONCEPT__DATA_DICTIONARY;

	/**
	 * The feature id for the '<em><b>Min Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONTH_DAY__MIN_INCLUSIVE = ABSTRACT_DATE_TIME_CONCEPT__MIN_INCLUSIVE;

	/**
	 * The feature id for the '<em><b>Min Exclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONTH_DAY__MIN_EXCLUSIVE = ABSTRACT_DATE_TIME_CONCEPT__MIN_EXCLUSIVE;

	/**
	 * The feature id for the '<em><b>Max Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONTH_DAY__MAX_INCLUSIVE = ABSTRACT_DATE_TIME_CONCEPT__MAX_INCLUSIVE;

	/**
	 * The feature id for the '<em><b>Max Exclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONTH_DAY__MAX_EXCLUSIVE = ABSTRACT_DATE_TIME_CONCEPT__MAX_EXCLUSIVE;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONTH_DAY__PATTERN = ABSTRACT_DATE_TIME_CONCEPT__PATTERN;

	/**
	 * The number of structural features of the '<em>Month Day</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONTH_DAY_FEATURE_COUNT = ABSTRACT_DATE_TIME_CONCEPT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Removal Date Registration Status</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONTH_DAY___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN = ABSTRACT_DATE_TIME_CONCEPT___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN;

	/**
	 * The operation id for the '<em>Name First Letter Uppercase</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONTH_DAY___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN = ABSTRACT_DATE_TIME_CONCEPT___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN;

	/**
	 * The number of operations of the '<em>Month Day</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONTH_DAY_OPERATION_COUNT = ABSTRACT_DATE_TIME_CONCEPT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso20022.impl.TimeImpl <em>Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso20022.impl.TimeImpl
	 * @see iso20022.impl.Iso20022PackageImpl#getTime()
	 * @generated
	 */
	int TIME = 77;

	/**
	 * The feature id for the '<em><b>Next Versions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME__NEXT_VERSIONS = ABSTRACT_DATE_TIME_CONCEPT__NEXT_VERSIONS;

	/**
	 * The feature id for the '<em><b>Previous Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME__PREVIOUS_VERSION = ABSTRACT_DATE_TIME_CONCEPT__PREVIOUS_VERSION;

	/**
	 * The feature id for the '<em><b>Object Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME__OBJECT_IDENTIFIER = ABSTRACT_DATE_TIME_CONCEPT__OBJECT_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME__NAME = ABSTRACT_DATE_TIME_CONCEPT__NAME;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME__DEFINITION = ABSTRACT_DATE_TIME_CONCEPT__DEFINITION;

	/**
	 * The feature id for the '<em><b>Semantic Markup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME__SEMANTIC_MARKUP = ABSTRACT_DATE_TIME_CONCEPT__SEMANTIC_MARKUP;

	/**
	 * The feature id for the '<em><b>Doclet</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME__DOCLET = ABSTRACT_DATE_TIME_CONCEPT__DOCLET;

	/**
	 * The feature id for the '<em><b>Example</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME__EXAMPLE = ABSTRACT_DATE_TIME_CONCEPT__EXAMPLE;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME__CONSTRAINT = ABSTRACT_DATE_TIME_CONCEPT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Registration Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME__REGISTRATION_STATUS = ABSTRACT_DATE_TIME_CONCEPT__REGISTRATION_STATUS;

	/**
	 * The feature id for the '<em><b>Removal Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME__REMOVAL_DATE = ABSTRACT_DATE_TIME_CONCEPT__REMOVAL_DATE;

	/**
	 * The feature id for the '<em><b>Data Dictionary</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME__DATA_DICTIONARY = ABSTRACT_DATE_TIME_CONCEPT__DATA_DICTIONARY;

	/**
	 * The feature id for the '<em><b>Min Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME__MIN_INCLUSIVE = ABSTRACT_DATE_TIME_CONCEPT__MIN_INCLUSIVE;

	/**
	 * The feature id for the '<em><b>Min Exclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME__MIN_EXCLUSIVE = ABSTRACT_DATE_TIME_CONCEPT__MIN_EXCLUSIVE;

	/**
	 * The feature id for the '<em><b>Max Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME__MAX_INCLUSIVE = ABSTRACT_DATE_TIME_CONCEPT__MAX_INCLUSIVE;

	/**
	 * The feature id for the '<em><b>Max Exclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME__MAX_EXCLUSIVE = ABSTRACT_DATE_TIME_CONCEPT__MAX_EXCLUSIVE;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME__PATTERN = ABSTRACT_DATE_TIME_CONCEPT__PATTERN;

	/**
	 * The number of structural features of the '<em>Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_FEATURE_COUNT = ABSTRACT_DATE_TIME_CONCEPT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Removal Date Registration Status</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN = ABSTRACT_DATE_TIME_CONCEPT___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN;

	/**
	 * The operation id for the '<em>Name First Letter Uppercase</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN = ABSTRACT_DATE_TIME_CONCEPT___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN;

	/**
	 * The number of operations of the '<em>Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_OPERATION_COUNT = ABSTRACT_DATE_TIME_CONCEPT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso20022.impl.YearImpl <em>Year</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso20022.impl.YearImpl
	 * @see iso20022.impl.Iso20022PackageImpl#getYear()
	 * @generated
	 */
	int YEAR = 78;

	/**
	 * The feature id for the '<em><b>Next Versions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEAR__NEXT_VERSIONS = ABSTRACT_DATE_TIME_CONCEPT__NEXT_VERSIONS;

	/**
	 * The feature id for the '<em><b>Previous Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEAR__PREVIOUS_VERSION = ABSTRACT_DATE_TIME_CONCEPT__PREVIOUS_VERSION;

	/**
	 * The feature id for the '<em><b>Object Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEAR__OBJECT_IDENTIFIER = ABSTRACT_DATE_TIME_CONCEPT__OBJECT_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEAR__NAME = ABSTRACT_DATE_TIME_CONCEPT__NAME;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEAR__DEFINITION = ABSTRACT_DATE_TIME_CONCEPT__DEFINITION;

	/**
	 * The feature id for the '<em><b>Semantic Markup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEAR__SEMANTIC_MARKUP = ABSTRACT_DATE_TIME_CONCEPT__SEMANTIC_MARKUP;

	/**
	 * The feature id for the '<em><b>Doclet</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEAR__DOCLET = ABSTRACT_DATE_TIME_CONCEPT__DOCLET;

	/**
	 * The feature id for the '<em><b>Example</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEAR__EXAMPLE = ABSTRACT_DATE_TIME_CONCEPT__EXAMPLE;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEAR__CONSTRAINT = ABSTRACT_DATE_TIME_CONCEPT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Registration Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEAR__REGISTRATION_STATUS = ABSTRACT_DATE_TIME_CONCEPT__REGISTRATION_STATUS;

	/**
	 * The feature id for the '<em><b>Removal Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEAR__REMOVAL_DATE = ABSTRACT_DATE_TIME_CONCEPT__REMOVAL_DATE;

	/**
	 * The feature id for the '<em><b>Data Dictionary</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEAR__DATA_DICTIONARY = ABSTRACT_DATE_TIME_CONCEPT__DATA_DICTIONARY;

	/**
	 * The feature id for the '<em><b>Min Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEAR__MIN_INCLUSIVE = ABSTRACT_DATE_TIME_CONCEPT__MIN_INCLUSIVE;

	/**
	 * The feature id for the '<em><b>Min Exclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEAR__MIN_EXCLUSIVE = ABSTRACT_DATE_TIME_CONCEPT__MIN_EXCLUSIVE;

	/**
	 * The feature id for the '<em><b>Max Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEAR__MAX_INCLUSIVE = ABSTRACT_DATE_TIME_CONCEPT__MAX_INCLUSIVE;

	/**
	 * The feature id for the '<em><b>Max Exclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEAR__MAX_EXCLUSIVE = ABSTRACT_DATE_TIME_CONCEPT__MAX_EXCLUSIVE;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEAR__PATTERN = ABSTRACT_DATE_TIME_CONCEPT__PATTERN;

	/**
	 * The number of structural features of the '<em>Year</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEAR_FEATURE_COUNT = ABSTRACT_DATE_TIME_CONCEPT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Removal Date Registration Status</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEAR___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN = ABSTRACT_DATE_TIME_CONCEPT___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN;

	/**
	 * The operation id for the '<em>Name First Letter Uppercase</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEAR___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN = ABSTRACT_DATE_TIME_CONCEPT___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN;

	/**
	 * The number of operations of the '<em>Year</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEAR_OPERATION_COUNT = ABSTRACT_DATE_TIME_CONCEPT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso20022.impl.YearMonthImpl <em>Year Month</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso20022.impl.YearMonthImpl
	 * @see iso20022.impl.Iso20022PackageImpl#getYearMonth()
	 * @generated
	 */
	int YEAR_MONTH = 79;

	/**
	 * The feature id for the '<em><b>Next Versions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEAR_MONTH__NEXT_VERSIONS = ABSTRACT_DATE_TIME_CONCEPT__NEXT_VERSIONS;

	/**
	 * The feature id for the '<em><b>Previous Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEAR_MONTH__PREVIOUS_VERSION = ABSTRACT_DATE_TIME_CONCEPT__PREVIOUS_VERSION;

	/**
	 * The feature id for the '<em><b>Object Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEAR_MONTH__OBJECT_IDENTIFIER = ABSTRACT_DATE_TIME_CONCEPT__OBJECT_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEAR_MONTH__NAME = ABSTRACT_DATE_TIME_CONCEPT__NAME;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEAR_MONTH__DEFINITION = ABSTRACT_DATE_TIME_CONCEPT__DEFINITION;

	/**
	 * The feature id for the '<em><b>Semantic Markup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEAR_MONTH__SEMANTIC_MARKUP = ABSTRACT_DATE_TIME_CONCEPT__SEMANTIC_MARKUP;

	/**
	 * The feature id for the '<em><b>Doclet</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEAR_MONTH__DOCLET = ABSTRACT_DATE_TIME_CONCEPT__DOCLET;

	/**
	 * The feature id for the '<em><b>Example</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEAR_MONTH__EXAMPLE = ABSTRACT_DATE_TIME_CONCEPT__EXAMPLE;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEAR_MONTH__CONSTRAINT = ABSTRACT_DATE_TIME_CONCEPT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Registration Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEAR_MONTH__REGISTRATION_STATUS = ABSTRACT_DATE_TIME_CONCEPT__REGISTRATION_STATUS;

	/**
	 * The feature id for the '<em><b>Removal Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEAR_MONTH__REMOVAL_DATE = ABSTRACT_DATE_TIME_CONCEPT__REMOVAL_DATE;

	/**
	 * The feature id for the '<em><b>Data Dictionary</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEAR_MONTH__DATA_DICTIONARY = ABSTRACT_DATE_TIME_CONCEPT__DATA_DICTIONARY;

	/**
	 * The feature id for the '<em><b>Min Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEAR_MONTH__MIN_INCLUSIVE = ABSTRACT_DATE_TIME_CONCEPT__MIN_INCLUSIVE;

	/**
	 * The feature id for the '<em><b>Min Exclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEAR_MONTH__MIN_EXCLUSIVE = ABSTRACT_DATE_TIME_CONCEPT__MIN_EXCLUSIVE;

	/**
	 * The feature id for the '<em><b>Max Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEAR_MONTH__MAX_INCLUSIVE = ABSTRACT_DATE_TIME_CONCEPT__MAX_INCLUSIVE;

	/**
	 * The feature id for the '<em><b>Max Exclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEAR_MONTH__MAX_EXCLUSIVE = ABSTRACT_DATE_TIME_CONCEPT__MAX_EXCLUSIVE;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEAR_MONTH__PATTERN = ABSTRACT_DATE_TIME_CONCEPT__PATTERN;

	/**
	 * The number of structural features of the '<em>Year Month</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEAR_MONTH_FEATURE_COUNT = ABSTRACT_DATE_TIME_CONCEPT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Removal Date Registration Status</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEAR_MONTH___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN = ABSTRACT_DATE_TIME_CONCEPT___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN;

	/**
	 * The operation id for the '<em>Name First Letter Uppercase</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEAR_MONTH___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN = ABSTRACT_DATE_TIME_CONCEPT___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN;

	/**
	 * The number of operations of the '<em>Year Month</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEAR_MONTH_OPERATION_COUNT = ABSTRACT_DATE_TIME_CONCEPT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso20022.impl.UserDefinedImpl <em>User Defined</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso20022.impl.UserDefinedImpl
	 * @see iso20022.impl.Iso20022PackageImpl#getUserDefined()
	 * @generated
	 */
	int USER_DEFINED = 80;

	/**
	 * The feature id for the '<em><b>Next Versions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEFINED__NEXT_VERSIONS = MESSAGE_COMPONENT_TYPE__NEXT_VERSIONS;

	/**
	 * The feature id for the '<em><b>Previous Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEFINED__PREVIOUS_VERSION = MESSAGE_COMPONENT_TYPE__PREVIOUS_VERSION;

	/**
	 * The feature id for the '<em><b>Object Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEFINED__OBJECT_IDENTIFIER = MESSAGE_COMPONENT_TYPE__OBJECT_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEFINED__NAME = MESSAGE_COMPONENT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEFINED__DEFINITION = MESSAGE_COMPONENT_TYPE__DEFINITION;

	/**
	 * The feature id for the '<em><b>Semantic Markup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEFINED__SEMANTIC_MARKUP = MESSAGE_COMPONENT_TYPE__SEMANTIC_MARKUP;

	/**
	 * The feature id for the '<em><b>Doclet</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEFINED__DOCLET = MESSAGE_COMPONENT_TYPE__DOCLET;

	/**
	 * The feature id for the '<em><b>Example</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEFINED__EXAMPLE = MESSAGE_COMPONENT_TYPE__EXAMPLE;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEFINED__CONSTRAINT = MESSAGE_COMPONENT_TYPE__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Registration Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEFINED__REGISTRATION_STATUS = MESSAGE_COMPONENT_TYPE__REGISTRATION_STATUS;

	/**
	 * The feature id for the '<em><b>Removal Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEFINED__REMOVAL_DATE = MESSAGE_COMPONENT_TYPE__REMOVAL_DATE;

	/**
	 * The feature id for the '<em><b>Data Dictionary</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEFINED__DATA_DICTIONARY = MESSAGE_COMPONENT_TYPE__DATA_DICTIONARY;

	/**
	 * The feature id for the '<em><b>Message Building Block</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEFINED__MESSAGE_BUILDING_BLOCK = MESSAGE_COMPONENT_TYPE__MESSAGE_BUILDING_BLOCK;

	/**
	 * The feature id for the '<em><b>Is Technical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEFINED__IS_TECHNICAL = MESSAGE_COMPONENT_TYPE__IS_TECHNICAL;

	/**
	 * The feature id for the '<em><b>Trace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEFINED__TRACE = MESSAGE_COMPONENT_TYPE__TRACE;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEFINED__NAMESPACE = MESSAGE_COMPONENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Namespace List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEFINED__NAMESPACE_LIST = MESSAGE_COMPONENT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Process Contents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEFINED__PROCESS_CONTENTS = MESSAGE_COMPONENT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>User Defined</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEFINED_FEATURE_COUNT = MESSAGE_COMPONENT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Removal Date Registration Status</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEFINED___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN = MESSAGE_COMPONENT_TYPE___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN;

	/**
	 * The operation id for the '<em>Name First Letter Uppercase</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEFINED___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN = MESSAGE_COMPONENT_TYPE___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN;

	/**
	 * The number of operations of the '<em>User Defined</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEFINED_OPERATION_COUNT = MESSAGE_COMPONENT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso20022.impl.IndustryMessageSetImpl <em>Industry Message Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso20022.impl.IndustryMessageSetImpl
	 * @see iso20022.impl.Iso20022PackageImpl#getIndustryMessageSet()
	 * @generated
	 */
	int INDUSTRY_MESSAGE_SET = 81;

	/**
	 * The feature id for the '<em><b>Next Versions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDUSTRY_MESSAGE_SET__NEXT_VERSIONS = TOP_LEVEL_CATALOGUE_ENTRY__NEXT_VERSIONS;

	/**
	 * The feature id for the '<em><b>Previous Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDUSTRY_MESSAGE_SET__PREVIOUS_VERSION = TOP_LEVEL_CATALOGUE_ENTRY__PREVIOUS_VERSION;

	/**
	 * The feature id for the '<em><b>Object Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDUSTRY_MESSAGE_SET__OBJECT_IDENTIFIER = TOP_LEVEL_CATALOGUE_ENTRY__OBJECT_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDUSTRY_MESSAGE_SET__NAME = TOP_LEVEL_CATALOGUE_ENTRY__NAME;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDUSTRY_MESSAGE_SET__DEFINITION = TOP_LEVEL_CATALOGUE_ENTRY__DEFINITION;

	/**
	 * The feature id for the '<em><b>Semantic Markup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDUSTRY_MESSAGE_SET__SEMANTIC_MARKUP = TOP_LEVEL_CATALOGUE_ENTRY__SEMANTIC_MARKUP;

	/**
	 * The feature id for the '<em><b>Doclet</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDUSTRY_MESSAGE_SET__DOCLET = TOP_LEVEL_CATALOGUE_ENTRY__DOCLET;

	/**
	 * The feature id for the '<em><b>Example</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDUSTRY_MESSAGE_SET__EXAMPLE = TOP_LEVEL_CATALOGUE_ENTRY__EXAMPLE;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDUSTRY_MESSAGE_SET__CONSTRAINT = TOP_LEVEL_CATALOGUE_ENTRY__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Registration Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDUSTRY_MESSAGE_SET__REGISTRATION_STATUS = TOP_LEVEL_CATALOGUE_ENTRY__REGISTRATION_STATUS;

	/**
	 * The feature id for the '<em><b>Removal Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDUSTRY_MESSAGE_SET__REMOVAL_DATE = TOP_LEVEL_CATALOGUE_ENTRY__REMOVAL_DATE;

	/**
	 * The feature id for the '<em><b>Business Process Catalogue</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDUSTRY_MESSAGE_SET__BUSINESS_PROCESS_CATALOGUE = TOP_LEVEL_CATALOGUE_ENTRY__BUSINESS_PROCESS_CATALOGUE;

	/**
	 * The number of structural features of the '<em>Industry Message Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDUSTRY_MESSAGE_SET_FEATURE_COUNT = TOP_LEVEL_CATALOGUE_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Removal Date Registration Status</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDUSTRY_MESSAGE_SET___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN = TOP_LEVEL_CATALOGUE_ENTRY___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN;

	/**
	 * The operation id for the '<em>Name First Letter Uppercase</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDUSTRY_MESSAGE_SET___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN = TOP_LEVEL_CATALOGUE_ENTRY___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN;

	/**
	 * The number of operations of the '<em>Industry Message Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDUSTRY_MESSAGE_SET_OPERATION_COUNT = TOP_LEVEL_CATALOGUE_ENTRY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso20022.impl.ConvergenceDocumentationImpl <em>Convergence Documentation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso20022.impl.ConvergenceDocumentationImpl
	 * @see iso20022.impl.Iso20022PackageImpl#getConvergenceDocumentation()
	 * @generated
	 */
	int CONVERGENCE_DOCUMENTATION = 82;

	/**
	 * The feature id for the '<em><b>Next Versions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERGENCE_DOCUMENTATION__NEXT_VERSIONS = TOP_LEVEL_CATALOGUE_ENTRY__NEXT_VERSIONS;

	/**
	 * The feature id for the '<em><b>Previous Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERGENCE_DOCUMENTATION__PREVIOUS_VERSION = TOP_LEVEL_CATALOGUE_ENTRY__PREVIOUS_VERSION;

	/**
	 * The feature id for the '<em><b>Object Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERGENCE_DOCUMENTATION__OBJECT_IDENTIFIER = TOP_LEVEL_CATALOGUE_ENTRY__OBJECT_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERGENCE_DOCUMENTATION__NAME = TOP_LEVEL_CATALOGUE_ENTRY__NAME;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERGENCE_DOCUMENTATION__DEFINITION = TOP_LEVEL_CATALOGUE_ENTRY__DEFINITION;

	/**
	 * The feature id for the '<em><b>Semantic Markup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERGENCE_DOCUMENTATION__SEMANTIC_MARKUP = TOP_LEVEL_CATALOGUE_ENTRY__SEMANTIC_MARKUP;

	/**
	 * The feature id for the '<em><b>Doclet</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERGENCE_DOCUMENTATION__DOCLET = TOP_LEVEL_CATALOGUE_ENTRY__DOCLET;

	/**
	 * The feature id for the '<em><b>Example</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERGENCE_DOCUMENTATION__EXAMPLE = TOP_LEVEL_CATALOGUE_ENTRY__EXAMPLE;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERGENCE_DOCUMENTATION__CONSTRAINT = TOP_LEVEL_CATALOGUE_ENTRY__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Registration Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERGENCE_DOCUMENTATION__REGISTRATION_STATUS = TOP_LEVEL_CATALOGUE_ENTRY__REGISTRATION_STATUS;

	/**
	 * The feature id for the '<em><b>Removal Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERGENCE_DOCUMENTATION__REMOVAL_DATE = TOP_LEVEL_CATALOGUE_ENTRY__REMOVAL_DATE;

	/**
	 * The feature id for the '<em><b>Business Process Catalogue</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERGENCE_DOCUMENTATION__BUSINESS_PROCESS_CATALOGUE = TOP_LEVEL_CATALOGUE_ENTRY__BUSINESS_PROCESS_CATALOGUE;

	/**
	 * The number of structural features of the '<em>Convergence Documentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERGENCE_DOCUMENTATION_FEATURE_COUNT = TOP_LEVEL_CATALOGUE_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Removal Date Registration Status</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERGENCE_DOCUMENTATION___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN = TOP_LEVEL_CATALOGUE_ENTRY___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN;

	/**
	 * The operation id for the '<em>Name First Letter Uppercase</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERGENCE_DOCUMENTATION___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN = TOP_LEVEL_CATALOGUE_ENTRY___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN;

	/**
	 * The number of operations of the '<em>Convergence Documentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERGENCE_DOCUMENTATION_OPERATION_COUNT = TOP_LEVEL_CATALOGUE_ENTRY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso20022.impl.ISO15022MessageSetImpl <em>ISO15022 Message Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso20022.impl.ISO15022MessageSetImpl
	 * @see iso20022.impl.Iso20022PackageImpl#getISO15022MessageSet()
	 * @generated
	 */
	int ISO15022_MESSAGE_SET = 83;

	/**
	 * The feature id for the '<em><b>Next Versions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISO15022_MESSAGE_SET__NEXT_VERSIONS = INDUSTRY_MESSAGE_SET__NEXT_VERSIONS;

	/**
	 * The feature id for the '<em><b>Previous Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISO15022_MESSAGE_SET__PREVIOUS_VERSION = INDUSTRY_MESSAGE_SET__PREVIOUS_VERSION;

	/**
	 * The feature id for the '<em><b>Object Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISO15022_MESSAGE_SET__OBJECT_IDENTIFIER = INDUSTRY_MESSAGE_SET__OBJECT_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISO15022_MESSAGE_SET__NAME = INDUSTRY_MESSAGE_SET__NAME;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISO15022_MESSAGE_SET__DEFINITION = INDUSTRY_MESSAGE_SET__DEFINITION;

	/**
	 * The feature id for the '<em><b>Semantic Markup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISO15022_MESSAGE_SET__SEMANTIC_MARKUP = INDUSTRY_MESSAGE_SET__SEMANTIC_MARKUP;

	/**
	 * The feature id for the '<em><b>Doclet</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISO15022_MESSAGE_SET__DOCLET = INDUSTRY_MESSAGE_SET__DOCLET;

	/**
	 * The feature id for the '<em><b>Example</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISO15022_MESSAGE_SET__EXAMPLE = INDUSTRY_MESSAGE_SET__EXAMPLE;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISO15022_MESSAGE_SET__CONSTRAINT = INDUSTRY_MESSAGE_SET__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Registration Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISO15022_MESSAGE_SET__REGISTRATION_STATUS = INDUSTRY_MESSAGE_SET__REGISTRATION_STATUS;

	/**
	 * The feature id for the '<em><b>Removal Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISO15022_MESSAGE_SET__REMOVAL_DATE = INDUSTRY_MESSAGE_SET__REMOVAL_DATE;

	/**
	 * The feature id for the '<em><b>Business Process Catalogue</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISO15022_MESSAGE_SET__BUSINESS_PROCESS_CATALOGUE = INDUSTRY_MESSAGE_SET__BUSINESS_PROCESS_CATALOGUE;

	/**
	 * The number of structural features of the '<em>ISO15022 Message Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISO15022_MESSAGE_SET_FEATURE_COUNT = INDUSTRY_MESSAGE_SET_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Removal Date Registration Status</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISO15022_MESSAGE_SET___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN = INDUSTRY_MESSAGE_SET___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN;

	/**
	 * The operation id for the '<em>Name First Letter Uppercase</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISO15022_MESSAGE_SET___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN = INDUSTRY_MESSAGE_SET___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN;

	/**
	 * The number of operations of the '<em>ISO15022 Message Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISO15022_MESSAGE_SET_OPERATION_COUNT = INDUSTRY_MESSAGE_SET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso20022.impl.SchemaTypeImpl <em>Schema Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso20022.impl.SchemaTypeImpl
	 * @see iso20022.impl.Iso20022PackageImpl#getSchemaType()
	 * @generated
	 */
	int SCHEMA_TYPE = 84;

	/**
	 * The feature id for the '<em><b>Next Versions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_TYPE__NEXT_VERSIONS = DATA_TYPE__NEXT_VERSIONS;

	/**
	 * The feature id for the '<em><b>Previous Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_TYPE__PREVIOUS_VERSION = DATA_TYPE__PREVIOUS_VERSION;

	/**
	 * The feature id for the '<em><b>Object Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_TYPE__OBJECT_IDENTIFIER = DATA_TYPE__OBJECT_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_TYPE__NAME = DATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_TYPE__DEFINITION = DATA_TYPE__DEFINITION;

	/**
	 * The feature id for the '<em><b>Semantic Markup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_TYPE__SEMANTIC_MARKUP = DATA_TYPE__SEMANTIC_MARKUP;

	/**
	 * The feature id for the '<em><b>Doclet</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_TYPE__DOCLET = DATA_TYPE__DOCLET;

	/**
	 * The feature id for the '<em><b>Example</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_TYPE__EXAMPLE = DATA_TYPE__EXAMPLE;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_TYPE__CONSTRAINT = DATA_TYPE__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Registration Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_TYPE__REGISTRATION_STATUS = DATA_TYPE__REGISTRATION_STATUS;

	/**
	 * The feature id for the '<em><b>Removal Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_TYPE__REMOVAL_DATE = DATA_TYPE__REMOVAL_DATE;

	/**
	 * The feature id for the '<em><b>Data Dictionary</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_TYPE__DATA_DICTIONARY = DATA_TYPE__DATA_DICTIONARY;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_TYPE__KIND = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Schema Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Removal Date Registration Status</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_TYPE___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN = DATA_TYPE___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN;

	/**
	 * The operation id for the '<em>Name First Letter Uppercase</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_TYPE___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN = DATA_TYPE___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN;

	/**
	 * The number of operations of the '<em>Schema Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_TYPE_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iso20022.RegistrationStatus <em>Registration Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso20022.RegistrationStatus
	 * @see iso20022.impl.Iso20022PackageImpl#getRegistrationStatus()
	 * @generated
	 */
	int REGISTRATION_STATUS = 85;

	/**
	 * The meta object id for the '{@link iso20022.Aggregation <em>Aggregation</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso20022.Aggregation
	 * @see iso20022.impl.Iso20022PackageImpl#getAggregation()
	 * @generated
	 */
	int AGGREGATION = 86;

	/**
	 * The meta object id for the '{@link iso20022.DeliveryAssurance <em>Delivery Assurance</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso20022.DeliveryAssurance
	 * @see iso20022.impl.Iso20022PackageImpl#getDeliveryAssurance()
	 * @generated
	 */
	int DELIVERY_ASSURANCE = 87;

	/**
	 * The meta object id for the '{@link iso20022.Durability <em>Durability</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso20022.Durability
	 * @see iso20022.impl.Iso20022PackageImpl#getDurability()
	 * @generated
	 */
	int DURABILITY = 88;

	/**
	 * The meta object id for the '{@link iso20022.MessageCasting <em>Message Casting</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso20022.MessageCasting
	 * @see iso20022.impl.Iso20022PackageImpl#getMessageCasting()
	 * @generated
	 */
	int MESSAGE_CASTING = 89;

	/**
	 * The meta object id for the '{@link iso20022.MessageDeliveryOrder <em>Message Delivery Order</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso20022.MessageDeliveryOrder
	 * @see iso20022.impl.Iso20022PackageImpl#getMessageDeliveryOrder()
	 * @generated
	 */
	int MESSAGE_DELIVERY_ORDER = 90;

	/**
	 * The meta object id for the '{@link iso20022.MessageValidationLevel <em>Message Validation Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso20022.MessageValidationLevel
	 * @see iso20022.impl.Iso20022PackageImpl#getMessageValidationLevel()
	 * @generated
	 */
	int MESSAGE_VALIDATION_LEVEL = 91;

	/**
	 * The meta object id for the '{@link iso20022.MessageValidationOnOff <em>Message Validation On Off</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso20022.MessageValidationOnOff
	 * @see iso20022.impl.Iso20022PackageImpl#getMessageValidationOnOff()
	 * @generated
	 */
	int MESSAGE_VALIDATION_ON_OFF = 92;

	/**
	 * The meta object id for the '{@link iso20022.MessageValidationResults <em>Message Validation Results</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso20022.MessageValidationResults
	 * @see iso20022.impl.Iso20022PackageImpl#getMessageValidationResults()
	 * @generated
	 */
	int MESSAGE_VALIDATION_RESULTS = 93;

	/**
	 * The meta object id for the '{@link iso20022.ReceiverAsynchronicity <em>Receiver Asynchronicity</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso20022.ReceiverAsynchronicity
	 * @see iso20022.impl.Iso20022PackageImpl#getReceiverAsynchronicity()
	 * @generated
	 */
	int RECEIVER_ASYNCHRONICITY = 94;

	/**
	 * The meta object id for the '{@link iso20022.SenderAsynchronicity <em>Sender Asynchronicity</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso20022.SenderAsynchronicity
	 * @see iso20022.impl.Iso20022PackageImpl#getSenderAsynchronicity()
	 * @generated
	 */
	int SENDER_ASYNCHRONICITY = 95;

	/**
	 * The meta object id for the '{@link iso20022.ProcessContent <em>Process Content</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso20022.ProcessContent
	 * @see iso20022.impl.Iso20022PackageImpl#getProcessContent()
	 * @generated
	 */
	int PROCESS_CONTENT = 96;

	/**
	 * The meta object id for the '{@link iso20022.Namespace <em>Namespace</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso20022.Namespace
	 * @see iso20022.impl.Iso20022PackageImpl#getNamespace()
	 * @generated
	 */
	int NAMESPACE = 97;

	/**
	 * The meta object id for the '{@link iso20022.SchemaTypeKind <em>Schema Type Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso20022.SchemaTypeKind
	 * @see iso20022.impl.Iso20022PackageImpl#getSchemaTypeKind()
	 * @generated
	 */
	int SCHEMA_TYPE_KIND = 98;

	/**
	 * The meta object id for the '{@link iso20022.ISO20022Version <em>ISO20022 Version</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iso20022.ISO20022Version
	 * @see iso20022.impl.Iso20022PackageImpl#getISO20022Version()
	 * @generated
	 */
	int ISO20022_VERSION = 99;


	/**
	 * Returns the meta object for class '{@link iso20022.Address <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address</em>'.
	 * @see iso20022.Address
	 * @generated
	 */
	EClass getAddress();

	/**
	 * Returns the meta object for the reference list '{@link iso20022.Address#getBroadCastList <em>Broad Cast List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Broad Cast List</em>'.
	 * @see iso20022.Address#getBroadCastList()
	 * @see #getAddress()
	 * @generated
	 */
	EReference getAddress_BroadCastList();

	/**
	 * Returns the meta object for the reference '{@link iso20022.Address#getEndpoint <em>Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Endpoint</em>'.
	 * @see iso20022.Address#getEndpoint()
	 * @see #getAddress()
	 * @generated
	 */
	EReference getAddress_Endpoint();

	/**
	 * Returns the meta object for class '{@link iso20022.ModelEntity <em>Model Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Entity</em>'.
	 * @see iso20022.ModelEntity
	 * @generated
	 */
	EClass getModelEntity();

	/**
	 * Returns the meta object for the reference list '{@link iso20022.ModelEntity#getNextVersions <em>Next Versions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Next Versions</em>'.
	 * @see iso20022.ModelEntity#getNextVersions()
	 * @see #getModelEntity()
	 * @generated
	 */
	EReference getModelEntity_NextVersions();

	/**
	 * Returns the meta object for the reference '{@link iso20022.ModelEntity#getPreviousVersion <em>Previous Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Previous Version</em>'.
	 * @see iso20022.ModelEntity#getPreviousVersion()
	 * @see #getModelEntity()
	 * @generated
	 */
	EReference getModelEntity_PreviousVersion();

	/**
	 * Returns the meta object for the attribute '{@link iso20022.ModelEntity#getObjectIdentifier <em>Object Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object Identifier</em>'.
	 * @see iso20022.ModelEntity#getObjectIdentifier()
	 * @see #getModelEntity()
	 * @generated
	 */
	EAttribute getModelEntity_ObjectIdentifier();

	/**
	 * Returns the meta object for class '{@link iso20022.BroadcastList <em>Broadcast List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Broadcast List</em>'.
	 * @see iso20022.BroadcastList
	 * @generated
	 */
	EClass getBroadcastList();

	/**
	 * Returns the meta object for the reference list '{@link iso20022.BroadcastList#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Address</em>'.
	 * @see iso20022.BroadcastList#getAddress()
	 * @see #getBroadcastList()
	 * @generated
	 */
	EReference getBroadcastList_Address();

	/**
	 * Returns the meta object for class '{@link iso20022.MessagingEndpoint <em>Messaging Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Messaging Endpoint</em>'.
	 * @see iso20022.MessagingEndpoint
	 * @generated
	 */
	EClass getMessagingEndpoint();

	/**
	 * Returns the meta object for the container reference '{@link iso20022.MessagingEndpoint#getTransportSystem <em>Transport System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Transport System</em>'.
	 * @see iso20022.MessagingEndpoint#getTransportSystem()
	 * @see #getMessagingEndpoint()
	 * @generated
	 */
	EReference getMessagingEndpoint_TransportSystem();

	/**
	 * Returns the meta object for the reference list '{@link iso20022.MessagingEndpoint#getReceivedMessage <em>Received Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Received Message</em>'.
	 * @see iso20022.MessagingEndpoint#getReceivedMessage()
	 * @see #getMessagingEndpoint()
	 * @generated
	 */
	EReference getMessagingEndpoint_ReceivedMessage();

	/**
	 * Returns the meta object for the reference list '{@link iso20022.MessagingEndpoint#getSentMessage <em>Sent Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sent Message</em>'.
	 * @see iso20022.MessagingEndpoint#getSentMessage()
	 * @see #getMessagingEndpoint()
	 * @generated
	 */
	EReference getMessagingEndpoint_SentMessage();

	/**
	 * Returns the meta object for the reference list '{@link iso20022.MessagingEndpoint#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Location</em>'.
	 * @see iso20022.MessagingEndpoint#getLocation()
	 * @see #getMessagingEndpoint()
	 * @generated
	 */
	EReference getMessagingEndpoint_Location();

	/**
	 * Returns the meta object for class '{@link iso20022.MessageTransportSystem <em>Message Transport System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Transport System</em>'.
	 * @see iso20022.MessageTransportSystem
	 * @generated
	 */
	EClass getMessageTransportSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link iso20022.MessageTransportSystem#getEndpoint <em>Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Endpoint</em>'.
	 * @see iso20022.MessageTransportSystem#getEndpoint()
	 * @see #getMessageTransportSystem()
	 * @generated
	 */
	EReference getMessageTransportSystem_Endpoint();

	/**
	 * Returns the meta object for class '{@link iso20022.TransportMessage <em>Transport Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transport Message</em>'.
	 * @see iso20022.TransportMessage
	 * @generated
	 */
	EClass getTransportMessage();

	/**
	 * Returns the meta object for the reference '{@link iso20022.TransportMessage#getSender <em>Sender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sender</em>'.
	 * @see iso20022.TransportMessage#getSender()
	 * @see #getTransportMessage()
	 * @generated
	 */
	EReference getTransportMessage_Sender();

	/**
	 * Returns the meta object for the reference '{@link iso20022.TransportMessage#getMessageInstance <em>Message Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Message Instance</em>'.
	 * @see iso20022.TransportMessage#getMessageInstance()
	 * @see #getTransportMessage()
	 * @generated
	 */
	EReference getTransportMessage_MessageInstance();

	/**
	 * Returns the meta object for the reference list '{@link iso20022.TransportMessage#getReceiver <em>Receiver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Receiver</em>'.
	 * @see iso20022.TransportMessage#getReceiver()
	 * @see #getTransportMessage()
	 * @generated
	 */
	EReference getTransportMessage_Receiver();

	/**
	 * Returns the meta object for the '{@link iso20022.TransportMessage#sameMessageTransportSystem(java.util.Map, org.eclipse.emf.common.util.DiagnosticChain) <em>Same Message Transport System</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Same Message Transport System</em>' operation.
	 * @see iso20022.TransportMessage#sameMessageTransportSystem(java.util.Map, org.eclipse.emf.common.util.DiagnosticChain)
	 * @generated
	 */
	EOperation getTransportMessage__SameMessageTransportSystem__Map_DiagnosticChain();

	/**
	 * Returns the meta object for class '{@link iso20022.MessageInstance <em>Message Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Instance</em>'.
	 * @see iso20022.MessageInstance
	 * @generated
	 */
	EClass getMessageInstance();

	/**
	 * Returns the meta object for the reference '{@link iso20022.MessageInstance#getSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Specification</em>'.
	 * @see iso20022.MessageInstance#getSpecification()
	 * @see #getMessageInstance()
	 * @generated
	 */
	EReference getMessageInstance_Specification();

	/**
	 * Returns the meta object for the reference list '{@link iso20022.MessageInstance#getTransportMessage <em>Transport Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transport Message</em>'.
	 * @see iso20022.MessageInstance#getTransportMessage()
	 * @see #getMessageInstance()
	 * @generated
	 */
	EReference getMessageInstance_TransportMessage();

	/**
	 * Returns the meta object for class '{@link iso20022.SyntaxMessageScheme <em>Syntax Message Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Syntax Message Scheme</em>'.
	 * @see iso20022.SyntaxMessageScheme
	 * @generated
	 */
	EClass getSyntaxMessageScheme();

	/**
	 * Returns the meta object for the reference '{@link iso20022.SyntaxMessageScheme#getMessageDefinitionTrace <em>Message Definition Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Message Definition Trace</em>'.
	 * @see iso20022.SyntaxMessageScheme#getMessageDefinitionTrace()
	 * @see #getSyntaxMessageScheme()
	 * @generated
	 */
	EReference getSyntaxMessageScheme_MessageDefinitionTrace();

	/**
	 * Returns the meta object for class '{@link iso20022.TopLevelCatalogueEntry <em>Top Level Catalogue Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Top Level Catalogue Entry</em>'.
	 * @see iso20022.TopLevelCatalogueEntry
	 * @generated
	 */
	EClass getTopLevelCatalogueEntry();

	/**
	 * Returns the meta object for the container reference '{@link iso20022.TopLevelCatalogueEntry#getBusinessProcessCatalogue <em>Business Process Catalogue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Business Process Catalogue</em>'.
	 * @see iso20022.TopLevelCatalogueEntry#getBusinessProcessCatalogue()
	 * @see #getTopLevelCatalogueEntry()
	 * @generated
	 */
	EReference getTopLevelCatalogueEntry_BusinessProcessCatalogue();

	/**
	 * Returns the meta object for class '{@link iso20022.RepositoryConcept <em>Repository Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repository Concept</em>'.
	 * @see iso20022.RepositoryConcept
	 * @generated
	 */
	EClass getRepositoryConcept();

	/**
	 * Returns the meta object for the attribute '{@link iso20022.RepositoryConcept#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see iso20022.RepositoryConcept#getName()
	 * @see #getRepositoryConcept()
	 * @generated
	 */
	EAttribute getRepositoryConcept_Name();

	/**
	 * Returns the meta object for the attribute '{@link iso20022.RepositoryConcept#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Definition</em>'.
	 * @see iso20022.RepositoryConcept#getDefinition()
	 * @see #getRepositoryConcept()
	 * @generated
	 */
	EAttribute getRepositoryConcept_Definition();

	/**
	 * Returns the meta object for the containment reference list '{@link iso20022.RepositoryConcept#getSemanticMarkup <em>Semantic Markup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Semantic Markup</em>'.
	 * @see iso20022.RepositoryConcept#getSemanticMarkup()
	 * @see #getRepositoryConcept()
	 * @generated
	 */
	EReference getRepositoryConcept_SemanticMarkup();

	/**
	 * Returns the meta object for the containment reference list '{@link iso20022.RepositoryConcept#getDoclet <em>Doclet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Doclet</em>'.
	 * @see iso20022.RepositoryConcept#getDoclet()
	 * @see #getRepositoryConcept()
	 * @generated
	 */
	EReference getRepositoryConcept_Doclet();

	/**
	 * Returns the meta object for the attribute list '{@link iso20022.RepositoryConcept#getExample <em>Example</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Example</em>'.
	 * @see iso20022.RepositoryConcept#getExample()
	 * @see #getRepositoryConcept()
	 * @generated
	 */
	EAttribute getRepositoryConcept_Example();

	/**
	 * Returns the meta object for the containment reference list '{@link iso20022.RepositoryConcept#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraint</em>'.
	 * @see iso20022.RepositoryConcept#getConstraint()
	 * @see #getRepositoryConcept()
	 * @generated
	 */
	EReference getRepositoryConcept_Constraint();

	/**
	 * Returns the meta object for the attribute '{@link iso20022.RepositoryConcept#getRegistrationStatus <em>Registration Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Registration Status</em>'.
	 * @see iso20022.RepositoryConcept#getRegistrationStatus()
	 * @see #getRepositoryConcept()
	 * @generated
	 */
	EAttribute getRepositoryConcept_RegistrationStatus();

	/**
	 * Returns the meta object for the attribute '{@link iso20022.RepositoryConcept#getRemovalDate <em>Removal Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Removal Date</em>'.
	 * @see iso20022.RepositoryConcept#getRemovalDate()
	 * @see #getRepositoryConcept()
	 * @generated
	 */
	EAttribute getRepositoryConcept_RemovalDate();

	/**
	 * Returns the meta object for the '{@link iso20022.RepositoryConcept#RemovalDateRegistrationStatus(java.util.Map, org.eclipse.emf.common.util.DiagnosticChain) <em>Removal Date Registration Status</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Removal Date Registration Status</em>' operation.
	 * @see iso20022.RepositoryConcept#RemovalDateRegistrationStatus(java.util.Map, org.eclipse.emf.common.util.DiagnosticChain)
	 * @generated
	 */
	EOperation getRepositoryConcept__RemovalDateRegistrationStatus__Map_DiagnosticChain();

	/**
	 * Returns the meta object for the '{@link iso20022.RepositoryConcept#NameFirstLetterUppercase(java.util.Map, org.eclipse.emf.common.util.DiagnosticChain) <em>Name First Letter Uppercase</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Name First Letter Uppercase</em>' operation.
	 * @see iso20022.RepositoryConcept#NameFirstLetterUppercase(java.util.Map, org.eclipse.emf.common.util.DiagnosticChain)
	 * @generated
	 */
	EOperation getRepositoryConcept__NameFirstLetterUppercase__Map_DiagnosticChain();

	/**
	 * Returns the meta object for class '{@link iso20022.SemanticMarkup <em>Semantic Markup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Semantic Markup</em>'.
	 * @see iso20022.SemanticMarkup
	 * @generated
	 */
	EClass getSemanticMarkup();

	/**
	 * Returns the meta object for the attribute '{@link iso20022.SemanticMarkup#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see iso20022.SemanticMarkup#getType()
	 * @see #getSemanticMarkup()
	 * @generated
	 */
	EAttribute getSemanticMarkup_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link iso20022.SemanticMarkup#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see iso20022.SemanticMarkup#getElements()
	 * @see #getSemanticMarkup()
	 * @generated
	 */
	EReference getSemanticMarkup_Elements();

	/**
	 * Returns the meta object for class '{@link iso20022.SemanticMarkupElement <em>Semantic Markup Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Semantic Markup Element</em>'.
	 * @see iso20022.SemanticMarkupElement
	 * @generated
	 */
	EClass getSemanticMarkupElement();

	/**
	 * Returns the meta object for the attribute '{@link iso20022.SemanticMarkupElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see iso20022.SemanticMarkupElement#getName()
	 * @see #getSemanticMarkupElement()
	 * @generated
	 */
	EAttribute getSemanticMarkupElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link iso20022.SemanticMarkupElement#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see iso20022.SemanticMarkupElement#getValue()
	 * @see #getSemanticMarkupElement()
	 * @generated
	 */
	EAttribute getSemanticMarkupElement_Value();

	/**
	 * Returns the meta object for class '{@link iso20022.Doclet <em>Doclet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Doclet</em>'.
	 * @see iso20022.Doclet
	 * @generated
	 */
	EClass getDoclet();

	/**
	 * Returns the meta object for the attribute '{@link iso20022.Doclet#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see iso20022.Doclet#getType()
	 * @see #getDoclet()
	 * @generated
	 */
	EAttribute getDoclet_Type();

	/**
	 * Returns the meta object for the attribute '{@link iso20022.Doclet#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see iso20022.Doclet#getContent()
	 * @see #getDoclet()
	 * @generated
	 */
	EAttribute getDoclet_Content();

	/**
	 * Returns the meta object for class '{@link iso20022.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see iso20022.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for the attribute '{@link iso20022.Constraint#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see iso20022.Constraint#getExpression()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_Expression();

	/**
	 * Returns the meta object for the attribute '{@link iso20022.Constraint#getExpressionLanguage <em>Expression Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression Language</em>'.
	 * @see iso20022.Constraint#getExpressionLanguage()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_ExpressionLanguage();

	/**
	 * Returns the meta object for the container reference '{@link iso20022.Constraint#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner</em>'.
	 * @see iso20022.Constraint#getOwner()
	 * @see #getConstraint()
	 * @generated
	 */
	EReference getConstraint_Owner();

	/**
	 * Returns the meta object for class '{@link iso20022.BusinessProcessCatalogue <em>Business Process Catalogue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Business Process Catalogue</em>'.
	 * @see iso20022.BusinessProcessCatalogue
	 * @generated
	 */
	EClass getBusinessProcessCatalogue();

	/**
	 * Returns the meta object for the container reference '{@link iso20022.BusinessProcessCatalogue#getRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Repository</em>'.
	 * @see iso20022.BusinessProcessCatalogue#getRepository()
	 * @see #getBusinessProcessCatalogue()
	 * @generated
	 */
	EReference getBusinessProcessCatalogue_Repository();

	/**
	 * Returns the meta object for the containment reference list '{@link iso20022.BusinessProcessCatalogue#getTopLevelCatalogueEntry <em>Top Level Catalogue Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Top Level Catalogue Entry</em>'.
	 * @see iso20022.BusinessProcessCatalogue#getTopLevelCatalogueEntry()
	 * @see #getBusinessProcessCatalogue()
	 * @generated
	 */
	EReference getBusinessProcessCatalogue_TopLevelCatalogueEntry();

	/**
	 * Returns the meta object for the '{@link iso20022.BusinessProcessCatalogue#EntriesHaveUniqueName(java.util.Map, org.eclipse.emf.common.util.DiagnosticChain) <em>Entries Have Unique Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Entries Have Unique Name</em>' operation.
	 * @see iso20022.BusinessProcessCatalogue#EntriesHaveUniqueName(java.util.Map, org.eclipse.emf.common.util.DiagnosticChain)
	 * @generated
	 */
	EOperation getBusinessProcessCatalogue__EntriesHaveUniqueName__Map_DiagnosticChain();

	/**
	 * Returns the meta object for class '{@link iso20022.Repository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repository</em>'.
	 * @see iso20022.Repository
	 * @generated
	 */
	EClass getRepository();

	/**
	 * Returns the meta object for the containment reference '{@link iso20022.Repository#getDataDictionary <em>Data Dictionary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Dictionary</em>'.
	 * @see iso20022.Repository#getDataDictionary()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_DataDictionary();

	/**
	 * Returns the meta object for the containment reference '{@link iso20022.Repository#getBusinessProcessCatalogue <em>Business Process Catalogue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Business Process Catalogue</em>'.
	 * @see iso20022.Repository#getBusinessProcessCatalogue()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_BusinessProcessCatalogue();

	/**
	 * Returns the meta object for class '{@link iso20022.DataDictionary <em>Data Dictionary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Dictionary</em>'.
	 * @see iso20022.DataDictionary
	 * @generated
	 */
	EClass getDataDictionary();

	/**
	 * Returns the meta object for the containment reference list '{@link iso20022.DataDictionary#getTopLevelDictionaryEntry <em>Top Level Dictionary Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Top Level Dictionary Entry</em>'.
	 * @see iso20022.DataDictionary#getTopLevelDictionaryEntry()
	 * @see #getDataDictionary()
	 * @generated
	 */
	EReference getDataDictionary_TopLevelDictionaryEntry();

	/**
	 * Returns the meta object for the container reference '{@link iso20022.DataDictionary#getRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Repository</em>'.
	 * @see iso20022.DataDictionary#getRepository()
	 * @see #getDataDictionary()
	 * @generated
	 */
	EReference getDataDictionary_Repository();

	/**
	 * Returns the meta object for the '{@link iso20022.DataDictionary#EntriesHaveUniqueName(java.util.Map, org.eclipse.emf.common.util.DiagnosticChain) <em>Entries Have Unique Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Entries Have Unique Name</em>' operation.
	 * @see iso20022.DataDictionary#EntriesHaveUniqueName(java.util.Map, org.eclipse.emf.common.util.DiagnosticChain)
	 * @generated
	 */
	EOperation getDataDictionary__EntriesHaveUniqueName__Map_DiagnosticChain();

	/**
	 * Returns the meta object for class '{@link iso20022.TopLevelDictionaryEntry <em>Top Level Dictionary Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Top Level Dictionary Entry</em>'.
	 * @see iso20022.TopLevelDictionaryEntry
	 * @generated
	 */
	EClass getTopLevelDictionaryEntry();

	/**
	 * Returns the meta object for the container reference '{@link iso20022.TopLevelDictionaryEntry#getDataDictionary <em>Data Dictionary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Data Dictionary</em>'.
	 * @see iso20022.TopLevelDictionaryEntry#getDataDictionary()
	 * @see #getTopLevelDictionaryEntry()
	 * @generated
	 */
	EReference getTopLevelDictionaryEntry_DataDictionary();

	/**
	 * Returns the meta object for class '{@link iso20022.MessageDefinition <em>Message Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Definition</em>'.
	 * @see iso20022.MessageDefinition
	 * @generated
	 */
	EClass getMessageDefinition();

	/**
	 * Returns the meta object for the reference list '{@link iso20022.MessageDefinition#getMessageSet <em>Message Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Message Set</em>'.
	 * @see iso20022.MessageDefinition#getMessageSet()
	 * @see #getMessageDefinition()
	 * @generated
	 */
	EReference getMessageDefinition_MessageSet();

	/**
	 * Returns the meta object for the attribute '{@link iso20022.MessageDefinition#getXmlName <em>Xml Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xml Name</em>'.
	 * @see iso20022.MessageDefinition#getXmlName()
	 * @see #getMessageDefinition()
	 * @generated
	 */
	EAttribute getMessageDefinition_XmlName();

	/**
	 * Returns the meta object for the attribute '{@link iso20022.MessageDefinition#getXmlTag <em>Xml Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xml Tag</em>'.
	 * @see iso20022.MessageDefinition#getXmlTag()
	 * @see #getMessageDefinition()
	 * @generated
	 */
	EAttribute getMessageDefinition_XmlTag();

	/**
	 * Returns the meta object for the container reference '{@link iso20022.MessageDefinition#getBusinessArea <em>Business Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Business Area</em>'.
	 * @see iso20022.MessageDefinition#getBusinessArea()
	 * @see #getMessageDefinition()
	 * @generated
	 */
	EReference getMessageDefinition_BusinessArea();

	/**
	 * Returns the meta object for the containment reference list '{@link iso20022.MessageDefinition#getXors <em>Xors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Xors</em>'.
	 * @see iso20022.MessageDefinition#getXors()
	 * @see #getMessageDefinition()
	 * @generated
	 */
	EReference getMessageDefinition_Xors();

	/**
	 * Returns the meta object for the attribute '{@link iso20022.MessageDefinition#getRootElement <em>Root Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Root Element</em>'.
	 * @see iso20022.MessageDefinition#getRootElement()
	 * @see #getMessageDefinition()
	 * @generated
	 */
	EAttribute getMessageDefinition_RootElement();

	/**
	 * Returns the meta object for the containment reference list '{@link iso20022.MessageDefinition#getMessageBuildingBlock <em>Message Building Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Message Building Block</em>'.
	 * @see iso20022.MessageDefinition#getMessageBuildingBlock()
	 * @see #getMessageDefinition()
	 * @generated
	 */
	EReference getMessageDefinition_MessageBuildingBlock();

	/**
	 * Returns the meta object for the reference list '{@link iso20022.MessageDefinition#getChoreography <em>Choreography</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Choreography</em>'.
	 * @see iso20022.MessageDefinition#getChoreography()
	 * @see #getMessageDefinition()
	 * @generated
	 */
	EReference getMessageDefinition_Choreography();

	/**
	 * Returns the meta object for the reference list '{@link iso20022.MessageDefinition#getTrace <em>Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Trace</em>'.
	 * @see iso20022.MessageDefinition#getTrace()
	 * @see #getMessageDefinition()
	 * @generated
	 */
	EReference getMessageDefinition_Trace();

	/**
	 * Returns the meta object for the containment reference '{@link iso20022.MessageDefinition#getMessageDefinitionIdentifier <em>Message Definition Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Message Definition Identifier</em>'.
	 * @see iso20022.MessageDefinition#getMessageDefinitionIdentifier()
	 * @see #getMessageDefinition()
	 * @generated
	 */
	EReference getMessageDefinition_MessageDefinitionIdentifier();

	/**
	 * Returns the meta object for the reference list '{@link iso20022.MessageDefinition#getDerivation <em>Derivation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Derivation</em>'.
	 * @see iso20022.MessageDefinition#getDerivation()
	 * @see #getMessageDefinition()
	 * @generated
	 */
	EReference getMessageDefinition_Derivation();

	/**
	 * Returns the meta object for the '{@link iso20022.MessageDefinition#BusinessAreaNameMatch(java.util.Map, org.eclipse.emf.common.util.DiagnosticChain) <em>Business Area Name Match</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Business Area Name Match</em>' operation.
	 * @see iso20022.MessageDefinition#BusinessAreaNameMatch(java.util.Map, org.eclipse.emf.common.util.DiagnosticChain)
	 * @generated
	 */
	EOperation getMessageDefinition__BusinessAreaNameMatch__Map_DiagnosticChain();

	/**
	 * Returns the meta object for class '{@link iso20022.RepositoryType <em>Repository Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repository Type</em>'.
	 * @see iso20022.RepositoryType
	 * @generated
	 */
	EClass getRepositoryType();

	/**
	 * Returns the meta object for class '{@link iso20022.MessageSet <em>Message Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Set</em>'.
	 * @see iso20022.MessageSet
	 * @generated
	 */
	EClass getMessageSet();

	/**
	 * Returns the meta object for the reference list '{@link iso20022.MessageSet#getGeneratedSyntax <em>Generated Syntax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Generated Syntax</em>'.
	 * @see iso20022.MessageSet#getGeneratedSyntax()
	 * @see #getMessageSet()
	 * @generated
	 */
	EReference getMessageSet_GeneratedSyntax();

	/**
	 * Returns the meta object for the reference list '{@link iso20022.MessageSet#getValidEncoding <em>Valid Encoding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Valid Encoding</em>'.
	 * @see iso20022.MessageSet#getValidEncoding()
	 * @see #getMessageSet()
	 * @generated
	 */
	EReference getMessageSet_ValidEncoding();

	/**
	 * Returns the meta object for the reference list '{@link iso20022.MessageSet#getMessageDefinition <em>Message Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Message Definition</em>'.
	 * @see iso20022.MessageSet#getMessageDefinition()
	 * @see #getMessageSet()
	 * @generated
	 */
	EReference getMessageSet_MessageDefinition();

	/**
	 * Returns the meta object for the '{@link iso20022.MessageSet#GeneratedSyntaxDerivation(java.util.Map, org.eclipse.emf.common.util.DiagnosticChain) <em>Generated Syntax Derivation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generated Syntax Derivation</em>' operation.
	 * @see iso20022.MessageSet#GeneratedSyntaxDerivation(java.util.Map, org.eclipse.emf.common.util.DiagnosticChain)
	 * @generated
	 */
	EOperation getMessageSet__GeneratedSyntaxDerivation__Map_DiagnosticChain();

	/**
	 * Returns the meta object for class '{@link iso20022.Syntax <em>Syntax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Syntax</em>'.
	 * @see iso20022.Syntax
	 * @generated
	 */
	EClass getSyntax();

	/**
	 * Returns the meta object for the reference list '{@link iso20022.Syntax#getPossibleEncodings <em>Possible Encodings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Possible Encodings</em>'.
	 * @see iso20022.Syntax#getPossibleEncodings()
	 * @see #getSyntax()
	 * @generated
	 */
	EReference getSyntax_PossibleEncodings();

	/**
	 * Returns the meta object for the reference list '{@link iso20022.Syntax#getGeneratedFor <em>Generated For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Generated For</em>'.
	 * @see iso20022.Syntax#getGeneratedFor()
	 * @see #getSyntax()
	 * @generated
	 */
	EReference getSyntax_GeneratedFor();

	/**
	 * Returns the meta object for the '{@link iso20022.Syntax#GeneratedForDerivation(java.util.Map, org.eclipse.emf.common.util.DiagnosticChain) <em>Generated For Derivation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generated For Derivation</em>' operation.
	 * @see iso20022.Syntax#GeneratedForDerivation(java.util.Map, org.eclipse.emf.common.util.DiagnosticChain)
	 * @generated
	 */
	EOperation getSyntax__GeneratedForDerivation__Map_DiagnosticChain();

	/**
	 * Returns the meta object for class '{@link iso20022.Encoding <em>Encoding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Encoding</em>'.
	 * @see iso20022.Encoding
	 * @generated
	 */
	EClass getEncoding();

	/**
	 * Returns the meta object for the reference list '{@link iso20022.Encoding#getMessageSet <em>Message Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Message Set</em>'.
	 * @see iso20022.Encoding#getMessageSet()
	 * @see #getEncoding()
	 * @generated
	 */
	EReference getEncoding_MessageSet();

	/**
	 * Returns the meta object for the reference '{@link iso20022.Encoding#getSyntax <em>Syntax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Syntax</em>'.
	 * @see iso20022.Encoding#getSyntax()
	 * @see #getEncoding()
	 * @generated
	 */
	EReference getEncoding_Syntax();

	/**
	 * Returns the meta object for class '{@link iso20022.BusinessArea <em>Business Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Business Area</em>'.
	 * @see iso20022.BusinessArea
	 * @generated
	 */
	EClass getBusinessArea();

	/**
	 * Returns the meta object for the attribute '{@link iso20022.BusinessArea#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see iso20022.BusinessArea#getCode()
	 * @see #getBusinessArea()
	 * @generated
	 */
	EAttribute getBusinessArea_Code();

	/**
	 * Returns the meta object for the containment reference list '{@link iso20022.BusinessArea#getMessageDefinition <em>Message Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Message Definition</em>'.
	 * @see iso20022.BusinessArea#getMessageDefinition()
	 * @see #getBusinessArea()
	 * @generated
	 */
	EReference getBusinessArea_MessageDefinition();

	/**
	 * Returns the meta object for class '{@link iso20022.Xor <em>Xor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xor</em>'.
	 * @see iso20022.Xor
	 * @generated
	 */
	EClass getXor();

	/**
	 * Returns the meta object for the reference list '{@link iso20022.Xor#getImpactedElements <em>Impacted Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Impacted Elements</em>'.
	 * @see iso20022.Xor#getImpactedElements()
	 * @see #getXor()
	 * @generated
	 */
	EReference getXor_ImpactedElements();

	/**
	 * Returns the meta object for the container reference '{@link iso20022.Xor#getMessageComponent <em>Message Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Message Component</em>'.
	 * @see iso20022.Xor#getMessageComponent()
	 * @see #getXor()
	 * @generated
	 */
	EReference getXor_MessageComponent();

	/**
	 * Returns the meta object for the reference list '{@link iso20022.Xor#getImpactedMessageBuildingBlocks <em>Impacted Message Building Blocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Impacted Message Building Blocks</em>'.
	 * @see iso20022.Xor#getImpactedMessageBuildingBlocks()
	 * @see #getXor()
	 * @generated
	 */
	EReference getXor_ImpactedMessageBuildingBlocks();

	/**
	 * Returns the meta object for the container reference '{@link iso20022.Xor#getMessageDefinition <em>Message Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Message Definition</em>'.
	 * @see iso20022.Xor#getMessageDefinition()
	 * @see #getXor()
	 * @generated
	 */
	EReference getXor_MessageDefinition();

	/**
	 * Returns the meta object for class '{@link iso20022.MessageElement <em>Message Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Element</em>'.
	 * @see iso20022.MessageElement
	 * @generated
	 */
	EClass getMessageElement();

	/**
	 * Returns the meta object for the attribute '{@link iso20022.MessageElement#isIsTechnical <em>Is Technical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Technical</em>'.
	 * @see iso20022.MessageElement#isIsTechnical()
	 * @see #getMessageElement()
	 * @generated
	 */
	EAttribute getMessageElement_IsTechnical();

	/**
	 * Returns the meta object for the reference '{@link iso20022.MessageElement#getBusinessComponentTrace <em>Business Component Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Business Component Trace</em>'.
	 * @see iso20022.MessageElement#getBusinessComponentTrace()
	 * @see #getMessageElement()
	 * @generated
	 */
	EReference getMessageElement_BusinessComponentTrace();

	/**
	 * Returns the meta object for the reference '{@link iso20022.MessageElement#getBusinessElementTrace <em>Business Element Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Business Element Trace</em>'.
	 * @see iso20022.MessageElement#getBusinessElementTrace()
	 * @see #getMessageElement()
	 * @generated
	 */
	EReference getMessageElement_BusinessElementTrace();

	/**
	 * Returns the meta object for the container reference '{@link iso20022.MessageElement#getComponentContext <em>Component Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Component Context</em>'.
	 * @see iso20022.MessageElement#getComponentContext()
	 * @see #getMessageElement()
	 * @generated
	 */
	EReference getMessageElement_ComponentContext();

	/**
	 * Returns the meta object for the attribute '{@link iso20022.MessageElement#isIsDerived <em>Is Derived</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Derived</em>'.
	 * @see iso20022.MessageElement#isIsDerived()
	 * @see #getMessageElement()
	 * @generated
	 */
	EAttribute getMessageElement_IsDerived();

	/**
	 * Returns the meta object for the '{@link iso20022.MessageElement#NoMoreThanOneTrace(java.util.Map, org.eclipse.emf.common.util.DiagnosticChain) <em>No More Than One Trace</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>No More Than One Trace</em>' operation.
	 * @see iso20022.MessageElement#NoMoreThanOneTrace(java.util.Map, org.eclipse.emf.common.util.DiagnosticChain)
	 * @generated
	 */
	EOperation getMessageElement__NoMoreThanOneTrace__Map_DiagnosticChain();

	/**
	 * Returns the meta object for the '{@link iso20022.MessageElement#CardinalityAlignment(java.util.Map, org.eclipse.emf.common.util.DiagnosticChain) <em>Cardinality Alignment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Cardinality Alignment</em>' operation.
	 * @see iso20022.MessageElement#CardinalityAlignment(java.util.Map, org.eclipse.emf.common.util.DiagnosticChain)
	 * @generated
	 */
	EOperation getMessageElement__CardinalityAlignment__Map_DiagnosticChain();

	/**
	 * Returns the meta object for class '{@link iso20022.MessageConstruct <em>Message Construct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Construct</em>'.
	 * @see iso20022.MessageConstruct
	 * @generated
	 */
	EClass getMessageConstruct();

	/**
	 * Returns the meta object for the attribute '{@link iso20022.MessageConstruct#getXmlTag <em>Xml Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xml Tag</em>'.
	 * @see iso20022.MessageConstruct#getXmlTag()
	 * @see #getMessageConstruct()
	 * @generated
	 */
	EAttribute getMessageConstruct_XmlTag();

	/**
	 * Returns the meta object for the reference '{@link iso20022.MessageConstruct#getXmlMemberType <em>Xml Member Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Xml Member Type</em>'.
	 * @see iso20022.MessageConstruct#getXmlMemberType()
	 * @see #getMessageConstruct()
	 * @generated
	 */
	EReference getMessageConstruct_XmlMemberType();

	/**
	 * Returns the meta object for class '{@link iso20022.Construct <em>Construct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Construct</em>'.
	 * @see iso20022.Construct
	 * @generated
	 */
	EClass getConstruct();

	/**
	 * Returns the meta object for the reference '{@link iso20022.Construct#getMemberType <em>Member Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Member Type</em>'.
	 * @see iso20022.Construct#getMemberType()
	 * @see #getConstruct()
	 * @generated
	 */
	EReference getConstruct_MemberType();

	/**
	 * Returns the meta object for class '{@link iso20022.MultiplicityEntity <em>Multiplicity Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiplicity Entity</em>'.
	 * @see iso20022.MultiplicityEntity
	 * @generated
	 */
	EClass getMultiplicityEntity();

	/**
	 * Returns the meta object for the attribute '{@link iso20022.MultiplicityEntity#getMaxOccurs <em>Max Occurs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Occurs</em>'.
	 * @see iso20022.MultiplicityEntity#getMaxOccurs()
	 * @see #getMultiplicityEntity()
	 * @generated
	 */
	EAttribute getMultiplicityEntity_MaxOccurs();

	/**
	 * Returns the meta object for the attribute '{@link iso20022.MultiplicityEntity#getMinOccurs <em>Min Occurs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Occurs</em>'.
	 * @see iso20022.MultiplicityEntity#getMinOccurs()
	 * @see #getMultiplicityEntity()
	 * @generated
	 */
	EAttribute getMultiplicityEntity_MinOccurs();

	/**
	 * Returns the meta object for class '{@link iso20022.LogicalType <em>Logical Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logical Type</em>'.
	 * @see iso20022.LogicalType
	 * @generated
	 */
	EClass getLogicalType();

	/**
	 * Returns the meta object for class '{@link iso20022.MessageConcept <em>Message Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Concept</em>'.
	 * @see iso20022.MessageConcept
	 * @generated
	 */
	EClass getMessageConcept();

	/**
	 * Returns the meta object for class '{@link iso20022.BusinessComponent <em>Business Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Business Component</em>'.
	 * @see iso20022.BusinessComponent
	 * @generated
	 */
	EClass getBusinessComponent();

	/**
	 * Returns the meta object for the reference list '{@link iso20022.BusinessComponent#getSubType <em>Sub Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sub Type</em>'.
	 * @see iso20022.BusinessComponent#getSubType()
	 * @see #getBusinessComponent()
	 * @generated
	 */
	EReference getBusinessComponent_SubType();

	/**
	 * Returns the meta object for the reference '{@link iso20022.BusinessComponent#getSuperType <em>Super Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Super Type</em>'.
	 * @see iso20022.BusinessComponent#getSuperType()
	 * @see #getBusinessComponent()
	 * @generated
	 */
	EReference getBusinessComponent_SuperType();

	/**
	 * Returns the meta object for the containment reference list '{@link iso20022.BusinessComponent#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Element</em>'.
	 * @see iso20022.BusinessComponent#getElement()
	 * @see #getBusinessComponent()
	 * @generated
	 */
	EReference getBusinessComponent_Element();

	/**
	 * Returns the meta object for the reference list '{@link iso20022.BusinessComponent#getDerivationComponent <em>Derivation Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Derivation Component</em>'.
	 * @see iso20022.BusinessComponent#getDerivationComponent()
	 * @see #getBusinessComponent()
	 * @generated
	 */
	EReference getBusinessComponent_DerivationComponent();

	/**
	 * Returns the meta object for the reference list '{@link iso20022.BusinessComponent#getAssociationDomain <em>Association Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Association Domain</em>'.
	 * @see iso20022.BusinessComponent#getAssociationDomain()
	 * @see #getBusinessComponent()
	 * @generated
	 */
	EReference getBusinessComponent_AssociationDomain();

	/**
	 * Returns the meta object for the reference list '{@link iso20022.BusinessComponent#getDerivationElement <em>Derivation Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Derivation Element</em>'.
	 * @see iso20022.BusinessComponent#getDerivationElement()
	 * @see #getBusinessComponent()
	 * @generated
	 */
	EReference getBusinessComponent_DerivationElement();

	/**
	 * Returns the meta object for the '{@link iso20022.BusinessComponent#BusinessElementsHaveUniqueNames(java.util.Map, org.eclipse.emf.common.util.DiagnosticChain) <em>Business Elements Have Unique Names</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Business Elements Have Unique Names</em>' operation.
	 * @see iso20022.BusinessComponent#BusinessElementsHaveUniqueNames(java.util.Map, org.eclipse.emf.common.util.DiagnosticChain)
	 * @generated
	 */
	EOperation getBusinessComponent__BusinessElementsHaveUniqueNames__Map_DiagnosticChain();

	/**
	 * Returns the meta object for class '{@link iso20022.BusinessElementType <em>Business Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Business Element Type</em>'.
	 * @see iso20022.BusinessElementType
	 * @generated
	 */
	EClass getBusinessElementType();

	/**
	 * Returns the meta object for class '{@link iso20022.BusinessConcept <em>Business Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Business Concept</em>'.
	 * @see iso20022.BusinessConcept
	 * @generated
	 */
	EClass getBusinessConcept();

	/**
	 * Returns the meta object for class '{@link iso20022.BusinessElement <em>Business Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Business Element</em>'.
	 * @see iso20022.BusinessElement
	 * @generated
	 */
	EClass getBusinessElement();

	/**
	 * Returns the meta object for the attribute '{@link iso20022.BusinessElement#isIsDerived <em>Is Derived</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Derived</em>'.
	 * @see iso20022.BusinessElement#isIsDerived()
	 * @see #getBusinessElement()
	 * @generated
	 */
	EAttribute getBusinessElement_IsDerived();

	/**
	 * Returns the meta object for the reference list '{@link iso20022.BusinessElement#getDerivation <em>Derivation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Derivation</em>'.
	 * @see iso20022.BusinessElement#getDerivation()
	 * @see #getBusinessElement()
	 * @generated
	 */
	EReference getBusinessElement_Derivation();

	/**
	 * Returns the meta object for the reference '{@link iso20022.BusinessElement#getBusinessElementType <em>Business Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Business Element Type</em>'.
	 * @see iso20022.BusinessElement#getBusinessElementType()
	 * @see #getBusinessElement()
	 * @generated
	 */
	EReference getBusinessElement_BusinessElementType();

	/**
	 * Returns the meta object for the container reference '{@link iso20022.BusinessElement#getElementContext <em>Element Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Element Context</em>'.
	 * @see iso20022.BusinessElement#getElementContext()
	 * @see #getBusinessElement()
	 * @generated
	 */
	EReference getBusinessElement_ElementContext();

	/**
	 * Returns the meta object for class '{@link iso20022.MessageComponentType <em>Message Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Component Type</em>'.
	 * @see iso20022.MessageComponentType
	 * @generated
	 */
	EClass getMessageComponentType();

	/**
	 * Returns the meta object for the reference list '{@link iso20022.MessageComponentType#getMessageBuildingBlock <em>Message Building Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Message Building Block</em>'.
	 * @see iso20022.MessageComponentType#getMessageBuildingBlock()
	 * @see #getMessageComponentType()
	 * @generated
	 */
	EReference getMessageComponentType_MessageBuildingBlock();

	/**
	 * Returns the meta object for the attribute '{@link iso20022.MessageComponentType#isIsTechnical <em>Is Technical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Technical</em>'.
	 * @see iso20022.MessageComponentType#isIsTechnical()
	 * @see #getMessageComponentType()
	 * @generated
	 */
	EAttribute getMessageComponentType_IsTechnical();

	/**
	 * Returns the meta object for the reference '{@link iso20022.MessageComponentType#getTrace <em>Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Trace</em>'.
	 * @see iso20022.MessageComponentType#getTrace()
	 * @see #getMessageComponentType()
	 * @generated
	 */
	EReference getMessageComponentType_Trace();

	/**
	 * Returns the meta object for class '{@link iso20022.MessageBuildingBlock <em>Message Building Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Building Block</em>'.
	 * @see iso20022.MessageBuildingBlock
	 * @generated
	 */
	EClass getMessageBuildingBlock();

	/**
	 * Returns the meta object for the reference '{@link iso20022.MessageBuildingBlock#getSimpleType <em>Simple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Simple Type</em>'.
	 * @see iso20022.MessageBuildingBlock#getSimpleType()
	 * @see #getMessageBuildingBlock()
	 * @generated
	 */
	EReference getMessageBuildingBlock_SimpleType();

	/**
	 * Returns the meta object for the reference '{@link iso20022.MessageBuildingBlock#getComplexType <em>Complex Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Complex Type</em>'.
	 * @see iso20022.MessageBuildingBlock#getComplexType()
	 * @see #getMessageBuildingBlock()
	 * @generated
	 */
	EReference getMessageBuildingBlock_ComplexType();

	/**
	 * Returns the meta object for the '{@link iso20022.MessageBuildingBlock#MessageBuildingBlockHasExactlyOneType(java.util.Map, org.eclipse.emf.common.util.DiagnosticChain) <em>Message Building Block Has Exactly One Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Message Building Block Has Exactly One Type</em>' operation.
	 * @see iso20022.MessageBuildingBlock#MessageBuildingBlockHasExactlyOneType(java.util.Map, org.eclipse.emf.common.util.DiagnosticChain)
	 * @generated
	 */
	EOperation getMessageBuildingBlock__MessageBuildingBlockHasExactlyOneType__Map_DiagnosticChain();

	/**
	 * Returns the meta object for class '{@link iso20022.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type</em>'.
	 * @see iso20022.DataType
	 * @generated
	 */
	EClass getDataType();

	/**
	 * Returns the meta object for class '{@link iso20022.BusinessAssociationEnd <em>Business Association End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Business Association End</em>'.
	 * @see iso20022.BusinessAssociationEnd
	 * @generated
	 */
	EClass getBusinessAssociationEnd();

	/**
	 * Returns the meta object for the reference '{@link iso20022.BusinessAssociationEnd#getOpposite <em>Opposite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Opposite</em>'.
	 * @see iso20022.BusinessAssociationEnd#getOpposite()
	 * @see #getBusinessAssociationEnd()
	 * @generated
	 */
	EReference getBusinessAssociationEnd_Opposite();

	/**
	 * Returns the meta object for the attribute '{@link iso20022.BusinessAssociationEnd#getAggregation <em>Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aggregation</em>'.
	 * @see iso20022.BusinessAssociationEnd#getAggregation()
	 * @see #getBusinessAssociationEnd()
	 * @generated
	 */
	EAttribute getBusinessAssociationEnd_Aggregation();

	/**
	 * Returns the meta object for the reference '{@link iso20022.BusinessAssociationEnd#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see iso20022.BusinessAssociationEnd#getType()
	 * @see #getBusinessAssociationEnd()
	 * @generated
	 */
	EReference getBusinessAssociationEnd_Type();

	/**
	 * Returns the meta object for the '{@link iso20022.BusinessAssociationEnd#AtMostOneAggregatedEnd(java.util.Map, org.eclipse.emf.common.util.DiagnosticChain) <em>At Most One Aggregated End</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>At Most One Aggregated End</em>' operation.
	 * @see iso20022.BusinessAssociationEnd#AtMostOneAggregatedEnd(java.util.Map, org.eclipse.emf.common.util.DiagnosticChain)
	 * @generated
	 */
	EOperation getBusinessAssociationEnd__AtMostOneAggregatedEnd__Map_DiagnosticChain();

	/**
	 * Returns the meta object for the '{@link iso20022.BusinessAssociationEnd#ContextConsistentWithType(java.util.Map, org.eclipse.emf.common.util.DiagnosticChain) <em>Context Consistent With Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Context Consistent With Type</em>' operation.
	 * @see iso20022.BusinessAssociationEnd#ContextConsistentWithType(java.util.Map, org.eclipse.emf.common.util.DiagnosticChain)
	 * @generated
	 */
	EOperation getBusinessAssociationEnd__ContextConsistentWithType__Map_DiagnosticChain();

	/**
	 * Returns the meta object for class '{@link iso20022.MessageElementContainer <em>Message Element Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Element Container</em>'.
	 * @see iso20022.MessageElementContainer
	 * @generated
	 */
	EClass getMessageElementContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link iso20022.MessageElementContainer#getMessageElement <em>Message Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Message Element</em>'.
	 * @see iso20022.MessageElementContainer#getMessageElement()
	 * @see #getMessageElementContainer()
	 * @generated
	 */
	EReference getMessageElementContainer_MessageElement();

	/**
	 * Returns the meta object for the '{@link iso20022.MessageElementContainer#MessageElementsHaveUniqueNames(java.util.Map, org.eclipse.emf.common.util.DiagnosticChain) <em>Message Elements Have Unique Names</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Message Elements Have Unique Names</em>' operation.
	 * @see iso20022.MessageElementContainer#MessageElementsHaveUniqueNames(java.util.Map, org.eclipse.emf.common.util.DiagnosticChain)
	 * @generated
	 */
	EOperation getMessageElementContainer__MessageElementsHaveUniqueNames__Map_DiagnosticChain();

	/**
	 * Returns the meta object for the '{@link iso20022.MessageElementContainer#technicalElement(java.util.Map, org.eclipse.emf.common.util.DiagnosticChain) <em>Technical Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Technical Element</em>' operation.
	 * @see iso20022.MessageElementContainer#technicalElement(java.util.Map, org.eclipse.emf.common.util.DiagnosticChain)
	 * @generated
	 */
	EOperation getMessageElementContainer__TechnicalElement__Map_DiagnosticChain();

	/**
	 * Returns the meta object for class '{@link iso20022.MessageComponent <em>Message Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Component</em>'.
	 * @see iso20022.MessageComponent
	 * @generated
	 */
	EClass getMessageComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link iso20022.MessageComponent#getXors <em>Xors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Xors</em>'.
	 * @see iso20022.MessageComponent#getXors()
	 * @see #getMessageComponent()
	 * @generated
	 */
	EReference getMessageComponent_Xors();

	/**
	 * Returns the meta object for class '{@link iso20022.MessageChoreography <em>Message Choreography</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Choreography</em>'.
	 * @see iso20022.MessageChoreography
	 * @generated
	 */
	EClass getMessageChoreography();

	/**
	 * Returns the meta object for the reference '{@link iso20022.MessageChoreography#getBusinessTransactionTrace <em>Business Transaction Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Business Transaction Trace</em>'.
	 * @see iso20022.MessageChoreography#getBusinessTransactionTrace()
	 * @see #getMessageChoreography()
	 * @generated
	 */
	EReference getMessageChoreography_BusinessTransactionTrace();

	/**
	 * Returns the meta object for the reference list '{@link iso20022.MessageChoreography#getMessageDefinition <em>Message Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Message Definition</em>'.
	 * @see iso20022.MessageChoreography#getMessageDefinition()
	 * @see #getMessageChoreography()
	 * @generated
	 */
	EReference getMessageChoreography_MessageDefinition();

	/**
	 * Returns the meta object for class '{@link iso20022.BusinessTransaction <em>Business Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Business Transaction</em>'.
	 * @see iso20022.BusinessTransaction
	 * @generated
	 */
	EClass getBusinessTransaction();

	/**
	 * Returns the meta object for the reference '{@link iso20022.BusinessTransaction#getBusinessProcessTrace <em>Business Process Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Business Process Trace</em>'.
	 * @see iso20022.BusinessTransaction#getBusinessProcessTrace()
	 * @see #getBusinessTransaction()
	 * @generated
	 */
	EReference getBusinessTransaction_BusinessProcessTrace();

	/**
	 * Returns the meta object for the containment reference list '{@link iso20022.BusinessTransaction#getParticipant <em>Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Participant</em>'.
	 * @see iso20022.BusinessTransaction#getParticipant()
	 * @see #getBusinessTransaction()
	 * @generated
	 */
	EReference getBusinessTransaction_Participant();

	/**
	 * Returns the meta object for the containment reference list '{@link iso20022.BusinessTransaction#getTransmission <em>Transmission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transmission</em>'.
	 * @see iso20022.BusinessTransaction#getTransmission()
	 * @see #getBusinessTransaction()
	 * @generated
	 */
	EReference getBusinessTransaction_Transmission();

	/**
	 * Returns the meta object for the reference '{@link iso20022.BusinessTransaction#getMessageTransportMode <em>Message Transport Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Message Transport Mode</em>'.
	 * @see iso20022.BusinessTransaction#getMessageTransportMode()
	 * @see #getBusinessTransaction()
	 * @generated
	 */
	EReference getBusinessTransaction_MessageTransportMode();

	/**
	 * Returns the meta object for the reference list '{@link iso20022.BusinessTransaction#getSubTransaction <em>Sub Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sub Transaction</em>'.
	 * @see iso20022.BusinessTransaction#getSubTransaction()
	 * @see #getBusinessTransaction()
	 * @generated
	 */
	EReference getBusinessTransaction_SubTransaction();

	/**
	 * Returns the meta object for the reference '{@link iso20022.BusinessTransaction#getParentTransaction <em>Parent Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Transaction</em>'.
	 * @see iso20022.BusinessTransaction#getParentTransaction()
	 * @see #getBusinessTransaction()
	 * @generated
	 */
	EReference getBusinessTransaction_ParentTransaction();

	/**
	 * Returns the meta object for the reference list '{@link iso20022.BusinessTransaction#getTrace <em>Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Trace</em>'.
	 * @see iso20022.BusinessTransaction#getTrace()
	 * @see #getBusinessTransaction()
	 * @generated
	 */
	EReference getBusinessTransaction_Trace();

	/**
	 * Returns the meta object for the '{@link iso20022.BusinessTransaction#MessageTransmissionsHaveUniqueNames(java.util.Map, org.eclipse.emf.common.util.DiagnosticChain) <em>Message Transmissions Have Unique Names</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Message Transmissions Have Unique Names</em>' operation.
	 * @see iso20022.BusinessTransaction#MessageTransmissionsHaveUniqueNames(java.util.Map, org.eclipse.emf.common.util.DiagnosticChain)
	 * @generated
	 */
	EOperation getBusinessTransaction__MessageTransmissionsHaveUniqueNames__Map_DiagnosticChain();

	/**
	 * Returns the meta object for the '{@link iso20022.BusinessTransaction#ParticipantsHaveUniqueNames(java.util.Map, org.eclipse.emf.common.util.DiagnosticChain) <em>Participants Have Unique Names</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Participants Have Unique Names</em>' operation.
	 * @see iso20022.BusinessTransaction#ParticipantsHaveUniqueNames(java.util.Map, org.eclipse.emf.common.util.DiagnosticChain)
	 * @generated
	 */
	EOperation getBusinessTransaction__ParticipantsHaveUniqueNames__Map_DiagnosticChain();

	/**
	 * Returns the meta object for class '{@link iso20022.BusinessProcess <em>Business Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Business Process</em>'.
	 * @see iso20022.BusinessProcess
	 * @generated
	 */
	EClass getBusinessProcess();

	/**
	 * Returns the meta object for the reference list '{@link iso20022.BusinessProcess#getExtender <em>Extender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Extender</em>'.
	 * @see iso20022.BusinessProcess#getExtender()
	 * @see #getBusinessProcess()
	 * @generated
	 */
	EReference getBusinessProcess_Extender();

	/**
	 * Returns the meta object for the reference list '{@link iso20022.BusinessProcess#getExtended <em>Extended</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Extended</em>'.
	 * @see iso20022.BusinessProcess#getExtended()
	 * @see #getBusinessProcess()
	 * @generated
	 */
	EReference getBusinessProcess_Extended();

	/**
	 * Returns the meta object for the reference list '{@link iso20022.BusinessProcess#getIncluded <em>Included</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Included</em>'.
	 * @see iso20022.BusinessProcess#getIncluded()
	 * @see #getBusinessProcess()
	 * @generated
	 */
	EReference getBusinessProcess_Included();

	/**
	 * Returns the meta object for the reference list '{@link iso20022.BusinessProcess#getIncluder <em>Includer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Includer</em>'.
	 * @see iso20022.BusinessProcess#getIncluder()
	 * @see #getBusinessProcess()
	 * @generated
	 */
	EReference getBusinessProcess_Includer();

	/**
	 * Returns the meta object for the containment reference list '{@link iso20022.BusinessProcess#getBusinessRole <em>Business Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Business Role</em>'.
	 * @see iso20022.BusinessProcess#getBusinessRole()
	 * @see #getBusinessProcess()
	 * @generated
	 */
	EReference getBusinessProcess_BusinessRole();

	/**
	 * Returns the meta object for the reference list '{@link iso20022.BusinessProcess#getBusinessProcessTrace <em>Business Process Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Business Process Trace</em>'.
	 * @see iso20022.BusinessProcess#getBusinessProcessTrace()
	 * @see #getBusinessProcess()
	 * @generated
	 */
	EReference getBusinessProcess_BusinessProcessTrace();

	/**
	 * Returns the meta object for class '{@link iso20022.BusinessRole <em>Business Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Business Role</em>'.
	 * @see iso20022.BusinessRole
	 * @generated
	 */
	EClass getBusinessRole();

	/**
	 * Returns the meta object for the reference list '{@link iso20022.BusinessRole#getBusinessRoleTrace <em>Business Role Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Business Role Trace</em>'.
	 * @see iso20022.BusinessRole#getBusinessRoleTrace()
	 * @see #getBusinessRole()
	 * @generated
	 */
	EReference getBusinessRole_BusinessRoleTrace();

	/**
	 * Returns the meta object for the container reference '{@link iso20022.BusinessRole#getBusinessProcess <em>Business Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Business Process</em>'.
	 * @see iso20022.BusinessRole#getBusinessProcess()
	 * @see #getBusinessRole()
	 * @generated
	 */
	EReference getBusinessRole_BusinessProcess();

	/**
	 * Returns the meta object for class '{@link iso20022.Participant <em>Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Participant</em>'.
	 * @see iso20022.Participant
	 * @generated
	 */
	EClass getParticipant();

	/**
	 * Returns the meta object for the container reference '{@link iso20022.Participant#getBusinessTransaction <em>Business Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Business Transaction</em>'.
	 * @see iso20022.Participant#getBusinessTransaction()
	 * @see #getParticipant()
	 * @generated
	 */
	EReference getParticipant_BusinessTransaction();

	/**
	 * Returns the meta object for the reference list '{@link iso20022.Participant#getReceives <em>Receives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Receives</em>'.
	 * @see iso20022.Participant#getReceives()
	 * @see #getParticipant()
	 * @generated
	 */
	EReference getParticipant_Receives();

	/**
	 * Returns the meta object for the reference list '{@link iso20022.Participant#getSends <em>Sends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sends</em>'.
	 * @see iso20022.Participant#getSends()
	 * @see #getParticipant()
	 * @generated
	 */
	EReference getParticipant_Sends();

	/**
	 * Returns the meta object for the reference '{@link iso20022.Participant#getBusinessRoleTrace <em>Business Role Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Business Role Trace</em>'.
	 * @see iso20022.Participant#getBusinessRoleTrace()
	 * @see #getParticipant()
	 * @generated
	 */
	EReference getParticipant_BusinessRoleTrace();

	/**
	 * Returns the meta object for class '{@link iso20022.Receive <em>Receive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Receive</em>'.
	 * @see iso20022.Receive
	 * @generated
	 */
	EClass getReceive();

	/**
	 * Returns the meta object for the container reference '{@link iso20022.Receive#getMessageTransmission <em>Message Transmission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Message Transmission</em>'.
	 * @see iso20022.Receive#getMessageTransmission()
	 * @see #getReceive()
	 * @generated
	 */
	EReference getReceive_MessageTransmission();

	/**
	 * Returns the meta object for the reference '{@link iso20022.Receive#getReceiver <em>Receiver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Receiver</em>'.
	 * @see iso20022.Receive#getReceiver()
	 * @see #getReceive()
	 * @generated
	 */
	EReference getReceive_Receiver();

	/**
	 * Returns the meta object for class '{@link iso20022.MessageTransmission <em>Message Transmission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Transmission</em>'.
	 * @see iso20022.MessageTransmission
	 * @generated
	 */
	EClass getMessageTransmission();

	/**
	 * Returns the meta object for the container reference '{@link iso20022.MessageTransmission#getBusinessTransaction <em>Business Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Business Transaction</em>'.
	 * @see iso20022.MessageTransmission#getBusinessTransaction()
	 * @see #getMessageTransmission()
	 * @generated
	 */
	EReference getMessageTransmission_BusinessTransaction();

	/**
	 * Returns the meta object for the reference list '{@link iso20022.MessageTransmission#getDerivation <em>Derivation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Derivation</em>'.
	 * @see iso20022.MessageTransmission#getDerivation()
	 * @see #getMessageTransmission()
	 * @generated
	 */
	EReference getMessageTransmission_Derivation();

	/**
	 * Returns the meta object for the attribute '{@link iso20022.MessageTransmission#getMessageTypeDescription <em>Message Type Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Type Description</em>'.
	 * @see iso20022.MessageTransmission#getMessageTypeDescription()
	 * @see #getMessageTransmission()
	 * @generated
	 */
	EAttribute getMessageTransmission_MessageTypeDescription();

	/**
	 * Returns the meta object for the containment reference '{@link iso20022.MessageTransmission#getSend <em>Send</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Send</em>'.
	 * @see iso20022.MessageTransmission#getSend()
	 * @see #getMessageTransmission()
	 * @generated
	 */
	EReference getMessageTransmission_Send();

	/**
	 * Returns the meta object for the containment reference list '{@link iso20022.MessageTransmission#getReceive <em>Receive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Receive</em>'.
	 * @see iso20022.MessageTransmission#getReceive()
	 * @see #getMessageTransmission()
	 * @generated
	 */
	EReference getMessageTransmission_Receive();

	/**
	 * Returns the meta object for class '{@link iso20022.Send <em>Send</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Send</em>'.
	 * @see iso20022.Send
	 * @generated
	 */
	EClass getSend();

	/**
	 * Returns the meta object for the reference '{@link iso20022.Send#getSender <em>Sender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sender</em>'.
	 * @see iso20022.Send#getSender()
	 * @see #getSend()
	 * @generated
	 */
	EReference getSend_Sender();

	/**
	 * Returns the meta object for the container reference '{@link iso20022.Send#getMessageTransmission <em>Message Transmission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Message Transmission</em>'.
	 * @see iso20022.Send#getMessageTransmission()
	 * @see #getSend()
	 * @generated
	 */
	EReference getSend_MessageTransmission();

	/**
	 * Returns the meta object for class '{@link iso20022.MessageTransportMode <em>Message Transport Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Transport Mode</em>'.
	 * @see iso20022.MessageTransportMode
	 * @generated
	 */
	EClass getMessageTransportMode();

	/**
	 * Returns the meta object for the attribute '{@link iso20022.MessageTransportMode#getBoundedCommunicationDelay <em>Bounded Communication Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bounded Communication Delay</em>'.
	 * @see iso20022.MessageTransportMode#getBoundedCommunicationDelay()
	 * @see #getMessageTransportMode()
	 * @generated
	 */
	EAttribute getMessageTransportMode_BoundedCommunicationDelay();

	/**
	 * Returns the meta object for the attribute '{@link iso20022.MessageTransportMode#getMaximumClockVariation <em>Maximum Clock Variation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum Clock Variation</em>'.
	 * @see iso20022.MessageTransportMode#getMaximumClockVariation()
	 * @see #getMessageTransportMode()
	 * @generated
	 */
	EAttribute getMessageTransportMode_MaximumClockVariation();

	/**
	 * Returns the meta object for the attribute '{@link iso20022.MessageTransportMode#getMaximumMessageSize <em>Maximum Message Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum Message Size</em>'.
	 * @see iso20022.MessageTransportMode#getMaximumMessageSize()
	 * @see #getMessageTransportMode()
	 * @generated
	 */
	EAttribute getMessageTransportMode_MaximumMessageSize();

	/**
	 * Returns the meta object for the attribute '{@link iso20022.MessageTransportMode#getMessageDeliveryWindow <em>Message Delivery Window</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Delivery Window</em>'.
	 * @see iso20022.MessageTransportMode#getMessageDeliveryWindow()
	 * @see #getMessageTransportMode()
	 * @generated
	 */
	EAttribute getMessageTransportMode_MessageDeliveryWindow();

	/**
	 * Returns the meta object for the attribute '{@link iso20022.MessageTransportMode#getMessageSendingWindow <em>Message Sending Window</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Sending Window</em>'.
	 * @see iso20022.MessageTransportMode#getMessageSendingWindow()
	 * @see #getMessageTransportMode()
	 * @generated
	 */
	EAttribute getMessageTransportMode_MessageSendingWindow();

	/**
	 * Returns the meta object for the attribute '{@link iso20022.MessageTransportMode#getDeliveryAssurance <em>Delivery Assurance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delivery Assurance</em>'.
	 * @see iso20022.MessageTransportMode#getDeliveryAssurance()
	 * @see #getMessageTransportMode()
	 * @generated
	 */
	EAttribute getMessageTransportMode_DeliveryAssurance();

	/**
	 * Returns the meta object for the attribute '{@link iso20022.MessageTransportMode#getDurability <em>Durability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Durability</em>'.
	 * @see iso20022.MessageTransportMode#getDurability()
	 * @see #getMessageTransportMode()
	 * @generated
	 */
	EAttribute getMessageTransportMode_Durability();

	/**
	 * Returns the meta object for the attribute '{@link iso20022.MessageTransportMode#getMessageCasting <em>Message Casting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Casting</em>'.
	 * @see iso20022.MessageTransportMode#getMessageCasting()
	 * @see #getMessageTransportMode()
	 * @generated
	 */
	EAttribute getMessageTransportMode_MessageCasting();

	/**
	 * Returns the meta object for the attribute '{@link iso20022.MessageTransportMode#getMessageDeliveryOrder <em>Message Delivery Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Delivery Order</em>'.
	 * @see iso20022.MessageTransportMode#getMessageDeliveryOrder()
	 * @see #getMessageTransportMode()
	 * @generated
	 */
	EAttribute getMessageTransportMode_MessageDeliveryOrder();

	/**
	 * Returns the meta object for the attribute '{@link iso20022.MessageTransportMode#getMessageValidationLevel <em>Message Validation Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Validation Level</em>'.
	 * @see iso20022.MessageTransportMode#getMessageValidationLevel()
	 * @see #getMessageTransportMode()
	 * @generated
	 */
	EAttribute getMessageTransportMode_MessageValidationLevel();

	/**
	 * Returns the meta object for the attribute '{@link iso20022.MessageTransportMode#getMessageValidationOnOff <em>Message Validation On Off</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Validation On Off</em>'.
	 * @see iso20022.MessageTransportMode#getMessageValidationOnOff()
	 * @see #getMessageTransportMode()
	 * @generated
	 */
	EAttribute getMessageTransportMode_MessageValidationOnOff();

	/**
	 * Returns the meta object for the attribute '{@link iso20022.MessageTransportMode#getMessageValidationResults <em>Message Validation Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Validation Results</em>'.
	 * @see iso20022.MessageTransportMode#getMessageValidationResults()
	 * @see #getMessageTransportMode()
	 * @generated
	 */
	EAttribute getMessageTransportMode_MessageValidationResults();

	/**
	 * Returns the meta object for the attribute '{@link iso20022.MessageTransportMode#getReceiverAsynchronicity <em>Receiver Asynchronicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Receiver Asynchronicity</em>'.
	 * @see iso20022.MessageTransportMode#getReceiverAsynchronicity()
	 * @see #getMessageTransportMode()
	 * @generated
	 */
	EAttribute getMessageTransportMode_ReceiverAsynchronicity();

	/**
	 * Returns the meta object for the attribute '{@link iso20022.MessageTransportMode#getSenderAsynchronicity <em>Sender Asynchronicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sender Asynchronicity</em>'.
	 * @see iso20022.MessageTransportMode#getSenderAsynchronicity()
	 * @see #getMessageTransportMode()
	 * @generated
	 */
	EAttribute getMessageTransportMode_SenderAsynchronicity();

	/**
	 * Returns the meta object for the reference list '{@link iso20022.MessageTransportMode#getBusinessTransaction <em>Business Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Business Transaction</em>'.
	 * @see iso20022.MessageTransportMode#getBusinessTransaction()
	 * @see #getMessageTransportMode()
	 * @generated
	 */
	EReference getMessageTransportMode_BusinessTransaction();

	/**
	 * Returns the meta object for class '{@link iso20022.MessageDefinitionIdentifier <em>Message Definition Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Definition Identifier</em>'.
	 * @see iso20022.MessageDefinitionIdentifier
	 * @generated
	 */
	EClass getMessageDefinitionIdentifier();

	/**
	 * Returns the meta object for the attribute '{@link iso20022.MessageDefinitionIdentifier#getBusinessArea <em>Business Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Business Area</em>'.
	 * @see iso20022.MessageDefinitionIdentifier#getBusinessArea()
	 * @see #getMessageDefinitionIdentifier()
	 * @generated
	 */
	EAttribute getMessageDefinitionIdentifier_BusinessArea();

	/**
	 * Returns the meta object for the attribute '{@link iso20022.MessageDefinitionIdentifier#getMessageFunctionality <em>Message Functionality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Functionality</em>'.
	 * @see iso20022.MessageDefinitionIdentifier#getMessageFunctionality()
	 * @see #getMessageDefinitionIdentifier()
	 * @generated
	 */
	EAttribute getMessageDefinitionIdentifier_MessageFunctionality();

	/**
	 * Returns the meta object for the attribute '{@link iso20022.MessageDefinitionIdentifier#getFlavour <em>Flavour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flavour</em>'.
	 * @see iso20022.MessageDefinitionIdentifier#getFlavour()
	 * @see #getMessageDefinitionIdentifier()
	 * @generated
	 */
	EAttribute getMessageDefinitionIdentifier_Flavour();

	/**
	 * Returns the meta object for the attribute '{@link iso20022.MessageDefinitionIdentifier#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see iso20022.MessageDefinitionIdentifier#getVersion()
	 * @see #getMessageDefinitionIdentifier()
	 * @generated
	 */
	EAttribute getMessageDefinitionIdentifier_Version();

	/**
	 * Returns the meta object for class '{@link iso20022.Conversation <em>Conversation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conversation</em>'.
	 * @see iso20022.Conversation
	 * @generated
	 */
	EClass getConversation();

	/**
	 * Returns the meta object for class '{@link iso20022.MessageAssociationEnd <em>Message Association End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Association End</em>'.
	 * @see iso20022.MessageAssociationEnd
	 * @generated
	 */
	EClass getMessageAssociationEnd();

	/**
	 * Returns the meta object for the attribute '{@link iso20022.MessageAssociationEnd#isIsComposite <em>Is Composite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Composite</em>'.
	 * @see iso20022.MessageAssociationEnd#isIsComposite()
	 * @see #getMessageAssociationEnd()
	 * @generated
	 */
	EAttribute getMessageAssociationEnd_IsComposite();

	/**
	 * Returns the meta object for the reference '{@link iso20022.MessageAssociationEnd#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see iso20022.MessageAssociationEnd#getType()
	 * @see #getMessageAssociationEnd()
	 * @generated
	 */
	EReference getMessageAssociationEnd_Type();

	/**
	 * Returns the meta object for class '{@link iso20022.MessageAttribute <em>Message Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Attribute</em>'.
	 * @see iso20022.MessageAttribute
	 * @generated
	 */
	EClass getMessageAttribute();

	/**
	 * Returns the meta object for the reference '{@link iso20022.MessageAttribute#getSimpleType <em>Simple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Simple Type</em>'.
	 * @see iso20022.MessageAttribute#getSimpleType()
	 * @see #getMessageAttribute()
	 * @generated
	 */
	EReference getMessageAttribute_SimpleType();

	/**
	 * Returns the meta object for the reference '{@link iso20022.MessageAttribute#getComplexType <em>Complex Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Complex Type</em>'.
	 * @see iso20022.MessageAttribute#getComplexType()
	 * @see #getMessageAttribute()
	 * @generated
	 */
	EReference getMessageAttribute_ComplexType();

	/**
	 * Returns the meta object for the '{@link iso20022.MessageAttribute#MessageAttributeHasExactlyOneType(java.util.Map, org.eclipse.emf.common.util.DiagnosticChain) <em>Message Attribute Has Exactly One Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Message Attribute Has Exactly One Type</em>' operation.
	 * @see iso20022.MessageAttribute#MessageAttributeHasExactlyOneType(java.util.Map, org.eclipse.emf.common.util.DiagnosticChain)
	 * @generated
	 */
	EOperation getMessageAttribute__MessageAttributeHasExactlyOneType__Map_DiagnosticChain();

	/**
	 * Returns the meta object for class '{@link iso20022.BusinessAttribute <em>Business Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Business Attribute</em>'.
	 * @see iso20022.BusinessAttribute
	 * @generated
	 */
	EClass getBusinessAttribute();

	/**
	 * Returns the meta object for the reference '{@link iso20022.BusinessAttribute#getSimpleType <em>Simple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Simple Type</em>'.
	 * @see iso20022.BusinessAttribute#getSimpleType()
	 * @see #getBusinessAttribute()
	 * @generated
	 */
	EReference getBusinessAttribute_SimpleType();

	/**
	 * Returns the meta object for the reference '{@link iso20022.BusinessAttribute#getComplexType <em>Complex Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Complex Type</em>'.
	 * @see iso20022.BusinessAttribute#getComplexType()
	 * @see #getBusinessAttribute()
	 * @generated
	 */
	EReference getBusinessAttribute_ComplexType();

	/**
	 * Returns the meta object for the '{@link iso20022.BusinessAttribute#BusinessAttributeHasExactlyOneType(java.util.Map, org.eclipse.emf.common.util.DiagnosticChain) <em>Business Attribute Has Exactly One Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Business Attribute Has Exactly One Type</em>' operation.
	 * @see iso20022.BusinessAttribute#BusinessAttributeHasExactlyOneType(java.util.Map, org.eclipse.emf.common.util.DiagnosticChain)
	 * @generated
	 */
	EOperation getBusinessAttribute__BusinessAttributeHasExactlyOneType__Map_DiagnosticChain();

	/**
	 * Returns the meta object for the '{@link iso20022.BusinessAttribute#NoDerivingCodeSetType(java.util.Map, org.eclipse.emf.common.util.DiagnosticChain) <em>No Deriving Code Set Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>No Deriving Code Set Type</em>' operation.
	 * @see iso20022.BusinessAttribute#NoDerivingCodeSetType(java.util.Map, org.eclipse.emf.common.util.DiagnosticChain)
	 * @generated
	 */
	EOperation getBusinessAttribute__NoDerivingCodeSetType__Map_DiagnosticChain();

	/**
	 * Returns the meta object for class '{@link iso20022.Text <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text</em>'.
	 * @see iso20022.Text
	 * @generated
	 */
	EClass getText();

	/**
	 * Returns the meta object for class '{@link iso20022.String <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String</em>'.
	 * @see iso20022.String
	 * @generated
	 */
	EClass getString();

	/**
	 * Returns the meta object for the attribute '{@link iso20022.String#getMinLength <em>Min Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Length</em>'.
	 * @see iso20022.String#getMinLength()
	 * @see #getString()
	 * @generated
	 */
	EAttribute getString_MinLength();

	/**
	 * Returns the meta object for the attribute '{@link iso20022.String#getMaxLength <em>Max Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Length</em>'.
	 * @see iso20022.String#getMaxLength()
	 * @see #getString()
	 * @generated
	 */
	EAttribute getString_MaxLength();

	/**
	 * Returns the meta object for the attribute '{@link iso20022.String#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see iso20022.String#getLength()
	 * @see #getString()
	 * @generated
	 */
	EAttribute getString_Length();

	/**
	 * Returns the meta object for the attribute '{@link iso20022.String#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pattern</em>'.
	 * @see iso20022.String#getPattern()
	 * @see #getString()
	 * @generated
	 */
	EAttribute getString_Pattern();

	/**
	 * Returns the meta object for class '{@link iso20022.IdentifierSet <em>Identifier Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identifier Set</em>'.
	 * @see iso20022.IdentifierSet
	 * @generated
	 */
	EClass getIdentifierSet();

	/**
	 * Returns the meta object for the attribute '{@link iso20022.IdentifierSet#getIdentificationScheme <em>Identification Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identification Scheme</em>'.
	 * @see iso20022.IdentifierSet#getIdentificationScheme()
	 * @see #getIdentifierSet()
	 * @generated
	 */
	EAttribute getIdentifierSet_IdentificationScheme();

	/**
	 * Returns the meta object for class '{@link iso20022.Indicator <em>Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Indicator</em>'.
	 * @see iso20022.Indicator
	 * @generated
	 */
	EClass getIndicator();

	/**
	 * Returns the meta object for the attribute '{@link iso20022.Indicator#getMeaningWhenTrue <em>Meaning When True</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Meaning When True</em>'.
	 * @see iso20022.Indicator#getMeaningWhenTrue()
	 * @see #getIndicator()
	 * @generated
	 */
	EAttribute getIndicator_MeaningWhenTrue();

	/**
	 * Returns the meta object for the attribute '{@link iso20022.Indicator#getMeaningWhenFalse <em>Meaning When False</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Meaning When False</em>'.
	 * @see iso20022.Indicator#getMeaningWhenFalse()
	 * @see #getIndicator()
	 * @generated
	 */
	EAttribute getIndicator_MeaningWhenFalse();

	/**
	 * Returns the meta object for class '{@link iso20022.Boolean <em>Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean</em>'.
	 * @see iso20022.Boolean
	 * @generated
	 */
	EClass getBoolean();

	/**
	 * Returns the meta object for the attribute '{@link iso20022.Boolean#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pattern</em>'.
	 * @see iso20022.Boolean#getPattern()
	 * @see #getBoolean()
	 * @generated
	 */
	EAttribute getBoolean_Pattern();

	/**
	 * Returns the meta object for class '{@link iso20022.Rate <em>Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rate</em>'.
	 * @see iso20022.Rate
	 * @generated
	 */
	EClass getRate();

	/**
	 * Returns the meta object for the attribute '{@link iso20022.Rate#getBaseValue <em>Base Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Value</em>'.
	 * @see iso20022.Rate#getBaseValue()
	 * @see #getRate()
	 * @generated
	 */
	EAttribute getRate_BaseValue();

	/**
	 * Returns the meta object for the attribute '{@link iso20022.Rate#getBaseUnitCode <em>Base Unit Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Unit Code</em>'.
	 * @see iso20022.Rate#getBaseUnitCode()
	 * @see #getRate()
	 * @generated
	 */
	EAttribute getRate_BaseUnitCode();

	/**
	 * Returns the meta object for class '{@link iso20022.Decimal <em>Decimal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decimal</em>'.
	 * @see iso20022.Decimal
	 * @generated
	 */
	EClass getDecimal();

	/**
	 * Returns the meta object for the attribute '{@link iso20022.Decimal#getMinInclusive <em>Min Inclusive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Inclusive</em>'.
	 * @see iso20022.Decimal#getMinInclusive()
	 * @see #getDecimal()
	 * @generated
	 */
	EAttribute getDecimal_MinInclusive();

	/**
	 * Returns the meta object for the attribute '{@link iso20022.Decimal#getMinExclusive <em>Min Exclusive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Exclusive</em>'.
	 * @see iso20022.Decimal#getMinExclusive()
	 * @see #getDecimal()
	 * @generated
	 */
	EAttribute getDecimal_MinExclusive();

	/**
	 * Returns the meta object for the attribute '{@link iso20022.Decimal#getMaxInclusive <em>Max Inclusive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Inclusive</em>'.
	 * @see iso20022.Decimal#getMaxInclusive()
	 * @see #getDecimal()
	 * @generated
	 */
	EAttribute getDecimal_MaxInclusive();

	/**
	 * Returns the meta object for the attribute '{@link iso20022.Decimal#getMaxExclusive <em>Max Exclusive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Exclusive</em>'.
	 * @see iso20022.Decimal#getMaxExclusive()
	 * @see #getDecimal()
	 * @generated
	 */
	EAttribute getDecimal_MaxExclusive();

	/**
	 * Returns the meta object for the attribute '{@link iso20022.Decimal#getTotalDigits <em>Total Digits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Digits</em>'.
	 * @see iso20022.Decimal#getTotalDigits()
	 * @see #getDecimal()
	 * @generated
	 */
	EAttribute getDecimal_TotalDigits();

	/**
	 * Returns the meta object for the attribute '{@link iso20022.Decimal#getFractionDigits <em>Fraction Digits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fraction Digits</em>'.
	 * @see iso20022.Decimal#getFractionDigits()
	 * @see #getDecimal()
	 * @generated
	 */
	EAttribute getDecimal_FractionDigits();

	/**
	 * Returns the meta object for the attribute '{@link iso20022.Decimal#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pattern</em>'.
	 * @see iso20022.Decimal#getPattern()
	 * @see #getDecimal()
	 * @generated
	 */
	EAttribute getDecimal_Pattern();

	/**
	 * Returns the meta object for class '{@link iso20022.ExternalSchema <em>External Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Schema</em>'.
	 * @see iso20022.ExternalSchema
	 * @generated
	 */
	EClass getExternalSchema();

	/**
	 * Returns the meta object for the attribute list '{@link iso20022.ExternalSchema#getNamespaceList <em>Namespace List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Namespace List</em>'.
	 * @see iso20022.ExternalSchema#getNamespaceList()
	 * @see #getExternalSchema()
	 * @generated
	 */
	EAttribute getExternalSchema_NamespaceList();

	/**
	 * Returns the meta object for the attribute '{@link iso20022.ExternalSchema#getProcessContent <em>Process Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Process Content</em>'.
	 * @see iso20022.ExternalSchema#getProcessContent()
	 * @see #getExternalSchema()
	 * @generated
	 */
	EAttribute getExternalSchema_ProcessContent();

	/**
	 * Returns the meta object for class '{@link iso20022.Quantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quantity</em>'.
	 * @see iso20022.Quantity
	 * @generated
	 */
	EClass getQuantity();

	/**
	 * Returns the meta object for the attribute '{@link iso20022.Quantity#getUnitCode <em>Unit Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit Code</em>'.
	 * @see iso20022.Quantity#getUnitCode()
	 * @see #getQuantity()
	 * @generated
	 */
	EAttribute getQuantity_UnitCode();

	/**
	 * Returns the meta object for class '{@link iso20022.Code <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code</em>'.
	 * @see iso20022.Code
	 * @generated
	 */
	EClass getCode();

	/**
	 * Returns the meta object for the attribute '{@link iso20022.Code#getCodeName <em>Code Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code Name</em>'.
	 * @see iso20022.Code#getCodeName()
	 * @see #getCode()
	 * @generated
	 */
	EAttribute getCode_CodeName();

	/**
	 * Returns the meta object for the container reference '{@link iso20022.Code#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner</em>'.
	 * @see iso20022.Code#getOwner()
	 * @see #getCode()
	 * @generated
	 */
	EReference getCode_Owner();

	/**
	 * Returns the meta object for class '{@link iso20022.CodeSet <em>Code Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Set</em>'.
	 * @see iso20022.CodeSet
	 * @generated
	 */
	EClass getCodeSet();

	/**
	 * Returns the meta object for the reference '{@link iso20022.CodeSet#getTrace <em>Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Trace</em>'.
	 * @see iso20022.CodeSet#getTrace()
	 * @see #getCodeSet()
	 * @generated
	 */
	EReference getCodeSet_Trace();

	/**
	 * Returns the meta object for the reference list '{@link iso20022.CodeSet#getDerivation <em>Derivation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Derivation</em>'.
	 * @see iso20022.CodeSet#getDerivation()
	 * @see #getCodeSet()
	 * @generated
	 */
	EReference getCodeSet_Derivation();

	/**
	 * Returns the meta object for the attribute '{@link iso20022.CodeSet#getIdentificationScheme <em>Identification Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identification Scheme</em>'.
	 * @see iso20022.CodeSet#getIdentificationScheme()
	 * @see #getCodeSet()
	 * @generated
	 */
	EAttribute getCodeSet_IdentificationScheme();

	/**
	 * Returns the meta object for the containment reference list '{@link iso20022.CodeSet#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Code</em>'.
	 * @see iso20022.CodeSet#getCode()
	 * @see #getCodeSet()
	 * @generated
	 */
	EReference getCodeSet_Code();

	/**
	 * Returns the meta object for class '{@link iso20022.Amount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Amount</em>'.
	 * @see iso20022.Amount
	 * @generated
	 */
	EClass getAmount();

	/**
	 * Returns the meta object for the reference '{@link iso20022.Amount#getCurrencyIdentifierSet <em>Currency Identifier Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Currency Identifier Set</em>'.
	 * @see iso20022.Amount#getCurrencyIdentifierSet()
	 * @see #getAmount()
	 * @generated
	 */
	EReference getAmount_CurrencyIdentifierSet();

	/**
	 * Returns the meta object for class '{@link iso20022.ChoiceComponent <em>Choice Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Choice Component</em>'.
	 * @see iso20022.ChoiceComponent
	 * @generated
	 */
	EClass getChoiceComponent();

	/**
	 * Returns the meta object for the '{@link iso20022.ChoiceComponent#AtLeastOneProperty(java.util.Map, org.eclipse.emf.common.util.DiagnosticChain) <em>At Least One Property</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>At Least One Property</em>' operation.
	 * @see iso20022.ChoiceComponent#AtLeastOneProperty(java.util.Map, org.eclipse.emf.common.util.DiagnosticChain)
	 * @generated
	 */
	EOperation getChoiceComponent__AtLeastOneProperty__Map_DiagnosticChain();

	/**
	 * Returns the meta object for class '{@link iso20022.AbstractDateTimeConcept <em>Abstract Date Time Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Date Time Concept</em>'.
	 * @see iso20022.AbstractDateTimeConcept
	 * @generated
	 */
	EClass getAbstractDateTimeConcept();

	/**
	 * Returns the meta object for the attribute '{@link iso20022.AbstractDateTimeConcept#getMinInclusive <em>Min Inclusive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Inclusive</em>'.
	 * @see iso20022.AbstractDateTimeConcept#getMinInclusive()
	 * @see #getAbstractDateTimeConcept()
	 * @generated
	 */
	EAttribute getAbstractDateTimeConcept_MinInclusive();

	/**
	 * Returns the meta object for the attribute '{@link iso20022.AbstractDateTimeConcept#getMinExclusive <em>Min Exclusive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Exclusive</em>'.
	 * @see iso20022.AbstractDateTimeConcept#getMinExclusive()
	 * @see #getAbstractDateTimeConcept()
	 * @generated
	 */
	EAttribute getAbstractDateTimeConcept_MinExclusive();

	/**
	 * Returns the meta object for the attribute '{@link iso20022.AbstractDateTimeConcept#getMaxInclusive <em>Max Inclusive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Inclusive</em>'.
	 * @see iso20022.AbstractDateTimeConcept#getMaxInclusive()
	 * @see #getAbstractDateTimeConcept()
	 * @generated
	 */
	EAttribute getAbstractDateTimeConcept_MaxInclusive();

	/**
	 * Returns the meta object for the attribute '{@link iso20022.AbstractDateTimeConcept#getMaxExclusive <em>Max Exclusive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Exclusive</em>'.
	 * @see iso20022.AbstractDateTimeConcept#getMaxExclusive()
	 * @see #getAbstractDateTimeConcept()
	 * @generated
	 */
	EAttribute getAbstractDateTimeConcept_MaxExclusive();

	/**
	 * Returns the meta object for the attribute '{@link iso20022.AbstractDateTimeConcept#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pattern</em>'.
	 * @see iso20022.AbstractDateTimeConcept#getPattern()
	 * @see #getAbstractDateTimeConcept()
	 * @generated
	 */
	EAttribute getAbstractDateTimeConcept_Pattern();

	/**
	 * Returns the meta object for class '{@link iso20022.EndPointCategory <em>End Point Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End Point Category</em>'.
	 * @see iso20022.EndPointCategory
	 * @generated
	 */
	EClass getEndPointCategory();

	/**
	 * Returns the meta object for the reference list '{@link iso20022.EndPointCategory#getEndPoints <em>End Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>End Points</em>'.
	 * @see iso20022.EndPointCategory#getEndPoints()
	 * @see #getEndPointCategory()
	 * @generated
	 */
	EReference getEndPointCategory_EndPoints();

	/**
	 * Returns the meta object for class '{@link iso20022.Binary <em>Binary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary</em>'.
	 * @see iso20022.Binary
	 * @generated
	 */
	EClass getBinary();

	/**
	 * Returns the meta object for the attribute '{@link iso20022.Binary#getMinLength <em>Min Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Length</em>'.
	 * @see iso20022.Binary#getMinLength()
	 * @see #getBinary()
	 * @generated
	 */
	EAttribute getBinary_MinLength();

	/**
	 * Returns the meta object for the attribute '{@link iso20022.Binary#getMaxLength <em>Max Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Length</em>'.
	 * @see iso20022.Binary#getMaxLength()
	 * @see #getBinary()
	 * @generated
	 */
	EAttribute getBinary_MaxLength();

	/**
	 * Returns the meta object for the attribute '{@link iso20022.Binary#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see iso20022.Binary#getLength()
	 * @see #getBinary()
	 * @generated
	 */
	EAttribute getBinary_Length();

	/**
	 * Returns the meta object for the attribute '{@link iso20022.Binary#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pattern</em>'.
	 * @see iso20022.Binary#getPattern()
	 * @see #getBinary()
	 * @generated
	 */
	EAttribute getBinary_Pattern();

	/**
	 * Returns the meta object for class '{@link iso20022.Date <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date</em>'.
	 * @see iso20022.Date
	 * @generated
	 */
	EClass getDate();

	/**
	 * Returns the meta object for class '{@link iso20022.DateTime <em>Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Time</em>'.
	 * @see iso20022.DateTime
	 * @generated
	 */
	EClass getDateTime();

	/**
	 * Returns the meta object for class '{@link iso20022.Day <em>Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Day</em>'.
	 * @see iso20022.Day
	 * @generated
	 */
	EClass getDay();

	/**
	 * Returns the meta object for class '{@link iso20022.Duration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Duration</em>'.
	 * @see iso20022.Duration
	 * @generated
	 */
	EClass getDuration();

	/**
	 * Returns the meta object for class '{@link iso20022.Month <em>Month</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Month</em>'.
	 * @see iso20022.Month
	 * @generated
	 */
	EClass getMonth();

	/**
	 * Returns the meta object for class '{@link iso20022.MonthDay <em>Month Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Month Day</em>'.
	 * @see iso20022.MonthDay
	 * @generated
	 */
	EClass getMonthDay();

	/**
	 * Returns the meta object for class '{@link iso20022.Time <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time</em>'.
	 * @see iso20022.Time
	 * @generated
	 */
	EClass getTime();

	/**
	 * Returns the meta object for class '{@link iso20022.Year <em>Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Year</em>'.
	 * @see iso20022.Year
	 * @generated
	 */
	EClass getYear();

	/**
	 * Returns the meta object for class '{@link iso20022.YearMonth <em>Year Month</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Year Month</em>'.
	 * @see iso20022.YearMonth
	 * @generated
	 */
	EClass getYearMonth();

	/**
	 * Returns the meta object for class '{@link iso20022.UserDefined <em>User Defined</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Defined</em>'.
	 * @see iso20022.UserDefined
	 * @generated
	 */
	EClass getUserDefined();

	/**
	 * Returns the meta object for the attribute '{@link iso20022.UserDefined#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namespace</em>'.
	 * @see iso20022.UserDefined#getNamespace()
	 * @see #getUserDefined()
	 * @generated
	 */
	EAttribute getUserDefined_Namespace();

	/**
	 * Returns the meta object for the attribute '{@link iso20022.UserDefined#getNamespaceList <em>Namespace List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namespace List</em>'.
	 * @see iso20022.UserDefined#getNamespaceList()
	 * @see #getUserDefined()
	 * @generated
	 */
	EAttribute getUserDefined_NamespaceList();

	/**
	 * Returns the meta object for the attribute '{@link iso20022.UserDefined#getProcessContents <em>Process Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Process Contents</em>'.
	 * @see iso20022.UserDefined#getProcessContents()
	 * @see #getUserDefined()
	 * @generated
	 */
	EAttribute getUserDefined_ProcessContents();

	/**
	 * Returns the meta object for class '{@link iso20022.IndustryMessageSet <em>Industry Message Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Industry Message Set</em>'.
	 * @see iso20022.IndustryMessageSet
	 * @generated
	 */
	EClass getIndustryMessageSet();

	/**
	 * Returns the meta object for class '{@link iso20022.ConvergenceDocumentation <em>Convergence Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Convergence Documentation</em>'.
	 * @see iso20022.ConvergenceDocumentation
	 * @generated
	 */
	EClass getConvergenceDocumentation();

	/**
	 * Returns the meta object for class '{@link iso20022.ISO15022MessageSet <em>ISO15022 Message Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISO15022 Message Set</em>'.
	 * @see iso20022.ISO15022MessageSet
	 * @generated
	 */
	EClass getISO15022MessageSet();

	/**
	 * Returns the meta object for class '{@link iso20022.SchemaType <em>Schema Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schema Type</em>'.
	 * @see iso20022.SchemaType
	 * @generated
	 */
	EClass getSchemaType();

	/**
	 * Returns the meta object for the attribute '{@link iso20022.SchemaType#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see iso20022.SchemaType#getKind()
	 * @see #getSchemaType()
	 * @generated
	 */
	EAttribute getSchemaType_Kind();

	/**
	 * Returns the meta object for enum '{@link iso20022.RegistrationStatus <em>Registration Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Registration Status</em>'.
	 * @see iso20022.RegistrationStatus
	 * @generated
	 */
	EEnum getRegistrationStatus();

	/**
	 * Returns the meta object for enum '{@link iso20022.Aggregation <em>Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Aggregation</em>'.
	 * @see iso20022.Aggregation
	 * @generated
	 */
	EEnum getAggregation();

	/**
	 * Returns the meta object for enum '{@link iso20022.DeliveryAssurance <em>Delivery Assurance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Delivery Assurance</em>'.
	 * @see iso20022.DeliveryAssurance
	 * @generated
	 */
	EEnum getDeliveryAssurance();

	/**
	 * Returns the meta object for enum '{@link iso20022.Durability <em>Durability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Durability</em>'.
	 * @see iso20022.Durability
	 * @generated
	 */
	EEnum getDurability();

	/**
	 * Returns the meta object for enum '{@link iso20022.MessageCasting <em>Message Casting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Message Casting</em>'.
	 * @see iso20022.MessageCasting
	 * @generated
	 */
	EEnum getMessageCasting();

	/**
	 * Returns the meta object for enum '{@link iso20022.MessageDeliveryOrder <em>Message Delivery Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Message Delivery Order</em>'.
	 * @see iso20022.MessageDeliveryOrder
	 * @generated
	 */
	EEnum getMessageDeliveryOrder();

	/**
	 * Returns the meta object for enum '{@link iso20022.MessageValidationLevel <em>Message Validation Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Message Validation Level</em>'.
	 * @see iso20022.MessageValidationLevel
	 * @generated
	 */
	EEnum getMessageValidationLevel();

	/**
	 * Returns the meta object for enum '{@link iso20022.MessageValidationOnOff <em>Message Validation On Off</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Message Validation On Off</em>'.
	 * @see iso20022.MessageValidationOnOff
	 * @generated
	 */
	EEnum getMessageValidationOnOff();

	/**
	 * Returns the meta object for enum '{@link iso20022.MessageValidationResults <em>Message Validation Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Message Validation Results</em>'.
	 * @see iso20022.MessageValidationResults
	 * @generated
	 */
	EEnum getMessageValidationResults();

	/**
	 * Returns the meta object for enum '{@link iso20022.ReceiverAsynchronicity <em>Receiver Asynchronicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Receiver Asynchronicity</em>'.
	 * @see iso20022.ReceiverAsynchronicity
	 * @generated
	 */
	EEnum getReceiverAsynchronicity();

	/**
	 * Returns the meta object for enum '{@link iso20022.SenderAsynchronicity <em>Sender Asynchronicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sender Asynchronicity</em>'.
	 * @see iso20022.SenderAsynchronicity
	 * @generated
	 */
	EEnum getSenderAsynchronicity();

	/**
	 * Returns the meta object for enum '{@link iso20022.ProcessContent <em>Process Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Process Content</em>'.
	 * @see iso20022.ProcessContent
	 * @generated
	 */
	EEnum getProcessContent();

	/**
	 * Returns the meta object for enum '{@link iso20022.Namespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Namespace</em>'.
	 * @see iso20022.Namespace
	 * @generated
	 */
	EEnum getNamespace();

	/**
	 * Returns the meta object for enum '{@link iso20022.SchemaTypeKind <em>Schema Type Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Schema Type Kind</em>'.
	 * @see iso20022.SchemaTypeKind
	 * @generated
	 */
	EEnum getSchemaTypeKind();

	/**
	 * Returns the meta object for enum '{@link iso20022.ISO20022Version <em>ISO20022 Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ISO20022 Version</em>'.
	 * @see iso20022.ISO20022Version
	 * @generated
	 */
	EEnum getISO20022Version();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Iso20022Factory getIso20022Factory();

} //Iso20022Package
