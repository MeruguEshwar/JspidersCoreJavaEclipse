package pack10;

public class Maincls1 
{
	public static void main(String argv[])
	{
		Student  s1 = new Student();
		System.out.println(s1.getId());
		System.out.println(s1.getName());
		s1.setId(23);
		s1.setName("Nani");
		System.out.println(s1.getId());
		System.out.println(s1.getName());
	}
}
