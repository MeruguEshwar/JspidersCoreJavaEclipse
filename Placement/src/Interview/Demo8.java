//WAP to iterate elemets frt and last elements of a linked list
package Interview;

import java.util.LinkedList;

public class Demo8 
{
	public static void main(String[] args) 
	{
		LinkedList<Integer> l1=new LinkedList<Integer>();
		l1.add(10);
		l1.add(11);
		l1.add(12);
		l1.add(13);
		l1.add(14);
		l1.add(15);
		
			System.out.println("First ele is"+l1.getFirst());
			System.out.println("last ele is"+l1.getLast());
		
		
	}
}
