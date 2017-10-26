/**
 */
package iso20022;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multiplicity Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Any model entity where a multiplicity can be defined.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso20022.MultiplicityEntity#getMaxOccurs <em>Max Occurs</em>}</li>
 *   <li>{@link iso20022.MultiplicityEntity#getMinOccurs <em>Min Occurs</em>}</li>
 * </ul>
 *
 * @see iso20022.Iso20022Package#getMultiplicityEntity()
 * @model abstract="true"
 *        annotation="urn:iso:std:iso:20022:2013:ecore:extension basis='IMPLEMENTATION_ENHANCEMENT' description='Two features maxOccurs and minOccurs are used instead of the single DataType feature Cardinality.'"
 * @generated
 */
public interface MultiplicityEntity extends EObject {
	/**
	 * Returns the value of the '<em><b>Max Occurs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MaxOccurs is an integer with a value greater than or equal to the lower limit. If undefined an unlimited upper value is assumed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Occurs</em>' attribute.
	 * @see #setMaxOccurs(Integer)
	 * @see iso20022.Iso20022Package#getMultiplicityEntity_MaxOccurs()
	 * @model ordered="false"
	 *        annotation="urn:iso:std:iso:20022:2013:ecore:extension basis='IMPLEMENTATION_ENHANCEMENT' description='Two features maxOccurs and minOccurs are used instead of the single DataType feature Cardinality.'"
	 * @generated
	 */
	Integer getMaxOccurs();

	/**
	 * Sets the value of the '{@link iso20022.MultiplicityEntity#getMaxOccurs <em>Max Occurs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Occurs</em>' attribute.
	 * @see #getMaxOccurs()
	 * @generated
	 */
	void setMaxOccurs(Integer value);

	/**
	 * Returns the value of the '<em><b>Min Occurs</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MinOccurs is an integer with value greater than or equal to zero. If undefined a value of zero is assumed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Min Occurs</em>' attribute.
	 * @see #setMinOccurs(Integer)
	 * @see iso20022.Iso20022Package#getMultiplicityEntity_MinOccurs()
	 * @model default="0" ordered="false"
	 *        annotation="urn:iso:std:iso:20022:2013:ecore:extension basis='IMPLEMENTATION_ENHANCEMENT' description='Two features maxOccurs and minOccurs are used instead of the single DataType feature Cardinality.'"
	 * @generated
	 */
	Integer getMinOccurs();

	/**
	 * Sets the value of the '{@link iso20022.MultiplicityEntity#getMinOccurs <em>Min Occurs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Occurs</em>' attribute.
	 * @see #getMinOccurs()
	 * @generated
	 */
	void setMinOccurs(Integer value);

} // MultiplicityEntity
