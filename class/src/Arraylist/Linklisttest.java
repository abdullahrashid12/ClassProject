package Arraylist;
import java.util.LinkedList;

public class Linklisttest {

	public static void main(String[] args) 
	{
		LinkedList<String> dr = new LinkedList<String>();
		dr.add("hey");
		dr.add("ho");
		dr.add("ha");
		dr.add("hihi");
		
		System.out.println(dr);
		System.out.println(dr.size());
		dr.remove(2);
		System.out.println(dr);
		System.out.println(dr.size());
		

	}

}
