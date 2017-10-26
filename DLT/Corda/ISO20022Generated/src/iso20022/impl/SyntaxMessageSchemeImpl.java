/**
 */
package iso20022.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import iso20022.Iso20022Package;
import iso20022.MessageDefinition;
import iso20022.SyntaxMessageScheme;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Syntax Message Scheme</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso20022.impl.SyntaxMessageSchemeImpl#getMessageDefinitionTrace <em>Message Definition Trace</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SyntaxMessageSchemeImpl extends TopLevelCatalogueEntryImpl implements SyntaxMessageScheme {
	/**
	 * The cached value of the '{@link #getMessageDefinitionTrace() <em>Message Definition Trace</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageDefinitionTrace()
	 * @generated
	 * @ordered
	 */
	protected MessageDefinition messageDefinitionTrace;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SyntaxMessageSchemeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Iso20022Package.eINSTANCE.getSyntaxMessageScheme();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageDefinition getMessageDefinitionTrace() {
		if (messageDefinitionTrace != null && messageDefinitionTrace.eIsProxy()) {
			InternalEObject oldMessageDefinitionTrace = (InternalEObject)messageDefinitionTrace;
			messageDefinitionTrace = (MessageDefinition)eResolveProxy(oldMessageDefinitionTrace);
			if (messageDefinitionTrace != oldMessageDefinitionTrace) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Iso20022Package.SYNTAX_MESSAGE_SCHEME__MESSAGE_DEFINITION_TRACE, oldMessageDefinitionTrace, messageDefinitionTrace));
			}
		}
		return messageDefinitionTrace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageDefinition basicGetMessageDefinitionTrace() {
		return messageDefinitionTrace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMessageDefinitionTrace(MessageDefinition newMessageDefinitionTrace, NotificationChain msgs) {
		MessageDefinition oldMessageDefinitionTrace = messageDefinitionTrace;
		messageDefinitionTrace = newMessageDefinitionTrace;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Iso20022Package.SYNTAX_MESSAGE_SCHEME__MESSAGE_DEFINITION_TRACE, oldMessageDefinitionTrace, newMessageDefinitionTrace);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageDefinitionTrace(MessageDefinition newMessageDefinitionTrace) {
		if (newMessageDefinitionTrace != messageDefinitionTrace) {
			NotificationChain msgs = null;
			if (messageDefinitionTrace != null)
				msgs = ((InternalEObject)messageDefinitionTrace).eInverseRemove(this, Iso20022Package.MESSAGE_DEFINITION__DERIVATION, MessageDefinition.class, msgs);
			if (newMessageDefinitionTrace != null)
				msgs = ((InternalEObject)newMessageDefinitionTrace).eInverseAdd(this, Iso20022Package.MESSAGE_DEFINITION__DERIVATION, MessageDefinition.class, msgs);
			msgs = basicSetMessageDefinitionTrace(newMessageDefinitionTrace, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Iso20022Package.SYNTAX_MESSAGE_SCHEME__MESSAGE_DEFINITION_TRACE, newMessageDefinitionTrace, newMessageDefinitionTrace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Iso20022Package.SYNTAX_MESSAGE_SCHEME__MESSAGE_DEFINITION_TRACE:
				if (messageDefinitionTrace != null)
					msgs = ((InternalEObject)messageDefinitionTrace).eInverseRemove(this, Iso20022Package.MESSAGE_DEFINITION__DERIVATION, MessageDefinition.class, msgs);
				return basicSetMessageDefinitionTrace((MessageDefinition)otherEnd, msgs);
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
			case Iso20022Package.SYNTAX_MESSAGE_SCHEME__MESSAGE_DEFINITION_TRACE:
				return basicSetMessageDefinitionTrace(null, msgs);
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
			case Iso20022Package.SYNTAX_MESSAGE_SCHEME__MESSAGE_DEFINITION_TRACE:
				if (resolve) return getMessageDefinitionTrace();
				return basicGetMessageDefinitionTrace();
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
			case Iso20022Package.SYNTAX_MESSAGE_SCHEME__MESSAGE_DEFINITION_TRACE:
				setMessageDefinitionTrace((MessageDefinition)newValue);
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
			case Iso20022Package.SYNTAX_MESSAGE_SCHEME__MESSAGE_DEFINITION_TRACE:
				setMessageDefinitionTrace((MessageDefinition)null);
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
			case Iso20022Package.SYNTAX_MESSAGE_SCHEME__MESSAGE_DEFINITION_TRACE:
				return messageDefinitionTrace != null;
		}
		return super.eIsSet(featureID);
	}

} //SyntaxMessageSchemeImpl
