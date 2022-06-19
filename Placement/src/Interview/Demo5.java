//Wap to create arrayList reverse the elements in reverse order
package Interview;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class Demo5 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(10);
		a1.add(11);
		a1.add(15);
		a1.add(13);
		a1.add(14);
		a1.add(12);
		
		ListIterator<Integer> i1=a1.listIterator();
		while(i1.hasNext())
		{
			System.out.print(i1.next()+" ");
		}
		System.out.println();
		System.out.println("**********************");
		while(i1.hasPrevious())
		{
			
			System.out.print(i1.previous()+" ");
		}
		
		/*
		System.out.println(a1);
		for(int i=a1.size()-1;i>=0;i--)
		{
			System.out.println(a1.get(i));
		}
		*/
	}
}
