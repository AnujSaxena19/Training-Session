//Processing stream using toArray Method
package Day13;

import java.util.ArrayList;

public class Stream7 {
	public static void main(String args[]) {
		
		ArrayList<Integer> al =new ArrayList<Integer>();
		al.add(15);
		al.add(10);
		al.add(20);
		al.add(8);
		al.add(3);
		System.out.println(al);
		
		Integer[] arr=al.stream().toArray(Integer[] :: new); //using constructor referencing
		
		for(Integer integer: arr) {
			System.out.println(integer);
		}
	}
}
