//Write a program to get the contents of a given string as a byte array.
package Day7;
import java.util.*;
public class Exercise4 {
	public static void main(String args[]) {
		String s1="Training session";
		byte[] arr=s1.getBytes();
		String s2=new String (arr);
		System.out.println(s2);
	}
}
