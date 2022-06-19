package method;

import java.util.Scanner;

public class CharAtmethod 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string....");
		String s1=scan.next();
		System.out.println("Enter the string value...");
		int res=scan.nextInt();
		
		char ch=s1.charAt(res);
		System.out.println("Enter the String is "+res+" is:"+ch);
	}
}
