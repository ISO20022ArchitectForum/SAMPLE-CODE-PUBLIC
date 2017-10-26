/**
 */
package iso20022;

import java.lang.String;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Defined</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Type which allows referring to a structure defined outside of the ISO20022 MessageDefinition.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso20022.UserDefined#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link iso20022.UserDefined#getNamespaceList <em>Namespace List</em>}</li>
 *   <li>{@link iso20022.UserDefined#getProcessContents <em>Process Contents</em>}</li>
 * </ul>
 *
 * @see iso20022.Iso20022Package#getUserDefined()
 * @model annotation="urn:iso:std:iso:20022:2013:ecore:extension basis='LEGACY'"
 * @generated
 */
public interface UserDefined extends MessageComponentType {
	/**
	 * Returns the value of the '<em><b>Namespace</b></em>' attribute.
	 * The literals are from the enumeration {@link iso20022.Namespace}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The URN namespace of the referenced external structure definition. The allowed values are: ##any, ##other or list. When equal to "list", then the value of the property "namespaceList" must be filled.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Namespace</em>' attribute.
	 * @see iso20022.Namespace
	 * @see #setNamespace(Namespace)
	 * @see iso20022.Iso20022Package#getUserDefined_Namespace()
	 * @model required="true" ordered="false"
	 *        annotation="urn:iso:std:iso:20022:2013:ecore:extension basis='LEGACY'"
	 * @generated
	 */
	Namespace getNamespace();

	/**
	 * Sets the value of the '{@link iso20022.UserDefined#getNamespace <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namespace</em>' attribute.
	 * @see iso20022.Namespace
	 * @see #getNamespace()
	 * @generated
	 */
	void setNamespace(Namespace value);

	/**
	 * Returns the value of the '<em><b>Namespace List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of URN namespaces.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Namespace List</em>' attribute.
	 * @see #setNamespaceList(String)
	 * @see iso20022.Iso20022Package#getUserDefined_NamespaceList()
	 * @model annotation="urn:iso:std:iso:20022:2013:ecore:extension basis='LEGACY'"
	 * @generated
	 */
	String getNamespaceList();

	/**
	 * Sets the value of the '{@link iso20022.UserDefined#getNamespaceList <em>Namespace List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namespace List</em>' attribute.
	 * @see #getNamespaceList()
	 * @generated
	 */
	void setNamespaceList(String value);

	/**
	 * Returns the value of the '<em><b>Process Contents</b></em>' attribute.
	 * The literals are from the enumeration {@link iso20022.ProcessContent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the kind of validation which must be performed on the external structure.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Process Contents</em>' attribute.
	 * @see iso20022.ProcessContent
	 * @see #setProcessContents(ProcessContent)
	 * @see iso20022.Iso20022Package#getUserDefined_ProcessContents()
	 * @model required="true" ordered="false"
	 *        annotation="urn:iso:std:iso:20022:2013:ecore:extension basis='LEGACY'"
	 * @generated
	 */
	ProcessContent getProcessContents();

	/**
	 * Sets the value of the '{@link iso20022.UserDefined#getProcessContents <em>Process Contents</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process Contents</em>' attribute.
	 * @see iso20022.ProcessContent
	 * @see #getProcessContents()
	 * @generated
	 */
	void setProcessContents(ProcessContent value);

} // UserDefined
