//WAp to get the portion a map whose keys range from a given key index inclusive to another key exclusive
package Interview;

import java.util.SortedMap;
import java.util.TreeMap;

public class Demo33
{
	public static void main(String[] args) 
	{
		TreeMap<Integer,String> t1=new TreeMap<Integer, String>();
		t1.put(5,"E");
		t1.put(1,"A");
		t1.put(4,"D");
		t1.put(2,"B");
		t1.put(3,"C");
		
		System.out.println("Before extraction");
		System.out.println(t1);
		
		System.out.println("After extraction....");
		SortedMap<Integer,String> submap = t1.subMap(1,5);
		System.out.println(submap);
	}
}
