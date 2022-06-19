//LinkedHashMap
package Collections;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Demo8 
{
	public static void main(String[] args) 
	{
		LinkedHashMap<Integer,String> h1=new LinkedHashMap<Integer,String>();
		h1.put(3,"Nani");
		h1.put(6,"Sathwik");
		h1.put(12,"SaiRam");
		h1.put(2,"Vinay");
		h1.put(43,"Pranavi Reddy");
		System.out.println(h1);
	}
}
