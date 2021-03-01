package DemoClass1;

public class MyClass1 {
	
//static method
	static void m(){
		System.out.println("hello");
	}
	
// public method
	public void m2()
	{
		System.out.println("world");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		m();
		MyClass1 obj = new MyClass1();
		obj.m2();
	
	}

}
