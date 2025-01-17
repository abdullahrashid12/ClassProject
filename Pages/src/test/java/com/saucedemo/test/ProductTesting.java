package com.saucedemo.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.saucedemo.Pages.LoginPage;
import com.saucedemo.Pages.ProductPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProductTesting 
{
	WebDriver driver;
	String uNamer= "standard_user";
	String pWd= "secret_sauce";
	
	@BeforeTest
	public void openBrs()
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
		  driver.get("https://www.saucedemo.com/");
		
	}
	
	@Test(priority= 1)
	public void login() throws InterruptedException{
		LoginPage lp = new LoginPage(driver);
		lp.setUsernamer(uNamer);
		lp.setUserpassword(pWd);
		lp.clickBtn();
		
	}
	
	
	@Test(priority= 2)
	public void buyProduct()
	{
		ProductPage pg= new ProductPage(driver);
		pg.clickAddtoCart();
		pg.findCart();
		pg.findTitleforpage();
		
	}
	
	@AfterTest
	public void closBrs()
	{
		driver.close();
	}
	
	

}
