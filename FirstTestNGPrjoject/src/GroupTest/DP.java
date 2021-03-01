package GroupTest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DP 
{
	@DataProvider (name = "login-test")
	public Object[][] dpMethod(){
	return new Object[][] {{"UserNamer"}, {"Password"}};
	}
	    @Test (dataProvider = "login-test")
	    public void myTest (String val) {
	        System.out.println("Passed Parameter Is : " + val);   }
	
	
}
