package Sample;

public class Test3 
{
	public static void main(String argv[])
	{
		String s1=null;
		try
		{
			System.out.println(s1.length());
		}
		catch(NullPointerException rv)//(Exception e)
		{
			System.out.println("Exception was caught.....");
			/*Re initialize rv with object and try the code*/
		}
		
	}
}
