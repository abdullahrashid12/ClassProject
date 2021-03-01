package com.Allergan.nj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest {
	
  @Test
  public void f() {
	//  System.setProperty("webdriver.chrome.driver", "/Users/abdullahrashid/Documents/workspace/nj/chromedriver");
	  
	  
	  WebDriver driver = null;
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
	  driver.get("https://www.google.com");
	  
	
  }
}