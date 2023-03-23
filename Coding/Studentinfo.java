package Codetask;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import stream.InvalidnameException;

public class Studentinfo {

	public static void main(String[] args)  {
		LocalDate ld = LocalDate.now();
		LocalDate tm = ld.plusDays(1);
		LocalTime lt = LocalTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/yy/MM");
		String formattedDate = formatter.format(tm);
		 
		 
		Student s1=new Student("Ram",18,3214,"Chennai");
		Student s2=new Student("Sam",17,3145,"Cochin");
		Student s3=new Student("Tom",19,3423,"Bangalore");
		Student s4=new Student("Vinu",18,3223,"Hyderabad");
		Student s5=new Student("Ben",16,3034,"Chennai");
		
		System.out.println("Students Headcount: "+Student.studentcount);
		
		Studentreportcard sr1=new Studentreportcard("Ram",96,89,79);
		Studentreportcard sr2=new Studentreportcard("Sam",83,89,67);
		Studentreportcard sr3=new Studentreportcard("Tom",94,86,95);
		Studentreportcard sr4=new Studentreportcard("Vinu",75,95,68);
		Studentreportcard sr5=new Studentreportcard("Ben",85,60,79);
		
		Scanner s = new Scanner(System.in);
		List<Student> ss = Arrays.asList(
				new Student("Ram",18,3214,"Chennai"),
				new Student("Sam",17,3145,"Cochin"),
				new Student("Tom",19,3423,"Bangalore"),
				new Student("Vinu",18,3223,"Hyderabad"),
				new Student("Ben",16,3034,"Chennai")
				);
		List<Studentreportcard> src = Arrays.asList(
				new Studentreportcard("Ram",96,89,79),
				new Studentreportcard("Sam",83,89,67),
				new Studentreportcard("Tom",94,86,95),
				new Studentreportcard("Vinu",75,95,68),
				new Studentreportcard("Ben",85,60,79)
				);
		List<Newstudents> nst = Arrays.asList(
				new Newstudents("Varadhan"),
				new Newstudents("Swetha"),
				new Newstudents("Yazhini")
				);
		
		System.out.println("Enter Student name: ");
		String stname=s.next();
		try 
		{
			if((stname.equals(s1.getName()) || stname.equals(s2.getName()) || stname.equals(s3.getName()) || stname.equals(s4.getName()) || stname.equals(s5.getName())) &&  (stname.equals(sr1.getName()) || stname.equals(sr2.getName()) || stname.equals(sr3.getName()) || stname.equals(sr4.getName()) || stname.equals(sr5.getName())))
			{
			Stream<Student> stream = ss.stream();
			stream.filter(e->e.getName().equals(stname)).forEach(System.out::print);
			
			Stream<Studentreportcard> stream1 = src.stream();
			stream1.filter(e->e.getName().equals(stname)).forEach(System.out::println);
			} else {
				throw new InvalidnameException("Invalid name. No Student found");
				
			}
			
		 
		}
		
		catch (InvalidnameException e) {
			System.out.println(e.getMessage());
			return;
		}
		System.out.println("Would you like to see the Admission details: ");
		System.out.println("1. Yes");
		System.out.println("2. No");
		int addt = s.nextInt();
		switch(addt)
		{
		case 1:
			System.out.println();
			Stream<Newstudents> streamns1 = nst.stream();
			streamns1.map(Newstudents::getNstudent).map(b->" "+b+" Admission starts on: "+formattedDate+" "+lt).forEach(System.out::println);
			break;
		case 2:
			System.out.println("Thank you");
			break;
		default:
			System.out.println("Invalid input");
			break;
		}
		s.close();
	
	
}
}
