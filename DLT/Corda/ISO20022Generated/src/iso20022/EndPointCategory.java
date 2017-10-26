/**
 */
package iso20022;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>End Point Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Collection of MessageComponents that define the endpoints for a given category.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso20022.EndPointCategory#getEndPoints <em>End Points</em>}</li>
 * </ul>
 *
 * @see iso20022.Iso20022Package#getEndPointCategory()
 * @model annotation="urn:iso:std:iso:20022:2013:ecore:extension basis='RepositoryManagement' description='Identifies highly reusable structures and allows reducing the size of the documentation.'"
 * @generated
 */
public interface EndPointCategory extends TopLevelDictionaryEntry {
	/**
	 * Returns the value of the '<em><b>End Points</b></em>' reference list.
	 * The list contents are of type {@link iso20022.MessageElementContainer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MessageComponents that are considered to be end points.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>End Points</em>' reference list.
	 * @see iso20022.Iso20022Package#getEndPointCategory_EndPoints()
	 * @model ordered="false"
	 *        annotation="urn:iso:std:iso:20022:2013:ecore:extension basis='RepositoryManagement' description='Identifies highly reusable structures and allows reducing the size of the documentation.'"
	 * @generated
	 */
	EList<MessageElementContainer> getEndPoints();

} // EndPointCategory
