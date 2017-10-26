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
 * A representation of the literals of the enumeration '<em><b>Sender Asynchronicity</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * characteristic from the MessageTransport, indicating whether a sending Messaging Endpoint blocks after sending a TransportMessage to the MessageTransportSystem while waiting for a response from a MessagingEndpoint
 * <!-- end-model-doc -->
 * @see iso20022.Iso20022Package#getSenderAsynchronicity()
 * @model
 * @generated
 */
public enum SenderAsynchronicity implements Enumerator {
	/**
	 * The '<em><b>ENDPOINT SYNCHRONOUS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENDPOINT_SYNCHRONOUS_VALUE
	 * @generated
	 * @ordered
	 */
	ENDPOINT_SYNCHRONOUS(0, "ENDPOINT_SYNCHRONOUS", "ENDPOINT_SYNCHRONOUS"),

	/**
	 * The '<em><b>CONVERSATION SYNCHRONOUS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONVERSATION_SYNCHRONOUS_VALUE
	 * @generated
	 * @ordered
	 */
	CONVERSATION_SYNCHRONOUS(1, "CONVERSATION_SYNCHRONOUS", "CONVERSATION_SYNCHRONOUS"),

	/**
	 * The '<em><b>ASYNCHRONOUS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASYNCHRONOUS_VALUE
	 * @generated
	 * @ordered
	 */
	ASYNCHRONOUS(2, "ASYNCHRONOUS", "ASYNCHRONOUS");

	/**
	 * The '<em><b>ENDPOINT SYNCHRONOUS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The sending MessagingEndpoint blocks the sending and receipt of other TransportMessages while waiting for a response to the sent TransportMessage.
	 * <!-- end-model-doc -->
	 * @see #ENDPOINT_SYNCHRONOUS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ENDPOINT_SYNCHRONOUS_VALUE = 0;

	/**
	 * The '<em><b>CONVERSATION SYNCHRONOUS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The sending MessagingEndpoint blocks the sending and receipt of other TransportMessages within the conversation, in which the TransportMessage was sent, while waiting for a response to this sent TransportMessage.
	 * <!-- end-model-doc -->
	 * @see #CONVERSATION_SYNCHRONOUS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONVERSATION_SYNCHRONOUS_VALUE = 1;

	/**
	 * The '<em><b>ASYNCHRONOUS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The sending MessagingEndpoint shall not block the sending or receipt of other TransportMessages while waiting for a response to the sent TransportMessage.
	 * <!-- end-model-doc -->
	 * @see #ASYNCHRONOUS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ASYNCHRONOUS_VALUE = 2;

	/**
	 * An array of all the '<em><b>Sender Asynchronicity</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SenderAsynchronicity[] VALUES_ARRAY =
		new SenderAsynchronicity[] {
			ENDPOINT_SYNCHRONOUS,
			CONVERSATION_SYNCHRONOUS,
			ASYNCHRONOUS,
		};

	/**
	 * A public read-only list of all the '<em><b>Sender Asynchronicity</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SenderAsynchronicity> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Sender Asynchronicity</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SenderAsynchronicity get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SenderAsynchronicity result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Sender Asynchronicity</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SenderAsynchronicity getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SenderAsynchronicity result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Sender Asynchronicity</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SenderAsynchronicity get(int value) {
		switch (value) {
			case ENDPOINT_SYNCHRONOUS_VALUE: return ENDPOINT_SYNCHRONOUS;
			case CONVERSATION_SYNCHRONOUS_VALUE: return CONVERSATION_SYNCHRONOUS;
			case ASYNCHRONOUS_VALUE: return ASYNCHRONOUS;
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
	private SenderAsynchronicity(int value, String name, String literal) {
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
	
} //SenderAsynchronicity
