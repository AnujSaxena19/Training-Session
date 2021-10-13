package Day7;
import java.io.*;
public class Exercise11 {
	public static void main(String args[]) throws IOException {
		FileReader file=new FileReader("C:/Users/Anuj Saxena/eclipse-workspace/Training-Session/src/Day7/Training.txt");
		int i;
		while((i=file.read())!=-1) {
			System.out.print((char)i);
		}
	}
}
