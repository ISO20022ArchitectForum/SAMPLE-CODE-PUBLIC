/**
 */
package iso20022;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Amount</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A number of monetary units specified in a currency where the unit of currency is explicit or implied.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso20022.Amount#getCurrencyIdentifierSet <em>Currency Identifier Set</em>}</li>
 * </ul>
 *
 * @see iso20022.Iso20022Package#getAmount()
 * @model
 * @generated
 */
public interface Amount extends Decimal {
	/**
	 * Returns the value of the '<em><b>Currency Identifier Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * specifies the allowed currencies that can be used to qualify this amount
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Currency Identifier Set</em>' reference.
	 * @see #setCurrencyIdentifierSet(DataType)
	 * @see iso20022.Iso20022Package#getAmount_CurrencyIdentifierSet()
	 * @model ordered="false"
	 * @generated
	 */
	DataType getCurrencyIdentifierSet();

	/**
	 * Sets the value of the '{@link iso20022.Amount#getCurrencyIdentifierSet <em>Currency Identifier Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currency Identifier Set</em>' reference.
	 * @see #getCurrencyIdentifierSet()
	 * @generated
	 */
	void setCurrencyIdentifierSet(DataType value);

} // Amount
