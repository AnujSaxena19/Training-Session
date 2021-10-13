package Day3;

public class Overloading3 {
	public int add(int a,int b) {
		return a+b;
	}
	
	public int add(int a,int b,int c) {
		return a+b+c;
	}
	
	public double add(double a,double b) {
		return a+b;
	}
	
	public static void main(String args[]) {
		Overloading3 ov=new Overloading3();
		System.out.println(ov.add(15,20));
		System.out.println(ov.add(15,20,25));
		System.out.println(ov.add(15.5,25.5));
	}
}
