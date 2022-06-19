package Demopack1;
/* palindrome */
public class Sample6 
{
	public static void main(String[] args)
	{
		String s1="madam";
		String s2="";
		
		for(int i=s1.length()-1;i>=0;i--)
		{
			s2=s2+s1.charAt(i);
		}
		
		if(s1.compareTo(s2) == 0)
		{
			System.out.println("Is palindrome");
		}
		else
		{
			System.out.println("Not a palindrome");
		}
	}
}
