package io.swagger.client.parser;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.api.PublicSearchApi;
import io.swagger.client.model.OmegaAPIAreasPublicModelsProductResponse;
import io.swagger.client.model.OmegaAPIAreasPublicModelsRequestModelsPriceListParametersRequest;

import javax.lang.model.util.Elements;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

public class Price {
    PublicSearchApi searchApi = new PublicSearchApi();
    Excel excel = new Excel();
    UpdateStreamExcel updateStreamExcel = new UpdateStreamExcel();
    List<String> idd = null; //КОПИЯ ЛИСТА ЕКСЕЛЬ
    ApiClient apiClient = new ApiClient();


    OmegaAPIAreasPublicModelsRequestModelsPriceListParametersRequest price = new OmegaAPIAreasPublicModelsRequestModelsPriceListParametersRequest();

    public void priceList() throws ApiException, NoSuchFieldException, IOException {
        apiClient.setConnectTimeout(100000);
        idd = List.copyOf(excel.excel());
        OmegaAPIAreasPublicModelsRequestModelsPriceListParametersRequest pr = price.key("RQzSCdY99JgV0kMtSYx0KTcE9bdWmhai")
                .from(0)
                .count(200000)
                .isPrepay(false)
                .addSupplierRests(false);
        List<OmegaAPIAreasPublicModelsProductResponse> p = searchApi.publicSearchPriceListPaged(pr).getResult();
        for (int i = 3; i < idd.size(); i += 5) {   // ТРЕТИЙ ИНДЕКС = НОМЕР, 0 индекс = имя
            if (idd.get(i).equals("") || idd.get(i).isEmpty() || idd.get(i).isBlank()) {
                System.out.println("Завершено. Ожидание 5 мин.");
                return;
            } else {
                var isPresent = p.stream().findAny().isPresent();
                int finalI1 = i;
                int finalI2 = i+1;
                if (isPresent) {
                    var equalCard = p.stream().anyMatch(f -> f.getCard().equalsIgnoreCase(idd.get(finalI1)));
                    if (equalCard) {
                        var countBrands = p.stream().anyMatch(f -> f.getBrandDescription()
                                .contains(idd.get(finalI2)) ||
                                idd.get(finalI2).contains(f.getBrandDescription()));
                        if (countBrands) {
                           var exist = p.stream().anyMatch(f ->
                                   f.getRests() != null && (
                                   f.getRests().stream().anyMatch(e -> e.getKey().contains("Киев")) ||
                                   f.getRests().stream().anyMatch(e -> e.getKey().contains("Харьков")) ||
                                   f.getRests().stream().anyMatch(e -> e.getKey().contains("Краматорск"))));
                           if (exist) {
                               var price = p.stream().findFirst().orElseThrow().getPrice();
                               updateStreamExcel.update("+", price, idd.get(finalI1), idd.get(finalI2));
                               System.out.println("here");
                           }
                        } else {
                            System.out.println("and here");
                            updateStreamExcel.update("-", 0.0d, idd.get(finalI1), idd.get(finalI2));
                        }
                    } else {
                        System.out.println("here medium");
                        updateStreamExcel.update("-", 0.0d, idd.get(finalI1), idd.get(finalI2));
                    }
                } else {
                    System.out.println("here last");
                    updateStreamExcel.update("-", 0.0d, idd.get(finalI1), idd.get(finalI2));
                }
            }
        }
    }
}
