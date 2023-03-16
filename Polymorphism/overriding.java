class add{
	public void adding()
	{
		int a=4,b=5;
		int c=a+b;
		System.out.println(c);
	}
}

public class Addition extends add{
public void adding()
{
	super.adding();
}
	public static void main(String[] args) {
		Addition a = new Addition();
		a.adding();
	}
}
