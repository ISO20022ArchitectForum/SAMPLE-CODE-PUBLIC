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
 * A representation of the literals of the enumeration '<em><b>Message Casting</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * characteristic from the MessageTransport, indicating how receiving MessagingEndpoints may be addressed in a TransportMessage
 * <!-- end-model-doc -->
 * @see iso20022.Iso20022Package#getMessageCasting()
 * @model
 * @generated
 */
public enum MessageCasting implements Enumerator {
	/**
	 * The '<em><b>UNICAST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNICAST_VALUE
	 * @generated
	 * @ordered
	 */
	UNICAST(0, "UNICAST", "UNICAST"),

	/**
	 * The '<em><b>MULTICAST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTICAST_VALUE
	 * @generated
	 * @ordered
	 */
	MULTICAST(1, "MULTICAST", "MULTICAST"),

	/**
	 * The '<em><b>BROADCAST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BROADCAST_VALUE
	 * @generated
	 * @ordered
	 */
	BROADCAST(2, "BROADCAST", "BROADCAST"),

	/**
	 * The '<em><b>ANYCAST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANYCAST_VALUE
	 * @generated
	 * @ordered
	 */
	ANYCAST(3, "ANYCAST", "ANYCAST");

	/**
	 * The '<em><b>UNICAST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TransportMessages are addressed to a single receiving MessagingEndpoint
	 * <!-- end-model-doc -->
	 * @see #UNICAST
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UNICAST_VALUE = 0;

	/**
	 * The '<em><b>MULTICAST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TransportMessages are addressed to nought to many receiving MessagingEndpoints
	 * <!-- end-model-doc -->
	 * @see #MULTICAST
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MULTICAST_VALUE = 1;

	/**
	 * The '<em><b>BROADCAST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TransportMessages are addressed to a single Broadcast List
	 * <!-- end-model-doc -->
	 * @see #BROADCAST
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BROADCAST_VALUE = 2;

	/**
	 * The '<em><b>ANYCAST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TransportMessages may be Multicast or Broadcast
	 * <!-- end-model-doc -->
	 * @see #ANYCAST
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ANYCAST_VALUE = 3;

	/**
	 * An array of all the '<em><b>Message Casting</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MessageCasting[] VALUES_ARRAY =
		new MessageCasting[] {
			UNICAST,
			MULTICAST,
			BROADCAST,
			ANYCAST,
		};

	/**
	 * A public read-only list of all the '<em><b>Message Casting</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MessageCasting> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Message Casting</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MessageCasting get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MessageCasting result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Message Casting</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MessageCasting getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MessageCasting result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Message Casting</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MessageCasting get(int value) {
		switch (value) {
			case UNICAST_VALUE: return UNICAST;
			case MULTICAST_VALUE: return MULTICAST;
			case BROADCAST_VALUE: return BROADCAST;
			case ANYCAST_VALUE: return ANYCAST;
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
	private MessageCasting(int value, String name, String literal) {
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
	
} //MessageCasting
