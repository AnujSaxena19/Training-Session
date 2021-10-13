package Day4;
import java.util.*;
public class TokenString4 {
	public static void main(String args[]) {
		String str="Welcome |to you Global logic |family. ";
		StringTokenizer st=new StringTokenizer(str);
		System.out.println("Input String is : " +str);
		while(st.hasMoreTokens()) {
			System.out.println("Input string is : "+ st.nextToken("|"));
		}
	}
}
