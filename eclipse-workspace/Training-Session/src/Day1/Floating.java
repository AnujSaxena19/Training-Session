package Day1;

import java.util.*;
public class Floating {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		float n1=sc.nextFloat();
		System.out.println("Enter the second number");
		float n2=sc.nextFloat();
		if(Math.abs(n1-n2)<=0.01) {
			System.out.println("Numbers are same");
		}
		else {
			System.out.println("Numbers are not same");
		}
	}
}
