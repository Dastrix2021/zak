package io.swagger.client;

import io.swagger.client.api.PublicPricesApi;
import io.swagger.client.model.OmegaAPIAreasPublicModelsReponsesDefaultResponseSystemCollectionsGenericIEnumerableOmegaAPIAreasPublicModelsPublicPrice;
import io.swagger.client.model.OmegaAPIAreasPublicModelsRequestModelsPriceDownloadPriceParametersRequest;

public class Price {

    public void prices () throws ApiException {
        PublicPricesApi publicPricesApi = new PublicPricesApi();
        OmegaAPIAreasPublicModelsReponsesDefaultResponseSystemCollectionsGenericIEnumerableOmegaAPIAreasPublicModelsPublicPrice p = new OmegaAPIAreasPublicModelsReponsesDefaultResponseSystemCollectionsGenericIEnumerableOmegaAPIAreasPublicModelsPublicPrice();

        OmegaAPIAreasPublicModelsRequestModelsPriceDownloadPriceParametersRequest oaapmrmpdprp = new OmegaAPIAreasPublicModelsRequestModelsPriceDownloadPriceParametersRequest();
        OmegaAPIAreasPublicModelsRequestModelsPriceDownloadPriceParametersRequest.IdEnum number24 = OmegaAPIAreasPublicModelsRequestModelsPriceDownloadPriceParametersRequest.IdEnum.NUMBER_24;
        OmegaAPIAreasPublicModelsRequestModelsPriceDownloadPriceParametersRequest.IdEnum.Adapter ad = new OmegaAPIAreasPublicModelsRequestModelsPriceDownloadPriceParametersRequest.IdEnum.Adapter();

        oaapmrmpdprp.setKey("RQzSCdY99JgV0kMtSYx0KTcE9bdWmhai");
        oaapmrmpdprp.setId(number24);

        publicPricesApi.publicPricesDownloadPrice(oaapmrmpdprp);

    }
}
