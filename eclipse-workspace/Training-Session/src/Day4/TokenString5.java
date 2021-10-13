package Day4;
import java.util.*;
public class TokenString5 {
	public static void main(String argsa[]) {
		String str="This is my class session.";
		StringTokenizer st=new StringTokenizer(str);
		System.out.println("Input String is : " + str);
		
		//moving to next element
		//st.nextElement();
		System.out.println("The next element1 is:" + st.nextElement());
		System.out.println("The next element2 is:" + st.nextElement());
	}
}
