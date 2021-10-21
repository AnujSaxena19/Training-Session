//Write a predicate to print only those names which starts with the letter A

package Day12;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Assignment2 {
	public static void main(String args[]) {
		String [] s= {"Anuj","Anurag","Shiva","Ravi","Amit"};
		Predicate<String> p=str -> str.startsWith("A");
		
		ArrayList al =new ArrayList<String>();
		
		for(String s1 :s) {
			if(p.test(s1)) {
				al.add(s1);
			}
		}
		System.out.println(al);
	}
}
