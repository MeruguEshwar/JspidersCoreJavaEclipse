/*Wap to create an array reading integer values from during runtime*/
package Array;

import java.util.Scanner;

public class Program2 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Array size....");
		int nani=scan.nextInt();
		
		int a[]=new int[nani];
		System.out.println("Enter "+nani+" elements....");
		for(int i=0;i<=a.length-1;i++)
		{
			a[i]=scan.nextInt();
		}
		System.out.println("Array elements are.....");
		for(int i=0;i<=a.length-1;i++)
		{
			
			System.out.println(a[i]);
		}
		for(int i=0;i<=a.length-1;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
			else if(i%2==1)
			{
				System.out.println(i);
			}
		}
		
	}
}
