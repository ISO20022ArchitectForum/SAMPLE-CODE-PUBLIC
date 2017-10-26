/**
 */
package iso20022;

import java.lang.String;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>External Schema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Reusable Dictionary Item that allows referring to a structure defined outside of the ISO 20022 MessageDefinition.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso20022.ExternalSchema#getNamespaceList <em>Namespace List</em>}</li>
 *   <li>{@link iso20022.ExternalSchema#getProcessContent <em>Process Content</em>}</li>
 * </ul>
 *
 * @see iso20022.Iso20022Package#getExternalSchema()
 * @model
 * @generated
 */
public interface ExternalSchema extends MessageComponentType {
	/**
	 * Returns the value of the '<em><b>Namespace List</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the description of the content model of an ExternalSchema, through (a set of) URI.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Namespace List</em>' attribute list.
	 * @see iso20022.Iso20022Package#getExternalSchema_NamespaceList()
	 * @model
	 * @generated
	 */
	EList<String> getNamespaceList();

	/**
	 * Returns the value of the '<em><b>Process Content</b></em>' attribute.
	 * The literals are from the enumeration {@link iso20022.ProcessContent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies whether it is required for the content model of the ExternalSchema to be validated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Process Content</em>' attribute.
	 * @see iso20022.ProcessContent
	 * @see #setProcessContent(ProcessContent)
	 * @see iso20022.Iso20022Package#getExternalSchema_ProcessContent()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ProcessContent getProcessContent();

	/**
	 * Sets the value of the '{@link iso20022.ExternalSchema#getProcessContent <em>Process Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process Content</em>' attribute.
	 * @see iso20022.ProcessContent
	 * @see #getProcessContent()
	 * @generated
	 */
	void setProcessContent(ProcessContent value);

} // ExternalSchema
