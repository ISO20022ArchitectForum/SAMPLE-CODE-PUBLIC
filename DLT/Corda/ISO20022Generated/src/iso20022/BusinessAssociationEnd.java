/**
 */
package iso20022;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Business Association End</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The context of a BusinessAssociation must be the type of its opposite and vice-versa
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso20022.BusinessAssociationEnd#getOpposite <em>Opposite</em>}</li>
 *   <li>{@link iso20022.BusinessAssociationEnd#getAggregation <em>Aggregation</em>}</li>
 *   <li>{@link iso20022.BusinessAssociationEnd#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see iso20022.Iso20022Package#getBusinessAssociationEnd()
 * @model
 * @generated
 */
public interface BusinessAssociationEnd extends BusinessElement {
	/**
	 * Returns the value of the '<em><b>Opposite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Opposite end of a bi-directional relationship between 2 BusinessComponents.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Opposite</em>' reference.
	 * @see #setOpposite(BusinessAssociationEnd)
	 * @see iso20022.Iso20022Package#getBusinessAssociationEnd_Opposite()
	 * @model ordered="false"
	 *        annotation="urn:iso:std:iso:20022:2013:ecore:extension basis='IMPLEMENTATION_ENHANCEMENT' description='Direct reference to the opposite BusinessAssociationEnd'"
	 * @generated
	 */
	BusinessAssociationEnd getOpposite();

	/**
	 * Sets the value of the '{@link iso20022.BusinessAssociationEnd#getOpposite <em>Opposite</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opposite</em>' reference.
	 * @see #getOpposite()
	 * @generated
	 */
	void setOpposite(BusinessAssociationEnd value);

	/**
	 * Returns the value of the '<em><b>Aggregation</b></em>' attribute.
	 * The literals are from the enumeration {@link iso20022.Aggregation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Expresses the strength of the semantic relationship between two BusinessComponents.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aggregation</em>' attribute.
	 * @see iso20022.Aggregation
	 * @see #setAggregation(Aggregation)
	 * @see iso20022.Iso20022Package#getBusinessAssociationEnd_Aggregation()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Aggregation getAggregation();

	/**
	 * Sets the value of the '{@link iso20022.BusinessAssociationEnd#getAggregation <em>Aggregation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregation</em>' attribute.
	 * @see iso20022.Aggregation
	 * @see #getAggregation()
	 * @generated
	 */
	void setAggregation(Aggregation value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link iso20022.BusinessComponent#getAssociationDomain <em>Association Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies that a BusinessAssociationEnd always has a complex content model and is therefore always typed by a BusinessComponent, contrarily to a BusinessAttribute which may be typed by a data type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(BusinessComponent)
	 * @see iso20022.Iso20022Package#getBusinessAssociationEnd_Type()
	 * @see iso20022.BusinessComponent#getAssociationDomain
	 * @model opposite="associationDomain" required="true" ordered="false"
	 * @generated
	 */
	BusinessComponent getType();

	/**
	 * Sets the value of the '{@link iso20022.BusinessAssociationEnd#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(BusinessComponent value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Two opposite association ends may not have composite or shared aggregation at the same time
	 * not(aggregation <> Aggregation::NONE and opposite.aggregation <> Aggregation::NONE)
	 * 
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" contextRequired="true" contextOrdered="false" diagnosticsRequired="true" diagnosticsOrdered="false"
	 * @generated
	 */
	boolean AtMostOneAggregatedEnd(Map context, DiagnosticChain diagnostics);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The context of this end must be the type of the opposite and vice-versa
	 * opposite.elementContext = type and elementContext = opposite.type
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" contextRequired="true" contextOrdered="false" diagnosticsRequired="true" diagnosticsOrdered="false"
	 * @generated
	 */
	boolean ContextConsistentWithType(Map context, DiagnosticChain diagnostics);

} // BusinessAssociationEnd
