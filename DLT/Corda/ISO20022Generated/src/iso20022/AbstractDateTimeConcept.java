/**
 */
package iso20022;

import java.lang.String;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Date Time Concept</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Abstract definition of a data type whose properties are common to all kinds of time-related concepts.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso20022.AbstractDateTimeConcept#getMinInclusive <em>Min Inclusive</em>}</li>
 *   <li>{@link iso20022.AbstractDateTimeConcept#getMinExclusive <em>Min Exclusive</em>}</li>
 *   <li>{@link iso20022.AbstractDateTimeConcept#getMaxInclusive <em>Max Inclusive</em>}</li>
 *   <li>{@link iso20022.AbstractDateTimeConcept#getMaxExclusive <em>Max Exclusive</em>}</li>
 *   <li>{@link iso20022.AbstractDateTimeConcept#getPattern <em>Pattern</em>}</li>
 * </ul>
 *
 * @see iso20022.Iso20022Package#getAbstractDateTimeConcept()
 * @model abstract="true"
 *        annotation="urn:iso:std:iso:20022:2013:ecore:extension basis='IMPLEMENTATION_ENHANCEMENT' description='This abstract meta class factorises the properties common to date and time meta classes.'"
 * @generated
 */
public interface AbstractDateTimeConcept extends DataType {
	/**
	 * Returns the value of the '<em><b>Min Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the lowest value in the allowed set of values
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Min Inclusive</em>' attribute.
	 * @see #setMinInclusive(String)
	 * @see iso20022.Iso20022Package#getAbstractDateTimeConcept_MinInclusive()
	 * @model ordered="false"
	 *        annotation="urn:iso:std:iso:20022:2013:ecore:extension basis='IMPLEMENTATION_ENHANCEMENT'"
	 * @generated
	 */
	String getMinInclusive();

	/**
	 * Sets the value of the '{@link iso20022.AbstractDateTimeConcept#getMinInclusive <em>Min Inclusive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Inclusive</em>' attribute.
	 * @see #getMinInclusive()
	 * @generated
	 */
	void setMinInclusive(String value);

	/**
	 * Returns the value of the '<em><b>Min Exclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the lowest but one value in the allowed set of values
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Min Exclusive</em>' attribute.
	 * @see #setMinExclusive(String)
	 * @see iso20022.Iso20022Package#getAbstractDateTimeConcept_MinExclusive()
	 * @model ordered="false"
	 *        annotation="urn:iso:std:iso:20022:2013:ecore:extension basis='IMPLEMENTATION_ENHANCEMENT'"
	 * @generated
	 */
	String getMinExclusive();

	/**
	 * Sets the value of the '{@link iso20022.AbstractDateTimeConcept#getMinExclusive <em>Min Exclusive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Exclusive</em>' attribute.
	 * @see #getMinExclusive()
	 * @generated
	 */
	void setMinExclusive(String value);

	/**
	 * Returns the value of the '<em><b>Max Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the highest value in the allowed set of values
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Inclusive</em>' attribute.
	 * @see #setMaxInclusive(String)
	 * @see iso20022.Iso20022Package#getAbstractDateTimeConcept_MaxInclusive()
	 * @model ordered="false"
	 *        annotation="urn:iso:std:iso:20022:2013:ecore:extension basis='IMPLEMENTATION_ENHANCEMENT'"
	 * @generated
	 */
	String getMaxInclusive();

	/**
	 * Sets the value of the '{@link iso20022.AbstractDateTimeConcept#getMaxInclusive <em>Max Inclusive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Inclusive</em>' attribute.
	 * @see #getMaxInclusive()
	 * @generated
	 */
	void setMaxInclusive(String value);

	/**
	 * Returns the value of the '<em><b>Max Exclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the highest but one value in the allowed set of values
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Exclusive</em>' attribute.
	 * @see #setMaxExclusive(String)
	 * @see iso20022.Iso20022Package#getAbstractDateTimeConcept_MaxExclusive()
	 * @model ordered="false"
	 *        annotation="urn:iso:std:iso:20022:2013:ecore:extension basis='IMPLEMENTATION_ENHANCEMENT'"
	 * @generated
	 */
	String getMaxExclusive();

	/**
	 * Sets the value of the '{@link iso20022.AbstractDateTimeConcept#getMaxExclusive <em>Max Exclusive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Exclusive</em>' attribute.
	 * @see #getMaxExclusive()
	 * @generated
	 */
	void setMaxExclusive(String value);

	/**
	 * Returns the value of the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A constraint on the value space of a datatype which is achieved by constraining the lexical space to literals which match a specific pattern.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pattern</em>' attribute.
	 * @see #setPattern(String)
	 * @see iso20022.Iso20022Package#getAbstractDateTimeConcept_Pattern()
	 * @model ordered="false"
	 *        annotation="urn:iso:std:iso:20022:2013:ecore:extension basis='IMPLEMENTATION_ENHANCEMENT'"
	 * @generated
	 */
	String getPattern();

	/**
	 * Sets the value of the '{@link iso20022.AbstractDateTimeConcept#getPattern <em>Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern</em>' attribute.
	 * @see #getPattern()
	 * @generated
	 */
	void setPattern(String value);

} // AbstractDateTimeConcept
