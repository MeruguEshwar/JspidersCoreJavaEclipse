package Paterns;
public class patrn11 
{
	public static void main(String[] args) 
	{
			int ch=1;
			int spc=3;
			for(char ch1='A';ch1<='D';ch1++)
			{
				for(int y=1;y<=spc;y++)
				{
					System.out.print(' ');
				}
				for(int x=1;x<=ch;ch++)
				{
					System.out.print(ch);
				}
			spc--;
			ch+=2;
			}
	}
}
