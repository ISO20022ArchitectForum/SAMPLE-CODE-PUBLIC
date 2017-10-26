/**
 */
package iso20022;

import java.lang.String;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decimal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Any set of values drawn from the value space of 'decimal', as specified by W3C Recommendation XML Schema Part 2: Datatypes
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso20022.Decimal#getMinInclusive <em>Min Inclusive</em>}</li>
 *   <li>{@link iso20022.Decimal#getMinExclusive <em>Min Exclusive</em>}</li>
 *   <li>{@link iso20022.Decimal#getMaxInclusive <em>Max Inclusive</em>}</li>
 *   <li>{@link iso20022.Decimal#getMaxExclusive <em>Max Exclusive</em>}</li>
 *   <li>{@link iso20022.Decimal#getTotalDigits <em>Total Digits</em>}</li>
 *   <li>{@link iso20022.Decimal#getFractionDigits <em>Fraction Digits</em>}</li>
 *   <li>{@link iso20022.Decimal#getPattern <em>Pattern</em>}</li>
 * </ul>
 *
 * @see iso20022.Iso20022Package#getDecimal()
 * @model annotation="urn:iso:std:iso:20022:2013:ecore:extension basis='IMPLEMENTATION_CONSTRAINT' description='Prefixed with XSD to avoid confusion with base types available in programming languages: e.g. java.lang.String.'"
 * @generated
 */
public interface Decimal extends DataType {
	/**
	 * Returns the value of the '<em><b>Min Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the lowest value in the allowed set of values
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Min Inclusive</em>' attribute.
	 * @see #setMinInclusive(String)
	 * @see iso20022.Iso20022Package#getDecimal_MinInclusive()
	 * @model ordered="false"
	 * @generated
	 */
	String getMinInclusive();

	/**
	 * Sets the value of the '{@link iso20022.Decimal#getMinInclusive <em>Min Inclusive</em>}' attribute.
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
	 * @see iso20022.Iso20022Package#getDecimal_MinExclusive()
	 * @model ordered="false"
	 * @generated
	 */
	String getMinExclusive();

	/**
	 * Sets the value of the '{@link iso20022.Decimal#getMinExclusive <em>Min Exclusive</em>}' attribute.
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
	 * @see iso20022.Iso20022Package#getDecimal_MaxInclusive()
	 * @model ordered="false"
	 * @generated
	 */
	String getMaxInclusive();

	/**
	 * Sets the value of the '{@link iso20022.Decimal#getMaxInclusive <em>Max Inclusive</em>}' attribute.
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
	 * @see iso20022.Iso20022Package#getDecimal_MaxExclusive()
	 * @model ordered="false"
	 * @generated
	 */
	String getMaxExclusive();

	/**
	 * Sets the value of the '{@link iso20022.Decimal#getMaxExclusive <em>Max Exclusive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Exclusive</em>' attribute.
	 * @see #getMaxExclusive()
	 * @generated
	 */
	void setMaxExclusive(String value);

	/**
	 * Returns the value of the '<em><b>Total Digits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the maximum number of allowed digits in a Decimal number
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Total Digits</em>' attribute.
	 * @see #setTotalDigits(Integer)
	 * @see iso20022.Iso20022Package#getDecimal_TotalDigits()
	 * @model ordered="false"
	 * @generated
	 */
	Integer getTotalDigits();

	/**
	 * Sets the value of the '{@link iso20022.Decimal#getTotalDigits <em>Total Digits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Digits</em>' attribute.
	 * @see #getTotalDigits()
	 * @generated
	 */
	void setTotalDigits(Integer value);

	/**
	 * Returns the value of the '<em><b>Fraction Digits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the fractional part of a Decimal number
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fraction Digits</em>' attribute.
	 * @see #setFractionDigits(Integer)
	 * @see iso20022.Iso20022Package#getDecimal_FractionDigits()
	 * @model ordered="false"
	 * @generated
	 */
	Integer getFractionDigits();

	/**
	 * Sets the value of the '{@link iso20022.Decimal#getFractionDigits <em>Fraction Digits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fraction Digits</em>' attribute.
	 * @see #getFractionDigits()
	 * @generated
	 */
	void setFractionDigits(Integer value);

	/**
	 * Returns the value of the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A constraint on the value space of a datatype which is achieved by constraining the lexical space to literals which match a specific pattern.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pattern</em>' attribute.
	 * @see #setPattern(String)
	 * @see iso20022.Iso20022Package#getDecimal_Pattern()
	 * @model ordered="false"
	 * @generated
	 */
	String getPattern();

	/**
	 * Sets the value of the '{@link iso20022.Decimal#getPattern <em>Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern</em>' attribute.
	 * @see #getPattern()
	 * @generated
	 */
	void setPattern(String value);

} // Decimal
