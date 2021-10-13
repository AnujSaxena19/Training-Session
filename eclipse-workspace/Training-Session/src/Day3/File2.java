package Day3;
import java.io.File;
public class File2 {
	
	public static void main(String args[]) {
		File obj=new File("C:/Users/Anuj Saxena/eclipse-workspace/Example/src/Day3/input.txt");
		if(obj.exists()) {
			//returning the file name
			System.out.println("Filename: " + obj.getName());
			//returning the file path
			System.out.println("Path: " + obj.getPath());
			//readable
			System.out.println("Readable " + obj.canRead());
			//writeable
			System.out.println("Writeable: " + obj.canWrite());
			//file size
			System.out.println("Filesize: " + obj.length());
		}
		else {
			System.out.println("File not exists");
		}
	}

}
