package Day5;
import java.io.*;
import java.util.*;
public class File1 {
	public static void main(String args[]) throws IOException {
		 
		Scanner sc=new Scanner(System.in);
		FileWriter mywrite=new FileWriter("C:/Users/Anuj Saxena/eclipse-workspace/Example/src/Day5/Text.txt/");
		for(int i=0;i<3;i++) {
		mywrite.write(sc.nextLine());
		}
		mywrite.close();
		
		System.out.println("Succesfully written to file");
	}
}
