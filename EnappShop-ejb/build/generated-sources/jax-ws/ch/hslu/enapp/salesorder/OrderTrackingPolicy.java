
package ch.hslu.enapp.salesorder;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Order_Tracking_Policy.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Order_Tracking_Policy">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Tracking_Only"/>
 *     &lt;enumeration value="Tracking__x0026__Action_Msg"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Order_Tracking_Policy")
@XmlEnum
public enum OrderTrackingPolicy {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Tracking_Only")
    TRACKING_ONLY("Tracking_Only"),
    @XmlEnumValue("Tracking__x0026__Action_Msg")
    TRACKING_X_0026_ACTION_MSG("Tracking__x0026__Action_Msg");
    private final String value;

    OrderTrackingPolicy(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OrderTrackingPolicy fromValue(String v) {
        for (OrderTrackingPolicy c: OrderTrackingPolicy.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
