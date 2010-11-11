
package ch.hslu.enapp.salesorder;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Price_Profit_Calculation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Price_Profit_Calculation">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Profit_x003D_Price_Cost"/>
 *     &lt;enumeration value="Price_x003D_Cost_x002B_Profit"/>
 *     &lt;enumeration value="No_Relationship"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Price_Profit_Calculation")
@XmlEnum
public enum PriceProfitCalculation {

    @XmlEnumValue("Profit_x003D_Price_Cost")
    PROFIT_X_003_D_PRICE_COST("Profit_x003D_Price_Cost"),
    @XmlEnumValue("Price_x003D_Cost_x002B_Profit")
    PRICE_X_003_D_COST_X_002_B_PROFIT("Price_x003D_Cost_x002B_Profit"),
    @XmlEnumValue("No_Relationship")
    NO_RELATIONSHIP("No_Relationship");
    private final String value;

    PriceProfitCalculation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PriceProfitCalculation fromValue(String v) {
        for (PriceProfitCalculation c: PriceProfitCalculation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
