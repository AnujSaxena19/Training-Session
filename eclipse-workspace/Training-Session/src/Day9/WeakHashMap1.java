package Day9;

import java.util.HashMap;
import java.util.WeakHashMap;

public class WeakHashMap1 {
	public static void main(String args[]) {
		//HashMap hm=new HashMap();         // System.gc does not work
		WeakHashMap hm=new WeakHashMap();  //System.gc works
		Temp t=new Temp();
		hm.put(t, "Anuj");
		System.out.println(hm);
		
		t=null;
		System.gc();
		System.out.println(hm);
	}
}

class Temp{
	@Override
	public String toString() {
		return "temp";
	}
	
	public void finalize() {
		System.out.println("Finalize method called");
	}
}
