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

import iso20022.Iso20022Package;
import iso20022.MessageInstance;
import iso20022.SyntaxMessageScheme;
import iso20022.TransportMessage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso20022.impl.MessageInstanceImpl#getSpecification <em>Specification</em>}</li>
 *   <li>{@link iso20022.impl.MessageInstanceImpl#getTransportMessage <em>Transport Message</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MessageInstanceImpl extends ModelEntityImpl implements MessageInstance {
	/**
	 * The cached value of the '{@link #getSpecification() <em>Specification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecification()
	 * @generated
	 * @ordered
	 */
	protected SyntaxMessageScheme specification;

	/**
	 * The cached value of the '{@link #getTransportMessage() <em>Transport Message</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransportMessage()
	 * @generated
	 * @ordered
	 */
	protected EList<TransportMessage> transportMessage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Iso20022Package.eINSTANCE.getMessageInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SyntaxMessageScheme getSpecification() {
		if (specification != null && specification.eIsProxy()) {
			InternalEObject oldSpecification = (InternalEObject)specification;
			specification = (SyntaxMessageScheme)eResolveProxy(oldSpecification);
			if (specification != oldSpecification) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Iso20022Package.MESSAGE_INSTANCE__SPECIFICATION, oldSpecification, specification));
			}
		}
		return specification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SyntaxMessageScheme basicGetSpecification() {
		return specification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecification(SyntaxMessageScheme newSpecification) {
		SyntaxMessageScheme oldSpecification = specification;
		specification = newSpecification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Iso20022Package.MESSAGE_INSTANCE__SPECIFICATION, oldSpecification, specification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TransportMessage> getTransportMessage() {
		if (transportMessage == null) {
			transportMessage = new EObjectWithInverseResolvingEList<TransportMessage>(TransportMessage.class, this, Iso20022Package.MESSAGE_INSTANCE__TRANSPORT_MESSAGE, Iso20022Package.TRANSPORT_MESSAGE__MESSAGE_INSTANCE);
		}
		return transportMessage;
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
			case Iso20022Package.MESSAGE_INSTANCE__TRANSPORT_MESSAGE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTransportMessage()).basicAdd(otherEnd, msgs);
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
			case Iso20022Package.MESSAGE_INSTANCE__TRANSPORT_MESSAGE:
				return ((InternalEList<?>)getTransportMessage()).basicRemove(otherEnd, msgs);
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
			case Iso20022Package.MESSAGE_INSTANCE__SPECIFICATION:
				if (resolve) return getSpecification();
				return basicGetSpecification();
			case Iso20022Package.MESSAGE_INSTANCE__TRANSPORT_MESSAGE:
				return getTransportMessage();
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
			case Iso20022Package.MESSAGE_INSTANCE__SPECIFICATION:
				setSpecification((SyntaxMessageScheme)newValue);
				return;
			case Iso20022Package.MESSAGE_INSTANCE__TRANSPORT_MESSAGE:
				getTransportMessage().clear();
				getTransportMessage().addAll((Collection<? extends TransportMessage>)newValue);
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
			case Iso20022Package.MESSAGE_INSTANCE__SPECIFICATION:
				setSpecification((SyntaxMessageScheme)null);
				return;
			case Iso20022Package.MESSAGE_INSTANCE__TRANSPORT_MESSAGE:
				getTransportMessage().clear();
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
			case Iso20022Package.MESSAGE_INSTANCE__SPECIFICATION:
				return specification != null;
			case Iso20022Package.MESSAGE_INSTANCE__TRANSPORT_MESSAGE:
				return transportMessage != null && !transportMessage.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MessageInstanceImpl
