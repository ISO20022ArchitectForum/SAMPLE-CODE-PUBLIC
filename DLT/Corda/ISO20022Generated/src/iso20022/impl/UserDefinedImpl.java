/**
 */
package iso20022.impl;

import java.lang.String;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import iso20022.Iso20022Package;
import iso20022.Namespace;
import iso20022.ProcessContent;
import iso20022.UserDefined;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User Defined</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso20022.impl.UserDefinedImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link iso20022.impl.UserDefinedImpl#getNamespaceList <em>Namespace List</em>}</li>
 *   <li>{@link iso20022.impl.UserDefinedImpl#getProcessContents <em>Process Contents</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UserDefinedImpl extends MessageComponentTypeImpl implements UserDefined {
	/**
	 * The default value of the '{@link #getNamespace() <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespace()
	 * @generated
	 * @ordered
	 */
	protected static final Namespace NAMESPACE_EDEFAULT = Namespace.ANY;

	/**
	 * The cached value of the '{@link #getNamespace() <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespace()
	 * @generated
	 * @ordered
	 */
	protected Namespace namespace = NAMESPACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNamespaceList() <em>Namespace List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespaceList()
	 * @generated
	 * @ordered
	 */
	protected static final String NAMESPACE_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNamespaceList() <em>Namespace List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespaceList()
	 * @generated
	 * @ordered
	 */
	protected String namespaceList = NAMESPACE_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getProcessContents() <em>Process Contents</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessContents()
	 * @generated
	 * @ordered
	 */
	protected static final ProcessContent PROCESS_CONTENTS_EDEFAULT = ProcessContent.LAX;

	/**
	 * The cached value of the '{@link #getProcessContents() <em>Process Contents</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessContents()
	 * @generated
	 * @ordered
	 */
	protected ProcessContent processContents = PROCESS_CONTENTS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserDefinedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Iso20022Package.eINSTANCE.getUserDefined();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace getNamespace() {
		return namespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNamespace(Namespace newNamespace) {
		Namespace oldNamespace = namespace;
		namespace = newNamespace == null ? NAMESPACE_EDEFAULT : newNamespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Iso20022Package.USER_DEFINED__NAMESPACE, oldNamespace, namespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNamespaceList() {
		return namespaceList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNamespaceList(String newNamespaceList) {
		String oldNamespaceList = namespaceList;
		namespaceList = newNamespaceList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Iso20022Package.USER_DEFINED__NAMESPACE_LIST, oldNamespaceList, namespaceList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessContent getProcessContents() {
		return processContents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessContents(ProcessContent newProcessContents) {
		ProcessContent oldProcessContents = processContents;
		processContents = newProcessContents == null ? PROCESS_CONTENTS_EDEFAULT : newProcessContents;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Iso20022Package.USER_DEFINED__PROCESS_CONTENTS, oldProcessContents, processContents));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Iso20022Package.USER_DEFINED__NAMESPACE:
				return getNamespace();
			case Iso20022Package.USER_DEFINED__NAMESPACE_LIST:
				return getNamespaceList();
			case Iso20022Package.USER_DEFINED__PROCESS_CONTENTS:
				return getProcessContents();
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
			case Iso20022Package.USER_DEFINED__NAMESPACE:
				setNamespace((Namespace)newValue);
				return;
			case Iso20022Package.USER_DEFINED__NAMESPACE_LIST:
				setNamespaceList((String)newValue);
				return;
			case Iso20022Package.USER_DEFINED__PROCESS_CONTENTS:
				setProcessContents((ProcessContent)newValue);
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
			case Iso20022Package.USER_DEFINED__NAMESPACE:
				setNamespace(NAMESPACE_EDEFAULT);
				return;
			case Iso20022Package.USER_DEFINED__NAMESPACE_LIST:
				setNamespaceList(NAMESPACE_LIST_EDEFAULT);
				return;
			case Iso20022Package.USER_DEFINED__PROCESS_CONTENTS:
				setProcessContents(PROCESS_CONTENTS_EDEFAULT);
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
			case Iso20022Package.USER_DEFINED__NAMESPACE:
				return namespace != NAMESPACE_EDEFAULT;
			case Iso20022Package.USER_DEFINED__NAMESPACE_LIST:
				return NAMESPACE_LIST_EDEFAULT == null ? namespaceList != null : !NAMESPACE_LIST_EDEFAULT.equals(namespaceList);
			case Iso20022Package.USER_DEFINED__PROCESS_CONTENTS:
				return processContents != PROCESS_CONTENTS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (namespace: ");
		result.append(namespace);
		result.append(", namespaceList: ");
		result.append(namespaceList);
		result.append(", processContents: ");
		result.append(processContents);
		result.append(')');
		return result.toString();
	}

} //UserDefinedImpl
