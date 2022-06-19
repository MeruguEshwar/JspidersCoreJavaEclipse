//WAP to trim the capacity of arraylist to currently size

package Interview;

import java.util.ArrayList;

public class Demo21 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		
		a1.ensureCapacity(10);//Capacity of an array
		
		a1.trimToSize();
		System.out.println(a1);
		
	}
}
//WAP to compare to priorty queues.
//WAP to retive bt does not remove the last element of likedlisd.
//WAP to convert vector into array list.
//WAp to replace element in a hasset.
//WAP to check wether arrayList is empty or not.
//WAP to create revrse order view of the elements of arrayList.
//WAP to retrive entries from the treemap
//WAP to get all values from treeMap