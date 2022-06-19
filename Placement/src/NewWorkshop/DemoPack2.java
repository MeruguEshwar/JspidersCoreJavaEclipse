// WAP to count no of characters without using in built function
package NewWorkshop;

import java.util.Scanner;

public class DemoPack2 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter String value");
		
		//Reading values from run time and storing
		String s1=scan.next();
		
		int i=0;
		int count1=0; 
		while(true)
		{
			try
			{
				s1.charAt(i);
				i++;
				count1++;
			}
			catch(Exception e)
			{
				System.out.println("Num of character is:"+count1);
				break;
			}
		}
	}
}
