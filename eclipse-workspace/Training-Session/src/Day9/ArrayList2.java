package Day9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList2 {
	public static void main(String args[]) {
		List l=new ArrayList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		
		System.out.println(l);
		
		Iterator iterator=l.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
