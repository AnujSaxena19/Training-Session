//Write a program to get the index of all the characters of the alphabet.

package Day7;

public class Exercise2 {
	public static void main(String args[]) {
		String c="";
		char l='a';
		while(l<='z') {
			
			c=c+l;
			System.out.println("Alphabet " +l+" index "+c.indexOf(l));
			l++;
		}
	}
}
