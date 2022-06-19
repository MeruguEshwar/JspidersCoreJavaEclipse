package patterns;

public class Sample4 
{
	public static void main(String[] args) 
	{	
		int spc=5;
		int str=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=spc;j++)
			{
				System.out.print(' ');
			}
			for(int k=1;k<=str;k++)
			{
				System.out.print('*');
			}
		System.out.println(' ');
		str++;
		spc--;
		}
	}
}

