import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class Excel {

    public String nameX = "";
    public String existX = "";
    public String priceX = "";
    public String idX = "";

    public List<String> excel() throws IOException {
        List<String> newExcel = new LinkedList<>();
        File file = new File("src/main/resources/t1.xlsx");

        FileInputStream inputStream = new FileInputStream(file);

        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);

        XSSFSheet sheet = workbook.getSheetAt(0);
        int ind1 = sheet.getFirstRowNum();
        int ind2 = sheet.getLastRowNum();
        Cell cell;
        DataFormatter fmt = new DataFormatter();

        for (int i = ind1 + 1; i < ind2+1; i++) {
            XSSFCell cell0 = sheet.getRow(i).getCell(0);
            if (cell0 != null) {
                nameX = cell0.getStringCellValue();
                nameX = fmt.formatCellValue(cell0);
            } else {
                cell = sheet.getRow(i).createCell(0);
                cell.setBlank();
            }
            XSSFCell cell1 = sheet.getRow(i).getCell(1);
            if (cell1 != null) {
                priceX = cell1.getRawValue();
                priceX = fmt.formatCellValue(cell1);
            } else {
                cell = sheet.getRow(i).createCell(1);
                cell.setBlank();
            }

            XSSFCell cell2 = sheet.getRow(i).getCell(6);
            if (cell2 != null) {
                existX = cell2.getStringCellValue();
            } else {
                cell = sheet.getRow(i).createCell(6);
                cell.setBlank();
            }

            XSSFCell cell3 = sheet.getRow(i).getCell(15);
            if (cell3 != null) {
                idX = cell3.getRawValue();
                idX = fmt.formatCellValue(cell3);
            } else {
                cell = sheet.getRow(i).createCell(15);
                cell.setBlank();
            }

            newExcel.add(nameX);
            newExcel.add(existX);
            newExcel.add(priceX);
            newExcel.add(idX);
        }

        inputStream.close();

        FileOutputStream out = new FileOutputStream(file);
        workbook.write(out);
        out.close();

        return newExcel;
    }
}
