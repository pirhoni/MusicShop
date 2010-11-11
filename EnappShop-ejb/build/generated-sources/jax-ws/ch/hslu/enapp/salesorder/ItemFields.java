
package ch.hslu.enapp.salesorder;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Item_Fields.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Item_Fields">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="No"/>
 *     &lt;enumeration value="Description"/>
 *     &lt;enumeration value="Owner"/>
 *     &lt;enumeration value="Kind"/>
 *     &lt;enumeration value="Mediafile_Name"/>
 *     &lt;enumeration value="Manufacturer_Code"/>
 *     &lt;enumeration value="Base_Unit_of_Measure"/>
 *     &lt;enumeration value="Bill_of_Materials"/>
 *     &lt;enumeration value="Shelf_No"/>
 *     &lt;enumeration value="Automatic_Ext_Texts"/>
 *     &lt;enumeration value="Created_From_Nonstock_Item"/>
 *     &lt;enumeration value="Item_Category_Code"/>
 *     &lt;enumeration value="Product_Group_Code"/>
 *     &lt;enumeration value="Last_Date_Modified"/>
 *     &lt;enumeration value="Search_Description"/>
 *     &lt;enumeration value="Inventory"/>
 *     &lt;enumeration value="Qty_on_Purch_Order"/>
 *     &lt;enumeration value="Qty_on_Prod_Order"/>
 *     &lt;enumeration value="Qty_on_Component_Lines"/>
 *     &lt;enumeration value="Qty_on_Sales_Order"/>
 *     &lt;enumeration value="Qty_on_Service_Order"/>
 *     &lt;enumeration value="Service_Item_Group"/>
 *     &lt;enumeration value="Blocked"/>
 *     &lt;enumeration value="No_Stockkeeping"/>
 *     &lt;enumeration value="Costing_Method"/>
 *     &lt;enumeration value="Cost_is_Adjusted"/>
 *     &lt;enumeration value="Cost_is_Posted_to_G_L"/>
 *     &lt;enumeration value="Standard_Cost"/>
 *     &lt;enumeration value="Unit_Cost"/>
 *     &lt;enumeration value="Overhead_Rate"/>
 *     &lt;enumeration value="Indirect_Cost_Percent"/>
 *     &lt;enumeration value="Last_Direct_Cost"/>
 *     &lt;enumeration value="Price_Profit_Calculation"/>
 *     &lt;enumeration value="Profit_Percent"/>
 *     &lt;enumeration value="Unit_Price"/>
 *     &lt;enumeration value="Gen_Prod_Posting_Group"/>
 *     &lt;enumeration value="VAT_Prod_Posting_Group"/>
 *     &lt;enumeration value="Inventory_Posting_Group"/>
 *     &lt;enumeration value="Net_Invoiced_Qty"/>
 *     &lt;enumeration value="Allow_Invoice_Disc"/>
 *     &lt;enumeration value="Item_Disc_Group"/>
 *     &lt;enumeration value="Sales_Unit_of_Measure"/>
 *     &lt;enumeration value="Sale_blocked"/>
 *     &lt;enumeration value="Replenishment_System"/>
 *     &lt;enumeration value="Vendor_No"/>
 *     &lt;enumeration value="Vendor_Item_No"/>
 *     &lt;enumeration value="Purch_Unit_of_Measure"/>
 *     &lt;enumeration value="Lead_Time_Calculation"/>
 *     &lt;enumeration value="Manufacturing_Policy"/>
 *     &lt;enumeration value="Routing_No"/>
 *     &lt;enumeration value="Production_BOM_No"/>
 *     &lt;enumeration value="Rounding_Precision"/>
 *     &lt;enumeration value="Flushing_Method"/>
 *     &lt;enumeration value="Scrap_Percent"/>
 *     &lt;enumeration value="Lot_Size"/>
 *     &lt;enumeration value="Purchase_blocked"/>
 *     &lt;enumeration value="Reordering_Policy"/>
 *     &lt;enumeration value="Include_Inventory"/>
 *     &lt;enumeration value="Reserve"/>
 *     &lt;enumeration value="Order_Tracking_Policy"/>
 *     &lt;enumeration value="Stockkeeping_Unit_Exists"/>
 *     &lt;enumeration value="Critical"/>
 *     &lt;enumeration value="Reorder_Cycle"/>
 *     &lt;enumeration value="Safety_Lead_Time"/>
 *     &lt;enumeration value="Safety_Stock_Quantity"/>
 *     &lt;enumeration value="Reorder_Point"/>
 *     &lt;enumeration value="Reorder_Quantity"/>
 *     &lt;enumeration value="Maximum_Inventory"/>
 *     &lt;enumeration value="Minimum_Order_Quantity"/>
 *     &lt;enumeration value="Maximum_Order_Quantity"/>
 *     &lt;enumeration value="Order_Multiple"/>
 *     &lt;enumeration value="Tariff_No"/>
 *     &lt;enumeration value="Country_Region_of_Origin_Code"/>
 *     &lt;enumeration value="Net_Weight"/>
 *     &lt;enumeration value="Gross_Weight"/>
 *     &lt;enumeration value="Item_Tracking_Code"/>
 *     &lt;enumeration value="Serial_Nos"/>
 *     &lt;enumeration value="Lot_Nos"/>
 *     &lt;enumeration value="Expiration_Calculation"/>
 *     &lt;enumeration value="Common_Item_No"/>
 *     &lt;enumeration value="Special_Equipment_Code"/>
 *     &lt;enumeration value="Put_away_Template_Code"/>
 *     &lt;enumeration value="Put_away_Unit_of_Measure_Code"/>
 *     &lt;enumeration value="Phys_Invt_Counting_Period_Code"/>
 *     &lt;enumeration value="Last_Phys_Invt_Date"/>
 *     &lt;enumeration value="Last_Counting_Period_Update"/>
 *     &lt;enumeration value="Next_Counting_Period"/>
 *     &lt;enumeration value="Identifier_Code"/>
 *     &lt;enumeration value="Use_Cross_Docking"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Item_Fields")
@XmlEnum
public enum ItemFields {

    @XmlEnumValue("No")
    NO("No"),
    @XmlEnumValue("Description")
    DESCRIPTION("Description"),
    @XmlEnumValue("Owner")
    OWNER("Owner"),
    @XmlEnumValue("Kind")
    KIND("Kind"),
    @XmlEnumValue("Mediafile_Name")
    MEDIAFILE_NAME("Mediafile_Name"),
    @XmlEnumValue("Manufacturer_Code")
    MANUFACTURER_CODE("Manufacturer_Code"),
    @XmlEnumValue("Base_Unit_of_Measure")
    BASE_UNIT_OF_MEASURE("Base_Unit_of_Measure"),
    @XmlEnumValue("Bill_of_Materials")
    BILL_OF_MATERIALS("Bill_of_Materials"),
    @XmlEnumValue("Shelf_No")
    SHELF_NO("Shelf_No"),
    @XmlEnumValue("Automatic_Ext_Texts")
    AUTOMATIC_EXT_TEXTS("Automatic_Ext_Texts"),
    @XmlEnumValue("Created_From_Nonstock_Item")
    CREATED_FROM_NONSTOCK_ITEM("Created_From_Nonstock_Item"),
    @XmlEnumValue("Item_Category_Code")
    ITEM_CATEGORY_CODE("Item_Category_Code"),
    @XmlEnumValue("Product_Group_Code")
    PRODUCT_GROUP_CODE("Product_Group_Code"),
    @XmlEnumValue("Last_Date_Modified")
    LAST_DATE_MODIFIED("Last_Date_Modified"),
    @XmlEnumValue("Search_Description")
    SEARCH_DESCRIPTION("Search_Description"),
    @XmlEnumValue("Inventory")
    INVENTORY("Inventory"),
    @XmlEnumValue("Qty_on_Purch_Order")
    QTY_ON_PURCH_ORDER("Qty_on_Purch_Order"),
    @XmlEnumValue("Qty_on_Prod_Order")
    QTY_ON_PROD_ORDER("Qty_on_Prod_Order"),
    @XmlEnumValue("Qty_on_Component_Lines")
    QTY_ON_COMPONENT_LINES("Qty_on_Component_Lines"),
    @XmlEnumValue("Qty_on_Sales_Order")
    QTY_ON_SALES_ORDER("Qty_on_Sales_Order"),
    @XmlEnumValue("Qty_on_Service_Order")
    QTY_ON_SERVICE_ORDER("Qty_on_Service_Order"),
    @XmlEnumValue("Service_Item_Group")
    SERVICE_ITEM_GROUP("Service_Item_Group"),
    @XmlEnumValue("Blocked")
    BLOCKED("Blocked"),
    @XmlEnumValue("No_Stockkeeping")
    NO_STOCKKEEPING("No_Stockkeeping"),
    @XmlEnumValue("Costing_Method")
    COSTING_METHOD("Costing_Method"),
    @XmlEnumValue("Cost_is_Adjusted")
    COST_IS_ADJUSTED("Cost_is_Adjusted"),
    @XmlEnumValue("Cost_is_Posted_to_G_L")
    COST_IS_POSTED_TO_G_L("Cost_is_Posted_to_G_L"),
    @XmlEnumValue("Standard_Cost")
    STANDARD_COST("Standard_Cost"),
    @XmlEnumValue("Unit_Cost")
    UNIT_COST("Unit_Cost"),
    @XmlEnumValue("Overhead_Rate")
    OVERHEAD_RATE("Overhead_Rate"),
    @XmlEnumValue("Indirect_Cost_Percent")
    INDIRECT_COST_PERCENT("Indirect_Cost_Percent"),
    @XmlEnumValue("Last_Direct_Cost")
    LAST_DIRECT_COST("Last_Direct_Cost"),
    @XmlEnumValue("Price_Profit_Calculation")
    PRICE_PROFIT_CALCULATION("Price_Profit_Calculation"),
    @XmlEnumValue("Profit_Percent")
    PROFIT_PERCENT("Profit_Percent"),
    @XmlEnumValue("Unit_Price")
    UNIT_PRICE("Unit_Price"),
    @XmlEnumValue("Gen_Prod_Posting_Group")
    GEN_PROD_POSTING_GROUP("Gen_Prod_Posting_Group"),
    @XmlEnumValue("VAT_Prod_Posting_Group")
    VAT_PROD_POSTING_GROUP("VAT_Prod_Posting_Group"),
    @XmlEnumValue("Inventory_Posting_Group")
    INVENTORY_POSTING_GROUP("Inventory_Posting_Group"),
    @XmlEnumValue("Net_Invoiced_Qty")
    NET_INVOICED_QTY("Net_Invoiced_Qty"),
    @XmlEnumValue("Allow_Invoice_Disc")
    ALLOW_INVOICE_DISC("Allow_Invoice_Disc"),
    @XmlEnumValue("Item_Disc_Group")
    ITEM_DISC_GROUP("Item_Disc_Group"),
    @XmlEnumValue("Sales_Unit_of_Measure")
    SALES_UNIT_OF_MEASURE("Sales_Unit_of_Measure"),
    @XmlEnumValue("Sale_blocked")
    SALE_BLOCKED("Sale_blocked"),
    @XmlEnumValue("Replenishment_System")
    REPLENISHMENT_SYSTEM("Replenishment_System"),
    @XmlEnumValue("Vendor_No")
    VENDOR_NO("Vendor_No"),
    @XmlEnumValue("Vendor_Item_No")
    VENDOR_ITEM_NO("Vendor_Item_No"),
    @XmlEnumValue("Purch_Unit_of_Measure")
    PURCH_UNIT_OF_MEASURE("Purch_Unit_of_Measure"),
    @XmlEnumValue("Lead_Time_Calculation")
    LEAD_TIME_CALCULATION("Lead_Time_Calculation"),
    @XmlEnumValue("Manufacturing_Policy")
    MANUFACTURING_POLICY("Manufacturing_Policy"),
    @XmlEnumValue("Routing_No")
    ROUTING_NO("Routing_No"),
    @XmlEnumValue("Production_BOM_No")
    PRODUCTION_BOM_NO("Production_BOM_No"),
    @XmlEnumValue("Rounding_Precision")
    ROUNDING_PRECISION("Rounding_Precision"),
    @XmlEnumValue("Flushing_Method")
    FLUSHING_METHOD("Flushing_Method"),
    @XmlEnumValue("Scrap_Percent")
    SCRAP_PERCENT("Scrap_Percent"),
    @XmlEnumValue("Lot_Size")
    LOT_SIZE("Lot_Size"),
    @XmlEnumValue("Purchase_blocked")
    PURCHASE_BLOCKED("Purchase_blocked"),
    @XmlEnumValue("Reordering_Policy")
    REORDERING_POLICY("Reordering_Policy"),
    @XmlEnumValue("Include_Inventory")
    INCLUDE_INVENTORY("Include_Inventory"),
    @XmlEnumValue("Reserve")
    RESERVE("Reserve"),
    @XmlEnumValue("Order_Tracking_Policy")
    ORDER_TRACKING_POLICY("Order_Tracking_Policy"),
    @XmlEnumValue("Stockkeeping_Unit_Exists")
    STOCKKEEPING_UNIT_EXISTS("Stockkeeping_Unit_Exists"),
    @XmlEnumValue("Critical")
    CRITICAL("Critical"),
    @XmlEnumValue("Reorder_Cycle")
    REORDER_CYCLE("Reorder_Cycle"),
    @XmlEnumValue("Safety_Lead_Time")
    SAFETY_LEAD_TIME("Safety_Lead_Time"),
    @XmlEnumValue("Safety_Stock_Quantity")
    SAFETY_STOCK_QUANTITY("Safety_Stock_Quantity"),
    @XmlEnumValue("Reorder_Point")
    REORDER_POINT("Reorder_Point"),
    @XmlEnumValue("Reorder_Quantity")
    REORDER_QUANTITY("Reorder_Quantity"),
    @XmlEnumValue("Maximum_Inventory")
    MAXIMUM_INVENTORY("Maximum_Inventory"),
    @XmlEnumValue("Minimum_Order_Quantity")
    MINIMUM_ORDER_QUANTITY("Minimum_Order_Quantity"),
    @XmlEnumValue("Maximum_Order_Quantity")
    MAXIMUM_ORDER_QUANTITY("Maximum_Order_Quantity"),
    @XmlEnumValue("Order_Multiple")
    ORDER_MULTIPLE("Order_Multiple"),
    @XmlEnumValue("Tariff_No")
    TARIFF_NO("Tariff_No"),
    @XmlEnumValue("Country_Region_of_Origin_Code")
    COUNTRY_REGION_OF_ORIGIN_CODE("Country_Region_of_Origin_Code"),
    @XmlEnumValue("Net_Weight")
    NET_WEIGHT("Net_Weight"),
    @XmlEnumValue("Gross_Weight")
    GROSS_WEIGHT("Gross_Weight"),
    @XmlEnumValue("Item_Tracking_Code")
    ITEM_TRACKING_CODE("Item_Tracking_Code"),
    @XmlEnumValue("Serial_Nos")
    SERIAL_NOS("Serial_Nos"),
    @XmlEnumValue("Lot_Nos")
    LOT_NOS("Lot_Nos"),
    @XmlEnumValue("Expiration_Calculation")
    EXPIRATION_CALCULATION("Expiration_Calculation"),
    @XmlEnumValue("Common_Item_No")
    COMMON_ITEM_NO("Common_Item_No"),
    @XmlEnumValue("Special_Equipment_Code")
    SPECIAL_EQUIPMENT_CODE("Special_Equipment_Code"),
    @XmlEnumValue("Put_away_Template_Code")
    PUT_AWAY_TEMPLATE_CODE("Put_away_Template_Code"),
    @XmlEnumValue("Put_away_Unit_of_Measure_Code")
    PUT_AWAY_UNIT_OF_MEASURE_CODE("Put_away_Unit_of_Measure_Code"),
    @XmlEnumValue("Phys_Invt_Counting_Period_Code")
    PHYS_INVT_COUNTING_PERIOD_CODE("Phys_Invt_Counting_Period_Code"),
    @XmlEnumValue("Last_Phys_Invt_Date")
    LAST_PHYS_INVT_DATE("Last_Phys_Invt_Date"),
    @XmlEnumValue("Last_Counting_Period_Update")
    LAST_COUNTING_PERIOD_UPDATE("Last_Counting_Period_Update"),
    @XmlEnumValue("Next_Counting_Period")
    NEXT_COUNTING_PERIOD("Next_Counting_Period"),
    @XmlEnumValue("Identifier_Code")
    IDENTIFIER_CODE("Identifier_Code"),
    @XmlEnumValue("Use_Cross_Docking")
    USE_CROSS_DOCKING("Use_Cross_Docking");
    private final String value;

    ItemFields(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ItemFields fromValue(String v) {
        for (ItemFields c: ItemFields.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
