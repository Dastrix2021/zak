package io.swagger.client.parser;

import io.swagger.client.ApiException;
import io.swagger.client.api.PublicSearchApi;
import io.swagger.client.model.OmegaAPIAreasPublicModelsProductResponse;
import io.swagger.client.model.OmegaAPIAreasPublicModelsPublicSearchResultOmegaAPIAreasPublicModelsProductResponseOmegaAPIAreasPublicModelsProductResponse;
import io.swagger.client.model.OmegaAPIAreasPublicModelsRequestModelsSearchParametersRequest;
import io.swagger.client.parser.Excel;
import io.swagger.client.parser.UpdateExcel;

import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

import static io.swagger.client.parser.UpdateExcel.*;

public class PublicSearchApiExample extends OmegaAPIAreasPublicModelsProductResponse {
    String description;
    Double price;
    String exist;
    String brand;
    boolean keyExist = false;


    public PublicSearchApiExample(String description, Double price, String exist, String brand, boolean keyExist) {
        this.description = description;
        this.price = price;
        this.exist = exist;
        this.brand = brand;
        this.keyExist = keyExist;
    }
    public PublicSearchApiExample() {}

    public void search() {

        PublicSearchApi searchApi = new PublicSearchApi();
        Excel excel = new Excel();
        UpdateExcel updateExcel = new UpdateExcel();
        List<String> idd = null; //КОПИЯ ЛИСТА ЕКСЕЛЬ
        try {
            idd = List.copyOf(excel.excel());
        } catch (IOException | ApiException e) {
            e.printStackTrace();
        }
        for (int i = 3; i < idd.size(); i += 5) {   // ТРЕТИЙ ИНДЕКС = НОМЕР, 0 индекс = имя
            if (idd.get(i).equals("") || idd.get(i).isEmpty() || idd.get(i).isBlank()) {
                System.out.println("Завершено. Ожидание 5 мин.");
                return;
            } else {
                    OmegaAPIAreasPublicModelsRequestModelsSearchParametersRequest oaapmrmspr = new OmegaAPIAreasPublicModelsRequestModelsSearchParametersRequest();
                    oaapmrmspr.key("RQzSCdY99JgV0kMtSYx0KTcE9bdWmhai").searchPhrase(idd.get(i)).from(0).count(20);
                    try {
                        OmegaAPIAreasPublicModelsPublicSearchResultOmegaAPIAreasPublicModelsProductResponseOmegaAPIAreasPublicModelsProductResponse res = searchApi.publicSearchSimpleSearch(oaapmrmspr);
                            List<OmegaAPIAreasPublicModelsProductResponse> r = res.getResult();
                                 boolean pres = r.stream().findAny().isPresent(); // isPresent(); переделать ifs
                                 if (pres) {
                                    description = r.stream().findAny().get().getDescription();
                                    price = r.stream().findAny().get().getCustomerPrice();
                                    exist = String.valueOf(r.stream().findAny().get().getRests());
                                    brand = r.stream().findAny().get().getBrandDescription();
                                    for (int j = 0; j < exist.length(); j++) {
                                        if (exist.contains("Киев") || exist.contains("Харьков") || exist.contains("Краматорск")) {
                                            keyExist = true;
                                            break;
                                        } else {
                                            keyExist = false;
//                                        System.out.println("Нет на искомых складах: " + false + "\n");
                                        }
                                    }
//                                System.out.println("Название позиции: " + description.strip() + "| Цена: " + price + "| Брэнд: " + brand + "|\n Наличие: " + exist);
                                    System.out.println("Остатки на складах: " + keyExist);
                            } else {
                                System.out.println(".");
                        }
                    } catch (ApiException e) {
                        e.printStackTrace();
                }
            }
                if (!keyExist) {
//                    priceNull += 1;
                    try {
                        updateExcel.update("-", 0.0d, idd.get(i), brand);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else {
//                    done += 1;
                    try {
                        updateExcel.update("+", price, idd.get(i), brand);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
        }
    }
}