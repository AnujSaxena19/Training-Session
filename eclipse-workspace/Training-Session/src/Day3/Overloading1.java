package Day3;

public class Overloading1 {
	public int div(int a,int b) {
		return a/b;
	}
	
	public int div(int a,int b,int c) {
		return a/b;
	}
	
	public static void main(String args[]) {
		Overloading1 ov=new Overloading1();
		System.out.println(ov.div(10,2));
		System.out.println(ov.div(10,2,3));
	}
}
