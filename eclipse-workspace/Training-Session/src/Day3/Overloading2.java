package Day3;

public class Overloading2 {
	public static int func(int a) {
		return 100;
	}
	
	public static String func(int a,int b) {
		return "classroom";
	}
	
	public static char func(int a,int b,int c) {
		return 'c';
	}
	
	public static void main(String args[]) {
		System.out.println(func(10));
		System.out.println(func(10,2));
		System.out.println(func(10,2,3));
	}
}

