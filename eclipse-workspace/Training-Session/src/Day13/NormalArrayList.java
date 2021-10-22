package Day13;

import java.util.ArrayList;
import java.util.List;

public class NormalArrayList {
	public static void main(String args[]) {
		
		ArrayList<Integer> al =new ArrayList<Integer>();
		al.add(12);
		al.add(20);
		al.add(0);
		al.add(15);
		al.add(25);
		al.add(30);
		
		System.out.println(al);
		
		List<Integer> l1 =new ArrayList();
		
		for(Integer i: al) {
			if(i%2==0) {
				l1.add(i);
			}
		}
		System.out.println(l1);
	}
}
