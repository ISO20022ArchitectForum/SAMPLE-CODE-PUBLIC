/**
 */
package iso20022;

import java.lang.String;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Doclet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Doclet provides a way of adding categorised documentation to an model entity.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso20022.Doclet#getType <em>Type</em>}</li>
 *   <li>{@link iso20022.Doclet#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @see iso20022.Iso20022Package#getDoclet()
 * @model annotation="urn:iso:std:iso:20022:2013:ecore:extension basis='RepositoryManagement' description='to store documentation information : scope, usage, ...'"
 * @generated
 */
public interface Doclet extends ModelEntity {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of doclet. The definition of the doclet type is left open so that new doclet types can be easily added without the need for a change to the meta-model.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see iso20022.Iso20022Package#getDoclet_Type()
	 * @model ordered="false"
	 *        annotation="urn:iso:std:iso:20022:2013:ecore:extension basis='RepositoryManagement' description='The type of the additional documentation information : scope, usage, title,...'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link iso20022.Doclet#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The content for the documentation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Content</em>' attribute.
	 * @see #setContent(String)
	 * @see iso20022.Iso20022Package#getDoclet_Content()
	 * @model ordered="false"
	 *        annotation="urn:iso:std:iso:20022:2013:ecore:extension basis='RepositoryManagement' description='The actual content of the additional documentation information : scope, usage, title,...'"
	 * @generated
	 */
	String getContent();

	/**
	 * Sets the value of the '{@link iso20022.Doclet#getContent <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' attribute.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(String value);

} // Doclet
