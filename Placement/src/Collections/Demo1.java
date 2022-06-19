// WAP to create linked list to store only character elements and retrive each element through traversing technique
package Collections;

import java.util.LinkedList;
import java.util.ListIterator;

public class Demo1 
{
	public static void main(String[] args) 
	{
		LinkedList<Character> l1=new LinkedList<Character>();
		l1.add('e');
		l1.add('s');
		l1.add('h');
		l1.add('w');
		l1.add('a');
		l1.add('r');
		ListIterator<Character> li=l1.listIterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		while(li.hasPrevious())
		{
			System.out.println(li.previous());
		}
	}
}
