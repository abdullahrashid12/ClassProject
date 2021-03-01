package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest 
{
	public String baseurl= "http://demo.guru99.com/test/newtours/";
	String dirverpath = "/Users/abdullahrashid/Documents/workspace/FirstTestNGPrjoject/chromedriver";
	WebDriver dr= new ChromeDriver();
	
	
	@Test
  public void a_openBrowser() 
	{
		System.setProperty("webdriver.chrome.driver", dirverpath);
		dr.get(baseurl);
		}
	
	@Test
	public void b_verifyTitle()
	{
		String actualTitle ="Welcome: Mercury Tours";
		String expectedTitle= dr.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	@Test 
	public void closeBrowser()
	{
		dr.close();
	}
}
