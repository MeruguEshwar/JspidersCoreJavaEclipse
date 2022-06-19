// WAP to print no of characters present in the string
package NewWorkshop;

import java.util.Scanner;

public class Demopack1 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the string value");
		
		//next is used to count the single values
		//nextLine is used to count the multiple values
		
		String s1=scan.next();
		int count=s1.length();
		System.out.println("No of characters prescent in the string is"+count);
	}
}
