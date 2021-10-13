package Day4;
import java.util.*;
import java.io.*;
public class TokenString6 {
	public static void main(String args[]) {
		String str="This is my class session, about stringtokenizer";
		StringTokenizer st=new StringTokenizer(str);
		int numoftokens=st.countTokens();
		
		System.out.println("Number of token : " + numoftokens);
		System.out.println("Printing all the tokens with default constructor");
		System.out.println("-------------------------------------------------");
		
		while(st.hasMoreTokens()) {
			System.out.println(" The next token is : " + st.nextToken(""));
		}
		
		StringTokenizer st1=new StringTokenizer(str,",");
		System.out.println("Printing all the token with default constructor");
		System.out.println("-------------------------------------------------");
		
		while(st1.hasMoreTokens()) {
			System.out.println(" The next token with delimitor ',' s : " + st1.nextToken(","));
		}
		
		StringTokenizer st2=new StringTokenizer(str,",",true);
		System.out.println("Printing all the token with default constructor");
		System.out.println("-------------------------------------------------");
		
		while(st2.hasMoreElements()) {
			System.out.println(" The next token with delimitor ',' s : " + st2.nextToken(","));
		}
		
	}
}
