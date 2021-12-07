import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import java.io.IOException;

public class Parser extends Excel{

    public String name = "";
    public String exist = "";
    public float price = 0;
    public String id = "";
    public String ex = "Есть в наличии";

    public void parse(String search) throws IOException {


        Document doc = Jsoup.connect("https://autodoc.ua/search-result?searchPhrase=" + search).get();

        Elements instock = doc.getElementsByClass("product-box__instock");
        exist =  instock.stream().findFirst().get().text();

        if (!ex.equals(exist.intern())) {
            new UpdateExcel("-", 0, search);
            System.out.println("Нет в наличии! ");
        return;
        } else {
            Elements pr = doc.getElementsByClass("product-box__new-price");
            String p = pr.stream().findFirst().get().text();

            String pp = p.replaceAll("[^0-9.]+", "");
            price = Float.parseFloat(pp);
            new UpdateExcel("+", price, search);

            Elements name1 = doc.getElementsByClass("product-box__name");
            name = name1.stream().findFirst().get().text();

            Elements code = doc.getElementsByClass("product-box__code-number");
            id = code.stream().skip(1).findFirst().get().text();

            System.out.println("Есть в наличии. Название: " + name + " Каталожный номер: " + id + " Цена: " + price);
        }
    }
}
