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
 * A representation of the literals of the enumeration '<em><b>Delivery Assurance</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * characteristic from the MessageTransport, specifying the degree to which the sending MessagingEndpoint is assured that a TransportMessage will be delivered
 * 
 * <!-- end-model-doc -->
 * @see iso20022.Iso20022Package#getDeliveryAssurance()
 * @model
 * @generated
 */
public enum DeliveryAssurance implements Enumerator {
	/**
	 * The '<em><b>AT LEAST ONCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AT_LEAST_ONCE_VALUE
	 * @generated
	 * @ordered
	 */
	AT_LEAST_ONCE(0, "AT_LEAST_ONCE", "AT_LEAST_ONCE"),

	/**
	 * The '<em><b>EXACTLY ONCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXACTLY_ONCE_VALUE
	 * @generated
	 * @ordered
	 */
	EXACTLY_ONCE(1, "EXACTLY_ONCE", "EXACTLY_ONCE"),

	/**
	 * The '<em><b>AT MOST ONCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AT_MOST_ONCE_VALUE
	 * @generated
	 * @ordered
	 */
	AT_MOST_ONCE(2, "AT_MOST_ONCE", "AT_MOST_ONCE");

	/**
	 * The '<em><b>AT LEAST ONCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the receiving Messaging Endpoint receives the TransportMessage at least once
	 * <!-- end-model-doc -->
	 * @see #AT_LEAST_ONCE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AT_LEAST_ONCE_VALUE = 0;

	/**
	 * The '<em><b>EXACTLY ONCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the receiving Messaging Endpoint receives the TransportMessage exactly once
	 * <!-- end-model-doc -->
	 * @see #EXACTLY_ONCE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EXACTLY_ONCE_VALUE = 1;

	/**
	 * The '<em><b>AT MOST ONCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the receiving MessagingEndpoint receives the TransportMessage at most once. There is no assurance a TransportMessage will be delivered
	 * <!-- end-model-doc -->
	 * @see #AT_MOST_ONCE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AT_MOST_ONCE_VALUE = 2;

	/**
	 * An array of all the '<em><b>Delivery Assurance</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DeliveryAssurance[] VALUES_ARRAY =
		new DeliveryAssurance[] {
			AT_LEAST_ONCE,
			EXACTLY_ONCE,
			AT_MOST_ONCE,
		};

	/**
	 * A public read-only list of all the '<em><b>Delivery Assurance</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DeliveryAssurance> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Delivery Assurance</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DeliveryAssurance get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DeliveryAssurance result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Delivery Assurance</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DeliveryAssurance getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DeliveryAssurance result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Delivery Assurance</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DeliveryAssurance get(int value) {
		switch (value) {
			case AT_LEAST_ONCE_VALUE: return AT_LEAST_ONCE;
			case EXACTLY_ONCE_VALUE: return EXACTLY_ONCE;
			case AT_MOST_ONCE_VALUE: return AT_MOST_ONCE;
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
	private DeliveryAssurance(int value, String name, String literal) {
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
	
} //DeliveryAssurance
