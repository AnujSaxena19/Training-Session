package Day9;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSet3 {
	public static void main(String args[]) {
		TreeSet h=new TreeSet(new MyComparator());
		
		h.add(30);
		h.add(10);
		h.add(20);
		h.add(50);
		h.add(20);
		h.add(40);
		
		
		System.out.println(h);
	}
}

 class MyComparator implements Comparator{
	public int compare(Object o1,Object o2) {
		Integer num1=(Integer)o1;
		Integer num2=(Integer)o2;
		if(num1>num2) {
			return -1;
		}
		else if(num1<num2) {
			return 1;
		}
		else {
			return 0;	
		}
		
	}

	
}

