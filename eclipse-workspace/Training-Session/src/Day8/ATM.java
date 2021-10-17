package Day8;
import java.util.*;
public class ATM {
	public static void main(String args[]) {
		Res a=new Res();
		a.initiate();
	}
}

class NotValidPassword extends Exception {
	public String getMessage() {
		return "Enter the valid password";
	}
}

class Applicant{
	int pin =1234;
	int p=0;
	public void input() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your pin");
		p=sc.nextInt();
	}
	public void verify() throws NotValidPassword{
		if(p!=pin) {
			NotValidPassword nvp=new NotValidPassword();
			System.out.println(nvp.getMessage());
			throw nvp;
		}
		else {
			System.out.println("Password valid");
		}
	}
}

class Res{
	public void initiate() {
		Applicant a=new Applicant();
		
		try {
			a.input();
			a.verify();
		}
			catch(Exception e){
				try {
					a.input();
					a.verify();
				}
				catch(Exception ae) {
					try {
						a.input();
						a.verify();
					}
					catch(Exception aa) {
					System.exit(0);
				}
			}
		
		
	}
}
}
