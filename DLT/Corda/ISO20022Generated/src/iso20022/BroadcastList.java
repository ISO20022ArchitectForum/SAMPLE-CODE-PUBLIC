/**
 */
package iso20022;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Broadcast List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * set of references to MessagingEndpoints (identified by their Address), that is used for message broadcasting
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso20022.BroadcastList#getAddress <em>Address</em>}</li>
 * </ul>
 *
 * @see iso20022.Iso20022Package#getBroadcastList()
 * @model
 * @generated
 */
public interface BroadcastList extends ModelEntity {
	/**
	 * Returns the value of the '<em><b>Address</b></em>' reference list.
	 * The list contents are of type {@link iso20022.Address}.
	 * It is bidirectional and its opposite is '{@link iso20022.Address#getBroadCastList <em>Broad Cast List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * a BroadCastList entry using an Address
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Address</em>' reference list.
	 * @see iso20022.Iso20022Package#getBroadcastList_Address()
	 * @see iso20022.Address#getBroadCastList
	 * @model opposite="broadCastList" ordered="false"
	 * @generated
	 */
	EList<Address> getAddress();

} // BroadcastList
