/**
 */
package iso20022;

import java.lang.String;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Code Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Set of Codes grouped together to characterize all the values of an attribute.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso20022.CodeSet#getTrace <em>Trace</em>}</li>
 *   <li>{@link iso20022.CodeSet#getDerivation <em>Derivation</em>}</li>
 *   <li>{@link iso20022.CodeSet#getIdentificationScheme <em>Identification Scheme</em>}</li>
 *   <li>{@link iso20022.CodeSet#getCode <em>Code</em>}</li>
 * </ul>
 *
 * @see iso20022.Iso20022Package#getCodeSet()
 * @model
 * @generated
 */
public interface CodeSet extends iso20022.String {
	/**
	 * Returns the value of the '<em><b>Trace</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link iso20022.CodeSet#getDerivation <em>Derivation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The CodeSet that this CodesSet is derived from.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trace</em>' reference.
	 * @see #setTrace(CodeSet)
	 * @see iso20022.Iso20022Package#getCodeSet_Trace()
	 * @see iso20022.CodeSet#getDerivation
	 * @model opposite="derivation" ordered="false"
	 *        annotation="urn:iso:std:iso:20022:2013:ecore:extension basis='IMPLEMENTATION_ENHANCEMENT' description='Traces are represented as a direct reference to the traced-to repository concept instead of using an intermediate Trace meta class'"
	 * @generated
	 */
	CodeSet getTrace();

	/**
	 * Sets the value of the '{@link iso20022.CodeSet#getTrace <em>Trace</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trace</em>' reference.
	 * @see #getTrace()
	 * @generated
	 */
	void setTrace(CodeSet value);

	/**
	 * Returns the value of the '<em><b>Derivation</b></em>' reference list.
	 * The list contents are of type {@link iso20022.CodeSet}.
	 * It is bidirectional and its opposite is '{@link iso20022.CodeSet#getTrace <em>Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The CodeSets which are derived from this CodeSet.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Derivation</em>' reference list.
	 * @see iso20022.Iso20022Package#getCodeSet_Derivation()
	 * @see iso20022.CodeSet#getTrace
	 * @model opposite="trace" ordered="false"
	 *        annotation="urn:iso:std:iso:20022:2013:ecore:extension basis='IMPLEMENTATION_ENHANCEMENT' description='Traces are represented as a direct reference to the traced-to repository concept instead of using an intermediate Trace meta class'"
	 * @generated
	 */
	EList<CodeSet> getDerivation();

	/**
	 * Returns the value of the '<em><b>Identification Scheme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Uniquely identifies a set of Codes through a Uniform Resource Identifier (URI).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identification Scheme</em>' attribute.
	 * @see #setIdentificationScheme(String)
	 * @see iso20022.Iso20022Package#getCodeSet_IdentificationScheme()
	 * @model ordered="false"
	 * @generated
	 */
	String getIdentificationScheme();

	/**
	 * Sets the value of the '{@link iso20022.CodeSet#getIdentificationScheme <em>Identification Scheme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identification Scheme</em>' attribute.
	 * @see #getIdentificationScheme()
	 * @generated
	 */
	void setIdentificationScheme(String value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference list.
	 * The list contents are of type {@link iso20022.Code}.
	 * It is bidirectional and its opposite is '{@link iso20022.Code#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A set of Codes belonging to the same CodeSet
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' containment reference list.
	 * @see iso20022.Iso20022Package#getCodeSet_Code()
	 * @see iso20022.Code#getOwner
	 * @model opposite="owner" containment="true"
	 * @generated
	 */
	EList<Code> getCode();

} // CodeSet
