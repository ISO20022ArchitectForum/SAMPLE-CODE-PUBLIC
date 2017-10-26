/**
 */
package iso20022.impl;

import java.lang.String;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import iso20022.ExternalSchema;
import iso20022.Iso20022Package;
import iso20022.ProcessContent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>External Schema</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso20022.impl.ExternalSchemaImpl#getNamespaceList <em>Namespace List</em>}</li>
 *   <li>{@link iso20022.impl.ExternalSchemaImpl#getProcessContent <em>Process Content</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExternalSchemaImpl extends MessageComponentTypeImpl implements ExternalSchema {
	/**
	 * The cached value of the '{@link #getNamespaceList() <em>Namespace List</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespaceList()
	 * @generated
	 * @ordered
	 */
	protected EList<String> namespaceList;

	/**
	 * The default value of the '{@link #getProcessContent() <em>Process Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessContent()
	 * @generated
	 * @ordered
	 */
	protected static final ProcessContent PROCESS_CONTENT_EDEFAULT = ProcessContent.LAX;

	/**
	 * The cached value of the '{@link #getProcessContent() <em>Process Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessContent()
	 * @generated
	 * @ordered
	 */
	protected ProcessContent processContent = PROCESS_CONTENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalSchemaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Iso20022Package.eINSTANCE.getExternalSchema();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getNamespaceList() {
		if (namespaceList == null) {
			namespaceList = new EDataTypeUniqueEList<String>(String.class, this, Iso20022Package.EXTERNAL_SCHEMA__NAMESPACE_LIST);
		}
		return namespaceList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessContent getProcessContent() {
		return processContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessContent(ProcessContent newProcessContent) {
		ProcessContent oldProcessContent = processContent;
		processContent = newProcessContent == null ? PROCESS_CONTENT_EDEFAULT : newProcessContent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Iso20022Package.EXTERNAL_SCHEMA__PROCESS_CONTENT, oldProcessContent, processContent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Iso20022Package.EXTERNAL_SCHEMA__NAMESPACE_LIST:
				return getNamespaceList();
			case Iso20022Package.EXTERNAL_SCHEMA__PROCESS_CONTENT:
				return getProcessContent();
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
			case Iso20022Package.EXTERNAL_SCHEMA__NAMESPACE_LIST:
				getNamespaceList().clear();
				getNamespaceList().addAll((Collection<? extends String>)newValue);
				return;
			case Iso20022Package.EXTERNAL_SCHEMA__PROCESS_CONTENT:
				setProcessContent((ProcessContent)newValue);
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
			case Iso20022Package.EXTERNAL_SCHEMA__NAMESPACE_LIST:
				getNamespaceList().clear();
				return;
			case Iso20022Package.EXTERNAL_SCHEMA__PROCESS_CONTENT:
				setProcessContent(PROCESS_CONTENT_EDEFAULT);
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
			case Iso20022Package.EXTERNAL_SCHEMA__NAMESPACE_LIST:
				return namespaceList != null && !namespaceList.isEmpty();
			case Iso20022Package.EXTERNAL_SCHEMA__PROCESS_CONTENT:
				return processContent != PROCESS_CONTENT_EDEFAULT;
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
		result.append(" (namespaceList: ");
		result.append(namespaceList);
		result.append(", processContent: ");
		result.append(processContent);
		result.append(')');
		return result.toString();
	}

} //ExternalSchemaImpl
