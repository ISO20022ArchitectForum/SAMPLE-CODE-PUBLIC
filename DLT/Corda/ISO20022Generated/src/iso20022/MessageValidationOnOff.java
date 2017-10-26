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
 * A representation of the literals of the enumeration '<em><b>Message Validation On Off</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * characteristic from the MessageTransport, specifying whether the MessageTransportSystem validates the MessageInstance with respect to SyntaxMessageScheme, Rules, the MarketPractices, and the MessageChoreography
 * <!-- end-model-doc -->
 * @see iso20022.Iso20022Package#getMessageValidationOnOff()
 * @model
 * @generated
 */
public enum MessageValidationOnOff implements Enumerator {
	/**
	 * The '<em><b>VALIDATION ON</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VALIDATION_ON_VALUE
	 * @generated
	 * @ordered
	 */
	VALIDATION_ON(0, "VALIDATION_ON", "VALIDATION_ON"),

	/**
	 * The '<em><b>VALIDATION OFF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VALIDATION_OFF_VALUE
	 * @generated
	 * @ordered
	 */
	VALIDATION_OFF(1, "VALIDATION_OFF", "VALIDATION_OFF");

	/**
	 * The '<em><b>VALIDATION ON</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * all MessageInstances are validated by the MessageTransportSystem
	 * <!-- end-model-doc -->
	 * @see #VALIDATION_ON
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VALIDATION_ON_VALUE = 0;

	/**
	 * The '<em><b>VALIDATION OFF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MessageInstances are not validated by the MessageTransportSystem
	 * <!-- end-model-doc -->
	 * @see #VALIDATION_OFF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VALIDATION_OFF_VALUE = 1;

	/**
	 * An array of all the '<em><b>Message Validation On Off</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MessageValidationOnOff[] VALUES_ARRAY =
		new MessageValidationOnOff[] {
			VALIDATION_ON,
			VALIDATION_OFF,
		};

	/**
	 * A public read-only list of all the '<em><b>Message Validation On Off</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MessageValidationOnOff> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Message Validation On Off</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MessageValidationOnOff get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MessageValidationOnOff result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Message Validation On Off</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MessageValidationOnOff getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MessageValidationOnOff result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Message Validation On Off</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MessageValidationOnOff get(int value) {
		switch (value) {
			case VALIDATION_ON_VALUE: return VALIDATION_ON;
			case VALIDATION_OFF_VALUE: return VALIDATION_OFF;
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
	private MessageValidationOnOff(int value, String name, String literal) {
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
	
} //MessageValidationOnOff
