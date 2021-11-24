
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    static float price = 0;


    public static void main(String[] args) throws IOException, NoSuchFieldException {
        Parser p = new Parser();
        p.parse();

//        Excel ex = new Excel();
//        for (int i = 1000; i < 1004; i++) {
////            if (ex.excel().get(i) == null)
//             System.out.println(ex.excel().get(i));
//        }


//        for (Map.Entry<String, String> entry : l.excel().entrySet()) {
//            String s = entry.getKey();
//            String ms = entry.getValue();
//            System.out.println(l.str);
//            System.out.println(s + " | " + ms);
//        }



//        String ee[] = e.split(" ");
//        e.split("грн");
//        for (String i : ee)
//
//
//        StringBuilder sb = new StringBuilder(e);
//        sb.reverse();
//        sb.delete(0, 3);
//        sb.reverse();
//        String spl = sb.toString();
//        spl.split(" ");
//        for (String newspl : spl)
//            System.out.println(newspl);
//
//        double d = Double.parseDouble(String.valueOf(i));
//
//
//
//        Elements tag = doc.getElementsByTag("text");
//        String title = doc.title();

//        File file = new File("src/~$tov.xlsx");
//        Path testFilePath = Paths.get("src/tov.xlsx");

//        System.out.println(testFilePath);
//        Excel excel = new Excel();
//        List<String> l = Arrays.asList(testFilePath.toString());
//        System.out.println(l);


//        for (int i = 0; i < title.length(); i++)
//            System.out.println("Title : " + title);
//        int a = 0;
//        String b = "one";
//
//        int c = a + b.indexOf(0);
//        System.out.println(c);
//    }
//    public int Math(int x, int y) {
//        return x / y;
//    }
//
//    public int[] arr(int... a) {
//        int[] array = new int[a.length];
//        for (int i = 0; i < a.length; i++)
//           array[i] = a[i];
//        return array;
    }
}
