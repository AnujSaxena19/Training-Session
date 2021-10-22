package Day13;

import java.time.LocalDate;
import java.time.Period;

public class DaysLeft {
	public static void main(String args[]) {
		
		LocalDate today=LocalDate.now();
		LocalDate deathday = LocalDate.of(1999+60, 9, 19);
		Period p1= Period.between(today, deathday);
		
		int days=p1.getYears()*365 + p1.getMonths()*30 + p1.getDays();
		System.out.printf("You will be dying in %d days", days);
	}
}
