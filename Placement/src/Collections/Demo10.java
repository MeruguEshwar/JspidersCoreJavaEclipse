// WAP to create an arraylist and insert fruit names Strings print all the elements usinf bi direction
//Traversing

package Collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class Demo10 
{
	public static void main(String[] args) 
	{
		Integer a[]= {1,2,3,4,5,6};
		Integer b[]= {};
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=0;j<b.length-1;j++)
			{
				if(a[i]!=b[j])
				{
					i++;
					System.out.println("******");
				}
				else
				{
					System.out.println(b[j]);
				}	
			}
		}
		 
		
		
		ArrayList <String> l1 = new ArrayList<String>();
		l1.add("apple");
		l1.add("banana");
		l1.add("mango");
		l1.add("Grapes");
		
		ListIterator<String> a1 = l1.listIterator();
		while(a1.hasNext())
		{
			System.out.println(a1.next());
		}
		while(a1.hasPrevious())
		{
			System.out.println(a1.previous());
		}
	}
}
