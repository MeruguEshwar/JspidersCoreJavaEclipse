package testpack;
import pack5.Sample;

public class Maincls 
{
	public static void main(String argv[])
	{
			Sample.walk();
			Sample s1 = new Sample();
			s1.cycle();
			pack6.Sample.walk();
			pack6.Sample s2=new pack6.Sample();
			s2.cycle();
	}
}
