package Day4;
import java.io.*;
import java.util.*;

//count the token using method of StringTokenizer

public class TokenString1 {
	public static void main(String args[]) {
		String s1="Welcome to the session";
		StringTokenizer st=new StringTokenizer(s1);
		int numoftokens=st.countTokens();
		System.out.println("Input String is " + s1);
		System.out.println("The number of tokens of the string: " + numoftokens);
	}
}
