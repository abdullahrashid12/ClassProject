package com.saucedemo.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage 
{
	WebDriver driver;
	
	@FindBy(xpath="/html/body/div/div/div/div[2]/div/div[2]/div/div[1]/div[3]/button")
	WebElement addtocart;
	
	@FindBy(xpath="//*[@id='shopping_cart_container']/a/span")
	WebElement shoppingcart;
	
	@FindBy(xpath="/html/body/div/div/div/div[2]/div/div[1]/div[2]/div")
	WebElement titleforpage;
	
	public ProductPage(WebDriver driver){
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickAddtoCart()
	{
		addtocart.click();
		
	}
	
	public void findCart()
	{
		shoppingcart.isDisplayed();
	}
	
	public void findTitleforpage(){
		titleforpage.isDisplayed();
		
	}

}
