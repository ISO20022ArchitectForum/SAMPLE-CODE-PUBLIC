/**
 */
package iso20022.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import iso20022.BusinessComponent;
import iso20022.Iso20022Package;
import iso20022.MessageBuildingBlock;
import iso20022.MessageComponentType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message Component Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso20022.impl.MessageComponentTypeImpl#getMessageBuildingBlock <em>Message Building Block</em>}</li>
 *   <li>{@link iso20022.impl.MessageComponentTypeImpl#isIsTechnical <em>Is Technical</em>}</li>
 *   <li>{@link iso20022.impl.MessageComponentTypeImpl#getTrace <em>Trace</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class MessageComponentTypeImpl extends TopLevelDictionaryEntryImpl implements MessageComponentType {
	/**
	 * The cached value of the '{@link #getMessageBuildingBlock() <em>Message Building Block</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageBuildingBlock()
	 * @generated
	 * @ordered
	 */
	protected EList<MessageBuildingBlock> messageBuildingBlock;

	/**
	 * The default value of the '{@link #isIsTechnical() <em>Is Technical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsTechnical()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_TECHNICAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #getTrace() <em>Trace</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrace()
	 * @generated
	 * @ordered
	 */
	protected BusinessComponent trace;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageComponentTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Iso20022Package.eINSTANCE.getMessageComponentType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MessageBuildingBlock> getMessageBuildingBlock() {
		if (messageBuildingBlock == null) {
			messageBuildingBlock = new EObjectWithInverseResolvingEList<MessageBuildingBlock>(MessageBuildingBlock.class, this, Iso20022Package.MESSAGE_COMPONENT_TYPE__MESSAGE_BUILDING_BLOCK, Iso20022Package.MESSAGE_BUILDING_BLOCK__COMPLEX_TYPE);
		}
		return messageBuildingBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isIsTechnical() {
		// TODO: implement this method to return the 'Is Technical' attribute >>> DONE
		// Ensure that you remove @generated or mark it @generated NOT
		return getTrace() == null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessComponent getTrace() {
		if (trace != null && trace.eIsProxy()) {
			InternalEObject oldTrace = (InternalEObject)trace;
			trace = (BusinessComponent)eResolveProxy(oldTrace);
			if (trace != oldTrace) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Iso20022Package.MESSAGE_COMPONENT_TYPE__TRACE, oldTrace, trace));
			}
		}
		return trace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessComponent basicGetTrace() {
		return trace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTrace(BusinessComponent newTrace, NotificationChain msgs) {
		BusinessComponent oldTrace = trace;
		trace = newTrace;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Iso20022Package.MESSAGE_COMPONENT_TYPE__TRACE, oldTrace, newTrace);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrace(BusinessComponent newTrace) {
		if (newTrace != trace) {
			NotificationChain msgs = null;
			if (trace != null)
				msgs = ((InternalEObject)trace).eInverseRemove(this, Iso20022Package.BUSINESS_COMPONENT__DERIVATION_COMPONENT, BusinessComponent.class, msgs);
			if (newTrace != null)
				msgs = ((InternalEObject)newTrace).eInverseAdd(this, Iso20022Package.BUSINESS_COMPONENT__DERIVATION_COMPONENT, BusinessComponent.class, msgs);
			msgs = basicSetTrace(newTrace, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Iso20022Package.MESSAGE_COMPONENT_TYPE__TRACE, newTrace, newTrace));
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
			case Iso20022Package.MESSAGE_COMPONENT_TYPE__MESSAGE_BUILDING_BLOCK:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMessageBuildingBlock()).basicAdd(otherEnd, msgs);
			case Iso20022Package.MESSAGE_COMPONENT_TYPE__TRACE:
				if (trace != null)
					msgs = ((InternalEObject)trace).eInverseRemove(this, Iso20022Package.BUSINESS_COMPONENT__DERIVATION_COMPONENT, BusinessComponent.class, msgs);
				return basicSetTrace((BusinessComponent)otherEnd, msgs);
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
			case Iso20022Package.MESSAGE_COMPONENT_TYPE__MESSAGE_BUILDING_BLOCK:
				return ((InternalEList<?>)getMessageBuildingBlock()).basicRemove(otherEnd, msgs);
			case Iso20022Package.MESSAGE_COMPONENT_TYPE__TRACE:
				return basicSetTrace(null, msgs);
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
			case Iso20022Package.MESSAGE_COMPONENT_TYPE__MESSAGE_BUILDING_BLOCK:
				return getMessageBuildingBlock();
			case Iso20022Package.MESSAGE_COMPONENT_TYPE__IS_TECHNICAL:
				return isIsTechnical();
			case Iso20022Package.MESSAGE_COMPONENT_TYPE__TRACE:
				if (resolve) return getTrace();
				return basicGetTrace();
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
			case Iso20022Package.MESSAGE_COMPONENT_TYPE__MESSAGE_BUILDING_BLOCK:
				getMessageBuildingBlock().clear();
				getMessageBuildingBlock().addAll((Collection<? extends MessageBuildingBlock>)newValue);
				return;
			case Iso20022Package.MESSAGE_COMPONENT_TYPE__TRACE:
				setTrace((BusinessComponent)newValue);
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
			case Iso20022Package.MESSAGE_COMPONENT_TYPE__MESSAGE_BUILDING_BLOCK:
				getMessageBuildingBlock().clear();
				return;
			case Iso20022Package.MESSAGE_COMPONENT_TYPE__TRACE:
				setTrace((BusinessComponent)null);
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
			case Iso20022Package.MESSAGE_COMPONENT_TYPE__MESSAGE_BUILDING_BLOCK:
				return messageBuildingBlock != null && !messageBuildingBlock.isEmpty();
			case Iso20022Package.MESSAGE_COMPONENT_TYPE__IS_TECHNICAL:
				return isIsTechnical() != IS_TECHNICAL_EDEFAULT;
			case Iso20022Package.MESSAGE_COMPONENT_TYPE__TRACE:
				return trace != null;
		}
		return super.eIsSet(featureID);
	}

} //MessageComponentTypeImpl
