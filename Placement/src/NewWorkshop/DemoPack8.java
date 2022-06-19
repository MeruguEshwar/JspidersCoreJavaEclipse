// WAP to find sum of all the digts prescent in the string

package NewWorkshop;
public class DemoPack8 
{
	public static void main(String[] args) 
	{
		String s1="1I4LOVE3YOU";
		int sum=0;
		for(int i=0;i<=s1.length()-1;i++)
		{
			char ch = s1.charAt(i);
			if(Character.isDigit(ch))
			{
				sum = sum + Integer.parseInt(ch+"");
			}
		}
		System.out.println("Sum of all the digits:"+sum);
	}
}
