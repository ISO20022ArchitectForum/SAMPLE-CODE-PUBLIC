/**
 */
package iso20022;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Encoding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A particular set of encoding rules for a MessageInstance.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso20022.Encoding#getMessageSet <em>Message Set</em>}</li>
 *   <li>{@link iso20022.Encoding#getSyntax <em>Syntax</em>}</li>
 * </ul>
 *
 * @see iso20022.Iso20022Package#getEncoding()
 * @model
 * @generated
 */
public interface Encoding extends ModelEntity {
	/**
	 * Returns the value of the '<em><b>Message Set</b></em>' reference list.
	 * The list contents are of type {@link iso20022.MessageSet}.
	 * It is bidirectional and its opposite is '{@link iso20022.MessageSet#getValidEncoding <em>Valid Encoding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The MessageSets for which this Encoding is a valid ISO 20022 encoding
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message Set</em>' reference list.
	 * @see iso20022.Iso20022Package#getEncoding_MessageSet()
	 * @see iso20022.MessageSet#getValidEncoding
	 * @model opposite="validEncoding" ordered="false"
	 * @generated
	 */
	EList<MessageSet> getMessageSet();

	/**
	 * Returns the value of the '<em><b>Syntax</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link iso20022.Syntax#getPossibleEncodings <em>Possible Encodings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The source syntax on which an encoding applies
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Syntax</em>' reference.
	 * @see #setSyntax(Syntax)
	 * @see iso20022.Iso20022Package#getEncoding_Syntax()
	 * @see iso20022.Syntax#getPossibleEncodings
	 * @model opposite="possibleEncodings" required="true" ordered="false"
	 * @generated
	 */
	Syntax getSyntax();

	/**
	 * Sets the value of the '{@link iso20022.Encoding#getSyntax <em>Syntax</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Syntax</em>' reference.
	 * @see #getSyntax()
	 * @generated
	 */
	void setSyntax(Syntax value);

} // Encoding
