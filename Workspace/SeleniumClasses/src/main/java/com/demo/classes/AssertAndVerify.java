package com.demo.classes;

import org.junit.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertAndVerify {

	@Test()
	public void Assert() {
		System.out.println("serverStartedOk");

		Assert.assertEquals("Test", "test");






	}

	@Test()
	public void verify() {
		//Handling Asserti.e., indirectly handling/implementing Verify
		try {
			Assert.assertEquals("Test", "test");
		} catch (Error e) {
			System.out.println("Assert exception");
		}
		System.out.println("After failure");
	}

	@Test
	public void softAssert() {
		SoftAssert soft = new SoftAssert();
		System.out.println("softAssert");		
		//Assert.assertEquals("Test", "test");	

		soft.assertEquals(1, 2);
		System.out.println("After softassert failure");
		System.out.println("After softassert failure");
		System.out.println("After softassert failure");
		System.out.println("After softassert failure");

		soft.assertAll();
	}
}