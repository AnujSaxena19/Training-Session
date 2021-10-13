package Day4;

interface MyInterface{
	//declare abstract method
	void dString(String s);
	void sNo(int i);
}
public class ImplementExample implements MyInterface {
	//here implementing all the methods which are declared in interface
	
	public void dString(String s) {
		System.out.println("String is : "+ s);
	}
	
	public void sNo(int i) {
		System.out.println("Integer is : "+ i);
	}
	
	public static void main(String args[]) {
		ImplementExample obj=new ImplementExample();
		obj.dString("This is test");
		obj.sNo(25);
	}
}
