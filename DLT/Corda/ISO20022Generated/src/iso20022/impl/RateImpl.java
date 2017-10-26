/**
 */
package iso20022.impl;

import java.lang.String;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import iso20022.Iso20022Package;
import iso20022.Rate;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso20022.impl.RateImpl#getBaseValue <em>Base Value</em>}</li>
 *   <li>{@link iso20022.impl.RateImpl#getBaseUnitCode <em>Base Unit Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RateImpl extends DecimalImpl implements Rate {
	/**
	 * The default value of the '{@link #getBaseValue() <em>Base Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseValue()
	 * @generated
	 * @ordered
	 */
	protected static final Double BASE_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBaseValue() <em>Base Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseValue()
	 * @generated
	 * @ordered
	 */
	protected Double baseValue = BASE_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBaseUnitCode() <em>Base Unit Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseUnitCode()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_UNIT_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBaseUnitCode() <em>Base Unit Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseUnitCode()
	 * @generated
	 * @ordered
	 */
	protected String baseUnitCode = BASE_UNIT_CODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Iso20022Package.eINSTANCE.getRate();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getBaseValue() {
		return baseValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseValue(Double newBaseValue) {
		Double oldBaseValue = baseValue;
		baseValue = newBaseValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Iso20022Package.RATE__BASE_VALUE, oldBaseValue, baseValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBaseUnitCode() {
		return baseUnitCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseUnitCode(String newBaseUnitCode) {
		String oldBaseUnitCode = baseUnitCode;
		baseUnitCode = newBaseUnitCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Iso20022Package.RATE__BASE_UNIT_CODE, oldBaseUnitCode, baseUnitCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Iso20022Package.RATE__BASE_VALUE:
				return getBaseValue();
			case Iso20022Package.RATE__BASE_UNIT_CODE:
				return getBaseUnitCode();
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
			case Iso20022Package.RATE__BASE_VALUE:
				setBaseValue((Double)newValue);
				return;
			case Iso20022Package.RATE__BASE_UNIT_CODE:
				setBaseUnitCode((String)newValue);
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
			case Iso20022Package.RATE__BASE_VALUE:
				setBaseValue(BASE_VALUE_EDEFAULT);
				return;
			case Iso20022Package.RATE__BASE_UNIT_CODE:
				setBaseUnitCode(BASE_UNIT_CODE_EDEFAULT);
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
			case Iso20022Package.RATE__BASE_VALUE:
				return BASE_VALUE_EDEFAULT == null ? baseValue != null : !BASE_VALUE_EDEFAULT.equals(baseValue);
			case Iso20022Package.RATE__BASE_UNIT_CODE:
				return BASE_UNIT_CODE_EDEFAULT == null ? baseUnitCode != null : !BASE_UNIT_CODE_EDEFAULT.equals(baseUnitCode);
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
		result.append(" (baseValue: ");
		result.append(baseValue);
		result.append(", baseUnitCode: ");
		result.append(baseUnitCode);
		result.append(')');
		return result.toString();
	}

} //RateImpl
