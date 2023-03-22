package Codetask;

public class Studentreportcard {
	private String name;
	private String subject;
	private int marks;
	public Studentreportcard(String n, String s, int m)
	{
		this.name=n;
		this.subject=s;
		this.marks=m;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	

}
