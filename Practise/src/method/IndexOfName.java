package method;

import java.util.Scanner;

public class IndexOfName 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter String name...");
		String s1=scan.next();
		System.out.println("Enter the character....");
		char ch=scan.next().charAt(0);
		
		int res=s1.indexOf(ch);
		System.out.println("The entered str name is:"+res);
	}
}
