/**
 */
package iso20022;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Association End</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Kind of MessageElement that relates two MessageComponentTypes.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso20022.MessageAssociationEnd#isIsComposite <em>Is Composite</em>}</li>
 *   <li>{@link iso20022.MessageAssociationEnd#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see iso20022.Iso20022Package#getMessageAssociationEnd()
 * @model
 * @generated
 */
public interface MessageAssociationEnd extends MessageElement {
	/**
	 * Returns the value of the '<em><b>Is Composite</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates if the message element is a composite.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Composite</em>' attribute.
	 * @see #setIsComposite(boolean)
	 * @see iso20022.Iso20022Package#getMessageAssociationEnd_IsComposite()
	 * @model default="true" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsComposite();

	/**
	 * Sets the value of the '{@link iso20022.MessageAssociationEnd#isIsComposite <em>Is Composite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Composite</em>' attribute.
	 * @see #isIsComposite()
	 * @generated
	 */
	void setIsComposite(boolean value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The MessageComponentType which specifies the complex content model of a MessageAssociationEnd.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(MessageComponentType)
	 * @see iso20022.Iso20022Package#getMessageAssociationEnd_Type()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	MessageComponentType getType();

	/**
	 * Sets the value of the '{@link iso20022.MessageAssociationEnd#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(MessageComponentType value);

} // MessageAssociationEnd
