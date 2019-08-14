
package com.sap.brewster.services;

import javax.inject.Named;
import com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrder;
import com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderByKeyFluentHelper;
import com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderCreateFluentHelper;
import com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderDeleteFluentHelper;
import com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderFluentHelper;
import com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderHeaderPartner;
import com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderHeaderPartnerByKeyFluentHelper;
import com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderHeaderPartnerDeleteFluentHelper;
import com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderHeaderPartnerFluentHelper;
import com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderHeaderPartnerUpdateFluentHelper;
import com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderHeaderPrElement;
import com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderHeaderPrElementByKeyFluentHelper;
import com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderHeaderPrElementDeleteFluentHelper;
import com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderHeaderPrElementFluentHelper;
import com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderHeaderPrElementUpdateFluentHelper;
import com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItem;
import com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItemByKeyFluentHelper;
import com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItemCreateFluentHelper;
import com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItemDeleteFluentHelper;
import com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItemFluentHelper;
import com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItemPartner;
import com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItemPartnerByKeyFluentHelper;
import com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItemPartnerDeleteFluentHelper;
import com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItemPartnerFluentHelper;
import com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItemPartnerUpdateFluentHelper;
import com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItemPrElement;
import com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItemPrElementByKeyFluentHelper;
import com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItemPrElementDeleteFluentHelper;
import com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItemPrElementFluentHelper;
import com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItemPrElementUpdateFluentHelper;
import com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItemText;
import com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItemTextByKeyFluentHelper;
import com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItemTextDeleteFluentHelper;
import com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItemTextFluentHelper;
import com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItemTextUpdateFluentHelper;
import com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderItemUpdateFluentHelper;
import com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderScheduleLineByKeyFluentHelper;
import com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderScheduleLineFluentHelper;
import com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderText;
import com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderTextByKeyFluentHelper;
import com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderTextDeleteFluentHelper;
import com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderTextFluentHelper;
import com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderTextUpdateFluentHelper;
import com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderUpdateFluentHelper;
import com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SlsOrdPaymentPlanItemDetails;
import com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SlsOrdPaymentPlanItemDetailsByKeyFluentHelper;
import com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SlsOrdPaymentPlanItemDetailsDeleteFluentHelper;
import com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SlsOrdPaymentPlanItemDetailsFluentHelper;
import com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SlsOrdPaymentPlanItemDetailsUpdateFluentHelper;


/**
 * <p>You can use this service to integrate external applications with sales order processing in SAP S/4HANA Cloud. In every API call, you can make use of the following operations:
 *  - You can retrieve sales orders. Apply any of the filters provided or retrieve all existing data.
 *  - You can create sales orders. Note that you must use "deep insert" requests (a header plus the following entities: header partner, header pricing element, header text, item, payment details, item partner, item pricing element, and item text). You cannot create entities without including any related entities.
 *  - For existing sales orders, you can create new items. Note that you must use "deep insert" requests (with the following entities: item partner, item pricing element, and item text). You cannot create entities without including any related entities.
 *  - For existing sales orders, you can update the header, header partner, header pricing element, header text, payment details, item, item partner, item pricing element, and item text.
 *  - For existing sales orders, you can delete the header, header partner, header pricing element, header text, payment details, item, item partner, item pricing element, item text..</p><p><a href='https://help.sap.com/viewer/635f557c455d42eaae20f169d9c43d9b/latest/en-US/00d244581efca007e10000000a441470.html'>Business Documentation</a></p><p>Reference: <a href='https://api.sap.com/shell/discover/contentpackage/SAPS4HANACloud/api/API_SALES_ORDER_SRV?section=OVERVIEW'>SAP API Business Hub</a></p><h3>Details:</h3><table summary='Details'><tr><td align='right'>OData Service:</td><td>API_SALES_ORDER_SRV</td></tr><tr><td align='right'>API Version:</td><td>1 </td></tr><tr><td align='right'>Communication Scenario:</td><td>Sales Order Integration (SAP_COM_0109)</td></tr><tr><td align='right'>Scope Items:</td><td><a href='https://rapid.sap.com/bp/#/scopeitems/BD9'>Sell from Stock (BD9)</a>, <a href='https://rapid.sap.com/bp/#/scopeitems/1QI'>Integration with Third-Party Sales Force Automation System (1QI)</a></td></tr><tr><td align='right'>Authentication Methods:</td><td>Basic, x509</td></tr><tr><td align='right'>Business Object:</td><td>SalesOrder</td></tr></table>
 * 
 */
@Named("com.sap.brewster.services.DefaultSalesOrderCreateReadUpdateDeleteService")
public class DefaultSalesOrderCreateReadUpdateDeleteService
    implements SalesOrderCreateReadUpdateDeleteService
{


    @Override
    public SalesOrderFluentHelper getAllSalesOrder() {
        return new SalesOrderFluentHelper();
    }

    @Override
    public SalesOrderByKeyFluentHelper getSalesOrderByKey(String salesOrder) {
        return new SalesOrderByKeyFluentHelper(salesOrder);
    }

    @Override
    public SalesOrderCreateFluentHelper createSalesOrder(final SalesOrder salesOrder) {
        return new SalesOrderCreateFluentHelper(salesOrder);
    }

    @Override
    public SalesOrderUpdateFluentHelper updateSalesOrder(final SalesOrder salesOrder) {
        return new SalesOrderUpdateFluentHelper(salesOrder);
    }

    @Override
    public SalesOrderDeleteFluentHelper deleteSalesOrder(final SalesOrder salesOrder) {
        return new SalesOrderDeleteFluentHelper(salesOrder);
    }

    @Override
    public SalesOrderHeaderPartnerFluentHelper getAllSalesOrderHeaderPartner() {
        return new SalesOrderHeaderPartnerFluentHelper();
    }

    @Override
    public SalesOrderHeaderPartnerByKeyFluentHelper getSalesOrderHeaderPartnerByKey(String salesOrder, String partnerFunction) {
        return new SalesOrderHeaderPartnerByKeyFluentHelper(salesOrder, partnerFunction);
    }

    @Override
    public SalesOrderHeaderPartnerUpdateFluentHelper updateSalesOrderHeaderPartner(final SalesOrderHeaderPartner salesOrderHeaderPartner) {
        return new SalesOrderHeaderPartnerUpdateFluentHelper(salesOrderHeaderPartner);
    }

    @Override
    public SalesOrderHeaderPartnerDeleteFluentHelper deleteSalesOrderHeaderPartner(final SalesOrderHeaderPartner salesOrderHeaderPartner) {
        return new SalesOrderHeaderPartnerDeleteFluentHelper(salesOrderHeaderPartner);
    }

    @Override
    public SalesOrderHeaderPrElementFluentHelper getAllSalesOrderHeaderPrElement() {
        return new SalesOrderHeaderPrElementFluentHelper();
    }

    @Override
    public SalesOrderHeaderPrElementByKeyFluentHelper getSalesOrderHeaderPrElementByKey(String salesOrder, String pricingProcedureStep, String pricingProcedureCounter) {
        return new SalesOrderHeaderPrElementByKeyFluentHelper(salesOrder, pricingProcedureStep, pricingProcedureCounter);
    }

    @Override
    public SalesOrderHeaderPrElementUpdateFluentHelper updateSalesOrderHeaderPrElement(final SalesOrderHeaderPrElement salesOrderHeaderPrElement) {
        return new SalesOrderHeaderPrElementUpdateFluentHelper(salesOrderHeaderPrElement);
    }

    @Override
    public SalesOrderHeaderPrElementDeleteFluentHelper deleteSalesOrderHeaderPrElement(final SalesOrderHeaderPrElement salesOrderHeaderPrElement) {
        return new SalesOrderHeaderPrElementDeleteFluentHelper(salesOrderHeaderPrElement);
    }

    @Override
    public SalesOrderItemFluentHelper getAllSalesOrderItem() {
        return new SalesOrderItemFluentHelper();
    }

    @Override
    public SalesOrderItemByKeyFluentHelper getSalesOrderItemByKey(String salesOrder, String salesOrderItem) {
        return new SalesOrderItemByKeyFluentHelper(salesOrder, salesOrderItem);
    }

    @Override
    public SalesOrderItemCreateFluentHelper createSalesOrderItem(final SalesOrderItem salesOrderItem) {
        return new SalesOrderItemCreateFluentHelper(salesOrderItem);
    }

    @Override
    public SalesOrderItemUpdateFluentHelper updateSalesOrderItem(final SalesOrderItem salesOrderItem) {
        return new SalesOrderItemUpdateFluentHelper(salesOrderItem);
    }

    @Override
    public SalesOrderItemDeleteFluentHelper deleteSalesOrderItem(final SalesOrderItem salesOrderItem) {
        return new SalesOrderItemDeleteFluentHelper(salesOrderItem);
    }

    @Override
    public SalesOrderItemPartnerFluentHelper getAllSalesOrderItemPartner() {
        return new SalesOrderItemPartnerFluentHelper();
    }

    @Override
    public SalesOrderItemPartnerByKeyFluentHelper getSalesOrderItemPartnerByKey(String salesOrder, String salesOrderItem, String partnerFunction) {
        return new SalesOrderItemPartnerByKeyFluentHelper(salesOrder, salesOrderItem, partnerFunction);
    }

    @Override
    public SalesOrderItemPartnerUpdateFluentHelper updateSalesOrderItemPartner(final SalesOrderItemPartner salesOrderItemPartner) {
        return new SalesOrderItemPartnerUpdateFluentHelper(salesOrderItemPartner);
    }

    @Override
    public SalesOrderItemPartnerDeleteFluentHelper deleteSalesOrderItemPartner(final SalesOrderItemPartner salesOrderItemPartner) {
        return new SalesOrderItemPartnerDeleteFluentHelper(salesOrderItemPartner);
    }

    @Override
    public SalesOrderItemPrElementFluentHelper getAllSalesOrderItemPrElement() {
        return new SalesOrderItemPrElementFluentHelper();
    }

    @Override
    public SalesOrderItemPrElementByKeyFluentHelper getSalesOrderItemPrElementByKey(String salesOrder, String salesOrderItem, String pricingProcedureStep, String pricingProcedureCounter) {
        return new SalesOrderItemPrElementByKeyFluentHelper(salesOrder, salesOrderItem, pricingProcedureStep, pricingProcedureCounter);
    }

    @Override
    public SalesOrderItemPrElementUpdateFluentHelper updateSalesOrderItemPrElement(final SalesOrderItemPrElement salesOrderItemPrElement) {
        return new SalesOrderItemPrElementUpdateFluentHelper(salesOrderItemPrElement);
    }

    @Override
    public SalesOrderItemPrElementDeleteFluentHelper deleteSalesOrderItemPrElement(final SalesOrderItemPrElement salesOrderItemPrElement) {
        return new SalesOrderItemPrElementDeleteFluentHelper(salesOrderItemPrElement);
    }

    @Override
    public SalesOrderItemTextFluentHelper getAllSalesOrderItemText() {
        return new SalesOrderItemTextFluentHelper();
    }

    @Override
    public SalesOrderItemTextByKeyFluentHelper getSalesOrderItemTextByKey(String salesOrder, String salesOrderItem, String language, String longTextID) {
        return new SalesOrderItemTextByKeyFluentHelper(salesOrder, salesOrderItem, language, longTextID);
    }

    @Override
    public SalesOrderItemTextUpdateFluentHelper updateSalesOrderItemText(final SalesOrderItemText salesOrderItemText) {
        return new SalesOrderItemTextUpdateFluentHelper(salesOrderItemText);
    }

    @Override
    public SalesOrderItemTextDeleteFluentHelper deleteSalesOrderItemText(final SalesOrderItemText salesOrderItemText) {
        return new SalesOrderItemTextDeleteFluentHelper(salesOrderItemText);
    }

    @Override
    public SalesOrderScheduleLineFluentHelper getAllSalesOrderScheduleLine() {
        return new SalesOrderScheduleLineFluentHelper();
    }

    @Override
    public SalesOrderScheduleLineByKeyFluentHelper getSalesOrderScheduleLineByKey(String salesOrder, String salesOrderItem, String scheduleLine) {
        return new SalesOrderScheduleLineByKeyFluentHelper(salesOrder, salesOrderItem, scheduleLine);
    }

    @Override
    public SalesOrderTextFluentHelper getAllSalesOrderText() {
        return new SalesOrderTextFluentHelper();
    }

    @Override
    public SalesOrderTextByKeyFluentHelper getSalesOrderTextByKey(String salesOrder, String language, String longTextID) {
        return new SalesOrderTextByKeyFluentHelper(salesOrder, language, longTextID);
    }

    @Override
    public SalesOrderTextUpdateFluentHelper updateSalesOrderText(final SalesOrderText salesOrderText) {
        return new SalesOrderTextUpdateFluentHelper(salesOrderText);
    }

    @Override
    public SalesOrderTextDeleteFluentHelper deleteSalesOrderText(final SalesOrderText salesOrderText) {
        return new SalesOrderTextDeleteFluentHelper(salesOrderText);
    }

    @Override
    public SlsOrdPaymentPlanItemDetailsFluentHelper getAllSlsOrdPaymentPlanItemDetails() {
        return new SlsOrdPaymentPlanItemDetailsFluentHelper();
    }

    @Override
    public SlsOrdPaymentPlanItemDetailsByKeyFluentHelper getSlsOrdPaymentPlanItemDetailsByKey(String salesOrder, String paymentPlanItem) {
        return new SlsOrdPaymentPlanItemDetailsByKeyFluentHelper(salesOrder, paymentPlanItem);
    }

    @Override
    public SlsOrdPaymentPlanItemDetailsUpdateFluentHelper updateSlsOrdPaymentPlanItemDetails(final SlsOrdPaymentPlanItemDetails slsOrdPaymentPlanItemDetails) {
        return new SlsOrdPaymentPlanItemDetailsUpdateFluentHelper(slsOrdPaymentPlanItemDetails);
    }

    @Override
    public SlsOrdPaymentPlanItemDetailsDeleteFluentHelper deleteSlsOrdPaymentPlanItemDetails(final SlsOrdPaymentPlanItemDetails slsOrdPaymentPlanItemDetails) {
        return new SlsOrdPaymentPlanItemDetailsDeleteFluentHelper(slsOrdPaymentPlanItemDetails);
    }

}
