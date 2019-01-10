package com.demo.utils;

import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

import javax.imageio.ImageIO;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.apache.commons.io.FileUtils;

public class ScreenShotUtil {
	
	private WebDriver driver;

	public ScreenShotUtil(WebDriver driver) {
		this.driver = driver;
	}
	
	public void getScreenShot(WebDriver driver, String fileName) throws IOException {
		
		Random ran = new Random();
		
		//TakesScreenshot screenShot = (TakesScreenshot)driver;		
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);		
		FileUtils.copyFile(file, new File(System.getProperty("user.dir")+"\\Reports\\ScreenShots\\"+fileName+"_"+ran.nextInt(100000)+".png"));
	}
	
	
	public void getWholeScreenShotUsingRobot(String fileName){
		Random ran = new Random();
	    try{
	        BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
	        ImageIO.write(image, "jpg", new File(System.getProperty("user.dir")+"\\Reports\\ScreenShots\\"+fileName+"_"+ran.nextInt(100000)+".jpg"));
	    }
	    catch(Exception e){
	        e.printStackTrace();
	    }
	}
}
