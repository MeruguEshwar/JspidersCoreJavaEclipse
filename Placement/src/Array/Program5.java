/*WAP to create an Char array and print all elements vth for eachloop && and array,array size using runtime*/

package Array;

import java.util.Scanner;

public class Program5 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter an array size....");
		int size=scan.nextInt();
		
		System.out.println("Enter array "+size+" value");
		char a[]=new char[size];
		for(int i=0;i<=a.length-1;i++)
		{
			a[i]=scan.next().charAt(0);
		}
		System.out.println("The array values are..");
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("The values containing in the array is in for each loop");
		for(double k : a)
		{
			System.out.println(k);
		}
		
	}
}
