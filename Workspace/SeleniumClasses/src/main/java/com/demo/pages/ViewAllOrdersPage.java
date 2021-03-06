package com.demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.demo.utils.PropertiesFileUtil;

public class ViewAllOrdersPage {

	private WebDriver driver;
	PropertiesFileUtil prop;

	public ViewAllOrdersPage(WebDriver driver) {
		this.driver = driver;
		//PageFactory.initElements(driver, LoginPage.class);
		
		prop = new PropertiesFileUtil();
	}

	//*****************Objects*******************************
	By viewAllOrdersTable = By.id(prop.getORProperty("OrdersTable_Id"));
	//*******************************************************
	
	//***************************Methods************************
	
	public WebElement getTable() {
		return driver.findElement(viewAllOrdersTable);
	}
	
	

}
