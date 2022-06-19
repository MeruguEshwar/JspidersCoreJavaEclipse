//WAP to create an hashmap insert key values and retrive the values based on the specified key
//enter the key during runtime
package Collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Demo15 
{
	public static void main(String[] args) 
	{
		HashMap<String,Double> h1 = new HashMap<String, Double>();
		h1.put("nani", 5.8);
		h1.put("Chintu",6.2);
		h1.put("abhi", 4.3);
		h1.put("bablu", 1.1);
		Set<String> keys=h1.keySet();
		Iterator<String> i1 = keys.iterator();
		int keyNum = 1;
		while(i1.hasNext())
		{
			System.out.println("Key "+keyNum+":"+i1.next());
			keyNum++;
		}
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the key...");
		String value = scan.next();
		System.out.println("Value at key "+value+":"+h1.get(value));
		
	}
}
