/**
 */
package iso20022.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import iso20022.Iso20022Package;
import iso20022.MessageComponent;
import iso20022.Xor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso20022.impl.MessageComponentImpl#getXors <em>Xors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MessageComponentImpl extends MessageElementContainerImpl implements MessageComponent {
	/**
	 * The cached value of the '{@link #getXors() <em>Xors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXors()
	 * @generated
	 * @ordered
	 */
	protected EList<Xor> xors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Iso20022Package.eINSTANCE.getMessageComponent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Xor> getXors() {
		if (xors == null) {
			xors = new EObjectContainmentWithInverseEList<Xor>(Xor.class, this, Iso20022Package.MESSAGE_COMPONENT__XORS, Iso20022Package.XOR__MESSAGE_COMPONENT);
		}
		return xors;
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
			case Iso20022Package.MESSAGE_COMPONENT__XORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getXors()).basicAdd(otherEnd, msgs);
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
			case Iso20022Package.MESSAGE_COMPONENT__XORS:
				return ((InternalEList<?>)getXors()).basicRemove(otherEnd, msgs);
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
			case Iso20022Package.MESSAGE_COMPONENT__XORS:
				return getXors();
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
			case Iso20022Package.MESSAGE_COMPONENT__XORS:
				getXors().clear();
				getXors().addAll((Collection<? extends Xor>)newValue);
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
			case Iso20022Package.MESSAGE_COMPONENT__XORS:
				getXors().clear();
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
			case Iso20022Package.MESSAGE_COMPONENT__XORS:
				return xors != null && !xors.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MessageComponentImpl
