package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown {

	public static void main(String[] args) {
		
		String baseURL = "https://www.yourspark.com/";
		//System.setProperty("webdriver.gecko.driver","/Users/abdullahrashid/Documents/workspace/Basic_Selenium/geckodriver");
		
		System.setProperty("webdriver.chrome.driver", "/Users/abdullahrashid/Documents/workspace/JavaSelenium/chromedriver");
		WebDriver dr= new ChromeDriver();
		dr.navigate().to(baseURL);
	


	}

}
