/**
 */
package iso20022;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Business Process Catalogue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Part of the ISO 20022 Repository that contains all Business Process and BusinessTransaction related items.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso20022.BusinessProcessCatalogue#getRepository <em>Repository</em>}</li>
 *   <li>{@link iso20022.BusinessProcessCatalogue#getTopLevelCatalogueEntry <em>Top Level Catalogue Entry</em>}</li>
 * </ul>
 *
 * @see iso20022.Iso20022Package#getBusinessProcessCatalogue()
 * @model
 * @generated
 */
public interface BusinessProcessCatalogue extends ModelEntity {
	/**
	 * Returns the value of the '<em><b>Repository</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link iso20022.Repository#getBusinessProcessCatalogue <em>Business Process Catalogue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Repository that owns the BusinessProcessCatalogue.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Repository</em>' container reference.
	 * @see #setRepository(Repository)
	 * @see iso20022.Iso20022Package#getBusinessProcessCatalogue_Repository()
	 * @see iso20022.Repository#getBusinessProcessCatalogue
	 * @model opposite="businessProcessCatalogue" required="true" transient="false" ordered="false"
	 * @generated
	 */
	Repository getRepository();

	/**
	 * Sets the value of the '{@link iso20022.BusinessProcessCatalogue#getRepository <em>Repository</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repository</em>' container reference.
	 * @see #getRepository()
	 * @generated
	 */
	void setRepository(Repository value);

	/**
	 * Returns the value of the '<em><b>Top Level Catalogue Entry</b></em>' containment reference list.
	 * The list contents are of type {@link iso20022.TopLevelCatalogueEntry}.
	 * It is bidirectional and its opposite is '{@link iso20022.TopLevelCatalogueEntry#getBusinessProcessCatalogue <em>Business Process Catalogue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * a TopLevelCatalogueEntry in the BusinessProcessCatalague
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Top Level Catalogue Entry</em>' containment reference list.
	 * @see iso20022.Iso20022Package#getBusinessProcessCatalogue_TopLevelCatalogueEntry()
	 * @see iso20022.TopLevelCatalogueEntry#getBusinessProcessCatalogue
	 * @model opposite="businessProcessCatalogue" containment="true" ordered="false"
	 * @generated
	 */
	EList<TopLevelCatalogueEntry> getTopLevelCatalogueEntry();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All TopLevelCatalogueEntries of a BusinessProcessCatalogue must have different names
	 * topLevelCatalogueEntry->forAll(entry1,entry2 | entry1 <> entry2 implies entry1.name <> entry2.name)
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" contextRequired="true" contextOrdered="false" diagnosticsRequired="true" diagnosticsOrdered="false"
	 * @generated
	 */
	boolean EntriesHaveUniqueName(Map context, DiagnosticChain diagnostics);

} // BusinessProcessCatalogue
