package Forloop;

public class Fibonaci 
{
	public static void main(String[] args) 
	{
		int n=8;
		int a=0;
		int b=1;
		System.out.println(a+" "+b);
		for(int i=1;i<n-2;i++)
		{
			int c=a+b;
			System.out.println(c);
			a=b;
			b=c;
			
		}
	}
}
