/**
 */
package iso20022.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import iso20022.Amount;
import iso20022.DataType;
import iso20022.Iso20022Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Amount</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso20022.impl.AmountImpl#getCurrencyIdentifierSet <em>Currency Identifier Set</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AmountImpl extends DecimalImpl implements Amount {
	/**
	 * The cached value of the '{@link #getCurrencyIdentifierSet() <em>Currency Identifier Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrencyIdentifierSet()
	 * @generated
	 * @ordered
	 */
	protected DataType currencyIdentifierSet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AmountImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Iso20022Package.eINSTANCE.getAmount();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getCurrencyIdentifierSet() {
		if (currencyIdentifierSet != null && currencyIdentifierSet.eIsProxy()) {
			InternalEObject oldCurrencyIdentifierSet = (InternalEObject)currencyIdentifierSet;
			currencyIdentifierSet = (DataType)eResolveProxy(oldCurrencyIdentifierSet);
			if (currencyIdentifierSet != oldCurrencyIdentifierSet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Iso20022Package.AMOUNT__CURRENCY_IDENTIFIER_SET, oldCurrencyIdentifierSet, currencyIdentifierSet));
			}
		}
		return currencyIdentifierSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetCurrencyIdentifierSet() {
		return currencyIdentifierSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrencyIdentifierSet(DataType newCurrencyIdentifierSet) {
		DataType oldCurrencyIdentifierSet = currencyIdentifierSet;
		currencyIdentifierSet = newCurrencyIdentifierSet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Iso20022Package.AMOUNT__CURRENCY_IDENTIFIER_SET, oldCurrencyIdentifierSet, currencyIdentifierSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Iso20022Package.AMOUNT__CURRENCY_IDENTIFIER_SET:
				if (resolve) return getCurrencyIdentifierSet();
				return basicGetCurrencyIdentifierSet();
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
			case Iso20022Package.AMOUNT__CURRENCY_IDENTIFIER_SET:
				setCurrencyIdentifierSet((DataType)newValue);
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
			case Iso20022Package.AMOUNT__CURRENCY_IDENTIFIER_SET:
				setCurrencyIdentifierSet((DataType)null);
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
			case Iso20022Package.AMOUNT__CURRENCY_IDENTIFIER_SET:
				return currencyIdentifierSet != null;
		}
		return super.eIsSet(featureID);
	}

} //AmountImpl
