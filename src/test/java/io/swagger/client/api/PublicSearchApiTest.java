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
import io.swagger.client.model.OmegaAPIAreasPublicModelsProductDetailsModel;
import io.swagger.client.model.OmegaAPIAreasPublicModelsPublicSearchResultOmegaAPIAreasPublicModelsProductResponseOmegaAPIAreasPublicModelsProductResponse;
import io.swagger.client.model.OmegaAPIAreasPublicModelsReponsesDefaultResponseOmegaAPIAreasPublicModelsProductResponse;
import io.swagger.client.model.OmegaAPIAreasPublicModelsReponsesDefaultResponseOmegaAPIAreasPublicModelsPublicSearchResultOAResponse;
import io.swagger.client.model.OmegaAPIAreasPublicModelsReponsesDefaultResponseSystemCollectionsGenericIEnumerableOmegaAPIAreasPublicModelsSearchPublicCrossModel;
import io.swagger.client.model.OmegaAPIAreasPublicModelsReponsesDefaultResponseSystemCollectionsGenericIEnumerableOmegaAPIAreasPublicModelsSearchPublicResourceInfo;
import io.swagger.client.model.OmegaAPIAreasPublicModelsReponsesDefaultResponseSystemCollectionsGenericListOmegaAPIAreasPublicModelsProductDetailsPublic;
import io.swagger.client.model.OmegaAPIAreasPublicModelsRequestModelsPriceListParametersRequest;
import io.swagger.client.model.OmegaAPIAreasPublicModelsRequestModelsSearchGetAllAnalogsParametersRequest;
import io.swagger.client.model.OmegaAPIAreasPublicModelsRequestModelsSearchGetProductImageParametersRequest;
import io.swagger.client.model.OmegaAPIAreasPublicModelsRequestModelsSearchGetProductImageParamsParametersRequest;
import io.swagger.client.model.OmegaAPIAreasPublicModelsRequestModelsSearchGetTecDocCrossesParametersRequest;
import io.swagger.client.model.OmegaAPIAreasPublicModelsRequestModelsSearchParametersBrandRequest;
import io.swagger.client.model.OmegaAPIAreasPublicModelsRequestModelsSearchParametersProductCardListRequest;
import io.swagger.client.model.OmegaAPIAreasPublicModelsRequestModelsSearchParametersProductIdListRequest;
import io.swagger.client.model.OmegaAPIAreasPublicModelsRequestModelsSearchParametersRequest;
import io.swagger.client.model.OmegaAPIModelsSearchResultTOmegaAPIAreasPublicModelsProductResponse;
import org.junit.Test;
import org.junit.Ignore;

/**
 * API tests for PublicSearchApi
 */
@Ignore
public class PublicSearchApiTest {

    private final PublicSearchApi api = new PublicSearchApi();

    
    /**
     * ???????????????????? ???????????? ???????? ?????????????????? ?????????????? (???????????????? ?? ???????????? PREMIUM)
     *
     * curl -H \&quot;Content-Type: application/json\&quot; -XPOST \&quot;https://public.omega.page/public/api/v1.0/product/getAllAnalogs\&quot; -d \&quot;  {      \&quot;Key\&quot;: \&quot;RQzSCdY99JgV0kMtSYx0KTcE9bdWmhai\&quot;  }\&quot;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void publicSearchGetAllCrossesTest() throws ApiException {
        OmegaAPIAreasPublicModelsRequestModelsSearchGetAllAnalogsParametersRequest model = null;
        OmegaAPIAreasPublicModelsReponsesDefaultResponseSystemCollectionsGenericIEnumerableOmegaAPIAreasPublicModelsSearchPublicCrossModel response = api.publicSearchGetAllCrosses(model);

        // TODO: test validations
    }
    
    /**
     * ???????????????????? ???????? ???????????? (???????????????? ?? ???????????? GOLD)
     *
     * curl -H \&quot;Content-Type: application/json\&quot; -XPOST \&quot;https://public.omega.page/public/api/v1.0/product/image\&quot; -d \&quot;  {      \&quot;Key\&quot;: \&quot;RQzSCdY99JgV0kMtSYx0KTcE9bdWmhai\&quot;,      \&quot;ProductId\&quot;: 0  }\&quot;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void publicSearchGetProductImageTest() throws ApiException {
        OmegaAPIAreasPublicModelsRequestModelsSearchGetProductImageParametersRequest model = null;
        api.publicSearchGetProductImage(model);

        // TODO: test validations
    }
    
    /**
     * ???????????????????? ???????????? ?????????????????? ???????? (???????????????? ?? ???????????? GOLD)
     *
     * curl -H \&quot;Content-Type: application/json\&quot; -XPOST \&quot;https://public.omega.page/public/api/v1.0/product/imagesInfo\&quot; -d \&quot;  {      \&quot;Key\&quot;: \&quot;RQzSCdY99JgV0kMtSYx0KTcE9bdWmhai\&quot;  }\&quot;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void publicSearchGetProductImagesInfoTest() throws ApiException {
        OmegaAPIAreasPublicModelsRequestModelsSearchGetProductImageParamsParametersRequest model = null;
        OmegaAPIAreasPublicModelsReponsesDefaultResponseSystemCollectionsGenericIEnumerableOmegaAPIAreasPublicModelsSearchPublicResourceInfo response = api.publicSearchGetProductImagesInfo(model);

        // TODO: test validations
    }
    
    /**
     * ???????????????????? ???????????? ?????????????? &#39;TecDoc&#39; (???????????????? ?? ???????????? GOLD)
     *
     * curl -H \&quot;Content-Type: application/json\&quot; -XPOST \&quot;https://public.omega.page/public/api/v1.0/product/getCrosses\&quot; -d \&quot;  {      \&quot;Key\&quot;: \&quot;RQzSCdY99JgV0kMtSYx0KTcE9bdWmhai\&quot;,      \&quot;ProductId\&quot;: 0  }\&quot;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void publicSearchGetTecDocCrossesTest() throws ApiException {
        OmegaAPIAreasPublicModelsRequestModelsSearchGetTecDocCrossesParametersRequest model = null;
        OmegaAPIAreasPublicModelsReponsesDefaultResponseSystemCollectionsGenericIEnumerableOmegaAPIAreasPublicModelsSearchPublicCrossModel response = api.publicSearchGetTecDocCrosses(model);

        // TODO: test validations
    }
    
    /**
     * ???????????????????? ??????????????????.
     *
     * curl -H \&quot;Content-Type: application/json\&quot; -XPOST \&quot;https://public.omega.page/public/api/v1.0/product/pricelist/paged\&quot; -d \&quot;  {      \&quot;Key\&quot;: \&quot;RQzSCdY99JgV0kMtSYx0KTcE9bdWmhai\&quot;,      \&quot;ProductId\&quot;: 0,      \&quot;Number\&quot;: 1  }\&quot;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void publicSearchPriceListPagedTest() throws ApiException {
        OmegaAPIAreasPublicModelsRequestModelsPriceListParametersRequest model = null;
        OmegaAPIModelsSearchResultTOmegaAPIAreasPublicModelsProductResponse response = api.publicSearchPriceListPaged(model);

        // TODO: test validations
    }
    
    /**
     * ???????????????????? ?????????????????? ???????????????? ????????????.
     *
     * curl -H \&quot;Content-Type: application/json\&quot; -XPOST \&quot;https://public.omega.page/public/api/v1.0/product/details\&quot; -d \&quot;  {      \&quot;Key\&quot;: \&quot;RQzSCdY99JgV0kMtSYx0KTcE9bdWmhai\&quot;,      \&quot;ProductIdList\&quot;: [-869686]  }\&quot;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void publicSearchProductDetailsTest() throws ApiException {
        OmegaAPIAreasPublicModelsProductDetailsModel model = null;
        OmegaAPIAreasPublicModelsReponsesDefaultResponseSystemCollectionsGenericListOmegaAPIAreasPublicModelsProductDetailsPublic response = api.publicSearchProductDetails(model);

        // TODO: test validations
    }
    
    /**
     * ???????????????????? ???????????????????? ????????????.
     *
     * curl -H \&quot;Content-Type: application/json\&quot; -XPOST \&quot;https://public.omega.page/public/api/v1.0/product/search\&quot; -d \&quot;  {      \&quot;SearchPhrase\&quot;: \&quot;???????????? ??????\&quot;,      \&quot;Rest\&quot;: 0,      \&quot;From\&quot;: 0,      \&quot;Count\&quot;: 20,      \&quot;Key\&quot;: \&quot;RQzSCdY99JgV0kMtSYx0KTcE9bdWmhai\&quot;  }\&quot;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void publicSearchSimpleSearchTest() throws ApiException {
        OmegaAPIAreasPublicModelsRequestModelsSearchParametersRequest model = null;
        OmegaAPIAreasPublicModelsPublicSearchResultOmegaAPIAreasPublicModelsProductResponseOmegaAPIAreasPublicModelsProductResponse response = api.publicSearchSimpleSearch(model);

        // TODO: test validations
    }
    
    /**
     * ???????????????????? ???????????????????? ???????????? ???? ???????????? ?? ????????
     *
     * curl -H \&quot;Content-Type: application/json\&quot; -XPOST \&quot;https://public.omega.page/public/api/v1.0/product/searchBrand\&quot; -d \&quot;  {      \&quot;Code\&quot;: \&quot;oc90\&quot;,      \&quot;Brand\&quot;: \&quot;KNECHT\&quot;,      \&quot;Rest\&quot;: 0,      \&quot;Key\&quot;: \&quot;RQzSCdY99JgV0kMtSYx0KTcE9bdWmhai\&quot;  }\&quot;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void publicSearchSimpleSearchBrandTest() throws ApiException {
        OmegaAPIAreasPublicModelsRequestModelsSearchParametersBrandRequest model = null;
        OmegaAPIAreasPublicModelsReponsesDefaultResponseOmegaAPIAreasPublicModelsProductResponse response = api.publicSearchSimpleSearchBrand(model);

        // TODO: test validations
    }
    
    /**
     * ???????????????????? ???????????????????? ???????????? ???? ?????????????? ProductCard
     *
     * curl -H \&quot;Content-Type: application/json\&quot; -XPOST \&quot;https://public.omega.page/public/api/v1.0/product/searchProductCardList\&quot; -d \&quot;  {      \&quot;ProductIdList\&quot;: [\&quot;4610495\&quot;],      \&quot;Key\&quot;: \&quot;RQzSCdY99JgV0kMtSYx0KTcE9bdWmhai\&quot;  }\&quot;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void publicSearchSimpleSearchProductCardListTest() throws ApiException {
        OmegaAPIAreasPublicModelsRequestModelsSearchParametersProductCardListRequest model = null;
        OmegaAPIAreasPublicModelsReponsesDefaultResponseOmegaAPIAreasPublicModelsPublicSearchResultOAResponse response = api.publicSearchSimpleSearchProductCardList(model);

        // TODO: test validations
    }
    
    /**
     * ???????????????????? ???????????????????? ???????????? ???? ?????????????? ProductId
     *
     * curl -H \&quot;Content-Type: application/json\&quot; -XPOST \&quot;https://public.omega.page/public/api/v1.0/product/searchProductIdList\&quot; -d \&quot;  {      \&quot;ProductIdList\&quot;: [\&quot;-89669\&quot;],      \&quot;Key\&quot;: \&quot;RQzSCdY99JgV0kMtSYx0KTcE9bdWmhai\&quot;  }\&quot;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void publicSearchSimpleSearchProductIdListTest() throws ApiException {
        OmegaAPIAreasPublicModelsRequestModelsSearchParametersProductIdListRequest model = null;
        OmegaAPIAreasPublicModelsReponsesDefaultResponseOmegaAPIAreasPublicModelsPublicSearchResultOAResponse response = api.publicSearchSimpleSearchProductIdList(model);

        // TODO: test validations
    }
    
}
