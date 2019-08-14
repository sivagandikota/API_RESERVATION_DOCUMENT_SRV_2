package com;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext;

public class CustInqClient {

	public static void main(String[] args) {
		Zb2BCustInqService service = new Zb2BCustInqService();
		ZB2BCUSTINQ port = service.getZb2BCustInqPort();
		Map<String, List<String>> credentials = new HashMap<String,List<String>>();

		 credentials.put("username", Collections.singletonList("BHF_COMM"));
		 credentials.put("password", Collections.singletonList("nBhLsiwWXmfwqmX)FDLRUA6SwdCitAXUswwZwLqX"));
		 credentials.put("Authorization", Collections.singletonList("Basic QkhGX0NPTU06bkJoTHNpd1dYbWZ3cW1YKUZETFJVQTZTd2RDaXRBWFVzd3dad0xxWA=="));
		 
		 
		 ((BindingProvider)port).getRequestContext().put(MessageContext.HTTP_REQUEST_HEADERS, credentials);
		try {
			Zb2BCustInqWrapper wrapper = port.getCustomerValidation("SIVA G");
			System.out.println(wrapper.toString());
		} catch (Exception_Exception e) {
			e.printStackTrace();
		}
	}

}
