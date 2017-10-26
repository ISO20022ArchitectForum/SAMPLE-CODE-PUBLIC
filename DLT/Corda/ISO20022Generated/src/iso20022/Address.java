/**
 */
package iso20022;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Address</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * identification and efficient resolution to the location of a MessagingEndpoint
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso20022.Address#getBroadCastList <em>Broad Cast List</em>}</li>
 *   <li>{@link iso20022.Address#getEndpoint <em>Endpoint</em>}</li>
 * </ul>
 *
 * @see iso20022.Iso20022Package#getAddress()
 * @model
 * @generated
 */
public interface Address extends ModelEntity {
	/**
	 * Returns the value of the '<em><b>Broad Cast List</b></em>' reference list.
	 * The list contents are of type {@link iso20022.BroadcastList}.
	 * It is bidirectional and its opposite is '{@link iso20022.BroadcastList#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * a BroadCastList to which this Address belongs
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Broad Cast List</em>' reference list.
	 * @see iso20022.Iso20022Package#getAddress_BroadCastList()
	 * @see iso20022.BroadcastList#getAddress
	 * @model opposite="address" ordered="false"
	 * @generated
	 */
	EList<BroadcastList> getBroadCastList();

	/**
	 * Returns the value of the '<em><b>Endpoint</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link iso20022.MessagingEndpoint#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * specifies the MessagingEndpoint for the Address
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Endpoint</em>' reference.
	 * @see #setEndpoint(MessagingEndpoint)
	 * @see iso20022.Iso20022Package#getAddress_Endpoint()
	 * @see iso20022.MessagingEndpoint#getLocation
	 * @model opposite="location" required="true" ordered="false"
	 * @generated
	 */
	MessagingEndpoint getEndpoint();

	/**
	 * Sets the value of the '{@link iso20022.Address#getEndpoint <em>Endpoint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endpoint</em>' reference.
	 * @see #getEndpoint()
	 * @generated
	 */
	void setEndpoint(MessagingEndpoint value);

} // Address
