package Abstraction;

public class Demo 
{
	private class run implements Sample
	{
		public void test()
		{
			System.out.println("Test methos....");
		}
	}
	public Sample getObject()
	{
		Sample obj = new run();
		return obj;
	}
}
