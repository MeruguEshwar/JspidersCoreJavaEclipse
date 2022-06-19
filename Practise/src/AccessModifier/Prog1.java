package AccessModifier;

public class Prog1 
{
	public static void main(String[] args) 
	{
		Prog1 obj = new Prog1();
		obj.nani();
		mammu();
		Prog1 obj1 = new Prog1();
		obj1.hyd();
	}
	public void nani()
	{
		System.out.println("Call nani");
	}
	
	public void hyd()
	{
		System.out.println("Call hyd");
	}
	
	public static void mammu()
	{
		System.out.println("Call mammu");
	}
}
