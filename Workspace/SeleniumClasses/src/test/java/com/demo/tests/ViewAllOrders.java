package com.demo.tests;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.demo.pages.LoginPage;
import com.demo.utils.BrowserInit;
import com.demo.utils.ScreenShotUtil;

public class ViewAllOrders extends BrowserInit{
	
	LoginPage obj_LoginPage;
	ScreenShotUtil obj_ScreenShotUtil;
	
	
	
	@Test(priority=1)
	public void login() throws InterruptedException, IOException {		
		obj_ScreenShotUtil = new ScreenShotUtil(driver);
		obj_LoginPage = new LoginPage(driver);
		obj_LoginPage.fn_Login("Tester", "test");		
		Thread.sleep(1500);
		obj_ScreenShotUtil.getScreenShot(driver, "AfterLogin");
	}
	
	@Test(priority=2)
	public void webTableDemo() {
		WebElement orderTable = driver.findElement(By.id("ctl00_MainContent_orderGrid"));
		//WebElement orderTable = driver.findElement(By.xpath("//table[@class='SampleTable']"));
		
		//Getting number of rows
		List<WebElement> rows = orderTable.findElements(By.tagName("tr"));
		System.out.println("Total rows : "+rows.size());
		
		//Table Row Index starts from 0
		//Starting row is 2 i.e.counter is 1,as first row only heading with tag name th
		for(int i=1 ; i< rows.size() ; i++) {
			List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
			System.out.println("Total cols at row number : "+i+" is - "+cols.size());
			
			//Table col index starts from 0
			//Skipping first col and last col in below loop
			for(int j=1 ; j<cols.size()-1 ; j++) {
				System.out.println(cols.get(j).getText());
			}
		}
		
		obj_ScreenShotUtil.getWholeScreenShotUsingRobot("OrdersTable");
	}

}

