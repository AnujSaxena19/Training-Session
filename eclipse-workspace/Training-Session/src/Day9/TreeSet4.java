package Day9;
import java.util.Comparator;
import java.util.TreeSet;

public class TreeSet4 {
	public static void main(String args[]) {
		TreeSet h=new TreeSet(new MyCompar());
		
		h.add(30);
		h.add(10);
		h.add(20);
		h.add(50);
		h.add(20);
		h.add(40);
		
		
		System.out.println(h);
	}
}

 class MyCompar implements Comparator{
	public int compare(Object o1,Object o2) {
		Integer num1=(Integer)o1;
		Integer num2=(Integer)o2;
		return -num1.compareTo(num2);
		
	}	
}
 
 