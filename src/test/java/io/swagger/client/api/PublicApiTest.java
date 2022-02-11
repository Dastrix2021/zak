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

import io.swagger.client.ApiException;
import io.swagger.client.model.OmegaAPIAreasPublicModelsPublicModel;
import io.swagger.client.model.OmegaAPIAreasPublicModelsReponsesDefaultResponseOmegaAPIAreasPublicModelsGetAccountResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PublicApi
 */
@Ignore
public class PublicApiTest {

    private final PublicApi api = new PublicApi();

    
    /**
     * Возвращает данные аккаунта.
     *
     * curl -H \&quot;Content-Type: application/json\&quot; -XPOST \&quot;https://public.omega.page/public/api/v1.0/profile/account\&quot; -d \&quot;  {      \&quot;Key\&quot;: \&quot;RQzSCdY99JgV0kMtSYx0KTcE9bdWmhai\&quot;  }\&quot;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void publicGetAccountTest() throws ApiException {
        OmegaAPIAreasPublicModelsPublicModel model = null;
        OmegaAPIAreasPublicModelsReponsesDefaultResponseOmegaAPIAreasPublicModelsGetAccountResponse response = api.publicGetAccount(model);

        // TODO: test validations
    }
    
}
