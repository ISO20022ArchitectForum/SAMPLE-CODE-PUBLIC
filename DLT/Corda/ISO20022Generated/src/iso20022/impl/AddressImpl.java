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

import iso20022.Address;
import iso20022.BroadcastList;
import iso20022.Iso20022Package;
import iso20022.MessagingEndpoint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Address</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso20022.impl.AddressImpl#getBroadCastList <em>Broad Cast List</em>}</li>
 *   <li>{@link iso20022.impl.AddressImpl#getEndpoint <em>Endpoint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AddressImpl extends ModelEntityImpl implements Address {
	/**
	 * The cached value of the '{@link #getBroadCastList() <em>Broad Cast List</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBroadCastList()
	 * @generated
	 * @ordered
	 */
	protected EList<BroadcastList> broadCastList;

	/**
	 * The cached value of the '{@link #getEndpoint() <em>Endpoint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpoint()
	 * @generated
	 * @ordered
	 */
	protected MessagingEndpoint endpoint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddressImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Iso20022Package.eINSTANCE.getAddress();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BroadcastList> getBroadCastList() {
		if (broadCastList == null) {
			broadCastList = new EObjectWithInverseResolvingEList.ManyInverse<BroadcastList>(BroadcastList.class, this, Iso20022Package.ADDRESS__BROAD_CAST_LIST, Iso20022Package.BROADCAST_LIST__ADDRESS);
		}
		return broadCastList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessagingEndpoint getEndpoint() {
		if (endpoint != null && endpoint.eIsProxy()) {
			InternalEObject oldEndpoint = (InternalEObject)endpoint;
			endpoint = (MessagingEndpoint)eResolveProxy(oldEndpoint);
			if (endpoint != oldEndpoint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Iso20022Package.ADDRESS__ENDPOINT, oldEndpoint, endpoint));
			}
		}
		return endpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessagingEndpoint basicGetEndpoint() {
		return endpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndpoint(MessagingEndpoint newEndpoint, NotificationChain msgs) {
		MessagingEndpoint oldEndpoint = endpoint;
		endpoint = newEndpoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Iso20022Package.ADDRESS__ENDPOINT, oldEndpoint, newEndpoint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndpoint(MessagingEndpoint newEndpoint) {
		if (newEndpoint != endpoint) {
			NotificationChain msgs = null;
			if (endpoint != null)
				msgs = ((InternalEObject)endpoint).eInverseRemove(this, Iso20022Package.MESSAGING_ENDPOINT__LOCATION, MessagingEndpoint.class, msgs);
			if (newEndpoint != null)
				msgs = ((InternalEObject)newEndpoint).eInverseAdd(this, Iso20022Package.MESSAGING_ENDPOINT__LOCATION, MessagingEndpoint.class, msgs);
			msgs = basicSetEndpoint(newEndpoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Iso20022Package.ADDRESS__ENDPOINT, newEndpoint, newEndpoint));
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
			case Iso20022Package.ADDRESS__BROAD_CAST_LIST:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBroadCastList()).basicAdd(otherEnd, msgs);
			case Iso20022Package.ADDRESS__ENDPOINT:
				if (endpoint != null)
					msgs = ((InternalEObject)endpoint).eInverseRemove(this, Iso20022Package.MESSAGING_ENDPOINT__LOCATION, MessagingEndpoint.class, msgs);
				return basicSetEndpoint((MessagingEndpoint)otherEnd, msgs);
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
			case Iso20022Package.ADDRESS__BROAD_CAST_LIST:
				return ((InternalEList<?>)getBroadCastList()).basicRemove(otherEnd, msgs);
			case Iso20022Package.ADDRESS__ENDPOINT:
				return basicSetEndpoint(null, msgs);
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
			case Iso20022Package.ADDRESS__BROAD_CAST_LIST:
				return getBroadCastList();
			case Iso20022Package.ADDRESS__ENDPOINT:
				if (resolve) return getEndpoint();
				return basicGetEndpoint();
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
			case Iso20022Package.ADDRESS__BROAD_CAST_LIST:
				getBroadCastList().clear();
				getBroadCastList().addAll((Collection<? extends BroadcastList>)newValue);
				return;
			case Iso20022Package.ADDRESS__ENDPOINT:
				setEndpoint((MessagingEndpoint)newValue);
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
			case Iso20022Package.ADDRESS__BROAD_CAST_LIST:
				getBroadCastList().clear();
				return;
			case Iso20022Package.ADDRESS__ENDPOINT:
				setEndpoint((MessagingEndpoint)null);
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
			case Iso20022Package.ADDRESS__BROAD_CAST_LIST:
				return broadCastList != null && !broadCastList.isEmpty();
			case Iso20022Package.ADDRESS__ENDPOINT:
				return endpoint != null;
		}
		return super.eIsSet(featureID);
	}

} //AddressImpl
