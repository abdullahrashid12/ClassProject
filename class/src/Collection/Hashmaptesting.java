package Collection;
import java.util.HashMap;

public class Hashmaptesting {

	public static void main(String[] args) 
	{
		HashMap <String, String> car = new HashMap <String,String>();
		car.put("toyota", "xlw");
		car.put("Audi", "A7");
		car.put("BMW", "X5");
		car.put("Hunda", "Accord");
		
		System.out.println(car.size());
		System.out.println(car.remove("Audi"));
		car.clear();
		System.out.println(car);
		
		HashMap <String, Integer > car1 = new HashMap <String, Integer>();
		car1.put("BMW", 2012);
		car1.put("Toyota", 2013);
		car1.put("Hunda", 2015);
		System.out.println(car1);
		
		//Print the keys
		 for (String i: car1.keySet()){
			 System.out.println(i);
		 }
		 
		//Print the value
		 
		 for (Integer x: car1.values()){
			 System.out.println(x);
		 }
		 
		 //Print the keys and value at the same time
		 
		 for (String y: car1.keySet())
		 {
			 System.out.println( "Key:" + y + " value:" + car1.get(y));
		 }
		
		
	}

}
