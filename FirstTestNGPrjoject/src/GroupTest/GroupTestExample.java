package GroupTest;

import org.testng.annotations.Test;

public class GroupTestExample 
{
	/*
	@Test(groups= {"Hello", "World"})
	public void testPrintMessage(){
		System.out.println("TestPrintMessage");
	}*/
	
	@Test(groups= {"Hello"})
	public void testSalutationMessage() {
		System.out.println("testSalutationMessage");

		   }
	@Test (groups={"World"})
	public void testingExitMessage() {
	      System.out.println("Inside testExitMessage");
	     ;
	   }  



}
