package Day4;

class aStudent{
	public void lesson() {
		System.out.println("Student Arrived");
	}
}

class Teacher extends aStudent{
	public void lesson() {
		System.out.println("Teacher Arrived");
	}
}

public class ExtendExample {   // ExtendExample is class of dynamic binding
	public static void main(String args[]) {
		//reference & objects of student type
		aStudent obj2=new aStudent();
		obj2.lesson();
		//reference student type and object is teacher type
		aStudent obj=new Teacher();
		obj.lesson();
	}
}
