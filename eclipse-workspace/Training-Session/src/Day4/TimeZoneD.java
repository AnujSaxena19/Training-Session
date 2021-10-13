package Day4;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.TimeZone;
public class TimeZoneD {
	
	static void printTimeZone(TimeZone tz) {
		System.out.println("ID "+ tz.getID() + " DisplayName " + tz.getDisplayName());
	}
	
	public static void main(String []args) {
		TimeZone tz1=TimeZone.getDefault();
		printTimeZone(tz1);
			
		TimeZone tz2=TimeZone.getTimeZone("Asia/Calcutta");
		printTimeZone(tz2);
	}
}
