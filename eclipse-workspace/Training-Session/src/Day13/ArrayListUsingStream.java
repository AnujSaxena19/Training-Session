package Day13;
// Fetching of data of arraylist using stream api

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListUsingStream {
	public static void main(String args[]) {
		
		ArrayList<Integer> al =new ArrayList<Integer>();
		al.add(12);
		al.add(20);
		al.add(0);
		al.add(15);
		al.add(25);
		al.add(30);
		System.out.println(al);
		
		List<Integer> l=al.stream().filter(I -> I%2==0).collect(Collectors.toList());
		System.out.println(l);
	}
}
