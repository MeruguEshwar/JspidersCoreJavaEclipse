//WAP to get key value pair for the greatest key and lowest key

package Interview;

import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;

public class Demo23 
{
	public static void main(String[] args) 
	{
		HashMap<Integer,String> h1 = new HashMap<Integer, String>();
		h1.put(1,"Eshu");
		h1.put(5,"Nani");
		h1.put(4,"Chintu");
		h1.put(3,"Sai");
		h1.put(2,"Laddu");
		
		System.out.println(h1);
	
		TreeMap<Integer,String> t1=new TreeMap<Integer,String>(h1);
		
		System.out.println(t1);
		
		t1.lastEntry();
		t1.firstEntry();
		System.out.println(t1.lastEntry()+" "+t1.firstEntry());
	}
}
