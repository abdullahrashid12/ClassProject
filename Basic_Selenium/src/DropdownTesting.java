import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownTesting {

	public static void main(String[] args) throws InterruptedException 
	{
		String baseURL = "https://www.yourspark.com/";
		//System.setProperty("webdriver.gecko.driver","/Users/abdullahrashid/Documents/workspace/Basic_Selenium/geckodriver");
		
		System.setProperty("webdriver.chrome.driver", "/Users/abdullahrashid/Documents/workspace/Basic_Selenium/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.get(baseURL);
		
		driver.wait(20000);
		
		////*[@id="__next"]/footer/div/div[1]/div[1]/a
		driver.findElement(By.xpath("//*[@id='__next']/footer/div/div[1]/div[1]/a")).click();
		
		
		if(driver.getTitle().equals("allerganaesthetics")){
			System.out.println("Title Found");
			
		}else{
			System.out.println("Title not found");
		}
	}
	
	

}
