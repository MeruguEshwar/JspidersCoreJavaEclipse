package Nani;

import java.util.Scanner;

public class Switch 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the value...");
		char c1=scan.next().charAt(' ');
		switch(c1)
		{
			case 1:
				System.out.println("Sun");
				break;
			case 2:
				System.out.println("Mon");
				break;
			case 3:
				System.out.println("Tues");
				break;
			case 4:
				System.out.println("Wed");
				break;
		}		
	}
}
