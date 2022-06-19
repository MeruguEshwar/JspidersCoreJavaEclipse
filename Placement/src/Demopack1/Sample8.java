package Demopack1;
/* WAP to count number of digits present in a string s1="Covid19*/
public class Sample8 
{
	public static void main(String[] args)
	{
		String s1="Covid198";
		int count = 0;
		for(int i=0;i<=s1.length()-1;i++)
		{
			char ch=s1.charAt(i);
			
			if(Character.isDigit(ch))
			{
				count++;
			}
		}
	System.out.println("Number of digits present in string is:"+count);
	}
}
