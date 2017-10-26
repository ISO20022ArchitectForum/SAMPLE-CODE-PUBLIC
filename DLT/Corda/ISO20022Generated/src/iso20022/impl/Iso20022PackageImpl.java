/**
 */
package iso20022.impl;

import java.io.IOException;
import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

import iso20022.Iso20022Factory;
import iso20022.Iso20022Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Iso20022PackageImpl extends EPackageImpl implements Iso20022Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected String packageFilename = "iso20022.ecore";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addressEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass broadcastListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messagingEndpointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageTransportSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transportMessageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass syntaxMessageSchemeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass topLevelCatalogueEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass repositoryConceptEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass semanticMarkupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass semanticMarkupElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass docletEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass businessProcessCatalogueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass repositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataDictionaryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass topLevelDictionaryEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass repositoryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass syntaxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass encodingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass businessAreaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageConstructEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constructEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiplicityEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logicalTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageConceptEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass businessComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass businessElementTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass businessConceptEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass businessElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageComponentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageBuildingBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass businessAssociationEndEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageElementContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageChoreographyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass businessTransactionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass businessProcessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass businessRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass participantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass receiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageTransmissionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sendEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageTransportModeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageDefinitionIdentifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conversationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageAssociationEndEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass businessAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identifierSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass indicatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decimalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalSchemaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass quantityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass amountEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass choiceComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractDateTimeConceptEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endPointCategoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateTimeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass durationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass monthEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass monthDayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yearEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yearMonthEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userDefinedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass industryMessageSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass convergenceDocumentationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iso15022MessageSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schemaTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum registrationStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum aggregationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum deliveryAssuranceEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum durabilityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum messageCastingEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum messageDeliveryOrderEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum messageValidationLevelEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum messageValidationOnOffEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum messageValidationResultsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum receiverAsynchronicityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum senderAsynchronicityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum processContentEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum namespaceEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum schemaTypeKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum iso20022VersionEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see iso20022.Iso20022Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Iso20022PackageImpl() {
		super(eNS_URI, Iso20022Factory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link Iso20022Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static Iso20022Package init() {
		if (isInited) return (Iso20022Package)EPackage.Registry.INSTANCE.getEPackage(Iso20022Package.eNS_URI);

		// Obtain or create and register package
		Iso20022PackageImpl theIso20022Package = (Iso20022PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Iso20022PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Iso20022PackageImpl());

		isInited = true;

		// Load packages
		theIso20022Package.loadPackage();

		// Fix loaded packages
		theIso20022Package.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theIso20022Package.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Iso20022Package.eNS_URI, theIso20022Package);
		return theIso20022Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddress() {
		if (addressEClass == null) {
			addressEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Iso20022Package.eNS_URI).getEClassifiers().get(0);
		}
		return addressEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddress_BroadCastList() {
        return (EReference)getAddress().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddress_Endpoint() {
        return (EReference)getAddress().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelEntity() {
		if (modelEntityEClass == null) {
			modelEntityEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Iso20022Package.eNS_URI).getEClassifiers().get(1);
		}
		return modelEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelEntity_NextVersions() {
        return (EReference)getModelEntity().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelEntity_PreviousVersion() {
        return (EReference)getModelEntity().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelEntity_ObjectIdentifier() {
        return (EAttribute)getModelEntity().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBroadcastList() {
		if (broadcastListEClass == null) {
			broadcastListEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Iso20022Package.eNS_URI).getEClassifiers().get(2);
		}
		return broadcastListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBroadcastList_Address() {
        return (EReference)getBroadcastList().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessagingEndpoint() {
		if (messagingEndpointEClass == null) {
			messagingEndpointEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Iso20022Package.eNS_URI).getEClassifiers().get(3);
		}
		return messagingEndpointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessagingEndpoint_TransportSystem() {
        return (EReference)getMessagingEndpoint().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessagingEndpoint_ReceivedMessage() {
        return (EReference)getMessagingEndpoint().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessagingEndpoint_SentMessage() {
        return (EReference)getMessagingEndpoint().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessagingEndpoint_Location() {
        return (EReference)getMessagingEndpoint().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageTransportSystem() {
		if (messageTransportSystemEClass == null) {
			messageTransportSystemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Iso20022Package.eNS_URI).getEClassifiers().get(4);
		}
		return messageTransportSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageTransportSystem_Endpoint() {
        return (EReference)getMessageTransportSystem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransportMessage() {
		if (transportMessageEClass == null) {
			transportMessageEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Iso20022Package.eNS_URI).getEClassifiers().get(5);
		}
		return transportMessageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransportMessage_Sender() {
        return (EReference)getTransportMessage().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransportMessage_MessageInstance() {
        return (EReference)getTransportMessage().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransportMessage_Receiver() {
        return (EReference)getTransportMessage().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTransportMessage__SameMessageTransportSystem__Map_DiagnosticChain() {
        return getTransportMessage().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageInstance() {
		if (messageInstanceEClass == null) {
			messageInstanceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Iso20022Package.eNS_URI).getEClassifiers().get(6);
		}
		return messageInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageInstance_Specification() {
        return (EReference)getMessageInstance().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageInstance_TransportMessage() {
        return (EReference)getMessageInstance().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSyntaxMessageScheme() {
		if (syntaxMessageSchemeEClass == null) {
			syntaxMessageSchemeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Iso20022Package.eNS_URI).getEClassifiers().get(7);
		}
		return syntaxMessageSchemeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSyntaxMessageScheme_MessageDefinitionTrace() {
        return (EReference)getSyntaxMessageScheme().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTopLevelCatalogueEntry() {
		if (topLevelCatalogueEntryEClass == null) {
			topLevelCatalogueEntryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Iso20022Package.eNS_URI).getEClassifiers().get(8);
		}
		return topLevelCatalogueEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTopLevelCatalogueEntry_BusinessProcessCatalogue() {
        return (EReference)getTopLevelCatalogueEntry().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRepositoryConcept() {
		if (repositoryConceptEClass == null) {
			repositoryConceptEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Iso20022Package.eNS_URI).getEClassifiers().get(9);
		}
		return repositoryConceptEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepositoryConcept_Name() {
        return (EAttribute)getRepositoryConcept().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepositoryConcept_Definition() {
        return (EAttribute)getRepositoryConcept().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepositoryConcept_SemanticMarkup() {
        return (EReference)getRepositoryConcept().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepositoryConcept_Doclet() {
        return (EReference)getRepositoryConcept().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepositoryConcept_Example() {
        return (EAttribute)getRepositoryConcept().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepositoryConcept_Constraint() {
        return (EReference)getRepositoryConcept().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepositoryConcept_RegistrationStatus() {
        return (EAttribute)getRepositoryConcept().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepositoryConcept_RemovalDate() {
        return (EAttribute)getRepositoryConcept().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRepositoryConcept__RemovalDateRegistrationStatus__Map_DiagnosticChain() {
        return getRepositoryConcept().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRepositoryConcept__NameFirstLetterUppercase__Map_DiagnosticChain() {
        return getRepositoryConcept().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSemanticMarkup() {
		if (semanticMarkupEClass == null) {
			semanticMarkupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Iso20022Package.eNS_URI).getEClassifiers().get(10);
		}
		return semanticMarkupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSemanticMarkup_Type() {
        return (EAttribute)getSemanticMarkup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemanticMarkup_Elements() {
        return (EReference)getSemanticMarkup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSemanticMarkupElement() {
		if (semanticMarkupElementEClass == null) {
			semanticMarkupElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Iso20022Package.eNS_URI).getEClassifiers().get(11);
		}
		return semanticMarkupElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSemanticMarkupElement_Name() {
        return (EAttribute)getSemanticMarkupElement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSemanticMarkupElement_Value() {
        return (EAttribute)getSemanticMarkupElement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDoclet() {
		if (docletEClass == null) {
			docletEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Iso20022Package.eNS_URI).getEClassifiers().get(12);
		}
		return docletEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDoclet_Type() {
        return (EAttribute)getDoclet().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDoclet_Content() {
        return (EAttribute)getDoclet().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraint() {
		if (constraintEClass == null) {
			constraintEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Iso20022Package.eNS_URI).getEClassifiers().get(13);
		}
		return constraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstraint_Expression() {
        return (EAttribute)getConstraint().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstraint_ExpressionLanguage() {
        return (EAttribute)getConstraint().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraint_Owner() {
        return (EReference)getConstraint().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusinessProcessCatalogue() {
		if (businessProcessCatalogueEClass == null) {
			businessProcessCatalogueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Iso20022Package.eNS_URI).getEClassifiers().get(15);
		}
		return businessProcessCatalogueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessProcessCatalogue_Repository() {
        return (EReference)getBusinessProcessCatalogue().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessProcessCatalogue_TopLevelCatalogueEntry() {
        return (EReference)getBusinessProcessCatalogue().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBusinessProcessCatalogue__EntriesHaveUniqueName__Map_DiagnosticChain() {
        return getBusinessProcessCatalogue().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRepository() {
		if (repositoryEClass == null) {
			repositoryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Iso20022Package.eNS_URI).getEClassifiers().get(16);
		}
		return repositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepository_DataDictionary() {
        return (EReference)getRepository().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepository_BusinessProcessCatalogue() {
        return (EReference)getRepository().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataDictionary() {
		if (dataDictionaryEClass == null) {
			dataDictionaryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Iso20022Package.eNS_URI).getEClassifiers().get(17);
		}
		return dataDictionaryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataDictionary_TopLevelDictionaryEntry() {
        return (EReference)getDataDictionary().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataDictionary_Repository() {
        return (EReference)getDataDictionary().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataDictionary__EntriesHaveUniqueName__Map_DiagnosticChain() {
        return getDataDictionary().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTopLevelDictionaryEntry() {
		if (topLevelDictionaryEntryEClass == null) {
			topLevelDictionaryEntryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Iso20022Package.eNS_URI).getEClassifiers().get(18);
		}
		return topLevelDictionaryEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTopLevelDictionaryEntry_DataDictionary() {
        return (EReference)getTopLevelDictionaryEntry().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageDefinition() {
		if (messageDefinitionEClass == null) {
			messageDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Iso20022Package.eNS_URI).getEClassifiers().get(19);
		}
		return messageDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDefinition_MessageSet() {
        return (EReference)getMessageDefinition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessageDefinition_XmlName() {
        return (EAttribute)getMessageDefinition().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessageDefinition_XmlTag() {
        return (EAttribute)getMessageDefinition().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDefinition_BusinessArea() {
        return (EReference)getMessageDefinition().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDefinition_Xors() {
        return (EReference)getMessageDefinition().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessageDefinition_RootElement() {
        return (EAttribute)getMessageDefinition().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDefinition_MessageBuildingBlock() {
        return (EReference)getMessageDefinition().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDefinition_Choreography() {
        return (EReference)getMessageDefinition().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDefinition_Trace() {
        return (EReference)getMessageDefinition().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDefinition_MessageDefinitionIdentifier() {
        return (EReference)getMessageDefinition().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDefinition_Derivation() {
        return (EReference)getMessageDefinition().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMessageDefinition__BusinessAreaNameMatch__Map_DiagnosticChain() {
        return getMessageDefinition().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRepositoryType() {
		if (repositoryTypeEClass == null) {
			repositoryTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Iso20022Package.eNS_URI).getEClassifiers().get(20);
		}
		return repositoryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageSet() {
		if (messageSetEClass == null) {
			messageSetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Iso20022Package.eNS_URI).getEClassifiers().get(21);
		}
		return messageSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageSet_GeneratedSyntax() {
        return (EReference)getMessageSet().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageSet_ValidEncoding() {
        return (EReference)getMessageSet().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageSet_MessageDefinition() {
        return (EReference)getMessageSet().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMessageSet__GeneratedSyntaxDerivation__Map_DiagnosticChain() {
        return getMessageSet().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSyntax() {
		if (syntaxEClass == null) {
			syntaxEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Iso20022Package.eNS_URI).getEClassifiers().get(22);
		}
		return syntaxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSyntax_PossibleEncodings() {
        return (EReference)getSyntax().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSyntax_GeneratedFor() {
        return (EReference)getSyntax().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSyntax__GeneratedForDerivation__Map_DiagnosticChain() {
        return getSyntax().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEncoding() {
		if (encodingEClass == null) {
			encodingEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Iso20022Package.eNS_URI).getEClassifiers().get(23);
		}
		return encodingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncoding_MessageSet() {
        return (EReference)getEncoding().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncoding_Syntax() {
        return (EReference)getEncoding().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusinessArea() {
		if (businessAreaEClass == null) {
			businessAreaEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Iso20022Package.eNS_URI).getEClassifiers().get(24);
		}
		return businessAreaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBusinessArea_Code() {
        return (EAttribute)getBusinessArea().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessArea_MessageDefinition() {
        return (EReference)getBusinessArea().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXor() {
		if (xorEClass == null) {
			xorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Iso20022Package.eNS_URI).getEClassifiers().get(25);
		}
		return xorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXor_ImpactedElements() {
        return (EReference)getXor().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXor_MessageComponent() {
        return (EReference)getXor().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXor_ImpactedMessageBuildingBlocks() {
        return (EReference)getXor().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXor_MessageDefinition() {
        return (EReference)getXor().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageElement() {
		if (messageElementEClass == null) {
			messageElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Iso20022Package.eNS_URI).getEClassifiers().get(26);
		}
		return messageElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessageElement_IsTechnical() {
        return (EAttribute)getMessageElement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageElement_BusinessComponentTrace() {
        return (EReference)getMessageElement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageElement_BusinessElementTrace() {
        return (EReference)getMessageElement().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageElement_ComponentContext() {
        return (EReference)getMessageElement().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessageElement_IsDerived() {
        return (EAttribute)getMessageElement().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMessageElement__NoMoreThanOneTrace__Map_DiagnosticChain() {
        return getMessageElement().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMessageElement__CardinalityAlignment__Map_DiagnosticChain() {
        return getMessageElement().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageConstruct() {
		if (messageConstructEClass == null) {
			messageConstructEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Iso20022Package.eNS_URI).getEClassifiers().get(27);
		}
		return messageConstructEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessageConstruct_XmlTag() {
        return (EAttribute)getMessageConstruct().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageConstruct_XmlMemberType() {
        return (EReference)getMessageConstruct().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstruct() {
		if (constructEClass == null) {
			constructEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Iso20022Package.eNS_URI).getEClassifiers().get(28);
		}
		return constructEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstruct_MemberType() {
        return (EReference)getConstruct().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiplicityEntity() {
		if (multiplicityEntityEClass == null) {
			multiplicityEntityEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Iso20022Package.eNS_URI).getEClassifiers().get(29);
		}
		return multiplicityEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiplicityEntity_MaxOccurs() {
        return (EAttribute)getMultiplicityEntity().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiplicityEntity_MinOccurs() {
        return (EAttribute)getMultiplicityEntity().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogicalType() {
		if (logicalTypeEClass == null) {
			logicalTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Iso20022Package.eNS_URI).getEClassifiers().get(30);
		}
		return logicalTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageConcept() {
		if (messageConceptEClass == null) {
			messageConceptEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Iso20022Package.eNS_URI).getEClassifiers().get(31);
		}
		return messageConceptEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusinessComponent() {
		if (businessComponentEClass == null) {
			businessComponentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Iso20022Package.eNS_URI).getEClassifiers().get(32);
		}
		return businessComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessComponent_SubType() {
        return (EReference)getBusinessComponent().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessComponent_SuperType() {
        return (EReference)getBusinessComponent().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessComponent_Element() {
        return (EReference)getBusinessComponent().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessComponent_DerivationComponent() {
        return (EReference)getBusinessComponent().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessComponent_AssociationDomain() {
        return (EReference)getBusinessComponent().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessComponent_DerivationElement() {
        return (EReference)getBusinessComponent().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBusinessComponent__BusinessElementsHaveUniqueNames__Map_DiagnosticChain() {
        return getBusinessComponent().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusinessElementType() {
		if (businessElementTypeEClass == null) {
			businessElementTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Iso20022Package.eNS_URI).getEClassifiers().get(33);
		}
		return businessElementTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusinessConcept() {
		if (businessConceptEClass == null) {
			businessConceptEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Iso20022Package.eNS_URI).getEClassifiers().get(34);
		}
		return businessConceptEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusinessElement() {
		if (businessElementEClass == null) {
			businessElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Iso20022Package.eNS_URI).getEClassifiers().get(35);
		}
		return businessElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBusinessElement_IsDerived() {
        return (EAttribute)getBusinessElement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessElement_Derivation() {
        return (EReference)getBusinessElement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessElement_BusinessElementType() {
        return (EReference)getBusinessElement().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessElement_ElementContext() {
        return (EReference)getBusinessElement().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageComponentType() {
		if (messageComponentTypeEClass == null) {
			messageComponentTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Iso20022Package.eNS_URI).getEClassifiers().get(36);
		}
		return messageComponentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageComponentType_MessageBuildingBlock() {
        return (EReference)getMessageComponentType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessageComponentType_IsTechnical() {
        return (EAttribute)getMessageComponentType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageComponentType_Trace() {
        return (EReference)getMessageComponentType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageBuildingBlock() {
		if (messageBuildingBlockEClass == null) {
			messageBuildingBlockEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Iso20022Package.eNS_URI).getEClassifiers().get(37);
		}
		return messageBuildingBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageBuildingBlock_SimpleType() {
        return (EReference)getMessageBuildingBlock().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageBuildingBlock_ComplexType() {
        return (EReference)getMessageBuildingBlock().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMessageBuildingBlock__MessageBuildingBlockHasExactlyOneType__Map_DiagnosticChain() {
        return getMessageBuildingBlock().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataType() {
		if (dataTypeEClass == null) {
			dataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Iso20022Package.eNS_URI).getEClassifiers().get(38);
		}
		return dataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusinessAssociationEnd() {
		if (businessAssociationEndEClass == null) {
			businessAssociationEndEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Iso20022Package.eNS_URI).getEClassifiers().get(39);
		}
		return businessAssociationEndEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessAssociationEnd_Opposite() {
        return (EReference)getBusinessAssociationEnd().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBusinessAssociationEnd_Aggregation() {
        return (EAttribute)getBusinessAssociationEnd().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessAssociationEnd_Type() {
        return (EReference)getBusinessAssociationEnd().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBusinessAssociationEnd__AtMostOneAggregatedEnd__Map_DiagnosticChain() {
        return getBusinessAssociationEnd().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBusinessAssociationEnd__ContextConsistentWithType__Map_DiagnosticChain() {
        return getBusinessAssociationEnd().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageElementContainer() {
		if (messageElementContainerEClass == null) {
			messageElementContainerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Iso20022Package.eNS_URI).getEClassifiers().get(41);
		}
		return messageElementContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageElementContainer_MessageElement() {
        return (EReference)getMessageElementContainer().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMessageElementContainer__MessageElementsHaveUniqueNames__Map_DiagnosticChain() {
        return getMessageElementContainer().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMessageElementContainer__TechnicalElement__Map_DiagnosticChain() {
        return getMessageElementContainer().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageComponent() {
		if (messageComponentEClass == null) {
			messageComponentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Iso20022Package.eNS_URI).getEClassifiers().get(42);
		}
		return messageComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageComponent_Xors() {
        return (EReference)getMessageComponent().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageChoreography() {
		if (messageChoreographyEClass == null) {
			messageChoreographyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Iso20022Package.eNS_URI).getEClassifiers().get(43);
		}
		return messageChoreographyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageChoreography_BusinessTransactionTrace() {
        return (EReference)getMessageChoreography().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageChoreography_MessageDefinition() {
        return (EReference)getMessageChoreography().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusinessTransaction() {
		if (businessTransactionEClass == null) {
			businessTransactionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Iso20022Package.eNS_URI).getEClassifiers().get(44);
		}
		return businessTransactionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessTransaction_BusinessProcessTrace() {
        return (EReference)getBusinessTransaction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessTransaction_Participant() {
        return (EReference)getBusinessTransaction().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessTransaction_Transmission() {
        return (EReference)getBusinessTransaction().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessTransaction_MessageTransportMode() {
        return (EReference)getBusinessTransaction().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessTransaction_SubTransaction() {
        return (EReference)getBusinessTransaction().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessTransaction_ParentTransaction() {
        return (EReference)getBusinessTransaction().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessTransaction_Trace() {
        return (EReference)getBusinessTransaction().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBusinessTransaction__MessageTransmissionsHaveUniqueNames__Map_DiagnosticChain() {
        return getBusinessTransaction().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBusinessTransaction__ParticipantsHaveUniqueNames__Map_DiagnosticChain() {
        return getBusinessTransaction().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusinessProcess() {
		if (businessProcessEClass == null) {
			businessProcessEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Iso20022Package.eNS_URI).getEClassifiers().get(45);
		}
		return businessProcessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessProcess_Extender() {
        return (EReference)getBusinessProcess().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessProcess_Extended() {
        return (EReference)getBusinessProcess().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessProcess_Included() {
        return (EReference)getBusinessProcess().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessProcess_Includer() {
        return (EReference)getBusinessProcess().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessProcess_BusinessRole() {
        return (EReference)getBusinessProcess().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessProcess_BusinessProcessTrace() {
        return (EReference)getBusinessProcess().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusinessRole() {
		if (businessRoleEClass == null) {
			businessRoleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Iso20022Package.eNS_URI).getEClassifiers().get(46);
		}
		return businessRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessRole_BusinessRoleTrace() {
        return (EReference)getBusinessRole().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessRole_BusinessProcess() {
        return (EReference)getBusinessRole().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParticipant() {
		if (participantEClass == null) {
			participantEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Iso20022Package.eNS_URI).getEClassifiers().get(47);
		}
		return participantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParticipant_BusinessTransaction() {
        return (EReference)getParticipant().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParticipant_Receives() {
        return (EReference)getParticipant().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParticipant_Sends() {
        return (EReference)getParticipant().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParticipant_BusinessRoleTrace() {
        return (EReference)getParticipant().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReceive() {
		if (receiveEClass == null) {
			receiveEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Iso20022Package.eNS_URI).getEClassifiers().get(48);
		}
		return receiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReceive_MessageTransmission() {
        return (EReference)getReceive().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReceive_Receiver() {
        return (EReference)getReceive().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageTransmission() {
		if (messageTransmissionEClass == null) {
			messageTransmissionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Iso20022Package.eNS_URI).getEClassifiers().get(49);
		}
		return messageTransmissionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageTransmission_BusinessTransaction() {
        return (EReference)getMessageTransmission().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageTransmission_Derivation() {
        return (EReference)getMessageTransmission().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessageTransmission_MessageTypeDescription() {
        return (EAttribute)getMessageTransmission().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageTransmission_Send() {
        return (EReference)getMessageTransmission().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageTransmission_Receive() {
        return (EReference)getMessageTransmission().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSend() {
		if (sendEClass == null) {
			sendEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Iso20022Package.eNS_URI).getEClassifiers().get(50);
		}
		return sendEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSend_Sender() {
        return (EReference)getSend().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSend_MessageTransmission() {
        return (EReference)getSend().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageTransportMode() {
		if (messageTransportModeEClass == null) {
			messageTransportModeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Iso20022Package.eNS_URI).getEClassifiers().get(51);
		}
		return messageTransportModeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessageTransportMode_BoundedCommunicationDelay() {
        return (EAttribute)getMessageTransportMode().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessageTransportMode_MaximumClockVariation() {
        return (EAttribute)getMessageTransportMode().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessageTransportMode_MaximumMessageSize() {
        return (EAttribute)getMessageTransportMode().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessageTransportMode_MessageDeliveryWindow() {
        return (EAttribute)getMessageTransportMode().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessageTransportMode_MessageSendingWindow() {
        return (EAttribute)getMessageTransportMode().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessageTransportMode_DeliveryAssurance() {
        return (EAttribute)getMessageTransportMode().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessageTransportMode_Durability() {
        return (EAttribute)getMessageTransportMode().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessageTransportMode_MessageCasting() {
        return (EAttribute)getMessageTransportMode().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessageTransportMode_MessageDeliveryOrder() {
        return (EAttribute)getMessageTransportMode().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessageTransportMode_MessageValidationLevel() {
        return (EAttribute)getMessageTransportMode().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessageTransportMode_MessageValidationOnOff() {
        return (EAttribute)getMessageTransportMode().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessageTransportMode_MessageValidationResults() {
        return (EAttribute)getMessageTransportMode().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessageTransportMode_ReceiverAsynchronicity() {
        return (EAttribute)getMessageTransportMode().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessageTransportMode_SenderAsynchronicity() {
        return (EAttribute)getMessageTransportMode().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageTransportMode_BusinessTransaction() {
        return (EReference)getMessageTransportMode().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageDefinitionIdentifier() {
		if (messageDefinitionIdentifierEClass == null) {
			messageDefinitionIdentifierEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Iso20022Package.eNS_URI).getEClassifiers().get(61);
		}
		return messageDefinitionIdentifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessageDefinitionIdentifier_BusinessArea() {
        return (EAttribute)getMessageDefinitionIdentifier().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessageDefinitionIdentifier_MessageFunctionality() {
        return (EAttribute)getMessageDefinitionIdentifier().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessageDefinitionIdentifier_Flavour() {
        return (EAttribute)getMessageDefinitionIdentifier().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessageDefinitionIdentifier_Version() {
        return (EAttribute)getMessageDefinitionIdentifier().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConversation() {
		if (conversationEClass == null) {
			conversationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Iso20022Package.eNS_URI).getEClassifiers().get(62);
		}
		return conversationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageAssociationEnd() {
		if (messageAssociationEndEClass == null) {
			messageAssociationEndEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Iso20022Package.eNS_URI).getEClassifiers().get(63);
		}
		return messageAssociationEndEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessageAssociationEnd_IsComposite() {
        return (EAttribute)getMessageAssociationEnd().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageAssociationEnd_Type() {
        return (EReference)getMessageAssociationEnd().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageAttribute() {
		if (messageAttributeEClass == null) {
			messageAttributeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Iso20022Package.eNS_URI).getEClassifiers().get(64);
		}
		return messageAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageAttribute_SimpleType() {
        return (EReference)getMessageAttribute().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageAttribute_ComplexType() {
        return (EReference)getMessageAttribute().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMessageAttribute__MessageAttributeHasExactlyOneType__Map_DiagnosticChain() {
        return getMessageAttribute().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusinessAttribute() {
		if (businessAttributeEClass == null) {
			businessAttributeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Iso20022Package.eNS_URI).getEClassifiers().get(65);
		}
		return businessAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessAttribute_SimpleType() {
        return (EReference)getBusinessAttribute().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessAttribute_ComplexType() {
        return (EReference)getBusinessAttribute().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBusinessAttribute__BusinessAttributeHasExactlyOneType__Map_DiagnosticChain() {
        return getBusinessAttribute().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBusinessAttribute__NoDerivingCodeSetType__Map_DiagnosticChain() {
        return getBusinessAttribute().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getText() {
		if (textEClass == null) {
			textEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Iso20022Package.eNS_URI).getEClassifiers().get(66);
		}
		return textEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getString() {
		if (stringEClass == null) {
			stringEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Iso20022Package.eNS_URI).getEClassifiers().get(67);
		}
		return stringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getString_MinLength() {
        return (EAttribute)getString().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getString_MaxLength() {
        return (EAttribute)getString().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getString_Length() {
        return (EAttribute)getString().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getString_Pattern() {
        return (EAttribute)getString().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdentifierSet() {
		if (identifierSetEClass == null) {
			identifierSetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Iso20022Package.eNS_URI).getEClassifiers().get(68);
		}
		return identifierSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentifierSet_IdentificationScheme() {
        return (EAttribute)getIdentifierSet().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIndicator() {
		if (indicatorEClass == null) {
			indicatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Iso20022Package.eNS_URI).getEClassifiers().get(69);
		}
		return indicatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndicator_MeaningWhenTrue() {
        return (EAttribute)getIndicator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndicator_MeaningWhenFalse() {
        return (EAttribute)getIndicator().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoolean() {
		if (booleanEClass == null) {
			booleanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Iso20022Package.eNS_URI).getEClassifiers().get(70);
		}
		return booleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBoolean_Pattern() {
        return (EAttribute)getBoolean().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRate() {
		if (rateEClass == null) {
			rateEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Iso20022Package.eNS_URI).getEClassifiers().get(71);
		}
		return rateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRate_BaseValue() {
        return (EAttribute)getRate().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRate_BaseUnitCode() {
        return (EAttribute)getRate().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDecimal() {
		if (decimalEClass == null) {
			decimalEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Iso20022Package.eNS_URI).getEClassifiers().get(72);
		}
		return decimalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDecimal_MinInclusive() {
        return (EAttribute)getDecimal().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDecimal_MinExclusive() {
        return (EAttribute)getDecimal().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDecimal_MaxInclusive() {
        return (EAttribute)getDecimal().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDecimal_MaxExclusive() {
        return (EAttribute)getDecimal().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDecimal_TotalDigits() {
        return (EAttribute)getDecimal().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDecimal_FractionDigits() {
        return (EAttribute)getDecimal().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDecimal_Pattern() {
        return (EAttribute)getDecimal().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternalSchema() {
		if (externalSchemaEClass == null) {
			externalSchemaEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Iso20022Package.eNS_URI).getEClassifiers().get(73);
		}
		return externalSchemaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExternalSchema_NamespaceList() {
        return (EAttribute)getExternalSchema().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExternalSchema_ProcessContent() {
        return (EAttribute)getExternalSchema().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuantity() {
		if (quantityEClass == null) {
			quantityEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Iso20022Package.eNS_URI).getEClassifiers().get(75);
		}
		return quantityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuantity_UnitCode() {
        return (EAttribute)getQuantity().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCode() {
		if (codeEClass == null) {
			codeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Iso20022Package.eNS_URI).getEClassifiers().get(76);
		}
		return codeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCode_CodeName() {
        return (EAttribute)getCode().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCode_Owner() {
        return (EReference)getCode().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCodeSet() {
		if (codeSetEClass == null) {
			codeSetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Iso20022Package.eNS_URI).getEClassifiers().get(77);
		}
		return codeSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeSet_Trace() {
        return (EReference)getCodeSet().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeSet_Derivation() {
        return (EReference)getCodeSet().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCodeSet_IdentificationScheme() {
        return (EAttribute)getCodeSet().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeSet_Code() {
        return (EReference)getCodeSet().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAmount() {
		if (amountEClass == null) {
			amountEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Iso20022Package.eNS_URI).getEClassifiers().get(78);
		}
		return amountEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAmount_CurrencyIdentifierSet() {
        return (EReference)getAmount().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChoiceComponent() {
		if (choiceComponentEClass == null) {
			choiceComponentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Iso20022Package.eNS_URI).getEClassifiers().get(79);
		}
		return choiceComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceComponent__AtLeastOneProperty__Map_DiagnosticChain() {
        return getChoiceComponent().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractDateTimeConcept() {
		if (abstractDateTimeConceptEClass == null) {
			abstractDateTimeConceptEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Iso20022Package.eNS_URI).getEClassifiers().get(81);
		}
		return abstractDateTimeConceptEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractDateTimeConcept_MinInclusive() {
        return (EAttribute)getAbstractDateTimeConcept().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractDateTimeConcept_MinExclusive() {
        return (EAttribute)getAbstractDateTimeConcept().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractDateTimeConcept_MaxInclusive() {
        return (EAttribute)getAbstractDateTimeConcept().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractDateTimeConcept_MaxExclusive() {
        return (EAttribute)getAbstractDateTimeConcept().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractDateTimeConcept_Pattern() {
        return (EAttribute)getAbstractDateTimeConcept().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEndPointCategory() {
		if (endPointCategoryEClass == null) {
			endPointCategoryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Iso20022Package.eNS_URI).getEClassifiers().get(82);
		}
		return endPointCategoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEndPointCategory_EndPoints() {
        return (EReference)getEndPointCategory().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinary() {
		if (binaryEClass == null) {
			binaryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Iso20022Package.eNS_URI).getEClassifiers().get(83);
		}
		return binaryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBinary_MinLength() {
        return (EAttribute)getBinary().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBinary_MaxLength() {
        return (EAttribute)getBinary().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBinary_Length() {
        return (EAttribute)getBinary().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBinary_Pattern() {
        return (EAttribute)getBinary().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDate() {
		if (dateEClass == null) {
			dateEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Iso20022Package.eNS_URI).getEClassifiers().get(84);
		}
		return dateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDateTime() {
		if (dateTimeEClass == null) {
			dateTimeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Iso20022Package.eNS_URI).getEClassifiers().get(85);
		}
		return dateTimeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDay() {
		if (dayEClass == null) {
			dayEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Iso20022Package.eNS_URI).getEClassifiers().get(86);
		}
		return dayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDuration() {
		if (durationEClass == null) {
			durationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Iso20022Package.eNS_URI).getEClassifiers().get(87);
		}
		return durationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMonth() {
		if (monthEClass == null) {
			monthEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Iso20022Package.eNS_URI).getEClassifiers().get(88);
		}
		return monthEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMonthDay() {
		if (monthDayEClass == null) {
			monthDayEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Iso20022Package.eNS_URI).getEClassifiers().get(89);
		}
		return monthDayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTime() {
		if (timeEClass == null) {
			timeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Iso20022Package.eNS_URI).getEClassifiers().get(90);
		}
		return timeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYear() {
		if (yearEClass == null) {
			yearEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Iso20022Package.eNS_URI).getEClassifiers().get(91);
		}
		return yearEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYearMonth() {
		if (yearMonthEClass == null) {
			yearMonthEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Iso20022Package.eNS_URI).getEClassifiers().get(92);
		}
		return yearMonthEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserDefined() {
		if (userDefinedEClass == null) {
			userDefinedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Iso20022Package.eNS_URI).getEClassifiers().get(93);
		}
		return userDefinedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserDefined_Namespace() {
        return (EAttribute)getUserDefined().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserDefined_NamespaceList() {
        return (EAttribute)getUserDefined().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserDefined_ProcessContents() {
        return (EAttribute)getUserDefined().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIndustryMessageSet() {
		if (industryMessageSetEClass == null) {
			industryMessageSetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Iso20022Package.eNS_URI).getEClassifiers().get(94);
		}
		return industryMessageSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConvergenceDocumentation() {
		if (convergenceDocumentationEClass == null) {
			convergenceDocumentationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Iso20022Package.eNS_URI).getEClassifiers().get(95);
		}
		return convergenceDocumentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getISO15022MessageSet() {
		if (iso15022MessageSetEClass == null) {
			iso15022MessageSetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Iso20022Package.eNS_URI).getEClassifiers().get(96);
		}
		return iso15022MessageSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSchemaType() {
		if (schemaTypeEClass == null) {
			schemaTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Iso20022Package.eNS_URI).getEClassifiers().get(97);
		}
		return schemaTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSchemaType_Kind() {
        return (EAttribute)getSchemaType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRegistrationStatus() {
		if (registrationStatusEEnum == null) {
			registrationStatusEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(Iso20022Package.eNS_URI).getEClassifiers().get(14);
		}
		return registrationStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAggregation() {
		if (aggregationEEnum == null) {
			aggregationEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(Iso20022Package.eNS_URI).getEClassifiers().get(40);
		}
		return aggregationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDeliveryAssurance() {
		if (deliveryAssuranceEEnum == null) {
			deliveryAssuranceEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(Iso20022Package.eNS_URI).getEClassifiers().get(52);
		}
		return deliveryAssuranceEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDurability() {
		if (durabilityEEnum == null) {
			durabilityEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(Iso20022Package.eNS_URI).getEClassifiers().get(53);
		}
		return durabilityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMessageCasting() {
		if (messageCastingEEnum == null) {
			messageCastingEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(Iso20022Package.eNS_URI).getEClassifiers().get(54);
		}
		return messageCastingEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMessageDeliveryOrder() {
		if (messageDeliveryOrderEEnum == null) {
			messageDeliveryOrderEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(Iso20022Package.eNS_URI).getEClassifiers().get(55);
		}
		return messageDeliveryOrderEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMessageValidationLevel() {
		if (messageValidationLevelEEnum == null) {
			messageValidationLevelEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(Iso20022Package.eNS_URI).getEClassifiers().get(56);
		}
		return messageValidationLevelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMessageValidationOnOff() {
		if (messageValidationOnOffEEnum == null) {
			messageValidationOnOffEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(Iso20022Package.eNS_URI).getEClassifiers().get(57);
		}
		return messageValidationOnOffEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMessageValidationResults() {
		if (messageValidationResultsEEnum == null) {
			messageValidationResultsEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(Iso20022Package.eNS_URI).getEClassifiers().get(58);
		}
		return messageValidationResultsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getReceiverAsynchronicity() {
		if (receiverAsynchronicityEEnum == null) {
			receiverAsynchronicityEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(Iso20022Package.eNS_URI).getEClassifiers().get(59);
		}
		return receiverAsynchronicityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSenderAsynchronicity() {
		if (senderAsynchronicityEEnum == null) {
			senderAsynchronicityEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(Iso20022Package.eNS_URI).getEClassifiers().get(60);
		}
		return senderAsynchronicityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProcessContent() {
		if (processContentEEnum == null) {
			processContentEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(Iso20022Package.eNS_URI).getEClassifiers().get(74);
		}
		return processContentEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNamespace() {
		if (namespaceEEnum == null) {
			namespaceEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(Iso20022Package.eNS_URI).getEClassifiers().get(80);
		}
		return namespaceEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSchemaTypeKind() {
		if (schemaTypeKindEEnum == null) {
			schemaTypeKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(Iso20022Package.eNS_URI).getEClassifiers().get(98);
		}
		return schemaTypeKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getISO20022Version() {
		if (iso20022VersionEEnum == null) {
			iso20022VersionEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(Iso20022Package.eNS_URI).getEClassifiers().get(99);
		}
		return iso20022VersionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Iso20022Factory getIso20022Factory() {
		return (Iso20022Factory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isLoaded = false;

	/**
	 * Laods the package and any sub-packages from their serialized form.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void loadPackage() {
		if (isLoaded) return;
		isLoaded = true;

		URL url = getClass().getResource(packageFilename);
		if (url == null) {
			throw new RuntimeException("Missing serialized package: " + packageFilename);
		}
		URI uri = URI.createURI(url.toString());
		Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
		try {
			resource.load(null);
		}
		catch (IOException exception) {
			throw new WrappedException(exception);
		}
		initializeFromLoadedEPackage(this, (EPackage)resource.getContents().get(0));
		createResource(eNS_URI);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents() {
		if (isFixed) return;
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier.setInstanceClassName("iso20022." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //Iso20022PackageImpl
