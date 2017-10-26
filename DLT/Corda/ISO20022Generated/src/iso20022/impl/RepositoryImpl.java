/**
 */
package iso20022.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import iso20022.BusinessProcessCatalogue;
import iso20022.DataDictionary;
import iso20022.Iso20022Package;
import iso20022.Repository;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso20022.impl.RepositoryImpl#getDataDictionary <em>Data Dictionary</em>}</li>
 *   <li>{@link iso20022.impl.RepositoryImpl#getBusinessProcessCatalogue <em>Business Process Catalogue</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RepositoryImpl extends ModelEntityImpl implements Repository {
	/**
	 * The cached value of the '{@link #getDataDictionary() <em>Data Dictionary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataDictionary()
	 * @generated
	 * @ordered
	 */
	protected DataDictionary dataDictionary;

	/**
	 * The cached value of the '{@link #getBusinessProcessCatalogue() <em>Business Process Catalogue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessProcessCatalogue()
	 * @generated
	 * @ordered
	 */
	protected BusinessProcessCatalogue businessProcessCatalogue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Iso20022Package.eINSTANCE.getRepository();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataDictionary getDataDictionary() {
		return dataDictionary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataDictionary(DataDictionary newDataDictionary, NotificationChain msgs) {
		DataDictionary oldDataDictionary = dataDictionary;
		dataDictionary = newDataDictionary;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Iso20022Package.REPOSITORY__DATA_DICTIONARY, oldDataDictionary, newDataDictionary);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataDictionary(DataDictionary newDataDictionary) {
		if (newDataDictionary != dataDictionary) {
			NotificationChain msgs = null;
			if (dataDictionary != null)
				msgs = ((InternalEObject)dataDictionary).eInverseRemove(this, Iso20022Package.DATA_DICTIONARY__REPOSITORY, DataDictionary.class, msgs);
			if (newDataDictionary != null)
				msgs = ((InternalEObject)newDataDictionary).eInverseAdd(this, Iso20022Package.DATA_DICTIONARY__REPOSITORY, DataDictionary.class, msgs);
			msgs = basicSetDataDictionary(newDataDictionary, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Iso20022Package.REPOSITORY__DATA_DICTIONARY, newDataDictionary, newDataDictionary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessProcessCatalogue getBusinessProcessCatalogue() {
		return businessProcessCatalogue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBusinessProcessCatalogue(BusinessProcessCatalogue newBusinessProcessCatalogue, NotificationChain msgs) {
		BusinessProcessCatalogue oldBusinessProcessCatalogue = businessProcessCatalogue;
		businessProcessCatalogue = newBusinessProcessCatalogue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Iso20022Package.REPOSITORY__BUSINESS_PROCESS_CATALOGUE, oldBusinessProcessCatalogue, newBusinessProcessCatalogue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBusinessProcessCatalogue(BusinessProcessCatalogue newBusinessProcessCatalogue) {
		if (newBusinessProcessCatalogue != businessProcessCatalogue) {
			NotificationChain msgs = null;
			if (businessProcessCatalogue != null)
				msgs = ((InternalEObject)businessProcessCatalogue).eInverseRemove(this, Iso20022Package.BUSINESS_PROCESS_CATALOGUE__REPOSITORY, BusinessProcessCatalogue.class, msgs);
			if (newBusinessProcessCatalogue != null)
				msgs = ((InternalEObject)newBusinessProcessCatalogue).eInverseAdd(this, Iso20022Package.BUSINESS_PROCESS_CATALOGUE__REPOSITORY, BusinessProcessCatalogue.class, msgs);
			msgs = basicSetBusinessProcessCatalogue(newBusinessProcessCatalogue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Iso20022Package.REPOSITORY__BUSINESS_PROCESS_CATALOGUE, newBusinessProcessCatalogue, newBusinessProcessCatalogue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Iso20022Package.REPOSITORY__DATA_DICTIONARY:
				if (dataDictionary != null)
					msgs = ((InternalEObject)dataDictionary).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Iso20022Package.REPOSITORY__DATA_DICTIONARY, null, msgs);
				return basicSetDataDictionary((DataDictionary)otherEnd, msgs);
			case Iso20022Package.REPOSITORY__BUSINESS_PROCESS_CATALOGUE:
				if (businessProcessCatalogue != null)
					msgs = ((InternalEObject)businessProcessCatalogue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Iso20022Package.REPOSITORY__BUSINESS_PROCESS_CATALOGUE, null, msgs);
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
			case Iso20022Package.REPOSITORY__DATA_DICTIONARY:
				return basicSetDataDictionary(null, msgs);
			case Iso20022Package.REPOSITORY__BUSINESS_PROCESS_CATALOGUE:
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Iso20022Package.REPOSITORY__DATA_DICTIONARY:
				return getDataDictionary();
			case Iso20022Package.REPOSITORY__BUSINESS_PROCESS_CATALOGUE:
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
			case Iso20022Package.REPOSITORY__DATA_DICTIONARY:
				setDataDictionary((DataDictionary)newValue);
				return;
			case Iso20022Package.REPOSITORY__BUSINESS_PROCESS_CATALOGUE:
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
			case Iso20022Package.REPOSITORY__DATA_DICTIONARY:
				setDataDictionary((DataDictionary)null);
				return;
			case Iso20022Package.REPOSITORY__BUSINESS_PROCESS_CATALOGUE:
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
			case Iso20022Package.REPOSITORY__DATA_DICTIONARY:
				return dataDictionary != null;
			case Iso20022Package.REPOSITORY__BUSINESS_PROCESS_CATALOGUE:
				return businessProcessCatalogue != null;
		}
		return super.eIsSet(featureID);
	}

} //RepositoryImpl
