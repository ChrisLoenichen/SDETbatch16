package Class27;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.Constants;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class E2ConfigReader {
    public static void main(String[] args) throws IOException {



        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login%22");
        driver.manage().window().maximize();

        WebElement username = driver.findElement(By.cssSelector("#txtUsername"));
        String userName = getProperty("UserName");
        username.sendKeys(userName);

        WebElement passwordField = driver.findElement(By.cssSelector("#txtPassword"));
        String password = getProperty("password");
        passwordField.sendKeys(password);

        WebElement loginbutton = driver.findElement(By.cssSelector(".button"));
        loginbutton.click();
    }

    public static String getProperty(String key) throws IOException {

        FileInputStream file = new FileInputStream(Constants.CONFIG_READER_PATH);
        Properties properties = new Properties();
        properties.load(file);
        return properties.getProperty(key);
    }
}
