//Processing stream and finding max and min value
package Day13;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream5 {
	public static void main(String args[]) {
		
		ArrayList<Integer> al =new ArrayList<Integer>();
		al.add(15);
		al.add(10);
		al.add(20);
		al.add(8);
		al.add(3);
		System.out.println(al);
		
		Integer i =al.stream().max((i1,i2) -> i1.compareTo(i2)).get();
		System.out.println(i);
		
		Integer j =al.stream().min((i1,i2) -> i1.compareTo(i2)).get();
		System.out.println(j);
	}
}
