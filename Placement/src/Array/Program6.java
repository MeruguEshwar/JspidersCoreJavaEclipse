/*WAP to read integer array and print only the elements present @ even index..*/
package Array;

import java.util.Scanner;

public class Program6 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int a[]= {23,34,45,56,76,78};
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]);
			}
		}
	}
}
