/**
 */
package iso20022;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Business Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Representation of a (part of a) key business notion, characterized by specific BusinessElements.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso20022.BusinessComponent#getSubType <em>Sub Type</em>}</li>
 *   <li>{@link iso20022.BusinessComponent#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link iso20022.BusinessComponent#getElement <em>Element</em>}</li>
 *   <li>{@link iso20022.BusinessComponent#getDerivationComponent <em>Derivation Component</em>}</li>
 *   <li>{@link iso20022.BusinessComponent#getAssociationDomain <em>Association Domain</em>}</li>
 *   <li>{@link iso20022.BusinessComponent#getDerivationElement <em>Derivation Element</em>}</li>
 * </ul>
 *
 * @see iso20022.Iso20022Package#getBusinessComponent()
 * @model
 * @generated
 */
public interface BusinessComponent extends TopLevelDictionaryEntry, BusinessElementType, BusinessConcept {
	/**
	 * Returns the value of the '<em><b>Sub Type</b></em>' reference list.
	 * The list contents are of type {@link iso20022.BusinessComponent}.
	 * It is bidirectional and its opposite is '{@link iso20022.BusinessComponent#getSuperType <em>Super Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The BusinessComponents that specialize this BusinessComponent.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sub Type</em>' reference list.
	 * @see iso20022.Iso20022Package#getBusinessComponent_SubType()
	 * @see iso20022.BusinessComponent#getSuperType
	 * @model opposite="superType" ordered="false"
	 * @generated
	 */
	EList<BusinessComponent> getSubType();

	/**
	 * Returns the value of the '<em><b>Super Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link iso20022.BusinessComponent#getSubType <em>Sub Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The BusinessComponent that is specialized by this BusinessComponent.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Super Type</em>' reference.
	 * @see #setSuperType(BusinessComponent)
	 * @see iso20022.Iso20022Package#getBusinessComponent_SuperType()
	 * @see iso20022.BusinessComponent#getSubType
	 * @model opposite="subType" ordered="false"
	 * @generated
	 */
	BusinessComponent getSuperType();

	/**
	 * Sets the value of the '{@link iso20022.BusinessComponent#getSuperType <em>Super Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Type</em>' reference.
	 * @see #getSuperType()
	 * @generated
	 */
	void setSuperType(BusinessComponent value);

	/**
	 * Returns the value of the '<em><b>Element</b></em>' containment reference list.
	 * The list contents are of type {@link iso20022.BusinessElement}.
	 * It is bidirectional and its opposite is '{@link iso20022.BusinessElement#getElementContext <em>Element Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A semantic property of a BusinessComponent.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Element</em>' containment reference list.
	 * @see iso20022.Iso20022Package#getBusinessComponent_Element()
	 * @see iso20022.BusinessElement#getElementContext
	 * @model opposite="elementContext" containment="true"
	 * @generated
	 */
	EList<BusinessElement> getElement();

	/**
	 * Returns the value of the '<em><b>Derivation Component</b></em>' reference list.
	 * The list contents are of type {@link iso20022.MessageComponentType}.
	 * It is bidirectional and its opposite is '{@link iso20022.MessageComponentType#getTrace <em>Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All of the MessageComponentTypes that derive from this BusinessComponent.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Derivation Component</em>' reference list.
	 * @see iso20022.Iso20022Package#getBusinessComponent_DerivationComponent()
	 * @see iso20022.MessageComponentType#getTrace
	 * @model opposite="trace" ordered="false"
	 *        annotation="urn:iso:std:iso:20022:2013:ecore:extension basis='IMPLEMENTATION_ENHANCEMENT' description='Traces are represented as a direct reference to the traced-to repository concept instead of using an intermediate Trace meta class'"
	 * @generated
	 */
	EList<MessageComponentType> getDerivationComponent();

	/**
	 * Returns the value of the '<em><b>Association Domain</b></em>' reference list.
	 * The list contents are of type {@link iso20022.BusinessAssociationEnd}.
	 * It is bidirectional and its opposite is '{@link iso20022.BusinessAssociationEnd#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the semantics that determine how the BusinessComponent may participate in the BusinessAssociation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Association Domain</em>' reference list.
	 * @see iso20022.Iso20022Package#getBusinessComponent_AssociationDomain()
	 * @see iso20022.BusinessAssociationEnd#getType
	 * @model opposite="type" ordered="false"
	 * @generated
	 */
	EList<BusinessAssociationEnd> getAssociationDomain();

	/**
	 * Returns the value of the '<em><b>Derivation Element</b></em>' reference list.
	 * The list contents are of type {@link iso20022.MessageElement}.
	 * It is bidirectional and its opposite is '{@link iso20022.MessageElement#getBusinessComponentTrace <em>Business Component Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All of the MessageElements that derive from this BusinessComponent.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Derivation Element</em>' reference list.
	 * @see iso20022.Iso20022Package#getBusinessComponent_DerivationElement()
	 * @see iso20022.MessageElement#getBusinessComponentTrace
	 * @model opposite="businessComponentTrace" ordered="false"
	 *        annotation="urn:iso:std:iso:20022:2013:ecore:extension basis='IMPLEMENTATION_ENHANCEMENT' description='Traces are represented as a direct reference to the traced-to repository concept instead of using an intermediate Trace meta class'"
	 * @generated
	 */
	EList<MessageElement> getDerivationElement();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All BusinessElements contained by this BusinessComponents have different names
	 * element->forAll(el1,el2 : BusinessElement| el1 <> el2 implies el1.name <> el2.name)
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" contextRequired="true" contextOrdered="false" diagnosticsRequired="true" diagnosticsOrdered="false"
	 * @generated
	 */
	boolean BusinessElementsHaveUniqueNames(Map context, DiagnosticChain diagnostics);

} // BusinessComponent
