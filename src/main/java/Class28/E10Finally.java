package Class28;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class E10Finally {
    public static void main(String[] args) {

        WebDriver webDriver = new ChromeDriver();
        try {
            webDriver.get("https://google.com");
            webDriver.findElement(By.xpath("sdjd"));
        }finally {
            webDriver.close();
        }
    }
}
//the finally block is useful for cleaning up resources such as files
//or network connections, that should ble closed no mayyer what happens in the try block.
// it ensures that the block of code uis closed no matter what happens