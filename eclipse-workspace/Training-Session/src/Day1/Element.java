package Day1;
import java.util.*;
public class Element {
	public static void main(String args[]) {
		List<String> list_str=new ArrayList<String>();
		list_str.add("Blue");
		list_str.add("Yellow");
		list_str.add("Green");
		list_str.add("Orange");
		list_str.add("Black");
		System.out.println(list_str);
		list_str.add(0,"Red");
		list_str.add(0,"Magenta");
		System.out.println(list_str);
	}
}
