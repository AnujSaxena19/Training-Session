package Day4;
import java.util.*;
public class TokenString3 {
	public static void main(String args[]) {
		String str="Global | logic training | session. ";
		StringTokenizer st = new StringTokenizer(str);
		System.out.println("Input String is : " + str);
		int n=st.countTokens();
		while(n!=0) {
			if(st.hasMoreTokens()) {
				System.out.println("The token is present");
				n--;
			}
		}
		System.out.println("There is no more token present");
		}
}
