/*
 * Omega.API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.swagger.client.model.OmegaAPIAreasPublicModelsPublicExpenseModel;
import io.swagger.client.model.OmegaAPIAreasPublicModelsReponsesDefaultResponseOExpenseModel;
import io.swagger.client.model.OmegaAPIAreasPublicModelsReponsesDefaultResponseSystemCollectionsGenericIEnumerableOmegaAPIAreasPublicModelsPublicExpensePublicEpenseProductDetails;
import io.swagger.client.model.OmegaAPIAreasPublicModelsRequestModelsExpenseGetExpenseParametersRequest;
import io.swagger.client.model.OmegaAPIAreasPublicModelsRequestModelsPublicExpenseGetExpenseDetailsParametersRequest;
import io.swagger.client.model.OmegaAPIAreasPublicModelsRequestModelsPublicExpenseGetExpenseListParametersRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PublicExpenseApi {
    private ApiClient apiClient;

    public PublicExpenseApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PublicExpenseApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for publicExpenseGetExpenseDocument
     * @param model  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call publicExpenseGetExpenseDocumentCall(OmegaAPIAreasPublicModelsRequestModelsExpenseGetExpenseParametersRequest model, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = model;
        
        // create path and map variables
        String localVarPath = "/public/api/v1.0/expense/getExpenseDocument";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "text/json", "application/x-www-form-urlencoded"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call publicExpenseGetExpenseDocumentValidateBeforeCall(OmegaAPIAreasPublicModelsRequestModelsExpenseGetExpenseParametersRequest model, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'model' is set
        if (model == null) {
            throw new ApiException("Missing the required parameter 'model' when calling publicExpenseGetExpenseDocument(Async)");
        }
        
        
        com.squareup.okhttp.Call call = publicExpenseGetExpenseDocumentCall(model, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Получает расходную накладную.
     * curl -H \&quot;Content-Type: application/json\&quot; -XPOST \&quot;https://public.omega.page/public/api/v1.0/expense/getExpenseDocument\&quot; -d \&quot;  {      \&quot;Key\&quot;: \&quot;RQzSCdY99JgV0kMtSYx0KTcE9bdWmhai\&quot;,      \&quot;DocId\&quot; : \&quot;test\&quot;,  }\&quot;
     * @param model  (required)
     * @return OmegaAPIAreasPublicModelsPublicExpenseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public OmegaAPIAreasPublicModelsPublicExpenseModel publicExpenseGetExpenseDocument(OmegaAPIAreasPublicModelsRequestModelsExpenseGetExpenseParametersRequest model) throws ApiException {
        ApiResponse<OmegaAPIAreasPublicModelsPublicExpenseModel> resp = publicExpenseGetExpenseDocumentWithHttpInfo(model);
        return resp.getData();
    }

    /**
     * Получает расходную накладную.
     * curl -H \&quot;Content-Type: application/json\&quot; -XPOST \&quot;https://public.omega.page/public/api/v1.0/expense/getExpenseDocument\&quot; -d \&quot;  {      \&quot;Key\&quot;: \&quot;RQzSCdY99JgV0kMtSYx0KTcE9bdWmhai\&quot;,      \&quot;DocId\&quot; : \&quot;test\&quot;,  }\&quot;
     * @param model  (required)
     * @return ApiResponse&lt;OmegaAPIAreasPublicModelsPublicExpenseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<OmegaAPIAreasPublicModelsPublicExpenseModel> publicExpenseGetExpenseDocumentWithHttpInfo(OmegaAPIAreasPublicModelsRequestModelsExpenseGetExpenseParametersRequest model) throws ApiException {
        com.squareup.okhttp.Call call = publicExpenseGetExpenseDocumentValidateBeforeCall(model, null, null);
        Type localVarReturnType = new TypeToken<OmegaAPIAreasPublicModelsPublicExpenseModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Получает расходную накладную. (asynchronously)
     * curl -H \&quot;Content-Type: application/json\&quot; -XPOST \&quot;https://public.omega.page/public/api/v1.0/expense/getExpenseDocument\&quot; -d \&quot;  {      \&quot;Key\&quot;: \&quot;RQzSCdY99JgV0kMtSYx0KTcE9bdWmhai\&quot;,      \&quot;DocId\&quot; : \&quot;test\&quot;,  }\&quot;
     * @param model  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call publicExpenseGetExpenseDocumentAsync(OmegaAPIAreasPublicModelsRequestModelsExpenseGetExpenseParametersRequest model, final ApiCallback<OmegaAPIAreasPublicModelsPublicExpenseModel> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = publicExpenseGetExpenseDocumentValidateBeforeCall(model, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<OmegaAPIAreasPublicModelsPublicExpenseModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for publicExpenseGetExpenseDocumentDetails
     * @param model  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call publicExpenseGetExpenseDocumentDetailsCall(OmegaAPIAreasPublicModelsRequestModelsPublicExpenseGetExpenseDetailsParametersRequest model, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = model;
        
        // create path and map variables
        String localVarPath = "/public/api/v1.0/expense/getExpenseDocumentDetails";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "text/json", "application/x-www-form-urlencoded"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call publicExpenseGetExpenseDocumentDetailsValidateBeforeCall(OmegaAPIAreasPublicModelsRequestModelsPublicExpenseGetExpenseDetailsParametersRequest model, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'model' is set
        if (model == null) {
            throw new ApiException("Missing the required parameter 'model' when calling publicExpenseGetExpenseDocumentDetails(Async)");
        }
        
        
        com.squareup.okhttp.Call call = publicExpenseGetExpenseDocumentDetailsCall(model, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Получает подробности по товарам из РН. Старый метод, включён в ответ с getExpenseDocumentList
     * curl -H \&quot;Content-Type: application/json\&quot; -XPOST \&quot;https://public.omega.page/public/api/v1.0/expense/getExpenseDocumentDetails\&quot; -d \&quot;  {      \&quot;Key\&quot;: \&quot;RQzSCdY99JgV0kMtSYx0KTcE9bdWmhai\&quot;,      \&quot;DocId\&quot; : \&quot;225da8af-20a7-11e9-80cc-94f128aa9b4c\&quot;,  }\&quot;
     * @param model  (required)
     * @return OmegaAPIAreasPublicModelsReponsesDefaultResponseSystemCollectionsGenericIEnumerableOmegaAPIAreasPublicModelsPublicExpensePublicEpenseProductDetails
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public OmegaAPIAreasPublicModelsReponsesDefaultResponseSystemCollectionsGenericIEnumerableOmegaAPIAreasPublicModelsPublicExpensePublicEpenseProductDetails publicExpenseGetExpenseDocumentDetails(OmegaAPIAreasPublicModelsRequestModelsPublicExpenseGetExpenseDetailsParametersRequest model) throws ApiException {
        ApiResponse<OmegaAPIAreasPublicModelsReponsesDefaultResponseSystemCollectionsGenericIEnumerableOmegaAPIAreasPublicModelsPublicExpensePublicEpenseProductDetails> resp = publicExpenseGetExpenseDocumentDetailsWithHttpInfo(model);
        return resp.getData();
    }

    /**
     * Получает подробности по товарам из РН. Старый метод, включён в ответ с getExpenseDocumentList
     * curl -H \&quot;Content-Type: application/json\&quot; -XPOST \&quot;https://public.omega.page/public/api/v1.0/expense/getExpenseDocumentDetails\&quot; -d \&quot;  {      \&quot;Key\&quot;: \&quot;RQzSCdY99JgV0kMtSYx0KTcE9bdWmhai\&quot;,      \&quot;DocId\&quot; : \&quot;225da8af-20a7-11e9-80cc-94f128aa9b4c\&quot;,  }\&quot;
     * @param model  (required)
     * @return ApiResponse&lt;OmegaAPIAreasPublicModelsReponsesDefaultResponseSystemCollectionsGenericIEnumerableOmegaAPIAreasPublicModelsPublicExpensePublicEpenseProductDetails&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<OmegaAPIAreasPublicModelsReponsesDefaultResponseSystemCollectionsGenericIEnumerableOmegaAPIAreasPublicModelsPublicExpensePublicEpenseProductDetails> publicExpenseGetExpenseDocumentDetailsWithHttpInfo(OmegaAPIAreasPublicModelsRequestModelsPublicExpenseGetExpenseDetailsParametersRequest model) throws ApiException {
        com.squareup.okhttp.Call call = publicExpenseGetExpenseDocumentDetailsValidateBeforeCall(model, null, null);
        Type localVarReturnType = new TypeToken<OmegaAPIAreasPublicModelsReponsesDefaultResponseSystemCollectionsGenericIEnumerableOmegaAPIAreasPublicModelsPublicExpensePublicEpenseProductDetails>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Получает подробности по товарам из РН. Старый метод, включён в ответ с getExpenseDocumentList (asynchronously)
     * curl -H \&quot;Content-Type: application/json\&quot; -XPOST \&quot;https://public.omega.page/public/api/v1.0/expense/getExpenseDocumentDetails\&quot; -d \&quot;  {      \&quot;Key\&quot;: \&quot;RQzSCdY99JgV0kMtSYx0KTcE9bdWmhai\&quot;,      \&quot;DocId\&quot; : \&quot;225da8af-20a7-11e9-80cc-94f128aa9b4c\&quot;,  }\&quot;
     * @param model  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call publicExpenseGetExpenseDocumentDetailsAsync(OmegaAPIAreasPublicModelsRequestModelsPublicExpenseGetExpenseDetailsParametersRequest model, final ApiCallback<OmegaAPIAreasPublicModelsReponsesDefaultResponseSystemCollectionsGenericIEnumerableOmegaAPIAreasPublicModelsPublicExpensePublicEpenseProductDetails> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = publicExpenseGetExpenseDocumentDetailsValidateBeforeCall(model, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<OmegaAPIAreasPublicModelsReponsesDefaultResponseSystemCollectionsGenericIEnumerableOmegaAPIAreasPublicModelsPublicExpensePublicEpenseProductDetails>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for publicExpenseGetExpenseDocumentList
     * @param model  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call publicExpenseGetExpenseDocumentListCall(OmegaAPIAreasPublicModelsRequestModelsPublicExpenseGetExpenseListParametersRequest model, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = model;
        
        // create path and map variables
        String localVarPath = "/public/api/v1.0/expense/getExpenseDocumentList";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "text/json", "application/x-www-form-urlencoded"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call publicExpenseGetExpenseDocumentListValidateBeforeCall(OmegaAPIAreasPublicModelsRequestModelsPublicExpenseGetExpenseListParametersRequest model, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'model' is set
        if (model == null) {
            throw new ApiException("Missing the required parameter 'model' when calling publicExpenseGetExpenseDocumentList(Async)");
        }
        
        
        com.squareup.okhttp.Call call = publicExpenseGetExpenseDocumentListCall(model, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Получает список расходных накладных.
     * curl -H \&quot;Content-Type: application/json\&quot; -XPOST \&quot;https://public.omega.page/public/api/v1.0/expense/getExpenseDocumentList\&quot; -d \&quot;  {      \&quot;Key\&quot;: \&quot;RQzSCdY99JgV0kMtSYx0KTcE9bdWmhai\&quot;,      \&quot;StartDate\&quot; : \&quot;01.01.2019\&quot;,      \&quot;EndDate\&quot; : \&quot;01.02.2019\&quot;  }\&quot;
     * @param model  (required)
     * @return OmegaAPIAreasPublicModelsReponsesDefaultResponseOmegaAPIAreasPublicModelsPublicSearchResultOmegaAPIAreasEnterpriseOmegaModelsDocumentsExpenseExpenseOmegaAPIAreasPublicModelsPublicExpenseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public OmegaAPIAreasPublicModelsReponsesDefaultResponseOExpenseModel publicExpenseGetExpenseDocumentList(OmegaAPIAreasPublicModelsRequestModelsPublicExpenseGetExpenseListParametersRequest model) throws ApiException {
        ApiResponse<OmegaAPIAreasPublicModelsReponsesDefaultResponseOExpenseModel> resp = publicExpenseGetExpenseDocumentListWithHttpInfo(model);
        return resp.getData();
    }

    /**
     * Получает список расходных накладных.
     * curl -H \&quot;Content-Type: application/json\&quot; -XPOST \&quot;https://public.omega.page/public/api/v1.0/expense/getExpenseDocumentList\&quot; -d \&quot;  {      \&quot;Key\&quot;: \&quot;RQzSCdY99JgV0kMtSYx0KTcE9bdWmhai\&quot;,      \&quot;StartDate\&quot; : \&quot;01.01.2019\&quot;,      \&quot;EndDate\&quot; : \&quot;01.02.2019\&quot;  }\&quot;
     * @param model  (required)
     * @return ApiResponse&lt;OmegaAPIAreasPublicModelsReponsesDefaultResponseOmegaAPIAreasPublicModelsPublicSearchResultOmegaAPIAreasEnterpriseOmegaModelsDocumentsExpenseExpenseOmegaAPIAreasPublicModelsPublicExpenseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<OmegaAPIAreasPublicModelsReponsesDefaultResponseOExpenseModel> publicExpenseGetExpenseDocumentListWithHttpInfo(OmegaAPIAreasPublicModelsRequestModelsPublicExpenseGetExpenseListParametersRequest model) throws ApiException {
        com.squareup.okhttp.Call call = publicExpenseGetExpenseDocumentListValidateBeforeCall(model, null, null);
        Type localVarReturnType = new TypeToken<OmegaAPIAreasPublicModelsReponsesDefaultResponseOExpenseModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Получает список расходных накладных. (asynchronously)
     * curl -H \&quot;Content-Type: application/json\&quot; -XPOST \&quot;https://public.omega.page/public/api/v1.0/expense/getExpenseDocumentList\&quot; -d \&quot;  {      \&quot;Key\&quot;: \&quot;RQzSCdY99JgV0kMtSYx0KTcE9bdWmhai\&quot;,      \&quot;StartDate\&quot; : \&quot;01.01.2019\&quot;,      \&quot;EndDate\&quot; : \&quot;01.02.2019\&quot;  }\&quot;
     * @param model  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call publicExpenseGetExpenseDocumentListAsync(OmegaAPIAreasPublicModelsRequestModelsPublicExpenseGetExpenseListParametersRequest model, final ApiCallback<OmegaAPIAreasPublicModelsReponsesDefaultResponseOExpenseModel> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = publicExpenseGetExpenseDocumentListValidateBeforeCall(model, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<OmegaAPIAreasPublicModelsReponsesDefaultResponseOExpenseModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
