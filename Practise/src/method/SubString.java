package method;

import java.util.Scanner;

public class SubString 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the String");
		String s1=scan.next();
		
		System.out.println("Enter the starting point..");
		int sp=scan.nextInt();
		
		System.out.println("Enter the ending point...");
		int ep=scan.nextInt();
		
		String res=s1.substring(sp,ep+1);
		System.out.println(res);
	}
}
