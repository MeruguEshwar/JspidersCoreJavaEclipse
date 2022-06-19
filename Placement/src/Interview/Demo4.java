//WAP to test is Hashset is  empty or not if hasset is empty then add the elements into that and hashset is not empty
//add the elements into that
package Interview;

import java.util.HashSet;

public class Demo4 
{
	public static void main(String[] args) 
	{
		HashSet<Integer> h1 = new HashSet<Integer>();
		h1.add(12);
		
		if(h1.isEmpty())
		{
			h1.add(13);
			h1.add(14);
			System.out.println(h1);

		}
		else
		{
			h1.removeAll(h1);
			System.out.println(h1);
		}
 	}
}
