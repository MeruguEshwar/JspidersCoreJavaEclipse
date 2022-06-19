package Demopack1;
import java.util.Scanner;

public class Sample 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the string..........");
		String s1=scan.next();
		
		System.out.println("Enter an integer..........");
		int a=scan.nextInt();
		System.out.println("Enter double..............");
		double b=scan.nextDouble();
		
		System.out.println(s1);
		System.out.println(a);
		System.out.println(b);
	}
}
