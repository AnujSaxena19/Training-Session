package Day4;

public class StringBuffer3 {
	public static void main(String args[]) {
		StringBuffer sb=new StringBuffer("Training");
		System.out.println("Insert : "+sb);
		sb.insert(8,"Session");
		System.out.println("Final Insert : "+sb);
	}
}
