/**
 */
package iso20022.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import iso20022.Encoding;
import iso20022.Iso20022Package;
import iso20022.MessageDefinition;
import iso20022.MessageSet;
import iso20022.Syntax;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso20022.impl.MessageSetImpl#getGeneratedSyntax <em>Generated Syntax</em>}</li>
 *   <li>{@link iso20022.impl.MessageSetImpl#getValidEncoding <em>Valid Encoding</em>}</li>
 *   <li>{@link iso20022.impl.MessageSetImpl#getMessageDefinition <em>Message Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MessageSetImpl extends TopLevelCatalogueEntryImpl implements MessageSet {
	/**
	 * The cached value of the '{@link #getValidEncoding() <em>Valid Encoding</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidEncoding()
	 * @generated
	 * @ordered
	 */
	protected EList<Encoding> validEncoding;

	/**
	 * The cached value of the '{@link #getMessageDefinition() <em>Message Definition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageDefinition()
	 * @generated
	 * @ordered
	 */
	protected EList<MessageDefinition> messageDefinition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Iso20022Package.eINSTANCE.getMessageSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Syntax> getGeneratedSyntax() {
		// TODO: implement this method to return the 'Generated Syntax' reference list >>> DONE
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		EList<Syntax> result = new BasicEList<Syntax>();
		for (Encoding encoding : getValidEncoding()) {
			result.add(encoding.getSyntax());
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Encoding> getValidEncoding() {
		if (validEncoding == null) {
			validEncoding = new EObjectWithInverseResolvingEList.ManyInverse<Encoding>(Encoding.class, this, Iso20022Package.MESSAGE_SET__VALID_ENCODING, Iso20022Package.ENCODING__MESSAGE_SET);
		}
		return validEncoding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MessageDefinition> getMessageDefinition() {
		if (messageDefinition == null) {
			messageDefinition = new EObjectWithInverseResolvingEList.ManyInverse<MessageDefinition>(MessageDefinition.class, this, Iso20022Package.MESSAGE_SET__MESSAGE_DEFINITION, Iso20022Package.MESSAGE_DEFINITION__MESSAGE_SET);
		}
		return messageDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean GeneratedSyntaxDerivation(Map context, DiagnosticChain diagnostics) {
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
			case Iso20022Package.MESSAGE_SET__VALID_ENCODING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getValidEncoding()).basicAdd(otherEnd, msgs);
			case Iso20022Package.MESSAGE_SET__MESSAGE_DEFINITION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMessageDefinition()).basicAdd(otherEnd, msgs);
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
			case Iso20022Package.MESSAGE_SET__VALID_ENCODING:
				return ((InternalEList<?>)getValidEncoding()).basicRemove(otherEnd, msgs);
			case Iso20022Package.MESSAGE_SET__MESSAGE_DEFINITION:
				return ((InternalEList<?>)getMessageDefinition()).basicRemove(otherEnd, msgs);
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
			case Iso20022Package.MESSAGE_SET__GENERATED_SYNTAX:
				return getGeneratedSyntax();
			case Iso20022Package.MESSAGE_SET__VALID_ENCODING:
				return getValidEncoding();
			case Iso20022Package.MESSAGE_SET__MESSAGE_DEFINITION:
				return getMessageDefinition();
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
			case Iso20022Package.MESSAGE_SET__VALID_ENCODING:
				getValidEncoding().clear();
				getValidEncoding().addAll((Collection<? extends Encoding>)newValue);
				return;
			case Iso20022Package.MESSAGE_SET__MESSAGE_DEFINITION:
				getMessageDefinition().clear();
				getMessageDefinition().addAll((Collection<? extends MessageDefinition>)newValue);
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
			case Iso20022Package.MESSAGE_SET__VALID_ENCODING:
				getValidEncoding().clear();
				return;
			case Iso20022Package.MESSAGE_SET__MESSAGE_DEFINITION:
				getMessageDefinition().clear();
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
			case Iso20022Package.MESSAGE_SET__GENERATED_SYNTAX:
				return !getGeneratedSyntax().isEmpty();
			case Iso20022Package.MESSAGE_SET__VALID_ENCODING:
				return validEncoding != null && !validEncoding.isEmpty();
			case Iso20022Package.MESSAGE_SET__MESSAGE_DEFINITION:
				return messageDefinition != null && !messageDefinition.isEmpty();
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
			case Iso20022Package.MESSAGE_SET___GENERATED_SYNTAX_DERIVATION__MAP_DIAGNOSTICCHAIN:
				return GeneratedSyntaxDerivation((Map)arguments.get(0), (DiagnosticChain)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //MessageSetImpl
