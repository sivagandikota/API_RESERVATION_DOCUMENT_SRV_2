<?xml version="1.0" encoding="ISO-8859-1" ?>

<%@page import="com.backblaze.b2.client.contentHandlers.B2ContentMemoryWriter"%>
<%@page import="com.backblaze.b2.client.structures.B2FileVersion"%>
<%@page import="com.backblaze.b2.client.contentSources.B2ContentTypes"%>
<%@page import="com.backblaze.b2.client.structures.B2UploadFileRequest"%>
<%@page import="java.io.File"%>
<%@page import="com.backblaze.b2.client.contentSources.B2FileContentSource"%>
<%@page import="com.backblaze.b2.client.contentSources.B2ContentSource"%>
<%@page import="com.backblaze.b2.client.structures.B2Bucket"%>
<%@page import="com.backblaze.b2.client.webApiHttpClient.HttpClientFactoryImpl"%>
<%@page import="com.backblaze.b2.client.webApiHttpClient.B2StorageHttpClientBuilder"%>
<%@page import="com.backblaze.b2.client.webApiHttpClient.HttpClientFactory"%>
<%@page import="java.util.concurrent.ExecutorService"%>
<%@page import="com.backblaze.b2.client.B2StorageClient"%>
<%@page import="java.io.InputStreamReader"%>
<%@page import="java.io.BufferedReader"%>
<jsp:directive.page language="java"	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" />
<jsp:directive.page import="javax.json.Json"/>
<jsp:directive.page import="javax.json.JsonObject"/>
<jsp:directive.page import="java.io.BufferedInputStream"/>
<jsp:directive.page import="java.io.InputStream"/>
<jsp:directive.page import="java.util.Base64"/>
<jsp:directive.page import="java.net.HttpURLConnection"/>
<jsp:directive.page import="java.net.CookieManager"/>
<jsp:directive.page import="java.net.CookieHandler"/>
<jsp:directive.page import="java.util.List"/>
<jsp:directive.page import="javax.net.ssl.HttpsURLConnection"/>
<jsp:directive.page import="java.util.Iterator"/>
<jsp:directive.page import="java.util.Set"/>
<jsp:directive.page import="java.net.URLConnection" />
<jsp:directive.page import="java.net.URL" />
<anyxmlelement xmlns:c="http://java.sun.com/jsp/jstl/core" />
	<jsp:text>
		<![CDATA[ <?xml version="1.0" encoding="ISO-8859-1" ?> ]]>
	</jsp:text>
	<jsp:text>
		<![CDATA[ <!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd"> ]]>
	</jsp:text>
	<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Insert title here</title>
<script language="javascript" type="text/javascript">
	
</script>
</head>
 
<body>
<PRE>  
  
    <jsp:scriptlet>
String base64Image="";
    String accountId = "870dae7d6ba2"; // Obtained from your B2 account page.
    String applicationKey = "002ee2eb98c6389e3ad7a715039002eb3ecb97c100"; // Obtained from your B2 account page.
    HttpURLConnection connection = null;
    String headerForAuthorizeAccount = "Basic " + Base64.getEncoder().encodeToString((accountId + ":" + applicationKey).getBytes());
    
    try {
    	//B2_ACCOUNT_ID and B2_APPLICATION_KEY
    	System.setProperty("B2_ACCOUNT_ID", accountId);
    	System.setProperty("B2_APPLICATION_KEY", applicationKey);
        URL url = new URL("https://api.backblazeb2.com/b2api/v2/b2_authorize_account");
        connection = (HttpURLConnection)url.openConnection();
        connection.setRequestMethod("GET");
        connection.setRequestProperty("Authorization", headerForAuthorizeAccount);
        InputStream in = new BufferedInputStream(connection.getInputStream());    
        String jsonResponse;// = myInputStreamReader(in);
        StringBuilder sb = new StringBuilder();
        /* int c = in.read();
        while (c != -1) {
            sb.append((char)c);
            c = in.read();
        }
        in.close();
        jsonResponse = sb.toString();
        System.out.println(jsonResponse); */
        JsonObject jsonObj = Json.createReader(in).readObject();
        System.out.println(jsonObj.toString());
        String apiUrl = jsonObj.get("apiUrl").toString();
        System.out.println("apiUrl  : " + apiUrl);
        String authorizationToken = jsonObj.getString("authorizationToken");
        out.println("authorizationToken  : " + authorizationToken);
        String downloadUrl = jsonObj.getString("downloadUrl");
        out.println("downloadUrl  : "+downloadUrl);
        
        
        byte downloadedData[] = null;
        url = new URL( downloadUrl +  "/b2api/v2/b2_download_file_by_id?fileId=4_z884770bd6aeec73d666b0a12_f1119b7b8c164afe3_d20181030_m062325_c002_v0001111_t0017");
        connection = (HttpURLConnection)url.openConnection();
        connection.setRequestMethod("GET");
        connection.setDoOutput(true);
        connection.addRequestProperty("Authorization", authorizationToken);
        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String line;
        while ((line = reader.readLine()) != null) {
            //out.println(line);   // add everything to StringBuilder
        }
        System.out.println(in);
        
        
        
        String appName = "b2_4j";
        String version = "0.0.1";
        String bucketName = "microcom";
        String userAgent = appName + "/" + version;
        B2StorageClient client;
        boolean showProgress = true;
        //private ExecutorService executor;
        
        HttpClientFactory httpClientFactory = HttpClientFactoryImpl
                .builder()
                .build();
        client = B2StorageHttpClientBuilder
                .builder(accountId,
                        applicationKey,userAgent)
                .setHttpClientFactory(httpClientFactory)
                .build();
        
        B2Bucket bucket=null; 
        for (B2Bucket buckket : client.buckets()) {
            if (buckket.getBucketName().equals(bucketName)) {
                bucket=buckket;
            }
        }
        String sha1 = "b5bb8ecb1d76f97811767cf64b4e2bdb1c6a390c";
        B2ContentSource source = B2FileContentSource
                .builder(new File("C:\\Users\\sivag\\Pictures\\SivaG.jpg"))
                //.setSha1(sha1)
                .build();
        
        
        B2UploadFileRequest uRequest = B2UploadFileRequest
        .builder(bucket.getBucketId(),
                "SivaG.jpg",
                B2ContentTypes.B2_AUTO,
                source)
        //.setCustomFields(infos)
        .build();
        
        //===================================================================
        //B2FileVersion vers = client.uploadSmallFile(uRequest);
        //===================================================================
        //fileId :  4_z884770bd6aeec73d666b0a12_f1049a98683309eba_d20181102_m083108_c002_v0001111_t0021
        //vers.
        
        B2ContentMemoryWriter sink = B2ContentMemoryWriter.build();
        //System.out.println("=================================");
        client.downloadById("4_z884770bd6aeec73d666b0a12_f1049a98683309eba_d20181102_m083108_c002_v0001111_t0021", sink);
        //System.out.println("=================================");
        base64Image=Base64.getEncoder().encodeToString(sink.getBytes());
        //System.out.println("================================="+base64Image);
        
    } catch (Exception e) {
        e.printStackTrace();
    } finally {
        connection.disconnect();
    }
	</jsp:scriptlet>
</PRE>
<PRE><img src="data:image/jpg;base64,<%=base64Image %>" width ="200px" height="200px" /></PRE>
	<button>Hello</button>
	<a onclick="" href="#">Hello-</a>
</body>
	</html>
