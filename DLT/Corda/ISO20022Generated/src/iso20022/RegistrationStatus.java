/**
 */
package iso20022;

import java.lang.String;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Registration Status</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * the enumeration of the standing of a RepositoryConcept in the Repository
 * <!-- end-model-doc -->
 * @see iso20022.Iso20022Package#getRegistrationStatus()
 * @model
 * @generated
 */
public enum RegistrationStatus implements Enumerator {
	/**
	 * The '<em><b>PROVISIONALLY REGISTERED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROVISIONALLY_REGISTERED_VALUE
	 * @generated
	 * @ordered
	 */
	PROVISIONALLY_REGISTERED(0, "PROVISIONALLY_REGISTERED", "Provisionally Registered"),

	/**
	 * The '<em><b>REGISTERED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REGISTERED_VALUE
	 * @generated
	 * @ordered
	 */
	REGISTERED(1, "REGISTERED", "Registered"),

	/**
	 * The '<em><b>OBSOLETE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OBSOLETE_VALUE
	 * @generated
	 * @ordered
	 */
	OBSOLETE(2, "OBSOLETE", "Obsolete");

	/**
	 * The '<em><b>PROVISIONALLY REGISTERED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * status of a RepositoryConcept, showing it is pending final approval
	 * <!-- end-model-doc -->
	 * @see #PROVISIONALLY_REGISTERED
	 * @model literal="Provisionally Registered"
	 * @generated
	 * @ordered
	 */
	public static final int PROVISIONALLY_REGISTERED_VALUE = 0;

	/**
	 * The '<em><b>REGISTERED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * status of a RepositoryConcept, showing it is ISO 20022 compliant, approved by the Registration Authority and can be used
	 * <!-- end-model-doc -->
	 * @see #REGISTERED
	 * @model literal="Registered"
	 * @generated
	 * @ordered
	 */
	public static final int REGISTERED_VALUE = 1;

	/**
	 * The '<em><b>OBSOLETE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * status of a RepositoryConcept, showing it is still compliant but cannot be used in new ISO 20022 compliant developments.
	 * <!-- end-model-doc -->
	 * @see #OBSOLETE
	 * @model literal="Obsolete"
	 * @generated
	 * @ordered
	 */
	public static final int OBSOLETE_VALUE = 2;

	/**
	 * An array of all the '<em><b>Registration Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RegistrationStatus[] VALUES_ARRAY =
		new RegistrationStatus[] {
			PROVISIONALLY_REGISTERED,
			REGISTERED,
			OBSOLETE,
		};

	/**
	 * A public read-only list of all the '<em><b>Registration Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RegistrationStatus> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Registration Status</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RegistrationStatus get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RegistrationStatus result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Registration Status</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RegistrationStatus getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RegistrationStatus result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Registration Status</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RegistrationStatus get(int value) {
		switch (value) {
			case PROVISIONALLY_REGISTERED_VALUE: return PROVISIONALLY_REGISTERED;
			case REGISTERED_VALUE: return REGISTERED;
			case OBSOLETE_VALUE: return OBSOLETE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private RegistrationStatus(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
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
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //RegistrationStatus
