package Day9;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Assignment1 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		//Set t=new TreeSet();
		//Set l=new HashSet();
		Set l=new LinkedHashSet();
		for(int i=0;i<s.length();i++) {
			l.add(s.charAt(i));
		}
		System.out.println(l);
		
	}
}
