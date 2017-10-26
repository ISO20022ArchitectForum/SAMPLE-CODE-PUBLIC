/**
 */
package iso20022;

import java.lang.String;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A quantity or amount measured with respect to another measured quantity or amount
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso20022.Rate#getBaseValue <em>Base Value</em>}</li>
 *   <li>{@link iso20022.Rate#getBaseUnitCode <em>Base Unit Code</em>}</li>
 * </ul>
 *
 * @see iso20022.Iso20022Package#getRate()
 * @model
 * @generated
 */
public interface Rate extends Decimal {
	/**
	 * Returns the value of the '<em><b>Base Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * specifies the ratio between the base value and the actual value
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Base Value</em>' attribute.
	 * @see #setBaseValue(Double)
	 * @see iso20022.Iso20022Package#getRate_BaseValue()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Double getBaseValue();

	/**
	 * Sets the value of the '{@link iso20022.Rate#getBaseValue <em>Base Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Value</em>' attribute.
	 * @see #getBaseValue()
	 * @generated
	 */
	void setBaseValue(Double value);

	/**
	 * Returns the value of the '<em><b>Base Unit Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * specifies unit code required to qualify this rate
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Base Unit Code</em>' attribute.
	 * @see #setBaseUnitCode(String)
	 * @see iso20022.Iso20022Package#getRate_BaseUnitCode()
	 * @model ordered="false"
	 * @generated
	 */
	String getBaseUnitCode();

	/**
	 * Sets the value of the '{@link iso20022.Rate#getBaseUnitCode <em>Base Unit Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Unit Code</em>' attribute.
	 * @see #getBaseUnitCode()
	 * @generated
	 */
	void setBaseUnitCode(String value);

} // Rate
