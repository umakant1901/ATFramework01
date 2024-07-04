package com.at.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {
/*
 * WebDriver
 * Properties
 * Logs
 * ExtentReports
 * DataBase
 * Excel
 * Mail
 * 
 */
	public static WebDriver driver;
	public static Properties prop;
	public static Properties objRepo;
	public static FileInputStream fis;
	
	
	@BeforeSuite
	public void setUp() throws IOException
	{
		if(driver==null)
		{
			fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\Config.properties");
			prop.load(fis);
			
			fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\OR.properties");
			objRepo.load(fis);
			
			if(prop.getProperty("browser").equalsIgnoreCase("firefox"))
			{
				System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/src/test/resources/executables/geckodriver.exe");
				driver=new FirefoxDriver();
			}else if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {
				
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/test/resources/executables/chromedriver.exe");
				driver=new ChromeDriver();
				
			}
			driver.get(prop.getProperty("testurl"));
//			driver.manage().timeouts().implicitlyWait(Integer.parseInt(prop.getProperty("waittimeout")),TimeUnit.SECONDS);
			
			
			
			
		}
			
	}
	
	@AfterSuite
	public void tearDown()
	{
		
	}
	
	
	
}
