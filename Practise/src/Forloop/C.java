package Forloop;

public class C extends B 
{
	int d;
	C(int a,int b,int d)
	{
		super(a,b);
		this.d=d;
	}
	public void info()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(d);
	}
}
