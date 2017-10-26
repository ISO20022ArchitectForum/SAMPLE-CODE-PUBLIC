/**
 */
package iso20022;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * place where all RepositoryConcepts are stored
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso20022.Repository#getDataDictionary <em>Data Dictionary</em>}</li>
 *   <li>{@link iso20022.Repository#getBusinessProcessCatalogue <em>Business Process Catalogue</em>}</li>
 * </ul>
 *
 * @see iso20022.Iso20022Package#getRepository()
 * @model
 * @generated
 */
public interface Repository extends ModelEntity {
	/**
	 * Returns the value of the '<em><b>Data Dictionary</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link iso20022.DataDictionary#getRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the DataDictionary owned by the ISO 20022 Repository
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Dictionary</em>' containment reference.
	 * @see #setDataDictionary(DataDictionary)
	 * @see iso20022.Iso20022Package#getRepository_DataDictionary()
	 * @see iso20022.DataDictionary#getRepository
	 * @model opposite="repository" containment="true" required="true" ordered="false"
	 * @generated
	 */
	DataDictionary getDataDictionary();

	/**
	 * Sets the value of the '{@link iso20022.Repository#getDataDictionary <em>Data Dictionary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Dictionary</em>' containment reference.
	 * @see #getDataDictionary()
	 * @generated
	 */
	void setDataDictionary(DataDictionary value);

	/**
	 * Returns the value of the '<em><b>Business Process Catalogue</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link iso20022.BusinessProcessCatalogue#getRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the BusinessProcessCatalogue owned by the ISO 20022 Repository
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Business Process Catalogue</em>' containment reference.
	 * @see #setBusinessProcessCatalogue(BusinessProcessCatalogue)
	 * @see iso20022.Iso20022Package#getRepository_BusinessProcessCatalogue()
	 * @see iso20022.BusinessProcessCatalogue#getRepository
	 * @model opposite="repository" containment="true" required="true" ordered="false"
	 * @generated
	 */
	BusinessProcessCatalogue getBusinessProcessCatalogue();

	/**
	 * Sets the value of the '{@link iso20022.Repository#getBusinessProcessCatalogue <em>Business Process Catalogue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Business Process Catalogue</em>' containment reference.
	 * @see #getBusinessProcessCatalogue()
	 * @generated
	 */
	void setBusinessProcessCatalogue(BusinessProcessCatalogue value);

} // Repository
