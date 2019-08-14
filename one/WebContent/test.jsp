<%@ page import="java.io.BufferedReader,com.google.api.client.auth.oauth2.Credential,
 com.google.api.client.googleapis.auth.oauth2.GoogleAuthorizationCodeFlow,
 com.google.api.client.googleapis.auth.oauth2.GoogleClientSecrets,
 com.google.api.client.googleapis.batch.BatchRequest,
 com.google.api.client.googleapis.batch.json.JsonBatchCallback,
 com.google.api.client.googleapis.javanet.GoogleNetHttpTransport,
 com.google.api.client.googleapis.json.GoogleJsonError,
 com.google.api.client.http.HttpHeaders,
 com.google.api.client.http.HttpTransport,
 com.google.api.client.json.JsonFactory,
 com.google.api.client.json.jackson2.JacksonFactory,
 com.google.api.client.util.DateTime,
 com.google.api.client.util.Lists,
 com.google.api.client.util.store.DataStoreFactory,
 com.google.api.client.util.store.FileDataStoreFactory,
 com.google.api.services.calendar.CalendarScopes,
 com.google.api.services.calendar.model.Calendar,
 com.google.api.services.calendar.model.CalendarList,
 com.google.api.services.calendar.model.Event,
 com.google.api.services.calendar.model.EventDateTime,
 com.google.api.services.calendar.model.Events,
 com.google.api.client.auth.oauth2.AuthorizationCodeFlow,
 com.google.api.client.extensions.appengine.auth.oauth2.AbstractAppEngineAuthorizationCodeServlet,
 com.google.appengine.api.users.UserService,
 com.google.appengine.api.users.UserServiceFactory,
com.google.api.client.googleapis.auth.oauth2.GoogleIdToken,
com.google.api.client.googleapis.auth.oauth2.GoogleIdTokenVerifier,
 com.google.api.client.http.javanet.NetHttpTransport,



 java.util.Enumeration,
 java.io.IOException,
 java.io.InputStreamReader,
 java.util.Collections,
 java.util.Date,
 java.util.TimeZone" %>
<%! 


%>



<%@ page contentType="text/html; charset=ISO-8859-1" %>
Hello--1234
<% 
{
	Enumeration headNames = request.getHeaderNames();
	/* while(headNames.hasMoreElements()){
		String header = (String)headNames.nextElement();
		System.out.println(header + " ------- "+request.getHeader(header));
	} */
	System.out.println("Auth Type : "+request.getAuthType());
	String auth = request.getHeader("authorization");
	System.out.println("authorization: "+ auth);
	System.out.println(auth.substring(auth.indexOf("Bearer ")+ 7));
	String GOOGLE_CLIENT_ID="817994088204-d32tt7v874054gkqhebnvhk64eapn2o7.apps.googleusercontent.com";
	System.out.println(request.toString());
UserService userService = UserServiceFactory.getUserService();
String id_Token = request.getParameter("id_token");


JacksonFactory jacksonFactory = new JacksonFactory();
    GoogleIdTokenVerifier googleIdTokenVerifier =
                        new GoogleIdTokenVerifier(new NetHttpTransport(), jacksonFactory);
    id_Token=auth.substring(auth.indexOf("Bearer "+7));
    System.out.println("id_Token: "+id_Token);
    System.out.println(request.getParameter("access_token"));
    GoogleIdToken token = GoogleIdToken.parse(jacksonFactory, request.getParameter("access_token"));

    if (googleIdTokenVerifier.verify(token)) {
        GoogleIdToken.Payload payload = token.getPayload();
        if (!GOOGLE_CLIENT_ID.equals(payload.getAudience())) {
            throw new IllegalArgumentException("Audience mismatch");
        } else if (!GOOGLE_CLIENT_ID.equals(payload.getAuthorizedParty())) {
            throw new IllegalArgumentException("Client ID mismatch");
        }
        //return payload;
    } else {
        throw new IllegalArgumentException("id token cannot be verified");
    }

            GoogleIdToken.Payload payLoad = token.getPayload();
            String name = (String) payLoad.get("name");
            String email = payLoad.getEmail();
            System.out.println("User name: " + name);
            System.out.println("User email: " + email);

            session.setAttribute("userName", name);

System.out.println("Hello--");
}
%>