package Day9;

import java.util.Enumeration;
import java.util.Vector;

public class Vector1 {
	public static void main(String [] args) {
		Vector v=new Vector();
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(50);
		
		Enumeration enumeration=v.elements();
		while(enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement());
		}
	}
}
