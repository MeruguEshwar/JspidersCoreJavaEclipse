//WAP to grt no of elements of two tree set and compare that tree ser

package Interview;

import java.util.TreeSet;

public class Demo11 
{
	public static void main(String[] args) 
	{
		TreeSet<Integer> t1=new TreeSet<Integer>();
		t1.add(12);
		t1.add(11);
		
		TreeSet<String> t2=new TreeSet<String>();
		t2.add("Nani@");
		t2.add("Mammu");
		
		System.out.println(t1+" "+t2);
		if(t1.equals(t2))	//t1.containsAll(t2)
		{
			System.out.println("Both the sets are similar");
		}
		else
		{
			System.out.println("Both the sets are not same");
		}
	}
}
