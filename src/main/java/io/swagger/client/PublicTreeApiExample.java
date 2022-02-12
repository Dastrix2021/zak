package io.swagger.client;

import io.swagger.client.api.PublicTreeApi;
import io.swagger.client.model.*;
import io.swagger.client.parser.Excel;
import io.swagger.client.parser.UpdateExcel;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class PublicTreeApiExample extends OmegaAPIAreasPublicModelsProductResponse {


    public void searchTree() throws IOException, ApiException {

        PublicTreeApi publicTreeApi = new PublicTreeApi();
        OmegaAPIAreasPublicModelsRequestModelsTreeGetTreeNodeParametersRequest mtg = new OmegaAPIAreasPublicModelsRequestModelsTreeGetTreeNodeParametersRequest();
        mtg.key("RQzSCdY99JgV0kMtSYx0KTcE9bdWmhai").setModificationId(0);
        mtg.setNodeId(200000);
        List<OmegaAPIAreasPublicModelsTreePublicTreeNode> r = publicTreeApi.publicTreeGetTreeNode(mtg);
        for (OmegaAPIAreasPublicModelsTreePublicTreeNode s : r) {
            System.out.println(s.getClass());
        }

//        Excel excel = new Excel();
//        UpdateExcel updateExcel = new UpdateExcel();
//        List<String> idd = List.copyOf(excel.excel()); //КОПИЯ ЛИСТА ЕКСЕЛЬ
//        for (int i = 3; i < idd.size(); i += 5) {   // ТРЕТИЙ ИНДЕКС = НОМЕР, 0 индекс = имя
//            if (idd.get(i).chars().equals(idd.get(i).chars()) || idd.get(i).chars().count() == 1) {
//                System.out.println("Завершено.");
//                break;
//            } else if (idd.get(i).isBlank()) {
//                System.out.println("|");
//            } else {

//                try {

//                    if (!r.isEmpty()) {
//                        description = r.stream().findAny().orElseThrow(null).getDescription();
//                        if (description != null) {
//                            price = r.stream().findAny().orElseThrow(null).getPrice();
//                            exist = String.valueOf(r.stream().findAny().orElseThrow(null).getRests());
//                            brand = r.stream().findAny().orElseThrow(null).getBrandDescription();
//
//                            for (int j = 0; j < exist.length(); j++) {
//                                if (exist.contains("Киев") || exist.contains("Харьков") || exist.contains("Краматорск")) {
//                                    keyExist = true;
//                                    break;
//                                } else {
//                                    keyExist = false;
//                                    System.out.println("Нет на искомых складах: " + false + "\n");
//                                }
//                            }
//                            System.out.println("Название позиции: " + description.strip() + "| Цена: " + price + "| Брэнд: " + brand + "|\n Наличие: " + exist);
//                            System.out.println("Остатки на складах: " + keyExist + "\n");
//                        }
//                    } else {
//                        System.out.println("Нет значения.");
//                    }
//                } catch (ApiException e) {
//                    e.printStackTrace();
//                }
//            }
//            if (!keyExist) {
//                updateExcel.update("-", 0.0, idd.get(i), brand);
//            } else {
//                updateExcel.update("+", price, idd.get(i), brand);
//            }
//        }
    }
}
