package Demopack1;
/* wap to retrive each character only one time from the string */
/* WAP to remove duplicate characters from the string */
/* WAP to retain only the  unique character */
public class Sample11 
{
	public static void main(String[] args) 
	{
		String s1 = "javadeveloper";
		String s2 = " ";
		
		for(int i=0;i<s1.length()-1;i++)
		{
			char ch= s1.charAt(i);
			if(s2.indexOf(ch) == -1)
			{
				s2+=ch;
			}
		}
		System.out.println(s1);
		System.out.println(s2);
	}
}
