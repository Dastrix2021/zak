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
import io.swagger.client.model.OmegaAPIAreasPublicModelsReponsesDefaultResponseOmegaAPIAreasPublicModelsBasketMissingItems;
import io.swagger.client.model.OmegaAPIAreasPublicModelsReponsesDefaultResponseSystemCollectionsGenericIEnumerableOmegaAPIAreasPublicModelsPublicBasketProduct;
import io.swagger.client.model.OmegaAPIAreasPublicModelsRequestModelsAddProductListParametersRequest;
import io.swagger.client.model.OmegaAPIAreasPublicModelsRequestModelsAddToBasketParametersRequest;
import io.swagger.client.model.OmegaAPIAreasPublicModelsRequestModelsRemoveProductParametersRequest;
import io.swagger.client.model.OmegaCommonModelsResponses;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PublicBasketApi
 */
@Ignore
public class PublicBasketApiTest {

    private final PublicBasketApi api = new PublicBasketApi();

    
    /**
     * Добавляет или увеличивает(уменьшает) количество товаров в корзине и возвращает новую корзину.
     *
     * curl -H \&quot;Content-Type: application/json\&quot; -XPOST \&quot;https://public.omega.page/public/api/v1.0/basket/addProduct\&quot; -d \&quot;  {      \&quot;ProductId\&quot;: -1006978,      \&quot;Count\&quot;: 1,      \&quot;Key\&quot;: \&quot;RQzSCdY99JgV0kMtSYx0KTcE9bdWmhai\&quot;  }\&quot;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void publicBasketAddProductTest() throws ApiException {
        OmegaAPIAreasPublicModelsRequestModelsAddToBasketParametersRequest model = null;
        OmegaAPIAreasPublicModelsReponsesDefaultResponseSystemCollectionsGenericIEnumerableOmegaAPIAreasPublicModelsPublicBasketProduct response = api.publicBasketAddProduct(model);

        // TODO: test validations
    }
    
    /**
     * Добавляет список товаров в корзину.
     *
     * curl -H \&quot;Content-Type: application/json\&quot; -XPOST \&quot;https://public.omega.page/public/api/v1.0/basket/addProductList\&quot; -d \&quot;  {      \&quot;ProductList\&quot;: [{\&quot;ProductId\&quot;: -1006978, Count: 1}]      \&quot;Key\&quot;: \&quot;RQzSCdY99JgV0kMtSYx0KTcE9bdWmhai\&quot;  }\&quot;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void publicBasketAddProductListTest() throws ApiException {
        OmegaAPIAreasPublicModelsRequestModelsAddProductListParametersRequest model = null;
        OmegaAPIAreasPublicModelsReponsesDefaultResponseOmegaAPIAreasPublicModelsBasketMissingItems response = api.publicBasketAddProductList(model);

        // TODO: test validations
    }
    
    /**
     * Очищает все товары в корзине.
     *
     * curl -H \&quot;Content-Type: application/json\&quot; -XPOST \&quot;https://public.omega.page/public/api/v1.0/basket/clear\&quot; -d \&quot;  {      \&quot;Key\&quot;: \&quot;RQzSCdY99JgV0kMtSYx0KTcE9bdWmhai\&quot;  }\&quot;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void publicBasketClearBasketTest() throws ApiException {
        OmegaAPIAreasPublicModelsPublicModel model = null;
        OmegaCommonModelsResponses response = api.publicBasketClearBasket(model);

        // TODO: test validations
    }
    
    /**
     * Получает список товаров из корзины.
     *
     * curl -H \&quot;Content-Type: application/json\&quot; -XPOST \&quot;https://public.omega.page/public/api/v1.0/basket/getBasket\&quot; -d \&quot;  {      \&quot;Key\&quot;: \&quot;RQzSCdY99JgV0kMtSYx0KTcE9bdWmhai\&quot;  }\&quot;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void publicBasketGetBasketTest() throws ApiException {
        OmegaAPIAreasPublicModelsPublicModel model = null;
        OmegaAPIAreasPublicModelsReponsesDefaultResponseSystemCollectionsGenericIEnumerableOmegaAPIAreasPublicModelsPublicBasketProduct response = api.publicBasketGetBasket(model);

        // TODO: test validations
    }
    
    /**
     * Удаляет выбранный товар из корзины.
     *
     * curl -H \&quot;Content-Type: application/json\&quot; -XPOST \&quot;https://public.omega.page/public/api/v1.0/basket/removeProductFromBasket\&quot; -d \&quot;  {      \&quot;Key\&quot;: \&quot;RQzSCdY99JgV0kMtSYx0KTcE9bdWmhai\&quot;,      \&quot;ProductId\&quot;: -1006978  }\&quot;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void publicBasketRemoveProductTest() throws ApiException {
        OmegaAPIAreasPublicModelsRequestModelsRemoveProductParametersRequest model = null;
        OmegaAPIAreasPublicModelsReponsesDefaultResponseSystemCollectionsGenericIEnumerableOmegaAPIAreasPublicModelsPublicBasketProduct response = api.publicBasketRemoveProduct(model);

        // TODO: test validations
    }
    
}
