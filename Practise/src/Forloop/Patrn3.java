package Forloop;

public class Patrn3 
{
	public static void main(String[] args) 
	{
		int str=1;
		for(int i=1;i<=9;i++)
		{
			for(int x=1;x<=str;x++)
			{
				System.out.print('*');
			}
			System.out.println(" ");
			if(i<=4)
			{
				str++;
	
			}
			else
			{
				str--;
			
			}
		}
	
	}
}
