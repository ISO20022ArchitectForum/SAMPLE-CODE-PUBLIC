/**
 */
package iso20022.impl;

import java.lang.String;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import iso20022.Iso20022Package;
import iso20022.MessageDefinitionIdentifier;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message Definition Identifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso20022.impl.MessageDefinitionIdentifierImpl#getBusinessArea <em>Business Area</em>}</li>
 *   <li>{@link iso20022.impl.MessageDefinitionIdentifierImpl#getMessageFunctionality <em>Message Functionality</em>}</li>
 *   <li>{@link iso20022.impl.MessageDefinitionIdentifierImpl#getFlavour <em>Flavour</em>}</li>
 *   <li>{@link iso20022.impl.MessageDefinitionIdentifierImpl#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MessageDefinitionIdentifierImpl extends ModelEntityImpl implements MessageDefinitionIdentifier {
	/**
	 * The default value of the '{@link #getBusinessArea() <em>Business Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessArea()
	 * @generated
	 * @ordered
	 */
	protected static final String BUSINESS_AREA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBusinessArea() <em>Business Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessArea()
	 * @generated
	 * @ordered
	 */
	protected String businessArea = BUSINESS_AREA_EDEFAULT;

	/**
	 * The default value of the '{@link #getMessageFunctionality() <em>Message Functionality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageFunctionality()
	 * @generated
	 * @ordered
	 */
	protected static final String MESSAGE_FUNCTIONALITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMessageFunctionality() <em>Message Functionality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageFunctionality()
	 * @generated
	 * @ordered
	 */
	protected String messageFunctionality = MESSAGE_FUNCTIONALITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getFlavour() <em>Flavour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlavour()
	 * @generated
	 * @ordered
	 */
	protected static final String FLAVOUR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFlavour() <em>Flavour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlavour()
	 * @generated
	 * @ordered
	 */
	protected String flavour = FLAVOUR_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageDefinitionIdentifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Iso20022Package.eINSTANCE.getMessageDefinitionIdentifier();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBusinessArea() {
		return businessArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBusinessArea(String newBusinessArea) {
		String oldBusinessArea = businessArea;
		businessArea = newBusinessArea;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Iso20022Package.MESSAGE_DEFINITION_IDENTIFIER__BUSINESS_AREA, oldBusinessArea, businessArea));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMessageFunctionality() {
		return messageFunctionality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageFunctionality(String newMessageFunctionality) {
		String oldMessageFunctionality = messageFunctionality;
		messageFunctionality = newMessageFunctionality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Iso20022Package.MESSAGE_DEFINITION_IDENTIFIER__MESSAGE_FUNCTIONALITY, oldMessageFunctionality, messageFunctionality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFlavour() {
		return flavour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlavour(String newFlavour) {
		String oldFlavour = flavour;
		flavour = newFlavour;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Iso20022Package.MESSAGE_DEFINITION_IDENTIFIER__FLAVOUR, oldFlavour, flavour));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Iso20022Package.MESSAGE_DEFINITION_IDENTIFIER__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Iso20022Package.MESSAGE_DEFINITION_IDENTIFIER__BUSINESS_AREA:
				return getBusinessArea();
			case Iso20022Package.MESSAGE_DEFINITION_IDENTIFIER__MESSAGE_FUNCTIONALITY:
				return getMessageFunctionality();
			case Iso20022Package.MESSAGE_DEFINITION_IDENTIFIER__FLAVOUR:
				return getFlavour();
			case Iso20022Package.MESSAGE_DEFINITION_IDENTIFIER__VERSION:
				return getVersion();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Iso20022Package.MESSAGE_DEFINITION_IDENTIFIER__BUSINESS_AREA:
				setBusinessArea((String)newValue);
				return;
			case Iso20022Package.MESSAGE_DEFINITION_IDENTIFIER__MESSAGE_FUNCTIONALITY:
				setMessageFunctionality((String)newValue);
				return;
			case Iso20022Package.MESSAGE_DEFINITION_IDENTIFIER__FLAVOUR:
				setFlavour((String)newValue);
				return;
			case Iso20022Package.MESSAGE_DEFINITION_IDENTIFIER__VERSION:
				setVersion((String)newValue);
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
			case Iso20022Package.MESSAGE_DEFINITION_IDENTIFIER__BUSINESS_AREA:
				setBusinessArea(BUSINESS_AREA_EDEFAULT);
				return;
			case Iso20022Package.MESSAGE_DEFINITION_IDENTIFIER__MESSAGE_FUNCTIONALITY:
				setMessageFunctionality(MESSAGE_FUNCTIONALITY_EDEFAULT);
				return;
			case Iso20022Package.MESSAGE_DEFINITION_IDENTIFIER__FLAVOUR:
				setFlavour(FLAVOUR_EDEFAULT);
				return;
			case Iso20022Package.MESSAGE_DEFINITION_IDENTIFIER__VERSION:
				setVersion(VERSION_EDEFAULT);
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
			case Iso20022Package.MESSAGE_DEFINITION_IDENTIFIER__BUSINESS_AREA:
				return BUSINESS_AREA_EDEFAULT == null ? businessArea != null : !BUSINESS_AREA_EDEFAULT.equals(businessArea);
			case Iso20022Package.MESSAGE_DEFINITION_IDENTIFIER__MESSAGE_FUNCTIONALITY:
				return MESSAGE_FUNCTIONALITY_EDEFAULT == null ? messageFunctionality != null : !MESSAGE_FUNCTIONALITY_EDEFAULT.equals(messageFunctionality);
			case Iso20022Package.MESSAGE_DEFINITION_IDENTIFIER__FLAVOUR:
				return FLAVOUR_EDEFAULT == null ? flavour != null : !FLAVOUR_EDEFAULT.equals(flavour);
			case Iso20022Package.MESSAGE_DEFINITION_IDENTIFIER__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append(businessArea);
		result.append(".");
		result.append(messageFunctionality);
		result.append(".");
		result.append(flavour);
		result.append(".");
		result.append(version);
		return result.toString();

		
//		if (eIsProxy()) return super.toString();
//
//		StringBuffer result = new StringBuffer(super.toString());
//		result.append(" (businessArea: ");
//		result.append(businessArea);
//		result.append(", messageFunctionality: ");
//		result.append(messageFunctionality);
//		result.append(", flavour: ");
//		result.append(flavour);
//		result.append(", version: ");
//		result.append(version);
//		result.append(')');
//		return result.toString();
	}

} //MessageDefinitionIdentifierImpl
