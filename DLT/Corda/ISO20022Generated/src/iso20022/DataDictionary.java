/**
 */
package iso20022;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Dictionary</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Part of the ISO 20022 Repository that contains all items that can be re-used during business process modelling and message definition activities.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso20022.DataDictionary#getTopLevelDictionaryEntry <em>Top Level Dictionary Entry</em>}</li>
 *   <li>{@link iso20022.DataDictionary#getRepository <em>Repository</em>}</li>
 * </ul>
 *
 * @see iso20022.Iso20022Package#getDataDictionary()
 * @model
 * @generated
 */
public interface DataDictionary extends ModelEntity {
	/**
	 * Returns the value of the '<em><b>Top Level Dictionary Entry</b></em>' containment reference list.
	 * The list contents are of type {@link iso20022.TopLevelDictionaryEntry}.
	 * It is bidirectional and its opposite is '{@link iso20022.TopLevelDictionaryEntry#getDataDictionary <em>Data Dictionary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * a TopLevelDictionaryEntry in the DataDictionary
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Top Level Dictionary Entry</em>' containment reference list.
	 * @see iso20022.Iso20022Package#getDataDictionary_TopLevelDictionaryEntry()
	 * @see iso20022.TopLevelDictionaryEntry#getDataDictionary
	 * @model opposite="dataDictionary" containment="true" ordered="false"
	 * @generated
	 */
	EList<TopLevelDictionaryEntry> getTopLevelDictionaryEntry();

	/**
	 * Returns the value of the '<em><b>Repository</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link iso20022.Repository#getDataDictionary <em>Data Dictionary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Repository that owns the DataDictionary.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Repository</em>' container reference.
	 * @see #setRepository(Repository)
	 * @see iso20022.Iso20022Package#getDataDictionary_Repository()
	 * @see iso20022.Repository#getDataDictionary
	 * @model opposite="dataDictionary" required="true" transient="false" ordered="false"
	 * @generated
	 */
	Repository getRepository();

	/**
	 * Sets the value of the '{@link iso20022.DataDictionary#getRepository <em>Repository</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repository</em>' container reference.
	 * @see #getRepository()
	 * @generated
	 */
	void setRepository(Repository value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All TopLevelDictionaryEntries of a DataDictionary must have different names
	 * topLevelDictionaryEntry->forAll(entry1,entry2 | entry1 <> entry2 implies entry1.name <> entry2.name)
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" contextRequired="true" contextOrdered="false" diagnosticsRequired="true" diagnosticsOrdered="false"
	 * @generated
	 */
	boolean EntriesHaveUniqueName(Map context, DiagnosticChain diagnostics);

} // DataDictionary
