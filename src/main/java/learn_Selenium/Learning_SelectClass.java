package learn_Selenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Learning_SelectClass {

	@Test
	public void learnDropDown() {
		//System.setProperty("","");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"))));
		
		WebElement favSelectEle = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
		Select favDD = new Select(favSelectEle);
		favDD.selectByVisibleText("Selenium");
		
		// select multiple values on search drop down (no select tag)
		
		
				WebElement courseEle = driver.findElement(By.xpath("(//h5[text()='Choose the Course']/following::button)[1]"));
				courseEle.click();
				
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[text()='AWS']")));
				driver.findElement(By.xpath("//li[text()='RestAssured']")).click();
				
				
				
				driver.findElement(By.xpath("(//h5[text()='Choose the Course']/following::ul)[1]")).sendKeys("AWS",Keys.ENTER);
				
				
		
	}
	
}
