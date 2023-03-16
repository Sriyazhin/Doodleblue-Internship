import java.util.Scanner;

abstract class Shapes {
abstract void area();
}

class Circle extends Shapes{
	public int r;
	public Circle(int r)
	{
	this.r=r;	
	}
	void area()
	{
	super.findarea= 3.14*this.r*this.r;
	System.out.println("Area of circle is: "+super.findarea);
	
	}
}

class Rectangle extends Shapes{
	public int length;
	public int width;
	public Rectangle(int l,int w)
	{
		this.length=l;
		this.width=w;
	}
	void area()
	{
		super.findarea=this.length*this.width;
		System.out.println("Area of rectangle is: "+super.findarea);
	}
}

public class Abstractdemo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter radius: ");
		int r = s.nextInt();
		Circle c = new Circle(r);
		c.area();
		System.out.println("Enter length: ");
		int l = s.nextInt();
		System.out.println("Enter width: ");
		int w = s.nextInt();
		Rectangle re = new Rectangle(l,w);
		re.area();
	}

}
