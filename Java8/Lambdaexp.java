1. Without argument

interface A
{
	void abc();
}
public class Lambdaexp {
	
	public static void main(String[] args) {
		A a=new A()
	{	
		public void abc()
		{
			System.out.println("abcdef");
		}
	};
		a.abc();
		
		A b= () -> System.out.println("abcdefghi");
		b.abc();
	}

}



2. With argument

interface sum
{
	int add(int i,int j);
}
public class Lambdaexp {
	
	public static void main(String[] args) {
		sum a=new sum()
	{	
		public int add(int i,int j)
		{
			return i+j;
		}
	};
		int r = a.add(5,7);
		System.out.println(r);
		
		sum b= (i,j) -> i+j;
		int t = b.add(5,7);
		System.out.println(t);
	}

}
