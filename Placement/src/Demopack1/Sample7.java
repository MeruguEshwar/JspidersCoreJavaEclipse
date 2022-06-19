package Demopack1;
/* WAP to count number of 'e' character present in the String */

public class Sample7 
{
	public static void main(String[] args)
	{
		String s1 = "webdeveloper";
		int count = 0;
		for(int i=0;i<=s1.length()-1;i++)
		{
			if(s1.charAt(i) == 'e')
			{
				count++;
			}
		}
		System.out.println("Number of e letter is:"+count);
	}
}
