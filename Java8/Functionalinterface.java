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
    
    }

}
