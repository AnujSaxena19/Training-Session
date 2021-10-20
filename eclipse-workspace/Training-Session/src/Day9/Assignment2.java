package Day9;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;

public class Assignment2 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		LinkedHashSet h=new LinkedHashSet();
		System.out.println("Enter the string");
		String str=sc.nextLine();
		String [] arr=str.split(",");
		for(String a :arr) {
			h.add(a);
		}
		System.out.println(h);
	}
}
