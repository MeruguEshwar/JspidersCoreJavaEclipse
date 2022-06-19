package Forloop;

public class Constructor 
{
	
	static int a=5;
	static int b=10;
	static String c="red";
	Constructor(int a,int b) 
	{
		this.a=a;
		this.b=b;
	}
	Constructor(int a,int b,String c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public static void nani()
	{
		System.out.println("********* FRT RECT**************");
		System.out.println(a*b);
		
		
		if(c!=null)
		{
			System.out.println("Color:"+c);
		}
	}
	public static void main(String[] args) 
	{
		nani();

		
	}
}
