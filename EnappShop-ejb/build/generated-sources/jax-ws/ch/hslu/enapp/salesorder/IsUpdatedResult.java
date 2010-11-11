
package ch.hslu.enapp.salesorder;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IsUpdated_Result" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "isUpdatedResult"
})
@XmlRootElement(name = "IsUpdated_Result")
public class IsUpdatedResult {

    @XmlElement(name = "IsUpdated_Result")
    protected boolean isUpdatedResult;

    /**
     * Gets the value of the isUpdatedResult property.
     * 
     */
    public boolean isIsUpdatedResult() {
        return isUpdatedResult;
    }

    /**
     * Sets the value of the isUpdatedResult property.
     * 
     */
    public void setIsUpdatedResult(boolean value) {
        this.isUpdatedResult = value;
    }

}
