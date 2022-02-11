package io.swagger.client.parser;
import io.swagger.client.ApiException;
import java.io.IOException;
import static io.swagger.client.parser.UpdateStreamExcel.doneStream;
import static io.swagger.client.parser.UpdateStreamExcel.priceNullStream;

public class Main {

    public static void main(String[] args) throws IOException, ApiException, InterruptedException, NoSuchFieldException {
        long time = System.currentTimeMillis();
        Price price = new Price();
        price.priceList();
//        PublicSearchApiExample e = new PublicSearchApiExample();
//        e.search();
//        TimeUnit.MINUTES.sleep(5);
//        ReadScript r = new ReadScript();
//        r.readBashScript();
        System.out.println("Изменено, в наличии: " + doneStream + " | Изменено, нет в наличии: " + priceNullStream);
        System.out.println("Время обработки: " + ((System.currentTimeMillis() - time) / 1000) + " секунд.");
    }
}
