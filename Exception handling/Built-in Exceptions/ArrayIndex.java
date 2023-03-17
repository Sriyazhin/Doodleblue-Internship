public static void main(String[] args) {
		try
		{
			int b[]=new int[5];
			System.out.println(b[7]=7);
		}
		catch(ArrayIndexOutOfBoundsException ae)
		{
			System.out.println("Array index exceeds");
		}

	}

}
