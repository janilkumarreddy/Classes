package com.demo.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileUtil {

	public static void main(String[] args) throws IOException {

		String propFilePath = System.getProperty("user.dir")+"\\Config\\config.properties";


		FileInputStream fis = new FileInputStream(propFilePath);		
		Properties prop = new Properties();		
		prop.load(fis);


		System.out.println(prop.getProperty("UserName"));
	}
	
	public Properties getORPropertyFile() throws IOException {
		String propFilePath = System.getProperty("user.dir")+"\\ObjectRepository\\OR.properties";
		FileInputStream fis = new FileInputStream(propFilePath);		
		Properties prop = new Properties();		
		prop.load(fis);
		
		return prop;
	}
	
	public Properties getJSONPropertyFile() throws IOException {
		String propFilePath = System.getProperty("user.dir")+"\\Config\\SampleJson.json";
		FileInputStream fis = new FileInputStream(propFilePath);		
		Properties prop = new Properties();		
		prop.load(fis);
		
		return prop;
	}

	public String getORProperty(String keyProperty)  {
		String propFilePath = System.getProperty("user.dir")+"\\Config\\config.properties";

		String valueToReturn = "";
		Properties prop = null;
		try {
			FileInputStream fis = new FileInputStream(propFilePath);		
			prop = new Properties();		
			prop.load(fis);
		} catch(Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(valueToReturn=prop.getProperty(keyProperty));
		return valueToReturn;
	}
	
	
	public String getJsonFileProperty(String keyProperty)  {
		String propFilePath = System.getProperty("user.dir")+"\\Config\\config.properties";

		String valueToReturn = "";
		Properties prop = null;
		try {
			FileInputStream fis = new FileInputStream(propFilePath);		
			prop = new Properties();		
			prop.load(fis);
		} catch(Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(valueToReturn=prop.getProperty(keyProperty));
		return valueToReturn;
	}
	/*public Properties getPropertiesFile(String propFilePath) {
		String propFilePath = System.getProperty("user.dir")+"\\Config\\config.properties";


		FileInputStream fis = new FileInputStream(propFilePath);		
		Properties prop = new Properties();		
		prop.load(fis);
	}*/

}