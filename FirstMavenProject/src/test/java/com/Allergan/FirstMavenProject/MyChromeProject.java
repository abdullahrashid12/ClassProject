package com.Allergan.FirstMavenProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyChromeProject {
  
	@Test
  public void OpenChromeBrowser() {
		  WebDriver driver = null;
		  /*
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
		  driver.quit();*/
		  
		  System.setProperty("webdriver.gecko.driver", "/Users/abdullahrashid/Documents/workspace/nj/geckodriver");
  
		  driver= new FirefoxDriver();
	
	}
}
