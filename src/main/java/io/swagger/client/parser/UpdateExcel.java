package io.swagger.client.parser;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.*;

public class UpdateExcel extends Excel {
    public String existUp = "";
    public Double priceUp;
    public String idUp = "";
    public String idIndex = "";
    public String brandUp = "";
    public String brandThis = "";
    public static long done;
    public static long noBrand;
    public static long priceNull;

    public void update(String existUp, Double priceUp, String idUp, String brandUp) throws IOException {
        this.existUp = existUp;
        this.priceUp = priceUp;
        this.idUp = idUp;
        this.brandUp = brandUp;

        File file = new File("src/main/java/io/swagger/client/resources/zakupka.xlsx");
        var inputStream = new FileInputStream(file);
        var workbook = new XSSFWorkbook(inputStream);
        var sheet = workbook.getSheetAt(0);
        int ind1 = sheet.getFirstRowNum();
        int ind2 = sheet.getLastRowNum();
        Cell cell;
        var dataFormatter = new DataFormatter();

        for (int i = ind1 + 1; i < ind2 + 1; i++) {
            var indexCell = sheet.getRow(i).getCell(4);
            idIndex = indexCell.getRawValue();
            idIndex = dataFormatter.formatCellValue(indexCell);
            var brandCell = sheet.getRow(i).getCell(5);
            if (brandCell != null) {
                brandThis = brandCell.getRawValue();
                brandThis = dataFormatter.formatCellValue(brandCell);
            } else {
                cell = sheet.getRow(i).createCell(5);
                cell.setBlank();
            }
            if (brandUp != null) {
                if (idIndex.equalsIgnoreCase(idUp)) {
                     if (existUp.contains("+") && priceUp != 0.0d && (containsIgnoreCase(brandUp, brandThis) || containsIgnoreCase(brandThis, brandUp))) {
                        float newPrice = Math.round(priceUp + (priceUp * 0.25f));
                        cell = sheet.getRow(i).createCell(2);
                        cell.setCellValue(existUp);
                        cell = sheet.getRow(i).createCell(1);
                        cell.setCellValue(newPrice);
                        done += 1;
                        inputStream.close();
                        var fileOutputStream = new FileOutputStream(file);
                        workbook.write(fileOutputStream);
                        fileOutputStream.close();
                        return;
                    } else {
                        cell = sheet.getRow(i).createCell(2);
                        cell.setCellValue("-");
                         priceNull += 1;
                    }
                }
            }
        }
        inputStream.close();
        var fileOutputStream = new FileOutputStream(file);
        workbook.write(fileOutputStream);
        fileOutputStream.close();
    }
    public static boolean containsIgnoreCase(String src, String what) {
            final int length = what.length();
            if (length == 0)
                return true;
            final char firstLo = Character.toLowerCase(what.charAt(0));
            final char firstUp = Character.toUpperCase(what.charAt(0));
            for (int i = src.length() - length; i >= 0; i--) {
                final char ch = src.charAt(i);
                if (ch != firstLo && ch != firstUp)
                    continue;
                if (src.regionMatches(true, i, what, 0, length))
                    return true;
            }
        return false;
    }
}
