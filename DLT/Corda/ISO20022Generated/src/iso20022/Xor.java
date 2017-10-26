/**
 */
package iso20022;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Xor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A rule which enforces a choice amongst a set of Message Elements contained either within a Message Definition or a Message Component.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso20022.Xor#getImpactedElements <em>Impacted Elements</em>}</li>
 *   <li>{@link iso20022.Xor#getMessageComponent <em>Message Component</em>}</li>
 *   <li>{@link iso20022.Xor#getImpactedMessageBuildingBlocks <em>Impacted Message Building Blocks</em>}</li>
 *   <li>{@link iso20022.Xor#getMessageDefinition <em>Message Definition</em>}</li>
 * </ul>
 *
 * @see iso20022.Iso20022Package#getXor()
 * @model annotation="urn:iso:std:iso:20022:2013:ecore:extension basis='LEGACY'"
 * @generated
 */
public interface Xor extends RepositoryConcept {
	/**
	 * Returns the value of the '<em><b>Impacted Elements</b></em>' reference list.
	 * The list contents are of type {@link iso20022.MessageElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Message Elements impacted by the XOR.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Impacted Elements</em>' reference list.
	 * @see iso20022.Iso20022Package#getXor_ImpactedElements()
	 * @model annotation="urn:iso:std:iso:20022:2013:ecore:extension basis='LEGACY'"
	 * @generated
	 */
	EList<MessageElement> getImpactedElements();

	/**
	 * Returns the value of the '<em><b>Message Component</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link iso20022.MessageComponent#getXors <em>Xors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Message Component owning the XOR.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message Component</em>' container reference.
	 * @see #setMessageComponent(MessageComponent)
	 * @see iso20022.Iso20022Package#getXor_MessageComponent()
	 * @see iso20022.MessageComponent#getXors
	 * @model opposite="xors" transient="false" ordered="false"
	 *        annotation="urn:iso:std:iso:20022:2013:ecore:extension basis='LEGACY'"
	 * @generated
	 */
	MessageComponent getMessageComponent();

	/**
	 * Sets the value of the '{@link iso20022.Xor#getMessageComponent <em>Message Component</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Component</em>' container reference.
	 * @see #getMessageComponent()
	 * @generated
	 */
	void setMessageComponent(MessageComponent value);

	/**
	 * Returns the value of the '<em><b>Impacted Message Building Blocks</b></em>' reference list.
	 * The list contents are of type {@link iso20022.MessageBuildingBlock}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MessageBuildingBlocks impacted by the XOR.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Impacted Message Building Blocks</em>' reference list.
	 * @see iso20022.Iso20022Package#getXor_ImpactedMessageBuildingBlocks()
	 * @model annotation="urn:iso:std:iso:20022:2013:ecore:extension basis='LEGACY'"
	 * @generated
	 */
	EList<MessageBuildingBlock> getImpactedMessageBuildingBlocks();

	/**
	 * Returns the value of the '<em><b>Message Definition</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link iso20022.MessageDefinition#getXors <em>Xors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Message Definition owning the XOR.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message Definition</em>' container reference.
	 * @see #setMessageDefinition(MessageDefinition)
	 * @see iso20022.Iso20022Package#getXor_MessageDefinition()
	 * @see iso20022.MessageDefinition#getXors
	 * @model opposite="xors" transient="false" ordered="false"
	 *        annotation="urn:iso:std:iso:20022:2013:ecore:extension basis='LEGACY'"
	 * @generated
	 */
	MessageDefinition getMessageDefinition();

	/**
	 * Sets the value of the '{@link iso20022.Xor#getMessageDefinition <em>Message Definition</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Definition</em>' container reference.
	 * @see #getMessageDefinition()
	 * @generated
	 */
	void setMessageDefinition(MessageDefinition value);

} // Xor
