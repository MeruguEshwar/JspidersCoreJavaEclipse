// WAP to create an integer array of 5 elements,print array insert new elemenr at given index during run time , print arr
package NewWorkshop;

import java.util.Scanner;

public class DemoPack17 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the array index value");
		int index=scan.nextInt();
		
		System.out.println("Enter the array ele");
		int ele=scan.nextInt();
		
		int a1[]= {5,4,3,2,1};
		int a2[]=new int[6];
		
		for(int i=0;i<=index-1;i++)
		{
			a2[i]=a1[i];
			
		}
		
		for(int i=index;i<=a1.length-1;i++)
		{
			a2[i+1] = a1[i];
		}
		System.out.println(a2[a2.length-1]);
	}
}
