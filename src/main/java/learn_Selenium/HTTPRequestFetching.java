package learn_Selenium;

import java.time.Duration;
import java.util.Optional;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v115.network.Network;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HTTPRequestFetching {


	//public WebDriverWait wait;
	public ChromeDriver driver;
	
	
	@Test
	public void HTTPRequestFetching() {
		
	Optional<Integer> optionalInteger = Optional.empty();
	driver = new ChromeDriver();
	DevTools devTool = driver.getDevTools();
	devTool.createSession();
	devTool.send(Network.enable(optionalInteger, optionalInteger,optionalInteger));
    //devTool.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));
	 devTool.addListener(Network.requestWillBeSent(), requestSent -> {
	      System.out.println("Request URL => " + requestSent.getRequest().getUrl());
	      System.out.println("Request Method => " + requestSent.getRequest().getMethod());
	      System.out.println("Request Headers => " + requestSent.getRequest().getHeaders().toString());
	      System.out.println("-------------------------------------------------");
	      
	});
	 
	 
	 
	 driver.get("https://www.google.com/");
	 
	 
	 //ResponseReceived
	 devTool.addListener(Network.responseReceived(), responseReceived -> {
	      System.out.println("response => " + responseReceived.getResponse().getUrl());
	      System.out.println("-------------------------------------------------");
	      
	});
	 
	 driver.findElement(By.xpath("//*[@title='Search']")).sendKeys("test",Keys.ENTER);
	}

	
}
