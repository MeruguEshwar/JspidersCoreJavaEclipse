package Array;

import java.util.Scanner;

public class AddElements 
{
	public static void main(String[] args) 
	{	
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Array size....");
		int size=scan.nextInt();
		
		int s1[]=new int[size];
		System.out.println("Enter "+size+" values...");
		for(int i=0;i<=s1.length-1;i++)
		{
			s1[i]=scan.nextInt();
		}
		System.out.println("The array values are..");
		for(int i=0;i<=s1.length-1;i++)
		{
			System.out.println(s1[i]);
		}
	}
}
