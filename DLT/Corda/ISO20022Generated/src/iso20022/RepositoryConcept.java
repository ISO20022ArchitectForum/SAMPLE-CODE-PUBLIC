/**
 */
package iso20022;

import java.lang.String;

import java.util.Date;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repository Concept</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * artefact that has been defined during the development of an ISO 20022 MessageDefinition and which is stored in the Repository
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso20022.RepositoryConcept#getName <em>Name</em>}</li>
 *   <li>{@link iso20022.RepositoryConcept#getDefinition <em>Definition</em>}</li>
 *   <li>{@link iso20022.RepositoryConcept#getSemanticMarkup <em>Semantic Markup</em>}</li>
 *   <li>{@link iso20022.RepositoryConcept#getDoclet <em>Doclet</em>}</li>
 *   <li>{@link iso20022.RepositoryConcept#getExample <em>Example</em>}</li>
 *   <li>{@link iso20022.RepositoryConcept#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link iso20022.RepositoryConcept#getRegistrationStatus <em>Registration Status</em>}</li>
 *   <li>{@link iso20022.RepositoryConcept#getRemovalDate <em>Removal Date</em>}</li>
 * </ul>
 *
 * @see iso20022.Iso20022Package#getRepositoryConcept()
 * @model abstract="true"
 * @generated
 */
public interface RepositoryConcept extends ModelEntity {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * a word or set of words by which a RepositoryConcept is known, addressed or referred to
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see iso20022.Iso20022Package#getRepositoryConcept_Name()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link iso20022.RepositoryConcept#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * describes the semantic meaning of a RepositoryConcept
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Definition</em>' attribute.
	 * @see #setDefinition(String)
	 * @see iso20022.Iso20022Package#getRepositoryConcept_Definition()
	 * @model ordered="false"
	 * @generated
	 */
	String getDefinition();

	/**
	 * Sets the value of the '{@link iso20022.RepositoryConcept#getDefinition <em>Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition</em>' attribute.
	 * @see #getDefinition()
	 * @generated
	 */
	void setDefinition(String value);

	/**
	 * Returns the value of the '<em><b>Semantic Markup</b></em>' containment reference list.
	 * The list contents are of type {@link iso20022.SemanticMarkup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Enables modelers to markup elements of the Repository with semantic metadata.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Semantic Markup</em>' containment reference list.
	 * @see iso20022.Iso20022Package#getRepositoryConcept_SemanticMarkup()
	 * @model containment="true" ordered="false"
	 *        annotation="urn:iso:std:iso:20022:2013:ecore:extension basis='IMPLEMENTATION_ENHANCEMENT' description='SemanticMarkup is structured with a MetaClass instead of a Tuple text.This provides more control, structure and validation to the feature and avoids the need for reparsing each time the value of a textual feature.'"
	 * @generated
	 */
	EList<SemanticMarkup> getSemanticMarkup();

	/**
	 * Returns the value of the '<em><b>Doclet</b></em>' containment reference list.
	 * The list contents are of type {@link iso20022.Doclet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Doclets of the entity, used for documentation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Doclet</em>' containment reference list.
	 * @see iso20022.Iso20022Package#getRepositoryConcept_Doclet()
	 * @model containment="true" ordered="false"
	 *        annotation="urn:iso:std:iso:20022:2013:ecore:extension basis='RepositoryManagement' description='to store documentation information : scope, usage, ...'"
	 * @generated
	 */
	EList<Doclet> getDoclet();

	/**
	 * Returns the value of the '<em><b>Example</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * provides a representative instance of a RepositoryConcept
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Example</em>' attribute list.
	 * @see iso20022.Iso20022Package#getRepositoryConcept_Example()
	 * @model
	 * @generated
	 */
	EList<String> getExample();

	/**
	 * Returns the value of the '<em><b>Constraint</b></em>' containment reference list.
	 * The list contents are of type {@link iso20022.Constraint}.
	 * It is bidirectional and its opposite is '{@link iso20022.Constraint#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * a property of a RepositoryConcept specifying a semantic condition or restriction expressed in natural language text and potentially in a formal notation
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Constraint</em>' containment reference list.
	 * @see iso20022.Iso20022Package#getRepositoryConcept_Constraint()
	 * @see iso20022.Constraint#getOwner
	 * @model opposite="owner" containment="true"
	 * @generated
	 */
	EList<Constraint> getConstraint();

	/**
	 * Returns the value of the '<em><b>Registration Status</b></em>' attribute.
	 * The default value is <code>"Provisionally Registered"</code>.
	 * The literals are from the enumeration {@link iso20022.RegistrationStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * specifies in which stage of the registration lifecycle a RepositoryConcept is in
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Registration Status</em>' attribute.
	 * @see iso20022.RegistrationStatus
	 * @see #setRegistrationStatus(RegistrationStatus)
	 * @see iso20022.Iso20022Package#getRepositoryConcept_RegistrationStatus()
	 * @model default="Provisionally Registered" required="true" ordered="false"
	 * @generated
	 */
	RegistrationStatus getRegistrationStatus();

	/**
	 * Sets the value of the '{@link iso20022.RepositoryConcept#getRegistrationStatus <em>Registration Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registration Status</em>' attribute.
	 * @see iso20022.RegistrationStatus
	 * @see #getRegistrationStatus()
	 * @generated
	 */
	void setRegistrationStatus(RegistrationStatus value);

	/**
	 * Returns the value of the '<em><b>Removal Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * specifies the date at which a RepositoryConcept will cease or has ceased to be part of the Repository
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Removal Date</em>' attribute.
	 * @see #setRemovalDate(Date)
	 * @see iso20022.Iso20022Package#getRepositoryConcept_RemovalDate()
	 * @model ordered="false"
	 * @generated
	 */
	Date getRemovalDate();

	/**
	 * Sets the value of the '{@link iso20022.RepositoryConcept#getRemovalDate <em>Removal Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Removal Date</em>' attribute.
	 * @see #getRemovalDate()
	 * @generated
	 */
	void setRemovalDate(Date value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If a removalDate is specified then the registrationStatus must be OBSOLETE
	 * removalDate->notEmpty( ) implies registrationStatus = RegistrationStatus::OBSOLETE
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" contextRequired="true" contextOrdered="false" diagnosticsRequired="true" diagnosticsOrdered="false"
	 * @generated
	 */
	boolean RemovalDateRegistrationStatus(Map context, DiagnosticChain diagnostics);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * First letter of name shall be upper case. [A-Z]
	 * Set {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'}->exists(x|x=name.substring(1,1))
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" contextRequired="true" contextOrdered="false" diagnosticsRequired="true" diagnosticsOrdered="false"
	 * @generated
	 */
	boolean NameFirstLetterUppercase(Map context, DiagnosticChain diagnostics);

} // RepositoryConcept
