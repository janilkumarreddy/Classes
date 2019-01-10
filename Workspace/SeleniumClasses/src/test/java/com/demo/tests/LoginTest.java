package com.demo.tests;

import org.testng.annotations.Test;

import com.demo.pages.LoginPage;
import com.demo.utils.BrowserInit;

public class LoginTest extends BrowserInit {
	
	LoginPage obj_LoginPage;
	
	@Test
	public void login() throws InterruptedException {
		obj_LoginPage = new LoginPage(driver);
		obj_LoginPage.fn_Login("Tester", "test");
		
		Thread.sleep(1500);
	}

}
