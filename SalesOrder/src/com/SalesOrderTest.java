package com;

import java.net.URL;
import java.net.URLConnection;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.xml.namespace.QName;

import org.apache.cxf.ext.logging.LoggingFeature;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.slf4j.Logger;

import com.sap.xi.sd.Address;
import com.sap.xi.sd.Partner;
import com.sap.xi.sd.global2.BusinessDocumentMessageHeader;
import com.sap.xi.sd_sls.SalesOrderBulkMessage;
import com.sap.xi.sd_sls.SalesOrderBulkRequestIn;
import com.sap.xi.sd_sls.SalesOrderItem;
import com.sap.xi.sd_sls.Service;

public class SalesOrderTest {
	public static Logger log = org.slf4j.LoggerFactory.getLogger(SalesOrderTest.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			Set<com.sap.xi.sd_sls.SalesOrderItem> salOrdLi= new HashSet();
			SalesOrderItem sali = new SalesOrderItem();
			SalesOrderItem ol_sali = new SalesOrderItem();
			Partner bp = new Partner();
			Address addr = new Address();
			Long salesId = new Long(-1);
			Long ol_saliId = new Long(-1);
			 Partner bpSalOrdI;
	        
	        
			 URL baseUrl = new URL("https://my301713-api.s4hana.ondemand.com/sap/bc/srt/scs/sap/salesorderbulkrequest_in?sap-client=100");
			 URL url = new URL("file:C:\\Users\\sivag\\eclipse-workspace1\\SalesOrder\\src\\com\\salesorder.wsdl");
			 URLConnection con = baseUrl.openConnection();
			 con.addRequestProperty("Authorization", "Basic bWV1c2VyOm5HYnVaY0djS0hBNXR+VkRrQnVib0tZTkREWGF0cmhWc1hBU3hGalAK");
			 /*com.sap.xi.sd_sls.Service ss = new Service(url, new QName("http://sap.com/xi/SD-SLS", "service"));
		        SalesOrderBulkRequestIn port = ss.getBindingSoap12();*/
		        
		        System.out.println("Invoking salesOrderBulkRequestIn...");
		        /*com.sap.xi.sd_sls.SalesOrderBulkMessage _salesOrderBulkRequestIn_salesOrderBulkRequest = null;
		        port.salesOrderBulkRequestIn(_salesOrderBulkRequestIn_salesOrderBulkRequest);*/
	        
	        
	        JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
	        factory.getFeatures().add(new LoggingFeature());
	        //factory.setAddress("http://localhost:8080/Person/ws/SalesOrder?wsdl");
	        //factory.setAddress("https://my301713-api.s4hana.ondemand.com/sap/bc/srt/scs/sap/salesorderbulkrequest_in?sap-client=100");
	        factory.setAddress("https://my301713-api.s4hana.ondemand.com/sap/bc/srt/scs/sap/salesorderbulkrequest_in?sap-client=100");
	        factory.setUsername("meuser");
	        factory.setPassword("nGbuZcGcKHA5t~VDkBuboKYNDDXatrhVsXASxFjP");
	        //factory.setWsdlURL("file:C:\\Users\\sivag\\eclipse-workspace1\\SalesOrder\\src\\com\\salesorder.wsdl");
	        factory.setEndpointName(new QName("http://sap.com/xi/SD-SLS", "binding_soap12"));
	        factory.setServiceClass(com.sap.xi.sd_sls.Service.class);
	        //factory.setServiceClass(com.sap.xi.sd_sls.Binding_Soap12Impl.class);
	        factory.setServiceName(new QName("http://sap.com/xi/SD-SLS", "service"));
	        //factory.setBindingId("binding_soap12");
	        //factory.set
	        
	        //System.out.println(factory.create(com.sap.xi.sd_sls.SalesOrderBulkRequestIn.class).getClass().getAnnotatedInterfaces());
	        //factory.create(com.sap.xi.sd_sls.SalesOrderBulkRequestIn.class)
	        com.sap.xi.sd_sls.SalesOrderBulkRequestIn service = factory.create(com.sap.xi.sd_sls.SalesOrderBulkRequestIn.class);
	        //SalesOrderBulkRequestIn por = service.salesOrderBulkRequestIn(null);//getBindingSoap12();
	        log.error("before set...");
	        System.out.println("-----Hooo-----");
	        SalesOrderBulkMessage msg = new SalesOrderBulkMessage();
	        msg.setMessageHeader(new BusinessDocumentMessageHeader());
	        service.salesOrderBulkRequestIn(msg);
	        
	        //client.getBindingSoap12().salesOrderBulkRequestIn(null);
	        
	        
	        /*model.SalesOrder sal=new model.SalesOrder();
	        sal.setCreatedByUser("Siva.Gandikota");
	        sal.setCreationDate(new Timestamp(new java.util.Date().getTime()));
	        //sal.setId((long)1); 			//System generated
	        salOrdLi=sal.getSalesOrderItem();

	        sali = new model.SalesOrderItem();
	        sali.setBatch("Insert");
	        bpSalOrdI= new model.BusinessPartner();
	        bpSalOrdI.setContactPerson("SivaG bp Hi");
	        sali.setBusinessPartner(bpSalOrdI);
	        addr = new model.Addresse();
	        addr.setAddress1("address1");
	        sali.setAddresse(addr);
	        salOrdLi.add(sali);
	        salesId=client.create(sal);
	        
	        sal=client.get(salesId);
	        salOrdLi=new HashSet();
	        //ol_saliId = salOrdLi.iterator().next().getId();
	        sali = new model.SalesOrderItem();
	        //sali.setSalesOrder(sal); 		//Not required as eclipse link does the bi-directional mapping
	        sali.setBatch("First Batch");
	        salOrdLi.add(sali);
	        sali = new model.SalesOrderItem();
	        sali.setBatch("Second Batch");
	        bpSalOrdI= new model.BusinessPartner();
	        bpSalOrdI.setContactPerson("SivaG bp Hi");
	        sali.setBusinessPartner(bpSalOrdI);
	        salOrdLi.add(sali);
	        sal.setSalesOrderItem(salOrdLi);
	        bp.setContactPerson("SivaG");
	        sal.setBusinessPartner(bp);
	        model.ScheduleLine sl = new model.ScheduleLine();
	        sl.setScheduleLine("Only one");
	        sal.setScheduleLine(sl);
	        client.update(sal);
*/	        
	        /*sal=client.get(salesId);
	        sal.getSalesOrderItem().*/
	        
	        
	        //client.delete(salesId);
	        
		}catch(Exception e) {e.printStackTrace();}

	}

}
