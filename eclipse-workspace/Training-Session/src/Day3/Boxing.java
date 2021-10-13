package Day3;

import java.util.*;

//find sum of odd numbers using autoboxing and unboxing
public class Boxing {
	public static int sumOddValue(List<Integer> list) {
		int sum=0;
		for(Integer i: list) {
			//unboxing of i automatically
			
			if(i%2!=0) {
				sum+=i;
				//unboxing of i is done automatically using intvalue implicitly
			}
			if(i.intValue() %2!=0) {
				sum+=i.intValue();
			}
		}
		return sum;
	}
	
	public static void main(String args[]) {
		List<Integer> list =new ArrayList<Integer>();
		for(int i=0;i<5;i++) {
			list.add(i);
			int sumOdd=sumOddValue(list);
			System.out.println("Sum of odd numbers =" +sumOdd);
		}
	}
}
