package GroupTest;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizedTest1 
{
	@Test
	@Parameters("userID")
	public void useNamer(String id){
		System.out.println(id);
	}
	
	
	@Test
	@Parameters("psWD")
	public void userPWD(String pass){
		System.out.println(pass);
	}
 
}
