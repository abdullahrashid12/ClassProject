package class_30;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		String baseUrl = "http://demo.guru99.com/test/newtours/register.php";
	
		System.setProperty("webdriver.chrome.driver", "/Users/abdullahrashid/Documents/workspace/Class30/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.get(baseUrl);
		
		////html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[11]/td[2]/select
		

		Select dropdown= new Select(driver.findElement(By.xpath("//html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[11]/td[2]/select")));
	    //dropdown.selectByVisibleText("BANGLADESH");
		dropdown.selectByIndex(10);
	
	}

}
