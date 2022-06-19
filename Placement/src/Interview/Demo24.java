//WAP to remove all the elements from the hashset
package Interview;

import java.util.HashSet;

public class Demo24 
{
	public static void main(String[] args) 
	{
		HashSet<Integer> h1 = new HashSet<Integer>();
		h1.add(1);
		h1.add(2);
		h1.add(3);
		h1.add(4);
		h1.add(5);
		
		System.out.println("Before remove"+h1);
		
		System.out.println("*******************");
		
		h1.clear();
		System.out.println("After remove"+h1);
	}
}
