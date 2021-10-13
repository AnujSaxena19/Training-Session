package Day6;
import java.util.*;
public class Exception1 {
	public static int quotient(int numerator,int denominator) throws ArithmeticException{
		return numerator/denominator; 
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		boolean continueLoop=true;
		do {
			try {
				System.out.println("Please enter an integer (numr): ");
				int numerator=sc.nextInt();
				System.out.println("Please enter an integer (demr): ");
				int denominator=sc.nextInt();
				
				int result=quotient(numerator,denominator);
				System.out.println("\n Result :\n"+ result);
				continueLoop=false;
			}
			catch(InputMismatchException inme) {
				System.err.println(inme);
				sc.nextLine();
				System.out.println("User must enter proper integer. Please try again.");
			}
			catch(ArithmeticException ae) {
				System.out.println("Zero is a invalid denominator. Please try again.");
			}
		}
		while(continueLoop);
		
	}
}
