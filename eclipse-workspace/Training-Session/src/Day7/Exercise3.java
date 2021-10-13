//Write a program to check whether a given string starts with the contents of another string.

package Day7;

public class Exercise3 {
	public static void main(String args[]) {
		String s1="Training session";
		String s2="Training";
		String s3="hello";
		boolean str=s1.startsWith(s2);
		boolean str2=s1.startsWith(s3);
		System.out.println(s1+" starts with "+ s2+" = "+ str);
		System.out.println(s1+" starts with "+ s3+" = "+ str2);
	}
}
