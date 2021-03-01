package DemoClass1;

public class MyClass {
	
	int a= 10;

	static String myMethod(String a){
		return "Hello " +a;
	}
	
	static int myMethod(int a)
	{
		int b = 10;
		return b + a;
	}
	

	
	public static void main (String [] args){
		//myMethod(1,"Hello","world", 2,2);
		
		String a = myMethod("Firt");
		int b = myMethod(90);
		//double c = myMethod(4.0,3.1);
		System.out.println(a + " " + b + " " );
		
	}

}
