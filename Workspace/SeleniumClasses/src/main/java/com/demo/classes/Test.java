package com.demo.classes;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;

public class Test {
	
	public WebDriver driver;
	public String url = "http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx?";
	public Properties prop;
	
	@BeforeTest
	public void broowserInit() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\lib\\chromedriver_2_45.exe");
		driver = new ChromeDriver();
		
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		if(isElementPresent(By.id("id")) != null) {
			driver.findElement(By.id("id")).click();
		}
		
	}
	
	public WebElement isElementPresent(By by) {
		WebElement button = null;
		try {
			button = driver.findElement(by);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return button;
	}
	
	public boolean isDisplyed(By by) {
		
		if(isElementPresent(By.id("id")) != null) {
			return driver.findElement(By.id("id")).isDisplayed();
		}else
			return false;
		
	}

}
