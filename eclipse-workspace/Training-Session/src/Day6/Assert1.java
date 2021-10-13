package Day6;
import java.util.*;
public class Assert1 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number between 0 and 10: ");
		int number=sc.nextInt();
		//assert that the absolute value is>=0
		assert (number>=0 && number<=10): "bad number" +number;
		
		System.out.printf("You entered %d\n", number);
	}
}
