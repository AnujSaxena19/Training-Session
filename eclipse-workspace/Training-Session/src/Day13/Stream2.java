//Processing by count method 
package Day13;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream2 {
	public static void main(String args[]) {
		
		ArrayList<String> al =new ArrayList<String>();
		al.add("Anuj");
		al.add("Saxena");
		al.add("Training");
		al.add("Sessions");
		al.add("Stack Route");
		System.out.println(al);
		
		long count =al.stream().filter(s ->s.length()>=7).count();
		System.out.println(count);
		
		
	}
}
