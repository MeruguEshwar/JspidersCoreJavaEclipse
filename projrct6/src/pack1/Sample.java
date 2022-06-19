package pack1;

public class Sample 
{
	private Sample()
	{
		System.out.println("Inside Construction");
	}
	
	public static Sample nani()
	{
		Sample s1=new Sample();
		return s1;
	}
	public static void test()
	{
		
	}
}
