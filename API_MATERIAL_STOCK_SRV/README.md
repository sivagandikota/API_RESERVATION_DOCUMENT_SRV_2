## This source has been genereated using swagger codegen (https://github.com/swagger-api/swagger-codegen/tree/v2.2.2)

# API_MATERIAL_STOCK_SRV

## In case if you want to customize or enhance the generated project, import the project to an IDE of your choice and then follow the instructions given below to build, deploy and consume the library. 

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, execute the following command:

```shell
mvn install
```

To deploy the API client library to a remote Maven repository, configure the settings of the repository and execute the following command:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add the following dependency to your project's POM:

```xml
<dependency>
    <groupId>com_sap_apibhub</groupId>
    <artifactId>API_MATERIAL_STOCK_SRV</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add the following dependency to your project's build file:

```groovy
compile "com_sap_apibhub:API_MATERIAL_STOCK_SRV:1.0.0"
```

### Others

Generate the JAR by executing the following command:

    mvn package

Manually install the following JARs:

* target/API_MATERIAL_STOCK_SRV-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instructions given above and execute the following sample Java code to consume an API:

```java

import com.sap.apibhub.sdk.client.*;
import com.sap.apibhub.sdk.client.auth.*;
import com.sap.apibhub.sdk.api_material_stock_srv.model.*;
import com.sap.apibhub.sdk.api_material_stock_srv.api.AMaterialStockApi;

import java.io.File;
import java.util.*;

public class AMaterialStockApiExample {

    public static void main(String[] args) {
    
		ApiClient defaultClient = Configuration.getDefaultApiClient(); 
		Map<String, Authentication> authentications = defaultClient.getAuthentications();       
		
		//Currently Base Path points to sandbox system, change it to call your API Endpoint
		defaultClient.setBasePath("https://sandbox.api.sap.com/s4hanacloud/sap/opu/odata/sap/API_MATERIAL_STOCK_SRV");
		//You can obtain your API key on the Settings page of SAP API Business Hub. In the Settings page, choose the Show API Key toggle button to display and copy your API key. You have to be logged in to view your API Key.
		defaultClient.addDefaultHeader("APIKey","<YOUR APIBHUB SANDBOX APIKEY>"); 		
		authentications.put("APIBHUB_SANDBOX_APIKEY", new ApiKeyAuth("header", "APIKey"));
		            
        
		//Change Base Path, uncomment below code and configure Basic Authorization to call your API Endpoint: basicAuthentication
		authentications.put("basicAuthentication", new HttpBasicAuth());
		/*
		HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("basicAuthentication");
		basicAuthentication.setUsername("<YOUR_USERNAME>");
		basicAuthentication.setPassword("<YOUR_PASSWORD>");
		*/		
        AMaterialStockApi apiInstance = new AMaterialStockApi();
        apiInstance.setApiClient(defaultClient);
        Integer top = 56; // Integer | Show only the first n items, see [OData Paging - Top](http://docs.oasis-open.org/odata/odata/v4.0/odata-v4.0-part1-protocol.html#_Toc445374630)
        Integer skip = 56; // Integer | Skip the first n items, see [OData Paging - Skip](http://docs.oasis-open.org/odata/odata/v4.0/odata-v4.0-part1-protocol.html#_Toc445374631)
        String filter = "filter_example"; // String | Filter items by property values, see [OData Filtering](http://docs.oasis-open.org/odata/odata/v4.0/odata-v4.0-part1-protocol.html#_Toc445374625)
        String inlinecount = "inlinecount_example"; // String | Include count of items, see [OData Count](http://www.odata.org/documentation/odata-version-2-0/uri-conventions/#InlinecountSystemQueryOption)
        List<String> orderby = Arrays.asList("orderby_example"); // List<String> | Order items by property values, see [OData Sorting](http://docs.oasis-open.org/odata/odata/v4.0/odata-v4.0-part1-protocol.html#_Toc445374629)
        List<String> select = Arrays.asList("select_example"); // List<String> | Select properties to be returned, see [OData Select](http://docs.oasis-open.org/odata/odata/v4.0/odata-v4.0-part1-protocol.html#_Toc445374620)
        List<String> expand = Arrays.asList("expand_example"); // List<String> | Expand related entities, see [OData Expand](http://docs.oasis-open.org/odata/odata/v4.0/odata-v4.0-part1-protocol.html#_Toc445374621)
        try {
            Wrapper result = apiInstance.aMaterialStockGet(top, skip, filter, inlinecount, orderby, select, expand);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AMaterialStockApi#aMaterialStockGet");
            System.err.println("API Response : \n"+e.getResponseBody()); 
        }
    }
}

```

## Documentation for Authorization


Authentication schemes defined for the API:
### basicAuthentication

- **Type**: HTTP basic authentication

 

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

