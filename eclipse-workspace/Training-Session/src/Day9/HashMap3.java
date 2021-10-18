package Day9;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap3 {
	public static void main(String args[]) {
		HashMap h=new HashMap();
		h.put("Anuj",10);
		h.put("Ankur",20);
		h.put("Amit",30);
		h.put("Abhishek",40);
		
		System.out.println(h);
		Set keySet=h.keySet();
		System.out.println(keySet);
		
		Collection values=h.values();
		System.out.println(values);
		
		Set entrySet=h.entrySet();
		System.out.println(entrySet);
		
		Iterator iterator=entrySet.iterator();
		
		Map.Entry em=(Map.Entry)iterator.next();
		System.out.println(em.getKey());
		System.out.println(em.getValue());
		
	}
}