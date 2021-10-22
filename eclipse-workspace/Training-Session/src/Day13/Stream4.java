//Processing stream using sorted with compareTo method
package Day13;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream4 {
	public static void main(String args[]) {
		
		ArrayList<String> al =new ArrayList<String>();
		al.add("Anuj");
		al.add("Saxena");
		al.add("Training");
		al.add("Sessions");
		al.add("Stack Route");
		System.out.println(al);
		
		List l =al.stream().sorted((i1,i2) -> i1.compareTo(i2)).collect(Collectors.toList()); //Ascending order
		System.out.println(l);
		
		List l1 =al.stream().sorted((i1,i2) -> -i1.compareTo(i2)).collect(Collectors.toList()); //Descending order
		System.out.println(l1);
	}
}
