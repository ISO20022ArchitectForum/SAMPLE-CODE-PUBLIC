/**
 */
package iso20022.impl;

import java.lang.String;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import iso20022.BusinessArea;
import iso20022.Iso20022Package;
import iso20022.MessageBuildingBlock;
import iso20022.MessageChoreography;
import iso20022.MessageDefinition;
import iso20022.MessageDefinitionIdentifier;
import iso20022.MessageSet;
import iso20022.MessageTransmission;
import iso20022.SyntaxMessageScheme;
import iso20022.Xor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso20022.impl.MessageDefinitionImpl#getMessageSet <em>Message Set</em>}</li>
 *   <li>{@link iso20022.impl.MessageDefinitionImpl#getXmlName <em>Xml Name</em>}</li>
 *   <li>{@link iso20022.impl.MessageDefinitionImpl#getXmlTag <em>Xml Tag</em>}</li>
 *   <li>{@link iso20022.impl.MessageDefinitionImpl#getBusinessArea <em>Business Area</em>}</li>
 *   <li>{@link iso20022.impl.MessageDefinitionImpl#getXors <em>Xors</em>}</li>
 *   <li>{@link iso20022.impl.MessageDefinitionImpl#getRootElement <em>Root Element</em>}</li>
 *   <li>{@link iso20022.impl.MessageDefinitionImpl#getMessageBuildingBlock <em>Message Building Block</em>}</li>
 *   <li>{@link iso20022.impl.MessageDefinitionImpl#getChoreography <em>Choreography</em>}</li>
 *   <li>{@link iso20022.impl.MessageDefinitionImpl#getTrace <em>Trace</em>}</li>
 *   <li>{@link iso20022.impl.MessageDefinitionImpl#getMessageDefinitionIdentifier <em>Message Definition Identifier</em>}</li>
 *   <li>{@link iso20022.impl.MessageDefinitionImpl#getDerivation <em>Derivation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MessageDefinitionImpl extends RepositoryTypeImpl implements MessageDefinition {
	/**
	 * The cached value of the '{@link #getMessageSet() <em>Message Set</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageSet()
	 * @generated
	 * @ordered
	 */
	protected EList<MessageSet> messageSet;

	/**
	 * The default value of the '{@link #getXmlName() <em>Xml Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXmlName()
	 * @generated
	 * @ordered
	 */
	protected static final String XML_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXmlName() <em>Xml Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXmlName()
	 * @generated
	 * @ordered
	 */
	protected String xmlName = XML_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getXmlTag() <em>Xml Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXmlTag()
	 * @generated
	 * @ordered
	 */
	protected static final String XML_TAG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXmlTag() <em>Xml Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXmlTag()
	 * @generated
	 * @ordered
	 */
	protected String xmlTag = XML_TAG_EDEFAULT;

	/**
	 * The cached value of the '{@link #getXors() <em>Xors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXors()
	 * @generated
	 * @ordered
	 */
	protected EList<Xor> xors;

	/**
	 * The default value of the '{@link #getRootElement() <em>Root Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootElement()
	 * @generated
	 * @ordered
	 */
	protected static final String ROOT_ELEMENT_EDEFAULT = "Document";

	/**
	 * The cached value of the '{@link #getRootElement() <em>Root Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootElement()
	 * @generated
	 * @ordered
	 */
	protected String rootElement = ROOT_ELEMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMessageBuildingBlock() <em>Message Building Block</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageBuildingBlock()
	 * @generated
	 * @ordered
	 */
	protected EList<MessageBuildingBlock> messageBuildingBlock;

	/**
	 * The cached value of the '{@link #getChoreography() <em>Choreography</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChoreography()
	 * @generated
	 * @ordered
	 */
	protected EList<MessageChoreography> choreography;

	/**
	 * The cached value of the '{@link #getTrace() <em>Trace</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrace()
	 * @generated
	 * @ordered
	 */
	protected EList<MessageTransmission> trace;

	/**
	 * The cached value of the '{@link #getMessageDefinitionIdentifier() <em>Message Definition Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageDefinitionIdentifier()
	 * @generated
	 * @ordered
	 */
	protected MessageDefinitionIdentifier messageDefinitionIdentifier;

	/**
	 * The cached value of the '{@link #getDerivation() <em>Derivation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivation()
	 * @generated
	 * @ordered
	 */
	protected EList<SyntaxMessageScheme> derivation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Iso20022Package.eINSTANCE.getMessageDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MessageSet> getMessageSet() {
		if (messageSet == null) {
			messageSet = new EObjectWithInverseResolvingEList.ManyInverse<MessageSet>(MessageSet.class, this, Iso20022Package.MESSAGE_DEFINITION__MESSAGE_SET, Iso20022Package.MESSAGE_SET__MESSAGE_DEFINITION);
		}
		return messageSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getXmlName() {
		return xmlName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXmlName(String newXmlName) {
		String oldXmlName = xmlName;
		xmlName = newXmlName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Iso20022Package.MESSAGE_DEFINITION__XML_NAME, oldXmlName, xmlName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getXmlTag() {
		return xmlTag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXmlTag(String newXmlTag) {
		String oldXmlTag = xmlTag;
		xmlTag = newXmlTag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Iso20022Package.MESSAGE_DEFINITION__XML_TAG, oldXmlTag, xmlTag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessArea getBusinessArea() {
		if (eContainerFeatureID() != Iso20022Package.MESSAGE_DEFINITION__BUSINESS_AREA) return null;
		return (BusinessArea)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBusinessArea(BusinessArea newBusinessArea, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newBusinessArea, Iso20022Package.MESSAGE_DEFINITION__BUSINESS_AREA, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBusinessArea(BusinessArea newBusinessArea) {
		if (newBusinessArea != eInternalContainer() || (eContainerFeatureID() != Iso20022Package.MESSAGE_DEFINITION__BUSINESS_AREA && newBusinessArea != null)) {
			if (EcoreUtil.isAncestor(this, newBusinessArea))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newBusinessArea != null)
				msgs = ((InternalEObject)newBusinessArea).eInverseAdd(this, Iso20022Package.BUSINESS_AREA__MESSAGE_DEFINITION, BusinessArea.class, msgs);
			msgs = basicSetBusinessArea(newBusinessArea, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Iso20022Package.MESSAGE_DEFINITION__BUSINESS_AREA, newBusinessArea, newBusinessArea));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Xor> getXors() {
		if (xors == null) {
			xors = new EObjectContainmentWithInverseEList<Xor>(Xor.class, this, Iso20022Package.MESSAGE_DEFINITION__XORS, Iso20022Package.XOR__MESSAGE_DEFINITION);
		}
		return xors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRootElement() {
		return rootElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRootElement(String newRootElement) {
		String oldRootElement = rootElement;
		rootElement = newRootElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Iso20022Package.MESSAGE_DEFINITION__ROOT_ELEMENT, oldRootElement, rootElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MessageBuildingBlock> getMessageBuildingBlock() {
		if (messageBuildingBlock == null) {
			messageBuildingBlock = new EObjectContainmentEList<MessageBuildingBlock>(MessageBuildingBlock.class, this, Iso20022Package.MESSAGE_DEFINITION__MESSAGE_BUILDING_BLOCK);
		}
		return messageBuildingBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MessageChoreography> getChoreography() {
		if (choreography == null) {
			choreography = new EObjectWithInverseResolvingEList.ManyInverse<MessageChoreography>(MessageChoreography.class, this, Iso20022Package.MESSAGE_DEFINITION__CHOREOGRAPHY, Iso20022Package.MESSAGE_CHOREOGRAPHY__MESSAGE_DEFINITION);
		}
		return choreography;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MessageTransmission> getTrace() {
		if (trace == null) {
			trace = new EObjectWithInverseResolvingEList.ManyInverse<MessageTransmission>(MessageTransmission.class, this, Iso20022Package.MESSAGE_DEFINITION__TRACE, Iso20022Package.MESSAGE_TRANSMISSION__DERIVATION);
		}
		return trace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageDefinitionIdentifier getMessageDefinitionIdentifier() {
		return messageDefinitionIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMessageDefinitionIdentifier(MessageDefinitionIdentifier newMessageDefinitionIdentifier, NotificationChain msgs) {
		MessageDefinitionIdentifier oldMessageDefinitionIdentifier = messageDefinitionIdentifier;
		messageDefinitionIdentifier = newMessageDefinitionIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Iso20022Package.MESSAGE_DEFINITION__MESSAGE_DEFINITION_IDENTIFIER, oldMessageDefinitionIdentifier, newMessageDefinitionIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageDefinitionIdentifier(MessageDefinitionIdentifier newMessageDefinitionIdentifier) {
		if (newMessageDefinitionIdentifier != messageDefinitionIdentifier) {
			NotificationChain msgs = null;
			if (messageDefinitionIdentifier != null)
				msgs = ((InternalEObject)messageDefinitionIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Iso20022Package.MESSAGE_DEFINITION__MESSAGE_DEFINITION_IDENTIFIER, null, msgs);
			if (newMessageDefinitionIdentifier != null)
				msgs = ((InternalEObject)newMessageDefinitionIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Iso20022Package.MESSAGE_DEFINITION__MESSAGE_DEFINITION_IDENTIFIER, null, msgs);
			msgs = basicSetMessageDefinitionIdentifier(newMessageDefinitionIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Iso20022Package.MESSAGE_DEFINITION__MESSAGE_DEFINITION_IDENTIFIER, newMessageDefinitionIdentifier, newMessageDefinitionIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SyntaxMessageScheme> getDerivation() {
		if (derivation == null) {
			derivation = new EObjectWithInverseResolvingEList<SyntaxMessageScheme>(SyntaxMessageScheme.class, this, Iso20022Package.MESSAGE_DEFINITION__DERIVATION, Iso20022Package.SYNTAX_MESSAGE_SCHEME__MESSAGE_DEFINITION_TRACE);
		}
		return derivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean BusinessAreaNameMatch(Map context, DiagnosticChain diagnostics) {
		// TODO: implement this method >>> DONE
		// Ensure that you remove @generated or mark it @generated NOT
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Iso20022Package.MESSAGE_DEFINITION__MESSAGE_SET:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMessageSet()).basicAdd(otherEnd, msgs);
			case Iso20022Package.MESSAGE_DEFINITION__BUSINESS_AREA:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetBusinessArea((BusinessArea)otherEnd, msgs);
			case Iso20022Package.MESSAGE_DEFINITION__XORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getXors()).basicAdd(otherEnd, msgs);
			case Iso20022Package.MESSAGE_DEFINITION__CHOREOGRAPHY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChoreography()).basicAdd(otherEnd, msgs);
			case Iso20022Package.MESSAGE_DEFINITION__TRACE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTrace()).basicAdd(otherEnd, msgs);
			case Iso20022Package.MESSAGE_DEFINITION__DERIVATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDerivation()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Iso20022Package.MESSAGE_DEFINITION__MESSAGE_SET:
				return ((InternalEList<?>)getMessageSet()).basicRemove(otherEnd, msgs);
			case Iso20022Package.MESSAGE_DEFINITION__BUSINESS_AREA:
				return basicSetBusinessArea(null, msgs);
			case Iso20022Package.MESSAGE_DEFINITION__XORS:
				return ((InternalEList<?>)getXors()).basicRemove(otherEnd, msgs);
			case Iso20022Package.MESSAGE_DEFINITION__MESSAGE_BUILDING_BLOCK:
				return ((InternalEList<?>)getMessageBuildingBlock()).basicRemove(otherEnd, msgs);
			case Iso20022Package.MESSAGE_DEFINITION__CHOREOGRAPHY:
				return ((InternalEList<?>)getChoreography()).basicRemove(otherEnd, msgs);
			case Iso20022Package.MESSAGE_DEFINITION__TRACE:
				return ((InternalEList<?>)getTrace()).basicRemove(otherEnd, msgs);
			case Iso20022Package.MESSAGE_DEFINITION__MESSAGE_DEFINITION_IDENTIFIER:
				return basicSetMessageDefinitionIdentifier(null, msgs);
			case Iso20022Package.MESSAGE_DEFINITION__DERIVATION:
				return ((InternalEList<?>)getDerivation()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case Iso20022Package.MESSAGE_DEFINITION__BUSINESS_AREA:
				return eInternalContainer().eInverseRemove(this, Iso20022Package.BUSINESS_AREA__MESSAGE_DEFINITION, BusinessArea.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Iso20022Package.MESSAGE_DEFINITION__MESSAGE_SET:
				return getMessageSet();
			case Iso20022Package.MESSAGE_DEFINITION__XML_NAME:
				return getXmlName();
			case Iso20022Package.MESSAGE_DEFINITION__XML_TAG:
				return getXmlTag();
			case Iso20022Package.MESSAGE_DEFINITION__BUSINESS_AREA:
				return getBusinessArea();
			case Iso20022Package.MESSAGE_DEFINITION__XORS:
				return getXors();
			case Iso20022Package.MESSAGE_DEFINITION__ROOT_ELEMENT:
				return getRootElement();
			case Iso20022Package.MESSAGE_DEFINITION__MESSAGE_BUILDING_BLOCK:
				return getMessageBuildingBlock();
			case Iso20022Package.MESSAGE_DEFINITION__CHOREOGRAPHY:
				return getChoreography();
			case Iso20022Package.MESSAGE_DEFINITION__TRACE:
				return getTrace();
			case Iso20022Package.MESSAGE_DEFINITION__MESSAGE_DEFINITION_IDENTIFIER:
				return getMessageDefinitionIdentifier();
			case Iso20022Package.MESSAGE_DEFINITION__DERIVATION:
				return getDerivation();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Iso20022Package.MESSAGE_DEFINITION__MESSAGE_SET:
				getMessageSet().clear();
				getMessageSet().addAll((Collection<? extends MessageSet>)newValue);
				return;
			case Iso20022Package.MESSAGE_DEFINITION__XML_NAME:
				setXmlName((String)newValue);
				return;
			case Iso20022Package.MESSAGE_DEFINITION__XML_TAG:
				setXmlTag((String)newValue);
				return;
			case Iso20022Package.MESSAGE_DEFINITION__BUSINESS_AREA:
				setBusinessArea((BusinessArea)newValue);
				return;
			case Iso20022Package.MESSAGE_DEFINITION__XORS:
				getXors().clear();
				getXors().addAll((Collection<? extends Xor>)newValue);
				return;
			case Iso20022Package.MESSAGE_DEFINITION__ROOT_ELEMENT:
				setRootElement((String)newValue);
				return;
			case Iso20022Package.MESSAGE_DEFINITION__MESSAGE_BUILDING_BLOCK:
				getMessageBuildingBlock().clear();
				getMessageBuildingBlock().addAll((Collection<? extends MessageBuildingBlock>)newValue);
				return;
			case Iso20022Package.MESSAGE_DEFINITION__CHOREOGRAPHY:
				getChoreography().clear();
				getChoreography().addAll((Collection<? extends MessageChoreography>)newValue);
				return;
			case Iso20022Package.MESSAGE_DEFINITION__TRACE:
				getTrace().clear();
				getTrace().addAll((Collection<? extends MessageTransmission>)newValue);
				return;
			case Iso20022Package.MESSAGE_DEFINITION__MESSAGE_DEFINITION_IDENTIFIER:
				setMessageDefinitionIdentifier((MessageDefinitionIdentifier)newValue);
				return;
			case Iso20022Package.MESSAGE_DEFINITION__DERIVATION:
				getDerivation().clear();
				getDerivation().addAll((Collection<? extends SyntaxMessageScheme>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Iso20022Package.MESSAGE_DEFINITION__MESSAGE_SET:
				getMessageSet().clear();
				return;
			case Iso20022Package.MESSAGE_DEFINITION__XML_NAME:
				setXmlName(XML_NAME_EDEFAULT);
				return;
			case Iso20022Package.MESSAGE_DEFINITION__XML_TAG:
				setXmlTag(XML_TAG_EDEFAULT);
				return;
			case Iso20022Package.MESSAGE_DEFINITION__BUSINESS_AREA:
				setBusinessArea((BusinessArea)null);
				return;
			case Iso20022Package.MESSAGE_DEFINITION__XORS:
				getXors().clear();
				return;
			case Iso20022Package.MESSAGE_DEFINITION__ROOT_ELEMENT:
				setRootElement(ROOT_ELEMENT_EDEFAULT);
				return;
			case Iso20022Package.MESSAGE_DEFINITION__MESSAGE_BUILDING_BLOCK:
				getMessageBuildingBlock().clear();
				return;
			case Iso20022Package.MESSAGE_DEFINITION__CHOREOGRAPHY:
				getChoreography().clear();
				return;
			case Iso20022Package.MESSAGE_DEFINITION__TRACE:
				getTrace().clear();
				return;
			case Iso20022Package.MESSAGE_DEFINITION__MESSAGE_DEFINITION_IDENTIFIER:
				setMessageDefinitionIdentifier((MessageDefinitionIdentifier)null);
				return;
			case Iso20022Package.MESSAGE_DEFINITION__DERIVATION:
				getDerivation().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Iso20022Package.MESSAGE_DEFINITION__MESSAGE_SET:
				return messageSet != null && !messageSet.isEmpty();
			case Iso20022Package.MESSAGE_DEFINITION__XML_NAME:
				return XML_NAME_EDEFAULT == null ? xmlName != null : !XML_NAME_EDEFAULT.equals(xmlName);
			case Iso20022Package.MESSAGE_DEFINITION__XML_TAG:
				return XML_TAG_EDEFAULT == null ? xmlTag != null : !XML_TAG_EDEFAULT.equals(xmlTag);
			case Iso20022Package.MESSAGE_DEFINITION__BUSINESS_AREA:
				return getBusinessArea() != null;
			case Iso20022Package.MESSAGE_DEFINITION__XORS:
				return xors != null && !xors.isEmpty();
			case Iso20022Package.MESSAGE_DEFINITION__ROOT_ELEMENT:
				return ROOT_ELEMENT_EDEFAULT == null ? rootElement != null : !ROOT_ELEMENT_EDEFAULT.equals(rootElement);
			case Iso20022Package.MESSAGE_DEFINITION__MESSAGE_BUILDING_BLOCK:
				return messageBuildingBlock != null && !messageBuildingBlock.isEmpty();
			case Iso20022Package.MESSAGE_DEFINITION__CHOREOGRAPHY:
				return choreography != null && !choreography.isEmpty();
			case Iso20022Package.MESSAGE_DEFINITION__TRACE:
				return trace != null && !trace.isEmpty();
			case Iso20022Package.MESSAGE_DEFINITION__MESSAGE_DEFINITION_IDENTIFIER:
				return messageDefinitionIdentifier != null;
			case Iso20022Package.MESSAGE_DEFINITION__DERIVATION:
				return derivation != null && !derivation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case Iso20022Package.MESSAGE_DEFINITION___BUSINESS_AREA_NAME_MATCH__MAP_DIAGNOSTICCHAIN:
				return BusinessAreaNameMatch((Map)arguments.get(0), (DiagnosticChain)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (xmlName: ");
		result.append(xmlName);
		result.append(", xmlTag: ");
		result.append(xmlTag);
		result.append(", rootElement: ");
		result.append(rootElement);
		result.append(')');
		return result.toString();
	}

} //MessageDefinitionImpl
