package Day12;

import java.util.ArrayList;
import java.util.function.Function;

public class Function2 {
	
	public static void main(String args[]) {
		ArrayList<Student> al =new ArrayList<Student>();
		populate(al);
		
		Function<Student,String> f= s -> {
			int marks=s.marks;
			if(marks>=80) 
			{
				return "Distinction";
			}
			else if(marks>=60)
			{
				return "First class";
			}
			else if(marks>=50) 
			{
				return "Second class";
			}
			else
			{
				return "Failed";
			}
		};
		for(Student s:al) {
			System.out.println("Student Name "+s.name);
			System.out.println("Student Marks "+s.marks);
			System.out.println("Student Grade "+ f.apply(s));
		}
	}
	
	private static void populate(ArrayList<Student> al) {
		
		al.add(new Student("Anuj",99));
		al.add(new Student("Amit",53));
		al.add(new Student("Mohit",76));
		al.add(new Student("Nitin",80));
		al.add(new Student("Manvendra",90));
	}
}

class Student{
	String name;
	int marks;
	
	public Student(String name, int marks) {
		this.name=name;
		this.marks=marks;
	}
}
