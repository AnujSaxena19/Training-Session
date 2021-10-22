//Processing stream of array using Stream.of method
package Day13;

import java.util.stream.Stream;

public class Stream10 {
	public static void amin(String args[]) {
		Double[] d= {10.4,60.1,23.444,22.89};
		
		Stream<Double> aa =Stream.of(d);
		aa.forEach((d1) -> System.out.println(d1));
 	}
}
