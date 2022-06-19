//WAP to find the smallest and highest element in the arrayList
package Interview;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.TreeSet;

public class Demo36 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(5);
		a1.add(8);
		a1.add(2);
		a1.add(9);
		a1.add(3);
		
		Collections.sort(a1);
		
		System.out.println(a1);
		
		System.out.println("Lowest is:"+a1.get(0));
		System.out.println("Highest is:"+a1.get(4));
		

	}
}
