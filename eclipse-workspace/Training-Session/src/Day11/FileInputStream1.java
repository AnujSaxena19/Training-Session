package Day11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStream1 {
	public static void main(String args[]) throws IOException {
		FileInputStream fis=new FileInputStream("abcd.txt");
		int size=fis.available();
		byte [] bytes=new byte[size];
		
		fis.read(bytes);
		String data=new String(bytes);
		System.out.println(data);
		
	}
}
