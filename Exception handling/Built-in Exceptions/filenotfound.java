import java.io.*;
public class Exception {

	
	public static void main(String[] args) {
		
		try
		{
			FileInputStream fi = new FileInputStream("Hello123.txt");
			
		}
		catch(FileNotFoundException ae)
		{
			System.out.println("No Such file found");
		}

	}

}

If the file is not available it will throw the FileNotFoundException.
