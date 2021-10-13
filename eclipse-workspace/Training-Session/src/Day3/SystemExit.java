package Day3;

public class SystemExit {
	public static void main(String args[]) {
		int arr[] = {3,4,5,6,7,8,9};
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>=5) {
				System.out.println("Exit from the process loop");
				System.exit(i);
			}
			else {
				System.out.println("arr["+i+"]= "+arr[i]);
			}
			
		}
		System.out.println("End of the program");
	}
}
