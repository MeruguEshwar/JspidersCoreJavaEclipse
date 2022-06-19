//WAP to test if a map contain a specified value or not

package Interview;

import java.util.TreeMap;

public class Demo25 
{
	public static void main(String[] args) 
	{
		TreeMap<Integer,String> t1 = new TreeMap<Integer, String>();
		t1.put(1,"Eshu");
		t1.put(5,"Nani");
		t1.put(4,"Chintu");
		t1.put(3,"Sai");
		t1.put(2,"Laddu");
		
		System.out.println(t1);
		System.out.println(t1.containsValue("Eshu"));
	}
	
}
