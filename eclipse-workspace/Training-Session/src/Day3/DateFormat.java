package Day3;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class DateFormat {
	public static void main(String args[]) {
		LocalDateTime obj=LocalDateTime.now();
		System.out.println("System time before formatting: " +obj);
		DateTimeFormatter dt= DateTimeFormatter.ofPattern("DD-MM-YYYY HH:mm:ss");
		String formattedDate=obj.format(dt);
		System.out.println("System time after formatting " + formattedDate);
	}
}
