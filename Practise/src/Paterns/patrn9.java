package Paterns;

public class patrn9
{
	public static void main(String[] args) 
	{
		int str=1;
		for(int i=1;i<=9;i++)
		{
			for(int x=1;x<=str;x++)
			{
				System.out.print("*");
			}
			if(i<=4)
			{
				str++;
			}
			else
			{
				str--;
			}
		System.out.println();
		}
	}
}
