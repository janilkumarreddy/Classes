package com.demo.classes;

import org.junit.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DependsOnGroups {
	
	//If any dependsOnGroups/Methods failed, calling method will get skipped
	
	@Test(groups = { "init" })
	public void serverStartedOk() {
		
		SoftAssert soft = new SoftAssert();
		System.out.println("serverStartedOk");		
		//Assert.assertEquals("Test", "test");	
		
		soft.assertEquals(1, 2);
		System.out.println();
	}
	 
	@Test(groups = { "init" })
	public void initEnvironment() {
		System.out.println("initEnvironment");
	}
	 
	@Test(dependsOnGroups = { "init.*" })
	public void method1() {
		System.out.println("method1");
	}
	
	@Test(groups = { "exit" })
	public void exit() {
		System.out.println("exit");
	}


}
