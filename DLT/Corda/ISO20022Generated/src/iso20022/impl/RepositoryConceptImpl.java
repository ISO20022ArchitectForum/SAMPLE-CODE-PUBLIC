/**
 */
package iso20022.impl;

import java.lang.String;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Date;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import iso20022.Constraint;
import iso20022.Doclet;
import iso20022.Iso20022Package;
import iso20022.RegistrationStatus;
import iso20022.RepositoryConcept;
import iso20022.SemanticMarkup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Repository Concept</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso20022.impl.RepositoryConceptImpl#getName <em>Name</em>}</li>
 *   <li>{@link iso20022.impl.RepositoryConceptImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link iso20022.impl.RepositoryConceptImpl#getSemanticMarkup <em>Semantic Markup</em>}</li>
 *   <li>{@link iso20022.impl.RepositoryConceptImpl#getDoclet <em>Doclet</em>}</li>
 *   <li>{@link iso20022.impl.RepositoryConceptImpl#getExample <em>Example</em>}</li>
 *   <li>{@link iso20022.impl.RepositoryConceptImpl#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link iso20022.impl.RepositoryConceptImpl#getRegistrationStatus <em>Registration Status</em>}</li>
 *   <li>{@link iso20022.impl.RepositoryConceptImpl#getRemovalDate <em>Removal Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class RepositoryConceptImpl extends ModelEntityImpl implements RepositoryConcept {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefinition() <em>Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinition()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFINITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefinition() <em>Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinition()
	 * @generated
	 * @ordered
	 */
	protected String definition = DEFINITION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSemanticMarkup() <em>Semantic Markup</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticMarkup()
	 * @generated
	 * @ordered
	 */
	protected EList<SemanticMarkup> semanticMarkup;

	/**
	 * The cached value of the '{@link #getDoclet() <em>Doclet</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoclet()
	 * @generated
	 * @ordered
	 */
	protected EList<Doclet> doclet;

	/**
	 * The cached value of the '{@link #getExample() <em>Example</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExample()
	 * @generated
	 * @ordered
	 */
	protected EList<String> example;

	/**
	 * The cached value of the '{@link #getConstraint() <em>Constraint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraint()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> constraint;

	/**
	 * The default value of the '{@link #getRegistrationStatus() <em>Registration Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistrationStatus()
	 * @generated
	 * @ordered
	 */
	protected static final RegistrationStatus REGISTRATION_STATUS_EDEFAULT = RegistrationStatus.PROVISIONALLY_REGISTERED;

	/**
	 * The cached value of the '{@link #getRegistrationStatus() <em>Registration Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistrationStatus()
	 * @generated
	 * @ordered
	 */
	protected RegistrationStatus registrationStatus = REGISTRATION_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getRemovalDate() <em>Removal Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemovalDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date REMOVAL_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRemovalDate() <em>Removal Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemovalDate()
	 * @generated
	 * @ordered
	 */
	protected Date removalDate = REMOVAL_DATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RepositoryConceptImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Iso20022Package.eINSTANCE.getRepositoryConcept();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Iso20022Package.REPOSITORY_CONCEPT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefinition() {
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinition(String newDefinition) {
		String oldDefinition = definition;
		definition = newDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Iso20022Package.REPOSITORY_CONCEPT__DEFINITION, oldDefinition, definition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SemanticMarkup> getSemanticMarkup() {
		if (semanticMarkup == null) {
			semanticMarkup = new EObjectContainmentEList<SemanticMarkup>(SemanticMarkup.class, this, Iso20022Package.REPOSITORY_CONCEPT__SEMANTIC_MARKUP);
		}
		return semanticMarkup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Doclet> getDoclet() {
		if (doclet == null) {
			doclet = new EObjectContainmentEList<Doclet>(Doclet.class, this, Iso20022Package.REPOSITORY_CONCEPT__DOCLET);
		}
		return doclet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getExample() {
		if (example == null) {
			example = new EDataTypeUniqueEList<String>(String.class, this, Iso20022Package.REPOSITORY_CONCEPT__EXAMPLE);
		}
		return example;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getConstraint() {
		if (constraint == null) {
			constraint = new EObjectContainmentWithInverseEList<Constraint>(Constraint.class, this, Iso20022Package.REPOSITORY_CONCEPT__CONSTRAINT, Iso20022Package.CONSTRAINT__OWNER);
		}
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegistrationStatus getRegistrationStatus() {
		return registrationStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegistrationStatus(RegistrationStatus newRegistrationStatus) {
		RegistrationStatus oldRegistrationStatus = registrationStatus;
		registrationStatus = newRegistrationStatus == null ? REGISTRATION_STATUS_EDEFAULT : newRegistrationStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Iso20022Package.REPOSITORY_CONCEPT__REGISTRATION_STATUS, oldRegistrationStatus, registrationStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getRemovalDate() {
		return removalDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemovalDate(Date newRemovalDate) {
		Date oldRemovalDate = removalDate;
		removalDate = newRemovalDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Iso20022Package.REPOSITORY_CONCEPT__REMOVAL_DATE, oldRemovalDate, removalDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean RemovalDateRegistrationStatus(Map context, DiagnosticChain diagnostics) {
		// TODO: implement this method >>> DONE
		// Ensure that you remove @generated or mark it @generated NOT
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean NameFirstLetterUppercase(Map context, DiagnosticChain diagnostics) {
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
			case Iso20022Package.REPOSITORY_CONCEPT__CONSTRAINT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConstraint()).basicAdd(otherEnd, msgs);
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
			case Iso20022Package.REPOSITORY_CONCEPT__SEMANTIC_MARKUP:
				return ((InternalEList<?>)getSemanticMarkup()).basicRemove(otherEnd, msgs);
			case Iso20022Package.REPOSITORY_CONCEPT__DOCLET:
				return ((InternalEList<?>)getDoclet()).basicRemove(otherEnd, msgs);
			case Iso20022Package.REPOSITORY_CONCEPT__CONSTRAINT:
				return ((InternalEList<?>)getConstraint()).basicRemove(otherEnd, msgs);
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
			case Iso20022Package.REPOSITORY_CONCEPT__NAME:
				return getName();
			case Iso20022Package.REPOSITORY_CONCEPT__DEFINITION:
				return getDefinition();
			case Iso20022Package.REPOSITORY_CONCEPT__SEMANTIC_MARKUP:
				return getSemanticMarkup();
			case Iso20022Package.REPOSITORY_CONCEPT__DOCLET:
				return getDoclet();
			case Iso20022Package.REPOSITORY_CONCEPT__EXAMPLE:
				return getExample();
			case Iso20022Package.REPOSITORY_CONCEPT__CONSTRAINT:
				return getConstraint();
			case Iso20022Package.REPOSITORY_CONCEPT__REGISTRATION_STATUS:
				return getRegistrationStatus();
			case Iso20022Package.REPOSITORY_CONCEPT__REMOVAL_DATE:
				return getRemovalDate();
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
			case Iso20022Package.REPOSITORY_CONCEPT__NAME:
				setName((String)newValue);
				return;
			case Iso20022Package.REPOSITORY_CONCEPT__DEFINITION:
				setDefinition((String)newValue);
				return;
			case Iso20022Package.REPOSITORY_CONCEPT__SEMANTIC_MARKUP:
				getSemanticMarkup().clear();
				getSemanticMarkup().addAll((Collection<? extends SemanticMarkup>)newValue);
				return;
			case Iso20022Package.REPOSITORY_CONCEPT__DOCLET:
				getDoclet().clear();
				getDoclet().addAll((Collection<? extends Doclet>)newValue);
				return;
			case Iso20022Package.REPOSITORY_CONCEPT__EXAMPLE:
				getExample().clear();
				getExample().addAll((Collection<? extends String>)newValue);
				return;
			case Iso20022Package.REPOSITORY_CONCEPT__CONSTRAINT:
				getConstraint().clear();
				getConstraint().addAll((Collection<? extends Constraint>)newValue);
				return;
			case Iso20022Package.REPOSITORY_CONCEPT__REGISTRATION_STATUS:
				setRegistrationStatus((RegistrationStatus)newValue);
				return;
			case Iso20022Package.REPOSITORY_CONCEPT__REMOVAL_DATE:
				setRemovalDate((Date)newValue);
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
			case Iso20022Package.REPOSITORY_CONCEPT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Iso20022Package.REPOSITORY_CONCEPT__DEFINITION:
				setDefinition(DEFINITION_EDEFAULT);
				return;
			case Iso20022Package.REPOSITORY_CONCEPT__SEMANTIC_MARKUP:
				getSemanticMarkup().clear();
				return;
			case Iso20022Package.REPOSITORY_CONCEPT__DOCLET:
				getDoclet().clear();
				return;
			case Iso20022Package.REPOSITORY_CONCEPT__EXAMPLE:
				getExample().clear();
				return;
			case Iso20022Package.REPOSITORY_CONCEPT__CONSTRAINT:
				getConstraint().clear();
				return;
			case Iso20022Package.REPOSITORY_CONCEPT__REGISTRATION_STATUS:
				setRegistrationStatus(REGISTRATION_STATUS_EDEFAULT);
				return;
			case Iso20022Package.REPOSITORY_CONCEPT__REMOVAL_DATE:
				setRemovalDate(REMOVAL_DATE_EDEFAULT);
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
			case Iso20022Package.REPOSITORY_CONCEPT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Iso20022Package.REPOSITORY_CONCEPT__DEFINITION:
				return DEFINITION_EDEFAULT == null ? definition != null : !DEFINITION_EDEFAULT.equals(definition);
			case Iso20022Package.REPOSITORY_CONCEPT__SEMANTIC_MARKUP:
				return semanticMarkup != null && !semanticMarkup.isEmpty();
			case Iso20022Package.REPOSITORY_CONCEPT__DOCLET:
				return doclet != null && !doclet.isEmpty();
			case Iso20022Package.REPOSITORY_CONCEPT__EXAMPLE:
				return example != null && !example.isEmpty();
			case Iso20022Package.REPOSITORY_CONCEPT__CONSTRAINT:
				return constraint != null && !constraint.isEmpty();
			case Iso20022Package.REPOSITORY_CONCEPT__REGISTRATION_STATUS:
				return registrationStatus != REGISTRATION_STATUS_EDEFAULT;
			case Iso20022Package.REPOSITORY_CONCEPT__REMOVAL_DATE:
				return REMOVAL_DATE_EDEFAULT == null ? removalDate != null : !REMOVAL_DATE_EDEFAULT.equals(removalDate);
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
			case Iso20022Package.REPOSITORY_CONCEPT___REMOVAL_DATE_REGISTRATION_STATUS__MAP_DIAGNOSTICCHAIN:
				return RemovalDateRegistrationStatus((Map)arguments.get(0), (DiagnosticChain)arguments.get(1));
			case Iso20022Package.REPOSITORY_CONCEPT___NAME_FIRST_LETTER_UPPERCASE__MAP_DIAGNOSTICCHAIN:
				return NameFirstLetterUppercase((Map)arguments.get(0), (DiagnosticChain)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", definition: ");
		result.append(definition);
		result.append(", example: ");
		result.append(example);
		result.append(", registrationStatus: ");
		result.append(registrationStatus);
		result.append(", removalDate: ");
		result.append(removalDate);
		result.append(')');
		return result.toString();
	}

} //RepositoryConceptImpl
