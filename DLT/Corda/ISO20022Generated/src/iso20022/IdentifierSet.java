/**
 */
package iso20022;

import java.lang.String;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Identifier Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Set of values whereby each value distinguishes uniquely one instance of an object within an identification scheme from all other instances of the objects within the same scheme.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso20022.IdentifierSet#getIdentificationScheme <em>Identification Scheme</em>}</li>
 * </ul>
 *
 * @see iso20022.Iso20022Package#getIdentifierSet()
 * @model
 * @generated
 */
public interface IdentifierSet extends iso20022.String {
	/**
	 * Returns the value of the '<em><b>Identification Scheme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Uniquely identifies a set of identifiers through a Uniform Resource Identifier (URI).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identification Scheme</em>' attribute.
	 * @see #setIdentificationScheme(String)
	 * @see iso20022.Iso20022Package#getIdentifierSet_IdentificationScheme()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getIdentificationScheme();

	/**
	 * Sets the value of the '{@link iso20022.IdentifierSet#getIdentificationScheme <em>Identification Scheme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identification Scheme</em>' attribute.
	 * @see #getIdentificationScheme()
	 * @generated
	 */
	void setIdentificationScheme(String value);

} // IdentifierSet
