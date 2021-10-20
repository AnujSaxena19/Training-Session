package Day11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStream3 {
	public static void main(String args[]) throws IOException {
		FileInputStream fis=new FileInputStream("Image.jpg");
		int size=fis.available();
		byte [] bytes=new byte[size];
		
		fis.read(bytes);
		FileOutputStream fos =new FileOutputStream("ImageFromJava.jpg");
		fos.write(bytes);
		
		System.out.println("Image successfully cpied to ImageFromJava.jpg");
		fis.close();
		fos.close();
	}
}
