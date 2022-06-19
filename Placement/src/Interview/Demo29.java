//WAP to get the portion of map where key's are less then the given key

package Interview;

import java.util.TreeMap;

public class Demo29 
{
	public static void main(String[] args) 
	{
		TreeMap<Integer,String> t1 = new TreeMap<Integer, String>();
		t1.put(1,"Nani");
		t1.put(2,"Chintu");
		t1.put(3,"Eshu");
		t1.put(4,"sai");
		t1.put(5,"Krishna");
		
		System.out.println(t1);
		
		System.out.println(t1.headMap(4));
	}
}
