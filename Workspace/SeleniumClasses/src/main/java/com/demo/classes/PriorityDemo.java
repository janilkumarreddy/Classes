package com.demo.classes;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.demo.pages.LoginPage;
import com.demo.utils.BrowserInit;
import com.demo.utils.ScreenShotUtil;

public class PriorityDemo {
	
	@Test
	public void NoPriority() {
		System.out.println("No priority");
	}
	
	@Test
	public void ANoPriority() {
		System.out.println("A No priority");
	}
	
	@Test(priority=0)
	public void priority0() {
		System.out.println("Priority 0");
	}
	
	@Test(priority=-1)
	public void priorityMinus1() {
		System.out.println("Priority -1");
	}
	
	@Test(priority=1)
	public void priority1() {
		System.out.println("Priority 1");
	}
	
	@Test(priority=2)
	public void priority2() {
		System.out.println("Priority 2");
	}

}

