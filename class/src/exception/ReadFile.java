package exception;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {

	public static void main(String[] args)
	{
		try {
		// Location of the file
		File doc= new File("/Users/abdullahrashid/Documents/Hello World.txt");
		// Scanner class will read the file
		Scanner file= new Scanner(doc);
		
		// While loop reading the file
		while (file.hasNextLine()){
			String data= file.nextLine();
			System.out.println(data);
			}
		file.close();
		}
		
		catch(FileNotFoundException e){
			System.out.println("No file found");
		}
		
		

	}

}
