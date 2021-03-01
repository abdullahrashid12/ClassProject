package exception;

public class Trycatchtesting {

	public static void main(String[] args) 
	
	{
		
		
		try {
			int [] a = {1,3,5,9,11,13,15};
			         ///0,1,2
			  System.out.println(a[3]);
			  
			
		}
		catch (Exception e){
			  System.out.println("Value was not found");
			
		}
		finally {
			 System.out.println("The 'try catch' is finished.");
		}

	}

}
