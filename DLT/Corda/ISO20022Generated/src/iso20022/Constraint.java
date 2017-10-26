/**
 */
package iso20022;

import java.lang.String;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A rule that must be universally satisfied i.e. all conditions required for the Constraint to be applicable, are known.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso20022.Constraint#getExpression <em>Expression</em>}</li>
 *   <li>{@link iso20022.Constraint#getExpressionLanguage <em>Expression Language</em>}</li>
 *   <li>{@link iso20022.Constraint#getOwner <em>Owner</em>}</li>
 * </ul>
 *
 * @see iso20022.Iso20022Package#getConstraint()
 * @model
 * @generated
 */
public interface Constraint extends RepositoryConcept {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The description of a Constraint in a specific language, defined in expressionLanguage
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expression</em>' attribute.
	 * @see #setExpression(String)
	 * @see iso20022.Iso20022Package#getConstraint_Expression()
	 * @model ordered="false"
	 * @generated
	 */
	String getExpression();

	/**
	 * Sets the value of the '{@link iso20022.Constraint#getExpression <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' attribute.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(String value);

	/**
	 * Returns the value of the '<em><b>Expression Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The language in which a Constraint in expressed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expression Language</em>' attribute.
	 * @see #setExpressionLanguage(String)
	 * @see iso20022.Iso20022Package#getConstraint_ExpressionLanguage()
	 * @model ordered="false"
	 * @generated
	 */
	String getExpressionLanguage();

	/**
	 * Sets the value of the '{@link iso20022.Constraint#getExpressionLanguage <em>Expression Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression Language</em>' attribute.
	 * @see #getExpressionLanguage()
	 * @generated
	 */
	void setExpressionLanguage(String value);

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link iso20022.RepositoryConcept#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The owner of the Rule.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owner</em>' container reference.
	 * @see #setOwner(RepositoryConcept)
	 * @see iso20022.Iso20022Package#getConstraint_Owner()
	 * @see iso20022.RepositoryConcept#getConstraint
	 * @model opposite="constraint" required="true" transient="false" ordered="false"
	 * @generated
	 */
	RepositoryConcept getOwner();

	/**
	 * Sets the value of the '{@link iso20022.Constraint#getOwner <em>Owner</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' container reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(RepositoryConcept value);

} // Constraint
