//Processing stream of group of values using Stream.of method
package Day13;

import java.util.stream.Stream;

public class Stream8 {
	public static void main(String args[]) {
		
		Stream<Integer> i=Stream.of(1,2,3,4,5,6,7,8,9,10);
		i.forEach(i1 ->System.out.println(i1)); //USing lambda expression
		
		
	}
}
