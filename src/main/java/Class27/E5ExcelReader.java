package Class27;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import utils.Constants;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class E5ExcelReader {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(Constants.EXEL_FILE_PATH);

        //that special class that knows how to read the data from exel files
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);

        //file class that will read the file from the sheet
        Sheet sheet = xssfWorkbook.getSheet("Sheet1");



        List<Map<String,String>> exelData = new ArrayList<>();
        //getting to first row
        Row headerRow = sheet.getRow(0);
        for (int rows = 1; rows < sheet.getPhysicalNumberOfRows(); rows++) {
            Row row  = sheet.getRow(rows);

            Map<String, String> rowMap= new HashMap<>();
            for (int col = 0; col < row.getPhysicalNumberOfCells() ; col++) {
                String key = headerRow.getCell(col).toString();
                String value = row.getCell(col).toString();
                rowMap.put(key,value);

            }
            exelData.add(rowMap);

        }
        System.out.println(exelData);
        //in excel columns are called cells

//        System.out.print(row.getCell(0)+" ");
//        System.out.print(row.getCell(1)+" ");
//        System.out.println(row.getCell(2)+" ");
//        System.out.println(row.getCell(3)+" ");
//        System.out.println(row.getCell(4));
//




    }
}
