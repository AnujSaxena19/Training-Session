package Day9;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Assignment3 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		LinkedHashMap h=new LinkedHashMap();
		for(int i=0;i<s.length();i++) {
			if(h.containsKey(s.charAt(i))) {
				int c=(int) h.get(s.charAt(i));
				h.put(s.charAt(i), ++c);
			}
			else {
	            h.put(s.charAt(i),1);
	         }
		}
		System.out.println(h);
	}
}
