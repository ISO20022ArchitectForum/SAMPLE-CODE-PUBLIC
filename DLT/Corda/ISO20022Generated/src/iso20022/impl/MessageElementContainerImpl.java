/**
 */
package iso20022.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import iso20022.Iso20022Package;
import iso20022.MessageElement;
import iso20022.MessageElementContainer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message Element Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso20022.impl.MessageElementContainerImpl#getMessageElement <em>Message Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class MessageElementContainerImpl extends MessageComponentTypeImpl implements MessageElementContainer {
	/**
	 * The cached value of the '{@link #getMessageElement() <em>Message Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageElement()
	 * @generated
	 * @ordered
	 */
	protected EList<MessageElement> messageElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageElementContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Iso20022Package.eINSTANCE.getMessageElementContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MessageElement> getMessageElement() {
		if (messageElement == null) {
			messageElement = new EObjectContainmentWithInverseEList<MessageElement>(MessageElement.class, this, Iso20022Package.MESSAGE_ELEMENT_CONTAINER__MESSAGE_ELEMENT, Iso20022Package.MESSAGE_ELEMENT__COMPONENT_CONTEXT);
		}
		return messageElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean MessageElementsHaveUniqueNames(Map context, DiagnosticChain diagnostics) {
		// TODO: implement this method >>> DONE
		// Ensure that you remove @generated or mark it @generated NOT
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean technicalElement(Map context, DiagnosticChain diagnostics) {
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
			case Iso20022Package.MESSAGE_ELEMENT_CONTAINER__MESSAGE_ELEMENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMessageElement()).basicAdd(otherEnd, msgs);
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
			case Iso20022Package.MESSAGE_ELEMENT_CONTAINER__MESSAGE_ELEMENT:
				return ((InternalEList<?>)getMessageElement()).basicRemove(otherEnd, msgs);
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
			case Iso20022Package.MESSAGE_ELEMENT_CONTAINER__MESSAGE_ELEMENT:
				return getMessageElement();
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
			case Iso20022Package.MESSAGE_ELEMENT_CONTAINER__MESSAGE_ELEMENT:
				getMessageElement().clear();
				getMessageElement().addAll((Collection<? extends MessageElement>)newValue);
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
			case Iso20022Package.MESSAGE_ELEMENT_CONTAINER__MESSAGE_ELEMENT:
				getMessageElement().clear();
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
			case Iso20022Package.MESSAGE_ELEMENT_CONTAINER__MESSAGE_ELEMENT:
				return messageElement != null && !messageElement.isEmpty();
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
			case Iso20022Package.MESSAGE_ELEMENT_CONTAINER___MESSAGE_ELEMENTS_HAVE_UNIQUE_NAMES__MAP_DIAGNOSTICCHAIN:
				return MessageElementsHaveUniqueNames((Map)arguments.get(0), (DiagnosticChain)arguments.get(1));
			case Iso20022Package.MESSAGE_ELEMENT_CONTAINER___TECHNICAL_ELEMENT__MAP_DIAGNOSTICCHAIN:
				return technicalElement((Map)arguments.get(0), (DiagnosticChain)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //MessageElementContainerImpl
