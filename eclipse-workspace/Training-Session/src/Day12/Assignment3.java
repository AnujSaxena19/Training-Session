//Write a function to remove all space from a string and return the string
package Day12;

import java.util.Scanner;
import java.util.function.Function;

public class Assignment3 {
	public static void main(String [] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.nextLine();
		
		Function< String,String> f=str -> str.replaceAll("\\s","");
		System.out.println(f.apply(s));
	}
}
