package Day8;

import java.util.*;

public class Election {
	public static void main(String args[]) {
		RTO r=new RTO();
		r.initiate();
	}
}

class UnderAgeException extends Exception{
	public String getMessage() {
		return "You are too young, Have patience!!";
	}
}

class OverAgeException extends Exception{
	public String getMessage() {
		return "You are too old , cool down!!";
	}
}

class App {
	int age;
	public void acceptInput() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age");
		age=sc.nextInt();
	}
	
	public void verify() throws UnderAgeException, OverAgeException{
		if(age<18) {
			UnderAgeException uae=new UnderAgeException();
			System.out.println(uae.getMessage());
			throw uae;
		}
		else if(age>=70) {
			OverAgeException ova=new OverAgeException();
			System.out.println(ova.getMessage());
			throw ova;
		}
		else {
			System.out.println("Collect Your DL");
		}
	}
}


class RTO{
	public void initiate() {
		App a=new App();
		try {
			a.acceptInput();
			a.verify();
		}
			catch(Exception e){
				try {
					a.acceptInput();
					a.verify();
				}
				catch(Exception ae) {
					try {
						a.acceptInput();
						a.verify();
					}
					catch(Exception aa) {
					System.exit(0);
				}
			}
		
	}
}
}
