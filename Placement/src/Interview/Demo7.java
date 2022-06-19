//WAP to iterate elements in a linkedlist from the specified index
package Interview;

import java.util.LinkedList;
import java.util.Scanner;

public class Demo7 
{
	public static void main(String[] args) 
	{
		LinkedList<Integer> l1=new LinkedList<Integer>();
		l1.add(10);
		l1.add(11);
		l1.add(12);
		l1.add(13);
		l1.add(14);
		l1.add(15);
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter index value...");
		int num=scan.nextInt();
		for(int i=num;i<=l1.size()-1;i++)
		{
			System.out.println(l1.get(i));
		}
	}
}
