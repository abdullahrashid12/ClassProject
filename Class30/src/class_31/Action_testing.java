package class_31;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Action_testing {

	public static void main(String[] args) 
	{
		String baseUrl= "http://www.facebook.com/";

		
		System.setProperty("webdriver.chrome.driver", "/Users/abdullahrashid/Documents/workspace/Class30/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.get(baseUrl);
		
		WebElement textusername=driver.findElement(By.id("email"));
		
		Actions acs= new Actions(driver);
		Action ac= acs.moveToElement(textusername).click().keyDown(textusername, Keys.LEFT_SHIFT).sendKeys(textusername, "QATECH").keyUp(textusername, Keys.SHIFT).doubleClick(textusername).build();
		ac.perform();
		
		driver.close();
	
	}

}
