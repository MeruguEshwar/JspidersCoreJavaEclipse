/* */
package Array;
public class Program12 
{
	public static void main(String[] args) 
	{
		int a[]= {22,23,24,25,26,22,27,23};
		int count = 0;
		
		for(int i=0;i<=a.length-1;i++)
		{
			int status = 1;
			for(int j=i-1;j>=0;j--)
			{
				if(a[i]!=a[j])
				{
					System.out.println(a[i]);
				}
			}
		}
	}
}
