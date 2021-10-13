//Write a program that accepts three numbers from the user and prints "increasing" if the numbers are in increasing order, "decreasing" if the numbers are in decreasing order, and "Neither increasing or decreasing order" otherwise.
package Day7;
import java.util.Scanner;
public class Exercise13 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the three numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a<b && b<c) {
			System.out.println("increasing");
		}
		else if(a>b && b>c) {
			System.out.println("decreasing");
		}
		else {
			System.out.println("Neither increasing nor decreasing");
		}
	}
}
