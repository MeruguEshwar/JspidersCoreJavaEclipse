//WAP to join 2 linkedlist and then replace an element from newly from linked list...

package Interview;

import java.util.LinkedList;
import java.util.Scanner;

public class Demo3 
{
	public static void main(String[] args) 
	{
		LinkedList<Integer> l1 = new LinkedList<Integer>();
		l1.add(11);
		l1.add(12);
		l1.add(13);
		l1.add(14);
		l1.add(15);
		System.out.println("1st is"+l1);
		LinkedList<Integer> l2= new LinkedList<Integer>(l1);
		l2.add(21);
		l2.add(22);
		l2.add(23);
		l2.add(24);
		System.out.println("2nd is"+l2);
		
		LinkedList joined=new LinkedList();
		joined.addAll(l1);
		joined.addAll(l2);
		
		for(int i=0;i<joined.size();i++)
		{
			System.out.println(i+1+","+joined.get(i));
		}
		
		joined.set(3, 99);
		System.out.println("Aftr replacing"+joined);
	}
}
