/*WAP to read integer array and find sum of all the array elements...*/
package Array;

public class Program8 
{
	public static void main(String[] args) 
	{
		int a[]= {12,54,67,54,32,7};
		int sum=0;
		for(int i=0;i<=a.length-1;i++)
		{
			sum+=a[i];
		}
		System.out.println(sum);
	}
}
