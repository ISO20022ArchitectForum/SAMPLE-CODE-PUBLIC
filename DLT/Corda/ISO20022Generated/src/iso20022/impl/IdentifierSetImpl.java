/**
 */
package iso20022.impl;

import java.lang.String;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import iso20022.IdentifierSet;
import iso20022.Iso20022Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Identifier Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso20022.impl.IdentifierSetImpl#getIdentificationScheme <em>Identification Scheme</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IdentifierSetImpl extends StringImpl implements IdentifierSet {
	/**
	 * The default value of the '{@link #getIdentificationScheme() <em>Identification Scheme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentificationScheme()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENTIFICATION_SCHEME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdentificationScheme() <em>Identification Scheme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentificationScheme()
	 * @generated
	 * @ordered
	 */
	protected String identificationScheme = IDENTIFICATION_SCHEME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IdentifierSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Iso20022Package.eINSTANCE.getIdentifierSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdentificationScheme() {
		return identificationScheme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentificationScheme(String newIdentificationScheme) {
		String oldIdentificationScheme = identificationScheme;
		identificationScheme = newIdentificationScheme;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Iso20022Package.IDENTIFIER_SET__IDENTIFICATION_SCHEME, oldIdentificationScheme, identificationScheme));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Iso20022Package.IDENTIFIER_SET__IDENTIFICATION_SCHEME:
				return getIdentificationScheme();
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
			case Iso20022Package.IDENTIFIER_SET__IDENTIFICATION_SCHEME:
				setIdentificationScheme((String)newValue);
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
			case Iso20022Package.IDENTIFIER_SET__IDENTIFICATION_SCHEME:
				setIdentificationScheme(IDENTIFICATION_SCHEME_EDEFAULT);
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
			case Iso20022Package.IDENTIFIER_SET__IDENTIFICATION_SCHEME:
				return IDENTIFICATION_SCHEME_EDEFAULT == null ? identificationScheme != null : !IDENTIFICATION_SCHEME_EDEFAULT.equals(identificationScheme);
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
		result.append(" (identificationScheme: ");
		result.append(identificationScheme);
		result.append(')');
		return result.toString();
	}

} //IdentifierSetImpl
