
package ch.hslu.enapp.salesorder;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Flushing_Method.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Flushing_Method">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Manual"/>
 *     &lt;enumeration value="Forward"/>
 *     &lt;enumeration value="Backward"/>
 *     &lt;enumeration value="Pick__x002B__Forward"/>
 *     &lt;enumeration value="Pick__x002B__Backward"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Flushing_Method")
@XmlEnum
public enum FlushingMethod {

    @XmlEnumValue("Manual")
    MANUAL("Manual"),
    @XmlEnumValue("Forward")
    FORWARD("Forward"),
    @XmlEnumValue("Backward")
    BACKWARD("Backward"),
    @XmlEnumValue("Pick__x002B__Forward")
    PICK_X_002_B_FORWARD("Pick__x002B__Forward"),
    @XmlEnumValue("Pick__x002B__Backward")
    PICK_X_002_B_BACKWARD("Pick__x002B__Backward");
    private final String value;

    FlushingMethod(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FlushingMethod fromValue(String v) {
        for (FlushingMethod c: FlushingMethod.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
