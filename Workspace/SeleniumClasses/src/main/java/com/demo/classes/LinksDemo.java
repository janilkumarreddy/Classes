package com.demo.classes;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksDemo {
	
	public static WebDriver driver;
	public static String url = "https://www.google.com/";
	
	public static void main(String args[]) {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\lib\\chromedriver_2_45.exe");
		driver = new ChromeDriver();
		
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		LinksDemo obj = new LinksDemo();
		obj.getAllLinks();
	}
	
	
	public void getAllLinks() {
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println("links count : "+links.size());
		
		if(links.size() == 0) {
			System.out.println("No links available");
		}else {			
			for(WebElement link : links) {
				System.out.println(link.getText());
				
				/*if(link.getText().equals("Gmail")) {
					link.click();
					break;
				}*/
			}
		}
	}

}
