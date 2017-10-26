/**
 */
package iso20022;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Business Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Property of a BusinessComponent that has a distinctive meaning within the scope of that BusinessComponent.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso20022.BusinessElement#isIsDerived <em>Is Derived</em>}</li>
 *   <li>{@link iso20022.BusinessElement#getDerivation <em>Derivation</em>}</li>
 *   <li>{@link iso20022.BusinessElement#getBusinessElementType <em>Business Element Type</em>}</li>
 *   <li>{@link iso20022.BusinessElement#getElementContext <em>Element Context</em>}</li>
 * </ul>
 *
 * @see iso20022.Iso20022Package#getBusinessElement()
 * @model abstract="true"
 * @generated
 */
public interface BusinessElement extends Construct, BusinessConcept {
	/**
	 * Returns the value of the '<em><b>Is Derived</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies whether a BusinessElement can be computed using other BusinessElements, but that is shown for clarity even though it adds no semantic information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Derived</em>' attribute.
	 * @see #setIsDerived(boolean)
	 * @see iso20022.Iso20022Package#getBusinessElement_IsDerived()
	 * @model default="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsDerived();

	/**
	 * Sets the value of the '{@link iso20022.BusinessElement#isIsDerived <em>Is Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Derived</em>' attribute.
	 * @see #isIsDerived()
	 * @generated
	 */
	void setIsDerived(boolean value);

	/**
	 * Returns the value of the '<em><b>Derivation</b></em>' reference list.
	 * The list contents are of type {@link iso20022.MessageElement}.
	 * It is bidirectional and its opposite is '{@link iso20022.MessageElement#getBusinessElementTrace <em>Business Element Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All of the MessageElements that derive from one BusinessElement in a specific BusinessComponent.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Derivation</em>' reference list.
	 * @see iso20022.Iso20022Package#getBusinessElement_Derivation()
	 * @see iso20022.MessageElement#getBusinessElementTrace
	 * @model opposite="businessElementTrace" ordered="false"
	 *        annotation="urn:iso:std:iso:20022:2013:ecore:extension basis='IMPLEMENTATION_ENHANCEMENT' description='Traces are represented as a direct reference to the traced-to repository concept instead of using an intermediate Trace meta class'"
	 * @generated
	 */
	EList<MessageElement> getDerivation();

	/**
	 * Returns the value of the '<em><b>Business Element Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Derived direct reference to the type of the BusinessElement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Business Element Type</em>' reference.
	 * @see iso20022.Iso20022Package#getBusinessElement_BusinessElementType()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="urn:iso:std:iso:20022:2013:ecore:extension basis='IMPLEMENTATION_ENHANCEMENT'"
	 * @generated
	 */
	BusinessElementType getBusinessElementType();

	/**
	 * Returns the value of the '<em><b>Element Context</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link iso20022.BusinessComponent#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The business context in which the BusinessElement is used
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Element Context</em>' container reference.
	 * @see #setElementContext(BusinessComponent)
	 * @see iso20022.Iso20022Package#getBusinessElement_ElementContext()
	 * @see iso20022.BusinessComponent#getElement
	 * @model opposite="element" required="true" transient="false" ordered="false"
	 * @generated
	 */
	BusinessComponent getElementContext();

	/**
	 * Sets the value of the '{@link iso20022.BusinessElement#getElementContext <em>Element Context</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Context</em>' container reference.
	 * @see #getElementContext()
	 * @generated
	 */
	void setElementContext(BusinessComponent value);

} // BusinessElement
