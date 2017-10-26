/**
 */
package iso20022.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import iso20022.BusinessProcessCatalogue;
import iso20022.Iso20022Package;
import iso20022.TopLevelCatalogueEntry;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Top Level Catalogue Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso20022.impl.TopLevelCatalogueEntryImpl#getBusinessProcessCatalogue <em>Business Process Catalogue</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TopLevelCatalogueEntryImpl extends RepositoryConceptImpl implements TopLevelCatalogueEntry {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TopLevelCatalogueEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Iso20022Package.eINSTANCE.getTopLevelCatalogueEntry();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessProcessCatalogue getBusinessProcessCatalogue() {
		if (eContainerFeatureID() != Iso20022Package.TOP_LEVEL_CATALOGUE_ENTRY__BUSINESS_PROCESS_CATALOGUE) return null;
		return (BusinessProcessCatalogue)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBusinessProcessCatalogue(BusinessProcessCatalogue newBusinessProcessCatalogue, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newBusinessProcessCatalogue, Iso20022Package.TOP_LEVEL_CATALOGUE_ENTRY__BUSINESS_PROCESS_CATALOGUE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBusinessProcessCatalogue(BusinessProcessCatalogue newBusinessProcessCatalogue) {
		if (newBusinessProcessCatalogue != eInternalContainer() || (eContainerFeatureID() != Iso20022Package.TOP_LEVEL_CATALOGUE_ENTRY__BUSINESS_PROCESS_CATALOGUE && newBusinessProcessCatalogue != null)) {
			if (EcoreUtil.isAncestor(this, newBusinessProcessCatalogue))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newBusinessProcessCatalogue != null)
				msgs = ((InternalEObject)newBusinessProcessCatalogue).eInverseAdd(this, Iso20022Package.BUSINESS_PROCESS_CATALOGUE__TOP_LEVEL_CATALOGUE_ENTRY, BusinessProcessCatalogue.class, msgs);
			msgs = basicSetBusinessProcessCatalogue(newBusinessProcessCatalogue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Iso20022Package.TOP_LEVEL_CATALOGUE_ENTRY__BUSINESS_PROCESS_CATALOGUE, newBusinessProcessCatalogue, newBusinessProcessCatalogue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Iso20022Package.TOP_LEVEL_CATALOGUE_ENTRY__BUSINESS_PROCESS_CATALOGUE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetBusinessProcessCatalogue((BusinessProcessCatalogue)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Iso20022Package.TOP_LEVEL_CATALOGUE_ENTRY__BUSINESS_PROCESS_CATALOGUE:
				return basicSetBusinessProcessCatalogue(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case Iso20022Package.TOP_LEVEL_CATALOGUE_ENTRY__BUSINESS_PROCESS_CATALOGUE:
				return eInternalContainer().eInverseRemove(this, Iso20022Package.BUSINESS_PROCESS_CATALOGUE__TOP_LEVEL_CATALOGUE_ENTRY, BusinessProcessCatalogue.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Iso20022Package.TOP_LEVEL_CATALOGUE_ENTRY__BUSINESS_PROCESS_CATALOGUE:
				return getBusinessProcessCatalogue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Iso20022Package.TOP_LEVEL_CATALOGUE_ENTRY__BUSINESS_PROCESS_CATALOGUE:
				setBusinessProcessCatalogue((BusinessProcessCatalogue)newValue);
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
			case Iso20022Package.TOP_LEVEL_CATALOGUE_ENTRY__BUSINESS_PROCESS_CATALOGUE:
				setBusinessProcessCatalogue((BusinessProcessCatalogue)null);
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
			case Iso20022Package.TOP_LEVEL_CATALOGUE_ENTRY__BUSINESS_PROCESS_CATALOGUE:
				return getBusinessProcessCatalogue() != null;
		}
		return super.eIsSet(featureID);
	}

} //TopLevelCatalogueEntryImpl
