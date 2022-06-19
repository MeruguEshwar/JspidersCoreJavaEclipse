//WAP to test whether hashset of integer is empty or not
package Collections;

import java.util.HashSet;

public class Demo12 
{
	public static void main(String[] args) 
	{
		HashSet <Integer> h1 = new HashSet<Integer>();
		h1.add(31);
		h1.add(32);
		h1.add(33);
		h1.add(34);
		h1.add(35);
		h1.clear(); //is used to clear the statements
		if(h1.isEmpty()) //isEmpty is used to check weather the given integer array is empty or not...
		{
			System.out.println("Hash Set is empty"+h1);
		}
		else
		{
			System.out.println("Hash Set is not empty"+h1);
		}
	}
}
