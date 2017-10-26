/**
 */
package iso20022;

import java.lang.String;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Abstract definition of a model entity.
 * The common meta class which is the generalisation of all Meta Classes.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso20022.ModelEntity#getNextVersions <em>Next Versions</em>}</li>
 *   <li>{@link iso20022.ModelEntity#getPreviousVersion <em>Previous Version</em>}</li>
 *   <li>{@link iso20022.ModelEntity#getObjectIdentifier <em>Object Identifier</em>}</li>
 * </ul>
 *
 * @see iso20022.Iso20022Package#getModelEntity()
 * @model abstract="true"
 *        annotation="urn:iso:std:iso:20022:2013:ecore:extension basis='IMPLEMENTATION_ENHANCEMENT' description='Abstract meta class which is the common ancestor of all ISO20022 meta classes.'"
 * @generated
 */
public interface ModelEntity extends EObject {
	/**
	 * Returns the value of the '<em><b>Next Versions</b></em>' reference list.
	 * The list contents are of type {@link iso20022.ModelEntity}.
	 * It is bidirectional and its opposite is '{@link iso20022.ModelEntity#getPreviousVersion <em>Previous Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * List of next versions of a ModelEntity that stem from this ModelEntity.
	 * Allows version control management.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Next Versions</em>' reference list.
	 * @see iso20022.Iso20022Package#getModelEntity_NextVersions()
	 * @see iso20022.ModelEntity#getPreviousVersion
	 * @model opposite="previousVersion" ordered="false"
	 *        annotation="urn:iso:std:iso:20022:2013:ecore:extension basis='RepositoryManagement' description='Versioning of Repository Objects'"
	 * @generated
	 */
	EList<ModelEntity> getNextVersions();

	/**
	 * Returns the value of the '<em><b>Previous Version</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link iso20022.ModelEntity#getNextVersions <em>Next Versions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Previous version of a ModelEntity that this ModelEntity stems from.
	 * Allows version control management.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Previous Version</em>' reference.
	 * @see #setPreviousVersion(ModelEntity)
	 * @see iso20022.Iso20022Package#getModelEntity_PreviousVersion()
	 * @see iso20022.ModelEntity#getNextVersions
	 * @model opposite="nextVersions" ordered="false"
	 *        annotation="urn:iso:std:iso:20022:2013:ecore:extension basis='RepositoryManagement' description='Versioning of Repository Concepts'"
	 * @generated
	 */
	ModelEntity getPreviousVersion();

	/**
	 * Sets the value of the '{@link iso20022.ModelEntity#getPreviousVersion <em>Previous Version</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Previous Version</em>' reference.
	 * @see #getPreviousVersion()
	 * @generated
	 */
	void setPreviousVersion(ModelEntity value);

	/**
	 * Returns the value of the '<em><b>Object Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Uniquely identifies the RepositoryConcept
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Object Identifier</em>' attribute.
	 * @see #setObjectIdentifier(String)
	 * @see iso20022.Iso20022Package#getModelEntity_ObjectIdentifier()
	 * @model ordered="false"
	 *        annotation="urn:iso:std:iso:20022:2013:ecore:extension basis='IMPLEMENTATION_ENHANCEMENT' description='ObjectIdentifier moved up to the meta class ModelEntity, that is the common ancestor to all ISO20022 meta classes'"
	 * @generated
	 */
	String getObjectIdentifier();

	/**
	 * Sets the value of the '{@link iso20022.ModelEntity#getObjectIdentifier <em>Object Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Identifier</em>' attribute.
	 * @see #getObjectIdentifier()
	 * @generated
	 */
	void setObjectIdentifier(String value);

} // ModelEntity
