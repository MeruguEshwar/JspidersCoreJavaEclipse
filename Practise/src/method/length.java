package method;

import java.util.Scanner;

public class length 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the string");
		String s1=scan.next();
		int a1=s1.length();
		System.out.println("length of the string is:"+a1);
	}
}
