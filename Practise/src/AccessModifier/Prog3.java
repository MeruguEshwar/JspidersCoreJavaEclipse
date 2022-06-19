package AccessModifier;

import java.util.Scanner;

public class Prog3 
{
	public static void main(String[] args) 
	{
		double res=add(5,2.5);
		System.out.println(res);
		
		Prog3 P1 = new Prog3();
		P1.add(5,6);
		
		add(2,3,4);
	}
	public static double add(int m,double n)
	{
		return m+n;
	}
	private void add(int m,int n)
	{
		System.out.println(m+n);	
	}
	public static void add(int m,int n,int o)
	{
		System.out.println(m+n+o);
	}
	
}
