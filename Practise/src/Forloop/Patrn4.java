package Forloop;

public class Patrn4 
{
	public static void main(String[] args) 
	{
		add(2,3);
		add(2,3,4);
	}
	public static void add(int i,int j)
	{
		int c=i+j;
		System.out.println("frt method is:"+c);
	}
	public static void add(int i,int j,int k)
	{
		int a=i+j+k;
		System.out.println(a);
	}
}
