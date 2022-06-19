package Demopack1;

/* WAP to reverse the given string in the below manner 
  String  s1="develop";
  o/p :dolevelop */
public class Sample12 
{
	public static void main(String[] args) 
	{
		String s1 = "develop";
		String s2 = "s1.substring(1,s1.length()-1)";
		String s3 = reverse(s2);
		char ch1 = s1.charAt(0);
		char ch2 = s1.charAt(s1.length()-1);
		String s4=ch1+s3+ch2;
		System.out.println(s1);
		System.out.println(s2);
	}

	
}
