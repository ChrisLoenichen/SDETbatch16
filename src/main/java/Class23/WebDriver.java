package Class23;
/*
Create a WebDriver Interface that will have the following unimplemented behaviour:
 openBrowser(), closeBrowser(), maximizeWindow(), findElement().
 Create 2 classes that implements WebDriver interface: ChromeDriver and FirefoxDriver.
 */
public interface WebDriver {
    public void openBrowser();
    public void closeBrowser();
    public void maximizeWindow();
    public void findElement();
}

class ChromeDriver implements WebDriver{

    public void openBrowser(){
        System.out.println("open");
    }
    public void closeBrowser(){
        System.out.println("close");
    }
    public void maximizeWindow(){
        System.out.println("max");
    }
    public void findElement(){
        System.out.println("find");
    }
}

class FirefoxDriver implements WebDriver{
    public void openBrowser(){
        System.out.println("open");
    }
    public void closeBrowser(){
        System.out.println("close");
    }
    public void maximizeWindow(){
        System.out.println("max");
    }
    public void findElement(){
        System.out.println("find");
    }
}