/**
 */
package iso20022.impl;

import java.lang.String;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import iso20022.Indicator;
import iso20022.Iso20022Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Indicator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso20022.impl.IndicatorImpl#getMeaningWhenTrue <em>Meaning When True</em>}</li>
 *   <li>{@link iso20022.impl.IndicatorImpl#getMeaningWhenFalse <em>Meaning When False</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IndicatorImpl extends BooleanImpl implements Indicator {
	/**
	 * The default value of the '{@link #getMeaningWhenTrue() <em>Meaning When True</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeaningWhenTrue()
	 * @generated
	 * @ordered
	 */
	protected static final String MEANING_WHEN_TRUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMeaningWhenTrue() <em>Meaning When True</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeaningWhenTrue()
	 * @generated
	 * @ordered
	 */
	protected String meaningWhenTrue = MEANING_WHEN_TRUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMeaningWhenFalse() <em>Meaning When False</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeaningWhenFalse()
	 * @generated
	 * @ordered
	 */
	protected static final String MEANING_WHEN_FALSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMeaningWhenFalse() <em>Meaning When False</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeaningWhenFalse()
	 * @generated
	 * @ordered
	 */
	protected String meaningWhenFalse = MEANING_WHEN_FALSE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IndicatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Iso20022Package.eINSTANCE.getIndicator();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMeaningWhenTrue() {
		return meaningWhenTrue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeaningWhenTrue(String newMeaningWhenTrue) {
		String oldMeaningWhenTrue = meaningWhenTrue;
		meaningWhenTrue = newMeaningWhenTrue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Iso20022Package.INDICATOR__MEANING_WHEN_TRUE, oldMeaningWhenTrue, meaningWhenTrue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMeaningWhenFalse() {
		return meaningWhenFalse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeaningWhenFalse(String newMeaningWhenFalse) {
		String oldMeaningWhenFalse = meaningWhenFalse;
		meaningWhenFalse = newMeaningWhenFalse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Iso20022Package.INDICATOR__MEANING_WHEN_FALSE, oldMeaningWhenFalse, meaningWhenFalse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Iso20022Package.INDICATOR__MEANING_WHEN_TRUE:
				return getMeaningWhenTrue();
			case Iso20022Package.INDICATOR__MEANING_WHEN_FALSE:
				return getMeaningWhenFalse();
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
			case Iso20022Package.INDICATOR__MEANING_WHEN_TRUE:
				setMeaningWhenTrue((String)newValue);
				return;
			case Iso20022Package.INDICATOR__MEANING_WHEN_FALSE:
				setMeaningWhenFalse((String)newValue);
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
			case Iso20022Package.INDICATOR__MEANING_WHEN_TRUE:
				setMeaningWhenTrue(MEANING_WHEN_TRUE_EDEFAULT);
				return;
			case Iso20022Package.INDICATOR__MEANING_WHEN_FALSE:
				setMeaningWhenFalse(MEANING_WHEN_FALSE_EDEFAULT);
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
			case Iso20022Package.INDICATOR__MEANING_WHEN_TRUE:
				return MEANING_WHEN_TRUE_EDEFAULT == null ? meaningWhenTrue != null : !MEANING_WHEN_TRUE_EDEFAULT.equals(meaningWhenTrue);
			case Iso20022Package.INDICATOR__MEANING_WHEN_FALSE:
				return MEANING_WHEN_FALSE_EDEFAULT == null ? meaningWhenFalse != null : !MEANING_WHEN_FALSE_EDEFAULT.equals(meaningWhenFalse);
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
		result.append(" (meaningWhenTrue: ");
		result.append(meaningWhenTrue);
		result.append(", meaningWhenFalse: ");
		result.append(meaningWhenFalse);
		result.append(')');
		return result.toString();
	}

} //IndicatorImpl
