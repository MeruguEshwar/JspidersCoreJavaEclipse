package Constructor;

public class Prog1 
{
	double length;
	int breath;
	Prog1(double length,int breath)
	{
		this.length=length;
		this.breath=breath;
	}
	public void printperimeter()
	{
		double res=length*breath;
		System.out.println(res);
	}
	public static void main(String[] args) 
	{
		Prog1 a = new Prog1(2,3);
		a.printperimeter();
	}
}
