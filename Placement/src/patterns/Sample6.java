package patterns;

public class Sample6 {
	public static void main(String[] args) {
		int spc = 4;
		int str = 1;

		for (int i = 1; i <=7; i++) 
		{
			if(i<=4)
			{
				spc--;
			}
			else
			{
				spc++;
			}
			if(i>=3 && i<=5)
			{
				str=2;
			}
			else
			{
				str=1;
			}
			for (int j = 1; j < spc; j++) 
			{
				System.out.print(" ");
			}
			for(int j=1;j<=str;j++)
			{
				System.out.print("*");
			}
		System.out.println();
		}
	}
}
