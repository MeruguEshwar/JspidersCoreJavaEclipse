//WAP to create an array list and copy all the elements to another array list

package Collections;

import java.util.ArrayList;

public class Demo17 
{
	public static void main(String[] args) 
	{		
		ArrayList<Integer> s1=new ArrayList<Integer>();
		s1.add(1);
		s1.add(2);
		s1.add(3);
		s1.add(4);
		System.out.println(s1);
		System.out.println("**************************************");
		ArrayList<Integer> a1=new ArrayList<Integer>(s1);
		System.out.println(a1);
	}
}
