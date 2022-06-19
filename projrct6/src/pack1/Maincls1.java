package pack1;

public class Maincls1 
{
	public static void main(String argv[])
	{
		sample1 s1 = new sample1();
		System.out.println(s1.getid());
		System.out.println(s1.getName());
		s1.setid(5);
		s1.setName("Nani");
		System.out.println(s1.getid());
		System.out.println(s1.getName());
	}
}
