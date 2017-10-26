/**
 */
package iso20022.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import iso20022.EndPointCategory;
import iso20022.Iso20022Package;
import iso20022.MessageElementContainer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>End Point Category</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso20022.impl.EndPointCategoryImpl#getEndPoints <em>End Points</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EndPointCategoryImpl extends TopLevelDictionaryEntryImpl implements EndPointCategory {
	/**
	 * The cached value of the '{@link #getEndPoints() <em>End Points</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndPoints()
	 * @generated
	 * @ordered
	 */
	protected EList<MessageElementContainer> endPoints;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EndPointCategoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Iso20022Package.eINSTANCE.getEndPointCategory();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MessageElementContainer> getEndPoints() {
		if (endPoints == null) {
			endPoints = new EObjectResolvingEList<MessageElementContainer>(MessageElementContainer.class, this, Iso20022Package.END_POINT_CATEGORY__END_POINTS);
		}
		return endPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Iso20022Package.END_POINT_CATEGORY__END_POINTS:
				return getEndPoints();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Iso20022Package.END_POINT_CATEGORY__END_POINTS:
				getEndPoints().clear();
				getEndPoints().addAll((Collection<? extends MessageElementContainer>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Iso20022Package.END_POINT_CATEGORY__END_POINTS:
				getEndPoints().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Iso20022Package.END_POINT_CATEGORY__END_POINTS:
				return endPoints != null && !endPoints.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EndPointCategoryImpl
