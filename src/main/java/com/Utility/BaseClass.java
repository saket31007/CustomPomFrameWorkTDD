package com.Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	public static ConfigDataProvider Config;
	public static  ExcelDataProvider excel;
	
	@BeforeSuite()
	public void BS() throws Exception {
		 Config = new ConfigDataProvider();
		 excel = new ExcelDataProvider();
	}
	@Parameters({"url"})
	@BeforeMethod
	
	public void setup(String url) {
	
	 if(url.equalsIgnoreCase(Config.getStage_Url())) {
	
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.get(Config.getStage_Url());
	 }
	 
	 else if(url.equalsIgnoreCase(Config.getLive_Url())) {
		 
		 WebDriverManager.chromedriver().setup();
			
			driver = new ChromeDriver();
			driver.get(Config.getLive_Url());
		 
	 }
		}
	
	
		
	

	
	@AfterMethod
	
	public void teardown() {
		
	driver.quit();
	}
}
