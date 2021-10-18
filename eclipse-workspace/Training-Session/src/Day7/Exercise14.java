//Write a  program to get seconds since <year>.
package Day7;
import java.util.*;
public class Exercise14 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year");
		int year=sc.nextInt();
		int curr_year=2021;
		int diff=curr_year-year;
		System.out.println("The number of second from "+ year + " to present year is :- " +(diff*31536000));
	}
}
