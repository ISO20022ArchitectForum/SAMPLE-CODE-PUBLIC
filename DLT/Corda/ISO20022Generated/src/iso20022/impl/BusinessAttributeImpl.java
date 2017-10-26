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

import iso20022.BusinessAttribute;
import iso20022.BusinessComponent;
import iso20022.BusinessElementType;
import iso20022.DataType;
import iso20022.Iso20022Package;
import iso20022.RepositoryType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Business Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso20022.impl.BusinessAttributeImpl#getSimpleType <em>Simple Type</em>}</li>
 *   <li>{@link iso20022.impl.BusinessAttributeImpl#getComplexType <em>Complex Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BusinessAttributeImpl extends BusinessElementImpl implements BusinessAttribute {
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
	protected BusinessComponent complexType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusinessAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Iso20022Package.eINSTANCE.getBusinessAttribute();
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Iso20022Package.BUSINESS_ATTRIBUTE__SIMPLE_TYPE, oldSimpleType, simpleType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Iso20022Package.BUSINESS_ATTRIBUTE__SIMPLE_TYPE, oldSimpleType, simpleType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessComponent getComplexType() {
		if (complexType != null && complexType.eIsProxy()) {
			InternalEObject oldComplexType = (InternalEObject)complexType;
			complexType = (BusinessComponent)eResolveProxy(oldComplexType);
			if (complexType != oldComplexType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Iso20022Package.BUSINESS_ATTRIBUTE__COMPLEX_TYPE, oldComplexType, complexType));
			}
		}
		return complexType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessComponent basicGetComplexType() {
		return complexType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComplexType(BusinessComponent newComplexType) {
		BusinessComponent oldComplexType = complexType;
		complexType = newComplexType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Iso20022Package.BUSINESS_ATTRIBUTE__COMPLEX_TYPE, oldComplexType, complexType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean BusinessAttributeHasExactlyOneType(Map context, DiagnosticChain diagnostics) {
		// TODO: implement this method >>> DONE
		// Ensure that you remove @generated or mark it @generated NOT
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean NoDerivingCodeSetType(Map context, DiagnosticChain diagnostics) {
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
			case Iso20022Package.BUSINESS_ATTRIBUTE__SIMPLE_TYPE:
				if (resolve) return getSimpleType();
				return basicGetSimpleType();
			case Iso20022Package.BUSINESS_ATTRIBUTE__COMPLEX_TYPE:
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
			case Iso20022Package.BUSINESS_ATTRIBUTE__SIMPLE_TYPE:
				setSimpleType((DataType)newValue);
				return;
			case Iso20022Package.BUSINESS_ATTRIBUTE__COMPLEX_TYPE:
				setComplexType((BusinessComponent)newValue);
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
			case Iso20022Package.BUSINESS_ATTRIBUTE__SIMPLE_TYPE:
				setSimpleType((DataType)null);
				return;
			case Iso20022Package.BUSINESS_ATTRIBUTE__COMPLEX_TYPE:
				setComplexType((BusinessComponent)null);
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
			case Iso20022Package.BUSINESS_ATTRIBUTE__SIMPLE_TYPE:
				return simpleType != null;
			case Iso20022Package.BUSINESS_ATTRIBUTE__COMPLEX_TYPE:
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
			case Iso20022Package.BUSINESS_ATTRIBUTE___BUSINESS_ATTRIBUTE_HAS_EXACTLY_ONE_TYPE__MAP_DIAGNOSTICCHAIN:
				return BusinessAttributeHasExactlyOneType((Map)arguments.get(0), (DiagnosticChain)arguments.get(1));
			case Iso20022Package.BUSINESS_ATTRIBUTE___NO_DERIVING_CODE_SET_TYPE__MAP_DIAGNOSTICCHAIN:
				return NoDerivingCodeSetType((Map)arguments.get(0), (DiagnosticChain)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	@Override
	public BusinessElementType basicGetBusinessElementType() {
		
		return getSimpleType() != null ? getSimpleType() : getComplexType();
	}

	@Override
	public RepositoryType basicGetMemberType() {
		
		return getSimpleType() != null ? getSimpleType() : getComplexType();
	}

} //BusinessAttributeImpl
