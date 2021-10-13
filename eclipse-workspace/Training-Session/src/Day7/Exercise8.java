package Day7;

public class Exercise8 {
	public static void main(String args[]) {
		int c=1;
		for(int i=1;i<=50;i++) {
			System.out.printf("%-6d", getPentagon(i));
			if(c%10==0) System.out.println();
			c++;
		}
	}
	public static int getPentagon(int i) {
		return (i*(3*i-1))/2;
	}
}
