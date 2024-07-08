package ExcelFile;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;

public class CrateExcelfile {
    public static void main (String[] args) throws Exception {
        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet("TestSheet");
        sheet.createRow(0);
        sheet.getRow(0).createCell(0).setCellValue("Hello");
        sheet.getRow(0).createCell(1).setCellValue("world");

        sheet.createRow(1);
        sheet.getRow(1).createCell(0).setCellValue("Hello");
        sheet.getRow(1).createCell(1).setCellValue("Poly");

        File File = new File("C:/Users/nurnaher.aktar/IdeaProjects/CreatExcelFile//Test1.xls");
        workbook.write(File);
        workbook.close();
    }
}