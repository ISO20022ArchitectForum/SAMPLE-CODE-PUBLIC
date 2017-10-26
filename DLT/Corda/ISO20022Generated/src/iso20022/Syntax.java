/**
 */
package iso20022;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Syntax</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * a particular syntax for a MessageInstance
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso20022.Syntax#getPossibleEncodings <em>Possible Encodings</em>}</li>
 *   <li>{@link iso20022.Syntax#getGeneratedFor <em>Generated For</em>}</li>
 * </ul>
 *
 * @see iso20022.Iso20022Package#getSyntax()
 * @model
 * @generated
 */
public interface Syntax extends ModelEntity {
	/**
	 * Returns the value of the '<em><b>Possible Encodings</b></em>' reference list.
	 * The list contents are of type {@link iso20022.Encoding}.
	 * It is bidirectional and its opposite is '{@link iso20022.Encoding#getSyntax <em>Syntax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the set of possible encodings for a given Syntax
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Possible Encodings</em>' reference list.
	 * @see iso20022.Iso20022Package#getSyntax_PossibleEncodings()
	 * @see iso20022.Encoding#getSyntax
	 * @model opposite="syntax" required="true" ordered="false"
	 * @generated
	 */
	EList<Encoding> getPossibleEncodings();

	/**
	 * Returns the value of the '<em><b>Generated For</b></em>' reference list.
	 * The list contents are of type {@link iso20022.MessageSet}.
	 * It is bidirectional and its opposite is '{@link iso20022.MessageSet#getGeneratedSyntax <em>Generated Syntax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the scheme in which a syntax is encoded
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Generated For</em>' reference list.
	 * @see iso20022.Iso20022Package#getSyntax_GeneratedFor()
	 * @see iso20022.MessageSet#getGeneratedSyntax
	 * @model opposite="generatedSyntax" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<MessageSet> getGeneratedFor();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the syntax that is valid for a MessageSet, based on the Encoding used
	 * generatedFor-> asBag()=possibleEncodings.messageSet
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" contextRequired="true" contextOrdered="false" diagnosticsRequired="true" diagnosticsOrdered="false"
	 * @generated
	 */
	boolean GeneratedForDerivation(Map context, DiagnosticChain diagnostics);

} // Syntax
