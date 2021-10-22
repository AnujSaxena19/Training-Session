package Day13;

public class RunnableMethodRef {

		public static void m1() {
			for(int i=0;i<10;i++) {
				System.out.println("Child Thread");
			}
		}
		
		public static void main(String args[]) {
			Runnable r= RunnableMethodRef ::m1;
			
			Thread t=new Thread(r);
			t.start();
			
			for(int i=0;i<10;i++) {
				System.out.println("Parent Thread");
			}
		}
}
