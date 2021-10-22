//Processing stream by sorted method
package Day13;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream3 {
	public static void main(String args[]) {
		
		ArrayList<String> al =new ArrayList<String>();
		al.add("Anuj");
		al.add("Saxena");
		al.add("Training");
		al.add("Sessions");
		al.add("Stack Route");
		System.out.println(al);
		
		List l =al.stream().sorted().collect(Collectors.toList());
		System.out.println(l);
	}
		
}
