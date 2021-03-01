package Arraylist;
import java.util.ArrayList;
import java.util.*;

public class Arraylisttest {



	public static void main(String[] args) 
	{
		
		ArrayList<String> book = new ArrayList<String>();
		book.add("Harry Poter 1");  /// [0, 1, 2, 3, 4]
		book.add("Harry Poter 2");
		book.add("Harry Poter 3");
		book.add("Harry Poter 4");
		book.add("Java Basic");
	/*	
		System.out.println(book);
		System.out.println(book.get(3));
		book.set(4, "Programing for beginers");
		System.out.println(book);
		book.add("QA for beginers");
		System.out.println(book);
		book.remove(2);
		System.out.println(book);
		System.out.println(book.size());
		
		   for (int i = 0; i < book.size(); i++) {
			      System.out.println(book.get(i));
			    }
		   
		   for (String i : book) {
			      System.out.println(i);
			    }
*/
		Iterator <String> it= book.iterator();
		//System.out.println(it.next());
		
		while(it.hasNext()) {
			  System.out.println(it.next());
			}

		

		
		

	}

}
