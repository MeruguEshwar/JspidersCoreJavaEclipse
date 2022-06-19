//WAP to create arrayList and extract the portion of arraylist
package Interview;

import java.util.ArrayList;
import java.util.TreeSet;

public class Demo32 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(5);
		a1.add(1);
		a1.add(2);
		a1.add(3);
		a1.add(4);
		System.out.println(a1);
		Object a3=a1.subList(0,3);
		System.out.println(a3);
	}
}
