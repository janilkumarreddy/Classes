package com.demo.utils;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.BeforeTest;

public class BrowserInit {
	
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
		
		RemoteWebDriver driver2;
		
		/*ChromeDriver driver1 = new ChromeDriver();
		FirefoxDriver driver2 = new FirefoxDriver();
		InternetExplorerDriver driver3 = new InternetExplorerDriver();
		SafariDriver driver4 = new SafariDriver();
		
		
		driver = new ChromeDriver();
		driver = new FirefoxDriver();
		driver = new InternetExplorerDriver();
		driver = new SafariDriver();*/
	}

}
