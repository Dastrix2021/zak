package io.swagger.client.parser;
import io.swagger.client.ApiException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
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
    public String brandX = "";
    public HashSet<String> allBrands = new HashSet<>();
    static int num1 = 0;
    static long num2 = 0;

    public List<String> excel() throws IOException, ApiException {

        List<String> newExcel = new LinkedList<>();
        File file = new File("src/main/java/io/swagger/client/resources/zakupka.xlsx");
        FileInputStream inputStream = new FileInputStream(file);
        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
        XSSFSheet sheet = workbook.getSheetAt(0);
        int ind1 = sheet.getFirstRowNum();
        int ind2 = sheet.getLastRowNum();
        Cell cell = null;
        DataFormatter fmt = new DataFormatter();

        for (int i = ind1 + 1; i < ind2 + 1; i++) {
            XSSFCell cell5br = sheet.getRow(i).getCell(5);
            if (cell5br != null) {
                allBrands.add(String.valueOf(cell5br));
            }
        }
            for (int i = ind1 + 1; i < ind2 + 1; i++) {

                XSSFCell cell0 = sheet.getRow(i).getCell(0);
            if (cell0 != null) {
                nameX = cell0.getRawValue();
                nameX = fmt.formatCellValue(cell0);
                for (String s : allBrands) {
                    XSSFCell cell5 = sheet.getRow(i).getCell(5);
                    if (nameX.contains(s) && cell5 == null) {
                        cell = sheet.getRow(i).createCell(5);
                        cell.setCellValue(s);
                        num1 += 1;
                    } else {
                        num2 += 1;
                    }
                }
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
            XSSFCell cell2 = sheet.getRow(i).getCell(2);
            if (cell2 != null) {
                existX = cell2.getStringCellValue();
            } else {
                cell = sheet.getRow(i).createCell(2);
                cell.setBlank();
            }
            XSSFCell cell4 = sheet.getRow(i).getCell(4);
            if (cell4 != null) {
                idX = cell4.getRawValue();
                idX = fmt.formatCellValue(cell4);
            } else {
                cell = sheet.getRow(i).createCell(4);
                cell.setCellValue("");
            }
            XSSFCell cell5 = sheet.getRow(i).getCell(5);
            if (cell5 != null) {
                brandX = cell5.getRawValue();
                brandX = fmt.formatCellValue(cell5);
            } else {
                cell = sheet.getRow(i).createCell(5);
                cell.setBlank();
            }
            newExcel.add(nameX);
            newExcel.add(existX);
            newExcel.add(priceX);
            newExcel.add(idX);
            newExcel.add(brandX);
        }
//        System.out.println("Количество брендов: " + allBrands.size());
//        System.out.println(allBrands.toString());
//        System.out.println("Дописано брендов: " + num1);
//        System.out.println("Кол-во корректных брендов: " + num2);

        inputStream.close();
        FileOutputStream out = new FileOutputStream(file);
        workbook.write(out);
        out.close();
        return newExcel;
    }
}
