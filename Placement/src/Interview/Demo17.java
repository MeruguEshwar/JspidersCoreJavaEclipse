//WAP to get a set view of keys column in the HashMap
package Interview;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo17 
{
	public static void main(String[] args) 
	{
		HashMap<Integer,String> h1= new HashMap<Integer, String>();
		h1.put(1,"Nani");
		h1.put(7,"Chintu");
		h1.put(6,"mani");
		h1.put(4,"Sharma");
		h1.put(5,"Mammu");
		System.out.println(h1);
		Set set = h1.entrySet();
		Iterator i2 = set.iterator();
		while(i2.hasNext())
		{
			System.out.println(i2.next());
		}
		System.out.println("-----------------");
		
		for(Map.Entry<Integer,String> m: h1.entrySet())
		{
			System.out.println("key"+m.getKey()+" "+m.getValue());
		}
	}
}
