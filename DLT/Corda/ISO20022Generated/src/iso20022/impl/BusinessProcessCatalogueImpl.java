/**
 */
package iso20022.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import iso20022.BusinessProcessCatalogue;
import iso20022.Iso20022Package;
import iso20022.Repository;
import iso20022.TopLevelCatalogueEntry;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Business Process Catalogue</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso20022.impl.BusinessProcessCatalogueImpl#getRepository <em>Repository</em>}</li>
 *   <li>{@link iso20022.impl.BusinessProcessCatalogueImpl#getTopLevelCatalogueEntry <em>Top Level Catalogue Entry</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BusinessProcessCatalogueImpl extends ModelEntityImpl implements BusinessProcessCatalogue {
	/**
	 * The cached value of the '{@link #getTopLevelCatalogueEntry() <em>Top Level Catalogue Entry</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopLevelCatalogueEntry()
	 * @generated
	 * @ordered
	 */
	protected EList<TopLevelCatalogueEntry> topLevelCatalogueEntry;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusinessProcessCatalogueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Iso20022Package.eINSTANCE.getBusinessProcessCatalogue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Repository getRepository() {
		if (eContainerFeatureID() != Iso20022Package.BUSINESS_PROCESS_CATALOGUE__REPOSITORY) return null;
		return (Repository)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRepository(Repository newRepository, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRepository, Iso20022Package.BUSINESS_PROCESS_CATALOGUE__REPOSITORY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepository(Repository newRepository) {
		if (newRepository != eInternalContainer() || (eContainerFeatureID() != Iso20022Package.BUSINESS_PROCESS_CATALOGUE__REPOSITORY && newRepository != null)) {
			if (EcoreUtil.isAncestor(this, newRepository))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRepository != null)
				msgs = ((InternalEObject)newRepository).eInverseAdd(this, Iso20022Package.REPOSITORY__BUSINESS_PROCESS_CATALOGUE, Repository.class, msgs);
			msgs = basicSetRepository(newRepository, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Iso20022Package.BUSINESS_PROCESS_CATALOGUE__REPOSITORY, newRepository, newRepository));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TopLevelCatalogueEntry> getTopLevelCatalogueEntry() {
		if (topLevelCatalogueEntry == null) {
			topLevelCatalogueEntry = new EObjectContainmentWithInverseEList<TopLevelCatalogueEntry>(TopLevelCatalogueEntry.class, this, Iso20022Package.BUSINESS_PROCESS_CATALOGUE__TOP_LEVEL_CATALOGUE_ENTRY, Iso20022Package.TOP_LEVEL_CATALOGUE_ENTRY__BUSINESS_PROCESS_CATALOGUE);
		}
		return topLevelCatalogueEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean EntriesHaveUniqueName(Map context, DiagnosticChain diagnostics) {
		// TODO: implement this method >>> DONE
		// Ensure that you remove @generated or mark it @generated NOT
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Iso20022Package.BUSINESS_PROCESS_CATALOGUE__REPOSITORY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRepository((Repository)otherEnd, msgs);
			case Iso20022Package.BUSINESS_PROCESS_CATALOGUE__TOP_LEVEL_CATALOGUE_ENTRY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTopLevelCatalogueEntry()).basicAdd(otherEnd, msgs);
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
			case Iso20022Package.BUSINESS_PROCESS_CATALOGUE__REPOSITORY:
				return basicSetRepository(null, msgs);
			case Iso20022Package.BUSINESS_PROCESS_CATALOGUE__TOP_LEVEL_CATALOGUE_ENTRY:
				return ((InternalEList<?>)getTopLevelCatalogueEntry()).basicRemove(otherEnd, msgs);
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
			case Iso20022Package.BUSINESS_PROCESS_CATALOGUE__REPOSITORY:
				return eInternalContainer().eInverseRemove(this, Iso20022Package.REPOSITORY__BUSINESS_PROCESS_CATALOGUE, Repository.class, msgs);
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
			case Iso20022Package.BUSINESS_PROCESS_CATALOGUE__REPOSITORY:
				return getRepository();
			case Iso20022Package.BUSINESS_PROCESS_CATALOGUE__TOP_LEVEL_CATALOGUE_ENTRY:
				return getTopLevelCatalogueEntry();
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
			case Iso20022Package.BUSINESS_PROCESS_CATALOGUE__REPOSITORY:
				setRepository((Repository)newValue);
				return;
			case Iso20022Package.BUSINESS_PROCESS_CATALOGUE__TOP_LEVEL_CATALOGUE_ENTRY:
				getTopLevelCatalogueEntry().clear();
				getTopLevelCatalogueEntry().addAll((Collection<? extends TopLevelCatalogueEntry>)newValue);
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
			case Iso20022Package.BUSINESS_PROCESS_CATALOGUE__REPOSITORY:
				setRepository((Repository)null);
				return;
			case Iso20022Package.BUSINESS_PROCESS_CATALOGUE__TOP_LEVEL_CATALOGUE_ENTRY:
				getTopLevelCatalogueEntry().clear();
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
			case Iso20022Package.BUSINESS_PROCESS_CATALOGUE__REPOSITORY:
				return getRepository() != null;
			case Iso20022Package.BUSINESS_PROCESS_CATALOGUE__TOP_LEVEL_CATALOGUE_ENTRY:
				return topLevelCatalogueEntry != null && !topLevelCatalogueEntry.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case Iso20022Package.BUSINESS_PROCESS_CATALOGUE___ENTRIES_HAVE_UNIQUE_NAME__MAP_DIAGNOSTICCHAIN:
				return EntriesHaveUniqueName((Map)arguments.get(0), (DiagnosticChain)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //BusinessProcessCatalogueImpl
