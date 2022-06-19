/*WAP to read integer array and find avg of all the array elements...*/

package Array;
public class Program9 
{
	public static void main(String[] args) 
	{
		int a[]= {12,54,67,54,32,7};
		int sum=0;
		for(int i=0;i<=a.length-1;i++)
		{
			sum+=a[i];
		}
		System.out.println("Sum of array is:"+sum);
		
		double avg= (double)sum/(double)a.length;
		System.out.println("Average of array elements is:"+avg);
	}
}
