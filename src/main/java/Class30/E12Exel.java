package Class30;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

//file input stream data is stored somewhere else and the program is running somehwerre else and
// they need to be in a single place so we use this to bring this from the harddrive into the ram
public class E12Exel {
    public static void main(String[] args) {
        String path = System.getProperty("user.dir")+"\\ExcelReader\\Employees.xlsx";//located file
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);//special software that read the data
            Sheet sheet = xssfWorkbook.getSheet("Sheet1");

            int noOfRows = sheet.getLastRowNum();
            List<Map<String,String>> allExelData = new ArrayList<>();
            for (int i = 0; i <= noOfRows; i++) {
                Row row = sheet.getRow(i);
                if(row!=null){
                int noOfCells= row.getLastCellNum();
                for (int j = 0; j < noOfCells; j++) {
                    System.out.print(row.getCell(j)+" ");
                }
                System.out.println();}
            }


        }catch (IOException io){
            io.printStackTrace();
        }
    }
}
