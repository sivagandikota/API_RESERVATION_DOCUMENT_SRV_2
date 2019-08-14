<%@ page import="java.util.*,
com.sap.cloud.security.oauth2.*
" %>
<%
String clientId ="622d8740-df0c-3e23-9ecd-6b32d59780cc";
OAuthAuthorization authAuthorization = OAuthAuthorization.getOAuthAuthorizationService();
try {
  if(!authAuthorization.isAuthorized(request, "HelloWorldScope")){
    response.sendError(403, "You have no permissions to execute this call.");
  } else {
    response.addHeader("Content-Type", "application/json");
    response.getWriter().println("{ \"Greeting\": \"Hello World!\" }");
  }
} catch (OAuthSystemException e) {
// TODO Auto-generated catch block
  response.sendError(403, "Exception during scope check. You have no permissions to execute this call");
}
%>
Hello SAP