package sample.pack3;

public class Demo2 
{
	public static void main(String argv[])
	{
		System.out.println("Main starts...");
		try
		{
			display();
		}
		catch(InterruptedException rv)
		{
			System.out.println("Exception caught");
		}
		System.out.println("Main ends...");
	}
	public static void display()throws InterruptedException
	{
		Thread.sleep(3000);
		System.out.println("hi.....");
	}
}
