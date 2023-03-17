public class Exception {

	
	public static void main(String[] args) {
		try
		{
			int b=4/0;
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Cannot be divided by 0");
		}

	}

}
