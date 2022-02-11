package io.swagger.client.parser;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import static io.swagger.client.parser.UpdateExcel.containsIgnoreCase;

public class UpdateStreamExcel {
    public String existUpdate = "";
    public Double priceUpdate;
    public String idUpdate = "";
    public String idIndex = "";
    public String brandUpdate = "";
    public String brandThis = "";
    public static long doneStream;
    public static long priceNullStream;

    public void update(String existUpdate, Double priceUpdate, String idUpdate, String brandUpdate) throws IOException {
        this.existUpdate = existUpdate;
        this.priceUpdate = priceUpdate;
        this.idUpdate = idUpdate;
        this.brandUpdate = brandUpdate;
        if (!existUpdate.equals("+")) { priceNullStream += 1; } else { doneStream += 1; }

        File file = new File("src/main/java/io/swagger/client/resources/zakupka.xlsx");
        var inputStream = new FileInputStream(file);
        var workbook = new XSSFWorkbook(inputStream);
        var sheet = workbook.getSheetAt(0);
        int ind1 = sheet.getFirstRowNum();
        int ind2 = sheet.getLastRowNum();
        Cell cell;
        var dataFormatter = new DataFormatter();

        for (int i = ind1 + 1; i < ind2 + 1; i++) {
            var index = sheet.getRow(i).getCell(4);
            idIndex = index.getRawValue();
            idIndex = dataFormatter.formatCellValue(index);
            var brandCell = sheet.getRow(i).getCell(5);
            if (brandCell != null) {
                brandThis = brandCell.getRawValue();
                brandThis = dataFormatter.formatCellValue(brandCell);
            } else {
                cell = sheet.getRow(i).createCell(5);
                cell.setBlank();
            }
            if (brandUpdate != null) {
                if (idIndex.equalsIgnoreCase(idUpdate)) {
                    if (existUpdate.contains("+") && priceUpdate != 0.0d && (containsIgnoreCase(brandUpdate, brandThis) || containsIgnoreCase(brandThis, brandUpdate))) {
                        float newPrice = Math.round(priceUpdate + (priceUpdate * 0.25f));
                        cell = sheet.getRow(i).createCell(2);
                        cell.setCellValue(existUpdate);
                        cell = sheet.getRow(i).createCell(1);
                        cell.setCellValue(newPrice);
                        inputStream.close();
                        var fileOutputStream = new FileOutputStream(file);
                        workbook.write(fileOutputStream);
                        fileOutputStream.close();
                        return;
                    } else {
                        cell = sheet.getRow(i).createCell(2);
                        cell.setCellValue("-");
                    }
                }
            }
        }
        inputStream.close();
        var fileOutputStream = new FileOutputStream(file);
        workbook.write(fileOutputStream);
        fileOutputStream.close();
    }
}
