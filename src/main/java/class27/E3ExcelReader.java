package class27;

import Utils.Constants;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E3ExcelReader {
    public static void main(String[] args) throws IOException {
    //String path=System.getProperty("user.dir")+"\\Files\\Employee.xlsx";
        FileInputStream fileInputStream=new FileInputStream(Constants.EXCEL_FILE_PATH);
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
        Sheet sheet =xssfWorkbook.getSheet("Sheet1");
    //int rowSize=sheet.getPhysicalNumberOfRows();
        for (int rows = 0; rows < sheet.getPhysicalNumberOfRows(); rows++) {
            Row row= sheet.getRow(rows);
    //int colSize=row.getPhysicalNumberOfCells();=>we can use it straight in loop
            for (int i = 0; i < row.getPhysicalNumberOfCells(); i++) {
                System.out.print(row.getCell(i)+" ");

            }
            System.out.println();
        }

        //Cell cell= row.getCell(1);
        /*System.out.print(row.getCell(0)+" ");
        System.out.print(row.getCell(1)+" ");
        System.out.print(row.getCell(2)+" ");
        System.out.println(row.getCell(3)+" ");
        System.out.println(row.getCell(4));*/


    }
}
