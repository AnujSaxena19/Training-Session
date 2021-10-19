package Day10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

public class Properties1 {
	public static void main(String args[]) throws Exception {
		Properties p=new Properties();
		FileInputStream fis=new FileInputStream("C:/Users/Anuj Saxena/eclipse-workspace/Training-Session/src/Day10/Demo.txt");
		p.load(fis);
		System.out.println(p);
		
		String password=p.getProperty("password");
		System.out.println(password);
		
		p.setProperty("url", "www.root.com");
		FileOutputStream fos=new FileOutputStream("C:/Users/Anuj Saxena/eclipse-workspace/Training-Session/src/Day10/Demo.txt");
		p.store(fos, "this entry is entered by anuj.");
	}
}
