/**
 */
package iso20022;

import java.lang.String;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semantic Markup</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Enables modelers to markup elements of the Repository with semantic metadata. Each semanticMarkup string is a TupleValue. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso20022.SemanticMarkup#getType <em>Type</em>}</li>
 *   <li>{@link iso20022.SemanticMarkup#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see iso20022.Iso20022Package#getSemanticMarkup()
 * @model annotation="urn:iso:std:iso:20022:2013:ecore:extension basis='IMPLEMENTATION_ENHANCEMENT' description='Semantic Markup represented as a structured meta class instead of as a textual value'"
 * @generated
 */
public interface SemanticMarkup extends ModelEntity {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of semantic mark-up e.g. "synonym".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see iso20022.Iso20022Package#getSemanticMarkup_Type()
	 * @model ordered="false"
	 *        annotation="urn:iso:std:iso:20022:2013:ecore:extension basis='IMPLEMENTATION_ENHANCEMENT' description='Semantic Markup represented as a structured meta class instead of as a textual value'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link iso20022.SemanticMarkup#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link iso20022.SemanticMarkupElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The elements of semantic markup.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see iso20022.Iso20022Package#getSemanticMarkup_Elements()
	 * @model containment="true" ordered="false"
	 *        annotation="urn:iso:std:iso:20022:2013:ecore:extension basis='IMPLEMENTATION_ENHANCEMENT' description='Semantic Markup represented as a structured meta class instead of as a textual value'"
	 * @generated
	 */
	EList<SemanticMarkupElement> getElements();

} // SemanticMarkup
