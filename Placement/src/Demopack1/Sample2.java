package Demopack1;
/* Extraction of letters */
public class Sample2 
{
	public static void main(String[] args) 
	{
		String s1="hello";
		String s2=" ";
		
		//for(int i=s1.length()-1;i>=0;i--)//	Extraction in a reverse Order.....
		for(int i=0;i<=s1.length()-1;i++)//	Extraction in a sequential Order.......
		{
			s2 = s2+s1.charAt(i);
		}
		System.out.println(s2);
	}
}
