package com.demo.classes;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {

	private static WebDriver driver = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String homePage =  "https://www.google.com/";
		String url =  "http://demo.guru99.com/test/upload/";
		
		
	

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\lib\\chromedriver_2_45.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);

		driver.findElement(By.id("uploadfile_0")).sendKeys("E:\\Selenium\\Workspace\\SeleniumClasses\\ObjectRepository\\OR.properties");
		
		

	}
}
