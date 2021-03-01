package class_30;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTesting {

	public static void main(String[] args)
	{
		String baseURL= "https://www.facebook.com/login/identify?ctx=recover";
		
		System.setProperty("webdriver.chrome.driver", "/Users/abdullahrashid/Documents/workspace/Class30/chromedriver");
		WebDriver driver= new ChromeDriver();
		
		driver.navigate().to(baseURL);
	
		
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[1]/h1/a")).click();
		

        //verify that we are now back on Facebook's homepage        
        if (driver.getTitle().equals("Facebook - Log In or Sign Up")) {   
        	
        System.out.println("We are back at Facebook's homepage");                    
    } else {     
    	
        System.out.println("We are NOT in Facebook's homepage");                    
    }        
            driver.close();        

		
		
		

	}

}
