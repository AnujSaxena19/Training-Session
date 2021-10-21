package Day12;

public class MethodReference2 {
	public static void main(String args[]) {
		
		MethodReference2 m=new MethodReference2();
		Interfa i=m::m2;
		i.m1();
	}
	
	public void m2() {
		System.out.println("Imlpelementation by method reference");
	}
}

interface Interfa{
	public void m1();
}
