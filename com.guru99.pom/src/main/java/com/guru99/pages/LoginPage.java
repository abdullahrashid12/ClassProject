package com.guru99.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage 
{
	WebDriver driver;
	
	/*
	 * Add All the elements of the Loginpage
	 */

	By userName = By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input");
    By passWd = By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input");	
    By buttonLogin= By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]");
    By title = By.xpath("/html/body/h4/span");
    
    public LoginPage(WebDriver driver){
    	  this.driver = driver;
    }
    
    public void setUserNamer (String userNameforinput){
    	driver.findElement(userName).sendKeys(userNameforinput);
    }
    
    public void setUserPassWD (String passWord){
    	driver.findElement(passWd).sendKeys(passWord);
    	
    }
    
    public void clickButton (){
    	driver.findElement(buttonLogin).click();
    }
    
    public void findTitle()
    {
    	driver.findElement(title);
    }
    
    public void loginGuru99(String userNameforinput, String passWord ){
    	this.setUserNamer(userNameforinput);
    	this.setUserPassWD(passWord);
    	//this.clickButton();
    	this.findTitle();
    }
    
    
}
