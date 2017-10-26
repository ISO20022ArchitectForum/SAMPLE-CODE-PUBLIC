/**
 */
package iso20022;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Choice Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * re-usable Dictionary Item that is a building block for assembling MessageDefinitions, composed of a choice of MessageElements
 * <!-- end-model-doc -->
 *
 *
 * @see iso20022.Iso20022Package#getChoiceComponent()
 * @model annotation="urn:iso:std:iso:20022:2013:ecore:extension basis='IMPLEMENTATION_ENHANCEMENT' description='The property element is moved from MessageComponentType to the new abstract Meta Class MessageElementContainer so that only such MessageElementContainer may own MessageElements. This MessageElementContainer class is the super class of MessageComponent and ChoiceComponent. As such, it is constrained directly in the MOF MetaClass structure that an ExternalSchema may not contain MessageElement; instead of constraining this with an OCL rule.'"
 * @generated
 */
public interface ChoiceComponent extends MessageElementContainer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A MessageComponent or ChoiceComponent must have at least one MessageElement
	 * messageElement->notEmpty( ) 
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" contextRequired="true" contextOrdered="false" diagnosticsRequired="true" diagnosticsOrdered="false"
	 * @generated
	 */
	boolean AtLeastOneProperty(Map context, DiagnosticChain diagnostics);

} // ChoiceComponent
