package com;

import com.sap.apibhub.sdk.client.*;
import com.sap.apibhub.sdk.client.auth.*;
import com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrder;
import com.sap.brewster.namespaces.salesordercreatereadupdatedelete.SalesOrderFluentHelper;
import com.sap.cloud.sdk.odatav2.connectivity.ODataException;
import com.sap.cloud.sdk.odatav2.connectivity.ODataQueryBuilder;
import com.sap.cloud.sdk.s4hana.connectivity.ErpConfigContext;
import com.sap.apibhub.sdk.api_sales_order_srv.model.*;
import com.sap.apibhub.sdk.api_sales_order_srv.api.ASalesOrderApi;

import java.io.File;
import java.util.*;

public class ASalesOrderApiExample {
	ApiClient defaultClient ;
	public ASalesOrderApiExample() {
		defaultClient = Configuration.getDefaultApiClient(); 
		Map<String, Authentication> authentications = defaultClient.getAuthentications();       
		
		//Currently Base Path points to sandbox system, change it to call your API Endpoint
		defaultClient.setBasePath("https://my302314.s4hana.ondemand.com/sap/opu/odata/sap/API_SALES_ORDER_SRV");
		//defaultClient.setBasePath("https://my301713.s4hana.ondemand.com/sap/opu/odata/sap/API_SALES_ORDER_SRV");
		
		//You can obtain your API key on the Settings page of SAP API Business Hub. In the Settings page, choose the Show API Key toggle button to display and copy your API key. You have to be logged in to view your API Key.
		defaultClient.addDefaultHeader("APIKey","Tvs0GYWlQIfcYgn0Lj5fzpCJrBBhwpkf"); 		
		authentications.put("APIBHUB_SANDBOX_APIKEY", new ApiKeyAuth("header", "APIKey"));
		            
        
		//Change Base Path, uncomment below code and configure Basic Authorization to call your API Endpoint: basicAuthentication
		authentications.put("basicAuthentication", new HttpBasicAuth());
		
		HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("basicAuthentication");
		basicAuthentication.setUsername("BHF_COMM");
		basicAuthentication.setPassword("nBhLsiwWXmfwqmX)FDLRUA6SwdCitAXUswwZwLqX");
		
	}

    public static void main(String[] args) {
    
		
		//basicAuthentication.setUsername("MEUSER");
		//basicAuthentication.setPassword("B#BVQlsdsubfUUshFqwHJrcPzWYs2LdZHbsWBbrp");
    	ASalesOrderApiExample a = new ASalesOrderApiExample();
        ASalesOrderApi apiInstance = new ASalesOrderApi();
        apiInstance.setApiClient(a.defaultClient);
        Integer top = 10; // Integer | Show only the first n items, see [OData Paging - Top](http://docs.oasis-open.org/odata/odata/v4.01/odata-v4.01-part1-protocol.html#sec_SystemQueryOptiontop)
        Integer skip = 0; // Integer | Skip the first n items, see [OData Paging - Skip](http://docs.oasis-open.org/odata/odata/v4.01/odata-v4.01-part1-protocol.html#sec_SystemQueryOptionskip)
        String filter = ""; // String | Filter items by property values, see [OData Filtering](http://docs.oasis-open.org/odata/odata/v4.01/odata-v4.01-part1-protocol.html#sec_SystemQueryOptionfilter)
        String inlinecount = ""; // String | Include count of items, see [OData Count](http://www.odata.org/documentation/odata-version-2-0/uri-conventions/#InlinecountSystemQueryOption)
        List<String> orderby = Arrays.asList(""); // List<String> | Order items by property values, see [OData Sorting](http://docs.oasis-open.org/odata/odata/v4.01/odata-v4.01-part1-protocol.html#sec_SystemQueryOptionorderby)
        List<String> select = Arrays.asList(""); // List<String> | Select properties to be returned, see [OData Select](http://docs.oasis-open.org/odata/odata/v4.01/odata-v4.01-part1-protocol.html#sec_SystemQueryOptionselect)
        List<String> expand = Arrays.asList("to_Item,to_Partner,to_PaymentPlanItemDetails,to_PricingElement,to_Text"); // List<String> | Expand related entities, see [OData Expand](http://docs.oasis-open.org/odata/odata/v4.01/odata-v4.01-part1-protocol.html#sec_SystemQueryOptionexpand)
        try {
            Wrapper result = apiInstance.aSalesOrderGet(top, skip, filter, inlinecount, orderby, select, expand);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ASalesOrderApi#aSalesOrderGet");
            System.err.println("API Response : \n"+e.getResponseBody()); 
        }
        
        
        
        //===============================================================================================
        final ErpConfigContext configContext = new ErpConfigContext();
        try {
        	//configContext.
			final List<SalesOrder> salesOrders = ODataQueryBuilder
			        .withEntity("/sap/opu/odata/sap/API_SALES_ORDER_SRV",
			                "A_SalesOrder")
			        .select("SalesOrder",
			                "SalesOrderType",
			                "SalesOrganization",
			                "DistributionChannel",
			                "SoldToParty",
			                "TotalNetAmount")
			        .build()
			        .execute(configContext)
			        .asList(SalesOrder.class);
			System.out.println(salesOrders.toString());
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ODataException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
