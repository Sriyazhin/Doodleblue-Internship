public class Exception {

	
	public static void main(String[] args) {
		try
		{
			System.out.println(Class.forName("Encapsulation.Banking"));
		}
		catch(ClassNotFoundException ae)
		{
			System.out.println("No class found");
		}

	}

}

If the class is not available in the given path it will throw the ClassNotFoundException.
