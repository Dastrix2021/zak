package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.OmegaAPIAreasPublicModelsProductResponse;
import io.swagger.client.model.OmegaAPIAreasPublicModelsPublicSearchResultOmegaAPIAreasPublicModelsProductResponseOmegaAPIAreasPublicModelsProductResponse;
import io.swagger.client.model.OmegaAPIAreasPublicModelsRequestModelsSearchParametersRequest;
import io.swagger.client.parser.Excel;
import io.swagger.client.parser.UpdateExcel;

import java.io.IOException;
import java.util.HashSet;
import java.util.List;

public class SearchBrands {
    int blank = 0;
    public HashSet<String> brands() throws IOException, ApiException {
        HashSet<String> getAllBrands = new HashSet<>();
        PublicSearchApi searchApi = new PublicSearchApi();
        Excel excel = new Excel();
        List<String> idd = List.copyOf(excel.excel()); //КОПИЯ ЛИСТА ЕКСЕЛЬ
        for (int i = 3; i < idd.size(); i += 5) {   // ТРЕТИЙ ИНДЕКС = НОМЕР, 0 индекс = имя
            if (idd.get(i).chars().count() == 1) {
                System.out.println("Стоп");
                break;
            } else if(idd.get(i).isBlank()) {
                System.out.print(".");
                continue;
            } else {
                OmegaAPIAreasPublicModelsRequestModelsSearchParametersRequest oaapmrmspr = new OmegaAPIAreasPublicModelsRequestModelsSearchParametersRequest();
                oaapmrmspr.key("RQzSCdY99JgV0kMtSYx0KTcE9bdWmhai").searchPhrase(idd.get(i)).from(0).count(20);
                OmegaAPIAreasPublicModelsPublicSearchResultOmegaAPIAreasPublicModelsProductResponseOmegaAPIAreasPublicModelsProductResponse res = searchApi.publicSearchSimpleSearch(oaapmrmspr);
                List<OmegaAPIAreasPublicModelsProductResponse> r = res.getResult();
                if (!r.isEmpty()) {
                    getAllBrands.add(r.stream().findAny().orElseThrow(null).getBrandDescription());
                System.out.print(".");
                }
            }
//            System.out.println(getAllBrands);
        }
        return getAllBrands;
    }
}
