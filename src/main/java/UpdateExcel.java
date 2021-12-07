import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.*;

public class UpdateExcel extends Parser{
    public String existUp = "";
    public float priceUp = 0;
    public String idUp = "";
    public String idIndex = "";

    public UpdateExcel(String existUp, float priceUp, String idUp) throws IOException {
        this.existUp = existUp;
        this.priceUp = priceUp;
        this.idUp = idUp;

        File file = new File("src/main/resources/t1.xlsx");
        FileInputStream inputStream = new FileInputStream(file);
        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
        XSSFSheet sheet = workbook.getSheetAt(0);
        int ind1 = sheet.getFirstRowNum();
        int ind2 = sheet.getLastRowNum();
        Cell cell;
        DataFormatter fmt = new DataFormatter();

        for (int i = ind1 + 1; i < ind2+1; i++) {
            XSSFCell index = sheet.getRow(i).getCell(15);
            idIndex = index.getRawValue();
            idIndex = fmt.formatCellValue(index);
            if (idIndex.equals(idUp)) {
                cell = sheet.getRow(i).getCell(6);
                cell.setCellValue(existUp);

                cell = sheet.getRow(i).getCell(1);
                cell.setCellValue(Math.round(priceUp - (priceUp * 0.05f)));
            }
        }

        inputStream.close();

        FileOutputStream out = new FileOutputStream(file);
        workbook.write(out);
        out.close();
    }
}
