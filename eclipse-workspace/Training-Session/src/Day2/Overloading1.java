//Case study 1 of overloading
package Day2;

public class Overloading1 {
	public void m1(int m) {
		System.out.println("Integer Type");
	}
	public void m1(float f) {
		System.out.println("Double Argument");
	}
	public static void main(String args[]) {
		Overloading1 o=new Overloading1();
		o.m1(10); // display by int overloading method
		o.m1(12.5f); // display by float overloading method
		o.m1('a');
	}
}





//while performing overloading it will search exact match first 
//but if overloading method not declared it promote next type
//automatic promotion


//byte->short->int->long->float->double
//char->int