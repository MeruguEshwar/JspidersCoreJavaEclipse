package Sample;

public class Test2 
{
	public static void main(String argv[])
	{
		try
		{
			Thread.sleep(10000);
		}
		catch(InterruptedException rv)
		{
			System.out.println("Exception is caught...");
			/*Wake up and do the task...*/
		}
		System.out.println("hi...");
	}
}
