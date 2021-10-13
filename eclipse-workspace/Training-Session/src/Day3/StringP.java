package Day3;

public class StringP {
	public static void main(String args[]) {
		String s1="Anuj";
		String s2="Anuj";
		String s3=new String("Anuj");
		String s4=new String("Anuj").intern();
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s2==s3);
		System.out.println(s4==s3);
		System.out.println(s4==s2);
		
	}
}
