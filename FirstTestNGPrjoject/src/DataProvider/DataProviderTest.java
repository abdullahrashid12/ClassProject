package DataProvider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest  
{
	WebDriver dr= new ChromeDriver();
	String dirverpath = "/Users/abdullahrashid/Documents/workspace/FirstTestNGPrjoject/chromedriver";
	
	@DataProvider(name = "Authentication")
	 public static Object[][] credentials() {
	// The number of times data is repeated, test will be executed the same no. of times
	// Here it will execute two times
	 return new Object[][] { { "testuser_1", "Test@123" }, { "testuser_2", "Test@1234" }};   
	 }
	
	@Test(dataProvider = "Authentication")
	 public void test(String sUsername, String sPassword) throws InterruptedException {
		Reporter.log("Setting Up ChromeDriver exe file location");
		System.setProperty("webdriver.chrome.driver", dirverpath);
		Reporter.log("Launching Google Chrome Driver for this test");
	 
		
	 dr.get("https://www.facebook.com/");
	
	 // Argument passed will be used here as String Variable
	 dr.findElement(By.xpath("//*[@id='email']")).sendKeys(sUsername);
	 dr.findElement(By.xpath("//*[@id='pass']")).sendKeys(sPassword);
	 dr.findElement(By.cssSelector("#u_0_d_Jq")).click();
	 dr.navigate().back();
	 dr.wait(2000);
	 
	
	 dr.close();
	 }
	
	
	 


 
}
