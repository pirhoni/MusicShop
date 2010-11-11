
package ch.hslu.enapp.salesorder;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Reserve.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Reserve">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Never"/>
 *     &lt;enumeration value="Optional"/>
 *     &lt;enumeration value="Always"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Reserve")
@XmlEnum
public enum Reserve {

    @XmlEnumValue("Never")
    NEVER("Never"),
    @XmlEnumValue("Optional")
    OPTIONAL("Optional"),
    @XmlEnumValue("Always")
    ALWAYS("Always");
    private final String value;

    Reserve(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Reserve fromValue(String v) {
        for (Reserve c: Reserve.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
