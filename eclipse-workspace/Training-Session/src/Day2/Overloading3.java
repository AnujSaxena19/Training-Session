//case study 3 of overloading : compare String with stringbuffer with null value 
package Day2;

public class Overloading3 {
	public void m1(String s){
		System.out.println("String Argument");
	}
	public void m1(StringBuffer sb) {
		System.out.println("StringBuffer argument");
	}
	public static void main(String [] args) {
		Overloading3 o=new Overloading3();
		o.m1("Classroom");//string version
		o.m1(new StringBuffer("Session"));//StringBuffer version
		o.m1(null);
	}
}

//String child class of object
//Stringbuffer child class of object
/* error : reference to m1 is ambiguous
 * o.m1(null);
 * both method m1(String) in Overloading3 and method m1(StringBuffer) in Overloading3 
 * */
