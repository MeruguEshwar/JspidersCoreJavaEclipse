//WAP to compare 2 sets and return elements which are same on both the set

package Interview;

import java.util.HashSet;

public class Demo19 
{
	public static void main(String[] args) 
	{
		HashSet<Integer> h1 = new HashSet<Integer>();
		h1.add(10);
		h1.add(20);
		h1.add(30);
		System.out.println(h1);
		
		HashSet<Integer> h2 = new HashSet<Integer>();
		h2.add(20);
		h2.add(30);
		h2.add(40);
		System.out.println(h2);
		
		
		h1.retainAll(h2);
		System.out.println("Aftr ratain all elements"+h1);
	}
}
