package seleniumUI;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class selenium_without_Get {

    @Test
    public void test(){
        ChromeDriver driver = new ChromeDriver();
        String url = "https://www.google.com/";
        ((JavascriptExecutor) driver).executeScript("window.location='" +url+ "'");
    }
}
