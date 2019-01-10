package com.demo.classes;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutorDemo {

	private static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//String homePage =  "https://www.google.com/";
		String url =  "http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx?";
		
		
	

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\lib\\chromedriver_2_45.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);

		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//Fetching the Domain Name of the site. Tostring() change object to name.		
        String DomainName = js.executeScript("return document.domain;").toString();			
        System.out.println("Domain name of the site = "+DomainName);
        
      //Fetching the URL of the site. Tostring() change object to name		
        String url1 = js.executeScript("return document.URL;").toString();			
        System.out.println("URL of the site = "+url1);					
          		
       //Method document.title fetch the Title name of the site. Tostring() change object to name		
       String TitleName = js.executeScript("return document.title;").toString();			
       System.out.println("Title of the page = "+TitleName);
       
       //driver.getCurrentUrl();
       //driver.getTitle();
       
       
       //Enter text and click on submit
       js.executeScript("document.getElementById('ctl00_MainContent_username').value='Tester';");
       js.executeScript("document.getElementById('ctl00_MainContent_password').value='test';");
       WebElement submit = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_login_button']"));
       js.executeScript("arguments[0].click()",submit);
       
     //Navigate to new Page i.e to generate access page. (launch new url)
       js.executeScript("window.location = 'http://moneyboats.com/'");	
       Thread.sleep(5000);
       
     //Vertical scroll down by 600  pixels		
       //js.executeScript("window.scrollBy(0,1600)");
       
    // for scrolling till the bottom of the page we can use the code like
       js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
       Thread.sleep(2000);
        
       WebElement Home = driver.findElement(By.xpath("//h1[@class='main-title entry-title']//a[text()='Home']"));
       js.executeScript("arguments[0].scrollIntoView(true)", Home);
       
       //To refresh browser window using javascript   	
       js.executeScript("history.go(0)");
       
      
		

	}
}
