import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class SeleniumText {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Set up my chrome driver path
		///Users/abdullahrashid/Desktop/WebDirver/chromedriver
		System.setProperty("webdriver.chrome.driver", "/Users/abdullahrashid/Documents/workspace/Basic_Selenium/chromedriver");
		WebDriver driver= new ChromeDriver();
		//driver.navigate().to("https://www.spicejet.com/");  
		//Thread.sleep(2000);
		//Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		//System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isEnabled()); 
		String url = "https://www.phptravels.net/home";
		driver.navigate().to(url);
		
		Thread.sleep(2000);
		
		//Print out the url
		System.out.println(url);
		
		Thread.sleep(3000);
		
		//Verify the the title of the page
		String pageTitle =  driver.getTitle();
		System.out.println(pageTitle);
		
		if(pageTitle.equals("PHPTRAVELS | Travel Technology Partner")){
			System.out.println("Page Title is correct");
		}else{
			System.out.println("Page Title is worng");
		}
		
		Thread.sleep(2000);
		
		//Click on Flight button
		driver.findElement(By.xpath("//a[@class='text-center flights ']")).click();
		
		Thread.sleep(2000);
		
		//Book a flight from the site for any location
		WebElement searchBtn = driver.findElement(By.xpath("//form/div/div/div[3]/div[4]/button[@class='btn-primary btn btn-block']"));
		Actions action = new Actions(driver);
		
		action.moveToElement(searchBtn).click().build().perform();
		  
		
		driver.findElement(By.xpath("//div/div[1]/label[text()='One Way']")).click();
		driver.findElement(By.xpath("//div[6]/div/input[@class='select2-input']")).sendKeys("LAG");
		driver.findElement(By.xpath("//div[7]/div/input[@class='select2-input']")).sendKeys("BHL");
		
		Thread.sleep(5000);
		WebElement bookNow = driver.findElement(By.xpath("//*[@id='LIST']/li[2]/div/div[1]/div[2]/form/div[2]/div/button"));
	    action.moveToElement(bookNow).click().build().perform();
		
		driver.close();

		
		
	}

}
