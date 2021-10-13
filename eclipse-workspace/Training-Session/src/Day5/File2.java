package Day5;
import java.util.*;
import java.io.*;
public class File2 {
	public static void main(String args[]) throws FileNotFoundException {
		File myObj = new File("C:/Users/Anuj Saxena/eclipse-workspace/Example/src/Day5/Text.txt/");
		Scanner myReader = new Scanner(myObj);
		while (myReader.hasNextLine()) {
			String data = myReader.nextLine();
			System.out.println(data);
		}
    myReader.close();
	}
}
