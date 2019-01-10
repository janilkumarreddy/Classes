package com.demo.utils;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AlertsFramesWindows {
	
	
	public WebDriver driver;
	
	//1.Simple Alert - Alert content and  OK button
	//2.Prompt Alert - Input box, OK button and Cancel button
	//3.Confirmation Alert - Alert content, OK and Cancel buttons
	
	public void validateAlertExistence() {
		
		WebElement link =driver.findElement(By.xpath("link"));		
		link.click();		
		
		try {
			Alert alertPopup = driver.switchTo().alert();			
			
			List<WebElement> buttons = driver.findElements(By.className("button"));			
			if(buttons.size() > 0) {
				System.out.println(buttons.size()+" button(s) exists on alert");
			}
			
			String popupText = alertPopup.getText();
			System.out.println(popupText);
			
			alertPopup.accept();
			alertPopup.dismiss();
			
			alertPopup.sendKeys("Text");
			
			
		} catch (Exception e) {
			System.out.println("Alert doesn't exist");
		}
	
	}
	
	public void validateFrames() {
		
		WebElement link =driver.findElement(By.xpath("link"));
		
		driver.switchTo().frame(1);//index
		driver.switchTo().frame("a077aa5e");//frameName or FrameID
		driver.switchTo().frame(link);//WebElement on Frame		
		
	}
	
	
	public void validateWindows() {
		WebElement link = driver.findElement(By.xpath("link"));
		link.click();
		String parentWinID = driver.getWindowHandle();		
		Set<String> winHandles = driver.getWindowHandles();
		
		Iterator iterate = winHandles.iterator();
		
		
		
		if(winHandles.size() == 1) {
			System.out.println("No new window has opened on clikcing link");
		}else if(winHandles.size() == 2) {
			System.out.println("Child window opened");
			
			for(String windIds : winHandles) {
				System.out.println(windIds);
				if(!parentWinID.equals(windIds)) {
					driver.switchTo().window(windIds);
					
					WebElement input1 = driver.findElement(By.xpath("input1"));
					WebElement input2 = driver.findElement(By.xpath("input2"));
					
					input1.sendKeys("Text");
					input2.sendKeys("tex2");
					
				}
			}
			
		}else if(winHandles.size() >2) {
			System.out.println("failed");
		}
		
		//driver - window1 [ParentWindow]
		//		 - window2 [ChildWindow - input1,input2 and OK button]
		
		
		
	}
	

}
