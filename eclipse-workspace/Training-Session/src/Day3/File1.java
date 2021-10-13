package Day3;
import java.io.*;
public class File1 {
	public static void main(String args[]) {
		 File file = new File("Text.txt"); //local path
		 
		 try {
			if(file.createNewFile()) {
				 System.out.println("File created: " + file.getName());  
			  } else {  
			    System.out.println("File already exists.");  
			  }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		 
		}
}
