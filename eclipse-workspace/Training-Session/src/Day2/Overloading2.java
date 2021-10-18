//Case study 2 of overloading
package Day2;

public class Overloading2 {
	public void m1(Object o) {
		System.out.println("Object type");
	}
	public void m1(String s) {
		System.out.println("String arguments");
	}
	public static void main(String args[]) {
		Overloading2 o=new Overloading2();
		o.m1(new Object()); //object version
		o.m1("Classroom"); //String version
		o.m1(null); //null
	}
}

//String child class of object