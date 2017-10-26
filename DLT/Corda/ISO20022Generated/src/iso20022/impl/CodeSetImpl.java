/**
 */
package iso20022.impl;

import java.lang.String;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import iso20022.Code;
import iso20022.CodeSet;
import iso20022.Iso20022Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Code Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso20022.impl.CodeSetImpl#getTrace <em>Trace</em>}</li>
 *   <li>{@link iso20022.impl.CodeSetImpl#getDerivation <em>Derivation</em>}</li>
 *   <li>{@link iso20022.impl.CodeSetImpl#getIdentificationScheme <em>Identification Scheme</em>}</li>
 *   <li>{@link iso20022.impl.CodeSetImpl#getCode <em>Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CodeSetImpl extends StringImpl implements CodeSet {
	/**
	 * The cached value of the '{@link #getTrace() <em>Trace</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrace()
	 * @generated
	 * @ordered
	 */
	protected CodeSet trace;

	/**
	 * The cached value of the '{@link #getDerivation() <em>Derivation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivation()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeSet> derivation;

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
	 * The cached value of the '{@link #getCode() <em>Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected EList<Code> code;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CodeSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Iso20022Package.eINSTANCE.getCodeSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeSet getTrace() {
		if (trace != null && trace.eIsProxy()) {
			InternalEObject oldTrace = (InternalEObject)trace;
			trace = (CodeSet)eResolveProxy(oldTrace);
			if (trace != oldTrace) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Iso20022Package.CODE_SET__TRACE, oldTrace, trace));
			}
		}
		return trace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeSet basicGetTrace() {
		return trace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTrace(CodeSet newTrace, NotificationChain msgs) {
		CodeSet oldTrace = trace;
		trace = newTrace;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Iso20022Package.CODE_SET__TRACE, oldTrace, newTrace);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrace(CodeSet newTrace) {
		if (newTrace != trace) {
			NotificationChain msgs = null;
			if (trace != null)
				msgs = ((InternalEObject)trace).eInverseRemove(this, Iso20022Package.CODE_SET__DERIVATION, CodeSet.class, msgs);
			if (newTrace != null)
				msgs = ((InternalEObject)newTrace).eInverseAdd(this, Iso20022Package.CODE_SET__DERIVATION, CodeSet.class, msgs);
			msgs = basicSetTrace(newTrace, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Iso20022Package.CODE_SET__TRACE, newTrace, newTrace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeSet> getDerivation() {
		if (derivation == null) {
			derivation = new EObjectWithInverseResolvingEList<CodeSet>(CodeSet.class, this, Iso20022Package.CODE_SET__DERIVATION, Iso20022Package.CODE_SET__TRACE);
		}
		return derivation;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Iso20022Package.CODE_SET__IDENTIFICATION_SCHEME, oldIdentificationScheme, identificationScheme));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Code> getCode() {
		if (code == null) {
			code = new EObjectContainmentWithInverseEList<Code>(Code.class, this, Iso20022Package.CODE_SET__CODE, Iso20022Package.CODE__OWNER);
		}
		return code;
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
			case Iso20022Package.CODE_SET__TRACE:
				if (trace != null)
					msgs = ((InternalEObject)trace).eInverseRemove(this, Iso20022Package.CODE_SET__DERIVATION, CodeSet.class, msgs);
				return basicSetTrace((CodeSet)otherEnd, msgs);
			case Iso20022Package.CODE_SET__DERIVATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDerivation()).basicAdd(otherEnd, msgs);
			case Iso20022Package.CODE_SET__CODE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCode()).basicAdd(otherEnd, msgs);
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
			case Iso20022Package.CODE_SET__TRACE:
				return basicSetTrace(null, msgs);
			case Iso20022Package.CODE_SET__DERIVATION:
				return ((InternalEList<?>)getDerivation()).basicRemove(otherEnd, msgs);
			case Iso20022Package.CODE_SET__CODE:
				return ((InternalEList<?>)getCode()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Iso20022Package.CODE_SET__TRACE:
				if (resolve) return getTrace();
				return basicGetTrace();
			case Iso20022Package.CODE_SET__DERIVATION:
				return getDerivation();
			case Iso20022Package.CODE_SET__IDENTIFICATION_SCHEME:
				return getIdentificationScheme();
			case Iso20022Package.CODE_SET__CODE:
				return getCode();
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
			case Iso20022Package.CODE_SET__TRACE:
				setTrace((CodeSet)newValue);
				return;
			case Iso20022Package.CODE_SET__DERIVATION:
				getDerivation().clear();
				getDerivation().addAll((Collection<? extends CodeSet>)newValue);
				return;
			case Iso20022Package.CODE_SET__IDENTIFICATION_SCHEME:
				setIdentificationScheme((String)newValue);
				return;
			case Iso20022Package.CODE_SET__CODE:
				getCode().clear();
				getCode().addAll((Collection<? extends Code>)newValue);
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
			case Iso20022Package.CODE_SET__TRACE:
				setTrace((CodeSet)null);
				return;
			case Iso20022Package.CODE_SET__DERIVATION:
				getDerivation().clear();
				return;
			case Iso20022Package.CODE_SET__IDENTIFICATION_SCHEME:
				setIdentificationScheme(IDENTIFICATION_SCHEME_EDEFAULT);
				return;
			case Iso20022Package.CODE_SET__CODE:
				getCode().clear();
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
			case Iso20022Package.CODE_SET__TRACE:
				return trace != null;
			case Iso20022Package.CODE_SET__DERIVATION:
				return derivation != null && !derivation.isEmpty();
			case Iso20022Package.CODE_SET__IDENTIFICATION_SCHEME:
				return IDENTIFICATION_SCHEME_EDEFAULT == null ? identificationScheme != null : !IDENTIFICATION_SCHEME_EDEFAULT.equals(identificationScheme);
			case Iso20022Package.CODE_SET__CODE:
				return code != null && !code.isEmpty();
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

} //CodeSetImpl
