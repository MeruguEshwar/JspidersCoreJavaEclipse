//WAP to create an linkedlist iterate in a reverse order

package Collections;

import java.util.LinkedList;
import java.util.ListIterator;

public class Demo18 
{
	public static void main(String[] args) 
	{
		LinkedList <Integer> l1=new LinkedList<Integer>();
		l1.add(12);
		l1.add(13);
		l1.add(14);
		l1.add(15);
		ListIterator<Integer> li=l1.listIterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		System.out.println("********************************************");
		while(li.hasPrevious())
		{
			System.out.println(li.previous());
		}
	}
}
