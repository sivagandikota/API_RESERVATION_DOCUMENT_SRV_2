
package com.sap.xi.sd_sls;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.2.6
 * 2018-11-21T10:16:43.533+05:30
 * Generated source version: 3.2.6
 *
 */
public final class SalesOrderBulkRequestIn_BindingSoap12_Client {

    private static final QName SERVICE_NAME = new QName("http://sap.com/xi/SD-SLS", "service");

    private SalesOrderBulkRequestIn_BindingSoap12_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = Service.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) {
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }

        Service ss = new Service(wsdlURL, SERVICE_NAME);
        SalesOrderBulkRequestIn port = ss.getBindingSoap12();

        {
        System.out.println("Invoking salesOrderBulkRequestIn...");
        com.sap.xi.sd_sls.SalesOrderBulkMessage _salesOrderBulkRequestIn_salesOrderBulkRequest = null;
        port.salesOrderBulkRequestIn(_salesOrderBulkRequestIn_salesOrderBulkRequest);


        }

        System.exit(0);
    }

}
