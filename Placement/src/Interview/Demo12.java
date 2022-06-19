//WAP to get frt and last key currently in a hashmap
package Interview;

import java.util.HashMap;
import java.util.TreeMap;

public class Demo12 
{
	public static void main(String[] args) 
	{
		HashMap<Integer,String> h1=new HashMap<Integer, String>();
		h1.put(1,"Nani");
		h1.put(2,"Merugu");
		h1.put(3,"mammu");
		h1.put(4,"Chintu");
		h1.put(5,"Sharma");
		System.out.println(h1);
		TreeMap<Integer, String> t1=new TreeMap<Integer, String>(h1);
		t1.firstEntry();
		
		System.out.println(t1.firstKey()+" "+t1.lastKey());	//To give key values
		System.out.println(t1.firstEntry()+" "+t1.lastEntry());	//To give key and values
	}
}
