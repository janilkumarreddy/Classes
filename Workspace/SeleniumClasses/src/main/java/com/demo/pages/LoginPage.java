package com.demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	private WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		//PageFactory.initElements(driver, LoginPage.class);
	}
	
	//************************************Page Objects*********************************
	
	@FindBy(id = "ctl00_MainContent_username")
	private WebElement loginUserNameTxt;
	
	@FindBy(id = "ctl00_MainContent_password")
	private WebElement loginPasswordTxt;
	
	@FindBy(id = "ctl00_MainContent_login_button")
	private WebElement loginBtn;
	
	//***********************************************************************************
	
	//**********************************Page methods***************************************
	/*public void enterUserName(String inputTxt) {
		loginUserNameTxt.clear();
		loginUserNameTxt.sendKeys(inputTxt);
	}
	
	public void enterPassword(String inputTxt) {
		loginPasswordTxt.clear();
		loginPasswordTxt.sendKeys(inputTxt);
	}
	
	public void clickOnLogin() {
		loginBtn.click();
	}
	*/
	
	public void enterUserName(String inputTxt) {
		
		WebElement loginUserNameTxt = driver.findElement(By.id("ctl00_MainContent_username"));
		loginUserNameTxt.clear();
		loginUserNameTxt.sendKeys(inputTxt);
	}
	
	public void enterPassword(String inputTxt) {
		WebElement loginPasswordTxt = driver.findElement(By.id("ctl00_MainContent_password"));
		loginPasswordTxt.clear();
		loginPasswordTxt.sendKeys(inputTxt);
	}
	
	public void clickOnLogin() {
		WebElement loginBtn = driver.findElement(By.id("ctl00_MainContent_login_button"));
		loginBtn.click();
	}
	
	public void fn_Login(String userName,String pwd) {
		enterUserName(userName);
		enterPassword(pwd);
		clickOnLogin();
	}
	
	
	
	
	
	

}