package Day4;

import java.util.StringTokenizer;

public class TokenString2 {
	public static void main(String args[]) {
		String s1="Welcome to the session";
		StringTokenizer st=new StringTokenizer(s1);
		System.out.println("Input String is " + s1);
		while(st.hasMoreTokens()) {
			System.out.println("Input string is : " + st.nextToken());
		}
	}
}
