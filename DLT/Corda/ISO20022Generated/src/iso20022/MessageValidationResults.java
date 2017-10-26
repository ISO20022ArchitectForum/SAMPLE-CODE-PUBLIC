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
 * A representation of the literals of the enumeration '<em><b>Message Validation Results</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * characteristic from the MessageTransport, specifying the behaviour of the MessageTransportSystem as a result of MessageValidation
 * <!-- end-model-doc -->
 * @see iso20022.Iso20022Package#getMessageValidationResults()
 * @model
 * @generated
 */
public enum MessageValidationResults implements Enumerator {
	/**
	 * The '<em><b>REJECT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REJECT_VALUE
	 * @generated
	 * @ordered
	 */
	REJECT(0, "REJECT", "REJECT"),

	/**
	 * The '<em><b>REJECT AND DELIVER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REJECT_AND_DELIVER_VALUE
	 * @generated
	 * @ordered
	 */
	REJECT_AND_DELIVER(1, "REJECT_AND_DELIVER", "REJECT_AND_DELIVER"),

	/**
	 * The '<em><b>DELIVER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DELIVER_VALUE
	 * @generated
	 * @ordered
	 */
	DELIVER(2, "DELIVER", "DELIVER");

	/**
	 * The '<em><b>REJECT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * invalid messages cause a rejection TransportMessage to be sent to the sending MessagingEndpoint, and the invalid MessageInstance is not delivered to any other MessagingEndpoint. Valid messages are delivered to their destinations and marked as valid in the TransportMessage
	 * <!-- end-model-doc -->
	 * @see #REJECT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REJECT_VALUE = 0;

	/**
	 * The '<em><b>REJECT AND DELIVER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * invalid messages must cause a rejection TransportMessage to be sent to the sending MessagingEndpoint, and the invalid MessageInstance is marked as invalid in the TransportMessage and delivered to its destination MessagingEndpoints. Valid messages are delivered to their destinations and marked as valid in the TransportMessage
	 * <!-- end-model-doc -->
	 * @see #REJECT_AND_DELIVER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REJECT_AND_DELIVER_VALUE = 1;

	/**
	 * The '<em><b>DELIVER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * invalid messages do not cause a rejection TransportMessage to be sent to the sending MessagingEndpoint. The invalid MessageInstance is delivered to its destination MessagingEndpoints. Valid messages are delivered to their destinations and marked as valid in the TransportMessage
	 * <!-- end-model-doc -->
	 * @see #DELIVER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DELIVER_VALUE = 2;

	/**
	 * An array of all the '<em><b>Message Validation Results</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MessageValidationResults[] VALUES_ARRAY =
		new MessageValidationResults[] {
			REJECT,
			REJECT_AND_DELIVER,
			DELIVER,
		};

	/**
	 * A public read-only list of all the '<em><b>Message Validation Results</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MessageValidationResults> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Message Validation Results</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MessageValidationResults get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MessageValidationResults result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Message Validation Results</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MessageValidationResults getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MessageValidationResults result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Message Validation Results</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MessageValidationResults get(int value) {
		switch (value) {
			case REJECT_VALUE: return REJECT;
			case REJECT_AND_DELIVER_VALUE: return REJECT_AND_DELIVER;
			case DELIVER_VALUE: return DELIVER;
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
	private MessageValidationResults(int value, String name, String literal) {
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
	
} //MessageValidationResults
