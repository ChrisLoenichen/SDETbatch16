package JavaHWSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import utils.ExcelReader;

import java.util.List;

public class PersonalInfoForm {
    public static void main(String[] args) throws InterruptedException {
        String path = System.getProperty("user.dir")+"\\Files\\Employees.xlsx";;
        System.out.println("Excel File Path is "+path);


        var exelList = ExcelReader.read("Sheet2",path);

        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();




        WebElement userName = driver.findElement(By.xpath("//input[@id='txtUsername']"));
        userName.sendKeys("Admin");
        WebElement password = driver.findElement(By.xpath("//input[@id='txtPassword']"));
        password.sendKeys("Hum@nhrm123");
        WebElement loginBtn = driver.findElement(By.xpath("//input[@id='btnLogin']"));
        loginBtn.click();


        for(var map : exelList) {

            WebElement pimButton = driver.findElement(By.xpath("//*[@id=\"menu_pim_viewPimModule\"]/b"));
            pimButton.click();
            WebElement addEmployee = driver.findElement(By.xpath("//a[@id='menu_pim_addEmployee']"));
            addEmployee.click();

            WebElement firstName = driver.findElement(By.xpath("//input[@id='firstName']"));
            firstName.sendKeys(map.get("First Name"));
            WebElement middleName = driver.findElement(By.xpath("//input[@id='middleName']"));
            middleName.sendKeys(map.get("Middle Name"));
            WebElement lastName = driver.findElement(By.xpath("//*[@id=\"lastName\"]"));
            lastName.sendKeys(map.get("Last Name"));

            WebElement saveButton = driver.findElement(By.xpath("//*[@id=\"btnSave\"]"));
            saveButton.click();
            WebElement editButton = driver.findElement(By.xpath("//*[@id=\"btnSave\"]"));
            editButton.click();

            WebElement otherID = driver.findElement(By.xpath("//*[@id=\"personal_txtOtherID\"]"));
            otherID.sendKeys(map.get("Other ID"));
            WebElement Drivers = driver.findElement(By.xpath("//*[@id=\"personal_txtLicenNo\"]"));
            Drivers.sendKeys(map.get("Drivers License Number"));

            WebElement calendarClick = driver.findElement(By.xpath("//*[@id=\"frmEmpPersonalDetails\"]/fieldset/ol[2]/li[4]/img"));
            calendarClick.click();

            WebElement liceExpMonth = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[1]"));
            Select selectMonth = new Select(liceExpMonth);
            selectMonth.selectByVisibleText(map.get("License Expiry Month"));


            WebElement liceExpYear = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[2]"));
            Select selectYear = new Select(liceExpYear);
            selectYear.selectByVisibleText(map.get("License Expiry Year"));


            List<WebElement> liceExpDay = driver.findElements(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr/td"));
            for (WebElement expiryDay : liceExpDay) {
                String dayText = expiryDay.getText();
                if (dayText.equals(map.get("License Expiry Day"))) {
                    expiryDay.click();
                    break;
                }
            }
             WebElement ssn = driver.findElement(By.xpath("//*[@id='personal_txtNICNo']"));
             ssn.sendKeys(map.get("SSN Number"));
             WebElement sin= driver.findElement(By.xpath("//*[@id='personal_txtSINNo']"));
             sin.sendKeys(map.get("SIN Number"));

             if(map.get("Gender").equals("Male")) {
                 driver.findElement(By.xpath("//input[@id='personal_optGender_1']")).click();
             }else if (map.get("Gender").equals("Female")) {
                 driver.findElement(By.xpath("//input[@id='personal_optGender_2']")).click();
             }

             WebElement maritalStatus = driver.findElement(By.xpath("//*[@id='personal_cmbMarital']"));
             Select select = new Select(maritalStatus);
             select.selectByVisibleText(map.get("Marital Status"));

             WebElement nationality = driver.findElement(By.xpath("//*[@id='personal_cmbNation']"));
             Select select1 = new Select(nationality);
             select1.selectByVisibleText(map.get("Nationality"));

             WebElement nickName = driver.findElement(By.xpath("//*[@id=\"personal_txtEmpNickName\"]"));
             nickName.sendKeys(map.get("Nick Name"));

             WebElement militaryService = driver.findElement(By.xpath("//*[@id=\"personal_txtMilitarySer\"]"));
             militaryService.sendKeys(map.get("Military Service"));


            WebElement birthDayPicker = driver.findElement(By.xpath("//input[@id='personal_DOB']"));
            birthDayPicker.click();


            WebElement birthYear = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
            Select sYear= new Select(birthYear);
            sYear.selectByVisibleText(map.get("Birth Year"));


            WebElement birthMonth = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
            Select sMonth = new Select(birthMonth);
            sMonth.selectByVisibleText(map.get("Birth Month"));


            List<WebElement> birthDate = driver.findElements(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr/td"));
            for(WebElement birthDay: birthDate){
                String birthDayNum = birthDay.getText();
                if(birthDayNum.equals(map.get("Birth Day"))){
                    birthDay.click();
                    break;
                }
            }


        }

    }
}
