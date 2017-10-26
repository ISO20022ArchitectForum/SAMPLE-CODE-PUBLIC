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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import iso20022.Iso20022Package;
import iso20022.MessageBuildingBlock;
import iso20022.MessageComponent;
import iso20022.MessageDefinition;
import iso20022.MessageElement;
import iso20022.Xor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Xor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso20022.impl.XorImpl#getImpactedElements <em>Impacted Elements</em>}</li>
 *   <li>{@link iso20022.impl.XorImpl#getMessageComponent <em>Message Component</em>}</li>
 *   <li>{@link iso20022.impl.XorImpl#getImpactedMessageBuildingBlocks <em>Impacted Message Building Blocks</em>}</li>
 *   <li>{@link iso20022.impl.XorImpl#getMessageDefinition <em>Message Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XorImpl extends RepositoryConceptImpl implements Xor {
	/**
	 * The cached value of the '{@link #getImpactedElements() <em>Impacted Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImpactedElements()
	 * @generated
	 * @ordered
	 */
	protected EList<MessageElement> impactedElements;

	/**
	 * The cached value of the '{@link #getImpactedMessageBuildingBlocks() <em>Impacted Message Building Blocks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImpactedMessageBuildingBlocks()
	 * @generated
	 * @ordered
	 */
	protected EList<MessageBuildingBlock> impactedMessageBuildingBlocks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Iso20022Package.eINSTANCE.getXor();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MessageElement> getImpactedElements() {
		if (impactedElements == null) {
			impactedElements = new EObjectResolvingEList<MessageElement>(MessageElement.class, this, Iso20022Package.XOR__IMPACTED_ELEMENTS);
		}
		return impactedElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageComponent getMessageComponent() {
		if (eContainerFeatureID() != Iso20022Package.XOR__MESSAGE_COMPONENT) return null;
		return (MessageComponent)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMessageComponent(MessageComponent newMessageComponent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newMessageComponent, Iso20022Package.XOR__MESSAGE_COMPONENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageComponent(MessageComponent newMessageComponent) {
		if (newMessageComponent != eInternalContainer() || (eContainerFeatureID() != Iso20022Package.XOR__MESSAGE_COMPONENT && newMessageComponent != null)) {
			if (EcoreUtil.isAncestor(this, newMessageComponent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newMessageComponent != null)
				msgs = ((InternalEObject)newMessageComponent).eInverseAdd(this, Iso20022Package.MESSAGE_COMPONENT__XORS, MessageComponent.class, msgs);
			msgs = basicSetMessageComponent(newMessageComponent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Iso20022Package.XOR__MESSAGE_COMPONENT, newMessageComponent, newMessageComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MessageBuildingBlock> getImpactedMessageBuildingBlocks() {
		if (impactedMessageBuildingBlocks == null) {
			impactedMessageBuildingBlocks = new EObjectResolvingEList<MessageBuildingBlock>(MessageBuildingBlock.class, this, Iso20022Package.XOR__IMPACTED_MESSAGE_BUILDING_BLOCKS);
		}
		return impactedMessageBuildingBlocks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageDefinition getMessageDefinition() {
		if (eContainerFeatureID() != Iso20022Package.XOR__MESSAGE_DEFINITION) return null;
		return (MessageDefinition)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMessageDefinition(MessageDefinition newMessageDefinition, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newMessageDefinition, Iso20022Package.XOR__MESSAGE_DEFINITION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageDefinition(MessageDefinition newMessageDefinition) {
		if (newMessageDefinition != eInternalContainer() || (eContainerFeatureID() != Iso20022Package.XOR__MESSAGE_DEFINITION && newMessageDefinition != null)) {
			if (EcoreUtil.isAncestor(this, newMessageDefinition))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newMessageDefinition != null)
				msgs = ((InternalEObject)newMessageDefinition).eInverseAdd(this, Iso20022Package.MESSAGE_DEFINITION__XORS, MessageDefinition.class, msgs);
			msgs = basicSetMessageDefinition(newMessageDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Iso20022Package.XOR__MESSAGE_DEFINITION, newMessageDefinition, newMessageDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Iso20022Package.XOR__MESSAGE_COMPONENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetMessageComponent((MessageComponent)otherEnd, msgs);
			case Iso20022Package.XOR__MESSAGE_DEFINITION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetMessageDefinition((MessageDefinition)otherEnd, msgs);
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
			case Iso20022Package.XOR__MESSAGE_COMPONENT:
				return basicSetMessageComponent(null, msgs);
			case Iso20022Package.XOR__MESSAGE_DEFINITION:
				return basicSetMessageDefinition(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case Iso20022Package.XOR__MESSAGE_COMPONENT:
				return eInternalContainer().eInverseRemove(this, Iso20022Package.MESSAGE_COMPONENT__XORS, MessageComponent.class, msgs);
			case Iso20022Package.XOR__MESSAGE_DEFINITION:
				return eInternalContainer().eInverseRemove(this, Iso20022Package.MESSAGE_DEFINITION__XORS, MessageDefinition.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Iso20022Package.XOR__IMPACTED_ELEMENTS:
				return getImpactedElements();
			case Iso20022Package.XOR__MESSAGE_COMPONENT:
				return getMessageComponent();
			case Iso20022Package.XOR__IMPACTED_MESSAGE_BUILDING_BLOCKS:
				return getImpactedMessageBuildingBlocks();
			case Iso20022Package.XOR__MESSAGE_DEFINITION:
				return getMessageDefinition();
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
			case Iso20022Package.XOR__IMPACTED_ELEMENTS:
				getImpactedElements().clear();
				getImpactedElements().addAll((Collection<? extends MessageElement>)newValue);
				return;
			case Iso20022Package.XOR__MESSAGE_COMPONENT:
				setMessageComponent((MessageComponent)newValue);
				return;
			case Iso20022Package.XOR__IMPACTED_MESSAGE_BUILDING_BLOCKS:
				getImpactedMessageBuildingBlocks().clear();
				getImpactedMessageBuildingBlocks().addAll((Collection<? extends MessageBuildingBlock>)newValue);
				return;
			case Iso20022Package.XOR__MESSAGE_DEFINITION:
				setMessageDefinition((MessageDefinition)newValue);
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
			case Iso20022Package.XOR__IMPACTED_ELEMENTS:
				getImpactedElements().clear();
				return;
			case Iso20022Package.XOR__MESSAGE_COMPONENT:
				setMessageComponent((MessageComponent)null);
				return;
			case Iso20022Package.XOR__IMPACTED_MESSAGE_BUILDING_BLOCKS:
				getImpactedMessageBuildingBlocks().clear();
				return;
			case Iso20022Package.XOR__MESSAGE_DEFINITION:
				setMessageDefinition((MessageDefinition)null);
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
			case Iso20022Package.XOR__IMPACTED_ELEMENTS:
				return impactedElements != null && !impactedElements.isEmpty();
			case Iso20022Package.XOR__MESSAGE_COMPONENT:
				return getMessageComponent() != null;
			case Iso20022Package.XOR__IMPACTED_MESSAGE_BUILDING_BLOCKS:
				return impactedMessageBuildingBlocks != null && !impactedMessageBuildingBlocks.isEmpty();
			case Iso20022Package.XOR__MESSAGE_DEFINITION:
				return getMessageDefinition() != null;
		}
		return super.eIsSet(featureID);
	}

} //XorImpl
