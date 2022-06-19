// WAP to count number of digits prescent in the string
package NewWorkshop;
public class DemoPack7 
{
	public static void main(String[] args) 
	{
		String s1="I1love4you3";
		int count = 0;
		for(int i=0;i<=s1.length()-1;i++)
		{
			char ch=s1.charAt(i);
			if(Character.isDigit(ch))
			{
				count++;
			}
		}
		System.out.println("Num of digts are : "+count);
	}
}
