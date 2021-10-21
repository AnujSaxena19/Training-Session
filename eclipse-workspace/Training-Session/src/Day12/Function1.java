package Day12;

import java.util.function.Function;

public class Function1 {
	public static void main(String [] args) {
		
		Function< String,Integer> f=str -> str.length();
		System.out.println(f.apply("Anuj"));
	}
}
