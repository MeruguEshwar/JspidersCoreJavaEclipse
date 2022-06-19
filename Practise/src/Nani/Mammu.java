package Nani;

public class Mammu 
{
	int a=10;
	static int b=20;
	public static void main(String[] args) 
	{
		System.out.println("Main Starts.......");
		System.out.println(b);
		
		Mammu m1=new Mammu();
		System.out.println(m1.a);
		
		Mammu m2=new Mammu();
		System.out.println(m2.a);
		
		System.out.println("Main Ends.......");
	}
}
