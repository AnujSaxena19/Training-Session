package Day12;

public class MethodReference1 {
	public static void main(String args[]) {
		Interf i=MethodReference1::m2;
		i.m1();
	}
	
	public static void m2() {
		System.out.println("Imlpelementation by method reference");
	}
}

interface Interf{
	public void m1();
}
