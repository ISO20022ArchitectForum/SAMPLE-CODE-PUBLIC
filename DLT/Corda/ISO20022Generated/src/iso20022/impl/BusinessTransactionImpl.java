/**
 */
package iso20022.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import iso20022.BusinessProcess;
import iso20022.BusinessTransaction;
import iso20022.Iso20022Package;
import iso20022.MessageChoreography;
import iso20022.MessageTransmission;
import iso20022.MessageTransportMode;
import iso20022.Participant;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Business Transaction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso20022.impl.BusinessTransactionImpl#getBusinessProcessTrace <em>Business Process Trace</em>}</li>
 *   <li>{@link iso20022.impl.BusinessTransactionImpl#getParticipant <em>Participant</em>}</li>
 *   <li>{@link iso20022.impl.BusinessTransactionImpl#getTransmission <em>Transmission</em>}</li>
 *   <li>{@link iso20022.impl.BusinessTransactionImpl#getMessageTransportMode <em>Message Transport Mode</em>}</li>
 *   <li>{@link iso20022.impl.BusinessTransactionImpl#getSubTransaction <em>Sub Transaction</em>}</li>
 *   <li>{@link iso20022.impl.BusinessTransactionImpl#getParentTransaction <em>Parent Transaction</em>}</li>
 *   <li>{@link iso20022.impl.BusinessTransactionImpl#getTrace <em>Trace</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BusinessTransactionImpl extends TopLevelCatalogueEntryImpl implements BusinessTransaction {
	/**
	 * The cached value of the '{@link #getBusinessProcessTrace() <em>Business Process Trace</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessProcessTrace()
	 * @generated
	 * @ordered
	 */
	protected BusinessProcess businessProcessTrace;

	/**
	 * The cached value of the '{@link #getParticipant() <em>Participant</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipant()
	 * @generated
	 * @ordered
	 */
	protected EList<Participant> participant;

	/**
	 * The cached value of the '{@link #getTransmission() <em>Transmission</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransmission()
	 * @generated
	 * @ordered
	 */
	protected EList<MessageTransmission> transmission;

	/**
	 * The cached value of the '{@link #getMessageTransportMode() <em>Message Transport Mode</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageTransportMode()
	 * @generated
	 * @ordered
	 */
	protected MessageTransportMode messageTransportMode;

	/**
	 * The cached value of the '{@link #getSubTransaction() <em>Sub Transaction</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubTransaction()
	 * @generated
	 * @ordered
	 */
	protected EList<BusinessTransaction> subTransaction;

	/**
	 * The cached value of the '{@link #getParentTransaction() <em>Parent Transaction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentTransaction()
	 * @generated
	 * @ordered
	 */
	protected BusinessTransaction parentTransaction;

	/**
	 * The cached value of the '{@link #getTrace() <em>Trace</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrace()
	 * @generated
	 * @ordered
	 */
	protected EList<MessageChoreography> trace;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusinessTransactionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Iso20022Package.eINSTANCE.getBusinessTransaction();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessProcess getBusinessProcessTrace() {
		if (businessProcessTrace != null && businessProcessTrace.eIsProxy()) {
			InternalEObject oldBusinessProcessTrace = (InternalEObject)businessProcessTrace;
			businessProcessTrace = (BusinessProcess)eResolveProxy(oldBusinessProcessTrace);
			if (businessProcessTrace != oldBusinessProcessTrace) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Iso20022Package.BUSINESS_TRANSACTION__BUSINESS_PROCESS_TRACE, oldBusinessProcessTrace, businessProcessTrace));
			}
		}
		return businessProcessTrace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessProcess basicGetBusinessProcessTrace() {
		return businessProcessTrace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBusinessProcessTrace(BusinessProcess newBusinessProcessTrace, NotificationChain msgs) {
		BusinessProcess oldBusinessProcessTrace = businessProcessTrace;
		businessProcessTrace = newBusinessProcessTrace;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Iso20022Package.BUSINESS_TRANSACTION__BUSINESS_PROCESS_TRACE, oldBusinessProcessTrace, newBusinessProcessTrace);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBusinessProcessTrace(BusinessProcess newBusinessProcessTrace) {
		if (newBusinessProcessTrace != businessProcessTrace) {
			NotificationChain msgs = null;
			if (businessProcessTrace != null)
				msgs = ((InternalEObject)businessProcessTrace).eInverseRemove(this, Iso20022Package.BUSINESS_PROCESS__BUSINESS_PROCESS_TRACE, BusinessProcess.class, msgs);
			if (newBusinessProcessTrace != null)
				msgs = ((InternalEObject)newBusinessProcessTrace).eInverseAdd(this, Iso20022Package.BUSINESS_PROCESS__BUSINESS_PROCESS_TRACE, BusinessProcess.class, msgs);
			msgs = basicSetBusinessProcessTrace(newBusinessProcessTrace, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Iso20022Package.BUSINESS_TRANSACTION__BUSINESS_PROCESS_TRACE, newBusinessProcessTrace, newBusinessProcessTrace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Participant> getParticipant() {
		if (participant == null) {
			participant = new EObjectContainmentWithInverseEList<Participant>(Participant.class, this, Iso20022Package.BUSINESS_TRANSACTION__PARTICIPANT, Iso20022Package.PARTICIPANT__BUSINESS_TRANSACTION);
		}
		return participant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MessageTransmission> getTransmission() {
		if (transmission == null) {
			transmission = new EObjectContainmentWithInverseEList<MessageTransmission>(MessageTransmission.class, this, Iso20022Package.BUSINESS_TRANSACTION__TRANSMISSION, Iso20022Package.MESSAGE_TRANSMISSION__BUSINESS_TRANSACTION);
		}
		return transmission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageTransportMode getMessageTransportMode() {
		if (messageTransportMode != null && messageTransportMode.eIsProxy()) {
			InternalEObject oldMessageTransportMode = (InternalEObject)messageTransportMode;
			messageTransportMode = (MessageTransportMode)eResolveProxy(oldMessageTransportMode);
			if (messageTransportMode != oldMessageTransportMode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Iso20022Package.BUSINESS_TRANSACTION__MESSAGE_TRANSPORT_MODE, oldMessageTransportMode, messageTransportMode));
			}
		}
		return messageTransportMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageTransportMode basicGetMessageTransportMode() {
		return messageTransportMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMessageTransportMode(MessageTransportMode newMessageTransportMode, NotificationChain msgs) {
		MessageTransportMode oldMessageTransportMode = messageTransportMode;
		messageTransportMode = newMessageTransportMode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Iso20022Package.BUSINESS_TRANSACTION__MESSAGE_TRANSPORT_MODE, oldMessageTransportMode, newMessageTransportMode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageTransportMode(MessageTransportMode newMessageTransportMode) {
		if (newMessageTransportMode != messageTransportMode) {
			NotificationChain msgs = null;
			if (messageTransportMode != null)
				msgs = ((InternalEObject)messageTransportMode).eInverseRemove(this, Iso20022Package.MESSAGE_TRANSPORT_MODE__BUSINESS_TRANSACTION, MessageTransportMode.class, msgs);
			if (newMessageTransportMode != null)
				msgs = ((InternalEObject)newMessageTransportMode).eInverseAdd(this, Iso20022Package.MESSAGE_TRANSPORT_MODE__BUSINESS_TRANSACTION, MessageTransportMode.class, msgs);
			msgs = basicSetMessageTransportMode(newMessageTransportMode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Iso20022Package.BUSINESS_TRANSACTION__MESSAGE_TRANSPORT_MODE, newMessageTransportMode, newMessageTransportMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BusinessTransaction> getSubTransaction() {
		if (subTransaction == null) {
			subTransaction = new EObjectWithInverseResolvingEList<BusinessTransaction>(BusinessTransaction.class, this, Iso20022Package.BUSINESS_TRANSACTION__SUB_TRANSACTION, Iso20022Package.BUSINESS_TRANSACTION__PARENT_TRANSACTION);
		}
		return subTransaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessTransaction getParentTransaction() {
		if (parentTransaction != null && parentTransaction.eIsProxy()) {
			InternalEObject oldParentTransaction = (InternalEObject)parentTransaction;
			parentTransaction = (BusinessTransaction)eResolveProxy(oldParentTransaction);
			if (parentTransaction != oldParentTransaction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Iso20022Package.BUSINESS_TRANSACTION__PARENT_TRANSACTION, oldParentTransaction, parentTransaction));
			}
		}
		return parentTransaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessTransaction basicGetParentTransaction() {
		return parentTransaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentTransaction(BusinessTransaction newParentTransaction, NotificationChain msgs) {
		BusinessTransaction oldParentTransaction = parentTransaction;
		parentTransaction = newParentTransaction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Iso20022Package.BUSINESS_TRANSACTION__PARENT_TRANSACTION, oldParentTransaction, newParentTransaction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentTransaction(BusinessTransaction newParentTransaction) {
		if (newParentTransaction != parentTransaction) {
			NotificationChain msgs = null;
			if (parentTransaction != null)
				msgs = ((InternalEObject)parentTransaction).eInverseRemove(this, Iso20022Package.BUSINESS_TRANSACTION__SUB_TRANSACTION, BusinessTransaction.class, msgs);
			if (newParentTransaction != null)
				msgs = ((InternalEObject)newParentTransaction).eInverseAdd(this, Iso20022Package.BUSINESS_TRANSACTION__SUB_TRANSACTION, BusinessTransaction.class, msgs);
			msgs = basicSetParentTransaction(newParentTransaction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Iso20022Package.BUSINESS_TRANSACTION__PARENT_TRANSACTION, newParentTransaction, newParentTransaction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MessageChoreography> getTrace() {
		if (trace == null) {
			trace = new EObjectWithInverseResolvingEList<MessageChoreography>(MessageChoreography.class, this, Iso20022Package.BUSINESS_TRANSACTION__TRACE, Iso20022Package.MESSAGE_CHOREOGRAPHY__BUSINESS_TRANSACTION_TRACE);
		}
		return trace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean MessageTransmissionsHaveUniqueNames(Map context, DiagnosticChain diagnostics) {
		// TODO: implement this method >>> DONE
		// Ensure that you remove @generated or mark it @generated NOT
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean ParticipantsHaveUniqueNames(Map context, DiagnosticChain diagnostics) {
		// TODO: implement this method >>> DONE
		// Ensure that you remove @generated or mark it @generated NOT
		return true;
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
			case Iso20022Package.BUSINESS_TRANSACTION__BUSINESS_PROCESS_TRACE:
				if (businessProcessTrace != null)
					msgs = ((InternalEObject)businessProcessTrace).eInverseRemove(this, Iso20022Package.BUSINESS_PROCESS__BUSINESS_PROCESS_TRACE, BusinessProcess.class, msgs);
				return basicSetBusinessProcessTrace((BusinessProcess)otherEnd, msgs);
			case Iso20022Package.BUSINESS_TRANSACTION__PARTICIPANT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getParticipant()).basicAdd(otherEnd, msgs);
			case Iso20022Package.BUSINESS_TRANSACTION__TRANSMISSION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTransmission()).basicAdd(otherEnd, msgs);
			case Iso20022Package.BUSINESS_TRANSACTION__MESSAGE_TRANSPORT_MODE:
				if (messageTransportMode != null)
					msgs = ((InternalEObject)messageTransportMode).eInverseRemove(this, Iso20022Package.MESSAGE_TRANSPORT_MODE__BUSINESS_TRANSACTION, MessageTransportMode.class, msgs);
				return basicSetMessageTransportMode((MessageTransportMode)otherEnd, msgs);
			case Iso20022Package.BUSINESS_TRANSACTION__SUB_TRANSACTION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubTransaction()).basicAdd(otherEnd, msgs);
			case Iso20022Package.BUSINESS_TRANSACTION__PARENT_TRANSACTION:
				if (parentTransaction != null)
					msgs = ((InternalEObject)parentTransaction).eInverseRemove(this, Iso20022Package.BUSINESS_TRANSACTION__SUB_TRANSACTION, BusinessTransaction.class, msgs);
				return basicSetParentTransaction((BusinessTransaction)otherEnd, msgs);
			case Iso20022Package.BUSINESS_TRANSACTION__TRACE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTrace()).basicAdd(otherEnd, msgs);
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
			case Iso20022Package.BUSINESS_TRANSACTION__BUSINESS_PROCESS_TRACE:
				return basicSetBusinessProcessTrace(null, msgs);
			case Iso20022Package.BUSINESS_TRANSACTION__PARTICIPANT:
				return ((InternalEList<?>)getParticipant()).basicRemove(otherEnd, msgs);
			case Iso20022Package.BUSINESS_TRANSACTION__TRANSMISSION:
				return ((InternalEList<?>)getTransmission()).basicRemove(otherEnd, msgs);
			case Iso20022Package.BUSINESS_TRANSACTION__MESSAGE_TRANSPORT_MODE:
				return basicSetMessageTransportMode(null, msgs);
			case Iso20022Package.BUSINESS_TRANSACTION__SUB_TRANSACTION:
				return ((InternalEList<?>)getSubTransaction()).basicRemove(otherEnd, msgs);
			case Iso20022Package.BUSINESS_TRANSACTION__PARENT_TRANSACTION:
				return basicSetParentTransaction(null, msgs);
			case Iso20022Package.BUSINESS_TRANSACTION__TRACE:
				return ((InternalEList<?>)getTrace()).basicRemove(otherEnd, msgs);
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
			case Iso20022Package.BUSINESS_TRANSACTION__BUSINESS_PROCESS_TRACE:
				if (resolve) return getBusinessProcessTrace();
				return basicGetBusinessProcessTrace();
			case Iso20022Package.BUSINESS_TRANSACTION__PARTICIPANT:
				return getParticipant();
			case Iso20022Package.BUSINESS_TRANSACTION__TRANSMISSION:
				return getTransmission();
			case Iso20022Package.BUSINESS_TRANSACTION__MESSAGE_TRANSPORT_MODE:
				if (resolve) return getMessageTransportMode();
				return basicGetMessageTransportMode();
			case Iso20022Package.BUSINESS_TRANSACTION__SUB_TRANSACTION:
				return getSubTransaction();
			case Iso20022Package.BUSINESS_TRANSACTION__PARENT_TRANSACTION:
				if (resolve) return getParentTransaction();
				return basicGetParentTransaction();
			case Iso20022Package.BUSINESS_TRANSACTION__TRACE:
				return getTrace();
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
			case Iso20022Package.BUSINESS_TRANSACTION__BUSINESS_PROCESS_TRACE:
				setBusinessProcessTrace((BusinessProcess)newValue);
				return;
			case Iso20022Package.BUSINESS_TRANSACTION__PARTICIPANT:
				getParticipant().clear();
				getParticipant().addAll((Collection<? extends Participant>)newValue);
				return;
			case Iso20022Package.BUSINESS_TRANSACTION__TRANSMISSION:
				getTransmission().clear();
				getTransmission().addAll((Collection<? extends MessageTransmission>)newValue);
				return;
			case Iso20022Package.BUSINESS_TRANSACTION__MESSAGE_TRANSPORT_MODE:
				setMessageTransportMode((MessageTransportMode)newValue);
				return;
			case Iso20022Package.BUSINESS_TRANSACTION__SUB_TRANSACTION:
				getSubTransaction().clear();
				getSubTransaction().addAll((Collection<? extends BusinessTransaction>)newValue);
				return;
			case Iso20022Package.BUSINESS_TRANSACTION__PARENT_TRANSACTION:
				setParentTransaction((BusinessTransaction)newValue);
				return;
			case Iso20022Package.BUSINESS_TRANSACTION__TRACE:
				getTrace().clear();
				getTrace().addAll((Collection<? extends MessageChoreography>)newValue);
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
			case Iso20022Package.BUSINESS_TRANSACTION__BUSINESS_PROCESS_TRACE:
				setBusinessProcessTrace((BusinessProcess)null);
				return;
			case Iso20022Package.BUSINESS_TRANSACTION__PARTICIPANT:
				getParticipant().clear();
				return;
			case Iso20022Package.BUSINESS_TRANSACTION__TRANSMISSION:
				getTransmission().clear();
				return;
			case Iso20022Package.BUSINESS_TRANSACTION__MESSAGE_TRANSPORT_MODE:
				setMessageTransportMode((MessageTransportMode)null);
				return;
			case Iso20022Package.BUSINESS_TRANSACTION__SUB_TRANSACTION:
				getSubTransaction().clear();
				return;
			case Iso20022Package.BUSINESS_TRANSACTION__PARENT_TRANSACTION:
				setParentTransaction((BusinessTransaction)null);
				return;
			case Iso20022Package.BUSINESS_TRANSACTION__TRACE:
				getTrace().clear();
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
			case Iso20022Package.BUSINESS_TRANSACTION__BUSINESS_PROCESS_TRACE:
				return businessProcessTrace != null;
			case Iso20022Package.BUSINESS_TRANSACTION__PARTICIPANT:
				return participant != null && !participant.isEmpty();
			case Iso20022Package.BUSINESS_TRANSACTION__TRANSMISSION:
				return transmission != null && !transmission.isEmpty();
			case Iso20022Package.BUSINESS_TRANSACTION__MESSAGE_TRANSPORT_MODE:
				return messageTransportMode != null;
			case Iso20022Package.BUSINESS_TRANSACTION__SUB_TRANSACTION:
				return subTransaction != null && !subTransaction.isEmpty();
			case Iso20022Package.BUSINESS_TRANSACTION__PARENT_TRANSACTION:
				return parentTransaction != null;
			case Iso20022Package.BUSINESS_TRANSACTION__TRACE:
				return trace != null && !trace.isEmpty();
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
			case Iso20022Package.BUSINESS_TRANSACTION___MESSAGE_TRANSMISSIONS_HAVE_UNIQUE_NAMES__MAP_DIAGNOSTICCHAIN:
				return MessageTransmissionsHaveUniqueNames((Map)arguments.get(0), (DiagnosticChain)arguments.get(1));
			case Iso20022Package.BUSINESS_TRANSACTION___PARTICIPANTS_HAVE_UNIQUE_NAMES__MAP_DIAGNOSTICCHAIN:
				return ParticipantsHaveUniqueNames((Map)arguments.get(0), (DiagnosticChain)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //BusinessTransactionImpl
