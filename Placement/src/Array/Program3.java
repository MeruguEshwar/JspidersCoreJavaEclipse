/*Wap to create an array and reading double values from runtime*/
package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Program3 
{
		
	public static void main(String[] args) 
	{
		ArrayList<String> s1 = new ArrayList<>();
		ArrayList<String> s2 = new ArrayList<>();
		
		s1.add("a");
		s1.add("b");
		s1.add("c");
		s1.add("d");
		s1.add("e");
		
		System.out.println(s1);
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
				
		if(i>0 && i < s1.size())
		{
			s2.add(s1.get(i-1));
			s1.remove(i-1);
			
			System.out.println("Frt array"+s1);
			System.out.println("Second Array"+s2);
		}
		else
		{
			System.out.println("Please give number between 1 and "+s1.size());
		}
	}
}
