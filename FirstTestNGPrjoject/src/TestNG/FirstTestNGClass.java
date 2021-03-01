package TestNG;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class FirstTestNGClass 
{
	@Test (priority = 0)
	public void c_test(){
		Assert.fail();
	}
	
	@Test (priority = 1)
	public void a_test(){
	Assert.assertTrue(true);	
	}
	
	@Test (priority = 3)
	public void b_test(){
	throw new SkipException("Skipping b_test");
	}
	
	
}
