package Day11;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream2 {
	public static void main(String args[]) throws IOException {
		FileOutputStream fos=new FileOutputStream("abc.txt",true);
		String data=" is attending training session";
		byte [] bytes=data.getBytes();
		
		fos.write(bytes);
		System.out.println("File successfully created and data stored");
		fos.close();
	}
}
