//Write a program that reads an integer and check whether it is negative, zero, or positive.
package Day7;
import java.util.Scanner;
public class Exercise12 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n>0) {
			System.out.println("Enetred number is positive");
		}
		else if(n<0) {
			System.out.println("Entered number is negative");
		}
		else {
			System.out.println("Entered number is zero");
		}
	}
}
