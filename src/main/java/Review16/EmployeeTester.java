package Review16;

import Class23.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.Constants;
import utils.ExcelReader;

import java.util.List;
import java.util.Map;

public class EmployeeTester {

    public static void main(String[] args) {

        List<Map<String,String>> empData = ExcelReader.read(Constants.EXEL_FILE_PATH2,"Sheet1");

        WebDriver webDriver = new ChromeDriver();
        webDriver.getClass("")
        for(Map<String,String> map : empData){

        }
    }
}
