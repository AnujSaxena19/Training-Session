//Processing stream using forEach method

package Day13;

import java.util.ArrayList;

public class Stream6 {
	public static void main(String args[]) {
		
		ArrayList<Integer> al =new ArrayList<Integer>();
		al.add(15);
		al.add(10);
		al.add(20);
		al.add(8);
		al.add(3);
		System.out.println(al);
		
		al.stream().forEach(s -> System.out.println(s));
	}
}
