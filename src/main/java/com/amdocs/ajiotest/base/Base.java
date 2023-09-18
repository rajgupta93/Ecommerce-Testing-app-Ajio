package com.amdocs.ajiotest.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	public static WebDriver webDriver;
	public static Properties properties;
	
	public static void loadConfig() {
		
		
		try {
		properties = new Properties();
		FileInputStream ip = new FileInputStream("D:\\AmdocsAQE\\MyCromaWebsiteTestingProject\\Configuration\\Config.Properties");
		properties.load(ip);
		
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}
	public static void launchWebApp() throws IOException{
		
		WebDriverManager.edgedriver().setup();
		
		
		EdgeOptions options = new EdgeOptions();
		options.addArguments("--remote-allow-origins=*");
		webDriver = new EdgeDriver(options);
		
		webDriver.manage().window().maximize();
		System.out.print(properties.getProperty("url"));
		webDriver.get(properties.getProperty("url"));
	}
	
	
	public static String getPhoneNumber() {
		return properties.getProperty("phonenumber");
	}
	
}
