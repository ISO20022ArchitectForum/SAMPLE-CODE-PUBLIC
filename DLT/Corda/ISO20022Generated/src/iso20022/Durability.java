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
 * A representation of the literals of the enumeration '<em><b>Durability</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * characteristic from the MessageTransport, indicating whether the MessageTransportSystem safely retains a TransportMessage until it has been received by the destination MessagingEndpoint
 * <!-- end-model-doc -->
 * @see iso20022.Iso20022Package#getDurability()
 * @model
 * @generated
 */
public enum Durability implements Enumerator {
	/**
	 * The '<em><b>DURABLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DURABLE_VALUE
	 * @generated
	 * @ordered
	 */
	DURABLE(0, "DURABLE", "DURABLE"),

	/**
	 * The '<em><b>PERSISTENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERSISTENT_VALUE
	 * @generated
	 * @ordered
	 */
	PERSISTENT(1, "PERSISTENT", "PERSISTENT"),

	/**
	 * The '<em><b>TRANSIENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRANSIENT_VALUE
	 * @generated
	 * @ordered
	 */
	TRANSIENT(2, "TRANSIENT", "TRANSIENT");

	/**
	 * The '<em><b>DURABLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the TransportMessage is kept available indefinitely until the message is delivered to the destination MessagingEndpoint. The TransportMessage is only kept available if it is ready for delivery within the BoundedCommunicationDelay; otherwise it expires like every other non-durable message
	 * <!-- end-model-doc -->
	 * @see #DURABLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DURABLE_VALUE = 0;

	/**
	 * The '<em><b>PERSISTENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the TransportMessage is kept available until it is delivered to the receiving MessagingEndpoint or until it is expired because the BoundedCommunicationDelay is exceeded
	 * <!-- end-model-doc -->
	 * @see #PERSISTENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PERSISTENT_VALUE = 1;

	/**
	 * The '<em><b>TRANSIENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the TransportMessage is not kept available and will not be delivered if the receiving MessagingEndpoint is not available
	 * <!-- end-model-doc -->
	 * @see #TRANSIENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TRANSIENT_VALUE = 2;

	/**
	 * An array of all the '<em><b>Durability</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Durability[] VALUES_ARRAY =
		new Durability[] {
			DURABLE,
			PERSISTENT,
			TRANSIENT,
		};

	/**
	 * A public read-only list of all the '<em><b>Durability</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Durability> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Durability</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Durability get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Durability result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Durability</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Durability getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Durability result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Durability</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Durability get(int value) {
		switch (value) {
			case DURABLE_VALUE: return DURABLE;
			case PERSISTENT_VALUE: return PERSISTENT;
			case TRANSIENT_VALUE: return TRANSIENT;
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
	private Durability(int value, String name, String literal) {
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
	
} //Durability
