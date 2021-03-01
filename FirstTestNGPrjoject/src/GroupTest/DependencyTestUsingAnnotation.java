package GroupTest;

import org.testng.annotations.Test;

public class DependencyTestUsingAnnotation  
{
	
/*
	   @Test
	   public void testPrintMessage() {
	      System.out.println("Inside testPrintMessage");
	     
	   }*/

	   @Test
	   public void testSalutationMessage() {
	      System.out.println("Inside testSalutationMessage");
	  
	   }

	   @Test(dependsOnMethods = { "testSalutationMessage" })
	   public void initEnvironmentTest() {
	     
		   System.out.println("Inside te");
	   }

 
}
