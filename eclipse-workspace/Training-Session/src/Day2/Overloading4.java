//case study 4 of overloading 
package Day2;

public class Overloading4 {
	public void m1(int i){
		System.out.println("Generic Method");
	}
	public void m1(int... i) {
		System.out.println("Other int value argument");
	}
	public static void main(String [] args) {
		Overloading4 o=new Overloading4();
		o.m1(10);//generic
		o.m1(10,10);//other value
	}
}
