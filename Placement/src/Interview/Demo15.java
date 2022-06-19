//WAP to test if vector contains specified elements or not using list itaretor
package Interview;

import java.util.ListIterator;
import java.util.Vector;

public class Demo15
{
	public static void main(String[] args) 
	{
		Vector<Integer> v1=new Vector<Integer>();
		v1.add(10);
		v1.add(20);
		v1.add(30);
		v1.add(40);
		v1.add(50);
		System.out.println(v1);
		
		Object obj=84;
		System.out.println("Specified Element is");
		ListIterator<Integer> l1=v1.listIterator();
	}
}
//WAP to assosiated with the specified value