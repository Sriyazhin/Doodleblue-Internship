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

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String toString() {
		return name+" "+age+" "+id+" "+city;
	}

}
