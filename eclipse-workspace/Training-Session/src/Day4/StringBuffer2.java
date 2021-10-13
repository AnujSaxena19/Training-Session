package Day4;
import java.io.*;
public class StringBuffer2 {
	public static void main (String args[]) {
		StringBuffer sb=new StringBuffer("Training" );
		sb.append(" session \n");
		System.out.println("Append : "+sb);
		sb.append(0);
		
		System.out.println("Append : "+sb);
		
	}
}
