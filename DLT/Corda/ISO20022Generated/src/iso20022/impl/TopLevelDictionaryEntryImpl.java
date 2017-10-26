/**
 */
package iso20022.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import iso20022.DataDictionary;
import iso20022.Iso20022Package;
import iso20022.TopLevelDictionaryEntry;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Top Level Dictionary Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso20022.impl.TopLevelDictionaryEntryImpl#getDataDictionary <em>Data Dictionary</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TopLevelDictionaryEntryImpl extends RepositoryConceptImpl implements TopLevelDictionaryEntry {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TopLevelDictionaryEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Iso20022Package.eINSTANCE.getTopLevelDictionaryEntry();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataDictionary getDataDictionary() {
		if (eContainerFeatureID() != Iso20022Package.TOP_LEVEL_DICTIONARY_ENTRY__DATA_DICTIONARY) return null;
		return (DataDictionary)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataDictionary(DataDictionary newDataDictionary, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDataDictionary, Iso20022Package.TOP_LEVEL_DICTIONARY_ENTRY__DATA_DICTIONARY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataDictionary(DataDictionary newDataDictionary) {
		if (newDataDictionary != eInternalContainer() || (eContainerFeatureID() != Iso20022Package.TOP_LEVEL_DICTIONARY_ENTRY__DATA_DICTIONARY && newDataDictionary != null)) {
			if (EcoreUtil.isAncestor(this, newDataDictionary))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDataDictionary != null)
				msgs = ((InternalEObject)newDataDictionary).eInverseAdd(this, Iso20022Package.DATA_DICTIONARY__TOP_LEVEL_DICTIONARY_ENTRY, DataDictionary.class, msgs);
			msgs = basicSetDataDictionary(newDataDictionary, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Iso20022Package.TOP_LEVEL_DICTIONARY_ENTRY__DATA_DICTIONARY, newDataDictionary, newDataDictionary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Iso20022Package.TOP_LEVEL_DICTIONARY_ENTRY__DATA_DICTIONARY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDataDictionary((DataDictionary)otherEnd, msgs);
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
			case Iso20022Package.TOP_LEVEL_DICTIONARY_ENTRY__DATA_DICTIONARY:
				return basicSetDataDictionary(null, msgs);
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
			case Iso20022Package.TOP_LEVEL_DICTIONARY_ENTRY__DATA_DICTIONARY:
				return eInternalContainer().eInverseRemove(this, Iso20022Package.DATA_DICTIONARY__TOP_LEVEL_DICTIONARY_ENTRY, DataDictionary.class, msgs);
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
			case Iso20022Package.TOP_LEVEL_DICTIONARY_ENTRY__DATA_DICTIONARY:
				return getDataDictionary();
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
			case Iso20022Package.TOP_LEVEL_DICTIONARY_ENTRY__DATA_DICTIONARY:
				setDataDictionary((DataDictionary)newValue);
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
			case Iso20022Package.TOP_LEVEL_DICTIONARY_ENTRY__DATA_DICTIONARY:
				setDataDictionary((DataDictionary)null);
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
			case Iso20022Package.TOP_LEVEL_DICTIONARY_ENTRY__DATA_DICTIONARY:
				return getDataDictionary() != null;
		}
		return super.eIsSet(featureID);
	}

} //TopLevelDictionaryEntryImpl
