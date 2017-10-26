/**
 */
package iso20022;

import java.lang.String;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semantic Markup Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A semantic mark-up element defines a name + value pair for content. E.g. for synonyms, the name will be either "name" or "context" and the value will be the corresponding synonym name or context.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso20022.SemanticMarkupElement#getName <em>Name</em>}</li>
 *   <li>{@link iso20022.SemanticMarkupElement#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see iso20022.Iso20022Package#getSemanticMarkupElement()
 * @model annotation="urn:iso:std:iso:20022:2013:ecore:extension basis='IMPLEMENTATION_ENHANCEMENT' description='Semantic Markup represented as a structured meta class instead of as a textual value'"
 * @generated
 */
public interface SemanticMarkupElement extends ModelEntity {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of the semantic mark-up element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see iso20022.Iso20022Package#getSemanticMarkupElement_Name()
	 * @model ordered="false"
	 *        annotation="urn:iso:std:iso:20022:2013:ecore:extension basis='IMPLEMENTATION_ENHANCEMENT' description='Semantic Markup represented as a structured meta class instead of as a textual value'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link iso20022.SemanticMarkupElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Value of the semantic mark-up element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see iso20022.Iso20022Package#getSemanticMarkupElement_Value()
	 * @model ordered="false"
	 *        annotation="urn:iso:std:iso:20022:2013:ecore:extension basis='IMPLEMENTATION_ENHANCEMENT' description='Semantic Markup represented as a structured meta class instead of as a textual value'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link iso20022.SemanticMarkupElement#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // SemanticMarkupElement
