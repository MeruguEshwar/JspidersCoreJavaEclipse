//WAP to remove and get a key value from the Treemap
package Interview;

import java.util.TreeMap;

public class demo34 
{
	public static void main(String[] args) 
	{
		TreeMap<Integer,String> t1=new TreeMap<Integer, String>();
		t1.put(1,"A");
		t1.put(2,"B");
		t1.put(3,"C");
		t1.put(4,"D");
		t1.put(5,"E");
		System.out.println(t1);
		
		
		System.out.println("Largest key"+t1.pollLastEntry());
		
		
		System.out.println("Smallest key"+t1.pollFirstEntry());
	}
}
