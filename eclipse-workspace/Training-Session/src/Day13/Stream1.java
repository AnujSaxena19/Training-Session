//Processing data using collect method
package Day13;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream1 {
	public static void main(String args[]) {
		
		ArrayList<String> al =new ArrayList<String>();
		al.add("Anuj");
		al.add("Saxena");
		al.add("Training");
		al.add("Sessions");
		al.add("Stack Route");
		System.out.println(al);
		
		List<String> l =al.stream().filter(s ->s.length()>=7).collect(Collectors.toList());
		System.out.println(l);
		
		List<String> l1 =al.stream().map(s ->s.toUpperCase()).collect(Collectors.toList());
		System.out.println(l1);
	}
}
