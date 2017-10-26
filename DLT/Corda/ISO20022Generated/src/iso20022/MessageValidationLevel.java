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
 * A representation of the literals of the enumeration '<em><b>Message Validation Level</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * characteristic from the MessageTransport, indicating the level of validation that is required by the MessageTransportSystem
 * <!-- end-model-doc -->
 * @see iso20022.Iso20022Package#getMessageValidationLevel()
 * @model
 * @generated
 */
public enum MessageValidationLevel implements Enumerator {
	/**
	 * The '<em><b>NO VALIDATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_VALIDATION_VALUE
	 * @generated
	 * @ordered
	 */
	NO_VALIDATION(0, "NO_VALIDATION", "NO_VALIDATION"),

	/**
	 * The '<em><b>SYNTAX VALID</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SYNTAX_VALID_VALUE
	 * @generated
	 * @ordered
	 */
	SYNTAX_VALID(1, "SYNTAX_VALID", "SYNTAX_VALID"),

	/**
	 * The '<em><b>SCHEMA VALID</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCHEMA_VALID_VALUE
	 * @generated
	 * @ordered
	 */
	SCHEMA_VALID(2, "SCHEMA_VALID", "SCHEMA_VALID"),

	/**
	 * The '<em><b>MESSAGE VALID</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MESSAGE_VALID_VALUE
	 * @generated
	 * @ordered
	 */
	MESSAGE_VALID(3, "MESSAGE_VALID", "MESSAGE_VALID"),

	/**
	 * The '<em><b>RULE VALID</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RULE_VALID_VALUE
	 * @generated
	 * @ordered
	 */
	RULE_VALID(4, "RULE_VALID", "RULE_VALID"),

	/**
	 * The '<em><b>MARKET PRACTICE VALID</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MARKET_PRACTICE_VALID_VALUE
	 * @generated
	 * @ordered
	 */
	MARKET_PRACTICE_VALID(5, "MARKET_PRACTICE_VALID", "MARKET_PRACTICE_VALID"),

	/**
	 * The '<em><b>BUSINESS PROCESS VALID</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUSINESS_PROCESS_VALID_VALUE
	 * @generated
	 * @ordered
	 */
	BUSINESS_PROCESS_VALID(6, "BUSINESS_PROCESS_VALID", "BUSINESS_PROCESS_VALID"),

	/**
	 * The '<em><b>COMPLETELY VALID</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPLETELY_VALID_VALUE
	 * @generated
	 * @ordered
	 */
	COMPLETELY_VALID(7, "COMPLETELY_VALID", "COMPLETELY_VALID");

	/**
	 * The '<em><b>NO VALIDATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the MessageInstance is not validated
	 * <!-- end-model-doc -->
	 * @see #NO_VALIDATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NO_VALIDATION_VALUE = 0;

	/**
	 * The '<em><b>SYNTAX VALID</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the MessageInstance has its syntax validated.
	 * <!-- end-model-doc -->
	 * @see #SYNTAX_VALID
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SYNTAX_VALID_VALUE = 1;

	/**
	 * The '<em><b>SCHEMA VALID</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the MessageInstance is Syntax Valid plus validated against the Syntax Message Scheme.
	 * <!-- end-model-doc -->
	 * @see #SCHEMA_VALID
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SCHEMA_VALID_VALUE = 2;

	/**
	 * The '<em><b>MESSAGE VALID</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the MessageInstance is Schema Valid plus validated against the MessageRules
	 * <!-- end-model-doc -->
	 * @see #MESSAGE_VALID
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MESSAGE_VALID_VALUE = 3;

	/**
	 * The '<em><b>RULE VALID</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the MessageInstance is Message Valid plus validated against the BusinessRules
	 * <!-- end-model-doc -->
	 * @see #RULE_VALID
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RULE_VALID_VALUE = 4;

	/**
	 * The '<em><b>MARKET PRACTICE VALID</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the MessageInstance is Message Valid plus validated against the Market Practices
	 * <!-- end-model-doc -->
	 * @see #MARKET_PRACTICE_VALID
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MARKET_PRACTICE_VALID_VALUE = 5;

	/**
	 * The '<em><b>BUSINESS PROCESS VALID</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the MessageInstance is Message Valid plus validated against the MessageChoreography
	 * <!-- end-model-doc -->
	 * @see #BUSINESS_PROCESS_VALID
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BUSINESS_PROCESS_VALID_VALUE = 6;

	/**
	 * The '<em><b>COMPLETELY VALID</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the MessageInstance is Message Valid plus validated against all Rules and MarketPractices
	 * <!-- end-model-doc -->
	 * @see #COMPLETELY_VALID
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COMPLETELY_VALID_VALUE = 7;

	/**
	 * An array of all the '<em><b>Message Validation Level</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MessageValidationLevel[] VALUES_ARRAY =
		new MessageValidationLevel[] {
			NO_VALIDATION,
			SYNTAX_VALID,
			SCHEMA_VALID,
			MESSAGE_VALID,
			RULE_VALID,
			MARKET_PRACTICE_VALID,
			BUSINESS_PROCESS_VALID,
			COMPLETELY_VALID,
		};

	/**
	 * A public read-only list of all the '<em><b>Message Validation Level</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MessageValidationLevel> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Message Validation Level</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MessageValidationLevel get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MessageValidationLevel result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Message Validation Level</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MessageValidationLevel getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MessageValidationLevel result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Message Validation Level</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MessageValidationLevel get(int value) {
		switch (value) {
			case NO_VALIDATION_VALUE: return NO_VALIDATION;
			case SYNTAX_VALID_VALUE: return SYNTAX_VALID;
			case SCHEMA_VALID_VALUE: return SCHEMA_VALID;
			case MESSAGE_VALID_VALUE: return MESSAGE_VALID;
			case RULE_VALID_VALUE: return RULE_VALID;
			case MARKET_PRACTICE_VALID_VALUE: return MARKET_PRACTICE_VALID;
			case BUSINESS_PROCESS_VALID_VALUE: return BUSINESS_PROCESS_VALID;
			case COMPLETELY_VALID_VALUE: return COMPLETELY_VALID;
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
	private MessageValidationLevel(int value, String name, String literal) {
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
	
} //MessageValidationLevel
