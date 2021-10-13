package Day1;
import java.util.*;
public class Days {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int daysinmonth=0;
		String Monthname="Unknown";
		
		System.out.println("Input a month number");
		int month=sc.nextInt();
		System.out.println("Input the year");
		int year=sc.nextInt();
		switch(month) {
		
		case 1:
			Monthname="January";
			daysinmonth=31;
			break;
		
		case 2:
			Monthname="February";
			if((year%400==0)||(year%4==0)&&(year%100)!=0) {
				daysinmonth=29;
			}
			else {
				daysinmonth=28;
			}
			break;
			
		case 3:
			Monthname="March";
			daysinmonth=31;
			break;
			
		case 4:
			Monthname="April";
			daysinmonth=30;
			break;
			
		case 5:
			Monthname="May";
			daysinmonth=31;
			break;
			
		case 6:
			Monthname="June";
			daysinmonth=30;
			break;
			
		case 7:
			Monthname="July";
			daysinmonth=31;
			break;
			
		case 8:
			Monthname="August";
			daysinmonth=31;
			break;
			
		case 9:
			Monthname="September";
			daysinmonth=30;
			break;
			
		case 10:
			Monthname="October";
			daysinmonth=31;
			break;
			
		case 11:
			Monthname="November";
			daysinmonth=30;
			break;
			
		case 12:
			Monthname="December";
			daysinmonth=31;
			break;
			
		}
		System.out.println(Monthname+" in "+ year +" has "+ daysinmonth+" days");
	}

}
