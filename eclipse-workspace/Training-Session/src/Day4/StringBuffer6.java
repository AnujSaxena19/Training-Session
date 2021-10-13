package Day4;

public class StringBuffer6 {
	public static void main(String args[]) {
		StringBuffer sb=new StringBuffer("Welcome to Training");
		System.out.println("First statement : "+sb);
		sb.delete(8, 11);
		System.out.println("Result of the statement : "+sb);
		sb.deleteCharAt(4);
		System.out.println("Delete 'o' : "+sb);
		
		StringBuffer sb2=new StringBuffer("Welcome to Training");
		sb2.replace(11, 21, "Session");
		System.out.println("Replace  : "+sb2);
	}
}
