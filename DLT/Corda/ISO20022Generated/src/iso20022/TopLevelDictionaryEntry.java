/**
 */
package iso20022;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Top Level Dictionary Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * artefact in the Dictionary that is not owned by another artefact in the Repository
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso20022.TopLevelDictionaryEntry#getDataDictionary <em>Data Dictionary</em>}</li>
 * </ul>
 *
 * @see iso20022.Iso20022Package#getTopLevelDictionaryEntry()
 * @model abstract="true"
 * @generated
 */
public interface TopLevelDictionaryEntry extends RepositoryConcept {
	/**
	 * Returns the value of the '<em><b>Data Dictionary</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link iso20022.DataDictionary#getTopLevelDictionaryEntry <em>Top Level Dictionary Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the DataDictionary that contains all ISO 20022 TopLevelDictionaryEntries
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Dictionary</em>' container reference.
	 * @see #setDataDictionary(DataDictionary)
	 * @see iso20022.Iso20022Package#getTopLevelDictionaryEntry_DataDictionary()
	 * @see iso20022.DataDictionary#getTopLevelDictionaryEntry
	 * @model opposite="topLevelDictionaryEntry" required="true" transient="false" ordered="false"
	 * @generated
	 */
	DataDictionary getDataDictionary();

	/**
	 * Sets the value of the '{@link iso20022.TopLevelDictionaryEntry#getDataDictionary <em>Data Dictionary</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Dictionary</em>' container reference.
	 * @see #getDataDictionary()
	 * @generated
	 */
	void setDataDictionary(DataDictionary value);

} // TopLevelDictionaryEntry
