//WAP to convert into hashSet into ArrayLIst

package Interview;

import java.util.ArrayList;
import java.util.HashSet;

public class Demo9 
{
	public static void main(String[] args) 
	{
		HashSet<Integer> h1 = new HashSet<Integer>();
		h1.add(10);
		h1.add(11);
		h1.add(5);
		h1.add(13);
		h1.add(14);
		h1.add(15);
		System.out.println("Elements of hashset values is"+h1);
		ArrayList<Integer> l1 = new ArrayList<Integer>(h1);
		l1.add(20);
		System.out.println("elements of array list is"+l1);
	}
}
