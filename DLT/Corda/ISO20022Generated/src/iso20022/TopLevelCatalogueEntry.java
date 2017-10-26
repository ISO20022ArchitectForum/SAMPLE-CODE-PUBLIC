/**
 */
package iso20022;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Top Level Catalogue Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * artefact in the BusinessProcessCatalogue that is not owned by another artefact in the Repository
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso20022.TopLevelCatalogueEntry#getBusinessProcessCatalogue <em>Business Process Catalogue</em>}</li>
 * </ul>
 *
 * @see iso20022.Iso20022Package#getTopLevelCatalogueEntry()
 * @model abstract="true"
 * @generated
 */
public interface TopLevelCatalogueEntry extends RepositoryConcept {
	/**
	 * Returns the value of the '<em><b>Business Process Catalogue</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link iso20022.BusinessProcessCatalogue#getTopLevelCatalogueEntry <em>Top Level Catalogue Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the BusinessProcessCatalogue that contains all ISO 20022 TopLevelCatalogueEntries
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Business Process Catalogue</em>' container reference.
	 * @see #setBusinessProcessCatalogue(BusinessProcessCatalogue)
	 * @see iso20022.Iso20022Package#getTopLevelCatalogueEntry_BusinessProcessCatalogue()
	 * @see iso20022.BusinessProcessCatalogue#getTopLevelCatalogueEntry
	 * @model opposite="topLevelCatalogueEntry" required="true" transient="false" ordered="false"
	 * @generated
	 */
	BusinessProcessCatalogue getBusinessProcessCatalogue();

	/**
	 * Sets the value of the '{@link iso20022.TopLevelCatalogueEntry#getBusinessProcessCatalogue <em>Business Process Catalogue</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Business Process Catalogue</em>' container reference.
	 * @see #getBusinessProcessCatalogue()
	 * @generated
	 */
	void setBusinessProcessCatalogue(BusinessProcessCatalogue value);

} // TopLevelCatalogueEntry
