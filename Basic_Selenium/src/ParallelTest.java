import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ParallelTest {
	
	@Test
	public void openFirefox(){
		System.setProperty("webdriver.gecko.driver", "/Users/abdullahrashid/Documents/workspace/nj/geckodriver");

		WebDriver driver = new FirefoxDriver(); 
		driver.get("http://www.facebook.com/");
		driver.quit();
		
	}

	@Test
	public void openChrome()
	{
	System.setProperty("webdriver.chrome.driver", "/Users/abdullahrashid/Documents/workspace/Basic_Selenium/chromedriver");
	WebDriver driver= new ChromeDriver();
	driver.get("http://www.facebook.com/");
	driver.quit();
		
	}
}
