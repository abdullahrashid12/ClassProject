package com.Allergan.nj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainClass {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "/Users/abdullahrashid/Documents/workspace/nj/chromedriver");
		WebDriver dr= new ChromeDriver();
		dr.get("http://www.google.com");
		

	}

}
