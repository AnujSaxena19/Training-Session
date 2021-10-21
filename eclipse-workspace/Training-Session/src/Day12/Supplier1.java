package Day12;

import java.util.Date;
import java.util.function.Supplier;

public class Supplier1 {
	public static void main(String args[]) {
		
		Supplier<Date> su= () -> new Date();
		System.out.println(su.get());
	}
}
