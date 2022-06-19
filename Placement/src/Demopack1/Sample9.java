package Demopack1;
/* wap to count number of vowels present in ypur rollnumber =4th1cs91" */
public class Sample9 
{
	public static void main(String[] args) 
		{
			String s1="eshwar";
			String s2=" ";
			int count=0;
			
			for(int i=0;i<=s1.length()-1;i++)
			{
				char ch=s1.charAt(i);
				
				if ((ch=='a') || (ch=='e') || (ch=='i') || (ch=='o') || (ch=='u'))
				{
					count++;
				}
			}
			System.out.println("Number of vowels count is"+count);
		}
}
