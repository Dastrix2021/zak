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
import io.swagger.client.model.OmegaAPIAreasPublicModelsPublicExpenseModel;
import io.swagger.client.model.OmegaAPIAreasPublicModelsReponsesDefaultResponseOExpenseModel;
import io.swagger.client.model.OmegaAPIAreasPublicModelsReponsesDefaultResponseSystemCollectionsGenericIEnumerableOmegaAPIAreasPublicModelsPublicExpensePublicEpenseProductDetails;
import io.swagger.client.model.OmegaAPIAreasPublicModelsRequestModelsExpenseGetExpenseParametersRequest;
import io.swagger.client.model.OmegaAPIAreasPublicModelsRequestModelsPublicExpenseGetExpenseDetailsParametersRequest;
import io.swagger.client.model.OmegaAPIAreasPublicModelsRequestModelsPublicExpenseGetExpenseListParametersRequest;
import org.junit.Test;
import org.junit.Ignore;

/**
 * API tests for PublicExpenseApi
 */
@Ignore
public class PublicExpenseApiTest {

    private final PublicExpenseApi api = new PublicExpenseApi();

    
    /**
     * Получает расходную накладную.
     *
     * curl -H \&quot;Content-Type: application/json\&quot; -XPOST \&quot;https://public.omega.page/public/api/v1.0/expense/getExpenseDocument\&quot; -d \&quot;  {      \&quot;Key\&quot;: \&quot;RQzSCdY99JgV0kMtSYx0KTcE9bdWmhai\&quot;,      \&quot;DocId\&quot; : \&quot;test\&quot;,  }\&quot;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void publicExpenseGetExpenseDocumentTest() throws ApiException {
        OmegaAPIAreasPublicModelsRequestModelsExpenseGetExpenseParametersRequest model = null;
        OmegaAPIAreasPublicModelsPublicExpenseModel response = api.publicExpenseGetExpenseDocument(model);

        // TODO: test validations
    }
    
    /**
     * Получает подробности по товарам из РН. Старый метод, включён в ответ с getExpenseDocumentList
     *
     * curl -H \&quot;Content-Type: application/json\&quot; -XPOST \&quot;https://public.omega.page/public/api/v1.0/expense/getExpenseDocumentDetails\&quot; -d \&quot;  {      \&quot;Key\&quot;: \&quot;RQzSCdY99JgV0kMtSYx0KTcE9bdWmhai\&quot;,      \&quot;DocId\&quot; : \&quot;225da8af-20a7-11e9-80cc-94f128aa9b4c\&quot;,  }\&quot;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void publicExpenseGetExpenseDocumentDetailsTest() throws ApiException {
        OmegaAPIAreasPublicModelsRequestModelsPublicExpenseGetExpenseDetailsParametersRequest model = null;
        OmegaAPIAreasPublicModelsReponsesDefaultResponseSystemCollectionsGenericIEnumerableOmegaAPIAreasPublicModelsPublicExpensePublicEpenseProductDetails response = api.publicExpenseGetExpenseDocumentDetails(model);

        // TODO: test validations
    }
    
    /**
     * Получает список расходных накладных.
     *
     * curl -H \&quot;Content-Type: application/json\&quot; -XPOST \&quot;https://public.omega.page/public/api/v1.0/expense/getExpenseDocumentList\&quot; -d \&quot;  {      \&quot;Key\&quot;: \&quot;RQzSCdY99JgV0kMtSYx0KTcE9bdWmhai\&quot;,      \&quot;StartDate\&quot; : \&quot;01.01.2019\&quot;,      \&quot;EndDate\&quot; : \&quot;01.02.2019\&quot;  }\&quot;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void publicExpenseGetExpenseDocumentListTest() throws ApiException {
        OmegaAPIAreasPublicModelsRequestModelsPublicExpenseGetExpenseListParametersRequest model = null;
        OmegaAPIAreasPublicModelsReponsesDefaultResponseOExpenseModel response = api.publicExpenseGetExpenseDocumentList(model);

        // TODO: test validations
    }
    
}