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


import io.swagger.client.model.OmegaAPIAreasPublicModelsPublicModel;
import io.swagger.client.model.OmegaAPIAreasPublicModelsReponsesDefaultResponseOmegaAPIAreasPublicModelsGetAccountResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PublicApi {
    private ApiClient apiClient;

    public PublicApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PublicApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for publicGetAccount
     * @param model  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call publicGetAccountCall(OmegaAPIAreasPublicModelsPublicModel model, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = model;
        
        // create path and map variables
        String localVarPath = "/public/api/v1.0/profile/account";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml", "text/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/xml", "text/xml", "application/x-www-form-urlencoded"
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
    private com.squareup.okhttp.Call publicGetAccountValidateBeforeCall(OmegaAPIAreasPublicModelsPublicModel model, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'model' is set
        if (model == null) {
            throw new ApiException("Missing the required parameter 'model' when calling publicGetAccount(Async)");
        }
        
        
        com.squareup.okhttp.Call call = publicGetAccountCall(model, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * ???????????????????? ???????????? ????????????????.
     * curl -H \&quot;Content-Type: application/json\&quot; -XPOST \&quot;https://public.omega.page/public/api/v1.0/profile/account\&quot; -d \&quot;  {      \&quot;Key\&quot;: \&quot;RQzSCdY99JgV0kMtSYx0KTcE9bdWmhai\&quot;  }\&quot;
     * @param model  (required)
     * @return OmegaAPIAreasPublicModelsReponsesDefaultResponseOmegaAPIAreasPublicModelsGetAccountResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public OmegaAPIAreasPublicModelsReponsesDefaultResponseOmegaAPIAreasPublicModelsGetAccountResponse publicGetAccount(OmegaAPIAreasPublicModelsPublicModel model) throws ApiException {
        ApiResponse<OmegaAPIAreasPublicModelsReponsesDefaultResponseOmegaAPIAreasPublicModelsGetAccountResponse> resp = publicGetAccountWithHttpInfo(model);
        return resp.getData();
    }

    /**
     * ???????????????????? ???????????? ????????????????.
     * curl -H \&quot;Content-Type: application/json\&quot; -XPOST \&quot;https://public.omega.page/public/api/v1.0/profile/account\&quot; -d \&quot;  {      \&quot;Key\&quot;: \&quot;RQzSCdY99JgV0kMtSYx0KTcE9bdWmhai\&quot;  }\&quot;
     * @param model  (required)
     * @return ApiResponse&lt;OmegaAPIAreasPublicModelsReponsesDefaultResponseOmegaAPIAreasPublicModelsGetAccountResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<OmegaAPIAreasPublicModelsReponsesDefaultResponseOmegaAPIAreasPublicModelsGetAccountResponse> publicGetAccountWithHttpInfo(OmegaAPIAreasPublicModelsPublicModel model) throws ApiException {
        com.squareup.okhttp.Call call = publicGetAccountValidateBeforeCall(model, null, null);
        Type localVarReturnType = new TypeToken<OmegaAPIAreasPublicModelsReponsesDefaultResponseOmegaAPIAreasPublicModelsGetAccountResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * ???????????????????? ???????????? ????????????????. (asynchronously)
     * curl -H \&quot;Content-Type: application/json\&quot; -XPOST \&quot;https://public.omega.page/public/api/v1.0/profile/account\&quot; -d \&quot;  {      \&quot;Key\&quot;: \&quot;RQzSCdY99JgV0kMtSYx0KTcE9bdWmhai\&quot;  }\&quot;
     * @param model  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call publicGetAccountAsync(OmegaAPIAreasPublicModelsPublicModel model, final ApiCallback<OmegaAPIAreasPublicModelsReponsesDefaultResponseOmegaAPIAreasPublicModelsGetAccountResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = publicGetAccountValidateBeforeCall(model, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<OmegaAPIAreasPublicModelsReponsesDefaultResponseOmegaAPIAreasPublicModelsGetAccountResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
