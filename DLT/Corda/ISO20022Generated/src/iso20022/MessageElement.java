/**
 */
package iso20022;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Characteristic of a MessageComponent / ChoiceComponent, having a unique meaning within the scope of that MessageComponent / ChoiceComponent
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso20022.MessageElement#isIsTechnical <em>Is Technical</em>}</li>
 *   <li>{@link iso20022.MessageElement#getBusinessComponentTrace <em>Business Component Trace</em>}</li>
 *   <li>{@link iso20022.MessageElement#getBusinessElementTrace <em>Business Element Trace</em>}</li>
 *   <li>{@link iso20022.MessageElement#getComponentContext <em>Component Context</em>}</li>
 *   <li>{@link iso20022.MessageElement#isIsDerived <em>Is Derived</em>}</li>
 * </ul>
 *
 * @see iso20022.Iso20022Package#getMessageElement()
 * @model abstract="true"
 *        annotation="urn:iso:std:iso:20022:2013:ecore:extension basis='IMPLEMENTATION_ENHANCEMENT' description='The property element is moved from MessageComponentType to the new abstract Meta Class MessageElementContainer so that only such MessageElementContainer may own MessageElements. This MessageElementContainer class is the super class of MessageComponent and ChoiceComponent. As such, it is constrained directly in the MOF MetaClass structure that an ExternalSchema may not contain MessageElement; instead of constraining this with an OCL rule.'"
 * @generated
 */
public interface MessageElement extends MessageConstruct, MessageConcept {
	/**
	 * Returns the value of the '<em><b>Is Technical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * a property of a MessageElement indicating whether it has a semantic relationship to a BusinessComponent / BusinessElement, i.e. whether it is derived from a BusinessComponent  /  BusinessElement
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Technical</em>' attribute.
	 * @see iso20022.Iso20022Package#getMessageElement_IsTechnical()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	boolean isIsTechnical();

	/**
	 * Returns the value of the '<em><b>Business Component Trace</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link iso20022.BusinessComponent#getDerivationElement <em>Derivation Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the trace of a MessageElement to the BusinessComponent from which it is derived
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Business Component Trace</em>' reference.
	 * @see #setBusinessComponentTrace(BusinessComponent)
	 * @see iso20022.Iso20022Package#getMessageElement_BusinessComponentTrace()
	 * @see iso20022.BusinessComponent#getDerivationElement
	 * @model opposite="derivationElement" ordered="false"
	 *        annotation="urn:iso:std:iso:20022:2013:ecore:extension basis='IMPLEMENTATION_ENHANCEMENT' description='Traces are represented as a direct reference to the traced-to repository concept instead of using an intermediate Trace meta class'"
	 * @generated
	 */
	BusinessComponent getBusinessComponentTrace();

	/**
	 * Sets the value of the '{@link iso20022.MessageElement#getBusinessComponentTrace <em>Business Component Trace</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Business Component Trace</em>' reference.
	 * @see #getBusinessComponentTrace()
	 * @generated
	 */
	void setBusinessComponentTrace(BusinessComponent value);

	/**
	 * Returns the value of the '<em><b>Business Element Trace</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link iso20022.BusinessElement#getDerivation <em>Derivation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The trace of a MessageElement to the BusinessElement from which the MessageElement is derived
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Business Element Trace</em>' reference.
	 * @see #setBusinessElementTrace(BusinessElement)
	 * @see iso20022.Iso20022Package#getMessageElement_BusinessElementTrace()
	 * @see iso20022.BusinessElement#getDerivation
	 * @model opposite="derivation" ordered="false"
	 *        annotation="urn:iso:std:iso:20022:2013:ecore:extension basis='IMPLEMENTATION_ENHANCEMENT' description='Traces are represented as a direct reference to the traced-to repository concept instead of using an intermediate Trace meta class'"
	 * @generated
	 */
	BusinessElement getBusinessElementTrace();

	/**
	 * Sets the value of the '{@link iso20022.MessageElement#getBusinessElementTrace <em>Business Element Trace</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Business Element Trace</em>' reference.
	 * @see #getBusinessElementTrace()
	 * @generated
	 */
	void setBusinessElementTrace(BusinessElement value);

	/**
	 * Returns the value of the '<em><b>Component Context</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link iso20022.MessageElementContainer#getMessageElement <em>Message Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the MessageComponent that describes the context within which the MessageElement is defined
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Component Context</em>' container reference.
	 * @see #setComponentContext(MessageElementContainer)
	 * @see iso20022.Iso20022Package#getMessageElement_ComponentContext()
	 * @see iso20022.MessageElementContainer#getMessageElement
	 * @model opposite="messageElement" required="true" transient="false" ordered="false"
	 * @generated
	 */
	MessageElementContainer getComponentContext();

	/**
	 * Sets the value of the '{@link iso20022.MessageElement#getComponentContext <em>Component Context</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Context</em>' container reference.
	 * @see #getComponentContext()
	 * @generated
	 */
	void setComponentContext(MessageElementContainer value);

	/**
	 * Returns the value of the '<em><b>Is Derived</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * a Property of a MessageElement specifying whether a MessageElement can be computed using other MessageElements, but that is shown for clarity even though it adds no semantic information
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Derived</em>' attribute.
	 * @see #setIsDerived(boolean)
	 * @see iso20022.Iso20022Package#getMessageElement_IsDerived()
	 * @model default="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsDerived();

	/**
	 * Sets the value of the '{@link iso20022.MessageElement#isIsDerived <em>Is Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Derived</em>' attribute.
	 * @see #isIsDerived()
	 * @generated
	 */
	void setIsDerived(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A MessageElement may not trace to both a BusinessComponent and a BusinessElement
	 * businessComponentTrace->size( ) + businessElementTrace->size( ) <= 1
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" contextRequired="true" contextOrdered="false" diagnosticsRequired="true" diagnosticsOrdered="false"
	 * @generated
	 */
	boolean NoMoreThanOneTrace(Map context, DiagnosticChain diagnostics);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A trace can only raise the minimum cardinality and can only lower the maximum cardinality
	 * minOccurs >= businessElementTrace.minOccurs and (businessElementTrace.maxOccurs.oclIsUndefined() or maxOccurs <= businessElementTrace.maxOccurs)
	 * 
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" contextRequired="true" contextOrdered="false" diagnosticsRequired="true" diagnosticsOrdered="false"
	 * @generated
	 */
	boolean CardinalityAlignment(Map context, DiagnosticChain diagnostics);

} // MessageElement
