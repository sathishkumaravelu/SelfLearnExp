package seleniumUI;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.github.javafaker.Faker;

import junit.framework.Assert;

/*
 * Faker library in combination with Selenium in Java scripts can be a great way to generate random and realistic
 * test data for input fields. The Faker library provides a simple way to create fake data like names, addresses,
 * emails, etc., which you can then populate into your Selenium test scripts.
 * 
 */

public class fakersClass_Implementation {


	public static String baseURL = "http://leaftaps.com/opentaps/control/main";

	@Test
	public void createLead() {

		Faker faker = new Faker();
		WebDriver driver = new ChromeDriver();

		// implicit wait of 60 sec
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.get(baseURL);
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.xpath("//*[contains(text(),'CRM/SFA')]")).click();

		driver.findElement(By.xpath("//li[@class='sectionTabButtonUnselected']//a[contains(text(),'Leads')]")).click();

		driver.findElement(By.xpath("(//*[text()='Create Lead'])[1]")).click();

		// createLeadForm_companyName
		String companyName = faker.company().name();
		String firstName = faker.name().fullName();
		String lastName = faker.name().lastName();
		String department = faker.company().profession();
		String emailAddress = faker.internet().emailAddress();

		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);

		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
		System.out.println(companyName +" "+ firstName +" "+ lastName);
		driver.findElement(By.id("createLeadForm_description")).sendKeys("testing create lead");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys(department);
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys(emailAddress);
		WebElement stateDDElement = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select stateDD = new Select(stateDDElement);
		stateDD.selectByIndex(1);

		driver.findElement(By.xpath("//*[@value='Create Lead']")).click();
		String actualTitle = driver.getTitle();

		Assert.assertEquals("View Lead | opentaps CRM", actualTitle);

		driver.quit();

	}

}
