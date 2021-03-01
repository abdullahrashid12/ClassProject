package Collection;
import java.util.HashSet;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Hashsettesting {

	public static void main(String[] args) 
	{
		HashSet <String> car= new HashSet <String>();
		car.add("BMW");
		car.add("Audi");
		car.add("Hunda");
		
		 System.out.println(car);
		for( String x: car){
			 System.out.println(x);
		}
		
		
		
		Set <Integer> car1= new HashSet <Integer>();
	    car1.add(2020);
		car1.add(2011);
		car1.add(2010);
		car1.add(2008);
		car1.add(2018);
		//System.out.println(car1);
		
	    for(int i = 2007; i <= 2020; i++) {
	      if(car1.contains(i)) {
	        System.out.println(i + " was found in the set.");
	      } else {
	        System.out.println(i + " was not found in the set.");
	      }
	    }

	

	}

}
