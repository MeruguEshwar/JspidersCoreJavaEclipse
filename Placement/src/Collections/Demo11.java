// WAP to create LinkedLIst and insert element at the end of the list print all the elements using for each loop
//element type is double

package Collections;

import java.util.LinkedList;

public class Demo11 
{
	public static void main(String[] args) 
	{
		LinkedList <Double> d1 = new LinkedList<Double>();
		d1.add(1.1);
		d1.add(2.1);
		d1.add(3.1);
		d1.add(4.1);
		for(Double d:d1)
		{
			System.out.print(d+" ");
		}
		System.out.println();
		System.out.println("************************");
		d1.add(5.1);
		for(Double e:d1)
		{
			System.out.print(e+" ");
		}
	}
}
