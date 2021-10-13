package Day4;

public class StringBuffer7 {
	public static void main(String args[]) {
		StringBuilder sb=new StringBuilder("Classroom");
		System.out.println("Insert : "+sb);
		sb.insert(9, "Session");
		System.out.println("Final Insert : "+sb);
		
		StringBuffer sb2=new StringBuffer("Classroom");
		System.out.println("Insert : "+sb2);
		sb2.insert(9, "Session");
		System.out.println("Final Insert : "+sb2);
	}
}
