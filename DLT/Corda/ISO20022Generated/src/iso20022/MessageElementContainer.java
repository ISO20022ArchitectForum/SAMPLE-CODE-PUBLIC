/**
 */
package iso20022;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Element Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Re-usable Dictionary Item that is a building block for assembling MessageDefinitions, composed of a sequence of MessageElements
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso20022.MessageElementContainer#getMessageElement <em>Message Element</em>}</li>
 * </ul>
 *
 * @see iso20022.Iso20022Package#getMessageElementContainer()
 * @model abstract="true"
 *        annotation="urn:iso:std:iso:20022:2013:ecore:extension basis='IMPLEMENTATION_ENHANCEMENT' description='The property element is moved from MessageComponentType to the new abstract Meta Class MessageElementContainer so that only such MessageElementContainer may own MessageElements. This MessageElementContainer class is the super class of MessageComponent and ChoiceComponent. As such, it is constrained directly in the MOF MetaClass structure that an ExternalSchema may not contain MessageElement; instead of constraining this with an OCL rule.'"
 * @generated
 */
public interface MessageElementContainer extends MessageComponentType {
	/**
	 * Returns the value of the '<em><b>Message Element</b></em>' containment reference list.
	 * The list contents are of type {@link iso20022.MessageElement}.
	 * It is bidirectional and its opposite is '{@link iso20022.MessageElement#getComponentContext <em>Component Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * a semantic property of a MessageComponentType
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message Element</em>' containment reference list.
	 * @see iso20022.Iso20022Package#getMessageElementContainer_MessageElement()
	 * @see iso20022.MessageElement#getComponentContext
	 * @model opposite="componentContext" containment="true"
	 *        annotation="urn:iso:std:iso:20022:2013:ecore:extension basis='IMPLEMENTATION_ENHANCEMENT' description='The property element is moved from MessageComponentType to the new abstract Meta Class MessageElementContainer so that only such MessageElementContainer may own MessageElements. This MessageElementContainer class is the super class of MessageComponent and ChoiceComponent. As such, it is constrained directly in the MOF MetaClass structure that an ExternalSchema may not contain MessageElement; instead of constraining this with an OCL rule.'"
	 * @generated
	 */
	EList<MessageElement> getMessageElement();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All MessageElements contained in this MessageComponentContainer must have different names.
	 * messageElement->forAll(el1,el2 |  el1 <> el2 implies el1.name <> el2.name)
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" contextRequired="true" contextOrdered="false" diagnosticsRequired="true" diagnosticsOrdered="false"
	 *        annotation="urn:iso:std:iso:20022:2013:ecore:extension basis='IMPLEMENTATION_ENHANCEMENT' description='The property element is moved from MessageComponentType to the new abstract Meta Class MessageElementContainer so that only such MessageElementContainer may own MessageElements. This MessageElementContainer class is the super class of MessageComponent and ChoiceComponent. As such, it is constrained directly in the MOF MetaClass structure that an ExternalSchema may not contain MessageElement; instead of constraining this with an OCL rule.'"
	 * @generated
	 */
	boolean MessageElementsHaveUniqueNames(Map context, DiagnosticChain diagnostics);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All the elements belonging to a technical MessageComponentContainer must be technical.
	 * self.isTechnical implies messageElement -> forAll(messageElement|messageElement.isTechnical)
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" contextRequired="true" contextOrdered="false" diagnosticsRequired="true" diagnosticsOrdered="false"
	 *        annotation="urn:iso:std:iso:20022:2013:ecore:extension basis='IMPLEMENTATION_ENHANCEMENT' description='The property element is moved from MessageComponentType to the new abstract Meta Class MessageElementContainer so that only such MessageElementContainer may own MessageElements. This MessageElementContainer class is the super class of MessageComponent and ChoiceComponent. As such, it is constrained directly in the MOF MetaClass structure that an ExternalSchema may not contain MessageElement; instead of constraining this with an OCL rule.'"
	 * @generated
	 */
	boolean technicalElement(Map context, DiagnosticChain diagnostics);

} // MessageElementContainer
