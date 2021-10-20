package Day11;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream1 {
	public static void main(String args[]) throws IOException {
		FileOutputStream fos=new FileOutputStream("abc.txt");
		String data="Anuj Saxena";
		byte [] bytes=data.getBytes();
		
		fos.write(bytes);
		System.out.println("File successfully created and data stored");
		fos.close();
	}
}
