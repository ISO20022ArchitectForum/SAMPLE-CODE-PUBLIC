/**
 */
package iso20022;

import java.lang.String;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Business Area</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Set of strongly related business activities, that provide a self-standing business value to a set of BusinessRoles.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso20022.BusinessArea#getCode <em>Code</em>}</li>
 *   <li>{@link iso20022.BusinessArea#getMessageDefinition <em>Message Definition</em>}</li>
 * </ul>
 *
 * @see iso20022.Iso20022Package#getBusinessArea()
 * @model
 * @generated
 */
public interface BusinessArea extends TopLevelCatalogueEntry {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value of the BusinessArea code.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see iso20022.Iso20022Package#getBusinessArea_Code()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link iso20022.BusinessArea#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Message Definition</b></em>' containment reference list.
	 * The list contents are of type {@link iso20022.MessageDefinition}.
	 * It is bidirectional and its opposite is '{@link iso20022.MessageDefinition#getBusinessArea <em>Business Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The MessageDefinition that belongs to the BusinessArea.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message Definition</em>' containment reference list.
	 * @see iso20022.Iso20022Package#getBusinessArea_MessageDefinition()
	 * @see iso20022.MessageDefinition#getBusinessArea
	 * @model opposite="businessArea" containment="true" ordered="false"
	 * @generated
	 */
	EList<MessageDefinition> getMessageDefinition();

} // BusinessArea
