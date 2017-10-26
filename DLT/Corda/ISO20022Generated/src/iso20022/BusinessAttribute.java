/**
 */
package iso20022;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Business Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A BusinessElement, typed by a BusinessComponent or a DataType (contrary to a BusinessAssociationEnd, which is always typed by another BusinessComponent)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso20022.BusinessAttribute#getSimpleType <em>Simple Type</em>}</li>
 *   <li>{@link iso20022.BusinessAttribute#getComplexType <em>Complex Type</em>}</li>
 * </ul>
 *
 * @see iso20022.Iso20022Package#getBusinessAttribute()
 * @model
 * @generated
 */
public interface BusinessAttribute extends BusinessElement {
	/**
	 * Returns the value of the '<em><b>Simple Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Expresses that the content model of a BusinessAttribute may be specified by a type from the XSD type library or a derived datatype.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Simple Type</em>' reference.
	 * @see #setSimpleType(DataType)
	 * @see iso20022.Iso20022Package#getBusinessAttribute_SimpleType()
	 * @model ordered="false"
	 * @generated
	 */
	DataType getSimpleType();

	/**
	 * Sets the value of the '{@link iso20022.BusinessAttribute#getSimpleType <em>Simple Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simple Type</em>' reference.
	 * @see #getSimpleType()
	 * @generated
	 */
	void setSimpleType(DataType value);

	/**
	 * Returns the value of the '<em><b>Complex Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The BusinessComponent that describes the complex content model of the BusinessAttrribute.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Complex Type</em>' reference.
	 * @see #setComplexType(BusinessComponent)
	 * @see iso20022.Iso20022Package#getBusinessAttribute_ComplexType()
	 * @model ordered="false"
	 * @generated
	 */
	BusinessComponent getComplexType();

	/**
	 * Sets the value of the '{@link iso20022.BusinessAttribute#getComplexType <em>Complex Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Complex Type</em>' reference.
	 * @see #getComplexType()
	 * @generated
	 */
	void setComplexType(BusinessComponent value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A BusinessAttribute must have exactly one of the following: simpleType and complexType.
	 * complexType->size() + simpleType->size()  = 1
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" contextRequired="true" contextOrdered="false" diagnosticsRequired="true" diagnosticsOrdered="false"
	 * @generated
	 */
	boolean BusinessAttributeHasExactlyOneType(Map context, DiagnosticChain diagnostics);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Deriving Code Sets may only be used to type MessageAttributes.  Therefore, a BusinessAttribute may not be typed by a Deriving CodeSet.
	 * simpleType.oclIsKindOf(CodeSet) implies simpleType.oclAsType(CodeSet).trace->isEmpty()
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" contextRequired="true" contextOrdered="false" diagnosticsRequired="true" diagnosticsOrdered="false"
	 * @generated
	 */
	boolean NoDerivingCodeSetType(Map context, DiagnosticChain diagnostics);

} // BusinessAttribute
