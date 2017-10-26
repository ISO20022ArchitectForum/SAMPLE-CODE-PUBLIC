/**
 */
package iso20022;

import java.lang.String;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Any set of values drawn from the value space of 'boolean', as specified by W3C Recommendation XML Schema Part 2: Datatypes
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso20022.Boolean#getPattern <em>Pattern</em>}</li>
 * </ul>
 *
 * @see iso20022.Iso20022Package#getBoolean()
 * @model annotation="urn:iso:std:iso:20022:2013:ecore:extension basis='IMPLEMENTATION_CONSTRAINT' description='Prefixed with XSD to avoid confusion with base types available in programming languages: e.g. java.lang.String.'"
 * @generated
 */
public interface Boolean extends DataType {
	/**
	 * Returns the value of the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A constraint on the value space of a datatype which is achieved by constraining the lexical space to literals which match a specific pattern.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pattern</em>' attribute.
	 * @see #setPattern(String)
	 * @see iso20022.Iso20022Package#getBoolean_Pattern()
	 * @model ordered="false"
	 * @generated
	 */
	String getPattern();

	/**
	 * Sets the value of the '{@link iso20022.Boolean#getPattern <em>Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern</em>' attribute.
	 * @see #getPattern()
	 * @generated
	 */
	void setPattern(String value);

} // Boolean
