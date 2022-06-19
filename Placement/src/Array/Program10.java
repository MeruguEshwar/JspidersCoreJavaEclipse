//WAP A PROGAM TO PRINT NTH OCCERENCE OF A NUMBER/
package Array;

public class Program10 
{
	public static void main(String[] args) 
	{
		int a1[]= {23,45,67,88,76,32};
		
		int nthBiggest = 1;
		
		int greaterThan = a1.length-nthBiggest;
		
		for(int i=0;i<a1.length-1;i++)
		{
			for(int j=0;j<=a1.length-1;j++)
			{
				System.out.print(a1[i]);
			}
		}
	}
}
