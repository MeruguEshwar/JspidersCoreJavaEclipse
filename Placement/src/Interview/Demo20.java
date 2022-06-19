//WAP to retrive but does not remove the frt element of linkedlist and remove the given element from the LinkedList.
package Interview;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.ListIterator;

public class Demo20 
{
	public static void main(String[] args) 
	{
		LinkedList<String> l1 = new LinkedList<String>();
		l1.add("Ice cream");
		l1.add("Pani puri");
		l1.add("Chocalates");
		l1.add("Biriyani");
		l1.add("Mandi");
		
		System.out.println("Linked list elements are"+l1);
		
		System.out.println("Frt element is :"+l1.peekFirst());
		
		Object o = "Biriyani";
		l1.remove(o);
		System.out.println(l1);
	}
}
