//Create an arraylist and copy one arraylist into another array list
package Interview;

import java.util.ArrayList;

public class Demo2 
{
	public static void main(String[] args) 
	{
		ArrayList a2= new ArrayList();
		a2.add(10);
		a2.add(true);
		a2.add("Java");
		
		for(Object obj:a2)
		{
			System.out.println(obj);
		}
		
		ArrayList l1 = new ArrayList(a2);
		System.out.println("2nd copied array list");
		System.out.println(l1);
	}
}
