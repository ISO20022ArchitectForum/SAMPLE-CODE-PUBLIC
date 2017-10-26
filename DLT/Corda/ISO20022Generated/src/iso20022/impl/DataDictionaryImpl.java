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

import iso20022.DataDictionary;
import iso20022.Iso20022Package;
import iso20022.Repository;
import iso20022.TopLevelDictionaryEntry;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Dictionary</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso20022.impl.DataDictionaryImpl#getTopLevelDictionaryEntry <em>Top Level Dictionary Entry</em>}</li>
 *   <li>{@link iso20022.impl.DataDictionaryImpl#getRepository <em>Repository</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataDictionaryImpl extends ModelEntityImpl implements DataDictionary {
	/**
	 * The cached value of the '{@link #getTopLevelDictionaryEntry() <em>Top Level Dictionary Entry</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopLevelDictionaryEntry()
	 * @generated
	 * @ordered
	 */
	protected EList<TopLevelDictionaryEntry> topLevelDictionaryEntry;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataDictionaryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Iso20022Package.eINSTANCE.getDataDictionary();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TopLevelDictionaryEntry> getTopLevelDictionaryEntry() {
		if (topLevelDictionaryEntry == null) {
			topLevelDictionaryEntry = new EObjectContainmentWithInverseEList<TopLevelDictionaryEntry>(TopLevelDictionaryEntry.class, this, Iso20022Package.DATA_DICTIONARY__TOP_LEVEL_DICTIONARY_ENTRY, Iso20022Package.TOP_LEVEL_DICTIONARY_ENTRY__DATA_DICTIONARY);
		}
		return topLevelDictionaryEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Repository getRepository() {
		if (eContainerFeatureID() != Iso20022Package.DATA_DICTIONARY__REPOSITORY) return null;
		return (Repository)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRepository(Repository newRepository, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRepository, Iso20022Package.DATA_DICTIONARY__REPOSITORY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepository(Repository newRepository) {
		if (newRepository != eInternalContainer() || (eContainerFeatureID() != Iso20022Package.DATA_DICTIONARY__REPOSITORY && newRepository != null)) {
			if (EcoreUtil.isAncestor(this, newRepository))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRepository != null)
				msgs = ((InternalEObject)newRepository).eInverseAdd(this, Iso20022Package.REPOSITORY__DATA_DICTIONARY, Repository.class, msgs);
			msgs = basicSetRepository(newRepository, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Iso20022Package.DATA_DICTIONARY__REPOSITORY, newRepository, newRepository));
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
			case Iso20022Package.DATA_DICTIONARY__TOP_LEVEL_DICTIONARY_ENTRY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTopLevelDictionaryEntry()).basicAdd(otherEnd, msgs);
			case Iso20022Package.DATA_DICTIONARY__REPOSITORY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRepository((Repository)otherEnd, msgs);
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
			case Iso20022Package.DATA_DICTIONARY__TOP_LEVEL_DICTIONARY_ENTRY:
				return ((InternalEList<?>)getTopLevelDictionaryEntry()).basicRemove(otherEnd, msgs);
			case Iso20022Package.DATA_DICTIONARY__REPOSITORY:
				return basicSetRepository(null, msgs);
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
			case Iso20022Package.DATA_DICTIONARY__REPOSITORY:
				return eInternalContainer().eInverseRemove(this, Iso20022Package.REPOSITORY__DATA_DICTIONARY, Repository.class, msgs);
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
			case Iso20022Package.DATA_DICTIONARY__TOP_LEVEL_DICTIONARY_ENTRY:
				return getTopLevelDictionaryEntry();
			case Iso20022Package.DATA_DICTIONARY__REPOSITORY:
				return getRepository();
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
			case Iso20022Package.DATA_DICTIONARY__TOP_LEVEL_DICTIONARY_ENTRY:
				getTopLevelDictionaryEntry().clear();
				getTopLevelDictionaryEntry().addAll((Collection<? extends TopLevelDictionaryEntry>)newValue);
				return;
			case Iso20022Package.DATA_DICTIONARY__REPOSITORY:
				setRepository((Repository)newValue);
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
			case Iso20022Package.DATA_DICTIONARY__TOP_LEVEL_DICTIONARY_ENTRY:
				getTopLevelDictionaryEntry().clear();
				return;
			case Iso20022Package.DATA_DICTIONARY__REPOSITORY:
				setRepository((Repository)null);
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
			case Iso20022Package.DATA_DICTIONARY__TOP_LEVEL_DICTIONARY_ENTRY:
				return topLevelDictionaryEntry != null && !topLevelDictionaryEntry.isEmpty();
			case Iso20022Package.DATA_DICTIONARY__REPOSITORY:
				return getRepository() != null;
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
			case Iso20022Package.DATA_DICTIONARY___ENTRIES_HAVE_UNIQUE_NAME__MAP_DIAGNOSTICCHAIN:
				return EntriesHaveUniqueName((Map)arguments.get(0), (DiagnosticChain)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //DataDictionaryImpl
