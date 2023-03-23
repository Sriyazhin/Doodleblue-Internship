package Codetask;

public class Student {
	private String name;
	private int age;
	private int id;
	private String city;
	public static int studentcount;
	
	public Student(String n, int a, int i, String c)
	{
		this.name=n;
		this.age=a;
		this.id=i;
		this.city=c;
		studentcount++;
	}
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	public int getId() {
		return id;
	}
	
	public String getCity() {
		return city;
	}
	
	public String toString() {
		String a = name+" "+age+" "+id+" "+city;
		return a;
	}

	


	
	
}
