package Day10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Properties2 {
	public static void main(String args[]) throws Exception {
		Properties p=new Properties();
		FileInputStream fis=new FileInputStream("C:/Users/Anuj Saxena/eclipse-workspace/Training-Session/src/Day10/Demo.txt");
		p.load(fis);
		
		System.out.println(p);
		String password=p.getProperty("user");
		System.out.println(password);
		
		p.setProperty("user", "Anuj");
		
		FileOutputStream fos=new FileOutputStream("C:/Users/Anuj Saxena/eclipse-workspace/Training-Session/src/Day10/Demo.txt");
		p.store(fos, "user name changed");
	}
}
