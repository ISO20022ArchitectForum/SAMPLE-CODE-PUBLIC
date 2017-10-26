/**
 */
package iso20022;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A set of MessageDefinitions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso20022.MessageSet#getGeneratedSyntax <em>Generated Syntax</em>}</li>
 *   <li>{@link iso20022.MessageSet#getValidEncoding <em>Valid Encoding</em>}</li>
 *   <li>{@link iso20022.MessageSet#getMessageDefinition <em>Message Definition</em>}</li>
 * </ul>
 *
 * @see iso20022.Iso20022Package#getMessageSet()
 * @model
 * @generated
 */
public interface MessageSet extends TopLevelCatalogueEntry {
	/**
	 * Returns the value of the '<em><b>Generated Syntax</b></em>' reference list.
	 * The list contents are of type {@link iso20022.Syntax}.
	 * It is bidirectional and its opposite is '{@link iso20022.Syntax#getGeneratedFor <em>Generated For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * identification of the syntax for a specific EncodingScheme
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Generated Syntax</em>' reference list.
	 * @see iso20022.Iso20022Package#getMessageSet_GeneratedSyntax()
	 * @see iso20022.Syntax#getGeneratedFor
	 * @model opposite="generatedFor" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<Syntax> getGeneratedSyntax();

	/**
	 * Returns the value of the '<em><b>Valid Encoding</b></em>' reference list.
	 * The list contents are of type {@link iso20022.Encoding}.
	 * It is bidirectional and its opposite is '{@link iso20022.Encoding#getMessageSet <em>Message Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the set of encodings considered ISO 20022 valid for this MessageSet
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Valid Encoding</em>' reference list.
	 * @see iso20022.Iso20022Package#getMessageSet_ValidEncoding()
	 * @see iso20022.Encoding#getMessageSet
	 * @model opposite="messageSet" ordered="false"
	 * @generated
	 */
	EList<Encoding> getValidEncoding();

	/**
	 * Returns the value of the '<em><b>Message Definition</b></em>' reference list.
	 * The list contents are of type {@link iso20022.MessageDefinition}.
	 * It is bidirectional and its opposite is '{@link iso20022.MessageDefinition#getMessageSet <em>Message Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the MessageDefinition that belongs to the MessageSet
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message Definition</em>' reference list.
	 * @see iso20022.Iso20022Package#getMessageSet_MessageDefinition()
	 * @see iso20022.MessageDefinition#getMessageSet
	 * @model opposite="messageSet" ordered="false"
	 * @generated
	 */
	EList<MessageDefinition> getMessageDefinition();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the generated syntax is derived from the syntax for a validEncoding
	 *  generatedSyntax->asBag() = validEncoding.syntax
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" contextRequired="true" contextOrdered="false" diagnosticsRequired="true" diagnosticsOrdered="false"
	 * @generated
	 */
	boolean GeneratedSyntaxDerivation(Map context, DiagnosticChain diagnostics);

} // MessageSet
