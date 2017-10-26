/**
 */
package iso20022;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * re-usable Dictionary Item that is a building block for assembling MessageDefinitions, composed of a sequence of MessageElements
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso20022.MessageComponent#getXors <em>Xors</em>}</li>
 * </ul>
 *
 * @see iso20022.Iso20022Package#getMessageComponent()
 * @model annotation="urn:iso:std:iso:20022:2013:ecore:extension basis='IMPLEMENTATION_ENHANCEMENT' description='The property element is moved from MessageComponentType to the new abstract Meta Class MessageElementContainer so that only such MessageElementContainer may own MessageElements. This MessageElementContainer class is the super class of MessageComponent and ChoiceComponent. As such, it is constrained directly in the MOF MetaClass structure that an ExternalSchema may not contain MessageElement; instead of constraining this with an OCL rule.'"
 * @generated
 */
public interface MessageComponent extends MessageElementContainer {
	/**
	 * Returns the value of the '<em><b>Xors</b></em>' containment reference list.
	 * The list contents are of type {@link iso20022.Xor}.
	 * It is bidirectional and its opposite is '{@link iso20022.Xor#getMessageComponent <em>Message Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * XORs applied to a selection of the elements of the Message Component.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Xors</em>' containment reference list.
	 * @see iso20022.Iso20022Package#getMessageComponent_Xors()
	 * @see iso20022.Xor#getMessageComponent
	 * @model opposite="messageComponent" containment="true"
	 *        annotation="urn:iso:std:iso:20022:2013:ecore:extension basis='LEGACY'"
	 * @generated
	 */
	EList<Xor> getXors();

} // MessageComponent
