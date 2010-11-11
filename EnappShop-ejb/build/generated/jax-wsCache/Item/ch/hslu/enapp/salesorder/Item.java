
package ch.hslu.enapp.salesorder;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Item complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Item">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="No" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Owner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Kind" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Mediafile_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Manufacturer_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Base_Unit_of_Measure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Bill_of_Materials" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Shelf_No" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Automatic_Ext_Texts" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Created_From_Nonstock_Item" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Item_Category_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Product_Group_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Last_Date_Modified" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Search_Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Inventory" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Qty_on_Purch_Order" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Qty_on_Prod_Order" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Qty_on_Component_Lines" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Qty_on_Sales_Order" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Qty_on_Service_Order" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Service_Item_Group" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Blocked" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="No_Stockkeeping" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Costing_Method" type="{urn:microsoft-dynamics-schemas/page/item}Costing_Method" minOccurs="0"/>
 *         &lt;element name="Cost_is_Adjusted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Cost_is_Posted_to_G_L" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Standard_Cost" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Unit_Cost" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Overhead_Rate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Indirect_Cost_Percent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Last_Direct_Cost" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Price_Profit_Calculation" type="{urn:microsoft-dynamics-schemas/page/item}Price_Profit_Calculation" minOccurs="0"/>
 *         &lt;element name="Profit_Percent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Unit_Price" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Gen_Prod_Posting_Group" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VAT_Prod_Posting_Group" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Inventory_Posting_Group" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Net_Invoiced_Qty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Allow_Invoice_Disc" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Item_Disc_Group" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sales_Unit_of_Measure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sale_blocked" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Replenishment_System" type="{urn:microsoft-dynamics-schemas/page/item}Replenishment_System" minOccurs="0"/>
 *         &lt;element name="Vendor_No" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Vendor_Item_No" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Purch_Unit_of_Measure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Lead_Time_Calculation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Manufacturing_Policy" type="{urn:microsoft-dynamics-schemas/page/item}Manufacturing_Policy" minOccurs="0"/>
 *         &lt;element name="Routing_No" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Production_BOM_No" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Rounding_Precision" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Flushing_Method" type="{urn:microsoft-dynamics-schemas/page/item}Flushing_Method" minOccurs="0"/>
 *         &lt;element name="Scrap_Percent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Lot_Size" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Purchase_blocked" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Reordering_Policy" type="{urn:microsoft-dynamics-schemas/page/item}Reordering_Policy" minOccurs="0"/>
 *         &lt;element name="Include_Inventory" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Reserve" type="{urn:microsoft-dynamics-schemas/page/item}Reserve" minOccurs="0"/>
 *         &lt;element name="Order_Tracking_Policy" type="{urn:microsoft-dynamics-schemas/page/item}Order_Tracking_Policy" minOccurs="0"/>
 *         &lt;element name="Stockkeeping_Unit_Exists" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Critical" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Reorder_Cycle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Safety_Lead_Time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Safety_Stock_Quantity" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Reorder_Point" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Reorder_Quantity" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Maximum_Inventory" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Minimum_Order_Quantity" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Maximum_Order_Quantity" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Order_Multiple" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Tariff_No" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Country_Region_of_Origin_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Net_Weight" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Gross_Weight" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Item_Tracking_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Serial_Nos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Lot_Nos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Expiration_Calculation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Common_Item_No" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Special_Equipment_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Put_away_Template_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Put_away_Unit_of_Measure_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Phys_Invt_Counting_Period_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Last_Phys_Invt_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Last_Counting_Period_Update" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Next_Counting_Period" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Identifier_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Use_Cross_Docking" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Item", propOrder = {
    "key",
    "no",
    "description",
    "owner",
    "kind",
    "mediafileName",
    "manufacturerCode",
    "baseUnitOfMeasure",
    "billOfMaterials",
    "shelfNo",
    "automaticExtTexts",
    "createdFromNonstockItem",
    "itemCategoryCode",
    "productGroupCode",
    "lastDateModified",
    "searchDescription",
    "inventory",
    "qtyOnPurchOrder",
    "qtyOnProdOrder",
    "qtyOnComponentLines",
    "qtyOnSalesOrder",
    "qtyOnServiceOrder",
    "serviceItemGroup",
    "blocked",
    "noStockkeeping",
    "costingMethod",
    "costIsAdjusted",
    "costIsPostedToGL",
    "standardCost",
    "unitCost",
    "overheadRate",
    "indirectCostPercent",
    "lastDirectCost",
    "priceProfitCalculation",
    "profitPercent",
    "unitPrice",
    "genProdPostingGroup",
    "vatProdPostingGroup",
    "inventoryPostingGroup",
    "netInvoicedQty",
    "allowInvoiceDisc",
    "itemDiscGroup",
    "salesUnitOfMeasure",
    "saleBlocked",
    "replenishmentSystem",
    "vendorNo",
    "vendorItemNo",
    "purchUnitOfMeasure",
    "leadTimeCalculation",
    "manufacturingPolicy",
    "routingNo",
    "productionBOMNo",
    "roundingPrecision",
    "flushingMethod",
    "scrapPercent",
    "lotSize",
    "purchaseBlocked",
    "reorderingPolicy",
    "includeInventory",
    "reserve",
    "orderTrackingPolicy",
    "stockkeepingUnitExists",
    "critical",
    "reorderCycle",
    "safetyLeadTime",
    "safetyStockQuantity",
    "reorderPoint",
    "reorderQuantity",
    "maximumInventory",
    "minimumOrderQuantity",
    "maximumOrderQuantity",
    "orderMultiple",
    "tariffNo",
    "countryRegionOfOriginCode",
    "netWeight",
    "grossWeight",
    "itemTrackingCode",
    "serialNos",
    "lotNos",
    "expirationCalculation",
    "commonItemNo",
    "specialEquipmentCode",
    "putAwayTemplateCode",
    "putAwayUnitOfMeasureCode",
    "physInvtCountingPeriodCode",
    "lastPhysInvtDate",
    "lastCountingPeriodUpdate",
    "nextCountingPeriod",
    "identifierCode",
    "useCrossDocking"
})
public class Item {

    @XmlElement(name = "Key")
    protected String key;
    @XmlElement(name = "No")
    protected String no;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Owner")
    protected String owner;
    @XmlElement(name = "Kind")
    protected String kind;
    @XmlElement(name = "Mediafile_Name")
    protected String mediafileName;
    @XmlElement(name = "Manufacturer_Code")
    protected String manufacturerCode;
    @XmlElement(name = "Base_Unit_of_Measure")
    protected String baseUnitOfMeasure;
    @XmlElement(name = "Bill_of_Materials")
    protected Boolean billOfMaterials;
    @XmlElement(name = "Shelf_No")
    protected String shelfNo;
    @XmlElement(name = "Automatic_Ext_Texts")
    protected Boolean automaticExtTexts;
    @XmlElement(name = "Created_From_Nonstock_Item")
    protected Boolean createdFromNonstockItem;
    @XmlElement(name = "Item_Category_Code")
    protected String itemCategoryCode;
    @XmlElement(name = "Product_Group_Code")
    protected String productGroupCode;
    @XmlElement(name = "Last_Date_Modified")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastDateModified;
    @XmlElement(name = "Search_Description")
    protected String searchDescription;
    @XmlElement(name = "Inventory")
    protected BigDecimal inventory;
    @XmlElement(name = "Qty_on_Purch_Order")
    protected BigDecimal qtyOnPurchOrder;
    @XmlElement(name = "Qty_on_Prod_Order")
    protected BigDecimal qtyOnProdOrder;
    @XmlElement(name = "Qty_on_Component_Lines")
    protected BigDecimal qtyOnComponentLines;
    @XmlElement(name = "Qty_on_Sales_Order")
    protected BigDecimal qtyOnSalesOrder;
    @XmlElement(name = "Qty_on_Service_Order")
    protected BigDecimal qtyOnServiceOrder;
    @XmlElement(name = "Service_Item_Group")
    protected String serviceItemGroup;
    @XmlElement(name = "Blocked")
    protected Boolean blocked;
    @XmlElement(name = "No_Stockkeeping")
    protected Boolean noStockkeeping;
    @XmlElement(name = "Costing_Method")
    protected CostingMethod costingMethod;
    @XmlElement(name = "Cost_is_Adjusted")
    protected Boolean costIsAdjusted;
    @XmlElement(name = "Cost_is_Posted_to_G_L")
    protected Boolean costIsPostedToGL;
    @XmlElement(name = "Standard_Cost")
    protected BigDecimal standardCost;
    @XmlElement(name = "Unit_Cost")
    protected BigDecimal unitCost;
    @XmlElement(name = "Overhead_Rate")
    protected BigDecimal overheadRate;
    @XmlElement(name = "Indirect_Cost_Percent")
    protected BigDecimal indirectCostPercent;
    @XmlElement(name = "Last_Direct_Cost")
    protected BigDecimal lastDirectCost;
    @XmlElement(name = "Price_Profit_Calculation")
    protected PriceProfitCalculation priceProfitCalculation;
    @XmlElement(name = "Profit_Percent")
    protected BigDecimal profitPercent;
    @XmlElement(name = "Unit_Price")
    protected BigDecimal unitPrice;
    @XmlElement(name = "Gen_Prod_Posting_Group")
    protected String genProdPostingGroup;
    @XmlElement(name = "VAT_Prod_Posting_Group")
    protected String vatProdPostingGroup;
    @XmlElement(name = "Inventory_Posting_Group")
    protected String inventoryPostingGroup;
    @XmlElement(name = "Net_Invoiced_Qty")
    protected BigDecimal netInvoicedQty;
    @XmlElement(name = "Allow_Invoice_Disc")
    protected Boolean allowInvoiceDisc;
    @XmlElement(name = "Item_Disc_Group")
    protected String itemDiscGroup;
    @XmlElement(name = "Sales_Unit_of_Measure")
    protected String salesUnitOfMeasure;
    @XmlElement(name = "Sale_blocked")
    protected Boolean saleBlocked;
    @XmlElement(name = "Replenishment_System")
    protected ReplenishmentSystem replenishmentSystem;
    @XmlElement(name = "Vendor_No")
    protected String vendorNo;
    @XmlElement(name = "Vendor_Item_No")
    protected String vendorItemNo;
    @XmlElement(name = "Purch_Unit_of_Measure")
    protected String purchUnitOfMeasure;
    @XmlElement(name = "Lead_Time_Calculation")
    protected String leadTimeCalculation;
    @XmlElement(name = "Manufacturing_Policy")
    protected ManufacturingPolicy manufacturingPolicy;
    @XmlElement(name = "Routing_No")
    protected String routingNo;
    @XmlElement(name = "Production_BOM_No")
    protected String productionBOMNo;
    @XmlElement(name = "Rounding_Precision")
    protected BigDecimal roundingPrecision;
    @XmlElement(name = "Flushing_Method")
    protected FlushingMethod flushingMethod;
    @XmlElement(name = "Scrap_Percent")
    protected BigDecimal scrapPercent;
    @XmlElement(name = "Lot_Size")
    protected BigDecimal lotSize;
    @XmlElement(name = "Purchase_blocked")
    protected Boolean purchaseBlocked;
    @XmlElement(name = "Reordering_Policy")
    protected ReorderingPolicy reorderingPolicy;
    @XmlElement(name = "Include_Inventory")
    protected Boolean includeInventory;
    @XmlElement(name = "Reserve")
    protected Reserve reserve;
    @XmlElement(name = "Order_Tracking_Policy")
    protected OrderTrackingPolicy orderTrackingPolicy;
    @XmlElement(name = "Stockkeeping_Unit_Exists")
    protected Boolean stockkeepingUnitExists;
    @XmlElement(name = "Critical")
    protected Boolean critical;
    @XmlElement(name = "Reorder_Cycle")
    protected String reorderCycle;
    @XmlElement(name = "Safety_Lead_Time")
    protected String safetyLeadTime;
    @XmlElement(name = "Safety_Stock_Quantity")
    protected BigDecimal safetyStockQuantity;
    @XmlElement(name = "Reorder_Point")
    protected BigDecimal reorderPoint;
    @XmlElement(name = "Reorder_Quantity")
    protected BigDecimal reorderQuantity;
    @XmlElement(name = "Maximum_Inventory")
    protected BigDecimal maximumInventory;
    @XmlElement(name = "Minimum_Order_Quantity")
    protected BigDecimal minimumOrderQuantity;
    @XmlElement(name = "Maximum_Order_Quantity")
    protected BigDecimal maximumOrderQuantity;
    @XmlElement(name = "Order_Multiple")
    protected BigDecimal orderMultiple;
    @XmlElement(name = "Tariff_No")
    protected String tariffNo;
    @XmlElement(name = "Country_Region_of_Origin_Code")
    protected String countryRegionOfOriginCode;
    @XmlElement(name = "Net_Weight")
    protected BigDecimal netWeight;
    @XmlElement(name = "Gross_Weight")
    protected BigDecimal grossWeight;
    @XmlElement(name = "Item_Tracking_Code")
    protected String itemTrackingCode;
    @XmlElement(name = "Serial_Nos")
    protected String serialNos;
    @XmlElement(name = "Lot_Nos")
    protected String lotNos;
    @XmlElement(name = "Expiration_Calculation")
    protected String expirationCalculation;
    @XmlElement(name = "Common_Item_No")
    protected String commonItemNo;
    @XmlElement(name = "Special_Equipment_Code")
    protected String specialEquipmentCode;
    @XmlElement(name = "Put_away_Template_Code")
    protected String putAwayTemplateCode;
    @XmlElement(name = "Put_away_Unit_of_Measure_Code")
    protected String putAwayUnitOfMeasureCode;
    @XmlElement(name = "Phys_Invt_Counting_Period_Code")
    protected String physInvtCountingPeriodCode;
    @XmlElement(name = "Last_Phys_Invt_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastPhysInvtDate;
    @XmlElement(name = "Last_Counting_Period_Update")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastCountingPeriodUpdate;
    @XmlElement(name = "Next_Counting_Period")
    protected String nextCountingPeriod;
    @XmlElement(name = "Identifier_Code")
    protected String identifierCode;
    @XmlElement(name = "Use_Cross_Docking")
    protected Boolean useCrossDocking;

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * Gets the value of the no property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNo() {
        return no;
    }

    /**
     * Sets the value of the no property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNo(String value) {
        this.no = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwner(String value) {
        this.owner = value;
    }

    /**
     * Gets the value of the kind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKind() {
        return kind;
    }

    /**
     * Sets the value of the kind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKind(String value) {
        this.kind = value;
    }

    /**
     * Gets the value of the mediafileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediafileName() {
        return mediafileName;
    }

    /**
     * Sets the value of the mediafileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediafileName(String value) {
        this.mediafileName = value;
    }

    /**
     * Gets the value of the manufacturerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturerCode() {
        return manufacturerCode;
    }

    /**
     * Sets the value of the manufacturerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturerCode(String value) {
        this.manufacturerCode = value;
    }

    /**
     * Gets the value of the baseUnitOfMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseUnitOfMeasure() {
        return baseUnitOfMeasure;
    }

    /**
     * Sets the value of the baseUnitOfMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseUnitOfMeasure(String value) {
        this.baseUnitOfMeasure = value;
    }

    /**
     * Gets the value of the billOfMaterials property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBillOfMaterials() {
        return billOfMaterials;
    }

    /**
     * Sets the value of the billOfMaterials property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBillOfMaterials(Boolean value) {
        this.billOfMaterials = value;
    }

    /**
     * Gets the value of the shelfNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShelfNo() {
        return shelfNo;
    }

    /**
     * Sets the value of the shelfNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShelfNo(String value) {
        this.shelfNo = value;
    }

    /**
     * Gets the value of the automaticExtTexts property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutomaticExtTexts() {
        return automaticExtTexts;
    }

    /**
     * Sets the value of the automaticExtTexts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutomaticExtTexts(Boolean value) {
        this.automaticExtTexts = value;
    }

    /**
     * Gets the value of the createdFromNonstockItem property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCreatedFromNonstockItem() {
        return createdFromNonstockItem;
    }

    /**
     * Sets the value of the createdFromNonstockItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCreatedFromNonstockItem(Boolean value) {
        this.createdFromNonstockItem = value;
    }

    /**
     * Gets the value of the itemCategoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemCategoryCode() {
        return itemCategoryCode;
    }

    /**
     * Sets the value of the itemCategoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemCategoryCode(String value) {
        this.itemCategoryCode = value;
    }

    /**
     * Gets the value of the productGroupCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductGroupCode() {
        return productGroupCode;
    }

    /**
     * Sets the value of the productGroupCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductGroupCode(String value) {
        this.productGroupCode = value;
    }

    /**
     * Gets the value of the lastDateModified property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastDateModified() {
        return lastDateModified;
    }

    /**
     * Sets the value of the lastDateModified property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastDateModified(XMLGregorianCalendar value) {
        this.lastDateModified = value;
    }

    /**
     * Gets the value of the searchDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchDescription() {
        return searchDescription;
    }

    /**
     * Sets the value of the searchDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchDescription(String value) {
        this.searchDescription = value;
    }

    /**
     * Gets the value of the inventory property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInventory() {
        return inventory;
    }

    /**
     * Sets the value of the inventory property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInventory(BigDecimal value) {
        this.inventory = value;
    }

    /**
     * Gets the value of the qtyOnPurchOrder property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQtyOnPurchOrder() {
        return qtyOnPurchOrder;
    }

    /**
     * Sets the value of the qtyOnPurchOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQtyOnPurchOrder(BigDecimal value) {
        this.qtyOnPurchOrder = value;
    }

    /**
     * Gets the value of the qtyOnProdOrder property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQtyOnProdOrder() {
        return qtyOnProdOrder;
    }

    /**
     * Sets the value of the qtyOnProdOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQtyOnProdOrder(BigDecimal value) {
        this.qtyOnProdOrder = value;
    }

    /**
     * Gets the value of the qtyOnComponentLines property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQtyOnComponentLines() {
        return qtyOnComponentLines;
    }

    /**
     * Sets the value of the qtyOnComponentLines property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQtyOnComponentLines(BigDecimal value) {
        this.qtyOnComponentLines = value;
    }

    /**
     * Gets the value of the qtyOnSalesOrder property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQtyOnSalesOrder() {
        return qtyOnSalesOrder;
    }

    /**
     * Sets the value of the qtyOnSalesOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQtyOnSalesOrder(BigDecimal value) {
        this.qtyOnSalesOrder = value;
    }

    /**
     * Gets the value of the qtyOnServiceOrder property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQtyOnServiceOrder() {
        return qtyOnServiceOrder;
    }

    /**
     * Sets the value of the qtyOnServiceOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQtyOnServiceOrder(BigDecimal value) {
        this.qtyOnServiceOrder = value;
    }

    /**
     * Gets the value of the serviceItemGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceItemGroup() {
        return serviceItemGroup;
    }

    /**
     * Sets the value of the serviceItemGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceItemGroup(String value) {
        this.serviceItemGroup = value;
    }

    /**
     * Gets the value of the blocked property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBlocked() {
        return blocked;
    }

    /**
     * Sets the value of the blocked property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBlocked(Boolean value) {
        this.blocked = value;
    }

    /**
     * Gets the value of the noStockkeeping property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNoStockkeeping() {
        return noStockkeeping;
    }

    /**
     * Sets the value of the noStockkeeping property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNoStockkeeping(Boolean value) {
        this.noStockkeeping = value;
    }

    /**
     * Gets the value of the costingMethod property.
     * 
     * @return
     *     possible object is
     *     {@link CostingMethod }
     *     
     */
    public CostingMethod getCostingMethod() {
        return costingMethod;
    }

    /**
     * Sets the value of the costingMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link CostingMethod }
     *     
     */
    public void setCostingMethod(CostingMethod value) {
        this.costingMethod = value;
    }

    /**
     * Gets the value of the costIsAdjusted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCostIsAdjusted() {
        return costIsAdjusted;
    }

    /**
     * Sets the value of the costIsAdjusted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCostIsAdjusted(Boolean value) {
        this.costIsAdjusted = value;
    }

    /**
     * Gets the value of the costIsPostedToGL property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCostIsPostedToGL() {
        return costIsPostedToGL;
    }

    /**
     * Sets the value of the costIsPostedToGL property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCostIsPostedToGL(Boolean value) {
        this.costIsPostedToGL = value;
    }

    /**
     * Gets the value of the standardCost property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStandardCost() {
        return standardCost;
    }

    /**
     * Sets the value of the standardCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setStandardCost(BigDecimal value) {
        this.standardCost = value;
    }

    /**
     * Gets the value of the unitCost property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUnitCost() {
        return unitCost;
    }

    /**
     * Sets the value of the unitCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUnitCost(BigDecimal value) {
        this.unitCost = value;
    }

    /**
     * Gets the value of the overheadRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOverheadRate() {
        return overheadRate;
    }

    /**
     * Sets the value of the overheadRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOverheadRate(BigDecimal value) {
        this.overheadRate = value;
    }

    /**
     * Gets the value of the indirectCostPercent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIndirectCostPercent() {
        return indirectCostPercent;
    }

    /**
     * Sets the value of the indirectCostPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIndirectCostPercent(BigDecimal value) {
        this.indirectCostPercent = value;
    }

    /**
     * Gets the value of the lastDirectCost property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLastDirectCost() {
        return lastDirectCost;
    }

    /**
     * Sets the value of the lastDirectCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLastDirectCost(BigDecimal value) {
        this.lastDirectCost = value;
    }

    /**
     * Gets the value of the priceProfitCalculation property.
     * 
     * @return
     *     possible object is
     *     {@link PriceProfitCalculation }
     *     
     */
    public PriceProfitCalculation getPriceProfitCalculation() {
        return priceProfitCalculation;
    }

    /**
     * Sets the value of the priceProfitCalculation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceProfitCalculation }
     *     
     */
    public void setPriceProfitCalculation(PriceProfitCalculation value) {
        this.priceProfitCalculation = value;
    }

    /**
     * Gets the value of the profitPercent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getProfitPercent() {
        return profitPercent;
    }

    /**
     * Sets the value of the profitPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setProfitPercent(BigDecimal value) {
        this.profitPercent = value;
    }

    /**
     * Gets the value of the unitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    /**
     * Sets the value of the unitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUnitPrice(BigDecimal value) {
        this.unitPrice = value;
    }

    /**
     * Gets the value of the genProdPostingGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenProdPostingGroup() {
        return genProdPostingGroup;
    }

    /**
     * Sets the value of the genProdPostingGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenProdPostingGroup(String value) {
        this.genProdPostingGroup = value;
    }

    /**
     * Gets the value of the vatProdPostingGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVATProdPostingGroup() {
        return vatProdPostingGroup;
    }

    /**
     * Sets the value of the vatProdPostingGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVATProdPostingGroup(String value) {
        this.vatProdPostingGroup = value;
    }

    /**
     * Gets the value of the inventoryPostingGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInventoryPostingGroup() {
        return inventoryPostingGroup;
    }

    /**
     * Sets the value of the inventoryPostingGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInventoryPostingGroup(String value) {
        this.inventoryPostingGroup = value;
    }

    /**
     * Gets the value of the netInvoicedQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNetInvoicedQty() {
        return netInvoicedQty;
    }

    /**
     * Sets the value of the netInvoicedQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNetInvoicedQty(BigDecimal value) {
        this.netInvoicedQty = value;
    }

    /**
     * Gets the value of the allowInvoiceDisc property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowInvoiceDisc() {
        return allowInvoiceDisc;
    }

    /**
     * Sets the value of the allowInvoiceDisc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowInvoiceDisc(Boolean value) {
        this.allowInvoiceDisc = value;
    }

    /**
     * Gets the value of the itemDiscGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemDiscGroup() {
        return itemDiscGroup;
    }

    /**
     * Sets the value of the itemDiscGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemDiscGroup(String value) {
        this.itemDiscGroup = value;
    }

    /**
     * Gets the value of the salesUnitOfMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesUnitOfMeasure() {
        return salesUnitOfMeasure;
    }

    /**
     * Sets the value of the salesUnitOfMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesUnitOfMeasure(String value) {
        this.salesUnitOfMeasure = value;
    }

    /**
     * Gets the value of the saleBlocked property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSaleBlocked() {
        return saleBlocked;
    }

    /**
     * Sets the value of the saleBlocked property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSaleBlocked(Boolean value) {
        this.saleBlocked = value;
    }

    /**
     * Gets the value of the replenishmentSystem property.
     * 
     * @return
     *     possible object is
     *     {@link ReplenishmentSystem }
     *     
     */
    public ReplenishmentSystem getReplenishmentSystem() {
        return replenishmentSystem;
    }

    /**
     * Sets the value of the replenishmentSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReplenishmentSystem }
     *     
     */
    public void setReplenishmentSystem(ReplenishmentSystem value) {
        this.replenishmentSystem = value;
    }

    /**
     * Gets the value of the vendorNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorNo() {
        return vendorNo;
    }

    /**
     * Sets the value of the vendorNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorNo(String value) {
        this.vendorNo = value;
    }

    /**
     * Gets the value of the vendorItemNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorItemNo() {
        return vendorItemNo;
    }

    /**
     * Sets the value of the vendorItemNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorItemNo(String value) {
        this.vendorItemNo = value;
    }

    /**
     * Gets the value of the purchUnitOfMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchUnitOfMeasure() {
        return purchUnitOfMeasure;
    }

    /**
     * Sets the value of the purchUnitOfMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchUnitOfMeasure(String value) {
        this.purchUnitOfMeasure = value;
    }

    /**
     * Gets the value of the leadTimeCalculation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeadTimeCalculation() {
        return leadTimeCalculation;
    }

    /**
     * Sets the value of the leadTimeCalculation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeadTimeCalculation(String value) {
        this.leadTimeCalculation = value;
    }

    /**
     * Gets the value of the manufacturingPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link ManufacturingPolicy }
     *     
     */
    public ManufacturingPolicy getManufacturingPolicy() {
        return manufacturingPolicy;
    }

    /**
     * Sets the value of the manufacturingPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManufacturingPolicy }
     *     
     */
    public void setManufacturingPolicy(ManufacturingPolicy value) {
        this.manufacturingPolicy = value;
    }

    /**
     * Gets the value of the routingNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoutingNo() {
        return routingNo;
    }

    /**
     * Sets the value of the routingNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoutingNo(String value) {
        this.routingNo = value;
    }

    /**
     * Gets the value of the productionBOMNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductionBOMNo() {
        return productionBOMNo;
    }

    /**
     * Sets the value of the productionBOMNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductionBOMNo(String value) {
        this.productionBOMNo = value;
    }

    /**
     * Gets the value of the roundingPrecision property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRoundingPrecision() {
        return roundingPrecision;
    }

    /**
     * Sets the value of the roundingPrecision property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRoundingPrecision(BigDecimal value) {
        this.roundingPrecision = value;
    }

    /**
     * Gets the value of the flushingMethod property.
     * 
     * @return
     *     possible object is
     *     {@link FlushingMethod }
     *     
     */
    public FlushingMethod getFlushingMethod() {
        return flushingMethod;
    }

    /**
     * Sets the value of the flushingMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlushingMethod }
     *     
     */
    public void setFlushingMethod(FlushingMethod value) {
        this.flushingMethod = value;
    }

    /**
     * Gets the value of the scrapPercent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getScrapPercent() {
        return scrapPercent;
    }

    /**
     * Sets the value of the scrapPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setScrapPercent(BigDecimal value) {
        this.scrapPercent = value;
    }

    /**
     * Gets the value of the lotSize property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLotSize() {
        return lotSize;
    }

    /**
     * Sets the value of the lotSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLotSize(BigDecimal value) {
        this.lotSize = value;
    }

    /**
     * Gets the value of the purchaseBlocked property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPurchaseBlocked() {
        return purchaseBlocked;
    }

    /**
     * Sets the value of the purchaseBlocked property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPurchaseBlocked(Boolean value) {
        this.purchaseBlocked = value;
    }

    /**
     * Gets the value of the reorderingPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link ReorderingPolicy }
     *     
     */
    public ReorderingPolicy getReorderingPolicy() {
        return reorderingPolicy;
    }

    /**
     * Sets the value of the reorderingPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReorderingPolicy }
     *     
     */
    public void setReorderingPolicy(ReorderingPolicy value) {
        this.reorderingPolicy = value;
    }

    /**
     * Gets the value of the includeInventory property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeInventory() {
        return includeInventory;
    }

    /**
     * Sets the value of the includeInventory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeInventory(Boolean value) {
        this.includeInventory = value;
    }

    /**
     * Gets the value of the reserve property.
     * 
     * @return
     *     possible object is
     *     {@link Reserve }
     *     
     */
    public Reserve getReserve() {
        return reserve;
    }

    /**
     * Sets the value of the reserve property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reserve }
     *     
     */
    public void setReserve(Reserve value) {
        this.reserve = value;
    }

    /**
     * Gets the value of the orderTrackingPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link OrderTrackingPolicy }
     *     
     */
    public OrderTrackingPolicy getOrderTrackingPolicy() {
        return orderTrackingPolicy;
    }

    /**
     * Sets the value of the orderTrackingPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderTrackingPolicy }
     *     
     */
    public void setOrderTrackingPolicy(OrderTrackingPolicy value) {
        this.orderTrackingPolicy = value;
    }

    /**
     * Gets the value of the stockkeepingUnitExists property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStockkeepingUnitExists() {
        return stockkeepingUnitExists;
    }

    /**
     * Sets the value of the stockkeepingUnitExists property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStockkeepingUnitExists(Boolean value) {
        this.stockkeepingUnitExists = value;
    }

    /**
     * Gets the value of the critical property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCritical() {
        return critical;
    }

    /**
     * Sets the value of the critical property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCritical(Boolean value) {
        this.critical = value;
    }

    /**
     * Gets the value of the reorderCycle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReorderCycle() {
        return reorderCycle;
    }

    /**
     * Sets the value of the reorderCycle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReorderCycle(String value) {
        this.reorderCycle = value;
    }

    /**
     * Gets the value of the safetyLeadTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSafetyLeadTime() {
        return safetyLeadTime;
    }

    /**
     * Sets the value of the safetyLeadTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSafetyLeadTime(String value) {
        this.safetyLeadTime = value;
    }

    /**
     * Gets the value of the safetyStockQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSafetyStockQuantity() {
        return safetyStockQuantity;
    }

    /**
     * Sets the value of the safetyStockQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSafetyStockQuantity(BigDecimal value) {
        this.safetyStockQuantity = value;
    }

    /**
     * Gets the value of the reorderPoint property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReorderPoint() {
        return reorderPoint;
    }

    /**
     * Sets the value of the reorderPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReorderPoint(BigDecimal value) {
        this.reorderPoint = value;
    }

    /**
     * Gets the value of the reorderQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReorderQuantity() {
        return reorderQuantity;
    }

    /**
     * Sets the value of the reorderQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReorderQuantity(BigDecimal value) {
        this.reorderQuantity = value;
    }

    /**
     * Gets the value of the maximumInventory property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaximumInventory() {
        return maximumInventory;
    }

    /**
     * Sets the value of the maximumInventory property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaximumInventory(BigDecimal value) {
        this.maximumInventory = value;
    }

    /**
     * Gets the value of the minimumOrderQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinimumOrderQuantity() {
        return minimumOrderQuantity;
    }

    /**
     * Sets the value of the minimumOrderQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinimumOrderQuantity(BigDecimal value) {
        this.minimumOrderQuantity = value;
    }

    /**
     * Gets the value of the maximumOrderQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaximumOrderQuantity() {
        return maximumOrderQuantity;
    }

    /**
     * Sets the value of the maximumOrderQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaximumOrderQuantity(BigDecimal value) {
        this.maximumOrderQuantity = value;
    }

    /**
     * Gets the value of the orderMultiple property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOrderMultiple() {
        return orderMultiple;
    }

    /**
     * Sets the value of the orderMultiple property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOrderMultiple(BigDecimal value) {
        this.orderMultiple = value;
    }

    /**
     * Gets the value of the tariffNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTariffNo() {
        return tariffNo;
    }

    /**
     * Sets the value of the tariffNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTariffNo(String value) {
        this.tariffNo = value;
    }

    /**
     * Gets the value of the countryRegionOfOriginCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryRegionOfOriginCode() {
        return countryRegionOfOriginCode;
    }

    /**
     * Sets the value of the countryRegionOfOriginCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryRegionOfOriginCode(String value) {
        this.countryRegionOfOriginCode = value;
    }

    /**
     * Gets the value of the netWeight property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNetWeight() {
        return netWeight;
    }

    /**
     * Sets the value of the netWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNetWeight(BigDecimal value) {
        this.netWeight = value;
    }

    /**
     * Gets the value of the grossWeight property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGrossWeight() {
        return grossWeight;
    }

    /**
     * Sets the value of the grossWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGrossWeight(BigDecimal value) {
        this.grossWeight = value;
    }

    /**
     * Gets the value of the itemTrackingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemTrackingCode() {
        return itemTrackingCode;
    }

    /**
     * Sets the value of the itemTrackingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemTrackingCode(String value) {
        this.itemTrackingCode = value;
    }

    /**
     * Gets the value of the serialNos property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNos() {
        return serialNos;
    }

    /**
     * Sets the value of the serialNos property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNos(String value) {
        this.serialNos = value;
    }

    /**
     * Gets the value of the lotNos property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLotNos() {
        return lotNos;
    }

    /**
     * Sets the value of the lotNos property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLotNos(String value) {
        this.lotNos = value;
    }

    /**
     * Gets the value of the expirationCalculation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpirationCalculation() {
        return expirationCalculation;
    }

    /**
     * Sets the value of the expirationCalculation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpirationCalculation(String value) {
        this.expirationCalculation = value;
    }

    /**
     * Gets the value of the commonItemNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommonItemNo() {
        return commonItemNo;
    }

    /**
     * Sets the value of the commonItemNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommonItemNo(String value) {
        this.commonItemNo = value;
    }

    /**
     * Gets the value of the specialEquipmentCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialEquipmentCode() {
        return specialEquipmentCode;
    }

    /**
     * Sets the value of the specialEquipmentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialEquipmentCode(String value) {
        this.specialEquipmentCode = value;
    }

    /**
     * Gets the value of the putAwayTemplateCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPutAwayTemplateCode() {
        return putAwayTemplateCode;
    }

    /**
     * Sets the value of the putAwayTemplateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPutAwayTemplateCode(String value) {
        this.putAwayTemplateCode = value;
    }

    /**
     * Gets the value of the putAwayUnitOfMeasureCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPutAwayUnitOfMeasureCode() {
        return putAwayUnitOfMeasureCode;
    }

    /**
     * Sets the value of the putAwayUnitOfMeasureCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPutAwayUnitOfMeasureCode(String value) {
        this.putAwayUnitOfMeasureCode = value;
    }

    /**
     * Gets the value of the physInvtCountingPeriodCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhysInvtCountingPeriodCode() {
        return physInvtCountingPeriodCode;
    }

    /**
     * Sets the value of the physInvtCountingPeriodCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhysInvtCountingPeriodCode(String value) {
        this.physInvtCountingPeriodCode = value;
    }

    /**
     * Gets the value of the lastPhysInvtDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastPhysInvtDate() {
        return lastPhysInvtDate;
    }

    /**
     * Sets the value of the lastPhysInvtDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastPhysInvtDate(XMLGregorianCalendar value) {
        this.lastPhysInvtDate = value;
    }

    /**
     * Gets the value of the lastCountingPeriodUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastCountingPeriodUpdate() {
        return lastCountingPeriodUpdate;
    }

    /**
     * Sets the value of the lastCountingPeriodUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastCountingPeriodUpdate(XMLGregorianCalendar value) {
        this.lastCountingPeriodUpdate = value;
    }

    /**
     * Gets the value of the nextCountingPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNextCountingPeriod() {
        return nextCountingPeriod;
    }

    /**
     * Sets the value of the nextCountingPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNextCountingPeriod(String value) {
        this.nextCountingPeriod = value;
    }

    /**
     * Gets the value of the identifierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifierCode() {
        return identifierCode;
    }

    /**
     * Sets the value of the identifierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifierCode(String value) {
        this.identifierCode = value;
    }

    /**
     * Gets the value of the useCrossDocking property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseCrossDocking() {
        return useCrossDocking;
    }

    /**
     * Sets the value of the useCrossDocking property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseCrossDocking(Boolean value) {
        this.useCrossDocking = value;
    }

}
