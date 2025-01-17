package ReporterClass;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

public class ReportLog 
{
	WebDriver dr= new ChromeDriver();
	String dirverpath = "/Users/abdullahrashid/Documents/workspace/FirstTestNGPrjoject/chromedriver";
	
	@Test(priority = 0)
	public void closingBrowser()
	{
		dr.close();
		Reporter.log("Closing Browser");
		
	}
	
	@Test(priority = - 1)
	public void openingBrowser()
	{
		Reporter.log("Setting Up ChromeDriver exe file location");
		System.setProperty("webdriver.chrome.driver", dirverpath);
		Reporter.log("Launching Google Chrome Driver for this test");
		dr.get("https://www.demoqa.com");
        Reporter.log("The website used was DemoQA for this test");
        Reporter.log("Creating String object where i am storing expected title of the Website");
        String expectedTitle= "ToolsQA";
        Reporter.log("Creating string object where getititle will be storeed for actualtiel");
        String actualTitle=dr.getTitle();
        Reporter.log("Using TestNG Assert Class I am going to compare the title of the Webpage");
        Assert.assertEquals(actualTitle, expectedTitle);
        Reporter.log("If actualtitle matches test pass, otherwise test failed");
        
        System.out.println("*** Checking For The Second Title ***");
     // Checking title for ToolsQA – Demo Website to Practice Automation – Demo Website to Practice Automation
       SoftAssert as= new SoftAssert();
       as.assertEquals(actualTitle, "ToolsQA" );
       as.assertAll();
           

	}
	
 
}
