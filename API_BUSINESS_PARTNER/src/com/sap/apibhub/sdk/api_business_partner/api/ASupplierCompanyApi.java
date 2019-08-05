/*
 * OData Service for Business Partner
 * This service enables you to create, read, update, and    delete master data related to Business Partners,    Suppliers, and Customers in an SAP S/4HANA system.
 *
 * OpenAPI spec version: 1 
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.sap.apibhub.sdk.api_business_partner.api;

import com.sap.apibhub.sdk.client.ApiCallback;
import com.sap.apibhub.sdk.client.ApiClient;
import com.sap.apibhub.sdk.client.ApiException;
import com.sap.apibhub.sdk.client.ApiResponse;
import com.sap.apibhub.sdk.client.Configuration;
import com.sap.apibhub.sdk.client.Pair;
import com.sap.apibhub.sdk.client.ProgressRequestBody;
import com.sap.apibhub.sdk.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.sap.apibhub.sdk.api_business_partner.model.APIBUSINESSPARTNERASupplierCompanyType;
import com.sap.apibhub.sdk.api_business_partner.model.CreatedASupplierCompanyType;
import com.sap.apibhub.sdk.api_business_partner.model.ModifiedASupplierCompanyType;
import com.sap.apibhub.sdk.api_business_partner.model.OdataError;
import com.sap.apibhub.sdk.api_business_partner.model.Wrapper22;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ASupplierCompanyApi {
    private ApiClient apiClient;

    public ASupplierCompanyApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ASupplierCompanyApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for aSupplierCompanyGet */
    private com.squareup.okhttp.Call aSupplierCompanyGetCall(Integer top, Integer skip, String filter, String inlinecount, List<String> orderby, List<String> select, List<String> expand, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/A_SupplierCompany".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (top != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "$top", top));
        if (skip != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "$skip", skip));
        if (filter != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "$filter", filter));
        if (inlinecount != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "$inlinecount", inlinecount));
        if (orderby != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "$orderby", orderby));
        if (select != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "$select", select));
        if (expand != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "$expand", expand));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {"APIBHUB_SANDBOX_APIKEY", "basicAuthentication" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call aSupplierCompanyGetValidateBeforeCall(Integer top, Integer skip, String filter, String inlinecount, List<String> orderby, List<String> select, List<String> expand, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        
        com.squareup.okhttp.Call call = aSupplierCompanyGetCall(top, skip, filter, inlinecount, orderby, select, expand, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get entities from A_SupplierCompany
     * 
     * @param top Show only the first n items, see [OData Paging - Top](http://docs.oasis-open.org/odata/odata/v4.0/odata-v4.0-part1-protocol.html#_Toc445374630) (optional)
     * @param skip Skip the first n items, see [OData Paging - Skip](http://docs.oasis-open.org/odata/odata/v4.0/odata-v4.0-part1-protocol.html#_Toc445374631) (optional)
     * @param filter Filter items by property values, see [OData Filtering](http://docs.oasis-open.org/odata/odata/v4.0/odata-v4.0-part1-protocol.html#_Toc445374625) (optional)
     * @param inlinecount Include count of items, see [OData Count](http://www.odata.org/documentation/odata-version-2-0/uri-conventions/#InlinecountSystemQueryOption) (optional)
     * @param orderby Order items by property values, see [OData Sorting](http://docs.oasis-open.org/odata/odata/v4.0/odata-v4.0-part1-protocol.html#_Toc445374629) (optional)
     * @param select Select properties to be returned, see [OData Select](http://docs.oasis-open.org/odata/odata/v4.0/odata-v4.0-part1-protocol.html#_Toc445374620) (optional)
     * @param expand Expand related entities, see [OData Expand](http://docs.oasis-open.org/odata/odata/v4.0/odata-v4.0-part1-protocol.html#_Toc445374621) (optional)
     * @return Wrapper22
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Wrapper22 aSupplierCompanyGet(Integer top, Integer skip, String filter, String inlinecount, List<String> orderby, List<String> select, List<String> expand) throws ApiException {
        ApiResponse<Wrapper22> resp = aSupplierCompanyGetWithHttpInfo(top, skip, filter, inlinecount, orderby, select, expand);
        return resp.getData();
    }

    /**
     * Get entities from A_SupplierCompany
     * 
     * @param top Show only the first n items, see [OData Paging - Top](http://docs.oasis-open.org/odata/odata/v4.0/odata-v4.0-part1-protocol.html#_Toc445374630) (optional)
     * @param skip Skip the first n items, see [OData Paging - Skip](http://docs.oasis-open.org/odata/odata/v4.0/odata-v4.0-part1-protocol.html#_Toc445374631) (optional)
     * @param filter Filter items by property values, see [OData Filtering](http://docs.oasis-open.org/odata/odata/v4.0/odata-v4.0-part1-protocol.html#_Toc445374625) (optional)
     * @param inlinecount Include count of items, see [OData Count](http://www.odata.org/documentation/odata-version-2-0/uri-conventions/#InlinecountSystemQueryOption) (optional)
     * @param orderby Order items by property values, see [OData Sorting](http://docs.oasis-open.org/odata/odata/v4.0/odata-v4.0-part1-protocol.html#_Toc445374629) (optional)
     * @param select Select properties to be returned, see [OData Select](http://docs.oasis-open.org/odata/odata/v4.0/odata-v4.0-part1-protocol.html#_Toc445374620) (optional)
     * @param expand Expand related entities, see [OData Expand](http://docs.oasis-open.org/odata/odata/v4.0/odata-v4.0-part1-protocol.html#_Toc445374621) (optional)
     * @return ApiResponse&lt;Wrapper22&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Wrapper22> aSupplierCompanyGetWithHttpInfo(Integer top, Integer skip, String filter, String inlinecount, List<String> orderby, List<String> select, List<String> expand) throws ApiException {
        com.squareup.okhttp.Call call = aSupplierCompanyGetValidateBeforeCall(top, skip, filter, inlinecount, orderby, select, expand, null, null);
        Type localVarReturnType = new TypeToken<Wrapper22>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get entities from A_SupplierCompany (asynchronously)
     * 
     * @param top Show only the first n items, see [OData Paging - Top](http://docs.oasis-open.org/odata/odata/v4.0/odata-v4.0-part1-protocol.html#_Toc445374630) (optional)
     * @param skip Skip the first n items, see [OData Paging - Skip](http://docs.oasis-open.org/odata/odata/v4.0/odata-v4.0-part1-protocol.html#_Toc445374631) (optional)
     * @param filter Filter items by property values, see [OData Filtering](http://docs.oasis-open.org/odata/odata/v4.0/odata-v4.0-part1-protocol.html#_Toc445374625) (optional)
     * @param inlinecount Include count of items, see [OData Count](http://www.odata.org/documentation/odata-version-2-0/uri-conventions/#InlinecountSystemQueryOption) (optional)
     * @param orderby Order items by property values, see [OData Sorting](http://docs.oasis-open.org/odata/odata/v4.0/odata-v4.0-part1-protocol.html#_Toc445374629) (optional)
     * @param select Select properties to be returned, see [OData Select](http://docs.oasis-open.org/odata/odata/v4.0/odata-v4.0-part1-protocol.html#_Toc445374620) (optional)
     * @param expand Expand related entities, see [OData Expand](http://docs.oasis-open.org/odata/odata/v4.0/odata-v4.0-part1-protocol.html#_Toc445374621) (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call aSupplierCompanyGetAsync(Integer top, Integer skip, String filter, String inlinecount, List<String> orderby, List<String> select, List<String> expand, final ApiCallback<Wrapper22> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = aSupplierCompanyGetValidateBeforeCall(top, skip, filter, inlinecount, orderby, select, expand, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Wrapper22>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for aSupplierCompanyPost */
    private com.squareup.okhttp.Call aSupplierCompanyPostCall(APIBUSINESSPARTNERASupplierCompanyType aSupplierCompanyType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = aSupplierCompanyType;
        
        // create path and map variables
        String localVarPath = "/A_SupplierCompany".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {"APIBHUB_SANDBOX_APIKEY", "basicAuthentication" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call aSupplierCompanyPostValidateBeforeCall(APIBUSINESSPARTNERASupplierCompanyType aSupplierCompanyType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        
        com.squareup.okhttp.Call call = aSupplierCompanyPostCall(aSupplierCompanyType, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Add new entity to A_SupplierCompany
     * 
     * @param aSupplierCompanyType New entity (optional)
     * @return CreatedASupplierCompanyType
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CreatedASupplierCompanyType aSupplierCompanyPost(APIBUSINESSPARTNERASupplierCompanyType aSupplierCompanyType) throws ApiException {
        ApiResponse<CreatedASupplierCompanyType> resp = aSupplierCompanyPostWithHttpInfo(aSupplierCompanyType);
        return resp.getData();
    }

    /**
     * Add new entity to A_SupplierCompany
     * 
     * @param aSupplierCompanyType New entity (optional)
     * @return ApiResponse&lt;CreatedASupplierCompanyType&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CreatedASupplierCompanyType> aSupplierCompanyPostWithHttpInfo(APIBUSINESSPARTNERASupplierCompanyType aSupplierCompanyType) throws ApiException {
        com.squareup.okhttp.Call call = aSupplierCompanyPostValidateBeforeCall(aSupplierCompanyType, null, null);
        Type localVarReturnType = new TypeToken<CreatedASupplierCompanyType>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Add new entity to A_SupplierCompany (asynchronously)
     * 
     * @param aSupplierCompanyType New entity (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call aSupplierCompanyPostAsync(APIBUSINESSPARTNERASupplierCompanyType aSupplierCompanyType, final ApiCallback<CreatedASupplierCompanyType> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = aSupplierCompanyPostValidateBeforeCall(aSupplierCompanyType, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CreatedASupplierCompanyType>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for aSupplierCompanySupplierSupplierCompanyCodeCompanyCodeGet */
    private com.squareup.okhttp.Call aSupplierCompanySupplierSupplierCompanyCodeCompanyCodeGetCall(String supplier, String companyCode, List<String> select, List<String> expand, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/A_SupplierCompany(Supplier='{Supplier}',CompanyCode='{CompanyCode}')".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "Supplier" + "\\}", apiClient.escapeString(supplier.toString()))
        .replaceAll("\\{" + "CompanyCode" + "\\}", apiClient.escapeString(companyCode.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (select != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "$select", select));
        if (expand != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "$expand", expand));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {"APIBHUB_SANDBOX_APIKEY", "basicAuthentication" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call aSupplierCompanySupplierSupplierCompanyCodeCompanyCodeGetValidateBeforeCall(String supplier, String companyCode, List<String> select, List<String> expand, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'supplier' is set
        if (supplier == null) {
            throw new ApiException("Missing the required parameter 'supplier' when calling aSupplierCompanySupplierSupplierCompanyCodeCompanyCodeGet(Async)");
        }
        
        // verify the required parameter 'companyCode' is set
        if (companyCode == null) {
            throw new ApiException("Missing the required parameter 'companyCode' when calling aSupplierCompanySupplierSupplierCompanyCodeCompanyCodeGet(Async)");
        }
        
        
        com.squareup.okhttp.Call call = aSupplierCompanySupplierSupplierCompanyCodeCompanyCodeGetCall(supplier, companyCode, select, expand, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get entity from A_SupplierCompany by key
     * 
     * @param supplier Account Number of Supplier   Specifies an alphanumeric key that uniquely identifies the supplier in the SAP system. (required)
     * @param companyCode The company code is an organizational unit within financial accounting. (required)
     * @param select Select properties to be returned, see [OData Select](http://docs.oasis-open.org/odata/odata/v4.0/odata-v4.0-part1-protocol.html#_Toc445374620) (optional)
     * @param expand Expand related entities, see [OData Expand](http://docs.oasis-open.org/odata/odata/v4.0/odata-v4.0-part1-protocol.html#_Toc445374621) (optional)
     * @return CreatedASupplierCompanyType
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CreatedASupplierCompanyType aSupplierCompanySupplierSupplierCompanyCodeCompanyCodeGet(String supplier, String companyCode, List<String> select, List<String> expand) throws ApiException {
        ApiResponse<CreatedASupplierCompanyType> resp = aSupplierCompanySupplierSupplierCompanyCodeCompanyCodeGetWithHttpInfo(supplier, companyCode, select, expand);
        return resp.getData();
    }

    /**
     * Get entity from A_SupplierCompany by key
     * 
     * @param supplier Account Number of Supplier   Specifies an alphanumeric key that uniquely identifies the supplier in the SAP system. (required)
     * @param companyCode The company code is an organizational unit within financial accounting. (required)
     * @param select Select properties to be returned, see [OData Select](http://docs.oasis-open.org/odata/odata/v4.0/odata-v4.0-part1-protocol.html#_Toc445374620) (optional)
     * @param expand Expand related entities, see [OData Expand](http://docs.oasis-open.org/odata/odata/v4.0/odata-v4.0-part1-protocol.html#_Toc445374621) (optional)
     * @return ApiResponse&lt;CreatedASupplierCompanyType&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CreatedASupplierCompanyType> aSupplierCompanySupplierSupplierCompanyCodeCompanyCodeGetWithHttpInfo(String supplier, String companyCode, List<String> select, List<String> expand) throws ApiException {
        com.squareup.okhttp.Call call = aSupplierCompanySupplierSupplierCompanyCodeCompanyCodeGetValidateBeforeCall(supplier, companyCode, select, expand, null, null);
        Type localVarReturnType = new TypeToken<CreatedASupplierCompanyType>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get entity from A_SupplierCompany by key (asynchronously)
     * 
     * @param supplier Account Number of Supplier   Specifies an alphanumeric key that uniquely identifies the supplier in the SAP system. (required)
     * @param companyCode The company code is an organizational unit within financial accounting. (required)
     * @param select Select properties to be returned, see [OData Select](http://docs.oasis-open.org/odata/odata/v4.0/odata-v4.0-part1-protocol.html#_Toc445374620) (optional)
     * @param expand Expand related entities, see [OData Expand](http://docs.oasis-open.org/odata/odata/v4.0/odata-v4.0-part1-protocol.html#_Toc445374621) (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call aSupplierCompanySupplierSupplierCompanyCodeCompanyCodeGetAsync(String supplier, String companyCode, List<String> select, List<String> expand, final ApiCallback<CreatedASupplierCompanyType> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = aSupplierCompanySupplierSupplierCompanyCodeCompanyCodeGetValidateBeforeCall(supplier, companyCode, select, expand, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CreatedASupplierCompanyType>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for aSupplierCompanySupplierSupplierCompanyCodeCompanyCodePatch */
    private com.squareup.okhttp.Call aSupplierCompanySupplierSupplierCompanyCodeCompanyCodePatchCall(String supplier, String companyCode, ModifiedASupplierCompanyType aSupplierCompanyType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = aSupplierCompanyType;
        
        // create path and map variables
        String localVarPath = "/A_SupplierCompany(Supplier='{Supplier}',CompanyCode='{CompanyCode}')".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "Supplier" + "\\}", apiClient.escapeString(supplier.toString()))
        .replaceAll("\\{" + "CompanyCode" + "\\}", apiClient.escapeString(companyCode.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {"APIBHUB_SANDBOX_APIKEY", "basicAuthentication" };
        return apiClient.buildCall(localVarPath, "PATCH", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call aSupplierCompanySupplierSupplierCompanyCodeCompanyCodePatchValidateBeforeCall(String supplier, String companyCode, ModifiedASupplierCompanyType aSupplierCompanyType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'supplier' is set
        if (supplier == null) {
            throw new ApiException("Missing the required parameter 'supplier' when calling aSupplierCompanySupplierSupplierCompanyCodeCompanyCodePatch(Async)");
        }
        
        // verify the required parameter 'companyCode' is set
        if (companyCode == null) {
            throw new ApiException("Missing the required parameter 'companyCode' when calling aSupplierCompanySupplierSupplierCompanyCodeCompanyCodePatch(Async)");
        }
        
        
        com.squareup.okhttp.Call call = aSupplierCompanySupplierSupplierCompanyCodeCompanyCodePatchCall(supplier, companyCode, aSupplierCompanyType, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Update entity in A_SupplierCompany
     * 
     * @param supplier Account Number of Supplier   Specifies an alphanumeric key that uniquely identifies the supplier in the SAP system. (required)
     * @param companyCode The company code is an organizational unit within financial accounting. (required)
     * @param aSupplierCompanyType New property values (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void aSupplierCompanySupplierSupplierCompanyCodeCompanyCodePatch(String supplier, String companyCode, ModifiedASupplierCompanyType aSupplierCompanyType) throws ApiException {
        aSupplierCompanySupplierSupplierCompanyCodeCompanyCodePatchWithHttpInfo(supplier, companyCode, aSupplierCompanyType);
    }

    /**
     * Update entity in A_SupplierCompany
     * 
     * @param supplier Account Number of Supplier   Specifies an alphanumeric key that uniquely identifies the supplier in the SAP system. (required)
     * @param companyCode The company code is an organizational unit within financial accounting. (required)
     * @param aSupplierCompanyType New property values (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> aSupplierCompanySupplierSupplierCompanyCodeCompanyCodePatchWithHttpInfo(String supplier, String companyCode, ModifiedASupplierCompanyType aSupplierCompanyType) throws ApiException {
        com.squareup.okhttp.Call call = aSupplierCompanySupplierSupplierCompanyCodeCompanyCodePatchValidateBeforeCall(supplier, companyCode, aSupplierCompanyType, null, null);
        return apiClient.execute(call);
    }

    /**
     * Update entity in A_SupplierCompany (asynchronously)
     * 
     * @param supplier Account Number of Supplier   Specifies an alphanumeric key that uniquely identifies the supplier in the SAP system. (required)
     * @param companyCode The company code is an organizational unit within financial accounting. (required)
     * @param aSupplierCompanyType New property values (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call aSupplierCompanySupplierSupplierCompanyCodeCompanyCodePatchAsync(String supplier, String companyCode, ModifiedASupplierCompanyType aSupplierCompanyType, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = aSupplierCompanySupplierSupplierCompanyCodeCompanyCodePatchValidateBeforeCall(supplier, companyCode, aSupplierCompanyType, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}
