package Nani;

public class Ifelse {
	public static void main(String[] args) {
		
		
		int spc=4;
		int str=1;
		for(int i=1;i<=5;i++) 
		{
			for(int j=1;j<=spc;j++) 
			{
				System.out.print(' ');
			}
			for(int x=1;x<=str;x++)
			{
				System.out.print(x);
			}
			for(int z=str;z>=1;z--)
			{
				System.out.print(z);
			}
			spc--;
			str++;
			System.out.println(" ");
		}
	}
}

