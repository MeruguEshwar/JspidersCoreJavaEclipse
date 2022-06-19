package Basic;
import java.util.Scanner;

public class Prime 
{
		public static void main(String argv[])
		{
			System.out.println("enter the value.....");
			Scanner scan = new Scanner(System.in);
			int n=scan.nextInt();
			int nof=0;
			for(int i=1;i<=n;i++)
			{
				if(n%i==0)
				{
					nof++;
				}
			}
			if(nof==2)
			{
				System.out.println("Number is prime....");
			}
			else
			{
				System.out.println("Number is not a prime...");
			}
		}	
}
