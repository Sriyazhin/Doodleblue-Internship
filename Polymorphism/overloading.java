public class Findingarea {
	public void area(int r)
	{
		double circle = 3.14*r*r;
		System.out.println("Area of circle is: "+circle);
	}
	public void area(int l,int w)
	{
		double rectangle = l*w;
		System.out.println("Area of circle is: "+rectangle);
	}
	public void area(double a)
	{
		double square = a*a;
		System.out.println("Area of circle is: "+square);
	}
	public static void main(String[] args) {
		Findingarea fa = new Findingarea();
		fa.area(2);
		fa.area(4,5);
		fa.area(5.5);

	}

}
