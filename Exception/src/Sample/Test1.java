package Sample;

public class Test1 
{
	public static void main(String argv[])
	{
		System.out.println("Main starts.............");
		
		int a = 10;
		int b = 0;
		try
		{
			System.out.println(a/b);
		}
		catch(ArithmeticException rv)
		{
			System.out.println("Exception is caught");
		}
		System.out.println("Main ends...............");
		
	}
}
