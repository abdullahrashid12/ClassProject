import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Java {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/abdullahrashid/Documents/workspace/Basic_Selenium/chromedriver");
		WebDriver dr= new ChromeDriver();
		dr.get("https://www.facebook.com");

	}

}