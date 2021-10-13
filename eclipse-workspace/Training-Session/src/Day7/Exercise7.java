package Day7;
import java.util.*;
public class Exercise7 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		System.out.println("Number of vowels : "+ vowels(s1));
	}
	public static int vowels(String s1) {
		int count=0;
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)=='a' || s1.charAt(i)=='e'|| s1.charAt(i)=='i'|| s1.charAt(i)=='o'|| s1.charAt(i)=='u') {
				count++;
			}
		}
		return count;
	}
}