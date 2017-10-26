/**
 */
package iso20022.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import iso20022.DataType;
import iso20022.Iso20022Package;
import iso20022.LogicalType;
import iso20022.MessageAttribute;
import iso20022.MessageComponentType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso20022.impl.MessageAttributeImpl#getSimpleType <em>Simple Type</em>}</li>
 *   <li>{@link iso20022.impl.MessageAttributeImpl#getComplexType <em>Complex Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MessageAttributeImpl extends MessageElementImpl implements MessageAttribute {
	/**
	 * The cached value of the '{@link #getSimpleType() <em>Simple Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimpleType()
	 * @generated
	 * @ordered
	 */
	protected DataType simpleType;

	/**
	 * The cached value of the '{@link #getComplexType() <em>Complex Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplexType()
	 * @generated
	 * @ordered
	 */
	protected MessageComponentType complexType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Iso20022Package.eINSTANCE.getMessageAttribute();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getSimpleType() {
		if (simpleType != null && simpleType.eIsProxy()) {
			InternalEObject oldSimpleType = (InternalEObject)simpleType;
			simpleType = (DataType)eResolveProxy(oldSimpleType);
			if (simpleType != oldSimpleType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Iso20022Package.MESSAGE_ATTRIBUTE__SIMPLE_TYPE, oldSimpleType, simpleType));
			}
		}
		return simpleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetSimpleType() {
		return simpleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSimpleType(DataType newSimpleType) {
		DataType oldSimpleType = simpleType;
		simpleType = newSimpleType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Iso20022Package.MESSAGE_ATTRIBUTE__SIMPLE_TYPE, oldSimpleType, simpleType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageComponentType getComplexType() {
		if (complexType != null && complexType.eIsProxy()) {
			InternalEObject oldComplexType = (InternalEObject)complexType;
			complexType = (MessageComponentType)eResolveProxy(oldComplexType);
			if (complexType != oldComplexType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Iso20022Package.MESSAGE_ATTRIBUTE__COMPLEX_TYPE, oldComplexType, complexType));
			}
		}
		return complexType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageComponentType basicGetComplexType() {
		return complexType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComplexType(MessageComponentType newComplexType) {
		MessageComponentType oldComplexType = complexType;
		complexType = newComplexType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Iso20022Package.MESSAGE_ATTRIBUTE__COMPLEX_TYPE, oldComplexType, complexType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean MessageAttributeHasExactlyOneType(Map context, DiagnosticChain diagnostics) {
		// TODO: implement this method >>> DONE
		// Ensure that you remove @generated or mark it @generated NOT
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Iso20022Package.MESSAGE_ATTRIBUTE__SIMPLE_TYPE:
				if (resolve) return getSimpleType();
				return basicGetSimpleType();
			case Iso20022Package.MESSAGE_ATTRIBUTE__COMPLEX_TYPE:
				if (resolve) return getComplexType();
				return basicGetComplexType();
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
			case Iso20022Package.MESSAGE_ATTRIBUTE__SIMPLE_TYPE:
				setSimpleType((DataType)newValue);
				return;
			case Iso20022Package.MESSAGE_ATTRIBUTE__COMPLEX_TYPE:
				setComplexType((MessageComponentType)newValue);
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
			case Iso20022Package.MESSAGE_ATTRIBUTE__SIMPLE_TYPE:
				setSimpleType((DataType)null);
				return;
			case Iso20022Package.MESSAGE_ATTRIBUTE__COMPLEX_TYPE:
				setComplexType((MessageComponentType)null);
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
			case Iso20022Package.MESSAGE_ATTRIBUTE__SIMPLE_TYPE:
				return simpleType != null;
			case Iso20022Package.MESSAGE_ATTRIBUTE__COMPLEX_TYPE:
				return complexType != null;
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
			case Iso20022Package.MESSAGE_ATTRIBUTE___MESSAGE_ATTRIBUTE_HAS_EXACTLY_ONE_TYPE__MAP_DIAGNOSTICCHAIN:
				return MessageAttributeHasExactlyOneType((Map)arguments.get(0), (DiagnosticChain)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	@Override
	public LogicalType basicGetXmlMemberType() {		
		return getSimpleType() != null ? getSimpleType() : getComplexType();
	}

	@Override
	public LogicalType basicGetMemberType() {		
		return getSimpleType() != null ? getSimpleType() : getComplexType();
	}

} //MessageAttributeImpl
