package com.saucedemo.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	/*
	 * Create all the object repo I need for login page using page object factory
	 * 
	 */
	WebDriver driver;
	@FindBy(id="user-name")
	WebElement userNamerfield;
	
	@FindBy(id="password")
	WebElement userPasswordfield;
	
	@FindBy(id="login-button")
	WebElement loginBttn;
	
	
	/*
	 * Create Constructor method for this class
	 */
	
	public LoginPage(WebDriver driver){
		this.driver= driver;
		PageFactory.initElements(driver, this);

	}
	
	public void setUsernamer(String userN)
	{
		userNamerfield.sendKeys(userN);
		
	}
	
	
	public void setUserpassword(String passWd)
	{
		userPasswordfield.sendKeys(passWd);
		
	}
	
	public void clickBtn()
	{
		loginBttn.click();
		
	}
	
	/*
	 * Create Method to login to the site
	 */
	
	
 

}
