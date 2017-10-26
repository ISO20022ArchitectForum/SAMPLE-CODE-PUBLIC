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
 * A representation of the literals of the enumeration '<em><b>Message Delivery Order</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * characteristic from the MessageTransport, indicating to what extent TransportMessages from a sending MessagingEndpoint arrive in the order in which they were sent at the receiving MessagingEndpoints
 * <!-- end-model-doc -->
 * @see iso20022.Iso20022Package#getMessageDeliveryOrder()
 * @model
 * @generated
 */
public enum MessageDeliveryOrder implements Enumerator {
	/**
	 * The '<em><b>EXPECTED CAUSAL ORDER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXPECTED_CAUSAL_ORDER_VALUE
	 * @generated
	 * @ordered
	 */
	EXPECTED_CAUSAL_ORDER(0, "EXPECTED_CAUSAL_ORDER", "EXPECTED_CAUSAL_ORDER"),

	/**
	 * The '<em><b>FIFO ORDERED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIFO_ORDERED_VALUE
	 * @generated
	 * @ordered
	 */
	FIFO_ORDERED(1, "FIFO_ORDERED", "FIFO_ORDERED"),

	/**
	 * The '<em><b>UNORDERED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNORDERED_VALUE
	 * @generated
	 * @ordered
	 */
	UNORDERED(2, "UNORDERED", "UNORDERED");

	/**
	 * The '<em><b>EXPECTED CAUSAL ORDER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the receipt order of TransportMessages at all receivers is preserved across all sending MessagingEndpoints
	 * <!-- end-model-doc -->
	 * @see #EXPECTED_CAUSAL_ORDER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EXPECTED_CAUSAL_ORDER_VALUE = 0;

	/**
	 * The '<em><b>FIFO ORDERED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * at every receiver, the order of receipt of TransportMessages is preserved for each sending MessagingEndpoint but not across sending MessagingEndpoints
	 * <!-- end-model-doc -->
	 * @see #FIFO_ORDERED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FIFO_ORDERED_VALUE = 1;

	/**
	 * The '<em><b>UNORDERED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TransportMessages may arrive in any order at the receiving MessagingEndpoints. The only limitation is the Bounded Communication Delay
	 * <!-- end-model-doc -->
	 * @see #UNORDERED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UNORDERED_VALUE = 2;

	/**
	 * An array of all the '<em><b>Message Delivery Order</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MessageDeliveryOrder[] VALUES_ARRAY =
		new MessageDeliveryOrder[] {
			EXPECTED_CAUSAL_ORDER,
			FIFO_ORDERED,
			UNORDERED,
		};

	/**
	 * A public read-only list of all the '<em><b>Message Delivery Order</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MessageDeliveryOrder> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Message Delivery Order</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MessageDeliveryOrder get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MessageDeliveryOrder result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Message Delivery Order</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MessageDeliveryOrder getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MessageDeliveryOrder result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Message Delivery Order</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MessageDeliveryOrder get(int value) {
		switch (value) {
			case EXPECTED_CAUSAL_ORDER_VALUE: return EXPECTED_CAUSAL_ORDER;
			case FIFO_ORDERED_VALUE: return FIFO_ORDERED;
			case UNORDERED_VALUE: return UNORDERED;
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
	private MessageDeliveryOrder(int value, String name, String literal) {
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
	
} //MessageDeliveryOrder
