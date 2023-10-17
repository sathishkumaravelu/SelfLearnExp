package learn_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFunctionality {

    public void test() {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ifkv=AYZoVhfv5ht1vXht_JPn10ka5AqUH3qaUqndUcBOdJgp2Fm0iP4nREcQHCrZjyHRSZTWeCJL4s1dmg&rip=1&sacu=1&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S-1609853501%3A1697189330933132&theme=glif");
        driver.findElement(By.id("identifierId")).sendKeys("sathish@gmail.com");
        driver.findElement(By.xpath("//span[text()='Next']")).click();
    }
}
