package Class27;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import utils.Constants;

import java.io.FileInputStream;
import java.io.IOException;

public class E4ExcelReader {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(Constants.EXEL_FILE_PATH);

        //that special class that knows how to read the data from exel files
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);

        //file class that will read the file from the sheet
        Sheet sheet = xssfWorkbook.getSheet("Sheet1");

       // int rowSize = sheet.getPhysicalNumberOfRows();

        for (int rows = 0; rows < sheet.getPhysicalNumberOfRows(); rows++) {
            Row row  = sheet.getRow(rows);
            //instead of hardcoding use this and exposing sensitive info use these methods to get it automatically
            //int colSize = row.getPhysicalNumberOfCells();

            for (int col = 0; col < row.getPhysicalNumberOfCells() ; col++) {
                System.out.print(row.getCell(col)+" ");
            }
            System.out.println();
        }

        //in excel columns are called cells

//        System.out.print(row.getCell(0)+" ");
//        System.out.print(row.getCell(1)+" ");
//        System.out.println(row.getCell(2)+" ");
//        System.out.println(row.getCell(3)+" ");
//        System.out.println(row.getCell(4));
//




    }
}
