package Day11;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStream2 {
	public static void main(String args[]) throws IOException {
		FileInputStream fis=new FileInputStream("abcd.txt");
		int size=fis.available();
		byte [] bytes=new byte[size];
		
		fis.read(bytes);
		String data=new String(bytes);
		System.out.println(data);
		
		String [] s=data.split(" ");
		int wcount=s.length;
		System.out.println("No of words in the given file = "+wcount);
		
		int c=0;
		for(int i=0;i<wcount;i++) {
			String value=s[i];
			if(value.equals("Anuj")) {
				c+=1;
			}
		}
		System.out.println("'Anuj' is repeated : " +c);
	}
}
