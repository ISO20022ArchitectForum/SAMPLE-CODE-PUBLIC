/**
 */
package iso20022.impl;

import java.lang.String;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import iso20022.Iso20022Package;
import iso20022.LogicalType;
import iso20022.MessageConstruct;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message Construct</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso20022.impl.MessageConstructImpl#getXmlTag <em>Xml Tag</em>}</li>
 *   <li>{@link iso20022.impl.MessageConstructImpl#getXmlMemberType <em>Xml Member Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class MessageConstructImpl extends ConstructImpl implements MessageConstruct {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageConstructImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Iso20022Package.eINSTANCE.getMessageConstruct();
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
			eNotify(new ENotificationImpl(this, Notification.SET, Iso20022Package.MESSAGE_CONSTRUCT__XML_TAG, oldXmlTag, xmlTag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalType getXmlMemberType() {
		LogicalType xmlMemberType = basicGetXmlMemberType();
		return xmlMemberType != null && xmlMemberType.eIsProxy() ? (LogicalType)eResolveProxy((InternalEObject)xmlMemberType) : xmlMemberType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalType basicGetXmlMemberType() {
		// TODO: implement this method to return the 'Xml Member Type' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Iso20022Package.MESSAGE_CONSTRUCT__XML_TAG:
				return getXmlTag();
			case Iso20022Package.MESSAGE_CONSTRUCT__XML_MEMBER_TYPE:
				if (resolve) return getXmlMemberType();
				return basicGetXmlMemberType();
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
			case Iso20022Package.MESSAGE_CONSTRUCT__XML_TAG:
				setXmlTag((String)newValue);
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
			case Iso20022Package.MESSAGE_CONSTRUCT__XML_TAG:
				setXmlTag(XML_TAG_EDEFAULT);
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
			case Iso20022Package.MESSAGE_CONSTRUCT__XML_TAG:
				return XML_TAG_EDEFAULT == null ? xmlTag != null : !XML_TAG_EDEFAULT.equals(xmlTag);
			case Iso20022Package.MESSAGE_CONSTRUCT__XML_MEMBER_TYPE:
				return basicGetXmlMemberType() != null;
		}
		return super.eIsSet(featureID);
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
		result.append(" (xmlTag: ");
		result.append(xmlTag);
		result.append(')');
		return result.toString();
	}

} //MessageConstructImpl
