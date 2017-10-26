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
 * A representation of the literals of the enumeration '<em><b>Schema Type Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see iso20022.Iso20022Package#getSchemaTypeKind()
 * @model
 * @generated
 */
public enum SchemaTypeKind implements Enumerator {
	/**
	 * The '<em><b>Any Simple Type</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANY_SIMPLE_TYPE_VALUE
	 * @generated
	 * @ordered
	 */
	ANY_SIMPLE_TYPE(0, "anySimpleType", "anySimpleType"),

	/**
	 * The '<em><b>Any URI</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANY_URI_VALUE
	 * @generated
	 * @ordered
	 */
	ANY_URI(1, "anyURI", "anyURI"),

	/**
	 * The '<em><b>Base64 Binary</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BASE64_BINARY_VALUE
	 * @generated
	 * @ordered
	 */
	BASE64_BINARY(2, "base64Binary", "base64Binary"),

	/**
	 * The '<em><b>Boolean</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOOLEAN_VALUE
	 * @generated
	 * @ordered
	 */
	BOOLEAN(3, "boolean", "boolean"),

	/**
	 * The '<em><b>Byte</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BYTE_VALUE
	 * @generated
	 * @ordered
	 */
	BYTE(4, "byte", "byte"),

	/**
	 * The '<em><b>Date</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATE_VALUE
	 * @generated
	 * @ordered
	 */
	DATE(5, "date", "date"),

	/**
	 * The '<em><b>Date Time</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATE_TIME_VALUE
	 * @generated
	 * @ordered
	 */
	DATE_TIME(6, "dateTime", "dateTime"),

	/**
	 * The '<em><b>Decimal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DECIMAL_VALUE
	 * @generated
	 * @ordered
	 */
	DECIMAL(7, "decimal", "decimal"),

	/**
	 * The '<em><b>Double</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOUBLE_VALUE
	 * @generated
	 * @ordered
	 */
	DOUBLE(8, "double", "double"),

	/**
	 * The '<em><b>Duration</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DURATION_VALUE
	 * @generated
	 * @ordered
	 */
	DURATION(9, "duration", "duration"),

	/**
	 * The '<em><b>ENTITIES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENTITIES_VALUE
	 * @generated
	 * @ordered
	 */
	ENTITIES(10, "ENTITIES", "ENTITIES"),

	/**
	 * The '<em><b>ENTITY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENTITY_VALUE
	 * @generated
	 * @ordered
	 */
	ENTITY(11, "ENTITY", "ENTITY"),

	/**
	 * The '<em><b>Float</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLOAT_VALUE
	 * @generated
	 * @ordered
	 */
	FLOAT(12, "float", "float"),

	/**
	 * The '<em><b>GDay</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GDAY_VALUE
	 * @generated
	 * @ordered
	 */
	GDAY(13, "gDay", "gDay"),

	/**
	 * The '<em><b>GMonth</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GMONTH_VALUE
	 * @generated
	 * @ordered
	 */
	GMONTH(14, "gMonth", "gMonth"),

	/**
	 * The '<em><b>GMonth Day</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GMONTH_DAY_VALUE
	 * @generated
	 * @ordered
	 */
	GMONTH_DAY(15, "gMonthDay", "gMonthDay"),

	/**
	 * The '<em><b>GYear</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GYEAR_VALUE
	 * @generated
	 * @ordered
	 */
	GYEAR(16, "gYear", "gYear"),

	/**
	 * The '<em><b>GYear Month</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GYEAR_MONTH_VALUE
	 * @generated
	 * @ordered
	 */
	GYEAR_MONTH(17, "gYearMonth", "gYearMonth"),

	/**
	 * The '<em><b>Hex Binary</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEX_BINARY_VALUE
	 * @generated
	 * @ordered
	 */
	HEX_BINARY(18, "hexBinary", "hexBinary"),

	/**
	 * The '<em><b>ID</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ID_VALUE
	 * @generated
	 * @ordered
	 */
	ID(19, "ID", "ID"),

	/**
	 * The '<em><b>IDREF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IDREF_VALUE
	 * @generated
	 * @ordered
	 */
	IDREF(20, "IDREF", "IDREF"),

	/**
	 * The '<em><b>IDREFS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IDREFS_VALUE
	 * @generated
	 * @ordered
	 */
	IDREFS(21, "IDREFS", "IDREFS"),

	/**
	 * The '<em><b>Int</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INT_VALUE
	 * @generated
	 * @ordered
	 */
	INT(22, "int", "int"),

	/**
	 * The '<em><b>Integer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTEGER_VALUE
	 * @generated
	 * @ordered
	 */
	INTEGER(23, "integer", "integer"),

	/**
	 * The '<em><b>Language</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LANGUAGE_VALUE
	 * @generated
	 * @ordered
	 */
	LANGUAGE(24, "language", "language"),

	/**
	 * The '<em><b>Long</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LONG_VALUE
	 * @generated
	 * @ordered
	 */
	LONG(25, "long", "long"),

	/**
	 * The '<em><b>Name</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NAME_VALUE
	 * @generated
	 * @ordered
	 */
	NAME(26, "Name", "Name"),

	/**
	 * The '<em><b>NC Name</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NC_NAME_VALUE
	 * @generated
	 * @ordered
	 */
	NC_NAME(27, "NCName", "NCName"),

	/**
	 * The '<em><b>Negative Integer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEGATIVE_INTEGER_VALUE
	 * @generated
	 * @ordered
	 */
	NEGATIVE_INTEGER(28, "negativeInteger", "negativeInteger"),

	/**
	 * The '<em><b>NMTOKEN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NMTOKEN_VALUE
	 * @generated
	 * @ordered
	 */
	NMTOKEN(29, "NMTOKEN", "NMTOKEN"),

	/**
	 * The '<em><b>NMTOKENS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NMTOKENS_VALUE
	 * @generated
	 * @ordered
	 */
	NMTOKENS(30, "NMTOKENS", "NMTOKENS"),

	/**
	 * The '<em><b>Non Negative Integer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NON_NEGATIVE_INTEGER_VALUE
	 * @generated
	 * @ordered
	 */
	NON_NEGATIVE_INTEGER(31, "nonNegativeInteger", "nonNegativeInteger"),

	/**
	 * The '<em><b>Non Positive Integer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NON_POSITIVE_INTEGER_VALUE
	 * @generated
	 * @ordered
	 */
	NON_POSITIVE_INTEGER(32, "nonPositiveInteger", "nonPositiveInteger"),

	/**
	 * The '<em><b>Normalized String</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NORMALIZED_STRING_VALUE
	 * @generated
	 * @ordered
	 */
	NORMALIZED_STRING(33, "normalizedString", "normalizedString"),

	/**
	 * The '<em><b>Positive Integer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POSITIVE_INTEGER_VALUE
	 * @generated
	 * @ordered
	 */
	POSITIVE_INTEGER(34, "positiveInteger", "positiveInteger"),

	/**
	 * The '<em><b>QName</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QNAME_VALUE
	 * @generated
	 * @ordered
	 */
	QNAME(35, "QName", "QName"),

	/**
	 * The '<em><b>Short</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHORT_VALUE
	 * @generated
	 * @ordered
	 */
	SHORT(36, "short", "short"),

	/**
	 * The '<em><b>String</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING_VALUE
	 * @generated
	 * @ordered
	 */
	STRING(37, "string", "string"),

	/**
	 * The '<em><b>Time</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIME_VALUE
	 * @generated
	 * @ordered
	 */
	TIME(38, "time", "time"),

	/**
	 * The '<em><b>Token</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOKEN_VALUE
	 * @generated
	 * @ordered
	 */
	TOKEN(39, "token", "token"),

	/**
	 * The '<em><b>Unsigned Byte</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNSIGNED_BYTE_VALUE
	 * @generated
	 * @ordered
	 */
	UNSIGNED_BYTE(40, "unsignedByte", "unsignedByte"),

	/**
	 * The '<em><b>Unsigned Int</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNSIGNED_INT_VALUE
	 * @generated
	 * @ordered
	 */
	UNSIGNED_INT(41, "unsignedInt", "unsignedInt"),

	/**
	 * The '<em><b>Unsigned Long</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNSIGNED_LONG_VALUE
	 * @generated
	 * @ordered
	 */
	UNSIGNED_LONG(42, "unsignedLong", "unsignedLong"),

	/**
	 * The '<em><b>Unsigned Short</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNSIGNED_SHORT_VALUE
	 * @generated
	 * @ordered
	 */
	UNSIGNED_SHORT(43, "unsignedShort", "unsignedShort");

	/**
	 * The '<em><b>Any Simple Type</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Any Simple Type</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ANY_SIMPLE_TYPE
	 * @model name="anySimpleType"
	 * @generated
	 * @ordered
	 */
	public static final int ANY_SIMPLE_TYPE_VALUE = 0;

	/**
	 * The '<em><b>Any URI</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Any URI</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ANY_URI
	 * @model name="anyURI"
	 * @generated
	 * @ordered
	 */
	public static final int ANY_URI_VALUE = 1;

	/**
	 * The '<em><b>Base64 Binary</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Base64 Binary</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BASE64_BINARY
	 * @model name="base64Binary"
	 * @generated
	 * @ordered
	 */
	public static final int BASE64_BINARY_VALUE = 2;

	/**
	 * The '<em><b>Boolean</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Boolean</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BOOLEAN
	 * @model name="boolean"
	 * @generated
	 * @ordered
	 */
	public static final int BOOLEAN_VALUE = 3;

	/**
	 * The '<em><b>Byte</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Byte</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BYTE
	 * @model name="byte"
	 * @generated
	 * @ordered
	 */
	public static final int BYTE_VALUE = 4;

	/**
	 * The '<em><b>Date</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Date</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DATE
	 * @model name="date"
	 * @generated
	 * @ordered
	 */
	public static final int DATE_VALUE = 5;

	/**
	 * The '<em><b>Date Time</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Date Time</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DATE_TIME
	 * @model name="dateTime"
	 * @generated
	 * @ordered
	 */
	public static final int DATE_TIME_VALUE = 6;

	/**
	 * The '<em><b>Decimal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Decimal</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DECIMAL
	 * @model name="decimal"
	 * @generated
	 * @ordered
	 */
	public static final int DECIMAL_VALUE = 7;

	/**
	 * The '<em><b>Double</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Double</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DOUBLE
	 * @model name="double"
	 * @generated
	 * @ordered
	 */
	public static final int DOUBLE_VALUE = 8;

	/**
	 * The '<em><b>Duration</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Duration</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DURATION
	 * @model name="duration"
	 * @generated
	 * @ordered
	 */
	public static final int DURATION_VALUE = 9;

	/**
	 * The '<em><b>ENTITIES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ENTITIES</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENTITIES
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ENTITIES_VALUE = 10;

	/**
	 * The '<em><b>ENTITY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ENTITY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENTITY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ENTITY_VALUE = 11;

	/**
	 * The '<em><b>Float</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Float</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FLOAT
	 * @model name="float"
	 * @generated
	 * @ordered
	 */
	public static final int FLOAT_VALUE = 12;

	/**
	 * The '<em><b>GDay</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GDay</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GDAY
	 * @model name="gDay"
	 * @generated
	 * @ordered
	 */
	public static final int GDAY_VALUE = 13;

	/**
	 * The '<em><b>GMonth</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GMonth</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GMONTH
	 * @model name="gMonth"
	 * @generated
	 * @ordered
	 */
	public static final int GMONTH_VALUE = 14;

	/**
	 * The '<em><b>GMonth Day</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GMonth Day</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GMONTH_DAY
	 * @model name="gMonthDay"
	 * @generated
	 * @ordered
	 */
	public static final int GMONTH_DAY_VALUE = 15;

	/**
	 * The '<em><b>GYear</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GYear</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GYEAR
	 * @model name="gYear"
	 * @generated
	 * @ordered
	 */
	public static final int GYEAR_VALUE = 16;

	/**
	 * The '<em><b>GYear Month</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GYear Month</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GYEAR_MONTH
	 * @model name="gYearMonth"
	 * @generated
	 * @ordered
	 */
	public static final int GYEAR_MONTH_VALUE = 17;

	/**
	 * The '<em><b>Hex Binary</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Hex Binary</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HEX_BINARY
	 * @model name="hexBinary"
	 * @generated
	 * @ordered
	 */
	public static final int HEX_BINARY_VALUE = 18;

	/**
	 * The '<em><b>ID</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ID</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ID
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ID_VALUE = 19;

	/**
	 * The '<em><b>IDREF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IDREF</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IDREF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IDREF_VALUE = 20;

	/**
	 * The '<em><b>IDREFS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IDREFS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IDREFS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IDREFS_VALUE = 21;

	/**
	 * The '<em><b>Int</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Int</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INT
	 * @model name="int"
	 * @generated
	 * @ordered
	 */
	public static final int INT_VALUE = 22;

	/**
	 * The '<em><b>Integer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Integer</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INTEGER
	 * @model name="integer"
	 * @generated
	 * @ordered
	 */
	public static final int INTEGER_VALUE = 23;

	/**
	 * The '<em><b>Language</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Language</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LANGUAGE
	 * @model name="language"
	 * @generated
	 * @ordered
	 */
	public static final int LANGUAGE_VALUE = 24;

	/**
	 * The '<em><b>Long</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Long</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LONG
	 * @model name="long"
	 * @generated
	 * @ordered
	 */
	public static final int LONG_VALUE = 25;

	/**
	 * The '<em><b>Name</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Name</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NAME
	 * @model name="Name"
	 * @generated
	 * @ordered
	 */
	public static final int NAME_VALUE = 26;

	/**
	 * The '<em><b>NC Name</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NC Name</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NC_NAME
	 * @model name="NCName"
	 * @generated
	 * @ordered
	 */
	public static final int NC_NAME_VALUE = 27;

	/**
	 * The '<em><b>Negative Integer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Negative Integer</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NEGATIVE_INTEGER
	 * @model name="negativeInteger"
	 * @generated
	 * @ordered
	 */
	public static final int NEGATIVE_INTEGER_VALUE = 28;

	/**
	 * The '<em><b>NMTOKEN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NMTOKEN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NMTOKEN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NMTOKEN_VALUE = 29;

	/**
	 * The '<em><b>NMTOKENS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NMTOKENS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NMTOKENS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NMTOKENS_VALUE = 30;

	/**
	 * The '<em><b>Non Negative Integer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Non Negative Integer</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NON_NEGATIVE_INTEGER
	 * @model name="nonNegativeInteger"
	 * @generated
	 * @ordered
	 */
	public static final int NON_NEGATIVE_INTEGER_VALUE = 31;

	/**
	 * The '<em><b>Non Positive Integer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Non Positive Integer</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NON_POSITIVE_INTEGER
	 * @model name="nonPositiveInteger"
	 * @generated
	 * @ordered
	 */
	public static final int NON_POSITIVE_INTEGER_VALUE = 32;

	/**
	 * The '<em><b>Normalized String</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Normalized String</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NORMALIZED_STRING
	 * @model name="normalizedString"
	 * @generated
	 * @ordered
	 */
	public static final int NORMALIZED_STRING_VALUE = 33;

	/**
	 * The '<em><b>Positive Integer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Positive Integer</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POSITIVE_INTEGER
	 * @model name="positiveInteger"
	 * @generated
	 * @ordered
	 */
	public static final int POSITIVE_INTEGER_VALUE = 34;

	/**
	 * The '<em><b>QName</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>QName</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #QNAME
	 * @model name="QName"
	 * @generated
	 * @ordered
	 */
	public static final int QNAME_VALUE = 35;

	/**
	 * The '<em><b>Short</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Short</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SHORT
	 * @model name="short"
	 * @generated
	 * @ordered
	 */
	public static final int SHORT_VALUE = 36;

	/**
	 * The '<em><b>String</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>String</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STRING
	 * @model name="string"
	 * @generated
	 * @ordered
	 */
	public static final int STRING_VALUE = 37;

	/**
	 * The '<em><b>Time</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Time</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TIME
	 * @model name="time"
	 * @generated
	 * @ordered
	 */
	public static final int TIME_VALUE = 38;

	/**
	 * The '<em><b>Token</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Token</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TOKEN
	 * @model name="token"
	 * @generated
	 * @ordered
	 */
	public static final int TOKEN_VALUE = 39;

	/**
	 * The '<em><b>Unsigned Byte</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Unsigned Byte</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNSIGNED_BYTE
	 * @model name="unsignedByte"
	 * @generated
	 * @ordered
	 */
	public static final int UNSIGNED_BYTE_VALUE = 40;

	/**
	 * The '<em><b>Unsigned Int</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Unsigned Int</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNSIGNED_INT
	 * @model name="unsignedInt"
	 * @generated
	 * @ordered
	 */
	public static final int UNSIGNED_INT_VALUE = 41;

	/**
	 * The '<em><b>Unsigned Long</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Unsigned Long</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNSIGNED_LONG
	 * @model name="unsignedLong"
	 * @generated
	 * @ordered
	 */
	public static final int UNSIGNED_LONG_VALUE = 42;

	/**
	 * The '<em><b>Unsigned Short</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Unsigned Short</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNSIGNED_SHORT
	 * @model name="unsignedShort"
	 * @generated
	 * @ordered
	 */
	public static final int UNSIGNED_SHORT_VALUE = 43;

	/**
	 * An array of all the '<em><b>Schema Type Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SchemaTypeKind[] VALUES_ARRAY =
		new SchemaTypeKind[] {
			ANY_SIMPLE_TYPE,
			ANY_URI,
			BASE64_BINARY,
			BOOLEAN,
			BYTE,
			DATE,
			DATE_TIME,
			DECIMAL,
			DOUBLE,
			DURATION,
			ENTITIES,
			ENTITY,
			FLOAT,
			GDAY,
			GMONTH,
			GMONTH_DAY,
			GYEAR,
			GYEAR_MONTH,
			HEX_BINARY,
			ID,
			IDREF,
			IDREFS,
			INT,
			INTEGER,
			LANGUAGE,
			LONG,
			NAME,
			NC_NAME,
			NEGATIVE_INTEGER,
			NMTOKEN,
			NMTOKENS,
			NON_NEGATIVE_INTEGER,
			NON_POSITIVE_INTEGER,
			NORMALIZED_STRING,
			POSITIVE_INTEGER,
			QNAME,
			SHORT,
			STRING,
			TIME,
			TOKEN,
			UNSIGNED_BYTE,
			UNSIGNED_INT,
			UNSIGNED_LONG,
			UNSIGNED_SHORT,
		};

	/**
	 * A public read-only list of all the '<em><b>Schema Type Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SchemaTypeKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Schema Type Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SchemaTypeKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SchemaTypeKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Schema Type Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SchemaTypeKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SchemaTypeKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Schema Type Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SchemaTypeKind get(int value) {
		switch (value) {
			case ANY_SIMPLE_TYPE_VALUE: return ANY_SIMPLE_TYPE;
			case ANY_URI_VALUE: return ANY_URI;
			case BASE64_BINARY_VALUE: return BASE64_BINARY;
			case BOOLEAN_VALUE: return BOOLEAN;
			case BYTE_VALUE: return BYTE;
			case DATE_VALUE: return DATE;
			case DATE_TIME_VALUE: return DATE_TIME;
			case DECIMAL_VALUE: return DECIMAL;
			case DOUBLE_VALUE: return DOUBLE;
			case DURATION_VALUE: return DURATION;
			case ENTITIES_VALUE: return ENTITIES;
			case ENTITY_VALUE: return ENTITY;
			case FLOAT_VALUE: return FLOAT;
			case GDAY_VALUE: return GDAY;
			case GMONTH_VALUE: return GMONTH;
			case GMONTH_DAY_VALUE: return GMONTH_DAY;
			case GYEAR_VALUE: return GYEAR;
			case GYEAR_MONTH_VALUE: return GYEAR_MONTH;
			case HEX_BINARY_VALUE: return HEX_BINARY;
			case ID_VALUE: return ID;
			case IDREF_VALUE: return IDREF;
			case IDREFS_VALUE: return IDREFS;
			case INT_VALUE: return INT;
			case INTEGER_VALUE: return INTEGER;
			case LANGUAGE_VALUE: return LANGUAGE;
			case LONG_VALUE: return LONG;
			case NAME_VALUE: return NAME;
			case NC_NAME_VALUE: return NC_NAME;
			case NEGATIVE_INTEGER_VALUE: return NEGATIVE_INTEGER;
			case NMTOKEN_VALUE: return NMTOKEN;
			case NMTOKENS_VALUE: return NMTOKENS;
			case NON_NEGATIVE_INTEGER_VALUE: return NON_NEGATIVE_INTEGER;
			case NON_POSITIVE_INTEGER_VALUE: return NON_POSITIVE_INTEGER;
			case NORMALIZED_STRING_VALUE: return NORMALIZED_STRING;
			case POSITIVE_INTEGER_VALUE: return POSITIVE_INTEGER;
			case QNAME_VALUE: return QNAME;
			case SHORT_VALUE: return SHORT;
			case STRING_VALUE: return STRING;
			case TIME_VALUE: return TIME;
			case TOKEN_VALUE: return TOKEN;
			case UNSIGNED_BYTE_VALUE: return UNSIGNED_BYTE;
			case UNSIGNED_INT_VALUE: return UNSIGNED_INT;
			case UNSIGNED_LONG_VALUE: return UNSIGNED_LONG;
			case UNSIGNED_SHORT_VALUE: return UNSIGNED_SHORT;
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
	private SchemaTypeKind(int value, String name, String literal) {
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
	
} //SchemaTypeKind
