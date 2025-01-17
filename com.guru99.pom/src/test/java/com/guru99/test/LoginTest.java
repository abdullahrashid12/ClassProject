package com.guru99.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.guru99.pages.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest 
{
	WebDriver driver;
	LoginPage lg;
	@BeforeTest
	public void openSite()
	{
		 
		  WebDriverManager.chromedriver().browserVersion("88.0.4324.182").setup();
		  ChromeOptions options = new ChromeOptions();
		  options.addArguments("start-maximized"); 
		  options.addArguments("enable-automation"); 
		  options.addArguments("--no-sandbox"); 
		  options.addArguments("--disable-infobars");
		  options.addArguments("--disable-dev-shm-usage");
		  options.addArguments("--disable-browser-side-navigation"); 
		  options.addArguments("--disable-gpu"); 
		  driver = new ChromeDriver(options);
		  driver.get("http://demo.guru99.com/V4/");
	}
	
	@Test
	public void logTest()
	{
		lg= new LoginPage(driver);
		lg.loginGuru99("admin"," password");
		
	}
	
	@AfterTest
	public void closeBrowser(){
		driver.close();
	}
	

}
