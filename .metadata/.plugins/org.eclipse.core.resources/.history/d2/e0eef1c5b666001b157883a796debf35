package org.jsp.app;

import java.util.Scanner;

public class Palindrome 
{
	public static void main(String[] args) 
	{
		Scanner Scan=new Scanner(System.in);
		System.out.println("Enter The Number:...");
		int num = Scan.nextInt();
		CheckPal(num);
	}
	
	public static void CheckPal(int num)
	{
		int rev = 0;
		int n = num;
		while(num > 0)
		{
			int d = num % 10;
			rev = rev * 10 + d;
			num = num/10;
		}
		int sum=0;
		int product=1;
		num = n;
		
		if(n == rev)
		{
			System.out.println("Palindrome number");
			while(num>0)
			{
				int d = num%10;
				sum = sum+d;
				num = num/10;
			}
			System.out.println("The Sum of digits is"+sum);
		}
		else
		{
			System.out.println("Not a palindrome");
			while(num > 0)
			{
				int d = num % 10;
				product = product*d;
				num = num/10;
			}
			System.out.println("The product of digit is:"+product);
		}
	}
}
