/**
 */
package iso20022.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import iso20022.Encoding;
import iso20022.Iso20022Package;
import iso20022.MessageSet;
import iso20022.Syntax;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Encoding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso20022.impl.EncodingImpl#getMessageSet <em>Message Set</em>}</li>
 *   <li>{@link iso20022.impl.EncodingImpl#getSyntax <em>Syntax</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EncodingImpl extends ModelEntityImpl implements Encoding {
	/**
	 * The cached value of the '{@link #getMessageSet() <em>Message Set</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageSet()
	 * @generated
	 * @ordered
	 */
	protected EList<MessageSet> messageSet;

	/**
	 * The cached value of the '{@link #getSyntax() <em>Syntax</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSyntax()
	 * @generated
	 * @ordered
	 */
	protected Syntax syntax;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EncodingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Iso20022Package.eINSTANCE.getEncoding();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MessageSet> getMessageSet() {
		if (messageSet == null) {
			messageSet = new EObjectWithInverseResolvingEList.ManyInverse<MessageSet>(MessageSet.class, this, Iso20022Package.ENCODING__MESSAGE_SET, Iso20022Package.MESSAGE_SET__VALID_ENCODING);
		}
		return messageSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Syntax getSyntax() {
		if (syntax != null && syntax.eIsProxy()) {
			InternalEObject oldSyntax = (InternalEObject)syntax;
			syntax = (Syntax)eResolveProxy(oldSyntax);
			if (syntax != oldSyntax) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Iso20022Package.ENCODING__SYNTAX, oldSyntax, syntax));
			}
		}
		return syntax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Syntax basicGetSyntax() {
		return syntax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSyntax(Syntax newSyntax, NotificationChain msgs) {
		Syntax oldSyntax = syntax;
		syntax = newSyntax;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Iso20022Package.ENCODING__SYNTAX, oldSyntax, newSyntax);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSyntax(Syntax newSyntax) {
		if (newSyntax != syntax) {
			NotificationChain msgs = null;
			if (syntax != null)
				msgs = ((InternalEObject)syntax).eInverseRemove(this, Iso20022Package.SYNTAX__POSSIBLE_ENCODINGS, Syntax.class, msgs);
			if (newSyntax != null)
				msgs = ((InternalEObject)newSyntax).eInverseAdd(this, Iso20022Package.SYNTAX__POSSIBLE_ENCODINGS, Syntax.class, msgs);
			msgs = basicSetSyntax(newSyntax, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Iso20022Package.ENCODING__SYNTAX, newSyntax, newSyntax));
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
			case Iso20022Package.ENCODING__MESSAGE_SET:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMessageSet()).basicAdd(otherEnd, msgs);
			case Iso20022Package.ENCODING__SYNTAX:
				if (syntax != null)
					msgs = ((InternalEObject)syntax).eInverseRemove(this, Iso20022Package.SYNTAX__POSSIBLE_ENCODINGS, Syntax.class, msgs);
				return basicSetSyntax((Syntax)otherEnd, msgs);
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
			case Iso20022Package.ENCODING__MESSAGE_SET:
				return ((InternalEList<?>)getMessageSet()).basicRemove(otherEnd, msgs);
			case Iso20022Package.ENCODING__SYNTAX:
				return basicSetSyntax(null, msgs);
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
			case Iso20022Package.ENCODING__MESSAGE_SET:
				return getMessageSet();
			case Iso20022Package.ENCODING__SYNTAX:
				if (resolve) return getSyntax();
				return basicGetSyntax();
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
			case Iso20022Package.ENCODING__MESSAGE_SET:
				getMessageSet().clear();
				getMessageSet().addAll((Collection<? extends MessageSet>)newValue);
				return;
			case Iso20022Package.ENCODING__SYNTAX:
				setSyntax((Syntax)newValue);
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
			case Iso20022Package.ENCODING__MESSAGE_SET:
				getMessageSet().clear();
				return;
			case Iso20022Package.ENCODING__SYNTAX:
				setSyntax((Syntax)null);
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
			case Iso20022Package.ENCODING__MESSAGE_SET:
				return messageSet != null && !messageSet.isEmpty();
			case Iso20022Package.ENCODING__SYNTAX:
				return syntax != null;
		}
		return super.eIsSet(featureID);
	}

} //EncodingImpl
