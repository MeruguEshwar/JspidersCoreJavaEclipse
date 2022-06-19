package pack10;

public class Sample 
{
	private Sample()
	{
		System.out.println("Hii dz is eshwar");
	}
	
	public static Sample getSampleObject()
	{
		Sample rv = new Sample();
		return rv;
	}
	
	public void test()
	{
		System.out.println("In test method...");
	}
}
