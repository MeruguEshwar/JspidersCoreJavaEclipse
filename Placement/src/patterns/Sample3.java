package patterns;

public class Sample3 
{
	public static void main(String[] args) 
	{
		int str=1;
		int spc=5;
		for(spc=1;spc<=5;spc++)
		{
			for(str=1;str<=spc;str++)
			{
				System.out.print('*');
			}
		System.out.println();
		spc--;
		}
	}
}
