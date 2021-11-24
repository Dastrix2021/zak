import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Excel {
    public String nameX = "";
    public String existX = "";
    public String priceX = "";
    public String idX = "";

    public List<String> excel() throws IOException {
        List<String> newExcel = new LinkedList<>();
        File file = new File("src/main/resources/t.xlsx");
        // Read XSL file
        FileInputStream inputStream = new FileInputStream(file);

        // Get the workbook instance for XLS file
        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);

        // Get first sheet from the workbook
        XSSFSheet sheet = workbook.getSheetAt(0);
        int ind1 = sheet.getFirstRowNum();
        int ind2 = sheet.getLastRowNum();
        Cell cell;
        DataFormatter fmt = new DataFormatter();

//        Row row;
//        int rownum = 0;
//        row = sheet.createRow(rownum);

        for (int i = ind1 + 1; i < ind2+1; i++) {
            XSSFCell cell0 = sheet.getRow(i).getCell(0);
            nameX = cell0.getStringCellValue();
            nameX = fmt.formatCellValue(cell0);
            XSSFCell cell1 = sheet.getRow(i).getCell(1);
            if (cell1 != null) {
                priceX = cell1.getRawValue();
                priceX = fmt.formatCellValue(cell1);
            } else {
                cell = sheet.getRow(i).createCell(1);
                cell.setBlank();
            }

            XSSFCell cell2 = sheet.getRow(i).getCell(6);
            existX = cell2.getStringCellValue();

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
//            System.out.println(nameX + '\n' + "     |     " + priceX + "     |     " + existX + "     |     " + idX + "     |");
        }

//        cell = sheet.getRow(3).getCell(2);
//        cell.setCellValue(cell.getNumericCellValue() * 2);

        inputStream.close();

        // Write File
        FileOutputStream out = new FileOutputStream(file);
        workbook.write(out);
        out.close();


        return newExcel;
    }



}
