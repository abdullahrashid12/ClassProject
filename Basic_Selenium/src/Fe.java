import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Fe {

	public static void main(String[] args) {
		 System.setProperty("webdriver.gecko.driver", "/Users/abdullahrashid/Documents/workspace/nj/geckodriver");

			WebDriver driver = new FirefoxDriver(); 
			driver.get("http://www.google.com/");

	}

}
